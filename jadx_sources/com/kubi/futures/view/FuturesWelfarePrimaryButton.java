package com.kubi.futures.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.button.KcPrimaryButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfarePrimaryButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "generateBound", "hideLoading", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesWelfarePrimaryButton extends KcPrimaryButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesWelfarePrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesWelfarePrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.button.KcPrimaryButton
    /* JADX INFO: renamed from: k */
    public int mo28850k() {
        return C5275i0.m6236a(7.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesWelfarePrimaryButton(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.button.KcPrimaryButton
    /* JADX INFO: renamed from: l */
    public void mo28851l() {
        super.mo28851l();
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
