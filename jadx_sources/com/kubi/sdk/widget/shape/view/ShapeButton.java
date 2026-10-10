package com.kubi.sdk.widget.shape.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import l10.C42026c;
import o10.C42934d;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeButton extends AppCompatButton {

    /* JADX INFO: renamed from: d */
    public static final C42934d f48650d = new C42934d();

    /* JADX INFO: renamed from: b */
    public final C42025b f48651b;

    /* JADX INFO: renamed from: c */
    public final C42026c f48652c;

    public ShapeButton(Context context) {
        this(context, null);
    }

    public ShapeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48651b;
    }

    public C42026c getTextColorBuilder() {
        return this.f48652c;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C42026c c42026c = this.f48652c;
        if (c42026c == null || !(c42026c.m92157d() || this.f48652c.m92158e())) {
            super.setText(charSequence, bufferType);
        } else {
            super.setText(this.f48652c.m92155b(charSequence), bufferType);
        }
    }

    public ShapeButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeButton);
        C42934d c42934d = f48650d;
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, c42934d);
        this.f48651b = c42025b;
        C42026c c42026c = new C42026c(this, typedArrayObtainStyledAttributes, c42934d);
        this.f48652c = c42026c;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
        if (!c42026c.m92157d() && !c42026c.m92158e()) {
            c42026c.m92156c();
        } else {
            setText(getText());
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        C42026c c42026c = this.f48652c;
        if (c42026c == null) {
            return;
        }
        c42026c.m92159f(i11);
    }
}
