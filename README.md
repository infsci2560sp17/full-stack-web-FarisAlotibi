# InfoSec Armor


1. What is the proposed name for your Web application?
    - InfoSec Armor where InfoSec stands for Information Security
    
2. Who is the target audience for your Web application?
    - The web application is targeting Security professionals, IT personals, Technological organizations, 
Government Agencies, and Information Security Academics and Students who have limited time and resources 
to obtain necessary information regarding information security guidelines and standards.
    
3. What problem is it intended to solve for the target audience?
    - My website alleviates the hassle of obtaining consultation about Information Security standards, guidelines, 
strategies, technologies, and solutions. Also, it saves much more time, effort, and cost by obtaining 
the needed information and consultation online. There are a lot of information on the internet regarding 
Information Security, but most of them are not provided by certified experts in the field. Having this information from a one 
certified source is more effective. At the same time, interested users would be able to get their services 
as well as attending Information Security courses without having to go to different site seeking their needs.
    
4. How will it meet the minimum project requirements?
    - The project requirements are: users should be able to open ticket, rating tickets, review tickets, delete tickets, 
search for previous tickets, modify tickets, share information, mark favorite tickets, create profile, and access 
information security news and topics section. Additionally, users will be able to enroll to attend courses 
related to Information Security. Most of website content will be for users only, so users need to create usernames and passwords, 
and log in in order to access the content. The users’ info will be stored into my database and encrypted for 
security purposes. Also, I will support OAuth2 authentication in case the users do not want to register his username 
and password in my website. Moreover, users who are interested in attending courses will have to pay minimum cost. 
Therefore, I will have two roles of users: one who paid to attend the courses and another who interested in seeking consultation 
only. I will support PayPal for accepting users’ payment. There will be public information such as the up-to-date information 
security topics and news. Thus, I will use RESTful services to contain data into JSON and XML formats. Finally, I will use API service that 
provides news feeds for my website.


5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My proposed Web application is unique as there is less web applications dedicated to provide consultation 
regarding information security without requiring fee for membership/subscription or signing contractual agreements 
to obtain the needed services. Also, it provides a collaborative and rich web based community interested into information 
security space. Additionally, the website will provide courses for those users who interested in learning information security. The 
website will adapt its content to show the topics that interest the users based on their previous search or tickets. It will 
also incentivize users who are not active by sending promotions and offers regarding the courses being offered, and those who 
are active will be receiving special support regarding their tickets as well as certificates for attending the courses.


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-FarisAlotibi.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-FarisAlotibi)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[InfoSec Armor](https://aqueous-hollows-36295.herokuapp.com)

![](https://render.bitstrips.com/v2/cpanel/10212038-241701489_2-s1-v1.png?transparent=1&palette=1)

## Key Features

* Users have the ability to choose their ticket type and specifiy their orgnization information via the web application.
* Users are able to submit their ticket through the website application. 
* All tickets can be retrieved via the API as a JSON format.
* A specific ticket can be retrieved by the identifier field via the API as a JSON format.
* Users are able to modify and delete tickets.
* Users are able to view courses through the website.
* Users are able to add their information.
* Users are able to upload their resumes.
* Users are able to add, delete, view, modify certifications they are interested in.
* Users are able to use Ajax for Validation.
* Users are able to log in, log out, registar.
* Anonymous users are able to view about the website.
* Admistrators are able to do the following.
* Admistrators are able to repond to tickets.
* Admistrators are able to upload and follow courses through the website.
* Admistrators are able to create, update, delete users information.

## Project Details

### Landing Page

Users will be to log in using the login page as depicted in the following screen shot:
![](screenshots/Home.png)

### User Input Form

Users will be able to register as a user, add, delete, view, and modify tickets and certifications via the input forms as shown in the follwoing screen shot:
![](screenshots/register.png)

![](screenshots/tickets.png)

![](screenshots/certification.png)

![](screenshots/register.png)

Users will be able to upload files.
![](screenshots/resume.png)


### User View Form

![](screenshots/course.png)

### Adminstrators Form

Admin user will be able to add, delete, view, and modify users information via the forms as shown in the follwoing screen shot:
![](screenshots/usersUpdate.png)

![](screenshots/usersView.png)

![](screenshots/register.png)

![](screenshots/users.png)

### Anonymous User Page

![](screenshots/about.png)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    GET /public/api/courses/:id

#### Parameters

- **id** _(required)_ — The course ID to get the data associated with that ID so users can view the course content.

#### Response

A JSON containing the CourseID and the data associated with it which is course name, URL, and Course description.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The course was not found.

#### Example

##### Request

    GET /public/api/courses/1

##### JSON Response

```json
{
    "id":1,"courseName":"Beginner Ethical Hacking","courseLink":"https://www.youtube.com/embed/DoRoMLPDneo","courseDescription":"Good Ethical Hacking"
}
```

## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [JQuery](https://jquery.com/) - jQuery is a cross-platform JavaScript library designed to simplify the client-side scripting of HTML.
- [jQuery Validation Plugin](https://jqueryvalidation.org/) - jQuery Validation Plugin is a feature rich jQuery plugin that makes it easy to validate user input while keeping your HTML markup clean from javascript code.
- [W3.CSS](https://www.w3schools.com/w3css/) - W3.CSS is a modern CSS framework with built-in responsiveness.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.

