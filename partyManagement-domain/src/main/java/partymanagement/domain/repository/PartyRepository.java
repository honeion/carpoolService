package partymanagement.domain.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import partymanagement.domain.*;

// @RepositoryRestResource(collectionResourceRel = "parties", path = "parties")
// public interface PartyRepository
//     extends PagingAndSortingRepository<Party, Long> {}

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long>{
    
}