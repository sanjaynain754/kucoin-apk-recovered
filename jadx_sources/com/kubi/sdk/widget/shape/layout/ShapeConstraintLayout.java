package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42936f;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final C42936f f48638o = new C42936f();

    /* JADX INFO: renamed from: n */
    public final C42025b f48639n;

    public ShapeConstraintLayout(Context context) {
        this(context, null);
    }

    public ShapeConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48639n;
    }

    public ShapeConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeConstraintLayout);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48638o);
        this.f48639n = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
