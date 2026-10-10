package f30;

import android.app.Activity;
import android.net.Uri;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.biz.menu.SpotInformationFragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import gf.C37883g;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: f30.k */
/* JADX INFO: compiled from: SpotRouterEx.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/utils/SpotRouterEx;", "", "<init>", "()V", "jumpDeposit", "", FirebaseAnalytics.Param.CURRENCY, "", "jumpSpotTradeRule", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "quoteMarketRnSpotTradeRuleEnabled", "", "getQuoteMarketRnSpotTradeRuleEnabled", "()Z", "quoteMarketRnSpotTradeRuleEnabled$delegate", "Lkotlin/Lazy;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotRouterEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotRouterEx.kt\ncom/kubi/spot/utils/SpotRouterEx\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,82:1\n35#2,4:83\n39#2:89\n44#3,2:87\n*S KotlinDebug\n*F\n+ 1 SpotRouterEx.kt\ncom/kubi/spot/utils/SpotRouterEx\n*L\n79#1:83,4\n79#1:89\n79#1:87,2\n*E\n"})
public final class C37340k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37340k f82854a = new C37340k();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f82855b = LazyKt.lazy(new Function0() { // from class: f30.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C37340k.m83927k());
        }
    });

    /* JADX INFO: renamed from: f30.k$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m83924g(final String str) throws Exception {
        C37883g.m85550f(str, new Consumer() { // from class: f30.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C37340k.m83925h(str, (CoinInfoEntity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m83926i(CoinInfoEntity coinInfoEntity) {
        InterfaceC37758j.a.m85157f(C37304a.f82764a, coinInfoEntity.getCode(), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m83927k() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_trade_info_rn_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m83928e() {
        return ((Boolean) f82855b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m83929f(@Nullable final String str) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: f30.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37340k.m83924g(str);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: j */
    public final void m83930j(@NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        if (!m83928e()) {
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h != null) {
                BaseActivity.INSTANCE.launch(activityM6125h, SpotInformationFragment.class, new C27051h().m66724h("title", C27017c.f54310a.m66516f(R$string.bkumex_trading_rules, new Object[0])).m66721e("data", symbolInfo).m66717a());
                return;
            }
            return;
        }
        Router.f46192a.m56184f("/krn/router").m4038a(Constants.BIZ, "tradeinfo").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_tradeinfo_rn").m4038a("route", Uri.encode("TradingRulesPage?symbolCode=" + symbolInfo.getCode())).m4048k();
    }

    /* JADX INFO: renamed from: h */
    public static final void m83925h(String str, final CoinInfoEntity coinInfoEntity) {
        String str2;
        if (!coinInfoEntity.isDigital()) {
            C24129b.m58033e(SiteVisibleConfigKey.FiatDeposit, new Function0() { // from class: f30.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C37340k.m83926i(coinInfoEntity);
                }
            });
            return;
        }
        C37304a c37304a = C37304a.f82764a;
        String code = coinInfoEntity.getCode();
        if (code == null) {
            str2 = str;
        } else {
            str2 = code;
        }
        InterfaceC37749a.a.m85110e(c37304a, str2, null, null, null, null, null, 62, null);
    }
}
