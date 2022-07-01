package partymanagement.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import partymanagement.domain.*;

// @RepositoryRestResource(collectionResourceRel = "moveInfos", path = "moveInfos")
// public interface MoveInfoRepository
//     extends PagingAndSortingRepository<MoveInfo, Long> {}
// public interface PartyRepository extends JpaRepository<Party, Long>{
    
// }

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveInfoRepository extends JpaRepository<MoveInfo, Long>{
    
}