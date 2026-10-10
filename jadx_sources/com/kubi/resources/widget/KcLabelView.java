package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcLabelView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/KcLabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setLevel", "", "tipsLevel", "", "cornerRadiusTopStartPx", "cornerRadiusTopEndPx", "cornerRadiusBottomStartPx", "cornerRadiusBottomRightPx", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcLabelView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f43869b = new Companion(null);

    /* JADX INFO: compiled from: KcLabelView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/resources/widget/KcLabelView$Companion;", "", "<init>", "()V", "GREEN", "", "RED", "YELLOW", "GRAY", "LIGHT_GREEN", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcLabelView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.KcLabelView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.KcLabelView_klv_level, 3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_cornerRadius, C27029c.m66600c(this, 8.0f));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_cornerRadius_topLeft, C27029c.m66600c(this, -1.0f));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_cornerRadius_topRight, C27029c.m66600c(this, -1.0f));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_cornerRadius_bottomLeft, C27029c.m66600c(this, -1.0f));
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_cornerRadius_bottomRight, C27029c.m66600c(this, -1.0f));
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_paddingHorizontal, C27029c.m66600c(this, 8.0f));
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KcLabelView_klv_paddingVertical, C27029c.m66600c(this, 4.0f));
        typedArrayObtainStyledAttributes.recycle();
        setPadding(dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize6, dimensionPixelSize7);
        m54593b(i11, dimensionPixelSize2 < 0 ? dimensionPixelSize : dimensionPixelSize2, dimensionPixelSize3 < 0 ? dimensionPixelSize : dimensionPixelSize3, dimensionPixelSize4 < 0 ? dimensionPixelSize : dimensionPixelSize4, dimensionPixelSize5 < 0 ? dimensionPixelSize : dimensionPixelSize5);
    }

    /* JADX INFO: renamed from: b */
    public final void m54593b(int i11, int i12, int i13, int i14, int i15) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f11 = i12;
        float f12 = i13;
        float f13 = i15;
        float f14 = i14;
        boolean z11 = false;
        gradientDrawable.setCornerRadii(C5303w0.m6511a() ? new float[]{f12, f12, f11, f11, f14, f14, f13, f13} : new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        Context context = getContext();
        int i16 = R$color.c_cover4;
        int color = ContextCompat.getColor(context, i16);
        Context context2 = getContext();
        int i17 = R$color.c_text40;
        int color2 = ContextCompat.getColor(context2, i17);
        if (i11 == 0) {
            color = ContextCompat.getColor(getContext(), R$color.brandGreen8);
            color2 = ContextCompat.getColor(getContext(), R$color.brandGreen);
        } else if (i11 == 1) {
            color = ContextCompat.getColor(getContext(), R$color.brandRed8);
            color2 = ContextCompat.getColor(getContext(), R$color.brandRed);
        } else if (i11 == 2) {
            color = ContextCompat.getColor(getContext(), R$color.complementary8);
            color2 = ContextCompat.getColor(getContext(), R$color.complementary);
        } else if (i11 == 3) {
            color = ContextCompat.getColor(getContext(), i16);
            color2 = ContextCompat.getColor(getContext(), i17);
        } else if (i11 == 4) {
            Context context3 = getContext();
            int i18 = R$color.light_green_aaff8d;
            int color3 = ContextCompat.getColor(context3, i18);
            Context context4 = getContext();
            int i19 = R$color.light_green_7ffca7;
            int color4 = ContextCompat.getColor(context4, i19);
            if (C5303w0.m6511a()) {
                color3 = ContextCompat.getColor(getContext(), i19);
                color4 = ContextCompat.getColor(getContext(), i18);
            }
            gradientDrawable.setColors(new int[]{color3, color4});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            color2 = ContextCompat.getColor(getContext(), R$color.c_text_black);
            setTypeface(ResourcesCompat.getFont(getContext(), R$font.semi));
            z11 = true;
        }
        if (!z11) {
            gradientDrawable.setColor(color);
        }
        setBackground(gradientDrawable);
        setTextColor(color2);
    }
}
