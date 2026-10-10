package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.C7090R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(@NonNull Context context) {
        this(context, null);
    }

    @Dimension
    public int getLeveledRadius(int i11) {
        return i11 == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    @Dimension
    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i11) {
        this.background.setFillColor(ColorStateList.valueOf(i11));
    }

    public void setRadius(@Dimension int i11) {
        this.radius = i11;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != C7090R.id.circle_center && !shouldSkipView(childAt)) {
                int i12 = (Integer) childAt.getTag(C7090R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!map.containsKey(i12)) {
                    map.put(i12, new ArrayList());
                }
                ((List) map.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), constraintSet, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(C7090R.layout.material_radial_view_group, this);
        setBackground(createBackground());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.RadialViewGroup, i11, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f11938b.updateLayoutParams();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addConstraints(List<View> list, ConstraintSet constraintSet, int i11) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(it.next().getId(), C7090R.id.circle_center, i11, size);
            size += 360.0f / list.size();
        }
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }
}
