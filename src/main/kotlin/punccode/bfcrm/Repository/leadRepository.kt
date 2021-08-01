package punccode.bfcrm.Repository

import org.springframework.data.jpa.repository.JpaRepository
import punccode.bfcrm.Entity.leadEntity
interface leadRepository: JpaRepository<leadEntity, Long> {}