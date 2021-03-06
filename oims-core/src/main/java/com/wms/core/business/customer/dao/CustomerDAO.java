package com.wms.core.business.customer.dao;

import java.util.List;

import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.customer.model.CustomerCriteria;
import com.wms.core.business.customer.model.CustomerList;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;

public interface CustomerDAO extends SalesManagerEntityDao<Long, Customer> {
	
	public List<Customer> getByName(String name);

	List<Customer> listByStore(MerchantStore store);

	Customer getByNick(String nick);

	CustomerList listByStore(MerchantStore store, CustomerCriteria criteria);

	Customer getByNick(String nick, int storeId);
	
	
}
