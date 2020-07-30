package com.EZtory.application.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class InventoryHardcodedServices implements InventoryJpaRepository {
	private static List<Inventory> inventory = new ArrayList();
	private static long idCounter = 0;
	@Autowired
	private InventoryJpaRepository inventoryJpaRepository;
	static {
//		inventory.add(new Inventory(++idCounter,"item001","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item002","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item003","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item003","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
//		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
	}
	
	public Optional<Inventory> findById(Long id){
		return inventoryJpaRepository.findById(id);
	}
	
	public List<Inventory> findAllById(Long id){
		return null;
	}
	/*public List<Inventory> findAll(){
		return inventory;
		
	}*/
	
	public Inventory save(Inventory inventoryX) {
		if(inventoryX.getId()==-1 || inventoryX.getId()==0) {
			inventoryX.setId(++idCounter);
			inventory.add(inventoryX);
		} else {
			deleteById(inventoryX.getId());
			inventory.add(inventoryX);
		}
		return inventoryX;
	}
	
	/*public Inventory deleteById(long id) {
		Inventory inventoryX = findById(id);
		if(inventoryX==null)return null;
		if(inventory.remove(inventoryX)) {
			return inventoryX;
		}
		return null;
	}

	/*public Inventory findById(long id) {
		for(Inventory inventoryX:inventory) {
			if(inventoryX.getId()==id) {
				return inventoryX;
			}
		}
		return null;
	}
*/
	@Override
	public List<Inventory> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Inventory> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Inventory> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inventory getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Inventory> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		inventoryJpaRepository.deleteById(id);
	}

	@Override
	public void delete(Inventory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Inventory> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Inventory> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Inventory> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


}
