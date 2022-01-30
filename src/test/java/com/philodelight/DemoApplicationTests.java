package com.philodelight;

import com.philodelight.model.ShoppingBasket;
import com.philodelight.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	
	
	@Test
	void contextLoads() {
	}
	
	//This user can probably come in a before block?
	@Test
	public void i_create_a_user_instance() {
		User user = new User("Winnie", "Pooh");
		Assertions.assertEquals("Winnie", user.getFirstName());
	}
	
	

	@Test
	public void totalOfEmptyBasket(){
		ShoppingBasket basket = new ShoppingBasket();
		Assert.assertEquals(0.0, basket.getTotal(), 0.0);
	}

}
