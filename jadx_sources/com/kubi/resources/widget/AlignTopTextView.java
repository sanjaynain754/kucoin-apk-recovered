package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes13.dex */
public class AlignTopTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    public int f43708b;

    public AlignTopTextView(Context context) {
        this(context, null);
    }

    public AlignTopTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            m54428b(drawable);
        }
        if (drawable3 != null) {
            m54428b(drawable3);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public void setDrawablePaddingTop(int i11) {
        this.f43708b = i11;
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public AlignTopTextView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43708b = 0;
    }

    /* JADX INFO: renamed from: b */
    private void m54428b(Drawable drawable) {
        int i11;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int lineHeight = (int) (getLineHeight() / getLineSpacingMultiplier());
        if (intrinsicHeight < lineHeight) {
            i11 = (intrinsicHeight - lineHeight) / 2;
        } else {
            i11 = 0;
        }
        int measuredHeight = (((((intrinsicHeight - getMeasuredHeight()) + getPaddingTop()) + getPaddingBottom()) / 2) - i11) + this.f43708b;
        drawable.setBounds(0, measuredHeight, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + measuredHeight);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }
}
