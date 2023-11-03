package ru.skypro.homework.exceptions;

/**
 * Класс представляет собой исключение, которое выбрасывается при попытке доступа к ресурсу,
 * к которому у пользователя нет необходимых прав доступа.
 *
 * <p>Это исключение может быть использовано для обработки ситуации, когда пользователь пытается выполнить
 * операцию, к которой у него нет прав доступа. Оно может быть перехвачено и обработано в обработчиках исключений
 * для отправки соответствующего HTTP-ответа клиенту.
 *
 * @see RuntimeException
 */
public class FindNoEntityException extends RuntimeException{

    /**
     * Конструктор класса принимает сообщение об ошибке и передает его в конструктор
     * суперкласса {@code RuntimeException}
     *
     * @param message сообщение об ошибке
     */
    public FindNoEntityException(String message) {
        super(message);
    }
}
