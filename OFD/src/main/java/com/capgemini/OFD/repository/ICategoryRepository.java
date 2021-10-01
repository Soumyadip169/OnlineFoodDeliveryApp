package com.capgemini.OFD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.Category;

/**
 * IcategoryRepository  interface is a repository,to implement the CRUD operations on Category
 * @author thejhv
 *
 */
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer>{
	/**
	 * This method is used to add category
	 * @param cat
	 * @return
	 */
	public Category addCategory(Category cat);
	
	/**
	 * This method is used to update category
	 * @param cat
	 * @return
	 */
	public Category updateCategory(Category cat);
	
	/**
	 * This method is used to remove category
	 * @param cat
	 * @return
	 */
	public Category removeCategory(Category cat);
	
	/**
	 * This method is used to View category
	 * @param cat
	 * @return
	 */
	public Category ViewCategory(Category cat);
	
	/**
	 * This method is used to ViewAllCategory
	 * @param cat
	 * @return
	 */
	public List<Category> viewAllCategory();


}
