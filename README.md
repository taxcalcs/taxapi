# taxapi [![Build Status](https://travis-ci.org/admiralsmaster/taxapi.svg?branch=master)](https://travis-ci.org/admiralsmaster/taxapi)
Generated API classes for direct server communication with https://www.bmf-steuerrechner.de/.
Please note the terms of use from this website.

This artifact contains a XSD and the generated JAXB classes for the service answer.

## Generated Classes

You can use this classes to marshal the result.

```
info.kuechler.bmf.taxapi.Lohnsteuer
info.kuechler.bmf.taxapi.Eingabe
info.kuechler.bmf.taxapi.Ausgabe
info.kuechler.bmf.taxapi.Type
```

## URLs

TaxApiFactory is a class to provide the test URLs which returns the XML.

```
// returns "https://www.bmf-steuerrechner.de/interface/2016V1.jsp"
TaxApiFactory.getUrl(0, 2016);
```

## Example Answer

From: https://www.bmf-steuerrechner.de/

```
<?xml version="1.0" encoding="UTF-8"?>
<lohnsteuer jahr="2016">
	<eingaben>
		<eingabe name="STKL" value="1" status="ok" />
		<eingabe name="LZZ" value="1" status="ok" />
		<eingabe name="RE4" value="2500000" status="ok" />
	</eingaben>
	<ausgaben>
		<ausgabe name="BK" value="0" type="STANDARD" />
		<ausgabe name="BKS" value="0" type="STANDARD" />
		<ausgabe name="BKV" value="0" type="STANDARD" />
		<ausgabe name="LSTLZZ" value="267400" type="STANDARD" />
		<ausgabe name="SOLZLZZ" value="14707" type="STANDARD" />
		<ausgabe name="SOLZS" value="0" type="STANDARD" />
		<ausgabe name="SOLZV" value="0" type="STANDARD" />
		<ausgabe name="STS" value="0" type="STANDARD" />
		<ausgabe name="STV" value="0" type="STANDARD" />
		<ausgabe name="VKVLZZ" value="0" type="STANDARD" />
		<ausgabe name="VKVSONST" value="0" type="STANDARD" />
		<ausgabe name="VFRB" value="100000" type="DBA" />
		<ausgabe name="VFRBS1" value="0" type="DBA" />
		<ausgabe name="VFRBS2" value="0" type="DBA" />
		<ausgabe name="WVFRB" value="1177200" type="DBA" />
		<ausgabe name="WVFRBO" value="0" type="DBA" />
		<ausgabe name="WVFRBM" value="0" type="DBA" />
	</ausgaben>
</lohnsteuer>
```
