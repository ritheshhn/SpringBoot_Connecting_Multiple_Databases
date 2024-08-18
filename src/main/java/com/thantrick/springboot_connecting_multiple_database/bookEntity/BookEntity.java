package com.thantrick.springboot_connecting_multiple_database.bookEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 14-08-2024
 *
 * @author : Rithesh Nagaraj
 * @project : SpringBoot-Connecting-Multiple-Database
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_table")
public class BookEntity {

    @Id
    @GeneratedValue
    private int id;
    private String bookName;
}
