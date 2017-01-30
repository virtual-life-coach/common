# Course Project - Virtual Lifestyle Coach 

**Introduction to Service Design and Engineering | University of Trento**

**Server | Common**

**Student**: Gianvito Taneburgo (182569)

This file aims to provide a short documentation for the course project. Further details can be found in the report [here](https://github.com/virtual-life-coach/common/blob/master/report.pdf).
The original instructions can be found [here](https://docs.google.com/document/u/1/d/1kU66KOoprmdypDEE1W1bs1iQsX-Vf7_SXH7gAm5UYMU/edit?usp=sharing).

The project was developed individually.


## Project structure

The project repository is made up of the following *files* and **folders**:
* **src/main/java/vlc**: Java source folder
    * **common**: classes shared by all layers
        * **connectors**: connectors to external services
            * *Telegram.java*: connector for Telegram bot
        * **to**: Transfer Objects exchanged by layers during communication
        * **util**: utility classes
            * **transformer**: SOAP <-> TO object converters
            * *Constants.java*: application constants
            * *Identifiable.java*: utility interface to automatize entities identification
    * **ldb/soap**: auto-generated classes from Local Database WSDL
* *pom.xml*: Maven project descriptor
* *README.md*: this file
* *report.pdf*: project final report


## JSON template

The following are example of valid objects that can be exchanged with the application via API calls.

**Activity**
```
{
   "id":0,
   "description":"description"
}
```

**Appointment**
```
{
   "id":0,
   "userId":0,
   "doctorId":0,
   "date":"date",
   "location":"location"
}
```

**Doctor**
```
{
   "id":0,
   "name":"name",
   "surname":"surname",
   "birthday":"birthday",
   "telegramId":"telegramId"
}
```

**Measurement**
```
{
   "id":0,
   "userId":0,
   "type":"type",
   "date":"date",
   "value":0.0
}
```

**Quote**
```
{
   "quote":"quote"
}
```

**Receipt**
```
{
   "id":0,
   "text":"text"
}
```

**TelegramMessage**
```
{
   "chat_id":"chat_id",
   "message":"message"
}
```

**User**
```
{
   "id":0,
   "name":"name",
   "surname":"surnname",
   "birthday":"birthday",
   "telegramId":"telegramId"
}
```

**UserActivity**
```
{
   "id":0,
   "activityId":0,
   "userId":0,
   "details":"details",
   "targetValue":0,
   "currentValue":0,
   "deadlineDate":"deadlineDate",
   "completed":false
}
```
