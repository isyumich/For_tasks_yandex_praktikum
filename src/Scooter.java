class Scooter {
    int availableScooters;
    int scootersInUse;
    int defaultPrice = 8; // Цена аренды по умолчанию
    int additionalPrice = 5; // Добавочная стоимость при повышенном спросе

    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if (availableScooters <= 0) { // Проверьте, есть ли доступные самокаты
            System.out.println("Нет доступных самокатов.");
        } else {
            int currentPrice = ((scootersInUse + 1) / availableScooters) * additionalPrice + defaultPrice;
            System.out.println("Текущая стоимость проката: " + currentPrice + " руб/мин");
        }
    }

    void rentScooter() {
        if (availableScooters <= 0) { // Проверьте, есть ли доступные самокаты
            System.out.println("Доступных самокатов не осталось.");
        } else {
            int currentPrice = ((++scootersInUse + 1) / availableScooters--) * additionalPrice + defaultPrice;
            System.out.println("Выдайте самокат по цене " + currentPrice + " руб/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }

    void returnScooter() {
        if(scootersInUse <= 0) { // Проверьте, есть ли самокаты в аренде
            System.out.println("Все самокаты уже возвращены.");
        } else {
            scootersInUse -= 1;
            availableScooters +=1;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }
}