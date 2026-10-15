<%-- 
    Document   : productos
    Created on : 7/10/2026, 10:28:10?p. m.
    Author     : JOSE YOVANY ROJAS M
--%>

<%@ page import="com.tienda.dao.ProductoDAO"%>
<%@ page import="com.tienda.modelo.Producto"%>
<%@ page import="java.util.List"%>

<%
ProductoDAO dao = new ProductoDAO();
List<Producto> lista = dao.listar();
%>

<h1>Productos</h1>

<table border="1">

<tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Precio</th>
</tr>

<%
for(Producto p : lista){
%>

<tr>
    <td><%= p.getId() %></td>
    <td><%= p.getNombre() %></td>
    <td><%= p.getPrecio() %></td>
</tr>

<%
}
%>

</table>