package ru.open.cu.student.execution.executors;


/**
 * Исполнитель SELECT-списка — выбирает нужные колонки из строк.
 * Работает поверх дочернего Executor.
 */
public class ProjectExecutor implements Executor {

    @Override
    public void open() {
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void close() {
    }
}
