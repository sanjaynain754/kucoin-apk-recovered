package androidx.collection;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"EmptyIntIntMap", "Landroidx/collection/MutableIntIntMap;", "emptyIntIntMap", "Landroidx/collection/IntIntMap;", "intIntMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntIntMapOf", "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class IntIntMapKt {

    @NotNull
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    @NotNull
    public static final IntIntMap intIntMapOf() {
        return EmptyIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    @NotNull
    public static final IntIntMap emptyIntIntMap() {
        return EmptyIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i11, int i12) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        mutableIntIntMap.set(i19, i21);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        mutableIntIntMap.set(i19, i21);
        return mutableIntIntMap;
    }
}
