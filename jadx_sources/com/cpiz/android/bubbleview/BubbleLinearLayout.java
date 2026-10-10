package com.cpiz.android.bubbleview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import p746x2.InterfaceC45992a;

/* JADX INFO: loaded from: classes34.dex */
public class BubbleLinearLayout extends LinearLayout implements BubbleStyle, InterfaceC45992a {

    /* JADX INFO: renamed from: b */
    public C5391b f7128b;

    public BubbleLinearLayout(Context context) {
        super(context);
        this.f7128b = new C5391b();
        m6998b(context, null);
    }

    public void setArrowTo(int i11) {
        this.f7128b.m7063w(i11);
    }

    /* JADX INFO: renamed from: b */
    private void m6998b(Context context, AttributeSet attributeSet) {
        this.f7128b.m7060t(this, context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public void m6999c() {
        this.f7128b.m7061u();
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public BubbleStyle.ArrowDirection getArrowDirection() {
        return this.f7128b.getArrowDirection();
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public float getArrowHeight() {
        return this.f7128b.getArrowHeight();
    }

    public float getArrowPosDelta() {
        return this.f7128b.m7044c();
    }

    public BubbleStyle.ArrowPosPolicy getArrowPosPolicy() {
        return this.f7128b.m7045d();
    }

    public View getArrowTo() {
        return this.f7128b.m7046e();
    }

    public float getArrowWidth() {
        return this.f7128b.m7047f();
    }

    public int getBorderColor() {
        return this.f7128b.m7048h();
    }

    public float getBorderWidth() {
        return this.f7128b.m7049i();
    }

    public float getCornerBottomLeftRadius() {
        return this.f7128b.m7050j();
    }

    public float getCornerBottomRightRadius() {
        return this.f7128b.m7051k();
    }

    public float getCornerTopLeftRadius() {
        return this.f7128b.m7052l();
    }

    public float getCornerTopRightRadius() {
        return this.f7128b.m7053m();
    }

    public int getFillColor() {
        return this.f7128b.m7054n();
    }

    public float getFillPadding() {
        return this.f7128b.m7055o();
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return this.f7128b.m7056p();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.f7128b.m7057q();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.f7128b.m7058r();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return this.f7128b.m7059s();
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowDirection(BubbleStyle.ArrowDirection arrowDirection) {
        this.f7128b.setArrowDirection(arrowDirection);
    }

    public void setArrowHeight(float f11) {
        this.f7128b.m7062v(f11);
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowPosDelta(float f11) {
        this.f7128b.setArrowPosDelta(f11);
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowPosPolicy(BubbleStyle.ArrowPosPolicy arrowPosPolicy) {
        this.f7128b.setArrowPosPolicy(arrowPosPolicy);
    }

    @Override // com.cpiz.android.bubbleview.BubbleStyle
    public void setArrowTo(View view) {
        this.f7128b.setArrowTo(view);
    }

    public void setArrowWidth(float f11) {
        this.f7128b.m7065y(f11);
    }

    public void setBorderColor(int i11) {
        this.f7128b.m7066z(i11);
    }

    public void setBorderWidth(float f11) {
        this.f7128b.m7036A(f11);
    }

    public void setCornerRadius(float f11) {
        this.f7128b.m7037B(f11);
    }

    public void setFillColor(int i11) {
        this.f7128b.m7039D(i11);
    }

    public void setFillPadding(float f11) {
        this.f7128b.m7040E(f11);
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        C5391b c5391b = this.f7128b;
        if (c5391b != null) {
            c5391b.m7041F(i11, i12, i13, i14);
        } else {
            Log.w("BubbleView", "mBubbleImpl == null on old Android platform");
            mo6996a(i11, i12, i13, i14);
        }
    }

    @Override // p746x2.InterfaceC45992a
    /* JADX INFO: renamed from: a */
    public void mo6996a(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
    }

    @Override // p746x2.InterfaceC45992a
    public int getSuperPaddingBottom() {
        return super.getPaddingBottom();
    }

    @Override // p746x2.InterfaceC45992a
    public int getSuperPaddingLeft() {
        return super.getPaddingLeft();
    }

    @Override // p746x2.InterfaceC45992a
    public int getSuperPaddingRight() {
        return super.getPaddingRight();
    }

    @Override // p746x2.InterfaceC45992a
    public int getSuperPaddingTop() {
        return super.getPaddingTop();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f7128b.m7042G(i13 - i11, i14 - i12, true);
    }

    public BubbleLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7128b = new C5391b();
        m6998b(context, attributeSet);
    }

    public BubbleLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7128b = new C5391b();
        m6998b(context, attributeSet);
    }
}
