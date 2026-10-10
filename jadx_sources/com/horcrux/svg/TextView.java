package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class TextView extends GroupView {

    /* JADX INFO: renamed from: g */
    public SVGLength f13145g;

    /* JADX INFO: renamed from: h */
    public SVGLength f13146h;

    /* JADX INFO: renamed from: i */
    public String f13147i;

    /* JADX INFO: renamed from: j */
    public TextProperties$TextLengthAdjust f13148j;

    /* JADX INFO: renamed from: k */
    public TextProperties$AlignmentBaseline f13149k;

    /* JADX INFO: renamed from: l */
    public ArrayList<SVGLength> f13150l;

    /* JADX INFO: renamed from: m */
    public ArrayList<SVGLength> f13151m;

    /* JADX INFO: renamed from: n */
    public ArrayList<SVGLength> f13152n;

    /* JADX INFO: renamed from: o */
    public ArrayList<SVGLength> f13153o;

    /* JADX INFO: renamed from: p */
    public ArrayList<SVGLength> f13154p;

    /* JADX INFO: renamed from: q */
    public double f13155q;

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f13155q = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        m14056p(canvas);
        return m14195s(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        m14197v().clearChildCache();
    }

    @Override // com.horcrux.svg.GroupView
    /* JADX INFO: renamed from: l */
    public void mo14053l() {
        m14051j().m14231p(((this instanceof TextPathView) || (this instanceof TSpanView)) ? false : true, this, this.f12980b, this.f13150l, this.f13151m, this.f13153o, this.f13154p, this.f13152n);
    }

    /* JADX INFO: renamed from: q */
    public TextProperties$AlignmentBaseline m14193q() {
        TextProperties$AlignmentBaseline textProperties$AlignmentBaseline;
        if (this.f13149k == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof TextView) && (textProperties$AlignmentBaseline = ((TextView) parent).f13149k) != null) {
                    this.f13149k = textProperties$AlignmentBaseline;
                    return textProperties$AlignmentBaseline;
                }
            }
        }
        if (this.f13149k == null) {
            this.f13149k = TextProperties$AlignmentBaseline.baseline;
        }
        return this.f13149k;
    }

    /* JADX INFO: renamed from: r */
    public String m14194r() {
        String str;
        if (this.f13147i == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof TextView) && (str = ((TextView) parent).f13147i) != null) {
                    this.f13147i = str;
                    return str;
                }
            }
        }
        return this.f13147i;
    }

    /* JADX INFO: renamed from: s */
    public Path m14195s(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        mo14053l();
        this.mPath = super.getPath(canvas, paint);
        mo14052k();
        return this.mPath;
    }

    /* JADX INFO: renamed from: t */
    public double mo14165t(Paint paint) {
        if (!Double.isNaN(this.f13155q)) {
            return this.f13155q;
        }
        double dMo14165t = 0.0d;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof TextView) {
                dMo14165t += ((TextView) childAt).mo14165t(paint);
            }
        }
        this.f13155q = dMo14165t;
        return dMo14165t;
    }

    public TextView(ReactContext reactContext) {
        super(reactContext);
        this.f13145g = null;
        this.f13146h = null;
        this.f13147i = null;
        this.f13148j = TextProperties$TextLengthAdjust.spacing;
        this.f13155q = Double.NaN;
    }

    /* JADX INFO: renamed from: A */
    public void m14187A(String str) {
        this.f13148j = TextProperties$TextLengthAdjust.valueOf(str);
        invalidate();
    }

    /* JADX INFO: renamed from: B */
    public void mo14166B(String str) {
        this.f13149k = TextProperties$AlignmentBaseline.getEnum(str);
        invalidate();
    }

    /* JADX INFO: renamed from: C */
    public void m14188C(Dynamic dynamic) {
        this.f13150l = SVGLength.m14121a(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: D */
    public void m14189D(Dynamic dynamic) {
        this.f13151m = SVGLength.m14121a(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: E */
    public void m14190E(Dynamic dynamic) {
        this.f13152n = SVGLength.m14121a(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: F */
    public void m14191F(Dynamic dynamic) {
        this.f13146h = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public void m14192G(Dynamic dynamic) {
        String strM14123c = SVGLength.m14123c(dynamic);
        if (strM14123c != null) {
            String strTrim = strM14123c.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.f13149k = TextProperties$AlignmentBaseline.getEnum(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f13149k = TextProperties$AlignmentBaseline.baseline;
            }
            try {
                this.f13147i = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f13147i = null;
            }
        } else {
            this.f13149k = TextProperties$AlignmentBaseline.baseline;
            this.f13147i = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        m14056p(canvas);
        clip(canvas, paint);
        m14195s(canvas, paint);
        mo14053l();
        mo14042f(canvas, paint, f11);
        mo14052k();
    }

    @Override // com.horcrux.svg.GroupView
    /* JADX INFO: renamed from: i */
    public Path mo14050i(Canvas canvas, Paint paint, Region.Op op2) {
        return getPath(canvas, paint);
    }

    /* JADX INFO: renamed from: u */
    public TextView m14196u() {
        ArrayList<C9235c> arrayList = m14051j().f13197a;
        ViewParent parent = getParent();
        TextView textView = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof TextView) && arrayList.get(size).f13174j != TextProperties$TextAnchor.start && textView.f13150l == null; size--) {
            textView = (TextView) parent;
            parent = textView.getParent();
        }
        return textView;
    }

    /* JADX INFO: renamed from: v */
    public TextView m14197v() {
        ViewParent parent = getParent();
        TextView textView = this;
        while (parent instanceof TextView) {
            textView = (TextView) parent;
            parent = textView.getParent();
        }
        return textView;
    }

    /* JADX INFO: renamed from: w */
    public void m14198w(Dynamic dynamic) {
        this.f13147i = SVGLength.m14123c(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: x */
    public void m14199x(Dynamic dynamic) {
        this.f13153o = SVGLength.m14121a(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: y */
    public void m14200y(Dynamic dynamic) {
        this.f13154p = SVGLength.m14121a(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public void m14201z(Dynamic dynamic) {
        this.f13145g = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
