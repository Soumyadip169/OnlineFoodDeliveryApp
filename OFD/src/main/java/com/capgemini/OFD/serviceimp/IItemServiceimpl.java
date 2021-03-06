package com.capgemini.OFD.serviceimp;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.OFD.repository.IItemRepository;
import com.capgemini.OFD.service.IItemService;
import com.capgemini.OFD.domain.Category;
import com.capgemini.OFD.domain.Item;
import com.capgemini.OFD.domain.Restaurant;

@Service
@Transactional
public class IItemServiceimpl implements IItemService {

	@Autowired
	IItemRepository iiRep;
	@Override
	public Item addItem(Item item) {
		
		return iiRep.save(item);
	}

	@Override
	public Item viewItem(Item item) {
		
		return iiRep.findById(item.getItemId()).orElseThrow(()->new EntityNotFoundException("No details!"));
	}

	@Override
	public Item updateItem(Item item) {
		Item i=iiRep.findById(item.getItemId()).orElseThrow(()->new EntityNotFoundException("No details!"));
		i.setItemName(item.getItemName());
		return iiRep.save(i);
	}

	@Override
	public Item removeItem(Item item) {
		iiRep.delete(item);
		return null;
	}

	@Override
	public List<Item> viewAllItems(Category cat) {
		
		return iiRep.findAllItems(cat);
	}

	@Override
	public List<Item> viewAllItems(Restaurant res) {
		
		return iiRep.findAllItem(res);
	}

	@Override
	public List<Item> viewAllItemsByName(String name) {
		
		return iiRep.find(name);
	}

}
