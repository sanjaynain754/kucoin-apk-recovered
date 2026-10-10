package com.kubi.kucoin.utils;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.RadioButton;
import androidx.appcompat.content.res.AppCompatResources;
import com.airbnb.lottie.LottieDrawable;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.app.facade.R$color;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.n */
/* JADX INFO: compiled from: BottomMenuHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\r"}, m90084d2 = {"bindBottomTopDrawable", "", "Landroid/widget/RadioButton;", "lottieName", "", "normalRes", "", "isDayTheme", "", "applyBottomSelectedTint", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "LAppFacade_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C15731n {

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.n$a */
    /* JADX INFO: compiled from: BottomMenuHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/utils/BottomMenuHelperKt$bindBottomTopDrawable$selectDrawable$1", "Landroid/graphics/drawable/StateListDrawable;", "onStateChange", "", "stateSet", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends StateListDrawable {
        @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
        public boolean onStateChange(int[] stateSet) {
            Intrinsics.checkNotNullParameter(stateSet, "stateSet");
            boolean zOnStateChange = super.onStateChange(stateSet);
            if (zOnStateChange) {
                Drawable current = getCurrent();
                LottieDrawable lottieDrawable = current instanceof LottieDrawable ? (LottieDrawable) current : null;
                if (lottieDrawable != null) {
                    lottieDrawable.start();
                }
            }
            return zOnStateChange;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Drawable m33152a(@NotNull Drawable drawable, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        drawableMutate.setTint(AppCompatResources.getColorStateList(context, R$color.emphasis).getDefaultColor());
        return drawableMutate;
    }

    /* JADX INFO: renamed from: b */
    public static final void m33153b(@NotNull RadioButton radioButton, @NotNull String lottieName, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(radioButton, "<this>");
        Intrinsics.checkNotNullParameter(lottieName, "lottieName");
        String str = z11 ? "" : "-night";
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        if (bottomMenuHelper.m33070m()) {
            C15705b.m33131b(radioButton, StringsKt.replace$default(lottieName, ".json", str + ".json", false, 4, (Object) null), i11, null, 4, null);
            return;
        }
        a aVar = new a();
        int[] iArr = {R.attr.state_checked};
        Context context = radioButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        aVar.addState(iArr, bottomMenuHelper.m33067j(context, StringsKt.replace$default(lottieName, ".json", str + ".json", false, 4, (Object) null)));
        Drawable drawable = AppCompatResources.getDrawable(radioButton.getContext(), i11);
        aVar.addState(new int[0], drawable);
        Intrinsics.checkNotNull(drawable);
        aVar.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        radioButton.setCompoundDrawablePadding(C5275i0.m6236a(1.0f));
        radioButton.setCompoundDrawablesRelative(null, aVar, null, null);
    }
}
