package com.github.t3hnar.bcrypt

import java.util

/**
  * Created by yehia on 9/18/16.
  */
object TestBCrypt extends App {

  println("Generating USERS SQL Insert Statements")


  val myMap = scala.collection.mutable.Map[Int, (String, String)]()

  myMap += 1 -> ("normal", "Normal")
  myMap += 2 -> ("agent", "Agent(Mandoob)")
  myMap += 3 -> ("client", "Client(3ameel)")
  myMap += 4 -> ("operator", "Operator (Mas2ool tash3eel)")
  myMap += 5 -> ("admin", "Administrator (Mas2ool Nezam)")
  myMap += 6 -> ("courier", "Courier Agent (Mas2ool Manadeeb)")
  myMap += 7 -> ("domestic", "Domestic Agent (Mas2ool Ma5zan)")
  myMap += 8 -> ("callcenter", "Call Center Agent")
  myMap += 9 -> ("sales", "Sales Representative (Mandoob Mabi3at)")
  myMap += 10 -> ("cashier", "Cashier (Ameen Sandoq)")

  val template = "INSERT INTO `USERS` (`ID`, `NAME`, `USERNAME`, `PASSWORD`, `TYPE`, `COMPANY_NAME`, `EMAIL`, `DEPARTMENT`, `OCCUPATION`, `EXTENSION`, `RUNNER_CODE`, `SUPPLY_TYPE`, `CASH_SUPPLY_TYPE`, `BANK_NAME`, `ACCOUNT_TYPE`, `BRANCH_NAME`, `BANK_ACCOUNT_NR`, `NOTE`, `DELETED`, `CREATED_BY_ID`, `CREATED`, `MODIFIED_BY_ID`, `MODIFIED`) "
  val queryBuilder = StringBuilder.newBuilder
  myMap foreach {
   case (key, value) => {
     queryBuilder ++= template ++= "\n" ++= "VALUES (" ++= f"$key, '${value._2}', '${value._1}', '${value._1.bcrypt}', $key, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 999, '2016-08-28 22:14:40', NULL, NULL); \n\n"
   }
 }

  println(queryBuilder.toString())

}
