package punccode.bfcrm.Repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import punccode.bfcrm.Entity.accountEntity
@Repository
class accountRepository: JpaRepository<accountEntity,Long>{
}