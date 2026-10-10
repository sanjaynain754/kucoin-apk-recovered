package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFlagView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFlagView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFlagView.kt\ncom/sumsub/sns/core/widget/SNSFlagView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,42:1\n233#2,3:43\n*S KotlinDebug\n*F\n+ 1 SNSFlagView.kt\ncom/sumsub/sns/core/widget/SNSFlagView\n*L\n25#1:43,3\n*E\n"})
public final class SNSFlagView extends ShapeableImageView {
    @JvmOverloads
    public SNSFlagView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSFlagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSFlagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSFlagView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_FlagViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSFlagView : i12);
    }

    @JvmOverloads
    public SNSFlagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFlagView, i11, i12);
        int i13 = R$styleable.SNSFlagView_strokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            ColorStateList colorStateListM69329a = AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13);
            int i14 = R$styleable.SNSFlagView_sns_strokeAlpha;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                colorStateListM69329a = ColorStateList.valueOf(ColorUtils.setAlphaComponent(colorStateListM69329a.getDefaultColor(), (int) (RangesKt.coerceIn(typedArrayObtainStyledAttributes.getFloat(i14, 1.0f), 0.0f, 1.0f) * Color.alpha(-1))));
            }
            setStrokeColor(colorStateListM69329a);
        }
        int i15 = R$styleable.SNSFlagView_strokeWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(i15, 0.0f));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }
}
