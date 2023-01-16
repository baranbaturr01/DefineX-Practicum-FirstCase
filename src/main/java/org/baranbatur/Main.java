package org.baranbatur;

public class Main {
    public static void main(String[] args) {

        RealEstateList realEstateList = new RealEstateList();

        System.out.println("Houses: " + realEstateList.getHouses());
        System.out.println("Villas: " + realEstateList.getVillas());
        System.out.println("Summer houses: " + realEstateList.getSummerHouses());

        System.out.println("Houses price: " + realEstateList.getHousesPrice());
        System.out.println("Villas price: " + realEstateList.getVillasPrice());
        System.out.println("Summer houses price: " + realEstateList.getSummerHousesPrice());


        System.out.println("Real estate price: " + realEstateList.getRealEstatePrice());

        System.out.println("Average size of house: " + realEstateList.getAverageSizeHouse());
        System.out.println("Average size of villa: " + realEstateList.getAverageSizeVilla());
        System.out.println("Average size of summer house: " + realEstateList.getAverageSizeSummerHouse());
        System.out.println("Average size of real estate: " + realEstateList.getAverageSizeRealEstate());


//    getHouses by rooms and livingRoom getHousesByRoomAndLivingRoomCount
//    getHouses by rooms and livingRoom getHousesByRoomAndLivingRoomCount

        System.out.println("Houses by rooms(3) and livingRoom(1): " + realEstateList.getHousesByRoomAndLivingRoomCount(3, 1));
        System.out.println("Houses by rooms(4) and livingRoom(2): " + realEstateList.getHousesByRoomAndLivingRoomCount(4, 2));
        System.out.println("Houses by rooms(5) and livingRoom(3): " + realEstateList.getHousesByRoomAndLivingRoomCount(5, 3));

        System.out.println("Villas by rooms(3) and livingRoom(1): " + realEstateList.getVillasByRoomAndLivingRoomCount(3, 1));
        System.out.println("Villas by rooms(4) and livingRoom(2): " + realEstateList.getVillasByRoomAndLivingRoomCount(4, 2));
        System.out.println("Villas by rooms(5) and livingRoom(3): " + realEstateList.getVillasByRoomAndLivingRoomCount(5, 3));

        System.out.println("Summer houses by rooms(3) and livingRoom(1): " + realEstateList.getSummerHousesByRoomAndLivingRoomCount(3, 1));
        System.out.println("Summer houses by rooms(4) and livingRoom(2): " + realEstateList.getSummerHousesByRoomAndLivingRoomCount(4, 2));
        System.out.println("Summer houses by rooms(5) and livingRoom(3): " + realEstateList.getSummerHousesByRoomAndLivingRoomCount(5, 3));
    }
}