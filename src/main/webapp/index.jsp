<%@ page import="com.elasriabdelillah.reservation_vols.model.Reservations" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <% Reservations reservations = (Reservations) request.getAttribute("reservation"); %>

  <p>
    <% if(reservations != null) { %>
    ID : <%= reservations.getId()%>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    city departure : <%= reservations.getCity_departure() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    city arrival : <%= reservations.getCity_arrival() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    date departure : <%= reservations.getDate_departure() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    date arrival : <%= reservations.getDate_arrival() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    hour departure : <%= reservations.getHour_departure() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    hour arrival : <%= reservations.getHour_arrival() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    number of places : <%= reservations.getNumber_places()%>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>
  <p>
    <% if(reservations != null) { %>
    tarif : <%= reservations.getTarif() %>
    <%} else  {%>
    Reservation is null
    <% } %>
  </p>


</body>
</html>