package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    private List<Hct> getHctsByHue() {
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d11 = 0.0d; d11 <= 360.0d; d11 += 1.0d) {
            arrayList.add(Hct.from(d11, this.input.getChroma(), this.input.getTone()));
        }
        List<Hct> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List<Hct> getHctsByTemp() {
        List<Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: com.google.android.material.color.utilities.j5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11811a.getTempsByHct().get((Hct) obj);
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.k5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map<Hct, Double> getTempsByHct() {
        Map<Hct, Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap map2 = new HashMap();
        for (Hct hct : arrayList) {
            map2.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = map2;
        return map2;
    }

    private static boolean isBetween(double d11, double d12, double d13) {
        if (d12 < d13) {
            return d12 <= d11 && d11 <= d13;
        }
        return d12 <= d11 || d11 <= d13;
    }

    public List<Hct> getAnalogousColors(int i11, int i12) {
        int iRound = (int) Math.round(this.input.getHue());
        Hct hct = getHctsByHue().get(iRound);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i13 = 0;
        while (i13 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i13)));
            dAbs2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i13++;
            relativeTemperature = relativeTemperature2;
        }
        double d11 = dAbs2 / ((double) i12);
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i14 = 1;
        while (arrayList.size() < i12) {
            Hct hct2 = getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i14));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            dAbs += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z11 = dAbs >= ((double) arrayList.size()) * d11;
            int i15 = 1;
            while (z11 && arrayList.size() < i12) {
                arrayList.add(hct2);
                int i16 = i14;
                z11 = dAbs >= ((double) (arrayList.size() + i15)) * d11;
                i15++;
                i14 = i16;
            }
            i14++;
            if (i14 > 360) {
                while (arrayList.size() < i12) {
                    arrayList.add(hct2);
                }
                break;
            }
            relativeTemperature3 = relativeTemperature4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int iFloor = (int) Math.floor((((double) i11) - 1.0d) / 2.0d);
        for (int i17 = 1; i17 < iFloor + 1; i17++) {
            int size = 0 - i17;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(size));
        }
        int i18 = i11 - iFloor;
        for (int i19 = 1; i19 < i18; i19++) {
            int size2 = i19;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(size2));
        }
        return arrayList2;
    }

    public Hct getComplement() {
        double d11;
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double dDoubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double dDoubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - dDoubleValue;
        boolean zIsBetween = isBetween(this.input.getHue(), hue, hue2);
        double d12 = zIsBetween ? hue2 : hue;
        double d13 = zIsBetween ? hue : hue2;
        Hct hct2 = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double d14 = 1.0d;
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d15 = 1000.0d;
        double d16 = 0.0d;
        while (d16 <= 360.0d) {
            double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((d14 * d16) + d12);
            if (isBetween(dSanitizeDegreesDouble, d12, d13)) {
                d11 = d14;
                Hct hct3 = getHctsByHue().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((getTempsByHct().get(hct3).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d15) {
                    hct2 = hct3;
                    d15 = dAbs;
                }
            } else {
                d11 = d14;
            }
            d16 += d11;
            d14 = d11;
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    public static double rawTemperature(Hct hct) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public double getRelativeTemperature(Hct hct) {
        double dDoubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double dDoubleValue2 = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }
}
