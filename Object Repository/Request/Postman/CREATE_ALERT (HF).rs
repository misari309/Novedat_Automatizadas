<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CREATE_ALERT (HF)</name>
   <tag></tag>
   <elementGuidId>17e235b2-d14f-4ecb-b171-8680f4c16651</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;source\&quot;: \&quot;RADICACION\&quot;,\n    \&quot;destination\&quot;: \&quot;EBP\&quot;,\n    \&quot;sendTimestamp\&quot;: \&quot;1539103148939\&quot;,\n    \&quot;receivedTimestamp\&quot;: \&quot;1539103148939\&quot;,\n    \&quot;channel\&quot;: \&quot;qa_sla_co_ebp_5_oxygen_novedat_notification\&quot;,\n    \&quot;messageType\&quot;: \&quot;CREATECITIZENALERT\&quot;,\n    \&quot;messageId\&quot;: \&quot;0100010\&quot;,\n    \&quot;subscriber\&quot;: \&quot;OPERATOR\&quot;,\n    \&quot;metadata\&quot;: {\n        \&quot;userIdType\&quot;: \&quot;1\&quot;,\n        \&quot;userIdNumber\&quot;: \&quot;0000091275600\&quot;\n    },\n    \&quot;payload\&quot;: \&quot;{\\\&quot;counterpartyIdType\\\&quot;:\\\&quot;02\\\&quot;,\\\&quot;counterpartyIdNumber\\\&quot;:\\\&quot;00800193234\\\&quot;,\\\&quot;personIdType\\\&quot;:\\\&quot;01\\\&quot;,\\\&quot;personIdNumber\\\&quot;:\\\&quot;1152696538\\\&quot;,\\\&quot;fullName\\\&quot;:\\\&quot;LAURA ALEJANDRA CONDA VERA\\\&quot;,\\\&quot;alertId\\\&quot;:\\\&quot;3abc00070\\\&quot;,\\\&quot;alertExpiryDate\\\&quot;:\\\&quot;1588291200000\\\&quot;,\\\&quot;alertCode\\\&quot;:\\\&quot;E002\\\&quot;}\&quot;\n}&quot;,
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
      <webElementGuid>a31a64d2-8fcd-4db8-98b3-263528bf52a9</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>access_token</name>
      <type>Main</type>
      <value>eyJraWQiOiJ2M1FSYXBWY2l6S282WnJ5SVozQjZIb1VDQnUzWnB4S3lrR1ZqRV9CeXhVIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULnRqMHRRQi0tOG16d3EwWDgyMWZsemh5T3RIMFBhenFXeDJsVEc1UmVkT0UiLCJpc3MiOiJodHRwczovL2V4cGVyaWFuLWxhdGFtYi5va3RhcHJldmlldy5jb20vb2F1dGgyL2F1c2Rid2k3cGVzNzFuMGhVMGg3IiwiYXVkIjoiaHR0cHM6Ly93d3cuZGF0YWNyZWRpdG8uY29tLmNvL2NsaWVudHMiLCJpYXQiOjE1OTE3NDQyNTksImV4cCI6MTU5MTc3MzA1OSwiY2lkIjoiMG9hb3k4NHpnZndtQlFQRlIwaDciLCJ1aWQiOiIwMHVveTlzeWQ0YnE0ajF6RzBoNyIsInNjcCI6WyJleHBjb19xdWV1ZV9tYW5hZ2VyX3NlcnZpY2UiXSwic3ViIjoiMi05MDA0MjI2MTQuMTUxQGRldi5kYXRhY3JlZGl0by5jb20uY28iLCJleHBjb19iYXNlX2VtYWlsIjoiZ2FicmllbC52ZWdhc0BleHBlcmlhbi5jb20iLCJleHBjb19iYXNlX2xhc3ROYW1lIjoiQXBsaWNhdGlvbihkZXYpIiwiZXhwY29fYmFzZV9pZFR5cGUiOiIyIiwiZXhwY29fYmFzZV9maXJzdE5hbWUiOiJOb3ZlZGF0IENvcmUiLCJleHBjb19hdXRoel9xdWV1ZV9tYW5hZ2VyX3NlcnZpY2UiOiJ7XCJpZFwiOlwiMjIwXCIsXCJuYW1lXCI6XCJRdWV1ZSBNYW5hZ2VyXCIsXCJjdXN0b21lcnNcIjpbe1wiaWRUeXBlXCI6XCIyXCIsXCJpZFwiOlwiOTAwNDIyNjE0XCIsXCJsZWdhbE5hbWVcIjpcIkVYUEVSSUFOIENPTE9NQklBIFMuQS5cIixcInVzZXJNYWlsXCI6XCJnYWJyaWVsLnZlZ2FzQGV4cGVyaWFuLmNvbVwiLFwidXNlckNpdHlcIjpcIi0tLS0tLVwiLFwidXNlck9mZmljZVwiOlwiRXhwZXJpYW5cIixcInByb2ZpbGVzXCI6W3tcImlkXCI6XCIzNDUyXCIsXCJuYW1lXCI6XCJTZXJ2aWNpbyAtIFF1ZXVlIE1hbmFnZXJcIixcImlkUGVyZmlsQXBwXCI6XCIzNDEyXCIsXCJjb25maWd1cmF0aW9uXCI6e1wic2VydmljZXNcIjpbXCJzeW5jTWVzc2FnZVwiXX19XX1dfSIsImV4cGNvX2Jhc2VfbG9naW4iOiIyLTkwMDQyMjYxNC4xNTFAZGV2LmRhdGFjcmVkaXRvLmNvbS5jbyIsImV4cGNvX2Jhc2VfYXBpVXNlciI6dHJ1ZSwiZXhwY29fYmFzZV9pZE51bWJlciI6IjkwMDQyMjYxNCIsImV4cGNvX2Jhc2Vfc2Vjb25kRW1haWwiOiJlZGlzc29uLnZhcmdhc0BleHBlcmlhbi5jb20ifQ.Z8Zcp02v13nkCl_watxBbptt_r00oQRbmw9PllsvuhWHM0ToJnEaqAnX0Zc2eGgzV0pxmhBK1psX6599PuPAd-VGfWSg_rfN3yYi5C0d3av85KuhGOqRAvX1T3UwICrZE9xl2wCXziF-hsIOj7u5f2qApigFX6cIbQZd0FOCvSKx2HQW5UXzZzAS1QWIKtZUqABmkTkCSkHuwhKwpZt3cx1IJxtjUkV7d_uDfPdDHQpgoE7m_KZ8BdNb6bljwh1ajMebq_VDTpgchkciYkatbl9_2Qx7Ggp0P4vVicyOI1KQbGT3u9NO89vu0OLulBHBkOTlHmBE0WHrQyjna9jwSA</value>
      <webElementGuid>b9560c8c-7c20-475a-a683-2568541ac5d3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Experian-SLA-Env</name>
      <type>Main</type>
      <value>qa5</value>
      <webElementGuid>06b9a711-ef27-46fa-a15d-c9738e686143</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>client_secret</name>
      <type>Main</type>
      <value>RMeWkk3TMI1UIzT2FaP6DJgsS3NZ70kyvojbWo02</value>
      <webElementGuid>7e88ab40-39c2-4934-9e17-f3185b302ea6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>client_id</name>
      <type>Main</type>
      <value>0oaoy8cmusl96bWTb0h7</value>
      <webElementGuid>b1255e62-f180-44d8-b01d-0cb1c9750dc0</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://10.54.16.33:444/op/bureau/edf/v1/hf</restUrl>
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