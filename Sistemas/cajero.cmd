@echo off
REM Primero eliminamos la pantalla anterior y mostramos el inicio de sesión
cls
echo ****************************************
echo             Inicio de sesion
echo ****************************************
REM Establecemos la contraseña
set password=1234

REM Creamos un código que si el pin es incorrecto esperará 5 segundos antes de abandonar el programa
echo Introduce tu PIN: (Pista: 1234)
set /p pin=
if %pin% neq %password% (
	echo Contraseña incorrecta
	timeout 5
	goto fin
)
set saldo= 0

REM Creamos una etiqueta para la pantalla inicial que usaremos frecuentemente
:mostrarPantalla
cls
color A
echo		*********************************
echo			CAJERO AUTOMATICO
echo		*********************************
echo		       Gonzalo Viedma Diaz
echo		*********************************
echo.
echo        Saldo actual:     %saldo% Euros
echo.
echo        1. Consultar saldo
echo        2. Ingresar dinero
echo        3. Retirar dinero
echo        4. Salir
echo        **************************************
echo Elige una opcion (1-4):

REM Establecemos una variable para comprobar que opciones escogemos
set /p opcion=

if %opcion%==1 goto consultar
if %opcion%==2 goto Ingresar
if %opcion%==3 goto retirar
if %opcion% gtr 3 goto fin

REM Es la primera opción de consulta y vuelve a la pantalla inicial
:consultar
echo ************************
echo **  Saldo: %saldo%    **
echo ************************
pause
goto mostrarPantalla

REM Solicita una cantidad y la añade al saldo corriente
:Ingresar
echo Cuanto quiere ingresar?
set /p ingreso=
set /a saldo= %saldo%+%ingreso%
REM Muestro la fecha y la hora con el ingreso y el saldo actual redirigiendolo para escribir debajo en moviminetos.txt
echo %date% %time% - Ingreso de %ingreso% euros. Saldo actual: %saldo% >> movimientos.txt
goto mostrarPantalla

REM Solicita cantidad y la resta al saldo corriente
:retirar
echo Cuanto quieres retirar?
set /p retirada=

REM Si la retirada es mayor que el saldo, se pondrá en rojo el texto y preguntará si desea seguir
if %saldo% LSS %retirada% (
	color 4
	echo No puedes sacar puesto que tu cuenta entraria en negativo
	goto preguntarSeguir
) 
set /a saldo=%saldo%-%retirada%
REM Muestro la fecha y la hora con la retirada y el saldo actual redirigiendolo para escribir debajo en moviminetos.txt
echo %date% %time% - Retirada de %retirada% euros. Saldo actual: %saldo% >> movimientos.txt
goto mostrarPantalla

REM Etiqueta que se usará frecuentemente para no repetir código
:preguntarSeguir
echo Otra operación?(S/N)
set /p seguir=
if %seguir%==S (
	goto mostrarPantalla
) else (
	goto fin
)



:fin
echo Fin del programa