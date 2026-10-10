package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public long time() {
        return this.time;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (ObjectHelper.equals(this.value, timed.value) && this.time == timed.time && ObjectHelper.equals(this.unit, timed.unit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.value;
        int iHashCode = t11 != null ? t11.hashCode() : 0;
        long j11 = this.time;
        return (((iHashCode * 31) + ((int) (j11 ^ (j11 >>> 31)))) * 31) + this.unit.hashCode();
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }

    public String toString() {
        return "Timed[time=" + this.time + ", unit=" + this.unit + ", value=" + this.value + "]";
    }

    @NonNull
    public TimeUnit unit() {
        return this.unit;
    }

    @NonNull
    public T value() {
        return this.value;
    }

    public Timed(@NonNull T t11, long j11, @NonNull TimeUnit timeUnit) {
        this.value = t11;
        this.time = j11;
        this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }
}
