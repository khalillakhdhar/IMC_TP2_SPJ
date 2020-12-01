package com.orsys.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orsys.model.Indice;


@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response,Model m) throws IOException{
		m.addAttribute("imc","");
		m.addAttribute("resultat","");
		return new ModelAndView("home");
	}
	@RequestMapping(value="/imc" , method=RequestMethod.POST)
	public String cpgcd(HttpServletRequest req,Model m)
	{
		String v1=req.getParameter("poid");
		String v2=req.getParameter("taille");
		double vpoid=0;
		double vtaille=0;
		try
		{
		 vpoid=Double.parseDouble(v1);
		 vtaille=Double.parseDouble(v2);
		Indice i=new Indice(vpoid, vtaille);
		String res=i.result();
		int valeur=i.calculer();
		m.addAttribute("imc",valeur);
		m.addAttribute("resultat",res);
		}
		catch(Exception ex)
		{
			
			String res="les valeur de poids et taille doivent être numérique!";
			m.addAttribute("resultat",res);
m.addAttribute("imc","");
		}
	
		return "home";
		
		
	}}
