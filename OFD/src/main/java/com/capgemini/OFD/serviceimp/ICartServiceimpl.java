package com.capgemini.OFD.serviceimp;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.OFD.repository.ICartRepository;
import com.capgemini.OFD.service.ICartService;
import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.FoodCart;
import com.capgemini.OFD.domain.Item;
@Service

@Transactional

@Component
public class ICartServiceimpl implements ICartService {
	@Autowired
	ICartRepository icrRep;
	@Override
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		return icrRep.save(cart);
		
		
	}

	@Override
	public FoodCart increaseQuantity(FoodCart cart, Item item, Integer quantity) {
		//quantity+=quantity;
		//quantity+=item.getQuantity();
		
		
		FoodCart cart1=icrRep.findById(cart.getCartId()).orElseThrow(()-> new EntityNotFoundException("No data found!"));
		quantity+=item.getQuantity();
		item.setQuantity(quantity);
					//return icrRep.update(cart,item,quantity);
		//item.setQuantity(item.getQuantity());
		return icrRep.save(cart);
	}

	@Override
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {

		FoodCart cart1=icrRep.findById(cart.getCartId()).orElseThrow(()-> new EntityNotFoundException("No data found!"));
		quantity-=item.getQuantity();
		item.setQuantity(quantity);
		return icrRep.save(cart);
	}

	@Override
	public FoodCart removeItem(FoodCart cart, Item item) {
		icrRep.deleteById(item.getItemId());
		return null;
	}

	@Override
	public FoodCart clearCart(FoodCart cart) {
		icrRep.delete(cart);
		return null;
	}

}
