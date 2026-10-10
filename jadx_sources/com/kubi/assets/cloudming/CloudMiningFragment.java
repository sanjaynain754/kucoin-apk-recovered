package com.kubi.assets.cloudming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.cloudming.CloudMiningFragment;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CloudMiningFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J$\u0010\u0019\u001a\u00020\u0014*\u0004\u0018\u00010\u00012\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00140\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0006\u0010\u001e\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/cloudming/CloudMiningFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "rnFragment", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkAddedPreCall", "closure", "Lkotlin/Function1;", "onAgainShow", "initRn", "removeRn", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CloudMiningFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f16843W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f16844U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f16845V = "CloudMining";

    /* JADX INFO: compiled from: CloudMiningFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/cloudming/CloudMiningFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/assets/cloudming/CloudMiningFragment;", "args", "Landroid/os/Bundle;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CloudMiningFragment instance(@Nullable Bundle args) {
            CloudMiningFragment cloudMiningFragment = new CloudMiningFragment();
            cloudMiningFragment.setArguments(args);
            return cloudMiningFragment;
        }
    }

    /* JADX INFO: renamed from: l3 */
    private final void m15836l3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: m3 */
    private final void m15837m3() {
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(getArguments());
        this.f16844U = rnRootFragment;
        C5286o.m6317a(getChildFragmentManager(), rnRootFragment, R$id.fl_container);
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m15838n3(CloudMiningFragment cloudMiningFragment, BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        IReactNativeService.INSTANCE.get().exposeReportSensor(cloudMiningFragment.f16844U);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final Unit m15839o3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF16845V() {
        return this.f16845V;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.cloud_mining_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f16845V = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        if (this.f16844U == null) {
            m15837m3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f16844U;
        if (baseFragment != null) {
            m15836l3(baseFragment, new Function1() { // from class: ra.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CloudMiningFragment.m15838n3(this.f97175b, (BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m15837m3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        String f16845v = getF16845V();
        if (f16845v == null) {
            f16845v = "";
        }
        C43852m.m96595g(f16845v, "tab", null, null, 12, null);
        BaseFragment baseFragment = this.f16844U;
        if (baseFragment != null) {
            m15836l3(baseFragment, new Function1() { // from class: ra.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CloudMiningFragment.m15839o3((BaseFragment) obj);
                }
            });
        }
    }
}
