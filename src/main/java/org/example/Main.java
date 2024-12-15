package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Listar hoteles");
            System.out.println("2. Consultar disponibilidad de fechas, habitaciones y precio");
            System.out.println("3. Confirmar Habitaciones");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> printDetailsHotels();
                case 2 -> {
                    System.out.println("Para ver la disponibilidad de hoteles ingresa los siguientes datos: ");
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

                    searchAvailableAccommodations(city, typeOfAccommodation, startDate, endDate, numbersAdults, numbersChildrens, numberOfRooms);

                }
                case 3 -> {
                    System.out.println("Para confirmar habitaciones, introduce los siguientes datos: ");
                    scanner.nextLine();

                    System.out.println("Nombre del hotel: ");
                    String hotelName = scanner.nextLine().toLowerCase();

                    System.out.println("Fecha de Ingreso en formato yyyyMMdd:");
                    int checkIn = scanner.nextInt();

                    System.out.println("Fecha de salida en formato yyyyMMdd:");
                    int checkOut = scanner.nextInt();

                    System.out.println("cantidad de Adultos:");
                    int numbersAdults = scanner.nextInt();

                    System.out.println("cantidad de Niños:");
                    int numbersChildrens = scanner.nextInt();

                    System.out.println("cantidad de Habitaciones:");
                    int roomsRequested = scanner.nextInt();

                    System.out.println(hotelName);
                    System.out.println(checkIn);
                    System.out.println(checkOut);
                    System.out.println(numbersAdults);
                    System.out.println(numbersChildrens);
                    System.out.println(roomsRequested);


                    confirmRooms(hotelName, checkIn, checkOut, numbersAdults, numbersChildrens, roomsRequested);
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
            if (hotel instanceof Object[] hotelData) {

                System.out.println("***********************************");
                System.out.println("Nombre del hotel: " + hotelData[0]);
                System.out.println("Calificación: " + hotelData[1]);
                System.out.println("Ciudad: " + hotelData[2]);
                System.out.println("Descripción: " + hotelData[3]);
                System.out.println("Disponibilidad a partir de: " + hotelData[4]);
                System.out.println("Disponibilidad hasta: " + hotelData[5]);
                System.out.println("Precio: $" + hotelData[6]);
                System.out.println("Habitaciones disponibles: " + hotelData[7]);

                if (hotelData.length > 8) {  // Verificación para asegurar que el tipo de alojamiento exista
                    System.out.println("Tipo de alojamiento: " + hotelData[8]);
                }

                // Tipos de habitaciones
                if (hotelData.length > 9) {  // Verificación para tipos de habitaciones
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
                }
                System.out.println("***********************************");
            }
        }
    }


    public static Object[] listOfHotels() {
        Object[] hotels = new Object[6];
        hotels[0] = new Object[]{
                "Hotel Castillo Resort",
                4.5,
                "San Gil",
                "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park...",
                20241215,
                20250130,
                50.0,
                16,
                "hotel",
                new Object[]{
                        new Object[]{"single room", 1, 50.0, "cama individual, aire acondicionado, baño privado"},
                        new Object[]{"double room", 4, 80.0, "2 camas dobles, vista a la piscina, aire acondicionado, baño privado"},
                        new Object[]{"quadruple room", 4, 100.0, "4 camas, vista al jardín, aire acondicionado, baño privado, minibar"},
                        new Object[]{"family room", 8, 120.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                        new Object[]{"suite", 2, 150.0, "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado"}
                },
                new Object[]{
                        new Object[]{"Estadía por noche", 50.0, "Habitación equipada con servicios básicos como Wi-Fi, aire acondicionado, baño privado."},
                        new Object[]{"Estadía por fines de semana", 250.0, "Ofrece servicios como desayuno buffet, acceso a piscina y uso de áreas comunes."},
                        new Object[]{"Dia de sol", 50.0, "Acceso por un día con servicios básicos y acceso a áreas comunes."}
                }
        };

        hotels[1] = new Object[]{
                "Meson del Cuchicute",
                4.3,
                "San Gil, Santander",
                "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.",
                20250115,
                20250130,
                60.0,
                13,
                "hotel",
                new Object[]{
                        new Object[]{"single room", 1, 60.0, "cama individual, baño privado, aire acondicionado"},
                        new Object[]{"double room", 4, 100.0, "2 camas dobles, vista al jardín, aire acondicionado, baño privado"},
                        new Object[]{"quadruple room", 4, 150.0, "4 camas, aire acondicionado, baño privado, minibar"},
                        new Object[]{"family room", 8, 180.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                        new Object[]{"suite", 2, 200.0, "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado"}
                },
                new Object[]{
                        new Object[]{"Estadía por noche", 140.0, "Acceso a habitaciones con minibar, room service, piscina y Wifi gratuito."},
                        new Object[]{"Estadía por fines de semana", 320.0, "Incluye desayuno, servicio de bar y acceso a todas las instalaciones."},
                        new Object[]{"Dia de sol", 60.0, "Uso de piscina, zona de camping y áreas comunes durante el día."}
                }
        };

        hotels[2] = new Object[]{
                "Finca Sol y Luna",
                4.3,
                "San Gil",
                "Finca Sol y Luna se encuentra en San Gil, en la región de Santander, a 47 km de Chicamocha National Park. Ofrece alojamiento con wifi gratis, zona de barbacoa, piscina al aire libre y parking privado gratis.",
                20250201,
                20250320,
                30.0,
                5,
                "finca",
                new Object[]{
                        new Object[]{"single room", 1, 30.0, "cama individual, baño privado, aire acondicionado"},
                        new Object[]{"double room", 4, 50.0, "2 camas dobles, aire acondicionado, baño privado, vista al jardín"},
                        new Object[]{"quadruple room", 4, 80.0, "4 camas, baño privado, aire acondicionado, vista al campo"},
                        new Object[]{"family room", 8, 100.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                        new Object[]{"matrimonial", 2, 120.0, "cama matrimonial, baño privado, aire acondicionado"}
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
                20241215,
                20250110,
                117.0,
                4,
                "apartamento",
                new Object[]{
                        new Object[]{"single room", 1, 12.0, "cama individual, baño privado, aire acondicionado"},
                        new Object[]{"double room", 4, 22.0, "2 camas dobles, aire acondicionado, baño privado, vista al mar"},
                        new Object[]{"matrimonial", 2, 18.0, "cama matrimonial, aire acondicionado, baño privado, TV de pantalla plana"},
                        new Object[]{"suite", 0, 0, "cama king size, sala de estar, aire acondicionado, jacuzzi, baño privado"},
                        new Object[]{"family room", 0, 0, "4 camas matrimoniales, aire acondicionado, baño privado, minibar"}
                },
                new Object[]{
                        new Object[]{"Estadía por noche", 117.0, "Habitación amueblada con cocina equipada, Wi-Fi y baño privado."},
                        new Object[]{"Estadía por fines de semana", 190.0, "Incluye acceso a áreas comunes, desayuno y servicio de limpieza."},
                        new Object[]{"Pasadía", 30.0, "Acceso al apartamento por un día sin servicios adicionales."}
                }
        };

        hotels[4] = new Object[]{
                "Aptahotel Guest House",
                4.5,
                "san gil",
                "Aptahotel Guest House está en San Gil, a 41 km de Chicamocha National Park y a 41 km de Chicamocha Water Park.",
                20250110,
                20250115,
                138.0,
                4,
                "apartamento",
                new Object[]{
                        new Object[]{"single room", 1, 15.0, "cama individual, baño privado, aire acondicionado"},
                        new Object[]{"double room", 4, 28.0, "2 camas dobles, aire acondicionado, baño privado"},
                        new Object[]{"matrimonial", 2, 20.0, "cama matrimonial, aire acondicionado, baño privado"},
                        new Object[]{"suite", 0, 45.0, "cama king size, aire acondicionado, sala de estar, baño privado"},
                        new Object[]{"family room", 0, 30.0, "4 camas matrimoniales, aire acondicionado, baño privado, vista al campo"}
                },
                new Object[]{
                        new Object[]{"Estadía por noche", 138.0, "Uso de Wi-Fi, acceso a zonas comunes y desayuno incluido."},
                        new Object[]{"Estadía por fines de semana", 240.0, "Acceso completo al hotel con desayuno y servicios adicionales."},
                        new Object[]{"dia de sol", 35.0, "Disfrute de las instalaciones durante el día."}
                }
        };
        hotels[5] = new Object[]{
                "Mesón del Cuchicute",
                4.3,
                "San Gil, Santander",
                "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping, TV por cable, cajillas de seguridad, mini bar, Wifi, room service, restaurante, taberna, bar, piscinas.",
                20241220,
                20241230,
                60.0,
                13,
                "dia de sol",
                new Object[]{
                        new Object[]{"single room", 1, 60.0, "cama individual, baño privado, aire acondicionado"},
                        new Object[]{"double room", 4, 100.0, "2 camas dobles, vista al jardín, aire acondicionado, baño privado"},
                        new Object[]{"quadruple room", 4, 150.0, "4 camas, aire acondicionado, baño privado, minibar"},
                        new Object[]{"family room", 8, 180.0, "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado"},
                        new Object[]{"suite", 2, 200.0, "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado"}
                },
                new Object[]{
                        new Object[]{"Estadía por noche", 140.0, "Acceso a habitaciones con minibar, room service, piscina y Wifi gratuito."},
                        new Object[]{"Estadía por fines de semana", 320.0, "Incluye desayuno, servicio de bar y acceso a todas las instalaciones."},
                        new Object[]{"Dia de sol", 60.0, "Uso de piscina, zona de camping y áreas comunes durante el día."}
                }
        };

        return hotels;
    }

    public static double calculateAdjustment(int startDate, int endDate, double totalPrice) {
        // últimos dos dígitos para el día de inicio
        int start = startDate % 100;
        //  últimos dos dígitos para el día de fin
        int end = endDate % 100;

        double adjustment;
        if (start >= 26) {
            // Sube el precio 15%
            adjustment = totalPrice * 1.15;
        } else if (start >= 10 && end <= 15) {
            // Sube el precio 10%
            adjustment = totalPrice * 1.10;
        } else if (start >= 5 && end <= 10) {
            // Baja el precio 8%
            adjustment = totalPrice * 0.92;
        } else {
            // Sin cambios si no aplica ninguna regla
            adjustment = totalPrice;
        }

        return adjustment;
    }

    private static Map<String, Integer> createRoomMap(Object hotel) {
        Map<String, Integer> roomMap = new HashMap<>();
        if (hotel instanceof Object[] roomDetails) {
            for (Object roomDetail : roomDetails) {
                if (roomDetail instanceof Object[] room) {
                    if (room.length >= 2) {
                        Object roomType = room[0];
                        Object roomCount = room[1];

                        // Validación antes de convertir
                        if (roomType instanceof String && roomCount instanceof Integer) {
                            roomMap.put((String) roomType, (Integer) roomCount);
                        }
                    }
                }
            }
        }
        return roomMap;
    }

    public static List<Object[]> searchAvailableAccommodations(
            String city,
            String typeOfAccommodation,
            int startDate,
            int endDate,
            int numberOfAdults,
            int numberOfChildren,
            int numberOfRooms
    ) {
        Object[] hotels = listOfHotels();
        List<Object[]> availableHotels = new ArrayList<>();

        for (Object hotel : hotels) {
            if (hotel instanceof Object[] hotelData) {
                String hotelCity = ((String) hotelData[2]).toLowerCase();
                int hotelStartDate = (int) hotelData[4];
                int hotelEndDate = (int) hotelData[5];
                String hotelType = ((String) hotelData[8]).toLowerCase();
                double basePrice = (double) hotelData[6];


                if (hotelCity.contains(city.toLowerCase()) && hotelType.equals(typeOfAccommodation)) {
                    if ("dia de sol".equals(hotelType)) {
                        // Extraer servicios específicos para "día de sol"
                        Object[] dayPassInfo = (Object[]) hotelData[10]; // Servicios de "día de sol"
                        for (Object service : dayPassInfo) {
                            if (service instanceof Object[] serviceData) {
                                String serviceName = (String) serviceData[0];
                                if ("Dia de sol".equalsIgnoreCase(serviceName)) {
                                    double servicePrice = (double) serviceData[1];
                                    String serviceDescription = (String) serviceData[2];

                                    // Construir la información para el resultado
                                    Object[] hotelInfo = new Object[4];
                                    hotelInfo[0] = hotelData[0];
                                    hotelInfo[1] = serviceName;
                                    hotelInfo[2] = serviceDescription;
                                    hotelInfo[3] = servicePrice;

                                    availableHotels.add(hotelInfo);
                                }
                            }
                        }
                    } else {
                        // Lógica para otros tipos de alojamiento
                        int availableRooms = (int) hotelData[7];

                        if (availableRooms >= numberOfRooms &&
                                startDate <= hotelEndDate && endDate >= hotelStartDate) {

                            Map<String, Integer> roomMap = createRoomMap(hotelData[9]);
                            int totalCapacity = 0;

                            for (Integer capacity : roomMap.values()) {
                                totalCapacity += capacity;
                            }

                            if (totalCapacity >= (numberOfAdults + numberOfChildren)) {
                                int totalDays = calculateDays(startDate, endDate) + 1;
                                double totalPrice = basePrice * totalDays * numberOfRooms;
                                double adjustment = calculateAdjustment(startDate, endDate, totalPrice);

                                Object[] hotelInfo = new Object[10];
                                hotelInfo[0] = hotelData[0];
                                hotelInfo[1] = hotelData[1];
                                hotelInfo[2] = hotelData[3];
                                hotelInfo[3] = hotelCity;
                                hotelInfo[4] = numberOfRooms;
                                hotelInfo[5] = availableRooms;
                                hotelInfo[6] = roomMap;
                                hotelInfo[7] = basePrice;
                                hotelInfo[8] = adjustment;
                                hotelInfo[9] = adjustment;

                                availableHotels.add(hotelInfo);
                            }
                        }
                    }
                }
            }
        }

        if (availableHotels.isEmpty()) {
            System.out.println("No hay hoteles disponibles para los criterios proporcionados.");
        } else {
            for (Object[] hotel : availableHotels) {
                if (hotel.length == 4) { // Día de sol
                    System.out.println("************** Hoteles disponibles **********************");
                    System.out.println("Nombre " + hotel[0] +
                            ", Servicio: " + hotel[1] +
                            ", Descripción: " + hotel[2] +
                            ", Precio: " + hotel[3]);
                    System.out.println("****************************************************");
                } else { // Otros alojamientos
                    System.out.println("************** Hoteles disponibles **********************");
                    System.out.println("Nombre: " + hotel[0] +
                            ", Calificación: " + hotel[1] +
                            ", Precio por noche: " + hotel[7] +
                            ", Precio total: " + hotel[9]);
                    System.out.println("****************************************************");
                }
            }
        }

        return availableHotels;
    }


    public static int calculateDays(int startDate, int endDate) {
        // Extraer los componentes de la fecha
        int startYear = startDate / 10000;
        int startMonth = (startDate % 10000) / 100;
        int startDay = startDate % 100;

        int endYear = endDate / 10000;
        int endMonth = (endDate % 10000) / 100;
        int endDay = endDate % 100;

        // Convertir las fechas a días desde un punto común (ejemplo: día 0)
        int startDays = convertToDays(startYear, startMonth, startDay);
        int endDays = convertToDays(endYear, endMonth, endDay);

        // Calcular la diferencia en días
        return endDays - startDays;
    }

    private static int convertToDays(int year, int month, int day) {
        int daysMonth = 30;
        return year * 365 + month * daysMonth + day;
    }
    public static String confirmRooms(String hotelName, int checkIn, int checkOut, int numbersAdults, int numbersChildrens, int roomsRequested) {

        Object[] allHotels = listOfHotels();
        Object[] selectedHotel = null;

        hotelName = hotelName.trim().toLowerCase();

        for (Object hotel : allHotels) {
            Object[] hotelDetails = (Object[]) hotel;

            if (hotelDetails[0].toString().toLowerCase().equals(hotelName)) {
                selectedHotel = hotelDetails;
                break;
            }
        }

        if (selectedHotel == null) {
            return "Hotel no encontrado";
        }

        int hotelStartDate = (int) selectedHotel[4];
        int hotelEndDate = (int) selectedHotel[5];
        int availableRooms = (int) selectedHotel[7];

        if (checkIn < hotelStartDate || checkOut > hotelEndDate) {
            return "Las fechas están fuera del rango de disponibilidad del hotel.";
        }

        Object[] rooms = (Object[]) selectedHotel[9];
        System.out.println("****************** Confirmación de Habitaciones **********************");

        for (Object room : rooms) {
            Object[] roomDetails = (Object[]) room;

            int roomCapacity = (int) roomDetails[1]; // Capacidad de la habitación
            int totalCapacityNeeded = numbersAdults + numbersChildrens;

            if (roomCapacity >= totalCapacityNeeded) {
                System.out.println("Tipo de habitación: " + roomDetails[0]);
                System.out.println("Características: " + roomDetails[3]);
                System.out.println("Precio por noche: " + roomDetails[2]);
                System.out.println();
            }
        }

        if (roomsRequested <= availableRooms) {
            System.out.println("Cantidad " + roomsRequested + " habitaciones.");
            System.out.println("Ingreso: " + hotelStartDate);
            System.out.println("Salida: " + hotelEndDate);
            System.out.println("Para: " + (numbersAdults + numbersChildrens) + " personas.");
            System.out.println("***********************************************************************");
            return "Habitación(s) confirmada(s) con éxito.";
        } else {
            System.out.println("No hay suficiente disponibilidad de habitaciones.");
            return "No hay suficiente disponibilidad de habitaciones.";
        }
    }


}
