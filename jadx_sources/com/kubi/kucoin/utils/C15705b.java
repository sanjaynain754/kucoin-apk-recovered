package com.kubi.kucoin.utils;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.RadioButton;
import androidx.appcompat.content.res.AppCompatResources;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.app.facade.R$id;
import com.tencent.bugly.proguard.C33863pg;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.b */
/* JADX INFO: compiled from: AsyncBottomTabDrawable.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"TAG", "", "bindAsyncBottomDrawable", "", "Landroid/widget/RadioButton;", "assetName", "normalRes", "", C33863pg.f71438h, "Lcom/kubi/kucoin/utils/BottomLottieGateway;", "LAppFacade_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C15705b {

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.b$a */
    /* JADX INFO: compiled from: AsyncBottomTabDrawable.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/utils/AsyncBottomTabDrawableKt$bindAsyncBottomDrawable$stateDrawable$1", "Landroid/graphics/drawable/StateListDrawable;", "onStateChange", "", "stateSet", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends StateListDrawable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AsyncBottomBinding f28557b;

        public a(AsyncBottomBinding asyncBottomBinding) {
            this.f28557b = asyncBottomBinding;
        }

        @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
        public boolean onStateChange(int[] stateSet) {
            Intrinsics.checkNotNullParameter(stateSet, "stateSet");
            boolean zOnStateChange = super.onStateChange(stateSet);
            this.f28557b.m33122c(getCurrent() == this.f28557b.getF28555c());
            return zOnStateChange;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m33130a(@NotNull RadioButton radioButton, @NotNull String assetName, int i11, @NotNull BottomLottieGateway gateway) {
        Drawable drawableMutate;
        Intrinsics.checkNotNullParameter(radioButton, "<this>");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        int i12 = R$id.bottom_lottie_binding_tag;
        Object tag = radioButton.getTag(i12);
        AsyncBottomBinding asyncBottomBinding = tag instanceof AsyncBottomBinding ? (AsyncBottomBinding) tag : null;
        if (asyncBottomBinding != null) {
            asyncBottomBinding.m33120a();
        }
        Drawable drawable = AppCompatResources.getDrawable(radioButton.getContext(), i11);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        Context context = radioButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableM33065h = bottomMenuHelper.m33065h(context, i11);
        if (drawableM33065h == null) {
            return;
        }
        AsyncBottomBinding asyncBottomBinding2 = new AsyncBottomBinding(radioButton, assetName, drawableM33065h, gateway);
        a aVar = new a(asyncBottomBinding2);
        aVar.addState(new int[]{R.attr.state_checked}, asyncBottomBinding2.getF28555c());
        aVar.addState(new int[0], drawableMutate);
        aVar.setBounds(0, 0, drawableMutate.getMinimumWidth(), drawableMutate.getMinimumHeight());
        radioButton.setTag(i12, asyncBottomBinding2);
        radioButton.addOnAttachStateChangeListener(asyncBottomBinding2);
        radioButton.setCompoundDrawablePadding(C5275i0.m6236a(1.0f));
        radioButton.setCompoundDrawablesRelative(null, aVar, null, null);
        asyncBottomBinding2.m33122c(radioButton.isChecked());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m33131b(RadioButton radioButton, String str, int i11, BottomLottieGateway bottomLottieGateway, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            bottomLottieGateway = DefaultBottomLottieGateway.f28597a;
        }
        m33130a(radioButton, str, i11, bottomLottieGateway);
    }
}
