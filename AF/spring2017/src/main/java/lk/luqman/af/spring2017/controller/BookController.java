package lk.luqman.af.spring2017.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.luqman.af.spring2017.service.BookService;


@RequestMapping("/books")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/total", method = RequestMethod.GET)
	public double getTotalPriceByIds(@RequestParam(value="ids",required = true) List<String> ids) {
		return this.bookService.calculateTotalPrice(ids);
	}
}
