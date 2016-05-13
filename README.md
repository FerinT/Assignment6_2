# Assignment5

## Introduction
An Automatic transfer machine (ATM) is capible of performing many transactions such as withdrawls, transfers and balance enquiries. The ATM I have chosen to depict in this assignment is a simple one which illistrates the basic functionalities on an ATM. I will demonstrate how the various components of this domain interact with one anoher in order to perform a desired functionality

Below is the Class diagram of the domain I have chosen, an ATM

![Domain Model](/ATM.png)

## Description of the Domain Model and its Invariants

Each ATM can perform 3 transactions, withdrawls, transfers and balance enquiries.

When a client chooses a transaction their account information is accessed via thr abstract class "AccessAccount". 

Changes to the users account are only made via the withdraw and transfer transactions where they are not able to set balance, rather the balance is adjusted acording to the amount they have chosen to withdraw or deposit.

A user may have many account types linked to their name, these account types include Savings, credit and cheque.

Changes to a users account is made by accessing th account through the AccessAccount class

Theses changes are made via the debit and credit methods

Once a transaction is performed the new or old account details are displayed depending upon your chosen transaction
