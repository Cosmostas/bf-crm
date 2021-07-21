package punccode.bfcrm.Models

import javax.persistence.*

@Entity
class SubscriptionType(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Id: Long,
    val Title: String,
    @OneToMany(mappedBy = "Type")
    val account: Set<Account>
)