package org.baranbatur;

import java.util.ArrayList;
import java.util.List;

public class RealEstateList {

    private List<House> houses = new ArrayList<>();
    private List<Villa> villas = new ArrayList<>();
    private List<SummerHouse> summerHouses = new ArrayList<>();

    public RealEstateList() {

        houses.add(new House("Kungsgatan 1", 1000000, 100, 1, 3));
        houses.add(new House("Kungsgatan 2", 2000000, 200, 2, 4));
        houses.add(new House("Kungsgatan 3", 3000000, 300, 3, 5));

        villas.add(new Villa("Kungsgatan 4", 4000000, 400, 4, 6));
        villas.add(new Villa("Kungsgatan 5", 5000000, 500, 5, 7));
        villas.add(new Villa("Kungsgatan 6", 6000000, 600, 6, 8));

        summerHouses.add(new SummerHouse("Kungsgatan 7", 7000000, 700, 7, 9));
        summerHouses.add(new SummerHouse("Kungsgatan 8", 8000000, 800, 8, 10));
        summerHouses.add(new SummerHouse("Kungsgatan 9", 9000000, 900, 9, 11));

    }

    public List<House> getHouses() {
        return houses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public int getHousesPrice() {
        int sum = 0;
        for (House house : houses) {
            sum += house.getPrice();
        }
        return sum;
    }

    public int getVillasPrice() {
        int sum = 0;
        for (Villa villa : villas) {
            sum += villa.getPrice();
        }
        return sum;
    }

    public int getSummerHousesPrice() {
        int sum = 0;
        for (SummerHouse summerHouse : summerHouses) {
            sum += summerHouse.getPrice();
        }
        return sum;
    }

    public int getRealEstatePrice() {
        return getHousesPrice() + getVillasPrice() + getSummerHousesPrice();
    }

    public double getAverageSizeHouse() {
        int sum = 0;
        for (House house : houses) {
            sum += house.getSize();
        }
        return sum / houses.size();
    }

    public double getAverageSizeVilla() {
        int sum = 0;
        for (Villa villa : villas) {
            sum += villa.getSize();
        }
        return sum / villas.size();
    }

    public double getAverageSizeSummerHouse() {
        int sum = 0;
        for (SummerHouse summerHouse : summerHouses) {
            sum += summerHouse.getSize();
        }
        return sum / summerHouses.size();
    }

    public double getAverageSizeRealEstate() {
        return (getAverageSizeHouse() + getAverageSizeVilla() + getAverageSizeSummerHouse()) / 3;
    }


    //    get all houses filterd by room and livingroom count
    public List<House> getHousesByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == roomCount && house.getLivingRoom() == livingRoomCount) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public List<Villa> getVillasByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<Villa> filteredVillas = new ArrayList<>();
        for (Villa villa : villas) {
            if (villa.getNumberOfRooms() == roomCount && villa.getLivingRoom() == livingRoomCount) {
                filteredVillas.add(villa);
            }
        }
        return filteredVillas;
    }

    public List<SummerHouse> getSummerHousesByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<SummerHouse> filteredSummerHouses = new ArrayList<>();
        for (SummerHouse summerHouse : summerHouses) {
            if (summerHouse.getNumberOfRooms() == roomCount && summerHouse.getLivingRoom() == livingRoomCount) {
                filteredSummerHouses.add(summerHouse);
            }
        }
        return filteredSummerHouses;
    }

    public List<House> getHousesByRoomCount(int roomCount) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == roomCount) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public List<Villa> getVillasByRoomCount(int roomCount) {
        List<Villa> filteredVillas = new ArrayList<>();
        for (Villa villa : villas) {
            if (villa.getNumberOfRooms() == roomCount) {
                filteredVillas.add(villa);
            }
        }
        return filteredVillas;
    }

    public List<SummerHouse> getSummerHousesByRoomCount(int roomCount) {
        List<SummerHouse> filteredSummerHouses = new ArrayList<>();
        for (SummerHouse summerHouse : summerHouses) {
            if (summerHouse.getNumberOfRooms() == roomCount) {
                filteredSummerHouses.add(summerHouse);
            }
        }
        return filteredSummerHouses;
    }

}
