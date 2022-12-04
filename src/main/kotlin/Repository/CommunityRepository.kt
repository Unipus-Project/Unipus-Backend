package Repository

import Domain.Community
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class CommunityRepository {

    interface CommunityRepository : JpaRepository<Community, Long>{
        
    }

}