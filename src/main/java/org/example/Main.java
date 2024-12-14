package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> hotels = new ArrayList<>();

        Map<String, Object> castilloResort = new HashMap<>();
        castilloResort.put("nombre", "Hotel Castillo Resort");
        castilloResort.put("calificacion", 4.5);
        castilloResort.put("ciudad", "San Gil, Santander");
        castilloResort.put("descripcion", "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park, y ofrece alojamiento con piscina al aire libre, parking privado gratis, jardín y salón de uso común.");
        castilloResort.put("tiposAlojamiento", List.of(
                Map.of(
                        "tipo", "Estadía por noche",
                        "precioPorNoche", 180.0
                ),
                Map.of(
                        "tipo", "Pasadía",
                        "precioPorDia", 60.0
                )
        ));
        hotels.add(castilloResort);

        Map<String, Object> mesonDeCuchicute = new HashMap<>();
        mesonDeCuchicute.put("nombre", "Mesón del Cuchicute");
        mesonDeCuchicute.put("calificacion", 4.3);
        mesonDeCuchicute.put("ciudad", "San Gil, Santander");
        mesonDeCuchicute.put("descripcion", "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.");
        mesonDeCuchicute.put("tiposAlojamiento", List.of(
                Map.of(
                        "tipo", "Estadía por noche",
                        "precioPorNoche", 150.0
                ),
                Map.of(
                        "tipo", "Estadía por fines de semana",
                        "precioPorFinDeSemana", 350.0
                ),
                Map.of(
                        "tipo", "Pasadía",
                        "precioPorDia", 50.0
                )
        ));
        hotels.add(mesonDeCuchicute);


        Map<String, Object> fincaSolYLuna = new HashMap<>();
        fincaSolYLuna.put("nombre", "Finca Sol y Luna");
        fincaSolYLuna.put("calificacion", 4.3);
        fincaSolYLuna.put("ciudad", "San Gil");
        fincaSolYLuna.put("descripcion", "Finca Sol y Luna se encuentra en San Gil, en la región de Santander, a 47 km de Chicamocha National Park. Ofrece alojamiento con wifi gratis, zona de barbacoa, piscina al aire libre y parking privado gratis. Algunas unidades incluyen TV de pantalla plana por cable, cocina totalmente equipada con nevera y baño privado con ducha y artículos de aseo gratuitos.");
        fincaSolYLuna.put("tipoAlojamiento", "Finca (fines de semana)");
        fincaSolYLuna.put("precioPorNoche", 120.0);
        hotels.add(fincaSolYLuna);


        Map<String, Object> aptoSanGilPlaza = new HashMap<>();
        aptoSanGilPlaza.put("nombre", "Hermoso Apto - C.C San Gil Plaza");
        aptoSanGilPlaza.put("calificacion", 4.6);
        aptoSanGilPlaza.put("ciudad", "San Gil");
        aptoSanGilPlaza.put("descripcion", "Hermoso Apto - C.C San Gil Plaza está en San Gil, dispone de vistas a la ciudad y wifi gratis.");
        aptoSanGilPlaza.put("tipoAlojamiento", "Apartamento");
        aptoSanGilPlaza.put("precioPorNoche", 70.0);
        hotels.add(aptoSanGilPlaza);


        Map<String, Object> aptahotelGuestHouse = new HashMap<>();
        aptahotelGuestHouse.put("nombre", "Aptahotel Guest House");
        aptahotelGuestHouse.put("calificacion", 4.5);
        aptahotelGuestHouse.put("ciudad", "San Gil");
        aptahotelGuestHouse.put("descripcion", "Aptahotel Guest House está en San Gil, a 41 km de Chicamocha National Park y a 41 km de Chicamocha Water Park.");
        aptahotelGuestHouse.put("tipoAlojamiento", "Apartamento");
        aptahotelGuestHouse.put("precioPorNoche", 90.0);
        hotels.add(aptahotelGuestHouse);
        hotels.forEach(hotel -> {
            System.out.println("***********************************");
            System.out.println("Nombre del hotel: " + hotel.get("nombre"));
            System.out.println("Calificación: " + hotel.get("calificacion"));
            System.out.println("Ciudad: " + hotel.get("ciudad"));
            System.out.println("Descripcion: " + hotel.get("descripcion"));

            Object tiposAlojamiento = hotel.get("tiposAlojamiento");
            if (tiposAlojamiento instanceof List) {
                for (Map<String, Object> tipo : (List<Map<String, Object>>) tiposAlojamiento) {
                    System.out.print("Tipo: " + tipo.get("tipo"));
                    if (tipo.containsKey("precioPorNoche")) {
                        System.out.println(", Precio por noche: " + tipo.get("precioPorNoche"));
                    }
                    if (tipo.containsKey("precioPorFinDeSemana")) {
                        System.out.println(", Precio por fin de semana: " + tipo.get("precioPorFinDeSemana"));
                    }
                    if (tipo.containsKey("precioPorDia")) {
                        System.out.println(", Precio por día: " + tipo.get("precioPorDia"));
                    }
                }
            } else if (tiposAlojamiento instanceof String) {
                System.out.println("Tipo de Alojamiento: " + tiposAlojamiento);
            }
            System.out.println("***********************************");

        });

    }
}