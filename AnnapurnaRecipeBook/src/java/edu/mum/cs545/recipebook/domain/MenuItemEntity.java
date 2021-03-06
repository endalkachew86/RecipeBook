/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.recipebook.domain;

import java.io.Serializable; 
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Endalkachew Asnake
 */
@Entity
public class MenuItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private String title;
    
    private String description; 
    
    private MenuType menuType;
    
    private Category category;
    
    private List<String> recipes;
    
    private String cookingInstruction;
    
    private float averageRating;
    
    private int numberOfRatings;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuItemEntity")
    private List<CommentEntity> comments;
    
    @ManyToOne(optional=false) 
    private UserEntity createdBy; 

    public MenuItemEntity() {
    }

    public MenuItemEntity(String title, String description, MenuType menuType, Category category, List<String> recipes, String cookingInstruction, float averageRating, int numberOfRatings, List<CommentEntity> comments, UserEntity createdBy) {
        this.title = title;
        this.description = description;
        this.menuType = menuType;
        this.category = category;
        this.recipes = recipes;
        this.cookingInstruction = cookingInstruction;
        this.averageRating = averageRating;
        this.numberOfRatings = numberOfRatings;
        this.comments = comments;
        this.createdBy = createdBy;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<String> recipes) {
        this.recipes = recipes;
    }

    public String getCookingInstruction() {
        return cookingInstruction;
    }

    public void setCookingInstruction(String cookingInstruction) {
        this.cookingInstruction = cookingInstruction;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuItemEntity)) {
            return false;
        }
        MenuItemEntity other = (MenuItemEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MenuItemEntity[ id=" + id + " ]";
    }
    
}
