<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_XPM</name>
   <tag></tag>
   <elementGuidId>9a387905-8001-4c57-8e57-6700e4349030</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;inquirer\&quot;: {\n        \&quot;userIdType\&quot;: \&quot;4\&quot;,\n        \&quot;userIdNumber\&quot;: \&quot;715736\&quot;,\n        \&quot;counterpartyIdType\&quot;: \&quot;1\&quot;,\n        \&quot;counterpartyIdNumber\&quot;: \&quot;3884903\&quot;\n    },\n    \&quot;identifyingAttributes\&quot;: {\n        \&quot;personIdType\&quot;: \&quot;1\&quot;,\n        \&quot;personIdNumber\&quot;: \&quot;47148335\&quot;,\n        \&quot;lastName\&quot;: \&quot;LOPEZ\&quot;\n    },\n    \&quot;behaviour\&quot;: {\n        \&quot;appClientType\&quot;: \&quot;service\&quot;,\n        \&quot;tecMarking\&quot;: \&quot;true\&quot;,\n        \&quot;attachPin\&quot;: true,\n        \&quot;capture\&quot;: false\n    },\n    \&quot;auditLog\&quot;: {                                                       \n        \&quot;transactionId\&quot;: \&quot;12345678912365478\&quot;,\n        \&quot;dataSource\&quot;: \&quot;Any\&quot;,\n        \&quot;requestTimestamp\&quot;: 1551916813854\n    },\n    \&quot;dataRequested\&quot;: \&quot;{\\\&quot;bestName\\\&quot;:bestName,\\\&quot;counterparties\\\&quot;:counterparties,\\\&quot;bestAccounts\\\&quot;:bestAccounts,\\\&quot;alerts\\\&quot;:alerts,\\\&quot;comments\\\&quot;:comments}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ec37e210-89b8-4a60-adc5-a5ad32ad3845</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>access_token</name>
      <type>Main</type>
      <value>eyJraWQiOiJvWkZVRWU4XzZZMkZOTUVfTFpCbkJWRFJRQXBkWnRpR0YzSVh5dUdQbGxRIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULjJVM0kzN3J4eFVkREp0ZDN5ck0zU3dfRWpMcWFHX0ZlZE93NFhXOTJxTEkiLCJpc3MiOiJodHRwczovL2V4cGVyaWFuLWxhdGFtYi5va3RhcHJldmlldy5jb20vb2F1dGgyL2F1c2Rid2k3cGVzNzFuMGhVMGg3IiwiYXVkIjoiaHR0cHM6Ly93d3cuZGF0YWNyZWRpdG8uY29tLmNvL2NsaWVudHMiLCJpYXQiOjE2NDg4MTM3NjksImV4cCI6MTY0ODg3MTM2OSwiY2lkIjoiMG9hb3k4NHpnZndtQlFQRlIwaDciLCJ1aWQiOiIwMHVveTlzeWQ0YnE0ajF6RzBoNyIsInNjcCI6WyJleHBjb19xdWV1ZV9tYW5hZ2VyX3NlcnZpY2UiXSwiYXV0aF90aW1lIjoxNjQ4ODEzNzY5LCJzdWIiOiIyLTkwMDQyMjYxNC4xNTFAZGV2LmRhdGFjcmVkaXRvLmNvbS5jbyIsImV4cGNvX2Jhc2VfZW1haWwiOiJnYWJyaWVsLnZlZ2FzQGV4cGVyaWFuLmNvbSIsImV4cGNvX2Jhc2VfbGFzdE5hbWUiOiJBcGxpY2F0aW9uKGRldikiLCJleHBjb19iYXNlX2lkVHlwZSI6IjIiLCJleHBjb19iYXNlX2ZpcnN0TmFtZSI6Ik5vdmVkYXQgQ29yZSIsImV4cGNvX2F1dGh6X3F1ZXVlX21hbmFnZXJfc2VydmljZSI6IntcImlkXCI6XCIyMjBcIixcIm5hbWVcIjpcIlF1ZXVlIE1hbmFnZXJcIixcImN1c3RvbWVyc1wiOlt7XCJpZFR5cGVcIjpcIjJcIixcImlkXCI6XCI5MDA0MjI2MTRcIixcImxlZ2FsTmFtZVwiOlwiRVhQRVJJQU4gQ09MT01CSUEgUy5BLlwiLFwidXNlck1haWxcIjpcImdhYnJpZWwudmVnYXNAZXhwZXJpYW4uY29tXCIsXCJ1c2VyQ2l0eVwiOlwiQk9HT1RBIEQuQy5cIixcInVzZXJPZmZpY2VcIjpcIkV4cGVyaWFuXCIsXCJwcm9maWxlc1wiOlt7XCJpZFwiOlwiMzQ1MlwiLFwibmFtZVwiOlwiU2VydmljaW8gLSBRdWV1ZSBNYW5hZ2VyXCIsXCJpZFBlcmZpbEFwcFwiOlwiMzQxMlwiLFwiY29uZmlndXJhdGlvblwiOntcInNlcnZpY2VzXCI6W1wic3luY01lc3NhZ2VcIl19fV19XX0iLCJleHBjb19iYXNlX2xvZ2luIjoiMi05MDA0MjI2MTQuMTUxQGRldi5kYXRhY3JlZGl0by5jb20uY28iLCJleHBjb19iYXNlX2FwaVVzZXIiOnRydWUsImV4cGNvX2Jhc2VfaWROdW1iZXIiOiI5MDA0MjI2MTQiLCJleHBjb19iYXNlX3NlY29uZEVtYWlsIjoiZWRpc3Nvbi52YXJnYXNAZXhwZXJpYW4uY29tIn0.KyShKJhktrFzl_SB_ITLGo7cRcdhyQPlDJsnDikLzI0smnrlSaHJ01XeFZChaGv_R-yONEk2DVRYlHb2q3OycR0_BTaD0ym6xuS2pN0gqKzGtRAFzHpEn2is9wsn_J3Df-pHsHYyNeBN5HXbg-T8izLAv1JQmyztQs7UL5MAxfmSAapQKoT7E5JE3XDVL1pxG8KyCpmt8DpmyfSolTu19ZnpMpb6kmPqW5w7TCP-5jpKDaNoq-CBncig7Oj7mAN84yoOpfpv9aYK9oifCFPKvK7eDO5HU3hCRkEWT3SmLAgnyObvkXeCLgX-ghqrpP9dmtBMyBxi8QYNRRq0wRtfCw</value>
      <webElementGuid>ee029aa0-21bd-44db-a319-3bac32640174</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Experian-SLA-Env</name>
      <type>Main</type>
      <value>qa8</value>
      <webElementGuid>ae70789f-e477-4b8b-8436-242cda7c2b29</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>client_secret</name>
      <type>Main</type>
      <value>slfYbyiQdAAVxXGpCJnS2HpJMP4sSISli5lI5rwc</value>
      <webElementGuid>f485cc01-598a-4cea-bff9-03eeaa12fa8e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>client_id</name>
      <type>Main</type>
      <value>0oap0nck68163Jp7r0h7</value>
      <webElementGuid>8d768dfa-7128-4b21-917d-3fe2a3d90d2e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://10.54.16.33:444/cs/data/v1/bureau/person/pin/18225</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>