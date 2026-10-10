package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42938h;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final C42938h f48640c = new C42938h();

    /* JADX INFO: renamed from: b */
    public final C42025b f48641b;

    public ShapeFrameLayout(Context context) {
        this(context, null);
    }

    public ShapeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48641b;
    }

    public ShapeFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeFrameLayout);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48640c);
        this.f48641b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
