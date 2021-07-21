package punccode.bfcrm.Models

import javax.persistence.*

@Entity
class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Id: Long,

    @ManyToOne
    @JoinColumn(name = "LeadId", nullable = false)
    val lead: Lead,

    @ManyToOne
    @JoinColumn(name = "Type",nullable = false)
    val Type: SubscriptionType
)