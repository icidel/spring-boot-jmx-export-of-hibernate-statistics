# spring-boot-jmx-export-of-hibernate-statistics
Sample test case for HHH-12323 bugs report reopening.

This project contains an HibernateStatisticsMBean component which is exposed as a managed resource bean (MBean) through Spring boot.

Whith this class Hibernate internal statistics becomes remotely accessible to any JMX client.
