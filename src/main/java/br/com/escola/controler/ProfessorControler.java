package br.com.escola.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.escola.model.entity.Professor;
import br.com.escola.model.enun.Materia;
import br.com.escola.model.repository.ProfRepo;

@Controller
@RequestMapping(path = "/Escola/Professor")
public class ProfessorControler {

	@Autowired
	private ProfRepo profRepo;

	@GetMapping(path = "/AdicionarProf")
	public String newPro(Model model) {
		model.addAttribute("materias", Materia.values());
		return "NovoProfessor";
	}

	@PostMapping(path = "/nnew")
	public String nnew(Professor professor) {
		profRepo.save(professor);
		System.out.println("Professor salvo!!!!!");
		return "redirect:/Escola/Professor/TodosProfs";
	}

	@GetMapping(path = "/TodosProfs")
	public String lista(Model model) {
		List<Professor> list = profRepo.findAll();
		model.addAttribute("Lista", list);
		return "ListaProfs";
	}

	@GetMapping(path = "/deletar/{id}")
	public String deletar(@PathVariable Integer id) {
		try {
			profRepo.deleteById(id);
			return "redirect:/Escola/Professor/TodosProfs";
		}catch (Exception e) {
			return "Erro";
		}
		
	}

	@GetMapping(path = "/EditarPro/{id}")
	public String viewEdit(@PathVariable Integer id, Model model) {
		Optional<Professor> professor = profRepo.findById(id);
		model.addAttribute("professor", professor);
		model.addAttribute("materia", Materia.values());
		return "EditarProf";
	}

	@PostMapping(path = "/saveEdit/{id}")
	public String salvar(@PathVariable Integer id, @Validated Professor pro) {
		profRepo.save(pro);
		return "redirect:/Escola/Professor/TodosProfs";
	}

}
