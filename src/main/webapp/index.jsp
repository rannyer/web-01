<%@ page import="java.util.ArrayList"%>


<%
    ArrayList<String> cantores =  new ArrayList<>();

    cantores.add("Joelma");
    cantores.add("DIO");
    cantores.add("Trevo Scort");
    cantores.add("Tunico e Tinoco");
    cantores.add("Manoel Gomes");
    cantores.add("Zé Manguinho");
    cantores.add("Milionário e José Rico");
    cantores.add("Boonie e Clay");
    cantores.add("Raul Seixas");
    cantores.add("Vitas");
    cantores.add("Scarlxd");
%>
<html>
<body>
<%@ include file="header.jsp"  %>
<h2>Hello World! <%= cantores.get(1)%></h2>
<ul>

    <%
        for(String cantor : cantores){
            out.println("<li>"+cantor+"</li>");
        }
    %>



</ul>

</body>
</html>
