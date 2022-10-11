# Repositorio de pruebas con Spring

Repositorio que tiene lo basico de spring

---

## Subir a Github

![Imagen](https://www.entechlog.com/images/blog/vendor-logos/git_hu0e51f16f299b901974dc8c7c559a4bb9_48646_f81c8fc163b6ede2d840a5624a7d8d23.webp)

### Desde consola

 - Crear un repositorio en github
 - Obtener link https del repositorio. Ejemplo: `https://github.com/IRypS/PracticaSpringBasico.git`
 - Abrir cmd 
 - Moverte hasta la carpeta del proyecto
 - Poner los comandos a continuacion:

> Comandos    
> - Iniciar repositorio en local `git init`
> - Añadir todos los archivos al repositorio local `git add .` (Punto signfica todos los archivos)
> - Hacer un commit a los archivos añadidos `git commit -m "tu mensaje"`
> - Definir el repositorio en github `git remote add origin <link https>`    
> Ejemplo: `git remote add origin https://github.com/IRypS/PracticaSpringBasico.git`
> - Subir el repositorio de local a github `git push origin <nombre rama>`    
> Ejemplo: `git push origin master` || `git push origin main`



### Subir desde Github Desktop

 - Ingresar a github desktop y añadir la carpeta local a un repositorio existente
 ![Github Desktop Inicio](/screenshots/desktop1.png)
 - Seleccionar la carpeta (Si no tienes un repositorio creado localmente puedes crearlo desde ahi mismo presionando en `create a repository`)
  ![Github Desktop Inicio](/screenshots/desktop2.png)
- Llena los datos para crear un nuevo formulario
  ![Github Desktop Inicio](/screenshots/desktop3.png)
- Te aparecera una pestaña con los cambios
  ![Github Desktop Inicio](/screenshots/desktop4.png)
- Haz el commit con los nuevos cambios
  ![Github Desktop Inicio](/screenshots/desktop5.png)
- Publica la rama 
  ![Github Desktop Inicio](/screenshots/desktop6.png)