package androidx.collection;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "emptyLongFloatMap", "Landroidx/collection/LongFloatMap;", "longFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongFloatMapOf", "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LongFloatMapKt {

    @NotNull
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    @NotNull
    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    @NotNull
    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14, long j15, float f15) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        mutableLongFloatMap.set(j15, f15);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14, long j15, float f15) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        mutableLongFloatMap.set(j15, f15);
        return mutableLongFloatMap;
    }
}
