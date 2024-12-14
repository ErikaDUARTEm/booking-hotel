package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Listar hoteles");
            System.out.println("2. Consultar disponibilidad de fechas, habitaciones y precio");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> printDetailsHotels();
                case 2 -> {
                    System.out.println("Ingresa los siguientes datos: ");
                    scanner.nextLine();

                    System.out.println("Ciudad");
                    String city = scanner.nextLine().toLowerCase();

                    System.out.println("Tipo de alojamiento");
                    String typeOfAccommodation = scanner.nextLine().toLowerCase();

                    System.out.println("Fecha de Ingreso en formato yyyyMMdd");
                    int startDate = scanner.nextInt();

                    System.out.println("Fecha de salida en formato yyyyMMdd");
                    int endDate = scanner.nextInt();

                    System.out.println("cantidad de Adultos");
                    int numbersAdults = scanner.nextInt();

                    System.out.println("cantidad de Niños");
                    int numbersChildrens = scanner.nextInt();

                    System.out.println("cantidad de Habitaciones");
                    int numberOfRooms = scanner.nextInt();
                    System.out.println(city);
                    System.out.println(typeOfAccommodation);
                    System.out.println(startDate);
                    System.out.println(endDate);
                    System.out.println(numbersAdults);
                    System.out.println(numbersChildrens);
                    System.out.println(numberOfRooms);

                    searchAvailableAccommodations(city, typeOfAccommodation, startDate, endDate, numbersAdults, numbersChildrens, numberOfRooms);

                }

                case 4 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }


    }

    public static void printDetailsHotels() {
        // Llamar al método listaDeHoteles
        List<Map<String, Object>> hotels = listOfHotels();

        // Mostrar la información de los hoteles
        hotels.forEach(hotel -> {
            System.out.println("***********************************");
            System.out.println("Nombre del hotel: " + hotel.get("name"));
            System.out.println("Calificación: " + hotel.get("rating"));
            System.out.println("Ciudad: " + hotel.get("city"));
            System.out.println("Descripcion: " + hotel.get("description"));
            System.out.println("Disponibilidad a partir de : " + hotel.get("startDate"));
            System.out.println("Disponibilidad hasta: " + hotel.get("endDate"));

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
        castilloResort.put("typeOfAccommodation", Map.of("dia de sol", 20, "estadia", 30));
        // 15/12/2024, al  15/01/2025
        castilloResort.put("startDate", 20241215);
        castilloResort.put("endDate", 20250115);
        castilloResort.put("price", 60.0);
        castilloResort.put("servicios", "piscina, almuerzo, wifi, refrigerio, duchas");
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
        mesonDeCuchicute.put("typeOfAccommodation", "estadia");
        // 15/01/2025 al 30/01/2025
        mesonDeCuchicute.put("startDate", 20250115);
        mesonDeCuchicute.put("endDate", 20250130);
        mesonDeCuchicute.put("price", 150.0);
        mesonDeCuchicute.put("servicios", "piscina, desayuno, almuerzo, cena, wifi, agua caliente, servicio a la habitación");
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
        fincaSolYLuna.put("typeOfAccommodation", "finca");
        //Inicio: 01/02/2025, Fin: 15/03/2025
        fincaSolYLuna.put("startDate", 20250201);
        fincaSolYLuna.put("endDate", 20250315);
        fincaSolYLuna.put("price", 350.0);
        fincaSolYLuna.put("servicios", "piscina, wifi, agua caliente");
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
        aptoSanGilPlaza.put("typeOfAccommodation", "apartamento");
        /* 15 de diciembre de 2024 al 1 de enero de 2025*/
        aptoSanGilPlaza.put("startDate", 20241215);
        aptoSanGilPlaza.put("endDate", 20250101);
        aptoSanGilPlaza.put("price", 70.0);
        aptoSanGilPlaza.put("servicios", "piscina, wifi, gimnasio, agua caliente");
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
        aptahotelGuestHouse.put("typeOfAccommodation", "apartamento");
        // 05/06/2025 a  30/07/2025
        aptahotelGuestHouse.put("startDate", 20250605);
        aptahotelGuestHouse.put("endDate", 20250730);
        aptahotelGuestHouse.put("price", 90.0);
        aptahotelGuestHouse.put("servicios", "piscina, wifi, gimnasio, agua caliente");
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
            String typeOfAccommodation,
            int startDate,
            int endDate,
            int numberOfAdults,
            int numberOfChildren,
            int numberOfRooms
    ) {

            List<Map<String, Object>> hotels = listOfHotels();
            List<Map<String, Object>> availableHotels = new ArrayList<>();

            for (Map<String, Object> hotel : hotels) {
                String hotelCity = (String) hotel.get("city");
                String hotelType = (String) hotel.get("typeOfAccommodation");

                int hotelStartDate = (int) hotel.get("startDate");
                int hotelEndDate = (int) hotel.get("endDate");

                int hotelRooms = (int) hotel.get("rooms");

                if (hotelCity.equals(city) &&
                        hotelType.equals(typeOfAccommodation) &&
                        startDate >= hotelStartDate &&
                        endDate <= hotelEndDate &&
                        hotelRooms >= numberOfRooms) {

                    // Cálculo de capacidad
                    int singleRoomCapacity = 2;
                    int doubleRoomCapacity = 4;
                    int quadrupleRoomCapacity = 6;
                    int familyRoomCapacity = 6;

                    int totalCapacity = (singleRoomCapacity * (int) hotel.get("single room")) +
                            (doubleRoomCapacity * (int) hotel.get("double room")) +
                            (quadrupleRoomCapacity * (int) hotel.get("quadruple room")) +
                            (familyRoomCapacity * (int) hotel.get("family room"));

                    hotel.put("capacity", totalCapacity);

                   
                    availableHotels.add(hotel);
                }
            }

            return availableHotels;
        }

    }
}