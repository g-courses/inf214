# "Abrir archivo o carpeta en Visual Studio Code" en MacOSX

##  Agregar opción al "Menú de acciones rápidas"
- Abrir Automator.
- Crear un nuevo documento.
- Seleccionar "Acción Rápida".
- Configurar "Flujo de trabajo recibe el actual" a `archivos o carpeta` en `cualquier aplicación`.
- Agregar una acción`Ejecuta el script Shell`.
   - Utilizar Shel `/bin/bash`.
   - Configurar "Pasar datos de entrada:" a `como argumentos`.
   
- El script que debe ejecutar la acción es el siguiente:
   ```
   for f in "$@"; do
     open -a 'Visual Studio Code' "$@"
   done
   ```
- Salvar la Acción Rápida como  `Abrir en VS Code`.
- Cerrar Automator.

(La acción rápida se guarda en el archivo `~/Library/Services/Abrir en VSCode.workflow`.)

## Atajos de teclado

Para asignar una secuencia de teclas a la acción creada se puede realizar lo siguiente:

- Abrir “Configuración del Sistema”.
- Seleccionar "Teclado" y luego "Funciones rápidas de teclado".
- En la ventana emergente, en el lado derecho, seleccionar "Servicios".
- Luego en el panel de la derecha, abrir "Archivos y carpetas".
- Seleccionar “Abrir en VS Code” y hacer doble click en la palabra "ninguna".
- Seleccionar una combinación de teclas para el atajo.
- Terminar seleccionando el botón "Listo"
