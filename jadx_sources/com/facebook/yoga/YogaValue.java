package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c */
    public static final YogaValue f9986c = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* JADX INFO: renamed from: d */
    public static final YogaValue f9987d = new YogaValue(0.0f, YogaUnit.POINT);

    /* JADX INFO: renamed from: e */
    public static final YogaValue f9988e = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* JADX INFO: renamed from: a */
    public final float f9989a;

    /* JADX INFO: renamed from: b */
    public final YogaUnit f9990b;

    public YogaValue(float f11, YogaUnit yogaUnit) {
        this.f9989a = f11;
        this.f9990b = yogaUnit;
    }

    /* JADX INFO: renamed from: com.facebook.yoga.YogaValue$a */
    public static /* synthetic */ class C6261a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9991a;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            f9991a = iArr;
            try {
                iArr[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9991a[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9991a[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9991a[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static YogaValue m10757a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f9986c;
        }
        if ("auto".equals(str)) {
            return f9988e;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT) : new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = this.f9990b;
            if (yogaUnit == yogaValue.f9990b) {
                return yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.f9989a, yogaValue.f9989a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f9989a) + this.f9990b.intValue();
    }

    public String toString() {
        int i11 = C6261a.f9991a[this.f9990b.ordinal()];
        if (i11 == 1) {
            return "undefined";
        }
        if (i11 == 2) {
            return Float.toString(this.f9989a);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f9989a + "%";
    }

    public YogaValue(float f11, int i11) {
        this(f11, YogaUnit.fromInt(i11));
    }
}
