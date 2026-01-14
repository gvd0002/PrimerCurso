@echo off
cls
echo PROGRAMA PARA CALCULAR LA MEDIA DE 2 O MAS VALORES

:repetir
echo INTRODUZCA CUANTOS VALORES QUIERES

set /p cantidad=

if %cantidad% lss 2 (
	echo ERROR, TIENE QUE HABER MINIMO 2 VALORES
	goto :repetir
)

set /a contador=0
set /a suma=0

:add
if %contador% neq %cantidad% (
	echo Introduzca valor
	set /p valor=
	set /a suma= suma + valor
	set /a contador= contador + 1
	goto add
)

REM %% me da el resto de una division
set /a entero=%suma%/%cantidad%
set /a resto=%suma%-(%entero%*%cantidad%)
set /a decimales=%resto%*10/%cantidad%
echo La media es %entero%.%decimales%
pause
