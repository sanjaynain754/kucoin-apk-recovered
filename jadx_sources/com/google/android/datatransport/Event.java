package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i11, T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i11, T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i11, T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.HIGHEST, productData, eventContext);
    }

    @Nullable
    public abstract Integer getCode();

    @Nullable
    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    @Nullable
    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(int i11, T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i11, T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i11, T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(int i11, T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i11, T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i11, T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(int i11, T t11) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i11, T t11) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(int i11, T t11) {
        return new AutoValue_Event(Integer.valueOf(i11), t11, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofData(T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t11, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t11, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t11, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t11, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t11, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t11, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t11, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(T t11) {
        return new AutoValue_Event(null, t11, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t11) {
        return new AutoValue_Event(null, t11, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(T t11) {
        return new AutoValue_Event(null, t11, Priority.HIGHEST, null, null);
    }
}
