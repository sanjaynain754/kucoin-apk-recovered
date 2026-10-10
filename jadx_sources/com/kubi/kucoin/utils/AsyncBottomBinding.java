package com.kubi.kucoin.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RadioButton;
import com.tencent.bugly.proguard.C33863pg;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AsyncBottomTabDrawable.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kucoin/utils/AsyncBottomBinding;", "Landroid/view/View$OnAttachStateChangeListener;", TUIConstants.TUIChat.OWNER, "Landroid/widget/RadioButton;", "assetName", "", "selectedFallback", "Landroid/graphics/drawable/Drawable;", C33863pg.f71438h, "Lcom/kubi/kucoin/utils/BottomLottieGateway;", "<init>", "(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/utils/BottomLottieGateway;)V", "selectedDrawable", "Lcom/kubi/kucoin/utils/DeferredLottieDrawable;", "getSelectedDrawable", "()Lcom/kubi/kucoin/utils/DeferredLottieDrawable;", "setActive", "", "active", "", "dispose", "onViewAttachedToWindow", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AsyncBottomBinding implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RadioButton f28554b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeferredLottieDrawable f28555c;

    public AsyncBottomBinding(@NotNull RadioButton owner, @NotNull String assetName, @NotNull Drawable selectedFallback, @NotNull BottomLottieGateway gateway) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(selectedFallback, "selectedFallback");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.f28554b = owner;
        this.f28555c = new DeferredLottieDrawable(owner, assetName, selectedFallback, gateway);
    }

    /* JADX INFO: renamed from: a */
    public final void m33120a() {
        this.f28554b.removeOnAttachStateChangeListener(this);
        this.f28555c.m33202d();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DeferredLottieDrawable getF28555c() {
        return this.f28555c;
    }

    /* JADX INFO: renamed from: c */
    public final void m33122c(boolean z11) {
        this.f28555c.m33204h(z11 && this.f28554b.isAttachedToWindow());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        m33122c(this.f28554b.isChecked());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        this.f28555c.m33204h(false);
    }
}
