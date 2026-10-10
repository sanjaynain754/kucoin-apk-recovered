package com.kubi.quotefacade.helper;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import gf.C37878b0;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p294gz.C38057a;
import p321hv.InterfaceC38355e;
import p321hv.InterfaceC38356f;
import p321hv.InterfaceC38357g;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.h2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteConfigHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0005J\r\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u0005H\u0000¢\u0006\u0002\b#J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteConfigHelper;", "", "<init>", "()V", "isShowKline", "", "()Z", "isShowAlpha", "quoteMemeConfig", "getQuoteMemeConfig", "quoteAiFeedConfig", "getQuoteAiFeedConfig", "isFavTabShow", "isFavTabShow$QuoteFacadeLib_googleRelease", "isFavHasSubTab", "isFavHasSubTab$QuoteFacadeLib_googleRelease", "isFavSpotShow", "isFavSpotShow$QuoteFacadeLib_googleRelease", "isFavFuturesShow", "isFavFuturesShow$QuoteFacadeLib_googleRelease", "isShowAlphaOnDo", "isShowAlphaOnDo$QuoteFacadeLib_googleRelease", "isFavEtfShow", "isFavEtfShow$QuoteFacadeLib_googleRelease", "isMarketTabShow", "isMarketTabShow$QuoteFacadeLib_googleRelease", "isMarketHasSubTab", "isMarketHasSubTab$QuoteFacadeLib_googleRelease", "isMarketPositionShow", "isMarketPositionShow$QuoteFacadeLib_googleRelease", "isMarketSpotShow", "isMarketSpotShow$QuoteFacadeLib_googleRelease", "isMarketFuturesShow", "isMarketFuturesShow$QuoteFacadeLib_googleRelease", "isMarketEtfShow", "isMarketEtfShow$QuoteFacadeLib_googleRelease", "isChainTabNewTagShow", "isAlphaTabNewTagShow", "isAlphaFeesTagShow", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteConfigHelper.kt\ncom/kubi/quotefacade/helper/QuoteConfigHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,179:1\n17#2,2:180\n17#2,2:189\n17#2,2:191\n17#2,2:193\n35#3,4:182\n39#3:188\n35#3,4:195\n39#3:201\n35#3,4:202\n39#3:208\n35#3,4:209\n39#3:215\n44#4,2:186\n44#4,2:199\n44#4,2:206\n44#4,2:213\n*S KotlinDebug\n*F\n+ 1 QuoteConfigHelper.kt\ncom/kubi/quotefacade/helper/QuoteConfigHelper\n*L\n45#1:180,2\n99#1:189,2\n127#1:191,2\n150#1:193,2\n55#1:182,4\n55#1:188\n163#1:195,4\n163#1:201\n170#1:202,4\n170#1:208\n177#1:209,4\n177#1:215\n55#1:186,2\n163#1:199,2\n170#1:206,2\n177#1:213,2\n*E\n"})
public final class QuoteConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QuoteConfigHelper f41987a = new QuoteConfigHelper();

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.h2$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.h2$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.h2$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.h2$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51921a() {
        Object objM20457a;
        if (C24129b.m58030b(SiteVisibleConfigKey.Feed)) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new d().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("kc_market_ai_feed", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51922b() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38355e.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC38355e) objM56186h).m86546a();
        }
        return C24129b.m58030b(SiteVisibleConfigKey.Web3Wallet) && !f41987a.m51937q();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51923c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_show_market_alpha_fees_tag", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m51924d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_show_market_alpha_new_tag", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m51925e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_show_market_meme_hot_tag", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m51926f() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38356f.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC38356f) objM56186h).m86547a();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m51927g() {
        return C24129b.m58030b(SiteVisibleConfigKey.Futures) && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.More.AtsContract.1", true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m51929i() {
        return C38057a.f85671a.m85928a(C43852m.m96601m("B5FavoritesSpots", "Tab", "1"), true) && C24129b.m58030b(SiteVisibleConfigKey.Spot);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m51930j() {
        return C38057a.f85671a.m85928a(C43852m.m96601m("B5Markets", "TopNav", "1"), true);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m51931k() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38357g.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC38357g) objM56186h).m86550a();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m51934n() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38357g.class, SiteInfoManager.f47913a.m58109c());
        return objM56186h != null ? ((InterfaceC38357g) objM56186h).m86552c() : C38057a.f85671a.m85928a(C43852m.m96601m("B5Position", "Tab", "1"), true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m51935o() {
        return C38057a.f85671a.m85928a(C43852m.m96601m("B5SpotsMarkets", "Tab", "1"), true) && C24129b.m58030b(SiteVisibleConfigKey.Spot);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m51936p() {
        return C38057a.f85671a.m85928a(C43852m.m96601m("B5Markets", "TopNav", "6"), true);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m51937q() {
        return C27025c.m66566d(Boolean.valueOf(C24129b.m58030b(SiteVisibleConfigKey.Alpha)));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m51938r() {
        return C38057a.f85671a.m85928a("kcApp.B5marketAlpha.stocks.1", true) && m51937q();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m51939s() {
        return C37878b0.f85252a.m85529j();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m51928h() {
        if (!m51929i() && !m51927g() && !m51926f() && !m51937q()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m51932l() {
        return m51927g();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m51933m() {
        if (!m51934n() && !m51935o() && !m51932l() && !m51931k()) {
            return false;
        }
        return true;
    }
}
