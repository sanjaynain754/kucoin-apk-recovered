package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @NonNull
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f11 = (Float) viewGroup.getTag(C7090R.id.mtrl_internal_children_alpha_tag);
        return f11 != null ? f11 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f11) {
        float fFloatValue = f11.floatValue();
        viewGroup.setTag(C7090R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup.getChildAt(i11).setAlpha(fFloatValue);
        }
    }
}
