package com.kubi.futures.entry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesOptionRnFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J$\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u00012\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00140\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0006\u0010\u001c\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/entry/FuturesOptionRnFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "rnFragment", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkAddedPreCall", "closure", "Lkotlin/Function1;", "onAgainShow", "initRn", "removeRn", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesOptionRnFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f23016W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f23017U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f23018V = "B4tradingOptions";

    /* JADX INFO: compiled from: FuturesOptionRnFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/entry/FuturesOptionRnFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "instance", "Lcom/kubi/futures/entry/FuturesOptionRnFragment;", "args", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FuturesOptionRnFragment instance(@Nullable Bundle args) {
            FuturesOptionRnFragment futuresOptionRnFragment = new FuturesOptionRnFragment();
            futuresOptionRnFragment.setArguments(args);
            return futuresOptionRnFragment;
        }
    }

    /* JADX INFO: renamed from: l3 */
    private final void m25540l3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: m3 */
    private final void m25541m3() {
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(getArguments());
        this.f23017U = rnRootFragment;
        C5286o.m6317a(getChildFragmentManager(), rnRootFragment, R$id.fl_container);
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m25542n3(FuturesOptionRnFragment futuresOptionRnFragment, BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        IReactNativeService.INSTANCE.get().exposeReportSensor(futuresOptionRnFragment.f23017U);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final Unit m25543o3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF23018V() {
        return this.f23018V;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m25544p3() {
        BaseFragment baseFragment = this.f23017U;
        if (baseFragment != null) {
            C5286o.m6325i(baseFragment);
        }
        this.f23017U = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f23018V = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        if (this.f23017U == null) {
            m25541m3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f23017U;
        if (baseFragment != null) {
            m25540l3(baseFragment, new Function1() { // from class: com.kubi.futures.entry.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesOptionRnFragment.m25542n3(this.f23029b, (BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m25541m3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B4tradingOptions", "tab", "FuturesOption", null, 8, null);
        BaseFragment baseFragment = this.f23017U;
        if (baseFragment != null) {
            m25540l3(baseFragment, new Function1() { // from class: com.kubi.futures.entry.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesOptionRnFragment.m25543o3((BaseFragment) obj);
                }
            });
        }
    }
}
