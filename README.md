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