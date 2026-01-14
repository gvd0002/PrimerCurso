@echo off
echo.
echo La extension es %1 y el nombre del directorio es %2
echo.
echo.
echo ************************************************************
echo       Los archivos con esa extension son los siguientes
echo.
dir *.%1
echo.
echo ************************************************************
mkdir %2
echo.
echo.
echo.
echo ************************************************************
echo                  Voy a copiar los archivos
echo.
copy *.%1 %2 > listar.txt
echo.
echo                     Ya estan copiados
echo.
echo.
echo ************************************************************
echo.
echo         Ahora estoy mostrando el contenido del archivo 
echo.
type listar.txt
echo.
echo ************************************************************
echo.
tree /F
echo.
echo                    Fin del programa
echo ************************************************************