package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterceptRadioGroup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/InterceptRadioGroup;", "Landroid/widget/RadioGroup;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "checkedChange", "", "getCheckIndex", "", "checkIndex", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InterceptRadioGroup extends RadioGroup {
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptRadioGroup(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        C27046k.m66711z(this, 0L, new Function0() { // from class: com.kubi.resources.widget.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterceptRadioGroup.m54531b(this.f44576b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m54531b(InterceptRadioGroup interceptRadioGroup) {
        interceptRadioGroup.m54533d();
        return Unit.INSTANCE;
    }

    private final int getCheckIndex() {
        int childCount = getChildCount();
        int i11 = -1;
        if (childCount >= 0) {
            int i12 = 0;
            while (true) {
                View childAt = getChildAt(i12);
                if ((childAt instanceof RadioButton) && ((RadioButton) childAt).isChecked()) {
                    i11 = i12;
                }
                if (i12 == childCount) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public final void m54532c(int i11) {
        int childCount = getChildCount();
        if (i11 > childCount) {
            return;
        }
        while (true) {
            View childAt = getChildAt(i11);
            if (childAt instanceof RadioButton) {
                check(((RadioButton) childAt).getId());
                return;
            } else if (i11 != childCount) {
                i11++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54533d() {
        m54532c((getCheckIndex() + 1) % getChildCount());
    }
}
