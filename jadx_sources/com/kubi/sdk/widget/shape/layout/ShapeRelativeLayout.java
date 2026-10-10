package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42944n;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final C42944n f48648c = new C42944n();

    /* JADX INFO: renamed from: b */
    public final C42025b f48649b;

    public ShapeRelativeLayout(Context context) {
        this(context, null);
    }

    public ShapeRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48649b;
    }

    public ShapeRelativeLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeRelativeLayout);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48648c);
        this.f48649b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
