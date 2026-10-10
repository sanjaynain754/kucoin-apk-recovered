package com.kubi.sdk.widget.shape.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.kubi.sdk.res.R$attr;
import com.kubi.sdk.res.R$styleable;
import l10.C42024a;
import l10.C42025b;
import l10.C42026c;
import o10.C42941k;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: e */
    public static final C42941k f48662e = new C42941k();

    /* JADX INFO: renamed from: b */
    public final C42025b f48663b;

    /* JADX INFO: renamed from: c */
    public final C42026c f48664c;

    /* JADX INFO: renamed from: d */
    public final C42024a f48665d;

    public ShapeRadioButton(Context context) {
        this(context, null);
    }

    public ShapeRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    public C42024a getButtonDrawableBuilder() {
        return this.f48665d;
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48663b;
    }

    public C42026c getTextColorBuilder() {
        return this.f48664c;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C42026c c42026c = this.f48664c;
        if (c42026c == null || !(c42026c.m92157d() || this.f48664c.m92158e())) {
            super.setText(charSequence, bufferType);
        } else {
            super.setText(this.f48664c.m92155b(charSequence), bufferType);
        }
    }

    public ShapeRadioButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeRadioButton);
        C42941k c42941k = f48662e;
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, c42941k);
        this.f48663b = c42025b;
        C42026c c42026c = new C42026c(this, typedArrayObtainStyledAttributes, c42941k);
        this.f48664c = c42026c;
        C42024a c42024a = new C42024a(this, typedArrayObtainStyledAttributes, c42941k);
        this.f48665d = c42024a;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
        if (!c42026c.m92157d() && !c42026c.m92158e()) {
            c42026c.m92156c();
        } else {
            setText(getText());
        }
        c42024a.m92137a();
    }

    @Override // androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C42024a c42024a = this.f48665d;
        if (c42024a == null) {
            return;
        }
        c42024a.m92138b(drawable);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        C42026c c42026c = this.f48664c;
        if (c42026c == null) {
            return;
        }
        c42026c.m92159f(i11);
    }
}
