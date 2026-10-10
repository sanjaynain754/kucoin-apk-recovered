package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42942l;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeRadioGroup extends RadioGroup {

    /* JADX INFO: renamed from: c */
    public static final C42942l f48644c = new C42942l();

    /* JADX INFO: renamed from: b */
    public final C42025b f48645b;

    public ShapeRadioGroup(Context context) {
        this(context, null);
    }

    public ShapeRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeRadioGroup);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48644c);
        this.f48645b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48645b;
    }
}
