**A Simple History about Spring Framework**
    https://www.javajee.com/introduction-and-history-of-the-spring-framework
       
        (from above link)
        The first version of the Spring framework was written by Rod Johnson along with a book in 2002. 
        The framework was first released in June 2003 under the Apache license version 2.0. 
        The first milestone release of Spring framework (1.0) was released in March 2004. 
        Spring 2.0, which came in 2006, simplified the XML config files.
        Spring 2.5, which came in 2007, introduced annotation configurations.
        Spring 3.2, which came in 2012, introduced Java configuration, had support for Java 7, Hibernate 4, Servlet 3.0, and also required a minimum of Java 1.5. 
        Spring 4.0, which came in 2014, had support for Java 8.      
        Spring Boot also was introduced in 2014.       
        Spring 5.0 came out in 2017. Spring Boot 2.x has support for Spring 5.
       


**Word about Container**

* A Container is a place/environment can create and manage your components, and even provides 
some other services to the components managed in its environment, such lifecycle , txn, persistence & security management, etc...
* The Container of JavaEE, such as web container(tomcat,jetty...) that manages the servlet,jsp...
and the EJB containers(weblogic, websphere...) to manages the beans(session bean, entity bean, message bean...)(and of course, the can also 
used as the webcontainer.)
*Can also say spring framework as a container, since it provides same functions as a webcontainers do(e.g, 
the component managements,lifecycle, txn, DI, persistence.... )
* BUT, Spring Framework is a **_lightweight_ container**, that is main compared to EJBs,
EJB is too heavy!(requires a lot of configuration,should deploy to a full-featured application server.... )


EJB's goal is good, but it's practice is bad.
    
    Enterprise Java Bean (EJB) was the Java EE way for creating enterprise applications 
    without worrying about middleware requirements such as transaction management, persistence, security, distribution, remoting etc. 
    
    The EJB Specification is a subset of the JavaEE specification,
    It was the 1st technologies designed to make server-side enterprise application 
    development in java earily.
    It shouldered  the Java developers' burden of things(such as concurrency, security,
    persistence, txn....etc) over to the implementing application
    server's containers(which handled them seamlessly).
    
    comparied to the EJB model and its heavyweight containers, 
    The Spring provides a 'lightweight container' to run the java enterprise application(and , it 
    also offer some functionalities as the ejb conainers offered...),It is a big step forwarded...
    
    
  
**Problems with the older EJB Model**

* The EJB 2.x specification required developers to use interfaces from the EJB framework package, 
which created tight coupling with EJB framework package.

* You were also required to implement several callback methods, 
even if you don’t need them, such as ejbCreate, ejbPassivate and ejbActivate.

* You had to understand the complex EJP programming model involving concepts such as local interface, remote interface etc.

* You need an EJB container to execute EJBs. EJB container is part of application servers such as JBoss, Websphere, Weblogic etc., but is not part of lighter web containers like Apache Tomcat. 

* Due to the requirement of an EJB container, it is difficult to unit test EJB components such as session and entity beans outside a container.


More DOC:
https://www.baeldung.com/spring-bean-vs-ejb