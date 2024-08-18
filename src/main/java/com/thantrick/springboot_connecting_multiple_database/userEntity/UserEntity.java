package com.thantrick.springboot_connecting_multiple_database.userEntity;

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
@Table(name = "User_table")
public class UserEntity {

    @Id
    @GeneratedValue
    private int id;
    private String userName;
}
