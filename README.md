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

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
