package com.ozd.AuthentificationBackend.folder.controller.reposotiry;

import com.ozd.AuthentificationBackend.folder.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    //@Query("SELECT n from User n")
    //List<User> getallUsers();

    /*@Modifying
    @Transactional
    @Query("UPDATE Programme SET date_dernier_modification = :date_dernier_modification,"
            + "date_dernier_scan = :date_dernier_scan "
            + "WHERE chemin = :chemin ")
    void updateProgrammeByPath(
            @Param("date_dernier_modification") String date_dernier_modification,
            @Param("date_dernier_scan") String date_dernier_scan,
            @Param("chemin") String chemin);*/

    @Query("SELECT n from User n")
    List<User> getallUsers();

    @Query(value="Select * from user where email = :email and password = :pass", nativeQuery = true)
    User getInfo(@Param("email") String email,@Param("pass") String pass);
}
