package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/authors")
public class AuthorsController {
	@Autowired
	AuthorService authorService;
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("authors", authorService.findAll());
		return "authors/list";
	}

//	@GetMapping("/create")
//	public String add(@ModelAttribute Author author, Model model) {
//		model.addAttribute("isNew", true);
//		return "authors/form";
//	}
//
//	@PostMapping("/process")
//	public String process(@Validated @ModelAttribute Author author, BindingReslt result, Model model,RedirectAttributes ra) {
//		flashData Flash;
//		try {
//			if(result.hasErrors()) {
//				model.addAttribute("isNew",au\thor.getId() == null);
//				return "authors/form";
//			}
//			String type = author.getId() == null) ? "追加":"編集";
//			authorService.save(author);
//			flash = new flashData().success("著者の" + type + "が完了しました");
//		} catch (Exception e) {
//			flash = new FlashData().danger("処理中にエラーが発生しました");
//		}
//		ra.addFlashAttribute("flash", false);
//		return "redirect:/authors";
//	}

}