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

        Object[] hotels = listOfHotels();

        for (Object hotel : hotels) {
            if (hotel instanceof Object[]) {
                Object[] hotelData = (Object[]) hotel;

                System.out.println("***********************************");
                System.out.println("Nombre del hotel: " + hotelData[0]);
                System.out.println("Calificación: " + hotelData[1]);
                System.out.println("Ciudad: " + hotelData[2]);
                System.out.println("Descripción: " + hotelData[3]);
                System.out.println("Disponibilidad a partir de: " + hotelData[4]);
                System.out.println("Disponibilidad hasta: " + hotelData[5]);
                System.out.println("Precio: $" + hotelData[6]);
                System.out.println("Habitaciones disponibles: " + hotelData[7]);
                System.out.println("***********************************");
                System.out.println("Nombre del hotel: " + hotelData[0]);
                System.out.println("Calificación: " + hotelData[1]);
                System.out.println("Ciudad: " + hotelData[2]);
                System.out.println("Descripción: " + hotelData[3]);
                System.out.println("Disponibilidad a partir de: " + hotelData[4]);
                System.out.println("Disponibilidad hasta: " + hotelData[5]);
                System.out.println("Precio base: $" + hotelData[6]);
                System.out.println("Habitaciones disponibles: " + hotelData[7]);
                System.out.println("Tipo de alojamiento: " + hotelData[8]);

                // Tipos de habitaciones
                System.out.println("Tipos de alojamiento:");
                Object[] roomTypes = (Object[]) hotelData[9];
                for (Object room : roomTypes) {
                    if (room instanceof Object[] roomData) {
                        System.out.println("  - Tipo: " + roomData[0]);
                        System.out.println("    Capacidad: " + roomData[1] + " personas");
                        System.out.println("    Precio adicional: $" + roomData[2]);
                        System.out.println("    Descripción: " + roomData[3]);
                    }
                }

                System.out.println("***********************************");
            }
        }
    }

        public static Object[] listOfHotels() {
            Object[] hotels = new Object[5];
            hotels[0] = new Object[]{
                    "Hotel Castillo Resort",
                    4.5,
                    "San Gil",
                    "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park...",
                    "2024-12-15",
                    "2025-01-30",
                    60.0,
                    16,
                    "Hotel",
                    new Object[]{
                            new Object[]{"single room", 2, 10.0, "cama individual, aire acondicionado, baño privado"},
                            new Object[]{"double room", 6, 25.0, "2 camas dobles, vista a la piscina, aire acondicionado, baño privado"},
                            new Object[]{"quadruple room", 1, 40.0, "4 camas, vista al jardín, aire acondicionado, baño privado, minibar"},
                            new Object[]{"family room", 5, 35.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                            new Object[]{"suite", 3, 50.0, "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado"}
                    },
                    new Object[]{
                            new Object[]{"Estadía por noche", 150.0, "Habitación equipada con servicios básicos como Wi-Fi, aire acondicionado, baño privado."},
                            new Object[]{"Estadía por fines de semana", 350.0, "Ofrece servicios como desayuno buffet, acceso a piscina y uso de áreas comunes."},
                            new Object[]{"Pasadía", 50.0, "Acceso por un día con servicios básicos y acceso a áreas comunes."}
                    }
            };

            hotels[1] = new Object[]{
                    "Mesón del Cuchicute",
                    4.3,
                    "San Gil, Santander",
                    "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.",
                    "2025-01-15",
                    "2025-01-30",
                    150.0,
                    13,
                    "Hotel",
                    new Object[]{
                            new Object[]{"single room", 3, 20.0, "cama individual, baño privado, aire acondicionado"},
                            new Object[]{"double room", 5, 30.0, "2 camas dobles, vista al jardín, aire acondicionado, baño privado"},
                            new Object[]{"quadruple room", 2, 50.0, "4 camas, aire acondicionado, baño privado, minibar"},
                            new Object[]{"family room", 3, 45.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                            new Object[]{"suite", 2, 60.0, "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado"}
                    },
                    new Object[]{
                            new Object[]{"Estadía por noche", 140.0, "Acceso a habitaciones con minibar, room service, piscina y Wifi gratuito."},
                            new Object[]{"Estadía por fines de semana", 320.0, "Incluye desayuno, servicio de bar y acceso a todas las instalaciones."},
                            new Object[]{"Pasadía", 60.0, "Uso de piscina, zona de camping y áreas comunes durante el día."}
                    }
            };

            hotels[2] = new Object[]{
                    "Finca Sol y Luna",
                    4.3,
                    "San Gil",
                    "Finca Sol y Luna se encuentra en San Gil, en la región de Santander, a 47 km de Chicamocha National Park. Ofrece alojamiento con wifi gratis, zona de barbacoa, piscina al aire libre y parking privado gratis.",
                    "2025-02-01",
                    "2025-03-20",
                    350.0,
                    5,
                    "Finca",
                    new Object[]{
                            new Object[]{"single room", 1, 15.0, "cama individual, baño privado, aire acondicionado"},
                            new Object[]{"double room", 2, 25.0, "2 camas dobles, aire acondicionado, baño privado, vista al jardín"},
                            new Object[]{"quadruple room", 1, 45.0, "4 camas, baño privado, aire acondicionado, vista al campo"},
                            new Object[]{"family room", 1, 35.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                            new Object[]{"matrimonial", 1, 20.0, "cama matrimonial, baño privado, aire acondicionado"}
                    },
                    new Object[]{
                            new Object[]{"Estadía por noche", 120.0, "Incluye barbacoa, Wifi, piscina y desayuno continental."},
                            new Object[]{"Estadía por fines de semana", 280.0, "Acceso completo a todas las instalaciones, desayuno buffet y zona de barbacoa."},
                            new Object[]{"Pasadía", 40.0, "Uso de piscina, barbacoa y zona de picnic."}
                    }
            };

            hotels[3] = new Object[]{
                    "Hermoso Apto - C.C San Gil Plaza",
                    4.6,
                    "San Gil",
                    "Hermoso Apto - C.C San Gil Plaza está en San Gil, dispone de vistas a la ciudad y wifi gratis.",
                    "2024-12-15",
                    "2025-01-10",
                    70.0,
                    4,
                    "Apartamento",
                    new Object[]{
                            new Object[]{"single room", 1, 12.0, "cama individual, baño privado, aire acondicionado"},
                            new Object[]{"double room", 2, 22.0, "2 camas dobles, aire acondicionado, baño privado, vista al mar"},
                            new Object[]{"matrimonial", 1, 18.0, "cama matrimonial, aire acondicionado, baño privado, TV de pantalla plana"},
                            new Object[]{"suite", 0, 40.0, "cama king size, sala de estar, aire acondicionado, jacuzzi, baño privado"},
                            new Object[]{"family room", 0, 25.0, "4 camas matrimoniales, aire acondicionado, baño privado, minibar"}
                    },
                    new Object[]{
                            new Object[]{"Estadía por noche", 80.0, "Habitación amueblada con cocina equipada, Wi-Fi y baño privado."},
                            new Object[]{"Estadía por fines de semana", 190.0, "Incluye acceso a áreas comunes, desayuno y servicio de limpieza."},
                            new Object[]{"Pasadía", 30.0, "Acceso al apartamento por un día sin servicios adicionales."}
                    }
            };

            hotels[4] = new Object[]{
                    "Aptahotel Guest House",
                    4.5,
                    "San Gil",
                    "Aptahotel Guest House está en San Gil, a 41 km de Chicamocha National Park y a 41 km de Chicamocha Water Park.",
                    "2025-01-10",
                    "2025-01-15",
                    90.0,
                    4,
                    "Apartamento",
                    new Object[]{
                            new Object[]{"single room", 1, 15.0, "cama individual, baño privado, aire acondicionado"},
                            new Object[]{"double room", 2, 28.0, "2 camas dobles, aire acondicionado, baño privado"},
                            new Object[]{"matrimonial", 1, 20.0, "cama matrimonial, aire acondicionado, baño privado"},
                            new Object[]{"suite", 0, 45.0, "cama king size, aire acondicionado, sala de estar, baño privado"},
                            new Object[]{"family room", 0, 30.0, "4 camas matrimoniales, aire acondicionado, baño privado, vista al campo"}
                    },
                    new Object[]{
                            new Object[]{"Estadía por noche", 100.0, "Uso de Wi-Fi, acceso a zonas comunes y desayuno incluido."},
                            new Object[]{"Estadía por fines de semana", 240.0, "Acceso completo al hotel con desayuno y servicios adicionales."},
                            new Object[]{"Pasadía", 35.0, "Disfrute de las instalaciones durante el día."}
                    }
            };

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

        Object[] hotelsWithDetails = listOfHotels();

        List<Map<String, Object>> availableHotels = new ArrayList<>();

        for (Object hotelObj : hotelsWithDetails) {
            Object[] hotel = (Object[]) hotelObj;

            String hotelName = (String) hotel[0];
            double hotelRating = (double) hotel[1];
            String hotelCity = (String) hotel[2];
            String hotelDescription = (String) hotel[3];
            int[] dateRange = (int[]) hotel[4];
            int totalRooms = (int) hotel[5];
            int availableRooms = (int) hotel[6];
            Object[] roomDetails = (Object[]) hotel[7];

            if (hotelCity != null && hotelCity.equalsIgnoreCase(city) &&
                    typeOfAccommodation != null && typeOfAccommodation.equalsIgnoreCase(typeOfAccommodation) &&
                    startDate >= dateRange[0] && endDate <= dateRange[1]) {

                Map<String, Integer> roomMap = new HashMap<>();
                for (Object roomDetail : roomDetails) {
                    Object[] room = (Object[]) roomDetail;
                    String roomType = (String) room[0];
                    int roomCount = (int) room[1];
                    double roomPrice = (double) room[2];
                    roomMap.put(roomType, roomCount);
                }

                int totalCapacity =
                        roomMap.getOrDefault("single room", 0) +
                                roomMap.getOrDefault("double room", 0) +
                                roomMap.getOrDefault("matrimonial", 0) +
                                roomMap.getOrDefault("suite", 0) +
                                roomMap.getOrDefault("family room", 0);

                if (totalCapacity >= (numberOfAdults + numberOfChildren) &&
                        availableRooms >= numberOfRooms) {

                    Map<String, Object> hotelInfo = new HashMap<>();
                    hotelInfo.put("name", hotelName);
                    hotelInfo.put("rating", hotelRating);
                    hotelInfo.put("description", hotelDescription);
                    hotelInfo.put("city", hotelCity);
                    hotelInfo.put("totalRooms", totalRooms);
                    hotelInfo.put("availableRooms", availableRooms);
                    hotelInfo.put("roomDetails", roomMap);

                    availableHotels.add(hotelInfo);
                }
            }
        }

        // Imprimir los hoteles disponibles
        if (availableHotels.isEmpty()) {
            System.out.println("No hay hoteles disponibles para los criterios proporcionados.");
        } else {
            for (Map<String, Object> availableHotel : availableHotels) {
                System.out.println("Hotel disponible: " + availableHotel.get("name") + ", Precio total: " + availableHotel.get("totalPrice"));
            }
        }
        return availableHotels;
    }



}