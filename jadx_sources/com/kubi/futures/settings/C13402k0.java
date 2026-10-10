package com.kubi.futures.settings;

import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Observer;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.settings.k0 */
/* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m90084d2 = {"setStyle", "", "Landroidx/appcompat/widget/AppCompatTextView;", "textColor", "", "bgDrawableId", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13402k0 {

    /* JADX INFO: renamed from: com.kubi.futures.settings.k0$a */
    /* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23372b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23372b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23372b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23372b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m26334a(@NotNull AppCompatTextView appCompatTextView, @ColorRes int i11, @DrawableRes int i12) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "<this>");
        Drawable drawable = ResourcesCompat.getDrawable(appCompatTextView.getResources(), R$drawable.ic2_warning_16, null);
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable != null ? ViewExKt.m36481g(drawable, i11) : null, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatTextView.setBackgroundDrawable(ContextCompat.getDrawable(appCompatTextView.getContext(), i12));
        appCompatTextView.setTextColor(C27017c.f54310a.m66512a(i11));
    }
}
