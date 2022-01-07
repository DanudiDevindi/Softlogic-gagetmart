package com.bolton.softlogic_gagetmart.api.repo;

import java.util.List;

import com.bolton.softlogic_gagetmart.api.dto.ItemDTO;

public interface ItemRepo {
	
	List<ItemDTO> getAllItems() throws Exception;

}
