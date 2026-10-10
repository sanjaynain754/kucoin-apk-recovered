package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33789m5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
public class SVGLength {

    /* JADX INFO: renamed from: a */
    public final double f13063a;

    /* JADX INFO: renamed from: b */
    public final UnitType f13064b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    public SVGLength() {
        this.f13063a = 0.0d;
        this.f13064b = UnitType.UNKNOWN;
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SVGLength$a */
    public static /* synthetic */ class C9195a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13071a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f13071a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13071a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13071a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<SVGLength> m14121a(Dynamic dynamic) {
        int i11 = C9195a.f13071a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i12 = 0;
        if (i11 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", C33627eb.f69716f).split(C33627eb.f69716f);
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(strArrSplit.length);
            int length = strArrSplit.length;
            while (i12 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i12]));
                i12++;
            }
            return arrayList2;
        }
        if (i11 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
        while (i12 < size) {
            arrayList3.add(m14122b(readableArrayAsArray.getDynamic(i12)));
            i12++;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: b */
    public static SVGLength m14122b(Dynamic dynamic) {
        int i11 = C9195a.f13071a[dynamic.getType().ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new SVGLength() : new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    /* JADX INFO: renamed from: c */
    public static String m14123c(Dynamic dynamic) {
        int i11 = C9195a.f13071a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i11 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public SVGLength(double d11) {
        this.f13063a = d11;
        this.f13064b = UnitType.NUMBER;
    }

    public SVGLength(String str) {
        byte b11 = 2;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i11 = length - 1;
        if (length != 0 && !strTrim.equals(C33789m5.f70921k)) {
            if (strTrim.codePointAt(i11) == 37) {
                this.f13064b = UnitType.PERCENTAGE;
                this.f13063a = Double.valueOf(strTrim.substring(0, i11)).doubleValue();
                return;
            }
            int i12 = length - 2;
            if (i12 > 0) {
                String strSubstring = strTrim.substring(i12);
                strSubstring.getClass();
                switch (strSubstring.hashCode()) {
                    case 3178:
                        b11 = !strSubstring.equals("cm") ? (byte) -1 : (byte) 0;
                        break;
                    case 3240:
                        b11 = !strSubstring.equals("em") ? (byte) -1 : (byte) 1;
                        break;
                    case 3251:
                        if (!strSubstring.equals("ex")) {
                            b11 = -1;
                        }
                        break;
                    case 3365:
                        b11 = !strSubstring.equals("in") ? (byte) -1 : (byte) 3;
                        break;
                    case 3488:
                        b11 = !strSubstring.equals("mm") ? (byte) -1 : (byte) 4;
                        break;
                    case 3571:
                        b11 = !strSubstring.equals("pc") ? (byte) -1 : (byte) 5;
                        break;
                    case 3588:
                        b11 = !strSubstring.equals("pt") ? (byte) -1 : (byte) 6;
                        break;
                    case 3592:
                        b11 = !strSubstring.equals("px") ? (byte) -1 : (byte) 7;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        this.f13064b = UnitType.CM;
                        length = i12;
                        break;
                    case 1:
                        this.f13064b = UnitType.EMS;
                        length = i12;
                        break;
                    case 2:
                        this.f13064b = UnitType.EXS;
                        length = i12;
                        break;
                    case 3:
                        this.f13064b = UnitType.IN;
                        length = i12;
                        break;
                    case 4:
                        this.f13064b = UnitType.MM;
                        length = i12;
                        break;
                    case 5:
                        this.f13064b = UnitType.PC;
                        length = i12;
                        break;
                    case 6:
                        this.f13064b = UnitType.PT;
                        length = i12;
                        break;
                    case 7:
                        this.f13064b = UnitType.NUMBER;
                        length = i12;
                        break;
                    default:
                        this.f13064b = UnitType.NUMBER;
                        break;
                }
                this.f13063a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f13064b = UnitType.NUMBER;
            this.f13063a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f13064b = UnitType.UNKNOWN;
        this.f13063a = 0.0d;
    }
}
