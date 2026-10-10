package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
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
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageView.kt\ncom/sumsub/sns/core/widget/SNSImageView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n233#2,3:104\n22#3:107\n1#4:108\n*S KotlinDebug\n*F\n+ 1 SNSImageView.kt\ncom/sumsub/sns/core/widget/SNSImageView\n*L\n32#1:104,3\n47#1:107\n47#1:108\n*E\n"})
public final class SNSImageView extends AppCompatImageView implements InterfaceC28973a {

    @Nullable
    private SNSStepState stepState;

    @JvmOverloads
    public SNSImageView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    @JvmOverloads
    public SNSImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
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
    public SNSImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSImageView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ImageViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSImageView : i12);
    }

    @JvmOverloads
    public SNSImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.stepState = SNSStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSImageView, i11, i12);
        int i13 = R$styleable.SNSImageView_android_tint;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            ImageViewCompat.setImageTintList(this, AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSImageView_android_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            ViewCompat.setBackgroundTintList(this, AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i14));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        if ((theme instanceof C28966p ? (C28966p) theme : null) != null) {
            int[][] iArr = {new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateProcessing}, new int[0]};
            SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_NEUTRAL;
            Integer numM69174a = AbstractC28234b.m69174a(this, sNSColorElement);
            int iIntValue = numM69174a != null ? numM69174a.intValue() : 0;
            SNSColorElement sNSColorElement2 = SNSColorElement.BACKGROUND_WARNING;
            Integer numM69174a2 = AbstractC28234b.m69174a(this, sNSColorElement2);
            int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : 0;
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_SUCCESS);
            int iIntValue3 = numM69174a3 != null ? numM69174a3.intValue() : 0;
            Integer numM69174a4 = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_CRITICAL);
            int iIntValue4 = numM69174a4 != null ? numM69174a4.intValue() : 0;
            Integer numM69174a5 = AbstractC28234b.m69174a(this, sNSColorElement2);
            int iIntValue5 = numM69174a5 != null ? numM69174a5.intValue() : 0;
            Integer numM69174a6 = AbstractC28234b.m69174a(this, sNSColorElement);
            ViewCompat.setBackgroundTintList(this, new ColorStateList(iArr, new int[]{iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, numM69174a6 != null ? numM69174a6.intValue() : 0}));
        }
    }
}
