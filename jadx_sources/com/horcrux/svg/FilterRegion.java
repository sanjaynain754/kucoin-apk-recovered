package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes56.dex */
public class FilterRegion {

    /* JADX INFO: renamed from: mH */
    SVGLength f12966mH;

    /* JADX INFO: renamed from: mW */
    SVGLength f12967mW;

    /* JADX INFO: renamed from: mX */
    SVGLength f12968mX;

    /* JADX INFO: renamed from: mY */
    SVGLength f12969mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f11, double d11) {
        return (sVGLength == null || sVGLength.f13064b == SVGLength.UnitType.UNKNOWN) ? d11 : virtualView.relativeOn(sVGLength, f11);
    }

    public Rect getCropRect(VirtualView virtualView, FilterProperties$Units filterProperties$Units, RectF rectF) {
        double dRelativeOnFraction;
        double relativeOrDefault;
        double dRelativeOnFraction2;
        double dRelativeOnFraction3;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (filterProperties$Units == FilterProperties$Units.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction = ((double) rectF.left) + virtualView.relativeOnFraction(this.f12968mX, rectF.width());
            dRelativeOnFraction3 = ((double) rectF.top) + virtualView.relativeOnFraction(this.f12969mY, rectF.height());
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.f12967mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.f12966mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.f12968mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.f12969mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.f12967mW, canvasWidth, rectF.width());
            dRelativeOnFraction = relativeOrDefault2;
            relativeOrDefault = getRelativeOrDefault(virtualView, this.f12966mH, canvasHeight, rectF.height());
            dRelativeOnFraction2 = relativeOrDefault4;
            dRelativeOnFraction3 = relativeOrDefault3;
        }
        return new Rect((int) dRelativeOnFraction, (int) dRelativeOnFraction3, (int) (dRelativeOnFraction + dRelativeOnFraction2), (int) (dRelativeOnFraction3 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.f12966mH = SVGLength.m14122b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.f12967mW = SVGLength.m14122b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.f12968mX = SVGLength.m14122b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.f12969mY = SVGLength.m14122b(dynamic);
    }
}
