@echo off
REM /E copia subdirectorios vacíos también
REM /PURGE elimina los archivos y directorios de destino que ya no existen en el origen
REM /R:n numero de intentos en copias con errores (por defecto 1 millón)
REM /W:n tiempo de espera entre reintentos (por defecto 30 segundos)

robocopy "C:\Users\Alumno T\Desktop" "C:\Users\Alumno T\hacercopia" /MIR /R:2 /W:5

diskpart /S "C:\Users\Alumno T\Desktop\Primer curso\Sistemas\diskpart.txt

diskpart /S "C:\Users\Alumno T\Desktop\Primer curso\Sistemas\desbloqueo.txt
