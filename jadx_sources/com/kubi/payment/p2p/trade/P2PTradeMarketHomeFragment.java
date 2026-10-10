package com.kubi.payment.p2p.trade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.R$font;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PTradeMarketHomeFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketHomeFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "hasP2PExpressEntrance", "", "getHasP2PExpressEntrance", "()Z", "hasP2PExpressEntrance$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PTradeMarketHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketHomeFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketHomeFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,77:1\n153#2,7:78\n35#3,4:85\n39#3:91\n44#4,2:89\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketHomeFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketHomeFragment\n*L\n71#1:78,7\n29#1:85,4\n29#1:91\n29#1:89,2\n*E\n"})
public final class P2PTradeMarketHomeFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f39996U = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(P2PTradeMarketHomeFragment.m49146n3());
        }
    });

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketHomeFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21241a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketHomeFragment$b */
    /* JADX INFO: compiled from: P2PTradeMarketHomeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/p2p/trade/P2PTradeMarketHomeFragment$onViewCreated$2", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21242b extends FragmentStateAdapter {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ List<Pair<String, Fragment>> f39997i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21242b(P2PTradeMarketHomeFragment p2PTradeMarketHomeFragment, List<Pair<String, Fragment>> list) {
            super(p2PTradeMarketHomeFragment);
            this.f39997i = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int position) {
            return this.f39997i.get(position).getSecond();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f39997i.size();
        }
    }

    /* JADX INFO: renamed from: m3 */
    private final boolean m49145m3() {
        return ((Boolean) this.f39996U.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n3 */
    public static final boolean m49146n3() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21241a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_express", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m49148p3(ViewPager2 viewPager2, List list, TabLayout tabLayout, TabLayout.Tab tab, int i11) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Context context = viewPager2.getContext();
        Intrinsics.checkNotNull(context);
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setText((CharSequence) ((Pair) list.get(i11)).getFirst());
        baseTextView.setTextSize(2, 18.0f);
        baseTextView.setTextColor(tabLayout.getTabTextColors());
        baseTextView.setTypeface(ResourcesCompat.getFont(context, R$font.semi));
        tab.setCustomView(baseTextView);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.p2p_trade_market_home_layout, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intent intent;
        String strM56282x;
        Intent intent2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketHomeFragment.m49147o3(this.f40094b);
            }
        }, 1, null);
        final TabLayout tabLayout = (TabLayout) view.findViewById(R$id.tab_layout);
        final ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R$id.view_pager);
        FragmentActivity activity = getActivity();
        String strM56280w = (activity == null || (intent2 = activity.getIntent()) == null) ? null : RouteExKt.m56280w(intent2, "spm");
        FragmentActivity activity2 = getActivity();
        String str = "BUY";
        if (activity2 != null && (intent = activity2.getIntent()) != null && (strM56282x = RouteExKt.m56282x(intent, "side", "BUY")) != null) {
            str = strM56282x;
        }
        final List listMutableListOf = CollectionsKt.mutableListOf(TuplesKt.m90091to(getStringRes(R$string.otc, new Object[0]), P2PTradeMarketFragment.f39978k0.newInstance(strM56280w, str)));
        if (m49145m3()) {
            listMutableListOf.add(TuplesKt.m90091to(getStringRes(R$string.payment_p2p_exprerss_title, new Object[0]), P2PExpressFragment.f39977Y.newInstance()));
        }
        viewPager2.setUserInputEnabled(false);
        viewPager2.setAdapter(new C21242b(this, listMutableListOf));
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.kubi.payment.p2p.trade.p0
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i11) {
                P2PTradeMarketHomeFragment.m49148p3(viewPager2, listMutableListOf, tabLayout, tab, i11);
            }
        }).attach();
        if (m49145m3()) {
            if (C12573b.f21598a.m23696a()) {
                "switch_express_tab".length();
            }
            C12572a.m23692a(this, false, new C21243x7e6d9aff("switch_express_tab", null, viewPager2));
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m49147o3(P2PTradeMarketHomeFragment p2PTradeMarketHomeFragment) {
        FragmentActivity activity = p2PTradeMarketHomeFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }
}
