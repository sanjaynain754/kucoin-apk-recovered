package com.kubi.assets.bot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.bot.BotAssetContainerFragment;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BotAssetContainerFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/bot/BotAssetContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "botAssetFragment", "getBotAssetFragment", "()Lcom/kubi/sdk/BaseFragment;", "botAssetFragment$delegate", "Lkotlin/Lazy;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "getRealFragment", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f16839W = new Companion(null);

    /* JADX INFO: renamed from: U */
    public boolean f16840U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f16841V = LazyKt.lazy(new Function0() { // from class: qa.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BotAssetContainerFragment.m15831k3();
        }
    });

    /* JADX INFO: compiled from: BotAssetContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/bot/BotAssetContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/bot/BotAssetContainerFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BotAssetContainerFragment newInstance() {
            return new BotAssetContainerFragment();
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static final BaseFragment m15831k3() {
        return AssetsDepend.f18689a.m19188i().mo64268l();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18042Y() {
        return this.f16840U;
    }

    /* JADX INFO: renamed from: l3 */
    public final BaseFragment m15832l3() {
        return (BaseFragment) this.f16841V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_bot_asset_container, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f16840U = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: m3 */
    public final BaseFragment m15833m3() {
        return m15832l3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (!getChildFragmentManager().isDestroyed() && !getChildFragmentManager().isStateSaved() && !m15832l3().isAdded()) {
            getChildFragmentManager().beginTransaction().replace(R$id.fl_container, m15832l3()).commitAllowingStateLoss();
        }
    }
}
