package com.kn.ttuexample.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by xubuntu on 02.04.15.
 */
@Controller
@Secured("ROLE_USER")
public class ContainerController {

    public static final String VIEW_CONTAINER = "container/container";

    @Autowired
    private ContainerService containerRepository;

    @RequestMapping(value = "container")
    public String createContainer(Model model) {
        model.addAttribute(new ContainerModel());
        return VIEW_CONTAINER;
    }


    @RequestMapping(value ="container", method = RequestMethod.POST)
    public String createContainer(@ModelAttribute ContainerModel containerModel, Errors errors, RedirectAttributes ra) {

        Container container = new Container();
        container.setSize(containerModel.getSize());
        System.out.println("container neu = " + containerModel.getSize());

        containerRepository.create(container);

        return "redirect:/";
    }





}
