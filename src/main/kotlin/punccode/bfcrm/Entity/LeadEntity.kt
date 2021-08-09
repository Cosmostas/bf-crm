package punccode.bfcrm.Entity

import java.util.*
import javax.persistence.*

@Entity
data class LeadEntity(
    @Id
    @SequenceGenerator(name = "leadSeq", sequenceName ="Lead_Id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leadSeq")
    var id: Long,

    var firstName: String,
    var lastName: String,
    var middleName: String,
    var phoneNumber: String,
    var email: String,
    var gender: Boolean,
    val dateOfBirth: Date
)
