from bs4 import BeautifulSoup

with open("books.xml", "r", encoding="utf8") as book_file:
  books_xml = book_file.read()

soup = BeautifulSoup(books_xml, "lxml")

for book_info in soup.find_all("author"):
  print(book_info)
  print(book_info.get_text())