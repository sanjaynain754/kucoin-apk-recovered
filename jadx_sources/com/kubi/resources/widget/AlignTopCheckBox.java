package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: classes13.dex */
public class AlignTopCheckBox extends AppCompatCheckBox {
    public AlignTopCheckBox(Context context) {
        this(context, null);
    }

    public AlignTopCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            m54427a(drawable);
        }
        if (drawable3 != null) {
            m54427a(drawable3);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public AlignTopCheckBox(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m54427a(Drawable drawable) {
        int i11;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int lineHeight = (int) (getLineHeight() / getLineSpacingMultiplier());
        if (intrinsicHeight < lineHeight) {
            i11 = (intrinsicHeight - lineHeight) / 2;
        } else {
            i11 = 0;
        }
        int measuredHeight = ((((intrinsicHeight - getMeasuredHeight()) + getPaddingTop()) + getPaddingBottom()) / 2) - i11;
        drawable.setBounds(0, measuredHeight, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + measuredHeight);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }
}
