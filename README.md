# taxapi [![Build Status](https://travis-ci.org/admiralsmaster/taxapi.svg?branch=master)](https://travis-ci.org/admiralsmaster/taxapi) [![pipeline status](https://gitlab.com/taxcalculator/taxapi/badges/master/pipeline.svg)](https://gitlab.com/taxcalculator/taxapi/commits/master) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/8033ff7d9d3446e7b6b4320f43e74221)](https://www.codacy.com/app/github-ariel/taxapi) [![version](https://img.shields.io/maven-central/v/info.kuechler.bmf.taxapi/taxapi.svg)](http://search.maven.org/#search|gav|1|g%3A%22info.kuechler.bmf.taxapi%22%20AND%20a%3A%22taxapi%22) 


```diff
- Version 2018 has been changed to Java 8.
```

Generated API classes for direct server communication with https://www.bmf-steuerrechner.de/.  
Please respect the terms of use of this website (for tests only).

This artifact contains a XSD and the generated JAXB classes for the service answer.

[Javadoc](https://admiralsmaster.github.io/taxapi/apidocs/)  
[Site](https://admiralsmaster.github.io/taxapi/)

JDK 9 module name: *info.kuechler.bmf.taxapi*

For tax calculation in your project see project [taxcalculator](https://github.com/admiralsmaster/taxcalculator).

## Usage

Use the maven dependency:

```xml
<dependency>
	<groupId>info.kuechler.bmf.taxapi</groupId>
	<artifactId>taxapi</artifactId>
	<version>2018.1.0</version>
</dependency>
```
or [other build tools](https://admiralsmaster.github.io/taxapi/dependency-info.html)

Example to unmarschall:
```java
InputStream in = ...; // TODO
JAXBContext context = JAXBContext.newInstance(Lohnsteuer.class);
Unmarshaller unmarshaller = context.createUnmarshaller();
Lohnsteuer result = (Lohnsteuer) unmarshaller.unmarshal(inputStream);
```

## Generated Classes

You can use this classes to marshal the result.

```java
info.kuechler.bmf.taxapi.Lohnsteuer
info.kuechler.bmf.taxapi.Eingabe
info.kuechler.bmf.taxapi.Ausgabe
info.kuechler.bmf.taxapi.Type
```

## URLs

TaxApiFactory is a class to provide the test URLs which returns the XML.

```java
// returns "http://www.bmf-steuerrechner.de/interface/2018Version1.xhtml?code=Lohn2018"
TaxApiFactory.getUrl(0, 2018);
```

## Example Answer

From: https://www.bmf-steuerrechner.de/

```xml
<?xml version="1.0" encoding="UTF-8"?>
<lohnsteuer jahr="2018">
  <information>
Die Berechnung ist nach den PAP 2018 erfolgt. Die Berechnung dient lediglich der Qualitätssicherung. Die Externe Schnittstelle des Lohn- und Einkommensteuerrechner ist also nur für die Überprüfung ihrer Rechnung bestimmt und nicht dazu bestimmt, die Berechnung über ihn abzuwickeln.
  </information>
  <eingaben>
    <eingabe name="STKL" value="1" status="ok" />
    <eingabe name="LZZ" value="1" status="ok" />
    <eingabe name="RE4" value="2500000" status="ok" />
  </eingaben>
  <ausgaben>
    <ausgabe name="BK" value="0" type="STANDARD" />
    <ausgabe name="BKS" value="0" type="STANDARD" />
    <ausgabe name="BKV" value="0" type="STANDARD" />
    <ausgabe name="LSTLZZ" value="252500" type="STANDARD" />
    <ausgabe name="SOLZLZZ" value="13887" type="STANDARD" />
    <ausgabe name="SOLZS" value="0" type="STANDARD" />
    <ausgabe name="SOLZV" value="0" type="STANDARD" />
    <ausgabe name="STS" value="0" type="STANDARD" />
    <ausgabe name="STV" value="0" type="STANDARD" />
    <ausgabe name="VKVLZZ" value="0" type="STANDARD" />
    <ausgabe name="VKVSONST" value="0" type="STANDARD" />
    <ausgabe name="VFRB" value="100000" type="DBA" />
    <ausgabe name="VFRBS1" value="0" type="DBA" />
    <ausgabe name="VFRBS2" value="0" type="DBA" />
    <ausgabe name="WVFRB" value="1122100" type="DBA" />
    <ausgabe name="WVFRBO" value="0" type="DBA" />
    <ausgabe name="WVFRBM" value="0" type="DBA" />
  </ausgaben>
</lohnsteuer>
```

## Changelog

* 2018.1.0 May 2nd, 2018: API change #5
* 2018.0.0 December 1st, 2017: update to 2018
* 2017.0.0 November 30th, 2016: update to 2017
* 2016.0.1 October 4th, 2016: Make objects serializable
* 2016.0.0 September 18th, 2016: Initial Version
