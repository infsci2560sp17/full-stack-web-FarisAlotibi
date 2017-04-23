# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## [v1.5] - 2017-04-22
### Added
- The Website style was updated.
- More javascript functionlity was added.
    - Added JavaScript for login page.
    - Added JavaScript for Certification page.
    - Added JavaScript for Courses page.
    - Added JavaScript for Tickets page (InfoArms).
- Filter functionlity was added to Youtube URLs
- Registration functionality was added for users.
- Adminstrator page was created.
- User management page was created.
    - View users information page was created.
    - Update users page was created.
- About page was created.
- Created user Model, Repository, Controller, Services.
- More screenshots were added.
- CSS files were added.
- Modified security configuration files.
- Login page was modified along with all previous pages.

## [v1.4] - 2017-03-25
### Added
- The following developments were performed in the project
    - Three entities were created besides the previous two: 
        - Certification
        - Course
        - Profile
    - Three Repositories were created beside the previous one: 
        - CertificationRepository
        - CourseRepository
        - ProfileRepository
    - Three RESTful web service were created and JSONs were returned beside the previous one
        - CertificationService
        - CourseService
        - ProfileService
    - Four MVC Controllers were created and get, post, delete, and put methods were implemented beside the previous one
        - CertificationController
        - CourseController
        - FileUploadController
        - ProfileController
    - Six MVC Pages were created and wired to my Repositories beside the previous one
        - Certifications
        - certificationsUpdate
        - Profiles
        - Courses
        - Ajax/course
        - infoArmsUpdate
    - README.md was modified to reflect the most important summary changes
        - Key Features
        - Screenshots
    - SecurityApplicationInitilizor was implemented
    - Storage services were implemented for uploading files
    - InfoArms page style was modified using CSS and external formating library
    - Login page style was modified using CSS and external formating library
    - JavaScript was used in the Login page
    - Ajax validation was implemented

## [v1.3] - 2017-02-18
### Added
- The following developments were performed in the project
    - Two Entities were created: 
        - InfoArms
        - Orgnization
    - One Repository was created: 
        - InfoArmRepository
    - One RESTful web service was created and JSON was returned
        - InfoArmService
    - MVC Controller was created and get and post methods were implemented
        - InfoArmController
    - MVC Page was created and wired to my Repository
        - InfoArms
    - README.md was modified to reflect the most important summary changes
        - Key Features
    - InfoArms page style was modified using CSS and external formating library

## [v1.2] - 2017-01-28
### Added
- The follwoing questions were answered in README.md
    - What is the proposed name for your Web application?
    - Who is the target audience for your Web application?
    - What problem is it intended to solve for the target audience?
    - How will it meet the minimum project requirements?
    - Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?

## [v1.1] - 2017-01-17
### Added
- Cloned, configured, and compiled the scaffold project.
- Configured developer workspace.
- Deployed to Heroku.

[Unreleased]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/v1.2...HEAD
[v1.5]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/v1.4...v1.5
[v1.4]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/v1.3...v1.4
[v1.3]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/v1.2...v1.3
[v1.2]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/v1.1...v1.2
[v1.1]: https://github.com/infsci2560sp17/full-stack-web-FarisAlotibi/compare/...v1.1
