package partymanagement.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import partymanagement.domain.*;

// @RepositoryRestResource(collectionResourceRel = "roles", path = "roles")
// public interface RoleRepository
//     extends PagingAndSortingRepository<Role, Long> {}

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}