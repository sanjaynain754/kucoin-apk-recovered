package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42940j;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final C42940j f48642c = new C42940j();

    /* JADX INFO: renamed from: b */
    public final C42025b f48643b;

    public ShapeLinearLayout(Context context) {
        this(context, null);
    }

    public ShapeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48643b;
    }

    public ShapeLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeLinearLayout);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48642c);
        this.f48643b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
