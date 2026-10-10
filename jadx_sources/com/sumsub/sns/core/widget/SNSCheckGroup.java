package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "Landroid/widget/LinearLayout;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", ReportDataTable.COLUMN_PARAMS, "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "shapeAppearanceModel", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "boxBackground", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "getBoxBackground$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/google/android/material/shape/MaterialShapeDrawable;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSCheckGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCheckGroup.kt\ncom/sumsub/sns/core/widget/SNSCheckGroup\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n*L\n1#1,107:1\n37#2:108\n37#2:110\n54#3:109\n*S KotlinDebug\n*F\n+ 1 SNSCheckGroup.kt\ncom/sumsub/sns/core/widget/SNSCheckGroup\n*L\n60#1:108\n93#1:110\n64#1:109\n*E\n"})
public final class SNSCheckGroup extends LinearLayout implements InterfaceC28973a {

    @NotNull
    private final MaterialShapeDrawable boxBackground;

    @NotNull
    private final ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private SNSStepState stepState;

    @JvmOverloads
    public SNSCheckGroup(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    @JvmOverloads
    public SNSCheckGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getBoxBackground$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final MaterialShapeDrawable getBoxBackground() {
        return this.boxBackground;
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
            this.boxBackground.setState(SNSStepViewExtensionsKt.getSnsStepDrawableState(this));
            refreshDrawableState();
        }
    }

    @JvmOverloads
    public SNSCheckGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        SNSCustomizationTheme theme2;
        C28966p c28966p2;
        int iIntValue;
        C28955c c28955c;
        super.addView(child, index, params);
        C28468k0 c28468k0 = C28468k0.f57983a;
        SNSJsonCustomization customization = c28468k0.getCustomization();
        Integer num = null;
        if (customization != null) {
            theme = customization.getTheme();
        } else {
            theme = null;
        }
        if (theme instanceof C28966p) {
            c28966p = (C28966p) theme;
        } else {
            c28966p = null;
        }
        if ((child instanceof CheckBox) && c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
            SNSJsonCustomization customization2 = c28468k0.getCustomization();
            if (customization2 != null) {
                theme2 = customization2.getTheme();
            } else {
                theme2 = null;
            }
            if (theme2 instanceof C28966p) {
                c28966p2 = (C28966p) theme2;
            } else {
                c28966p2 = null;
            }
            if (c28966p2 != null) {
                boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
                Map map = c28966p2.f58877c;
                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
                    Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_TINT);
                    if (numM69174a != null) {
                        iIntValue = numM69174a.intValue();
                    } else {
                        iIntValue = iIntValue2;
                    }
                    ((CheckBox) child).setButtonTintList(new ColorStateList(iArr, new int[]{iIntValue2, iIntValue}));
                }
            }
        }
    }

    public /* synthetic */ SNSCheckGroup(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_CheckGroupStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCheckGroup : i12);
    }

    @JvmOverloads
    public SNSCheckGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Float fM69171a;
        Integer numM69172a;
        super(context, attributeSet);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build();
        this.shapeAppearanceModel = shapeAppearanceModelBuild;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        this.boxBackground = materialShapeDrawable;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSCheckGroup, i11, i12);
        materialShapeDrawable.setFillColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, R$styleable.SNSCheckGroup_sns_checkBackgroundColor));
        setBackground(materialShapeDrawable);
        setShowDividers(typedArrayObtainStyledAttributes.getInt(R$styleable.SNSCheckGroup_android_showDividers, 0));
        setDividerDrawable(typedArrayObtainStyledAttributes.getDrawable(R$styleable.SNSCheckGroup_android_divider));
        typedArrayObtainStyledAttributes.recycle();
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BACKGROUND_INVALID);
        numM69174a = numM69174a == null ? AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_CRITICAL) : numM69174a;
        if (numM69174a != null) {
            materialShapeDrawable.setFillColor(new ColorStateList(new int[][]{new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_stateRejected}, new int[0]}, new int[]{0, numM69174a.intValue(), 0}));
        }
        SNSColorElement sNSColorElement = SNSColorElement.LIST_SEPARATOR;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            getDividerDrawable().setColorFilter(new PorterDuffColorFilter(numM69172a.intValue(), PorterDuff.Mode.SRC));
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        if (c28966pM69169a2 == null || (fM69171a = AbstractC28233a.m69171a(c28966pM69169a2, sNSMetricElement)) == null) {
            return;
        }
        materialShapeDrawable.setCornerSize(fM69171a.floatValue());
    }
}
