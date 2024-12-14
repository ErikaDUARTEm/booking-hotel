package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Listar hoteles");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> printDetailsHotels();
                case 2 -> searchAvailableAccommodations();
                case 4 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }


    }
            public static void printDetailsHotels(){
                // Llamar al método listaDeHoteles
                List<Map<String, Object>> hotels = listOfHotels();

                // Mostrar la información de los hoteles
                hotels.forEach(hotel -> {
                    System.out.println("***********************************");
                    System.out.println("Nombre del hotel: " + hotel.get("name"));
                    System.out.println("Calificación: " + hotel.get("rating"));
                    System.out.println("Ciudad: " + hotel.get("city"));
                    System.out.println("Descripcion: " + hotel.get("description"));
                    System.out.println("Disponibilidad: " + hotel.get("availability"));
                    System.out.println("Precio: $" + hotel.get("price"));
                    System.out.println("Habitaciones disponibles: " + hotel.get("rooms"));
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
                castilloResort.put("typeOfAccommodation", Map.of( "Pasadía", 20, "Estadia por noche", 30));
                // 15/12/2024, al  15/01/2025
                castilloResort.put("availability", Map.of(
                                "start", 19110,
                                "end", 19145));
                castilloResort.put("price", 60.0);
                castilloResort.put("rooms", Map.of(
                        "single room", 2,
                        "double room", 6,
                        "quadruple room", 1,
                        "family room", 5,
                        "suite", 3));
                hotels.add(castilloResort);

                Map<String, Object> mesonDeCuchicute = new HashMap<>();
                mesonDeCuchicute.put("name", "Mesón del Cuchicute");
                mesonDeCuchicute.put("rating", 4.3);
                mesonDeCuchicute.put("city", "San Gil, Santander");
                mesonDeCuchicute.put("description", "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.");
                mesonDeCuchicute.put("typeOfAccommodation", "Estadia por noche");
                // 15/01/2025 al 30/01/2025
                mesonDeCuchicute.put("availability", Map.of(
                                "start", 19218,
                                "end", 19233));
                mesonDeCuchicute.put("price", 150.0);
                mesonDeCuchicute.put("rooms", Map.of(
                        "single room", 3,
                        "double room", 5,
                        "quadruple room", 2,
                        "family room", 3,
                        "suite", 2
                ));

                hotels.add(mesonDeCuchicute);

                Map<String, Object> fincaSolYLuna = new HashMap<>();
                fincaSolYLuna.put("name", "Finca Sol y Luna");
                fincaSolYLuna.put("rating", 4.3);
                fincaSolYLuna.put("city", "San Gil");
                fincaSolYLuna.put("description", "Finca Sol y Luna se encuentra en San Gil, en la región de Santander, a 47 km de Chicamocha National Park. Ofrece alojamiento con wifi gratis, zona de barbacoa, piscina al aire libre y parking privado gratis. Algunas unidades incluyen TV de pantalla plana por cable, cocina totalmente equipada con nevera y baño privado con ducha y artículos de aseo gratuitos.");
                fincaSolYLuna.put("typeOfAccommodation", "Finca (fines de semana)");
                //Inicio: 01/02/2025, Fin: 15/03/2025
                fincaSolYLuna.put("availability", Map.of(
                        "start", 19232,
                        "end", 19277));
                fincaSolYLuna.put("price", 350.0);
                fincaSolYLuna.put("rooms", Map.of(
                        "single room", 1,
                        "double room", 2,
                        "quadruple room", 1,
                        "family room", 1,
                        "matrimonial", 1));
                hotels.add(fincaSolYLuna);

                Map<String, Object> aptoSanGilPlaza = new HashMap<>();
                aptoSanGilPlaza.put("name", "Hermoso Apto - C.C San Gil Plaza");
                aptoSanGilPlaza.put("rating", 4.6);
                aptoSanGilPlaza.put("city", "San Gil");
                aptoSanGilPlaza.put("description", "Hermoso Apto - C.C San Gil Plaza está en San Gil, dispone de vistas a la ciudad y wifi gratis.");
                aptoSanGilPlaza.put("typeOfAccommodation", "Apartamento");
                /* 15 de diciembre de 2024 al 1 de enero de 2025*/
                aptoSanGilPlaza.put("availability", Map.of(
                        "start", 19010,
                        "end", 19025
                ));
                aptoSanGilPlaza.put("price", 70.0);
                aptoSanGilPlaza.put("rooms", Map.of(
                        "single room", 1,
                        "double room", 2,
                        "matrimonial", 1,
                        "suite", 0,
                        "family room", 0
                        ));
                hotels.add(aptoSanGilPlaza);

                Map<String, Object> aptahotelGuestHouse = new HashMap<>();
                aptahotelGuestHouse.put("name", "Aptahotel Guest House");
                aptahotelGuestHouse.put("rating", 4.5);
                aptahotelGuestHouse.put("city", "San Gil");
                aptahotelGuestHouse.put("description", "Aptahotel Guest House está en San Gil, a 41 km de Chicamocha National Park y a 41 km de Chicamocha Water Park.");
                aptahotelGuestHouse.put("typeOfAccommodation", "Apartamento");
                // 05/06/2025 a  30/07/2025
                aptahotelGuestHouse.put("availability", Map.of(
                        "start", 19217,
                        "end", 19306
                ));
                aptahotelGuestHouse.put("price", 90.0);
                aptahotelGuestHouse.put("rooms", Map.of(
                        "single room", 1,
                        "double room", 2,
                        "matrimonial", 1,
                        "suite", 0,
                        "family room", 0));
                hotels.add(aptahotelGuestHouse);

                return hotels;
            }
            public static List<Map<String, Object>> searchAvailableAccommodations(
                   String city,
                   typeOfAccommodation, startDate, endDate, numberOfAdults, numberOfChildren, numberOfRooms
                    ){


            }

}