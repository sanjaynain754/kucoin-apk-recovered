package com.kubi.assets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AssetRnFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J$\u0010\u0018\u001a\u00020\u0014*\u0004\u0018\u00010\u00012\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00140\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0006\u0010\u001e\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/AssetRnFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "rnFragment", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onAgainShow", "checkAddedPreCall", "closure", "Lkotlin/Function1;", "initRn", "reportInvalidRnArgs", "args", "refresh", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetRnFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetRnFragment.kt\ncom/kubi/assets/AssetRnFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1#2:133\n774#3:134\n865#3,2:135\n*S KotlinDebug\n*F\n+ 1 AssetRnFragment.kt\ncom/kubi/assets/AssetRnFragment\n*L\n118#1:134\n118#1:135,2\n*E\n"})
public final class AssetRnFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f16321W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f16322U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f16323V = "Assets";

    /* JADX INFO: compiled from: AssetRnFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/AssetRnFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "KEY_BIZ", "KEY_ENTRY", "KEY_COMPONENT", "KEY_ROUTE", "KEY_IGNORE_BACK", "ENTRY_MAIN", "ROUTE_ASSETS_HOME", "RN_SENSOR_EVENT", "newInstance", "Lcom/kubi/assets/AssetRnFragment;", "args", "Landroid/os/Bundle;", "buildDefaultArgs", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ AssetRnFragment newInstance$default(Companion companion, Bundle bundle, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bundle = null;
            }
            return companion.newInstance(bundle);
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m15147a() {
            AssetRnBundle assetRnBundleM20184a = AssetRnRouteConfig.f19197a.m20184a(AssetRemoteConfig.f18903a.m19573p());
            return BundleKt.bundleOf(TuplesKt.m90091to(Constants.BIZ, assetRnBundleM20184a.getBiz()), TuplesKt.m90091to("entry", "main"), TuplesKt.m90091to(Constants.COMPONENT, assetRnBundleM20184a.getComponent()), TuplesKt.m90091to("route", "AssetsHomePage"), TuplesKt.m90091to("ignoreHandleBackPressed", Boolean.TRUE));
        }

        @JvmStatic
        @NotNull
        public final AssetRnFragment newInstance(@Nullable Bundle args) {
            Bundle bundleM15147a = m15147a();
            if (args != null) {
                bundleM15147a.putAll(args);
            }
            AssetRnFragment assetRnFragment = new AssetRnFragment();
            assetRnFragment.setArguments(bundleM15147a);
            return assetRnFragment;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m15141n3(AssetRnFragment assetRnFragment, BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onPause();
        }
        IReactNativeService.INSTANCE.get().exposeReportSensor(assetRnFragment.f16322U);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m15142o3(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.onResume();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF18113U() {
        return this.f16323V;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m15144l3(BaseFragment baseFragment, Function1<? super BaseFragment, Unit> function1) {
        if (baseFragment == null || !baseFragment.isAdded() || baseFragment.getContext() == null) {
            return;
        }
        function1.invoke(baseFragment);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m15145m3() throws JSONException {
        Bundle bundleM15147a = f16321W.m15147a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundleM15147a.putAll(arguments);
        }
        setArguments(bundleM15147a);
        m15146p3(bundleM15147a);
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(bundleM15147a);
        this.f16322U = rnRootFragment;
        C5286o.m6317a(getChildFragmentManager(), rnRootFragment, R$id.fl_container);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_rn_fragment_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m15146p3(Bundle bundle) throws JSONException {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{Constants.BIZ, "entry", Constants.COMPONENT, "route"});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            String string = bundle.getString((String) obj);
            if (string == null || StringsKt.isBlank(string)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String str = "missing RN args: " + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        C44128b.m97261e("AssetRnFragment", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        C43852m.m96605q("app_rn_sensor", jSONObject);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f16323V = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() throws JSONException {
        super.onAgainShow();
        if (this.f16322U == null) {
            m15145m3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f16322U;
        if (baseFragment != null) {
            m15144l3(baseFragment, new Function1() { // from class: com.kubi.assets.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetRnFragment.m15141n3(this.f19196b, (BaseFragment) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() throws JSONException {
        super.onLoad();
        m15145m3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        String f16323v = getF18113U();
        if (f16323v == null) {
            f16323v = "Assets";
        }
        C43852m.m96595g(f16323v, "tab", null, null, 12, null);
        BaseFragment baseFragment = this.f16322U;
        if (baseFragment != null) {
            m15144l3(baseFragment, new Function1() { // from class: com.kubi.assets.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetRnFragment.m15142o3((BaseFragment) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m15143B0() {
    }
}
