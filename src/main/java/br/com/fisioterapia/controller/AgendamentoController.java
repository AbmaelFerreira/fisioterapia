package br.com.fisioterapia.controller;

import br.com.fisioterapia.domain.Agendamento;
import br.com.fisioterapia.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("agendamentos")
public class AgendamentoController  {

    @Autowired
    private AgendamentoService agendamentoService;

        /*Esse metodo lista todas os agendamentos cadastradas*/
        @GetMapping("/listar")
        public ModelAndView listar(ModelMap model){
                   model.addAttribute("agendamentos", agendamentoService.recuperar());
                 return  new ModelAndView("/agendamento/list", model);
        }

        /*Esse metodo redireciona para a pagina onde será adicionado as listas*/
        @GetMapping("/cadastro")
        public String preSalvar(@ModelAttribute("agendamento" ) Agendamento agendamento){
            return "/agendamento/add";
        }


        /*Esse metodo salva no banco de dados os dados inseridos nos inputs*/
        @PostMapping("/salvar")
        public String salvar(@Valid @ModelAttribute("agendamento") Agendamento agendamento, BindingResult result, RedirectAttributes attr){
            if (result.hasErrors()){
                return  "/agendamento/add";
            }
            agendamentoService.salvar(agendamento);
            attr.addFlashAttribute("mensagem", "Agendamento criada com sucesso");
            return  "redirect:/agendamentos/listar";
        }


        /*Esse metodo retorna para a pagina de cadastro com o ID selecionado pronto para a edição*/
        @GetMapping("/{id}/atualizar")
        public ModelAndView preAtualizar(@PathVariable("id") long id, ModelMap model){
            Agendamento agendamento = agendamentoService.recuperarPorID(id);
            model.addAttribute("agendamento", agendamento);
            return  new ModelAndView("/agendamento/add", model);
        }


        @PutMapping("/salvar")
        public String atualizar(@Valid @ModelAttribute("agendamento") Agendamento agendamento, BindingResult result, RedirectAttributes attr){
            if (result.hasErrors()){
                return  "/agendamento/add";
            }
            agendamentoService.atualizar(agendamento);
            attr.addFlashAttribute("mensagem", "Agendamento atualizada com sucesso");
            return  "redirect:/agendamentos/listar";
        }


    @GetMapping("/{id}/remover")
    public String remover(@PathVariable("id") long id,
                          RedirectAttributes attr) {
        agendamentoService.excluir(id);
        attr.addFlashAttribute("mensagem", "Agendamento excluída com sucesso.");
        return "redirect:/agendamentos/listar";
    }





//    @ModelAttribute("pacientes")
//    public TipoSexo[] tipoSexo() {
//        return TipoSexo.values();
//    }



}
