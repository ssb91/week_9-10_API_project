package controller;

import java.util.Collections;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Account;


@RestController
@EnableAutoConfiguration
@RequestMapping("/accounts")
public class Controller {
	
@Autowired
private AccountRepository repo;

@RequestMapping(method=RequestMethod.GET)
public List<Account> getAll() {
  return repo.findAll();
}

@RequestMapping(method=RequestMethod.POST)
public Account create(@RequestBody Account account) {
  return repo.save(account);
}

@RequestMapping(method=RequestMethod.PUT, value="{id}")
public Account update(@PathVariable String id, @RequestBody Account account) {
  Account update = repo.find(id);
  update.setId(account.getId());
  update.setFirstName(account.getFirstName());
  update.setFirstName(account.getLastName());
  return repo.save(update);
}

@RequestMapping(method=RequestMethod.DELETE, value="{id}")
public void delete(@PathVariable String id) {
  repo.delete(id);
}


}