package com.shopeasy.controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import static com.shopeasy.utils.Utils.isEmptyOrNull;

import com.shopeasy.controllers.beans.UploadProducts;

@Controller
public class BrowserController {

	@GetMapping(value  = "/showUploadProducts")
	public ModelAndView showUploadProductsView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("uploadProducts");
		return modelAndView;
	}
	
	@PostMapping( value = "uploadProducts") 
	public ModelAndView uploadProducts(HttpServletRequest request,
		@ModelAttribute("UploadProducts") UploadProducts uploadProducts) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("uploadProducts");
		
		String fileName = uploadProducts.getMultipartFile().getOriginalFilename();
		File file = new File(request.getServletContext().getRealPath("/products"), fileName);
		
		try {
			
			MultipartFile multpartFile = uploadProducts.getMultipartFile(); 
			if(!isEmptyOrNull(multpartFile)) {
				multpartFile.transferTo(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return modelAndView;
	}
	
}
