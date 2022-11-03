package com.test.jpa;

import com.test.jpa.model.entity.Item;
import com.test.jpa.model.entity.Member;
import com.test.jpa.model.entity.Order;
import com.test.jpa.model.entity.OrderItem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@SpringBootTest
public class ch5ObjGraphTest {
    @PersistenceContext
    private EntityManager em;

    @Test
    void objectGraphTest() {
        Order order = new Order();
        Member member = new Member();
        order.setMember(member);

        OrderItem orderItem = order.getOrderItems().get(0);
        Item item = orderItem.getItem();
    }
}
