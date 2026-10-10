package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "shapeAppearanceModel", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSBottomSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSBottomSheetView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,60:1\n233#2,3:61\n37#3:64\n*S KotlinDebug\n*F\n+ 1 SNSBottomSheetView.kt\ncom/sumsub/sns/core/widget/SNSBottomSheetView\n*L\n29#1:61,3\n47#1:64\n*E\n"})
public class SNSBottomSheetView extends FrameLayout {

    @NotNull
    private final ShapeAppearanceModel shapeAppearanceModel;

    @JvmOverloads
    public SNSBottomSheetView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSBottomSheetView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSBottomSheetView : i12);
    }

    @JvmOverloads
    public SNSBottomSheetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Integer numM69172a;
        super(context, attributeSet, i11);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build();
        this.shapeAppearanceModel = shapeAppearanceModelBuild;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSBottomSheetView, i11, i12);
        int i13 = R$styleable.SNSBottomSheetView_android_background;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(i13));
        }
        int i14 = R$styleable.SNSBottomSheetView_backgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild.toBuilder().setBottomLeftCorner(0, 0.0f).setBottomRightCorner(0, 0.0f).build());
            materialShapeDrawable.setFillColor(typedArrayObtainStyledAttributes.getColorStateList(i14));
            setBackground(materialShapeDrawable);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS);
        float fFloatValue = fM69170a != null ? fM69170a.floatValue() : 0.0f;
        SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_BACKGROUND;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a == null || (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) == null) {
            return;
        }
        int iIntValue = numM69172a.intValue();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelBuild.toBuilder().setTopLeftCorner(0, fFloatValue).setTopRightCorner(0, fFloatValue).build());
        materialShapeDrawable2.setFillColor(ColorStateList.valueOf(iIntValue));
        setBackground(materialShapeDrawable2);
    }
}
