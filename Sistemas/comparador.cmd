@echo off

REM Compruebo que 1 y 2 son iguales diferente 3
if %1 EQU %2 (
	if %1 NEQ %3 (
		echo Los parametros 1 y 2 son iguales %1 = %2
		echo El parametro 3 es distinto
	)
)

REM Compruebo que 1 y 3 son iguales diferente 2
if %1 EQU %3 (
	if %1 NEQ %2 (
		echo Los parametros 1 y 3 son iguales %1 = %3
		echo El parametro 2 es distinto
	)
)

REM Compruebo que 2 y 3 son iguales diferente 1
if %2 EQU %3 (
	if %2 NEQ %1 (
		echo Los parametros 2 y 3 son iguales %2 = %3
		echo El parametro 1 es distinto
	)
)

REM Compruebo que 1 y 2 y 3 son iguales
if %1 EQU %2 (
	if %1 EQU %3 (
		echo Los parametros 1, 2 y 3 son iguales %1 = %2 = %3
	)
)

REM Compruebo que 1 y 2 y 3 son distintos
if %1 NEQ %2 (
	if %1 NEQ %3 (
		if %2 NEQ %3 (
			echo Los tres parametros son diferentes
		)
	)
)