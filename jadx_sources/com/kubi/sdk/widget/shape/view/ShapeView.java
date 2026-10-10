package com.kubi.sdk.widget.shape.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42946p;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeView extends View {

    /* JADX INFO: renamed from: c */
    public static final C42946p f48669c = new C42946p();

    /* JADX INFO: renamed from: b */
    public final C42025b f48670b;

    public ShapeView(Context context) {
        this(context, null);
    }

    public ShapeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48670b;
    }

    public ShapeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeView);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48669c);
        this.f48670b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
