package controller

import Domain.Community
import Service.CommunityService
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class CommunityController(
        val communityService : CommunityService
) {

    @PostMapping("/selectCommunity/{id}")
    fun findData(@PathVariable("id") Id : Long): Optional<Community>{
        return communityService.findData(Id)
    }

}