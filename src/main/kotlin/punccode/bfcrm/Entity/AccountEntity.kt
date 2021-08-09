package punccode.bfcrm.Entity

import org.hibernate.annotations.GeneratorType
import javax.persistence.*

@Entity
data class AccountEntity(
    @Id
    @SequenceGenerator(name = "accountSeq", sequenceName = "Account_Id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountSeq")
    var id: Long,
    var subscriptionType: Integer,
    @ManyToOne
    @JoinColumn(name = "lead_Id")
    val leadId: Long
)
