package com.kubi.payment.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.resources.C22912t;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RotateTextView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/widget/RotateTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "arrowDrawable", "Landroid/graphics/drawable/RotateDrawable;", "getArrowDrawable", "()Landroid/graphics/drawable/RotateDrawable;", "arrowDrawable$delegate", "Lkotlin/Lazy;", "showArrowUp", "", "showArrowDown", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RotateTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f40416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotateTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f40416b = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.widget.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RotateTextView.m49905c(this.f40443b);
            }
        });
        getArrowDrawable().mutate();
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, getArrowDrawable(), (Drawable) null);
        C22912t.m54411i(this, C27017c.f54310a.m66512a(R$color.c_icon60));
    }

    private final RotateDrawable getArrowDrawable() {
        return (RotateDrawable) this.f40416b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m49906d() {
        C22912t.m54411i(this, C27017c.f54310a.m66512a(R$color.c_icon60));
        ObjectAnimator.ofInt(getArrowDrawable(), FirebaseAnalytics.Param.LEVEL, 5000, 10000).setDuration(300L).start();
    }

    /* JADX INFO: renamed from: e */
    public final void m49907e() {
        C22912t.m54411i(this, C27017c.f54310a.m66512a(R$color.primary));
        ObjectAnimator.ofInt(getArrowDrawable(), FirebaseAnalytics.Param.LEVEL, 0, 5000).setDuration(300L).start();
    }

    /* JADX INFO: renamed from: c */
    public static final RotateDrawable m49905c(RotateTextView rotateTextView) {
        Drawable drawable = ResourcesCompat.getDrawable(rotateTextView.getResources(), R$drawable.payment_rotate_pop_arrow, null);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        return (RotateDrawable) drawable;
    }
}
