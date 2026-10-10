package com.kubi.payment.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.payment.util.C21457l;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StepsLayout.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/widget/StepsLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initData", "", "currentStepIndex", "", "steps", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StepsLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f40417b = new Companion(null);

    /* JADX INFO: compiled from: StepsLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/widget/StepsLayout$Companion;", "", "<init>", "()V", "TOTAL_STEPS", "", "FIRST_STEP", "SECOND_STEP", "THIRD_STEP", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        setShowDividers(2);
        C21457l.m49856d(this, C27040e.m66658b(8), 0, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49908b(StepsLayout stepsLayout, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 3;
        }
        stepsLayout.m49909a(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m49909a(int i11, int i12) {
        int i13;
        removeAllViews();
        for (int i14 = 0; i14 < i12; i14++) {
            View view = new View(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C27040e.m66657a(8.0f));
            Context context = view.getContext();
            if (i14 <= i11) {
                i13 = R$color.c_text;
            } else {
                i13 = R$color.emphasis4;
            }
            gradientDrawable.setColor(ContextCompat.getColor(context, i13));
            view.setBackground(gradientDrawable);
            addView(view, new LinearLayoutCompat.LayoutParams(0, C27040e.m66658b(3), 1.0f));
        }
    }
}
