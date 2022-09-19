<h1 align="center">BlogSys</h1>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

## Table of Contents
* [Summary](#summary)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Setup](#setup)
* [Roadmap](#roadmap)
* [Contact](#contact)
<!-- * [License](#license) -->


## Summary
This is a blog platform system based on Spring and Hibernate tech stack. The aim of this blog system is to work as a place where everyone can share their technique knowledge and viewpoints. It is a finished system supporting every neccessary feature a blog system should have including user authentication, blogs, adding catalogs and tags, writing comments and searching the content you like. 

This project is a good start project for those who want to build blog system on their cloud server. It can be deployed directly or modified based on different needs easily. 

The techniques I used include Spring Boot, Elastic Search, Spring Security, Elastic Search and etc. It is a course project I used to learn these techniques. So this system can also be used as a tutorial for those who are willing to learn new techniques in a real system. 


## Technologies Used
- Spring Boot
- Hibernate
- Elastic Search
- Spring Security
- MySQL

## Features
- User authentication(register and login)
- Add blog catalogs and tags
- Blog search
- Write blogs
- Write comments
- Filter blogs with keyword, update time and popularity


## Setup
Before you start the system, please modified ```MyBlog/src/main/resources/application.properties``` to set MySQL username and password to make sure the database connection. 

To use the system, an elastic search engine should be installed. A good way to do it is use docker

 ```docker run -d -p 9200:9200 -p 9300:9300 --name elasticsearch elasticsearch:6.8.4```
 
 Or you can download it from [elastic search website](https://www.elastic.co/cn/downloads/past-releases/elasticsearch-6-8-4) and refer to the [tutorial](https://www.elastic.co/guide/en/elasticsearch/reference/current/install-elasticsearch.html) to start the elastic search. 
 
 Then run the command to build the system with Gralde.
 
 ```gradlew build```
 
 Run the command here to start the system.
 ```gradlew run bootRun```
 
 ## Roadmap

- [x] Set up the system and dependencies
- [x] Add user login and register
- [x] Add front-end files.
- [x] Add blog creation, read, update, delete.
- [x] Add markdown feature for writing and reading blogs. 
- [x] Add blog tags and catalogs
- [x] Add like and writing comments for other blogs
- [x] Add blog search engine for blog search
- [x] Add most popular and most recent blogs
- [ ] Add multiple languges
  
  - [x] Chinese
  - [ ] English
- [ ] Finish cloud server testing.
- [ ] Add CI tools for the system. 

## Contact
[@z1514](jianxiz3.uci.edu) Please feel free to contact me.

[@Legolas](https://github.com/Legolasy)

<!-- Optional -->
## License
This project is open source and available under the [MIT](https://opensource.org/licenses/MIT). 

<!-- You don't have to include all sections - just the one's relevant to your project -->
[contributors-shield]: https://img.shields.io/github/contributors/z1514/BlogSys.svg?style=for-the-badge
[contributors-url]: https://github.com/z1514/BlogSys/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/z1514/BlogSys.svg?style=for-the-badge
[forks-url]: https://github.com/z1514/BlogSys/network/members
[stars-shield]: https://img.shields.io/github/stars/z1514/BlogSys.svg?style=for-the-badge
[stars-url]: https://github.com/z1514/BlogSys/stargazers
[issues-shield]: https://img.shields.io/github/issues/z1514/BlogSys.svg?style=for-the-badge
[issues-url]: https://github.com/z1514/BlogSys/issues
[license-shield]: https://img.shields.io/github/license/z1514/BlogSys.svg?style=for-the-badge
[license-url]: https://github.com/z1514/BlogSys/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/jianxiongzheng
