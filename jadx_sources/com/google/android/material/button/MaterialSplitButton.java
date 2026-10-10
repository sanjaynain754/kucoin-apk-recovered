package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C7090R;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_MaterialSplitButton;
    private static final int REQUIRED_BUTTON_COUNT = 2;

    public MaterialSplitButton(@NonNull Context context) {
        this(context, null);
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialSplitButtonStyle);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i11, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.isChecked() ? C7090R.string.mtrl_button_expanded_content_description : C7090R.string.mtrl_button_collapsed_content_description));
                materialButton.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() { // from class: com.google.android.material.button.e
                    @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
                    public final void onCheckedChanged(MaterialButton materialButton2, boolean z11) {
                        MaterialSplitButton.m12930b(this.f11756a, materialButton2, z11);
                    }
                });
            }
        }
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, DEF_STYLE_RES), attributeSet, i11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12930b(MaterialSplitButton materialSplitButton, MaterialButton materialButton, boolean z11) {
        int i11;
        Resources resources = materialSplitButton.getResources();
        if (z11) {
            i11 = C7090R.string.mtrl_button_expanded_content_description;
        } else {
            i11 = C7090R.string.mtrl_button_collapsed_content_description;
        }
        materialButton.setStateDescription(resources.getString(i11));
    }
}
