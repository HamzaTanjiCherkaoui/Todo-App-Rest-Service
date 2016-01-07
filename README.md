# Todo-App-Rest-Service
a Todo list WebService Createed using JavaEE .

# The used libraries : 
  - Jersey
  - Jackson

# The used Tools : 
 - Eclipse 
 - maven
 - heroku
 - git
 
 ## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/HamzaTanjiCherkaoui/Todo-App-Rest-Service.git
$ cd Todo-App-Rest-Service
$ mvn install
$ foreman start web
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)

 
