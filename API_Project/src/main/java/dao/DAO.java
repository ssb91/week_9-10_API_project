package dao;

import org.springframework.stereotype.Repository;

import model.Account;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DAO {
 @PersistenceContext
 private EntityManager entityManager;

 
 public void create(Account apiRequest) {
 entityManager.persist(apiRequest);
 }

 
 public void update(Account apiRequest) {
 entityManager.merge(apiRequest);
 }

 
 public Account getApiRequestById(int id) {
 return entityManager.find(Account.class, id);
 }

  public void delete(int id) {
 Account apiRequest = getApiRequestById(id);
 if (apiRequest != null) {
 entityManager.remove(apiRequest);
 }
 }
}