package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class Size2D {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private double height;
    private double width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Size2D size2D = (Size2D) obj;
            if (Double.compare(size2D.width, this.width) == 0 && Double.compare(size2D.height, this.height) == 0) {
                return true;
            }
        }
        return false;
    }

    public static Size2D fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new Size2D(((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue());
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.width);
        int i11 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.height);
        return (i11 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public void setHeight(double d11) {
        this.height = d11;
    }

    public void setWidth(double d11) {
        this.width = d11;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("width", Double.valueOf(this.width));
        map.put("height", Double.valueOf(this.height));
        return map;
    }

    public String toString() {
        return "Size{width=" + this.width + ", height=" + this.height + '}';
    }

    public Size2D(double d11, double d12) {
        this.width = d11;
        this.height = d12;
    }
}
