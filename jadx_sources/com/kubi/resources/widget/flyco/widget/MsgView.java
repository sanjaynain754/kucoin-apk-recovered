package com.kubi.resources.widget.flyco.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.uikit.R$styleable;

/* JADX INFO: loaded from: classes12.dex */
public class MsgView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    public Context f44835b;

    /* JADX INFO: renamed from: c */
    public GradientDrawable f44836c;

    /* JADX INFO: renamed from: d */
    public int f44837d;

    /* JADX INFO: renamed from: e */
    public int f44838e;

    /* JADX INFO: renamed from: f */
    public int f44839f;

    /* JADX INFO: renamed from: g */
    public int f44840g;

    /* JADX INFO: renamed from: h */
    public boolean f44841h;

    /* JADX INFO: renamed from: i */
    public boolean f44842i;

    public MsgView(Context context) {
        this(context, null);
    }

    public void setCornerRadius(int i11) {
        this.f44838e = m55293b(i11);
        m55297f();
    }

    public void setStrokeWidth(int i11) {
        this.f44839f = m55293b(i11);
        m55297f();
    }

    public MsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: b */
    public int m55293b(float f11) {
        return (int) ((f11 * this.f44835b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m55294c() {
        return this.f44841h;
    }

    /* JADX INFO: renamed from: d */
    public boolean m55295d() {
        return this.f44842i;
    }

    /* JADX INFO: renamed from: e */
    public final void m55296e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MsgView);
        this.f44837d = typedArrayObtainStyledAttributes.getColor(R$styleable.MsgView_mv_backgroundColor, 0);
        this.f44838e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MsgView_mv_cornerRadius, 0);
        this.f44839f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MsgView_mv_strokeWidth, 0);
        this.f44840g = typedArrayObtainStyledAttributes.getColor(R$styleable.MsgView_mv_strokeColor, 0);
        this.f44841h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MsgView_mv_isRadiusHalfHeight, false);
        this.f44842i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MsgView_mv_isWidthHeightEqual, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public void m55297f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        m55298g(this.f44836c, this.f44837d, this.f44840g);
        stateListDrawable.addState(new int[]{-16842919}, this.f44836c);
        setBackground(stateListDrawable);
    }

    public int getBackgroundColor() {
        return this.f44837d;
    }

    public int getCornerRadius() {
        return this.f44838e;
    }

    public int getStrokeColor() {
        return this.f44840g;
    }

    public int getStrokeWidth() {
        return this.f44839f;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f44837d = i11;
        m55297f();
    }

    public void setIsRadiusHalfHeight(boolean z11) {
        this.f44841h = z11;
        m55297f();
    }

    public void setIsWidthHeightEqual(boolean z11) {
        this.f44842i = z11;
        m55297f();
    }

    public void setStrokeColor(int i11) {
        this.f44840g = i11;
        m55297f();
    }

    public MsgView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44836c = new GradientDrawable();
        this.f44835b = context;
        m55296e(context, attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m55298g(GradientDrawable gradientDrawable, int i11, int i12) {
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(this.f44838e);
        gradientDrawable.setStroke(this.f44839f, i12);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (m55294c()) {
            setCornerRadius(getHeight() / 2);
        } else {
            m55297f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (m55295d() && getWidth() > 0 && getHeight() > 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        } else {
            super.onMeasure(i11, i12);
        }
    }
}
