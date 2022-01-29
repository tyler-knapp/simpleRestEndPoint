package com.philodelight;

import com.philodelight.model.ShoppingBasket;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void totalOfEmptyBasket(){
		ShoppingBasket basket = new ShoppingBasket();
		Assert.assertEquals(0.0, basket.getTotal(), 0.0);
	}

}
