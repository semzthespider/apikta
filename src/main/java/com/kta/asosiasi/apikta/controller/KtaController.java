package com.kta.asosiasi.apikta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kta.asosiasi.apikta.entities.KtaEntity;
import com.kta.asosiasi.apikta.repository.KtaRepository;


@RestController
@RequestMapping(value = "/kta/")
public class KtaController{
	
	
	@Autowired
	KtaRepository ktaRepository;
	
	@GetMapping(value = "checkApi")
	public String checkApi() {
		
		return "Hello Word";
	}
	
	@PostMapping(value = "addNewKta")
//	public String addNewKta(@RequestBody KtaEntity param) {
	public KtaEntity addNewKta(@RequestBody KtaEntity param) {
		
		ktaRepository.save(param);
//		return "succes";
		return param;
		
	}
	
	
	@GetMapping(value = "getAllKta")
	public List<KtaEntity> getAllKta(){
		return ktaRepository.findAll();
	}
	
	@GetMapping(value = "getById")
	public KtaEntity getById (@RequestParam int id) {
		return ktaRepository.findById(id).get();
	}
	
//	@PostMapping(value = "updateTka")
//	public String updateTka(@RequestBody KtaEntity param) {
//		return ktaRepository.save(param).toString();
//	}
	
	@PostMapping(value = "updateKta")
	public KtaEntity updateTka(@RequestBody KtaEntity param) {
		return ktaRepository.save(param);
	}
	
//  Delete data keanggotaan
//	@GetMapping(value = "deleteKta")
	@DeleteMapping(value = "deleteKta")
	public String deleteKta(@RequestParam int id){
		ktaRepository.deleteById(id);
		return "Success Delete Anggota Asosiasi id:" +id;
	}
	
//	Jika data yang didele mau dimunculkan pada Prety
	@GetMapping(value = "deleteKta2")
	public KtaEntity deleteKta2(@RequestParam int id){
		KtaEntity kta = ktaRepository.findById(id).get();
		ktaRepository.deleteById(id);
		return kta;
	}
	
//	Jika sisa data yang ada mau dimunculkan
	@GetMapping(value = "deleteKta3")
	public List<KtaEntity> deleteKta3(@RequestParam int id){
		ktaRepository.deleteById(id);
		List<KtaEntity> ktaList = ktaRepository.findAll();
		return ktaList;
		
	}
	

	
}