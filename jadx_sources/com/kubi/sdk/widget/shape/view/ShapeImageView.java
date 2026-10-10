package com.kubi.sdk.widget.shape.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42939i;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public static final C42939i f48660c = new C42939i();

    /* JADX INFO: renamed from: b */
    public final C42025b f48661b;

    public ShapeImageView(Context context) {
        this(context, null);
    }

    public ShapeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48661b;
    }

    public ShapeImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeImageView);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48660c);
        this.f48661b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
