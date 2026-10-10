package com.kubi.sdk.widget.shape.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import o10.C42943m;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: c */
    public static final C42943m f48646c = new C42943m();

    /* JADX INFO: renamed from: b */
    public final C42025b f48647b;

    public ShapeRecyclerView(Context context) {
        this(context, null);
    }

    public ShapeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48647b;
    }

    public ShapeRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeRecyclerView);
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, f48646c);
        this.f48647b = c42025b;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
    }
}
