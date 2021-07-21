package punccode.bfcrm.Models

import java.util.*
import javax.persistence.*

@Entity

class Lead(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Id: Long,
    val FirstName:String,
    val LastName: String,
    val MiddleName: String,
    val PhoneNumber: String,
    val Email: String,
    val Gender: Boolean,
    val DateofBirth: Date,
    val Login: String,
    val Password: String,

    @OneToMany(mappedBy = "lead")
    val account: Set<Account>

)