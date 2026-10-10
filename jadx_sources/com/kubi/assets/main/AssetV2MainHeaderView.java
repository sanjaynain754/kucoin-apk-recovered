package com.kubi.assets.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.MainRecommendData;
import com.kubi.assets.entity.MainRecommendDataItem;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.assets.main.view.MainRecommendView;
import com.kubi.assets.main.view.MainSubRecommendView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24128a;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37885i;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p402kf.C41014a;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44759e6;
import p830zf.InterfaceC46805j0;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AssetV2MainHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\"\u0010\u001d\u001a\u00020\u00152\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\n\u0012\u0004\u0012\u00020 \u0018\u0001`!J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0015H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewMainAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewMainAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/main/AssetV2MainFragment;", "getFragment", "()Lcom/kubi/assets/main/AssetV2MainFragment;", "setFragment", "(Lcom/kubi/assets/main/AssetV2MainFragment;)V", "bindFragment", "", "assetV2MainFragment", "initView", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "showRecommendView", "mainRecommendData", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/MainRecommendData;", "Lkotlin/collections/ArrayList;", "showKuCardView", "kuCardStatus", "", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAssetV2MainHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainHeaderView.kt\ncom/kubi/assets/main/AssetV2MainHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,222:1\n52#2:223\n80#2,7:224\n17#3,2:231\n51#4,3:233\n*S KotlinDebug\n*F\n+ 1 AssetV2MainHeaderView.kt\ncom/kubi/assets/main/AssetV2MainHeaderView\n*L\n60#1:223\n60#1:224,7\n188#1:231,2\n93#1:233,3\n*E\n"})
public final class AssetV2MainHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f17917d = {Reflection.property1(new PropertyReference1Impl(AssetV2MainHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewMainAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f17918b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetV2MainFragment f17919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2MainHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17918b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44759e6>() { // from class: com.kubi.assets.main.AssetV2MainHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44759e6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44759e6.m99032a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_main_assets_header, this);
    }

    private final C44759e6 getBinding() {
        return (C44759e6) this.f17918b.getValue(this, f17917d[0]);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17689m() {
        C37304a c37304a = C37304a.f82764a;
        Uri uri = Uri.parse(EarnUrlConfig.f17409a.m16754d());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        C4400a c4400a = new C4400a(uri, null, 2, null);
        Boolean bool = Boolean.TRUE;
        InterfaceC37766r.a.m85190a(c37304a, c4400a.m4038a("dark", bool).m4038a("loading", 2).m4038a("appNeedLang", bool).m4045h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m17690n() {
        AssetsDepend.f18689a.m19184e().mo43958e();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17691o(AssetV2MainHeaderView assetV2MainHeaderView) {
        AssetV2MainFragment assetV2MainFragment = assetV2MainHeaderView.f17919c;
        if (assetV2MainFragment != null) {
            MviExKt.m42519o(assetV2MainFragment, new AssetV2MainHeaderView$initListener$9$1$1(assetV2MainFragment, null));
        }
        C43852m.m96591c("B1mainAccount", "redenvelop", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m17692p() {
        AssetsHelper.f18684a.m19157L();
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m17693q() {
        C43852m.m96590b("B1mainAccount", ChannelKycRequest.SCENE_DEPOSIT, "1", TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.m19137F(AssetsHelper.f18684a, C43852m.m96602n("B1mainAccount", ChannelKycRequest.SCENE_DEPOSIT, null, 4, null), 0, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m17695s() {
        C43852m.m96591c("B1mainAccount", "transfer", "1", null, 8, null);
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, null, C43852m.m96602n("B1mainAccount", "transfer", null, 4, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m17696u(BGABanner bGABanner, View itemView, MainRecommendData mainRecommendData, int i11) {
        final String jumpUrl;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (mainRecommendData != null) {
            MainRecommendView mainRecommendView = (MainRecommendView) itemView.findViewById(R$id.recommend);
            MainSubRecommendView mainSubRecommendView = (MainSubRecommendView) itemView.findViewById(R$id.subRecommend);
            final MainRecommendDataItem data = mainRecommendData.getData();
            int f38450c = mainRecommendData.getF38450c();
            if (f38450c == 1) {
                mainRecommendView.setData(data);
                Intrinsics.checkNotNull(mainSubRecommendView);
                ViewExtKt.m66577h(mainSubRecommendView);
            } else if (f38450c == 2) {
                mainSubRecommendView.setData(data);
                Intrinsics.checkNotNull(mainRecommendView);
                ViewExtKt.m66577h(mainRecommendView);
            }
            if (data == null || (jumpUrl = data.getJumpUrl()) == null || TextUtils.isEmpty(jumpUrl)) {
                return;
            }
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.main.z
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17697v(jumpUrl, data);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m17697v(String str, MainRecommendDataItem mainRecommendDataItem) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("activityType", mainRecommendDataItem.getCategory());
        jSONObject.put("coin", mainRecommendDataItem.getCurrency());
        jSONObject.put("tag", mainRecommendDataItem.getYield());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1mainAccount", "ADBanner", "1", jSONObject);
        Router.f46192a.m56184f(str).m4048k();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getFragment, reason: from getter */
    public final AssetV2MainFragment getF17919c() {
        return this.f17919c;
    }

    /* JADX INFO: renamed from: j */
    public final void m17698j(@NotNull AssetV2MainFragment assetV2MainFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetV2MainFragment, "assetV2MainFragment");
        this.f17919c = assetV2MainFragment;
        C44759e6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f99840b) != null) {
            accountInfoHeaderView.mo19955d(assetV2MainFragment, "B1mainAccount");
        }
        m17701t();
        m17700l();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m17699k(@NotNull AssetV2OverviewEntity asset) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        Intrinsics.checkNotNullParameter(asset, "asset");
        AssetSingleEntity mainAsset = asset.getMainAsset();
        C44759e6 binding = getBinding();
        if (binding == null || (accountInfoHeaderView = binding.f99840b) == null) {
            return;
        }
        String strM89950x = null;
        String strM66669i = C27041f.m66669i((mainAsset == null || (totalBalance2 = mainAsset.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance2, asset.getBaseCurrency(), C11273q.m20046b(asset.getBaseCurrency())), "--");
        if (mainAsset != null && (totalBalance = mainAsset.getTotalBalance()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(totalBalance, asset.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null);
        }
        accountInfoHeaderView.m19942B(asset, strM66669i, C27041f.m66669i(strM89950x, "--"));
    }

    public final void setFragment(@Nullable AssetV2MainFragment assetV2MainFragment) {
        this.f17919c = assetV2MainFragment;
    }

    /* JADX INFO: renamed from: w */
    public final void m17702w(boolean z11) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        if (z11) {
            C44759e6 binding = getBinding();
            if (binding == null || (linearLayoutCompat = binding.f99846h) == null) {
                return;
            }
            ViewExtKt.m66594y(linearLayoutCompat);
            return;
        }
        C44759e6 binding2 = getBinding();
        if (binding2 == null || (linearLayoutCompat2 = binding2.f99846h) == null) {
            return;
        }
        ViewExtKt.m66577h(linearLayoutCompat2);
    }

    /* JADX INFO: renamed from: x */
    public final void m17703x(@Nullable ArrayList<MainRecommendData> arrayList) {
        BGABanner bGABanner;
        BGABanner bGABanner2;
        if (arrayList == null || arrayList.isEmpty()) {
            C44759e6 binding = getBinding();
            if (binding == null || (bGABanner = binding.f99849k) == null) {
                return;
            }
            ViewExtKt.m66577h(bGABanner);
            return;
        }
        C44759e6 binding2 = getBinding();
        if (binding2 == null || (bGABanner2 = binding2.f99849k) == null) {
            return;
        }
        C43852m.m96595g("B1mainAccount", "ADBanner", "1", null, 8, null);
        ViewExtKt.m66594y(bGABanner2);
        bGABanner2.setAutoPlayAble(arrayList.size() != 1);
        bGABanner2.setData(R$layout.asset_item_main_recommend, arrayList, (List<String>) null);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m17694r() {
        C43852m.m96590b("B1mainAccount", ChannelKycRequest.SCENE_WITHDRAW, "1", TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        C43841b.m96557d("B1withdrawCoinList_choose_coin_load", "page_load_start", null, 4, null);
        AssetsHelper.f18684a.m19159O();
        return Unit.INSTANCE;
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44759e6 binding = getBinding();
        if (binding != null) {
            return binding.f99840b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m17700l() {
        boolean zMo17774a;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        VerticalIconTextBtn verticalIconTextBtn;
        C44759e6 binding;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        VerticalIconTextBtn verticalIconTextBtn4;
        VerticalIconTextBtn verticalIconTextBtn5;
        VerticalIconTextBtn verticalIconTextBtn6;
        AccountInfoHeaderView accountInfoHeaderView;
        C44759e6 binding2 = getBinding();
        if (binding2 != null && (accountInfoHeaderView = binding2.f99840b) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeaderView, new Action() { // from class: com.kubi.assets.main.r
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2MainHeaderView.m17692p();
                }
            }, null, R$drawable.ic2_history_20, 0, 0, null, false, false, 186, null);
        }
        C44759e6 binding3 = getBinding();
        if (binding3 != null && (verticalIconTextBtn6 = binding3.f99850l) != null) {
            C27046k.m66711z(verticalIconTextBtn6, 0L, new Function0() { // from class: com.kubi.assets.main.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17693q();
                }
            }, 1, null);
        }
        C44759e6 binding4 = getBinding();
        if (binding4 != null && (verticalIconTextBtn5 = binding4.f99852n) != null) {
            C27046k.m66711z(verticalIconTextBtn5, 0L, new Function0() { // from class: com.kubi.assets.main.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17694r();
                }
            }, 1, null);
        }
        C44759e6 binding5 = getBinding();
        if (binding5 != null && (verticalIconTextBtn4 = binding5.f99851m) != null) {
            C27046k.m66711z(verticalIconTextBtn4, 0L, new Function0() { // from class: com.kubi.assets.main.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17695s();
                }
            }, 1, null);
        }
        C44759e6 binding6 = getBinding();
        if (binding6 != null && (verticalIconTextBtn3 = binding6.f99844f) != null) {
            AssetExKt.m15138z(verticalIconTextBtn3, C24129b.m58030b(SiteVisibleConfigKey.Financing));
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46805j0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo17774a = ((InterfaceC46805j0) objM56186h).mo17774a();
        } else {
            zMo17774a = false;
        }
        if (zMo17774a && (binding = getBinding()) != null && (verticalIconTextBtn2 = binding.f99844f) != null) {
            String string = getResources().getString(R$string.homepage_stake);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            verticalIconTextBtn2.setLabel(string);
        }
        C44759e6 binding7 = getBinding();
        if (binding7 != null && (verticalIconTextBtn = binding7.f99844f) != null) {
            C27046k.m66711z(verticalIconTextBtn, 0L, new Function0() { // from class: com.kubi.assets.main.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17689m();
                }
            }, 1, null);
        }
        C44759e6 binding8 = getBinding();
        if (binding8 != null && (linearLayoutCompat3 = binding8.f99846h) != null) {
            C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.assets.main.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17690n();
                }
            }, 1, null);
        }
        C44759e6 binding9 = getBinding();
        if (binding9 != null && (linearLayoutCompat2 = binding9.f99848j) != null) {
            AssetExKt.m15138z(linearLayoutCompat2, C24128a.m58028a());
        }
        C44759e6 binding10 = getBinding();
        if (binding10 != null && (linearLayoutCompat = binding10.f99848j) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.assets.main.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainHeaderView.m17691o(this.f17973b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m17701t() {
        BGABanner bGABanner;
        C44759e6 binding = getBinding();
        if (binding != null && (bGABanner = binding.f99849k) != null) {
            bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.assets.main.y
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner2, View view, Object obj, int i11) {
                    AssetV2MainHeaderView.m17696u(bGABanner2, view, (MainRecommendData) obj, i11);
                }
            });
        }
    }
}
