package com.kubi.assets.interceptor;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.knb.CryptoInfoParseHelper;
import com.kubi.assets.search.depositandwithdraw.SearchCoinFiatFragment;
import com.kubi.assets.search.depositandwithdraw.SearchCoinFragment;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.withdraw.WithdrawForbiddenFragment;
import com.kubi.assets.withdraw.WithdrawFragment;
import com.kubi.assets.withdraw.v5;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.utils.C23636b;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import gf.C37890n;
import il.C38661c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawRouteInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J2\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0013H\u0002J \u0010 \u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0002J4\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020%H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/interceptor/WithdrawRouteInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", FirebaseAnalytics.Param.CURRENCY, "", "address", "platFrom", "tabMark", "setCode", "", "postcard", "Lcom/kubi/router/model/Postcard;", "setAddress", "setPlatFrom", "setTabMark", "getType", "", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "handleAddressWithWeb3Info", "handleJump", DbParams.KEY_CHANNEL_RESULT, "goWithdraw", "code", "spmId", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "goSearchCoinFiatFragment", "isShowFiat", "checkWithdraw", "callBack", "Lkotlin/Function0;", "requestWithdrawLimit", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "Lcom/kubi/assets/entity/BlackGroupResponse;", "api", "Lcom/kubi/assets/AssetV2Api;", "(Lcom/kubi/assets/AssetV2Api;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpToWithdrawForbiddenFragment", "it", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawRouteInterceptor extends C38661c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f17774a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f17775b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f17776c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f17777d;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m17423l(WithdrawRouteInterceptor withdrawRouteInterceptor, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        withdrawRouteInterceptor.m17431k(str, z11);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17424m(boolean z11, String str, WithdrawRouteInterceptor withdrawRouteInterceptor) {
        v5.a.p(false);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextM56289c = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
        companion.launch(contextM56289c, z11 ? SearchCoinFiatFragment.class : SearchCoinFragment.class, new C27051h().m66720d("from", 2).m66724h("type", "fiat_withdraw").m66724h(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING).m66724h("address", str).m66724h("platFrom", withdrawRouteInterceptor.f17776c).m66724h("tabMark", withdrawRouteInterceptor.f17777d).m66724h("page", (str == null || str.length() == 0) ? "default" : "homepageScan").m66717a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m17425o(WithdrawRouteInterceptor withdrawRouteInterceptor, String str, String str2, String str3, CoinInfoEntity coinInfoEntity, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            coinInfoEntity = null;
        }
        withdrawRouteInterceptor.m17432n(str, str2, str3, coinInfoEntity);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m17426p(String str, String str2, String str3, CoinInfoEntity coinInfoEntity) {
        WithdrawFragment.Companion companion = WithdrawFragment.a0;
        Context contextM56289c = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
        companion.startWithdrawFragment(contextM56289c, str, str2, (String) null, str3, coinInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m17428t(WithdrawRouteInterceptor withdrawRouteInterceptor, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        withdrawRouteInterceptor.m17434s(str);
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c() || AssetsHelper.f18684a.m19169m()) {
            return true;
        }
        C4400a postcard = chain.getPostcard();
        m17438x(postcard);
        m17437w(postcard);
        m17439y(postcard);
        m17440z(postcard);
        String str = this.f17775b;
        if (str == null || str.length() <= 0) {
            String str2 = this.f17774a;
            if (str2 != null && str2.length() != 0) {
                m17428t(this, null, 1, null);
            } else if (!(Intrinsics.areEqual(this.f17776c, "kucoinpay") && C24129b.m58030b(SiteVisibleConfigKey.KucoinPay)) && m17430j(postcard) == 1) {
                m17423l(this, this.f17775b, false, 2, null);
            } else {
                m17431k(this.f17775b, false);
            }
        } else {
            String str3 = this.f17775b;
            if (str3 == null) {
                str3 = "";
            }
            m17433q(str3);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m17429i(String str, Function0<Unit> function0) {
        MviExKt.m42518n(new WithdrawRouteInterceptor$checkWithdraw$1(this, function0, str, null));
    }

    /* JADX INFO: renamed from: k */
    public final void m17431k(final String str, final boolean z11) {
        if (AssetRemoteConfig.f18903a.m19577t()) {
            AssetsHelper.m19145s(AssetsHelper.f18684a, C27041f.m66668h(str), null, C27041f.m66668h(this.f17776c), C27041f.m66668h(this.f17777d), z11, (str == null || str.length() == 0) ? "default" : "homepageScan", 2, null);
        } else {
            m17429i(str, new Function0() { // from class: com.kubi.assets.interceptor.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawRouteInterceptor.m17424m(z11, str, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17432n(final String str, final String str2, final String str3, final CoinInfoEntity coinInfoEntity) {
        if (AssetRemoteConfig.f18903a.m19577t()) {
            AssetsHelper.f18684a.m19172q(str, C27041f.m66668h(str2), str3);
        } else {
            m17429i(str2, new Function0() { // from class: com.kubi.assets.interceptor.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawRouteInterceptor.m17426p(str, str2, str3, coinInfoEntity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m17433q(String str) {
        CryptoInfoParseHelper cryptoInfoParseHelper = CryptoInfoParseHelper.f17849a;
        if (!cryptoInfoParseHelper.m17519c(str)) {
            cryptoInfoParseHelper.m17521e(str, new Function1() { // from class: com.kubi.assets.interceptor.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WithdrawRouteInterceptor.m17427r(this.f17788b, (String) obj);
                }
            });
            return;
        }
        String str2 = cryptoInfoParseHelper.m17522g(str).get("coin");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m17434s(str2);
    }

    /* JADX INFO: renamed from: s */
    public final void m17434s(String str) {
        C37890n c37890n = C37890n.f85269a;
        if (str == null && (str = this.f17774a) == null) {
            str = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        if (coinInfoEntityM85613u != null) {
            String str2 = this.f17774a;
            m17425o(this, str2 == null ? "" : str2, this.f17775b, null, coinInfoEntityM85613u, 4, null);
            return;
        }
        String str3 = this.f17774a;
        if (str3 != null) {
            m17425o(this, str3, this.f17775b, null, null, 12, null);
        } else {
            m17423l(this, this.f17775b, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m17435u(BlackGroupResponse blackGroupResponse) {
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextM56289c = C23636b.m56289c();
        Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
        companion.launch(contextM56289c, WithdrawForbiddenFragment.class, new C27051h().m66721e("data", blackGroupResponse).m66724h("title", C27017c.f54310a.m66516f(R$string.forbidden_withdraw, new Object[0])).m66717a());
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m17427r(WithdrawRouteInterceptor withdrawRouteInterceptor, String str) {
        withdrawRouteInterceptor.m17434s(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final int m17430j(C4400a c4400a) {
        return RouteExKt.m56262n(c4400a.getBundle(), "type", 1);
    }

    /* JADX INFO: renamed from: v */
    public final Object m17436v(AssetV2Api assetV2Api, Function0<Unit> function0, String str, Continuation<? super C19334f<BlackGroupResponse>> continuation) {
        return RetrofitFlowExKt.m42824e(assetV2Api.m17148m1(), false, new WithdrawRouteInterceptor$requestWithdrawLimit$2(this, function0, str, null), continuation, 1, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m17437w(C4400a c4400a) {
        this.f17775b = RouteExKt.m56284y(c4400a.getBundle(), "address");
    }

    /* JADX INFO: renamed from: x */
    public final void m17438x(C4400a c4400a) {
        Bundle bundle = c4400a.getBundle();
        String strM56284y = RouteExKt.m56284y(bundle, "coin");
        if (strM56284y == null) {
            strM56284y = RouteExKt.m56284y(bundle, FirebaseAnalytics.Param.CURRENCY);
        }
        this.f17774a = strM56284y;
    }

    /* JADX INFO: renamed from: y */
    public final void m17439y(C4400a c4400a) {
        this.f17776c = RouteExKt.m56284y(c4400a.getBundle(), "platFrom");
    }

    /* JADX INFO: renamed from: z */
    public final void m17440z(C4400a c4400a) {
        this.f17777d = RouteExKt.m56284y(c4400a.getBundle(), "tabMark");
    }
}
