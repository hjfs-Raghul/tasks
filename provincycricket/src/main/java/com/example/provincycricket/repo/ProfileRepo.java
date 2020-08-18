package com.example.provincycricket.repo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.example.provincycricket.model.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile,Long>{

}
