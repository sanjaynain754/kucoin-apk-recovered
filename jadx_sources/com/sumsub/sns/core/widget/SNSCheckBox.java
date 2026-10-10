package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.CompoundButtonCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCheckBox;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSCheckBox extends AppCompatCheckBox {
    @JvmOverloads
    public SNSCheckBox(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSCheckBox(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_CheckBoxStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCheckBox : i12);
    }

    @JvmOverloads
    public SNSCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
        if (numM69174a != null) {
            int iIntValue = numM69174a.intValue();
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_TINT);
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{iIntValue, numM69174a2 != null ? numM69174a2.intValue() : iIntValue});
            CompoundButtonCompat.setButtonTintList(this, colorStateList);
            TextViewCompat.setCompoundDrawableTintList(this, colorStateList);
        }
    }
}
