# InstaCar

### Current Stage - Event storming and Initial Service Resources

## What is it?

Instacar is intended to demonstrate a fairly complex, event-driven microservice architecture with transactional requirements. The overall application allows Customers to purchase cars entirely online, including securing lending or paying with cash. The project will also demonstrate polyglot persistence as certain parts of the application better tolerate eventual consistency. 

*Instacar App* - Frontend application. Admin users can log in to manage vehicle listings and view sales for their location. Customer users can browse vehicles, make purchases, and acquire lending. 

*API Gateway* - Used for routing between Frontend and service layer, and authentication. 

*User Service* - API for managing users.

*Vehicle Service* - API for managing and retrieving vehicle information. Will use MongoDB as a datastore. 

*Billing Service* - Service to process purchases. Will use Postgres as a datastore.

*Notifcation Service* - Service responsible for sending email notifications for various events. Will send Customers that finance vehicles a link to the created bank account. Will also notify Customers when Admins create listings that may be of interest to them. 

*Loan Service Stub* - 3rd party dependency with an external bank service used for lending. This is a service stub provided by the bank for development. Service accepts a social security number, and stub returns offers for payment options and interest rates. If offer is accepted, returns Account information to send the user on purchase completion.

## Why am I building this?

1. To Refresh My Skills

I often claim to be a Fullstack engineer, when in reality I often wonder if I really could build a modern application stack from scratch. It's time refresh! As I learn, you'll likely see this project updated with the latest hotness. It's also getting upsetting seeing all the young'uns share resumes with links to super cool personal projects, while I (a developer with 8 year's experience) have a dismal Microsoft Word template loaded with buzzwords. 

2. To Help Others

Like most developers in the field, I find myself constantly looking for code that aligns with what modern companies need. Instead, I generally find low quality tutorials and unfinished Github repos (begins to sweat) that provide only the slightest information to guide me on my way. Hopefully this project will provide truly useful code examples, be a basis for learning for many trying to grow in their current positions, and make me money. If you're a company, note that last point. Don't you be using this to make billions while I continue to pay on a mortgage. 

## Facets

### Backend

Services will be developed using Java / MongoDB / Postgres. They will follow common industry design patterns, and utilize open-source technologies for their requirements. 

### Frontend 

Every Fullstack dev has weaknesses, and one of mine is the frontend. I intend to use Angular as that's what I'd like to sharpen my skills on.

### Devops

My other weakness! Docker Compose will be used in initial development to get the project running, and migrated to Kubernetes for container orchestration once Infrastructure as Code is defined and things are cloud-ready. Google Cloud Platform will be the first to be defined for, and later Azure and AWS to demonstrate how those differ for deploying an architecture between them. 

### Eventing

Conductor is currently planned for this task. 

### Caching 

Redis.

### Continuous Integration

I'd like to say Jenkins, but may go with something more modern; like CircleCI.

### Testing 

As a passionate tester myself, this will be one of particular interest to me. I aim to demonstrate the proper balance of testing for a microservice architecture with an actual real-world example. This means projects with heavy Unit testing, solid Integration testing, Contract testing, limited Component testing, and some End to End testing. 