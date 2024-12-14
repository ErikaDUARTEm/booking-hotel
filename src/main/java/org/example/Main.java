package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Llamar al método listaDeHoteles
        List<Map<String, Object>> hotels = listOfHotels();

        // Mostrar la información de los hoteles
        hotels.forEach(hotel -> {
            System.out.println("***********************************");
            System.out.println("Nombre del hotel: " + hotel.get("name"));
            System.out.println("Calificación: " + hotel.get("rating"));
            System.out.println("Ciudad: " + hotel.get("city"));
            System.out.println("Descripcion: " + hotel.get("description"));
            System.out.println("Tipo de Alojamiento: " + hotel.get("typeOfAccommodation"));
            System.out.println(("Price: $" + hotel.get("price")));
            System.out.println("***********************************");
        });

    }
            public static List<Map<String, Object>> listOfHotels() {
                List<Map<String, Object>> hotels = new ArrayList<>();

                Map<String, Object> castilloResort = new HashMap<>();
                castilloResort.put("name", "Hotel Castillo Resort");
                castilloResort.put("rating", 4.5);
                castilloResort.put("city", "San Gil, Santander");
                castilloResort.put("description", "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park, y ofrece alojamiento con piscina al aire libre, parking privado gratis, jardín y salón de uso común.");
                castilloResort.put("typeOfAccommodation", "Pasadía");
                castilloResort.put("price", 60.0);
                hotels.add(castilloResort);

                Map<String, Object> mesonDeCuchicute = new HashMap<>();
                mesonDeCuchicute.put("name", "Mesón del Cuchicute");
                mesonDeCuchicute.put("rating", 4.3);
                mesonDeCuchicute.put("city", "San Gil, Santander");
                mesonDeCuchicute.put("description", "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.");
                mesonDeCuchicute.put("typeOfAccommodation", "Estadía por noche");
                mesonDeCuchicute.put("price", 150.0);
                hotels.add(mesonDeCuchicute);

                Map<String, Object> fincaSolYLuna = new HashMap<>();
                fincaSolYLuna.put("name", "Finca Sol y Luna");
                fincaSolYLuna.put("rating", 4.3);
                fincaSolYLuna.put("city", "San Gil");
                fincaSolYLuna.put("description", "Finca Sol y Luna se encuentra en San Gil, en la región de Santander, a 47 km de Chicamocha National Park. Ofrece alojamiento con wifi gratis, zona de barbacoa, piscina al aire libre y parking privado gratis. Algunas unidades incluyen TV de pantalla plana por cable, cocina totalmente equipada con nevera y baño privado con ducha y artículos de aseo gratuitos.");
                fincaSolYLuna.put("typeOfAccommodation", "Finca (fines de semana)");
                fincaSolYLuna.put("price", 350.0);
                hotels.add(fincaSolYLuna);

                Map<String, Object> aptoSanGilPlaza = new HashMap<>();
                aptoSanGilPlaza.put("name", "Hermoso Apto - C.C San Gil Plaza");
                aptoSanGilPlaza.put("rating", 4.6);
                aptoSanGilPlaza.put("city", "San Gil");
                aptoSanGilPlaza.put("description", "Hermoso Apto - C.C San Gil Plaza está en San Gil, dispone de vistas a la ciudad y wifi gratis.");
                aptoSanGilPlaza.put("typeOfAccommodation", "Apartamento");
                aptoSanGilPlaza.put("price", 70.0);
                hotels.add(aptoSanGilPlaza);

                Map<String, Object> aptahotelGuestHouse = new HashMap<>();
                aptahotelGuestHouse.put("name", "Aptahotel Guest House");
                aptahotelGuestHouse.put("rating", 4.5);
                aptahotelGuestHouse.put("city", "San Gil");
                aptahotelGuestHouse.put("description", "Aptahotel Guest House está en San Gil, a 41 km de Chicamocha National Park y a 41 km de Chicamocha Water Park.");
                aptahotelGuestHouse.put("typeOfAccommodation", "Apartamento");
                aptahotelGuestHouse.put("price", 90.0);
                hotels.add(aptahotelGuestHouse);

                return hotels;
            }
}