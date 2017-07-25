package com.huwei;

import com.huwei.dao.OrderLineMapper;
import com.huwei.dao.OrderMapper;
import com.huwei.domain.OrderLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.huwei.domain.Order;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.lang.System.out;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

	@Autowired
	OrderMapper orderMapper;
	@Autowired
	OrderLineMapper orderLineMapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSave(){
		Order order = new Order();
		order.setOperName("huwei");
		order.setOrderNo(UUID.randomUUID().toString());
		order.setOrderLines(new ArrayList<OrderLine>());
		orderMapper.save(order);

		OrderLine orderLine1 = new OrderLine();
		orderLine1.setProductName("apple");
		orderLine1.setProductPrice(new BigDecimal(5));
		orderLine1.setProductQty(100);
		orderLine1.setOrder(order);

		order.getOrderLines().add(orderLine1);

		OrderLine orderLine2 = new OrderLine();
		orderLine2.setProductName("lemmon");
		orderLine2.setProductPrice(new BigDecimal(1));
		orderLine2.setProductQty(50);
		orderLine2.setOrder(order);

		order.getOrderLines().add(orderLine2);

		orderLineMapper.batchSave(order.getOrderLines());
	}

	@Test
	public void testSelect(){
		Order order = orderMapper.queryOrderById(14);
		System.out.println(order.getId());
		//System.out.println(order.getOrderLines().size());
		//System.out.println(order);
	}


}
