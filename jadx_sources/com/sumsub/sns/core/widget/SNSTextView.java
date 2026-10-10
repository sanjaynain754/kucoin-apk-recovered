package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textview.MaterialTextView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lcom/sumsub/sns/core/theme/SNSTypographyElement;", "typographyElementName", "Lcom/sumsub/sns/core/theme/SNSColorElement;", "colorElementName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSTypographyElement;Lcom/sumsub/sns/core/theme/SNSColorElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextView.kt\ncom/sumsub/sns/core/widget/SNSTextView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,98:1\n233#2,3:99\n*S KotlinDebug\n*F\n+ 1 SNSTextView.kt\ncom/sumsub/sns/core/widget/SNSTextView\n*L\n32#1:99,3\n*E\n"})
public class SNSTextView extends MaterialTextView implements InterfaceC28973a {

    @Nullable
    private SNSStepState stepState;

    @JvmOverloads
    public SNSTextView(@NotNull Context context) {
        this(context, null, 0, 0, null, null, 62, null);
    }

    @Override // android.widget.TextView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    @JvmOverloads
    public SNSTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, null, 60, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    @NotNull
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    public void setSNSStepState(@NotNull SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
        }
    }

    @JvmOverloads
    public SNSTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, null, null, 56, null);
    }

    public /* synthetic */ SNSTextView(Context context, AttributeSet attributeSet, int i11, int i12, SNSTypographyElement sNSTypographyElement, SNSColorElement sNSColorElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_BodyTextViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSTextView_Body : i12, (i13 & 16) != 0 ? SNSTypographyElement.BODY : sNSTypographyElement, (i13 & 32) != 0 ? SNSColorElement.CONTENT_NEUTRAL : sNSColorElement);
    }

    @JvmOverloads
    public SNSTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12, @NotNull SNSTypographyElement sNSTypographyElement, @NotNull SNSColorElement sNSColorElement) {
        super(context, attributeSet, i11, i12);
        this.stepState = SNSStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSTextView, i11, i12);
        int i13 = R$styleable.SNSTextView_android_textAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            TextViewCompat.setTextAppearance(this, typedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        int i14 = R$styleable.SNSTextView_android_gravity;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setGravity(typedArrayObtainStyledAttributes.getInteger(i14, GravityCompat.START));
        }
        int i15 = R$styleable.SNSTextView_android_background;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(i15));
        }
        int i16 = R$styleable.SNSTextView_sns_textColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(i16, ContextCompat.getColor(context, R.color.white)));
        }
        int i17 = R$styleable.SNSTextView_android_drawableStart;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i17);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                Unit unit = Unit.INSTANCE;
            } else {
                drawable = null;
            }
            compoundDrawables[0] = drawable;
            setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
        int i18 = R$styleable.SNSTextView_android_drawablePadding;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setCompoundDrawablePadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(i18, 0));
        }
        Unit unit2 = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        AbstractC28234b.m69176a(this, sNSTypographyElement, sNSColorElement);
    }
}
