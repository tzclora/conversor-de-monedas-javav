# conversor-de-monedas-javav
Desafío desarrollado para el curso de Alura latam 
# 💱 Conversor de Monedas - Proyecto Java

Este es un proyecto desarrollado como parte del desafío del programa ONE (Oracle Next Education) de Alura LATAM.  
Consiste en un conversor de monedas que utiliza una API externa para obtener tasas de cambio en tiempo real. El objetivo fue aplicar conceptos de Java como programación orientada a objetos, consumo de API, manejo de JSON con Gson, modularidad y buena interacción con el usuario por consola.

---

## 🚀 Tecnologías utilizadas

- Java 21  
- IDE: IntelliJ IDEA  
- API: [Exchangerate API](https://app.exchangerate-api.com/)  
- Gson (para analizar JSON)  
- Git y GitHub (control de versiones)

---

## 🔧 Funcionalidades

- Interfaz por consola amigable e intuitiva  
- Menú con opciones de monedas para convertir  
- Conversión precisa usando tasas actualizadas desde la API  
- Validación de entradas del usuario  
- Bucle de repetición para múltiples conversiones  
- Mensajes claros de error y confirmación  
- Código modular y organizado por clases

---

## 🛠️ Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tzclora/conversor-de-monedas-javav.git
   Abrir el proyecto en IntelliJ IDEA.

2. Asegurarse de tener Java instalado y configurado (versión 21 o compatible).

3. Ejecutar la clase principal: ConversorMoneda.java.

4. Seguir las instrucciones que aparecen en consola para realizar conversiones.
   
---

🧩 Estructura del programa   
ConversorMoneda.java: clase principal con el menú y flujo de interacción.

Moneda.java: clase modelo que representa una moneda.

ServicioCambio.java: clase encargada de hacer la solicitud HTTP a la API y procesar la respuesta JSON.

---

🐞 Errores conocidos
Si no hay conexión a internet, la aplicación no puede completar la conversión.

Algunas monedas no están disponibles en la versión gratuita de la API.

Actualmente no se guarda el historial de conversiones (puede agregarse en versiones futuras).

---

📌 Consideraciones
La API utilizada tiene un límite de uso gratuito diario.

El programa está pensado para funcionar por consola.

Este conversor puede evolucionar a una interfaz gráfica o aplicación web en fases posteriores.

---

👨‍💻 Desarrollado por
BubChes (Juan Carlos Lora Rebollo)
Participante del programa Oracle Next Education (ONE)

---

📎 Licencia
Este proyecto es de uso libre para fines educativos.

