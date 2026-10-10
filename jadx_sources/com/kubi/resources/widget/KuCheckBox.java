package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5107r;
import com.airbnb.lottie.InterfaceC5085j0;
import com.airbnb.lottie.LottieDrawable;
import com.kubi.sdk.res.R$raw;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCheckBox.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/KuCheckBox;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLottieDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "setChecked", "", "checked", "", "setEnabled", "enabled", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: b */
    @Nullable
    public LottieDrawable f43892b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KuCheckBox(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KuCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final void m54647c(KuCheckBox kuCheckBox, int i11, int i12, C5080h c5080h) {
        LottieDrawable lottieDrawable = kuCheckBox.f43892b;
        if (lottieDrawable != null) {
            lottieDrawable.m5630w0(c5080h);
        }
        LottieDrawable lottieDrawable2 = kuCheckBox.f43892b;
        if (lottieDrawable2 != null) {
            lottieDrawable2.setBounds(0, 0, i11, i11);
        }
        kuCheckBox.setCompoundDrawablesRelative(i12 == 0 ? kuCheckBox.f43892b : kuCheckBox.getCompoundDrawablesRelative()[0], kuCheckBox.getCompoundDrawablesRelative()[1], i12 == 1 ? kuCheckBox.f43892b : kuCheckBox.getCompoundDrawablesRelative()[2], kuCheckBox.getCompoundDrawablesRelative()[3]);
        LottieDrawable lottieDrawable3 = kuCheckBox.f43892b;
        if (lottieDrawable3 != null) {
            lottieDrawable3.m5550A0(kuCheckBox.isChecked() ? 15 : 26);
        }
    }

    public /* synthetic */ KuCheckBox(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m54648d(Throwable th2) {
        th2.printStackTrace();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        int i11;
        int i12;
        if (isChecked() != checked) {
            LottieDrawable lottieDrawable = this.f43892b;
            if (lottieDrawable != null) {
                if (checked) {
                    i11 = 1;
                } else {
                    i11 = 20;
                }
                if (checked) {
                    i12 = 15;
                } else {
                    i12 = 26;
                }
                lottieDrawable.m5566I0(i11, i12);
            }
            LottieDrawable lottieDrawable2 = this.f43892b;
            if (lottieDrawable2 != null) {
                lottieDrawable2.m5610j0();
            }
        }
        super.setChecked(checked);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            setAlpha(1.0f);
            setLayerType(0, null);
        } else {
            setAlpha(0.4f);
            setLayerType(2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KuCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43892b = new LottieDrawable();
        setClickable(true);
        setButtonDrawable((Drawable) null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KuCheckBox);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        final int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.KuCheckBox_kcb_drawable_size, C27029c.m66601d(this, 20));
        final int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.KuCheckBox_kcb_drawable_position, 0);
        typedArrayObtainStyledAttributes.recycle();
        C5107r.m5893u(context, R$raw.ku_check_box).m5816d(new InterfaceC5085j0() { // from class: com.kubi.resources.widget.e1
            @Override // com.airbnb.lottie.InterfaceC5085j0
            public final void onResult(Object obj) {
                KuCheckBox.m54647c(this.f44557a, dimensionPixelSize, i12, (C5080h) obj);
            }
        }).m5815c(new InterfaceC5085j0() { // from class: com.kubi.resources.widget.f1
            @Override // com.airbnb.lottie.InterfaceC5085j0
            public final void onResult(Object obj) {
                KuCheckBox.m54648d((Throwable) obj);
            }
        });
    }
}
