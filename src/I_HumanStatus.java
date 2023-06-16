/**
 * Интерфейс I_HumanStatus должен показать, находится ли объект класса Human в очереди.
 */
@FunctionalInterface
public interface I_HumanStatus<T extends Human> {
    void inQueue(T t);
}
