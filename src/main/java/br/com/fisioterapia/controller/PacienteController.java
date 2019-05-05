package br.com.fisioterapia.controller;

import br.com.fisioterapia.domain.Paciente;
import br.com.fisioterapia.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;



@Controller
@RequestMapping("agendamentos/{agendamentoId}/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    //@GetMapping("/listar")
    //public ModelAndView listar(@PathVariable("agendamentoId") long agendamentoId, ModelMap model) {
      //  model.addAttribute("paciente", pacienteService.recuperarPorAgendamento(agendamentoId));
       // model.addAttribute("agendamentoId", agendamentoId);
        //return new ModelAndView("/paciente/list", model);
//    }





//    @GetMapping("/cadastro")
//    public String preSalvar(@ModelAttribute("paciente") Paciente paciente,
//                            @PathVariable("agendamentoId") long agendamentoId) {
//        return "/paciente/add";
//    }

//    @PostMapping("/salvar")
//    public String salvar(@PathVariable("agendamentoId")
//                                 long agendamentoId, @Valid @ModelAttribute("musica")
//                                 Paciente paciente, BindingResult result, RedirectAttributes attr) {
//        if (result.hasErrors()) {
//            return "/paciente/add";
//        }
//
//        pacienteService.salvar(paciente, agendamentoId);
//        attr.addFlashAttribute("mensagem", "Música salva com sucesso.");
//        return "redirect:/agendamento/" +agendamentoId + "/paciente/listar";
//    }



//    @GetMapping("/{pacienteId}/atualizar")
//    public ModelAndView preAtualizar(@PathVariable("agendamentoId")
//                                             long agendamentoId,
//                                     @PathVariable("pacienteId") long pacienteId, ModelMap model) {
//        Paciente paciente = pacienteService.recuperarPorAgendamentoIdEPacienteId(agendamentoId, pacienteId);
//        model.addAttribute("paciente", paciente);
//        model.addAttribute("agendamentoId", agendamentoId);
//        return new ModelAndView("/paciente/add", model);
//    }

//    @PutMapping("/salvar")
//    public String atualizar(@PathVariable("agendamentoId") long agendamentoId,
//                            @Valid @ModelAttribute("paciente") Paciente paciente,
//                            BindingResult result, RedirectAttributes attr) {
//        if (result.hasErrors()) {
//            return "/paciente/add";
//        }
//
//        pacienteService.atualizar(paciente, agendamentoId);
//        attr.addFlashAttribute("mensagem",
//                "Música atualizada com sucesso.");
//        return "redirect:/agendamentos/" + agendamentoId + "/pacientes/listar";
//    }

//    @GetMapping("/{pacienteId}/remover")
//    public String remover(@PathVariable("agendamentoId")
//                                  long agendamentoId, @PathVariable("pacienteId")
//                                  long pacienteId, RedirectAttributes attr) {
//        pacienteService.excluir(agendamentoId, pacienteId);
//        attr.addFlashAttribute("mensagem",
//                "Paciente excluída com sucesso.");
//        return "redirect:/agendamentos/" + agendamentoId + "/pacientes/listar";
//    }

}