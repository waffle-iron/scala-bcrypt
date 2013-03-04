# Scala Bcrypt [![Build Status](https://secure.travis-ci.org/t3hnar/scala-bcrypt.png)](http://travis-ci.org/t3hnar/scala-bcrypt)

Scala Bcrypt is a scala friendly wrapper of [jBCRYPT](http://www.mindrot.org/projects/jBCrypt/)

## Example

```scala
    scala>  import com.github.t3hnar.bcrypt._
    import com.github.t3hnar.bcrypt._

    scala>  "password".bcrypt
    res1: String = $2a$10$iXIfki6AefgcUsPqR.niQ.FvIK8vdcfup09YmUxmzS/sQeuI3QOFG

    scala>  "password".isBcrypted("$2a$10$iXIfki6AefgcUsPqR.niQ.FvIK8vdcfup09YmUxmzS/sQeuI3QOFG")
    res2: Boolean = true
```

## Setup

* Maven:
```xml
    <dependency>
        <groupId>com.github.t3hnar</groupId>
        <artifactId>scala-bcrypt_2.10</artifactId>
        <version>2.1</version>
    </dependency>
```

* Sbt
```scala
    libraryDependencies += "com.github.t3hnar" % "scala-bcrypt" % "2.1"
```