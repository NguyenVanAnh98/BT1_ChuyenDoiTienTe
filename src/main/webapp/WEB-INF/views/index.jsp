<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>USD to VND Converter</title>
</head>
<body>
<h2>USD to VND Converter</h2>
<form action="convert" method="post">
    <label for="exchangeRate">Exchange Rate (VND/USD):</label>
    <input type="number" id="exchangeRate" name="exchangeRate" required><br>
    <label for="usdAmount">USD Amount:</label>
    <input type="number" id="usdAmount" name="usdAmount" required><br>
    <button type="submit">Convert</button>
</form>
</body>
</html>
