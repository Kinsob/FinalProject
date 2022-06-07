<%--
  Created by IntelliJ IDEA.
  User: kinga
  Date: 06.06.2022
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Coctail Fabric</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href='http://fonts.googleapis.com/css?family=Atma&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>

<body>
<header class="page-header">
    <nav class="navbar navbar-expand-lg justify-content-around">
        <a href="/" class="navbar-brand main-logo">
            Coctail<span>Fabric</span>
        </a>
        <ul class="nav nounderline text-uppercase">
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/recipe">Przepisy</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/equipment">Sprzęt</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/favourite">Ulubione</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/counter">Licznik promili</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/logout">Wyloguj się</a>
            </li>
        </ul>
    </nav>
</header>
