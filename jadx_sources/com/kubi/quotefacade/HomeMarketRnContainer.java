package com.kubi.quotefacade;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeMarketRnContainer.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J$\u0010\u001b\u001a\u00020\u0015*\u0004\u0018\u00010\u00012\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00150\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J0\u0010\"\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0#j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n`$2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010%\u001a\u00020\u0006H\u0002J\u0012\u0010&\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010'\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/quotefacade/HomeMarketRnContainer;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "rnFragment", "pendingRouteBundle", "Landroid/os/Bundle;", "lastDeliveredRouteParams", "", "", "", "isRnInitializing", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", "onArguments", "bundle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onAgainShow", "checkAddedPreCall", "closure", "Lkotlin/Function1;", "restoreRnFragmentIfNeeded", "initRn", "deliverPendingRouteIfNeeded", "hasMeaningfulRouteParams", "buildRouteNotifyData", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "buildRnArgs", "buildRouteWithParams", "releaseRnFragment", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeMarketRnContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMarketRnContainer.kt\ncom/kubi/quotefacade/HomeMarketRnContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class HomeMarketRnContainer extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f40953Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f40954U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public Bundle f40955V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Map<String, ? extends Object> f40956W;

    /* JADX INFO: renamed from: X */
    public boolean f40957X;

    /* JADX INFO: compiled from: HomeMarketRnContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/HomeMarketRnContainer$Companion;", "", "<init>", "()V", "RN_BIZ", "", "RN_ENTRY", "RN_COMPONENT", "RN_ROUTE", "KEY_IGNORE_BACK", "newInstance", "Lcom/kubi/quotefacade/HomeMarketRnContainer;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final HomeMarketRnContainer newInstance() {
            return new HomeMarketRnContainer();
        }
    }

    /* JADX INFO: renamed from: t3 */
    private final void m50168t3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m50170x3(Bundle bundle) {
        BQuoteFacadeDepend.f42592a.m53021a().mo20626g(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m50171y3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m50172z3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final void m50173A3() {
        if (this.f40954U == null) {
            Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.fl_container);
            this.f40954U = fragmentFindFragmentById instanceof BaseFragment ? (BaseFragment) fragmentFindFragmentById : null;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.activity_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: q3 */
    public final Bundle m50174q3() {
        Bundle arguments = this.f40955V;
        if (arguments == null) {
            arguments = getArguments();
        }
        String strEncode = Uri.encode(m50176s3(arguments));
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BIZ, "marketstab");
        bundle.putString("entry", "main");
        bundle.putString(Constants.COMPONENT, "kucoin_markets_tab_rn");
        bundle.putString("isEmbedMode", CredentialEntry.TRUE_STRING);
        bundle.putString("route", strEncode);
        bundle.putBoolean("ignoreHandleBackPressed", true);
        return bundle;
    }

    /* JADX INFO: renamed from: r3 */
    public final HashMap<String, Object> m50175r3(Bundle bundle) {
        HashMap<String, Object> map = new HashMap<>();
        String strM56239b0 = RouteExKt.m56239b0(bundle, "mainTab");
        if (strM56239b0 == null || strM56239b0.length() == 0) {
            map.put("type", Integer.valueOf(C27039d.m66651k(RouteExKt.m56228S(bundle, "type"), -1)));
            map.put("market", C27041f.m66668h(RouteExKt.m56239b0(bundle, "market")));
            map.put("index", C27041f.m66668h(RouteExKt.m56239b0(bundle, "index")));
        } else {
            map.put("mainTab", C27041f.m66668h(RouteExKt.m56239b0(bundle, "mainTab")));
            map.put("subTab", C27041f.m66668h(RouteExKt.m56239b0(bundle, "subTab")));
            map.put("info", C27041f.m66668h(RouteExKt.m56239b0(bundle, "info")));
        }
        String string = bundle.getString("uiStateValue");
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                map.put("uiStateValue", string);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: s3 */
    public final String m50176s3(Bundle bundle) {
        if (bundle == null) {
            return "MarketsTabPage";
        }
        String strM56239b0 = RouteExKt.m56239b0(bundle, "mainTab");
        if (strM56239b0 == null || strM56239b0.length() == 0) {
            int iM66651k = C27039d.m66651k(RouteExKt.m56228S(bundle, "type"), -1);
            if (iM66651k < 0) {
                return "MarketsTabPage";
            }
            return "MarketsTabPage?type=" + iM66651k + "&market=" + C27041f.m66668h(RouteExKt.m56239b0(bundle, "market")) + "&index=" + C27041f.m66668h(RouteExKt.m56239b0(bundle, "index"));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MarketsTabPage");
        sb2.append("?mainTab=");
        sb2.append(C27041f.m66668h(RouteExKt.m56239b0(bundle, "mainTab")));
        sb2.append("&subTab=");
        sb2.append(C27041f.m66668h(RouteExKt.m56239b0(bundle, "subTab")));
        sb2.append("&info=");
        sb2.append(Uri.encode(C27041f.m66668h(RouteExKt.m56239b0(bundle, "info"))));
        String string = bundle.getString("uiStateValue");
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                sb2.append("&uiStateValue=");
                sb2.append(Uri.encode(string));
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m50177u3() {
        Bundle bundle;
        if (this.f40954U == null || (bundle = this.f40955V) == null || !m50178v3(bundle)) {
            return;
        }
        HashMap<String, Object> mapM50175r3 = m50175r3(bundle);
        if (Intrinsics.areEqual(mapM50175r3, this.f40956W)) {
            this.f40955V = null;
            return;
        }
        IReactNativeService.INSTANCE.get().nativeNotifyRn("MarketTabChanged", MapsKt.hashMapOf(TuplesKt.m90091to("route", "MarketsTabPage"), TuplesKt.m90091to(ReportDataTable.COLUMN_PARAMS, mapM50175r3)));
        this.f40956W = mapM50175r3;
        this.f40955V = null;
    }

    /* JADX INFO: renamed from: v3 */
    public final boolean m50178v3(Bundle bundle) {
        String string = bundle.getString("uiStateValue");
        if (string != null && string.length() != 0) {
            return true;
        }
        String strM56239b0 = RouteExKt.m56239b0(bundle, "mainTab");
        return !(strM56239b0 == null || strM56239b0.length() == 0) || C27039d.m66651k(RouteExKt.m56228S(bundle, "type"), -1) >= 0;
    }

    public HomeMarketRnContainer() {
        setPageId("B5MarketsTab");
    }

    /* JADX INFO: renamed from: w3 */
    private final void m50169w3() {
        m50173A3();
        if (this.f40954U == null && !this.f40957X) {
            this.f40957X = true;
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeMarketRnContainer$initRn$1(this, null), 3, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        m50173A3();
        if (this.f40954U == null) {
            m50169w3();
        }
        m50177u3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable final Bundle bundle) {
        super.onArguments(bundle);
        if (bundle == null) {
            return;
        }
        if (m50178v3(bundle)) {
            this.f40955V = new Bundle(bundle);
            this.f40956W = null;
            m50177u3();
        }
        C24129b.m58033e(SiteVisibleConfigKey.CopyTrading, new Function0() { // from class: com.kubi.quotefacade.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeMarketRnContainer.m50170x3(bundle);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f40954U;
        if (baseFragment != null) {
            m50168t3(baseFragment, new Function1() { // from class: com.kubi.quotefacade.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeMarketRnContainer.m50171y3((BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        Bundle bundle;
        super.onLoad();
        if (this.f40955V == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = new Bundle(arguments);
            } else {
                bundle = null;
            }
            this.f40955V = bundle;
        }
        m50169w3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        BaseFragment baseFragment = this.f40954U;
        if (baseFragment != null) {
            m50168t3(baseFragment, new Function1() { // from class: com.kubi.quotefacade.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeMarketRnContainer.m50172z3((BaseFragment) obj);
                }
            });
        }
        m50177u3();
    }
}
