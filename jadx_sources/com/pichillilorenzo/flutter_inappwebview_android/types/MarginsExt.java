package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class MarginsExt {
    private double bottom;
    private double left;
    private double right;
    private double top;

    public MarginsExt() {
    }

    private static double milsToPixels(int i11) {
        return ((double) i11) * 0.09600001209449d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MarginsExt marginsExt = (MarginsExt) obj;
            if (Double.compare(marginsExt.top, this.top) == 0 && Double.compare(marginsExt.right, this.right) == 0 && Double.compare(marginsExt.bottom, this.bottom) == 0 && Double.compare(marginsExt.left, this.left) == 0) {
                return true;
            }
        }
        return false;
    }

    public MarginsExt(double d11, double d12, double d13, double d14) {
        this.top = d11;
        this.right = d12;
        this.bottom = d13;
        this.left = d14;
    }

    public static MarginsExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MarginsExt(((Double) map.get(ViewProps.TOP)).doubleValue(), ((Double) map.get("right")).doubleValue(), ((Double) map.get(ViewProps.BOTTOM)).doubleValue(), ((Double) map.get("left")).doubleValue());
    }

    public static MarginsExt fromMargins(PrintAttributes.Margins margins) {
        if (margins == null) {
            return null;
        }
        MarginsExt marginsExt = new MarginsExt();
        marginsExt.top = milsToPixels(margins.getTopMils());
        marginsExt.right = milsToPixels(margins.getRightMils());
        marginsExt.bottom = milsToPixels(margins.getBottomMils());
        marginsExt.left = milsToPixels(margins.getLeftMils());
        return marginsExt;
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.top);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.right);
        int i11 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.bottom);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.left);
        return (i12 * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4));
    }

    public void setBottom(double d11) {
        this.bottom = d11;
    }

    public void setLeft(double d11) {
        this.left = d11;
    }

    public void setRight(double d11) {
        this.right = d11;
    }

    public void setTop(double d11) {
        this.top = d11;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put(ViewProps.TOP, Double.valueOf(this.top));
        map.put("right", Double.valueOf(this.right));
        map.put(ViewProps.BOTTOM, Double.valueOf(this.bottom));
        map.put("left", Double.valueOf(this.left));
        return map;
    }

    public PrintAttributes.Margins toMargins() {
        return new PrintAttributes.Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
    }

    public String toString() {
        return "MarginsExt{top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + '}';
    }

    private static int pixelsToMils(double d11) {
        return (int) Math.round(d11 * 10.416665354331d);
    }
}
