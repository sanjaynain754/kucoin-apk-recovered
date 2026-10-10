package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum PaintFromType implements Internal.EnumLite {
    NoPaint(0),
    LandscapePaint(1),
    VerticalPaint(2),
    UNRECOGNIZED(-1);

    public static final int LandscapePaint_VALUE = 1;
    public static final int NoPaint_VALUE = 0;
    public static final int VerticalPaint_VALUE = 2;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<PaintFromType> f22159b = new Internal.EnumLiteMap<PaintFromType>() { // from class: com.kubi.flutter.proto.kline.PaintFromType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PaintFromType findValueByNumber(int i11) {
            return PaintFromType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.PaintFromType$b */
    public static final class C12695b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22161a = new C12695b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (PaintFromType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static PaintFromType forNumber(int i11) {
        if (i11 == 0) {
            return NoPaint;
        }
        if (i11 == 1) {
            return LandscapePaint;
        }
        if (i11 != 2) {
            return null;
        }
        return VerticalPaint;
    }

    public static Internal.EnumLiteMap<PaintFromType> internalGetValueMap() {
        return f22159b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12695b.f22161a;
    }

    @Deprecated
    public static PaintFromType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    PaintFromType(int i11) {
        this.value = i11;
    }
}
