#!/usr/bin/env python3

import http.server
import socketserver
import os

PORT = 8000

# Para finel del ejemplo,
# directorio base es el directorio 'www' que ubica
# en el mismo directorio del script
BASE_DIR = os.path.dirname(os.path.abspath(__file__))
DATA_DIR = "/www"
DIRECTORIO_BASE = BASE_DIR + DATA_DIR


def main():
    # Cambiar el directorio actual de trabajo al directorio base
    os.chdir(DIRECTORIO_BASE)

    # Define una clase de manejador que hereda de SimpleHTTPRequestHandler
    Handler = http.server.SimpleHTTPRequestHandler

    # Configura el servidor
    httpd = socketserver.TCPServer(("", PORT), Handler)
    print(f"Sirviendo en el puerto {PORT}")
    httpd.serve_forever()

if __name__ == "__main__":
    main()
