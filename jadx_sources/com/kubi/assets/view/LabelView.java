package com.kubi.assets.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.R$color;
import com.kubi.assets.R$styleable;
import com.kubi.resources.widget.BaseTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LabelView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u0013J\u0012\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020\u0007H\u0016J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/view/LabelView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lvBorderWidth", "getLvBorderWidth", "()I", "setLvBorderWidth", "(I)V", "lvBorderColor", "getLvBorderColor", "setLvBorderColor", "lvRadius", "", "getLvRadius", "()F", "setLvRadius", "(F)V", "lvBgColor", "getLvBgColor", "setLvBgColor", "drawBg", "", "setRoundBgColorRes", "colorRes", "radius", "setBackgroundColor", "color", "setTipsLevel", "tipsLevel", "", "TipsLevel", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LabelView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public int f19098b;

    /* JADX INFO: renamed from: c */
    public int f19099c;

    /* JADX INFO: renamed from: d */
    public float f19100d;

    /* JADX INFO: renamed from: e */
    public int f19101e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LabelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LabelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final void m20031b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f19101e);
        gradientDrawable.setCornerRadius(this.f19100d);
        setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: getLvBgColor, reason: from getter */
    public final int getF19101e() {
        return this.f19101e;
    }

    /* JADX INFO: renamed from: getLvBorderColor, reason: from getter */
    public final int getF19099c() {
        return this.f19099c;
    }

    /* JADX INFO: renamed from: getLvBorderWidth, reason: from getter */
    public final int getF19098b() {
        return this.f19098b;
    }

    /* JADX INFO: renamed from: getLvRadius, reason: from getter */
    public final float getF19100d() {
        return this.f19100d;
    }

    public final void setLvBgColor(int i11) {
        this.f19101e = i11;
    }

    public final void setLvBorderColor(int i11) {
        this.f19099c = i11;
    }

    public final void setLvBorderWidth(int i11) {
        this.f19098b = i11;
    }

    public final void setLvRadius(float f11) {
        this.f19100d = f11;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    public final void setTipsLevel(@NotNull String tipsLevel) {
        int color;
        int color2;
        Intrinsics.checkNotNullParameter(tipsLevel, "tipsLevel");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C5275i0.m6236a(2.0f));
        int iHashCode = tipsLevel.hashCode();
        if (iHashCode != -1732662873) {
            if (iHashCode != 2217607) {
                if (iHashCode == 2656902 && tipsLevel.equals("WARN")) {
                    ContextCompat.getColor(getContext(), R$color.secondary16);
                    color = ContextCompat.getColor(getContext(), R$color.secondary8);
                    color2 = ContextCompat.getColor(getContext(), R$color.secondary);
                } else {
                    ContextCompat.getColor(getContext(), R$color.primary16);
                    color = ContextCompat.getColor(getContext(), R$color.primary8);
                    color2 = ContextCompat.getColor(getContext(), R$color.primary);
                }
            } else if (tipsLevel.equals("HINT")) {
                ContextCompat.getColor(getContext(), R$color.complementary20);
                color = ContextCompat.getColor(getContext(), R$color.complementary12);
                color2 = ContextCompat.getColor(getContext(), R$color.complementary);
            } else {
                ContextCompat.getColor(getContext(), R$color.primary16);
                color = ContextCompat.getColor(getContext(), R$color.primary8);
                color2 = ContextCompat.getColor(getContext(), R$color.primary);
            }
        } else if (tipsLevel.equals("NEUTRAL")) {
            ContextCompat.getColor(getContext(), R$color.c_cover12);
            color = ContextCompat.getColor(getContext(), R$color.c_cover4);
            color2 = ContextCompat.getColor(getContext(), R$color.c_text60);
        } else {
            ContextCompat.getColor(getContext(), R$color.primary16);
            color = ContextCompat.getColor(getContext(), R$color.primary8);
            color2 = ContextCompat.getColor(getContext(), R$color.primary);
        }
        gradientDrawable.setColor(color);
        setBackground(gradientDrawable);
        setTextColor(color2);
    }

    public /* synthetic */ LabelView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int color) {
        Drawable background = getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LabelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19099c = ViewCompat.MEASURED_STATE_MASK;
        this.f19101e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LabelView, i11, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f19098b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_lvBorderWidth, 0);
        this.f19099c = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_lvBorderColor, ViewCompat.MEASURED_STATE_MASK);
        this.f19100d = typedArrayObtainStyledAttributes.getDimension(R$styleable.LabelView_lvRadius, 0.0f);
        this.f19101e = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_lvBgColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        m20031b();
    }
}
