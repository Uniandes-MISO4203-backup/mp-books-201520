package co.edu.uniandes.csw.bookmp.entities;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @generated
 */
@Entity
public class BookEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "Book")
    private Long id;

    private String name;

    private String description;

    private String image;

    private String isbn;

    private Integer price;

    @ManyToOne
    private EditorialEntity editorial;
    /**
     * @generated
     */
    public Long getId(){
        return id;
    }

    /**
     * @generated
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * @generated
     */
    public String getName(){
        return name;
    }

    /**
     * @generated
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @generated
     */
    public String getDescription(){
        return description;
    }

    /**
     * @generated
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * @generated
     */
    public String getImage(){
        return image;
    }

    /**
     * @generated
     */
    public void setImage(String image){
        this.image = image;
    }

    /**
     * @generated
     */
    public String getIsbn(){
        return isbn;
    }

    /**
     * @generated
     */
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    /**
     * @generated
     */
    public Integer getPrice(){
        return price;
    }

    /**
     * @generated
     */
    public void setPrice(Integer price){
        this.price = price;
    }

    /**
     * @generated
     */
    public EditorialEntity getEditorial() {
        return editorial;
    }

    /**
     * @generated
     */
    public void setEditorial(EditorialEntity editorial) {
        this.editorial = editorial;
    }

}
