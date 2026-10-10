package com.kubi.copytrading.quote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.api.IReactNativeServiceKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradeQuoteRnFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J$\u0010\u001b\u001a\u00020\u0015*\u0004\u0018\u00010\u00012\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00150\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\""}, m90084d2 = {"Lcom/kubi/copytrading/quote/CopyTradeQuoteRnFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "entrySource", "", "rnFragment", "pageId", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "locationId", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkAddedPreCall", "closure", "Lkotlin/Function1;", "onAgainShow", "initRn", "removeRn", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradeQuoteRnFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradeQuoteRnFragment.kt\ncom/kubi/copytrading/quote/CopyTradeQuoteRnFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,115:1\n76#2,7:116\n*S KotlinDebug\n*F\n+ 1 CopyTradeQuoteRnFragment.kt\ncom/kubi/copytrading/quote/CopyTradeQuoteRnFragment\n*L\n58#1:116,7\n*E\n"})
public final class CopyTradeQuoteRnFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f19944X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public final String f19945U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public BaseFragment f19946V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public String f19947W;

    /* JADX INFO: compiled from: CopyTradeQuoteRnFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/copytrading/quote/CopyTradeQuoteRnFragment$Companion;", "", "<init>", "()V", "EXTRA_ENTRY_SOURCE", "", "FROM_QUOTES", "FROM_FUTURES", "instance", "Lcom/kubi/copytrading/quote/CopyTradeQuoteRnFragment;", "args", "Landroid/os/Bundle;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CopyTradeQuoteRnFragment instance(@Nullable Bundle args) {
            CopyTradeQuoteRnFragment copyTradeQuoteRnFragment = new CopyTradeQuoteRnFragment();
            copyTradeQuoteRnFragment.setArguments(args);
            return copyTradeQuoteRnFragment;
        }
    }

    /* JADX INFO: renamed from: l3 */
    private final void m20906l3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: m3 */
    private final void m20907m3() {
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(getArguments());
        this.f19946V = rnRootFragment;
        C5286o.m6317a(getChildFragmentManager(), rnRootFragment, R$id.fl_container);
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m20908o3(CopyTradeQuoteRnFragment copyTradeQuoteRnFragment, BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        IReactNativeService.INSTANCE.get().exposeReportSensor(copyTradeQuoteRnFragment.f19946V);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m20909p3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF16323V() {
        return this.f19947W;
    }

    /* JADX INFO: renamed from: n3 */
    public final String m20910n3() {
        String str = this.f19945U;
        return (!Intrinsics.areEqual(str, "quotes") && Intrinsics.areEqual(str, SearchCategory$Companion.FUTURES)) ? "copytrade" : "copyTradeTab2";
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            IReactNativeServiceKt.SENSORS_RN_TRACK_EVENT.length();
        }
        C12572a.m23692a(this, false, new C11560xdb959327(IReactNativeServiceKt.SENSORS_RN_TRACK_EVENT, null));
    }

    /* JADX INFO: renamed from: q3 */
    public final void m20911q3() {
        BaseFragment baseFragment = this.f19946V;
        if (baseFragment != null) {
            C5286o.m6325i(baseFragment);
        }
        this.f19946V = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f19947W = str;
    }

    public CopyTradeQuoteRnFragment() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("entrySource");
        } else {
            string = null;
        }
        this.f19945U = string;
        String str = "B20CopyTradeCopyTradeMain";
        if (!Intrinsics.areEqual(string, "quotes") && Intrinsics.areEqual(string, SearchCategory$Companion.FUTURES)) {
            str = "B6FuturesTrade";
        }
        this.f19947W = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        if (this.f19946V == null) {
            m20907m3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f19946V;
        if (baseFragment != null) {
            m20906l3(baseFragment, new Function1() { // from class: com.kubi.copytrading.quote.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CopyTradeQuoteRnFragment.m20908o3(this.f19948b, (BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m20907m3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        String f19947w = getF16323V();
        if (f19947w == null) {
            f19947w = "";
        }
        C43852m.m96595g(f19947w, "tab", m20910n3(), null, 8, null);
        BaseFragment baseFragment = this.f19946V;
        if (baseFragment != null) {
            m20906l3(baseFragment, new Function1() { // from class: com.kubi.copytrading.quote.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CopyTradeQuoteRnFragment.m20909p3((BaseFragment) obj);
                }
            });
        }
    }
}
