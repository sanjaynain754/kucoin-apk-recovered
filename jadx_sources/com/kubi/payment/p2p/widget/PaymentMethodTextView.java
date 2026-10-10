package com.kubi.payment.p2p.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentMethodTextView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/p2p/widget/PaymentMethodTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "drawableColor", "getDrawableColor", "()Ljava/lang/String;", "setDrawableColor", "(Ljava/lang/String;)V", "setLeftDrawable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodTextView.kt\ncom/kubi/payment/p2p/widget/PaymentMethodTextView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,58:1\n470#2:59\n*S KotlinDebug\n*F\n+ 1 PaymentMethodTextView.kt\ncom/kubi/payment/p2p/widget/PaymentMethodTextView\n*L\n35#1:59\n*E\n"})
public final class PaymentMethodTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f40164b;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.widget.PaymentMethodTextView$a */
    /* JADX INFO: compiled from: PaymentMethodTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/payment/p2p/widget/PaymentMethodTextView$setLeftDrawable$leftColorImg$1", "Landroid/graphics/drawable/GradientDrawable;", "getIntrinsicHeight", "", "getIntrinsicWidth", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21345a extends GradientDrawable {
        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return C27040e.m66658b(2);
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return C27040e.m66658b(10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    /* JADX INFO: renamed from: b */
    public final void m49415b() {
        int color;
        C21345a c21345a = new C21345a();
        try {
            String str = this.f40164b;
            color = str != null ? Color.parseColor(str) : ContextCompat.getColor(getContext(), R$color.brandGreen);
        } catch (Exception unused) {
            color = ContextCompat.getColor(getContext(), R$color.brandGreen);
        }
        c21345a.setColor(color);
        c21345a.setCornerRadius(C27040e.m66657a(2.0f));
        setCompoundDrawablePadding(C27040e.m66658b(4));
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        setCompoundDrawablesRelativeWithIntrinsicBounds(c21345a, (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 1), (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 2), (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 3));
    }

    @Nullable
    /* JADX INFO: renamed from: getDrawableColor, reason: from getter */
    public final String getF40164b() {
        return this.f40164b;
    }

    public final void setDrawableColor(@Nullable String str) {
        this.f40164b = str;
        m49415b();
    }
}
