@echo off

REM Pantalla inicial con las opciones disponibles
:mostrarPantalla
cls
REM Establecemos fondo azul (1) con texto blanco (7)
color 17
echo.
echo		*******************************************************
echo		***						    ***
echo		***               CALCULADORA PERSONAL              ***
echo		***		  Gonzalo Viedma Diaz	            ***
echo		***                                                 ***
echo		*******************************************************
echo. 
echo				  *********MENU********		  
echo				  *********************
echo				  ** 1. SUMAR	     **
echo				  ** 2. RESTAR	     **
echo				  ** 3. MULTIPLICAR  **
echo				  ** 4. DIVIDIR	     **
echo				  ** 5. CREDITOS     **
echo				  ** 6. SABER MAS    **
echo				  ** 7. SALIR	     **
echo				  *********************
echo				  *********************

echo Seleccione una opcion:
REM Establecemos opcion y comprobamos cual es
set /p opcion=
if %opcion%==1 goto sumar
if %opcion%==2 goto restar
if %opcion%==3 goto multiplicar
if %opcion%==4 goto dividir
if %opcion%==5 goto creditos
if %opcion%==6 goto sabermas
if %opcion%==7 goto ( fin
REM Si no es ninguna de las opciones muestra mensaje de error
	) else ( echo No es posible esa opcion
		goto mostrarPantalla
	)

REM Función sumar
:sumar
cls
echo.
echo            *********************
echo            ***      SUMAR    ***
echo            *********************
set /p num1=Elige el primer numero 
set /p num2=Elige el segundo numero 
set /a resultado=%num1%+%num2%
echo El resultado es: %resultado%
goto continuar

REM Función restar
:restar
cls
echo.
echo            *********************
echo            ***     RESTAR    ***
echo            *********************
set /p num1=Elige el primer numero 
set /p num2=Elige el segundo numero 
set /a resultado=%num1%-%num2%
echo El resultado es: %resultado%
goto continuar

REM Función multiplicar
:multiplicar
cls
echo.
echo            *********************
echo            ***   MULTIPLICAR ***
echo            *********************
set /p num1=Elige el primer numero 
set /p num2=Elige el segundo numero 
set /a resultado=%num1%*%num2%
echo El resultado es: %resultado%
goto continuar

REM Función dividir
:dividir
cls
echo.
echo            *********************
echo            ***    DIVIDIR    ***
echo            *********************
set /p num1=Elige el primer numero 
set /p num2=Elige el segundo numero 
REM Comprueba que el divisor es distinto de cero
if %num2%==0 (
	echo El segundo valor no puede ser 0
	goto continuar
	)
set /a resultado=%num1%/%num2%
echo El resultado es: %resultado%
goto continuar

REM Muestra información mía
:creditos
cls
echo.
echo		*****************************************
echo		*****	   Programa creado por      *****
echo		*****      Gonzalo Viedma Diaz      *****
echo		*****   email: gvd0002@alu.medac.es *****
echo		*****************************************
goto continuar


:sabermas
echo Se le va a redirijir a una pagina web
REM Espera 5 segundos para que el usuario lea el texto
timeout 5
REM start abrirá la dirección adjuntada como atributo
start https://docs.fileformat.com/es/executable/cmd/
goto continuar

REM Función para preguntar si continuar o terminar programa
:continuar
echo Continuar?(S/N)
set /p continuar=
if %continuar%==S (
	goto mostrarPantalla
	) else (
		goto fin
	)

:fin