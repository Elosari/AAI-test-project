query = 'SELECT article, title FROM our_texts WHERE title LIKE "%" + request.getParameter("searchString") + '%';
SELECT article, title FROM our_texts WHERE title LIKE "%" UNION SELECT username, password FROM user -- %"
