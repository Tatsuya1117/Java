<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>サンプル</title>
</head>
<body>
  <%
    String[] days = { "", "日", "月", "火", "水", "木", "金", "土" };
    Calendar cl = Calendar.getInstance();
    int yyyy = cl.get(Calendar.YEAR);
    int mm = cl.get(Calendar.MONTH) + 1;
    int dd = cl.get(Calendar.DATE);
    int day = cl.get(Calendar.DAY_OF_WEEK);
  %>
  <p>
    <b> 今日は<%=yyyy%>年<%=mm%>月<%=dd%>日（<%=days[day]%>）曜日です。</b>
  </p>
  <% if (day == Calendar.SUNDAY) { %>
  <b> 今日はお休みです！！</b>>
  <%
    } else {
      for (int i = 1; i <= 7; i++) {
        cl.add(Calendar.DAY_OF_MONTH, 1);
        if (cl.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
  %>
          次の日曜日まで後<%=i%>日です！
  <%
          break;
        }
      }
    }
  %>
</body>
</html>