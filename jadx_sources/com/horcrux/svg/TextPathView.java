package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class TextPathView extends TextView {

    /* JADX INFO: renamed from: r */
    public String f13125r;

    /* JADX INFO: renamed from: s */
    public TextProperties$TextPathSide f13126s;

    /* JADX INFO: renamed from: t */
    public TextProperties$TextPathMidLine f13127t;

    /* JADX INFO: renamed from: u */
    public SVGLength f13128u;

    /* JADX INFO: renamed from: v */
    public TextProperties$TextPathMethod f13129v;

    /* JADX INFO: renamed from: w */
    public TextProperties$TextPathSpacing f13130w;

    /* JADX INFO: renamed from: H */
    public TextProperties$TextPathMidLine m14167H() {
        return this.f13127t;
    }

    /* JADX INFO: renamed from: I */
    public TextProperties$TextPathSide m14168I() {
        return this.f13126s;
    }

    /* JADX INFO: renamed from: J */
    public SVGLength m14169J() {
        return this.f13128u;
    }

    /* JADX INFO: renamed from: L */
    public void m14171L(String str) {
        this.f13125r = str;
        invalidate();
    }

    public TextPathView(ReactContext reactContext) {
        super(reactContext);
        this.f13129v = TextProperties$TextPathMethod.align;
        this.f13130w = TextProperties$TextPathSpacing.exact;
    }

    @Override // com.horcrux.svg.TextView
    /* JADX INFO: renamed from: B */
    public void mo14166B(String str) {
        this.f13129v = TextProperties$TextPathMethod.valueOf(str);
        invalidate();
    }

    /* JADX INFO: renamed from: K */
    public Path m14170K(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f13125r);
        if (!(definedTemplate instanceof RenderableView)) {
            return null;
        }
        return ((RenderableView) definedTemplate).getPath(canvas, paint);
    }

    /* JADX INFO: renamed from: M */
    public void m14172M(String str) {
        this.f13127t = TextProperties$TextPathMidLine.valueOf(str);
        invalidate();
    }

    /* JADX INFO: renamed from: N */
    public void m14173N(String str) {
        this.f13126s = TextProperties$TextPathSide.valueOf(str);
        invalidate();
    }

    /* JADX INFO: renamed from: O */
    public void m14174O(String str) {
        this.f13130w = TextProperties$TextPathSpacing.valueOf(str);
        invalidate();
    }

    /* JADX INFO: renamed from: P */
    public void m14175P(Dynamic dynamic) {
        this.f13128u = SVGLength.m14122b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        mo14042f(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return m14195s(canvas, paint);
    }

    @Override // com.horcrux.svg.GroupView
    /* JADX INFO: renamed from: k */
    public void mo14052k() {
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView
    /* JADX INFO: renamed from: l */
    public void mo14053l() {
    }
}
