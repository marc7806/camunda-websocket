# Camunda Websockets Example

## Example Use-Case

### Travelling Process

In this example we are a travel booking company with following requirements:

- Users can book a new travel (this starts a new instance of the travel-booking-process)
- We have an administration Web-UI where we can see in realtime, as soon as a new travel gets booked (with the help of websockets)

#### Test this example

1. Open a tab of http://localhost:8080/camunda-websockets/admin - This is the WebSocket UI that listens to new travel process start events
2. Open camunda tasklist in a new tab - http://localhost:8080
3. Start a new instance of "Travel Process"
4. Visit your opened Websocket Tab and see the process start event

### Resources

- https://spring.io/guides/gs/messaging-stomp-websocket/
- https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#websocket
- https://docs.camunda.org/manual/latest/user-guide/spring-boot-integration/the-spring-event-bridge/
