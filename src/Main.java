public class Main {
    public static void main(String[] args) {

        int base = 100; //начальная сумма у клиента
        int replenish = 1100; //клиент пополнил счет на эту сумму
        int amount = base + replenish;//итоговая сумма после пополнения
        if (amount > 1000){
            amount = replenish / 100 + amount;
            System.out.println("Количество бонусов составляет: " + replenish / 100 + " рублей." + "Итоговая сумма составляет: " + amount + " рублей.");
        } else {
            System.out.println("Итоговая сумма без бонусов составляет: " + amount + " рублей");

        }

    }
}