package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_MaterialDivider;

    @ColorInt
    private int color;

    @NonNull
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialDividerStyle);
    }

    public int getDividerColor() {
        return this.color;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(@ColorInt int i11) {
        if (this.color != i11) {
            this.color = i11;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i11));
            invalidate();
        }
    }

    public void setDividerInsetEnd(@Px int i11) {
        this.insetEnd = i11;
    }

    public void setDividerInsetStart(@Px int i11) {
        this.insetStart = i11;
    }

    public void setDividerThickness(@Px int i11) {
        if (this.thickness != i11) {
            this.thickness = i11;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.MaterialDivider, i11, i12, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(C7090R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C7090R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int i11;
        int width;
        int i12;
        super.onDraw(canvas);
        boolean z11 = true;
        if (getLayoutDirection() != 1) {
            z11 = false;
        }
        if (z11) {
            i11 = this.insetEnd;
        } else {
            i11 = this.insetStart;
        }
        if (z11) {
            width = getWidth();
            i12 = this.insetStart;
        } else {
            width = getWidth();
            i12 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i11, 0, width - i12, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i13 = this.thickness;
        if (i13 > 0 && measuredHeight != i13) {
            measuredHeight = i13;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColorResource(@ColorRes int i11) {
        setDividerColor(ContextCompat.getColor(getContext(), i11));
    }

    public void setDividerInsetEndResource(@DimenRes int i11) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStartResource(@DimenRes int i11) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThicknessResource(@DimenRes int i11) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i11));
    }
}
