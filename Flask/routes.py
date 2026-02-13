from main import app
from flask import render_template
#flask sqlalchemy
#flask wtf forms

@app.route("/")
def homepage():
   return render_template ("homepage.html")
   
@app.route("/blog")
def blog():
   return "Bem vindo ao meu blog"

@app.route("/teste")
def teste():
   return render_template("index.html")