package com.boraji.tutorial.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boraji.tutorial.spring.model.Utilisateur;
import com.boraji.tutorial.spring.service.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	   private UtilisateurService utilisateurService;

	   /*---Ajouter un utilisateur---*/
	   @PostMapping("/utilisateur")
	   public ResponseEntity<?> save(@RequestBody Utilisateur utilisateur) {
	      long id = utilisateurService.save(utilisateur);
	      return ResponseEntity.ok().body("Un nouvel utilisateur a �t� ajout� son ID est: " + id);
	   }

	   /*---R�cuperer un utilisateur via son id---*/
	   @GetMapping("/utilisateur/{id}")
	   public ResponseEntity<Utilisateur> get(@PathVariable("id") long id) {
		   Utilisateur utilisateur = utilisateurService.get(id);
	      return ResponseEntity.ok().body(utilisateur);
	   }

	   /*---R�cuperer tout les utilisateurs---*/
	   @GetMapping("/utilisateur")
	   public ResponseEntity<List<Utilisateur>> list() {
	      List<Utilisateur> utilisateurs = utilisateurService.list();
	      return ResponseEntity.ok().body(utilisateurs);
	   }

	   /*---Modifier un utilisateur via son id---*/
	   @PutMapping("/utilisateur/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Utilisateur utilisateur) {
		   utilisateurService.update(id, utilisateur);
	      return ResponseEntity.ok().body("L'utilisateur a �t� modifi� avec succ�s.");
	   }

	   /*---Supprimer l'utilisateur via l'id---*/
	   @DeleteMapping("/utilisateur/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	      utilisateurService.delete(id);
	      return ResponseEntity.ok().body("L'utilisateur a �t� supprim� avec succ�s.");
	   }

}
