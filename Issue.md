# Definición de la rama de la versión 1

## 1.Actualizar el repositorio en local:

```Code
Microsoft Windows [Versión 10.0.19045.5011]
(c) Microsoft Corporation. Todos los derechos reservados.

C:\Users\nico>dir
 El volumen de la unidad C no tiene etiqueta.
 El número de serie del volumen es: 948C-7A4E

 Directorio de C:\Users\nico

23/10/2024  23:19    <DIR>          .
23/10/2024  23:19    <DIR>          ..
24/09/2024  08:33    <DIR>          .dia
28/09/2024  22:24                64 .gitconfig
23/10/2024  23:19                20 .lesshst
17/09/2024  16:30    <DIR>          .m2
15/08/2024  18:51    <DIR>          .nbi
20/09/2024  15:46    <DIR>          .redhat
23/10/2024  22:05             2.845 .viminfo
14/10/2024  00:37    <DIR>          .VirtualBox
18/09/2024  16:54    <DIR>          .vscode
15/08/2024  17:15    <DIR>          3D Objects
15/08/2024  17:26    <DIR>          ansel
15/08/2024  17:15    <DIR>          Contacts
27/09/2024  21:54    <DIR>          dam-primero-programacion
22/10/2024  11:31    <DIR>          Desktop
01/10/2024  13:13    <DIR>          Documents
27/10/2024  09:36    <DIR>          Downloads
15/08/2024  17:15    <DIR>          Favorites
15/08/2024  17:19    <DIR>          Intel
15/08/2024  17:15    <DIR>          Links
15/08/2024  17:15    <DIR>          Music
15/08/2024  17:17    <DIR>          OneDrive
15/08/2024  17:16    <DIR>          Pictures
28/09/2024  22:55    <DIR>          repositorio-ejercicio-1
15/08/2024  17:15    <DIR>          Saved Games
15/08/2024  17:16    <DIR>          Searches
30/09/2024  11:06    <DIR>          Videos
01/10/2024  17:39    <DIR>          VirtualBox VMs
               3 archivos          2.929 bytes
              26 dirs  380.302.843.904 bytes libres

C:\Users\nico>cd Documents

C:\Users\nico\Documents>dir
 El volumen de la unidad C no tiene etiqueta.
 El número de serie del volumen es: 948C-7A4E

 Directorio de C:\Users\nico\Documents

01/10/2024  13:13    <DIR>          .
01/10/2024  13:13    <DIR>          ..
01/10/2024  13:14    <DIR>          NetBeansProjects
               0 archivos              0 bytes
               3 dirs  380.297.580.544 bytes libres

C:\Users\nico\Documents>git clone https://github.com/nexphernandez/tienda-de-videojuegos
Cloning into 'tienda-de-videojuegos'...
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (6/6), done.

C:\Users\nico\Documents>cd tienda-de-videojuegos

C:\Users\nico\Documents\tienda-de-videojuegos>code .

PS C:\Users\nico\Documents\tienda-de-videojuegos> git checkout main
Already on 'main'
Your branch is up to date with 'origin/main'.
PS C:\Users\nico\Documents\tienda-de-videojuegos> git pull origin main
From https://github.com/nexphernandez/tienda-de-videojuegos
 * branch            main       -> FETCH_HEAD
Already up to date.
```

## 2.Crear la nueva rama para la version 1: