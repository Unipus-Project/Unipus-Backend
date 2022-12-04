package Service

import Domain.Community
import Repository.CommunityRepository
import controller.CommunityController
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
@Transactional
class CommunityService(
        val communityRepository : CommunityRepository
) {

    @Transactional
    fun findData(Id : Long): Optional<Community> {
        return communityRepository.findById()
    }

}