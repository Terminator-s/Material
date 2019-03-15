package lk.luqman.af.spring2017.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.luqman.af.spring2017.model.Books;
import lk.luqman.af.spring2017.repository.BookRepository;
import lk.luqman.af.spring2017.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public double calculateTotalPrice(List<String> ids) {

		double totPrice = 0;
		for (Books book : bookRepository.findAllById(ids))
			totPrice += book.getPrice();
		return totPrice;
	}
}
