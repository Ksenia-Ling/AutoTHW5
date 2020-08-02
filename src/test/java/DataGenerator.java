import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    public DataGenerator() {
    }

        public static String getCity() {
            String[] cityList = new String[]{
                    "Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Белгород",
                    "Биробиджан", "Благовещенск", "Брянск", "Великий Новгород", "Владивосток",
                    "Владикавказ", "Владимир", "Волгоград", "Вологда", "Воронеж", "Горно-Алтайск",
                    "Грозный", "Екатеринбург", "Иваново", "Ижевск", "Иркутск", "Йошкар-Ола",
                    "Казань", "Калининград", "Калуга", "Кемерово", "Киров", "Кострома", "Краснодар",
                    "Красноярск", "Курган", "Курск", "Кызыл", "Липецк", "Магадан", "Магас", "Майкоп",
                    "Махачкала", "Москва", "Мурманск", "Нальчик", "Нарьян-Мар", "Нижний Новгород",
                    "Новосибирск", "Омск", "Орёл", "Оренбург", "Пенза", "Пермь", "Петрозаводск",
                    "Петропавловск-Камчатский", "Псков", "Ростов-на-Дону", "Рязань", "Салехард",
                    "Самара", "Санкт-Петербург", "Саранск", "Саратов", "Севастополь", "Симферополь",
                    "Смоленск", "Ставрополь", "Сыктывкар", "Тамбов", "Тверь", "Томск", "Тула", "Тюмень",
                    "Улан-Удэ", "Ульяновск", "Уфа", "Хабаровск", "Ханты-Мансийск", "Чебоксары",
                    "Челябинск", "Черкесск", "Чита", "Элиста", "Южно-Сахалинск", "Якутск", "Ярославль"};

            Random random = new Random();
            int index = random.nextInt(cityList.length);
            return cityList[index];
        }

        public static Registration.UserForCardDelivery generate() {
            Faker faker = new Faker(new Locale("ru"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String dateOfFirstMeeting = formatter.format(LocalDate.now().plusDays(5));
            String dateOfSecondMeeting = formatter.format(LocalDate.now().plusDays(7));
            return new Registration.UserForCardDelivery(
                    getCity(),
                    dateOfFirstMeeting,
                    faker.name().lastName(),
                    faker.name().firstName(),
                    faker.phoneNumber().cellPhone(),
                    dateOfSecondMeeting);
        }
    }


