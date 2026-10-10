package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class MaskView extends GroupView {

    /* JADX INFO: renamed from: g */
    public SVGLength f13021g;

    /* JADX INFO: renamed from: h */
    public SVGLength f13022h;

    /* JADX INFO: renamed from: i */
    public SVGLength f13023i;

    /* JADX INFO: renamed from: j */
    public SVGLength f13024j;

    /* JADX INFO: renamed from: k */
    public Brush.BrushUnits f13025k;

    /* JADX INFO: renamed from: l */
    public Brush.BrushUnits f13026l;

    /* JADX INFO: renamed from: m */
    public MaskType f13027m;

    public enum MaskType {
        LUMINANCE,
        ALPHA
    }

    /* JADX INFO: renamed from: q */
    public MaskType m14087q() {
        return this.f13027m;
    }

    /* JADX INFO: renamed from: r */
    public Brush.BrushUnits m14088r() {
        return this.f13025k;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m14090t(int i11) {
        if (i11 == 0) {
            this.f13026l = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13026l = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public void m14091u(int i11) {
        if (i11 == 0) {
            this.f13027m = MaskType.LUMINANCE;
        } else if (i11 == 1) {
            this.f13027m = MaskType.ALPHA;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public void m14092v(int i11) {
        if (i11 == 0) {
            this.f13025k = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13025k = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public MaskView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: s */
    public void m14089s(Dynamic dynamic) {
        this.f13024j = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public void m14093w(Dynamic dynamic) {
        this.f13023i = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: x */
    public void m14094x(Dynamic dynamic) {
        this.f13021g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: y */
    public void m14095y(Dynamic dynamic) {
        this.f13022h = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
