## PUDGE DEMO
Simple spring boot web application integrated with pudge

### What is pudge
> * A popular hero in dota2 :)
> 
> * github repo: [pudge](https://github.com/wzyu11/pudge)

### Modules

#### pudge-demo-iface

Define the service interface which is implemented by server side 

and invoked by client side. Two important annotations are used to

declare the interface integrated with pudge 
```
@PudgeService(name = "pudge-demo-svc")

@PudgeMethod(name = "void")
```
#### pudge-demo-server
A server side application which implements the service in pudge-demo-iface

and provides common rest api. In order to use pudge server, configurations:
```
@EnablePudgeServer
```
in application.yml
```yaml
pudge:
  server:
    services:
      - name: pudge-demo-svc
        port: 2333
        thread-pool-size: 10
```
Start the server and will auto start a server(netty here) to provide rpc methods

#### pudge-demo-client
A client side application which invokes the service in pudge-demo-iface

In order to use pudge client, configurations:
```
@EnablePudgeClient
``` 
in application.yml
```yaml
pudge:
  client:
    services:
      - service-name: pudge-demo-svc
        url: localhost:2333
    pool-enabled: false
```
When use rpc in code:(so easy!)
```
@Resource
private DemoService demoSerivce;
```
Start the client server and then you can check if works quickly on http://{address}:{port}/swagger-ui.html 