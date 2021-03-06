# Cinnamon Akka sample

Sample that adds Cinnamon to the [Akka Quickstart Scala] guide.

Cinnamon is configured to print out actor metrics with the [console reporter], and trace messages with the [OpenTracing integration] and the Zipkin backend.


## Credentials file

First make sure you have credentials set up for Lightbend Reactive Platform. You can find your username and password under your [Lightbend account].

Create a `~/.lightbend/commercial.credentials` file with:

```
realm = Bintray
host = dl.bintray.com
user = <username>
password = <password>
```


## Run the sample

To record traces, first start the [Zipkin quickstart] docker image:

```
docker run -d -p 9411:9411 openzipkin/zipkin
```

Then run the application with sbt:

```
./sbt run
```

Browse to Zipkin at [http://localhost:9411](http://localhost:9411).

Actor metrics will printed to standard out.


[Akka Quickstart Scala]: https://developer.lightbend.com/guides/akka-quickstart-scala/
[Lightbend account]: https://www.lightbend.com/product/lightbend-reactive-platform/credentials
[console reporter]: https://developer.lightbend.com/docs/cinnamon/latest/plugins/chmetrics/reporters.html#console-reporter
[OpenTracing integration]: https://developer.lightbend.com/docs/cinnamon/latest/extensions/opentracing.html
[Zipkin quickstart]: http://zipkin.io/pages/quickstart.html
