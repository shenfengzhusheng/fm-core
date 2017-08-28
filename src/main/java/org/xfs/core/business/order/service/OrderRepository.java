package org.xfs.core.business.order.service;

import java.util.Map;

import org.xfs.core.business.order.model.Order;

public interface OrderRepository {
    public void putOrder(Order order);

    public Order getOrder(String orderId);

    public Map<String, Order> getAllOrders();
}
