package p852kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes61.dex */
class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }

    public SingleThreadValue(T t11) {
        this.value = t11;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
