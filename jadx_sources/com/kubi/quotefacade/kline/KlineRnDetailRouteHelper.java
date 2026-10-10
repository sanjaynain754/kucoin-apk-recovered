package com.kubi.quotefacade.kline;

import android.net.Uri;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.perf.util.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.kline.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KlineRnDetailRouteHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0005J$\u0010\u0018\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineRnDetailRouteHelper;", "", "<init>", "()V", "DEFAULT_CONFIG_KEY", "", "FUTURES_CONFIG_KEY", "KRN_ROUTER", "RN_BIZ", "RN_ENTRY", "RN_COMPONENT", "RN_ROUTE_NAME", Constants.ENABLE_DISABLE, "", "klineType", "configKey", "configKey$QuoteFacadeLib_googleRelease", "isFutures", "buildInitRoute", "symbol", "leverTradeType", "parseFlutterKlineRoute", "Lcom/kubi/quotefacade/kline/FlutterKlineRouteParams;", "route", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineRnDetailRouteHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineRnDetailRouteHelper.kt\ncom/kubi/quotefacade/kline/KlineRnDetailRouteHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n35#2,4:129\n39#2:135\n44#3,2:133\n1#4:136\n*S KotlinDebug\n*F\n+ 1 KlineRnDetailRouteHelper.kt\ncom/kubi/quotefacade/kline/KlineRnDetailRouteHelper\n*L\n43#1:129,4\n43#1:135\n43#1:133,2\n*E\n"})
public final class KlineRnDetailRouteHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KlineRnDetailRouteHelper f42151a = new KlineRnDetailRouteHelper();

    /* JADX INFO: renamed from: com.kubi.quotefacade.kline.f$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m52184a(@NotNull String symbol, @NotNull String klineType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add("symbol=" + Uri.encode(symbol));
        if (!StringsKt.isBlank(klineType)) {
            listCreateListBuilder.add("klineType=" + Uri.encode(klineType));
        }
        if (str != null && !StringsKt.isBlank(str)) {
            listCreateListBuilder.add("leverTradeType=" + Uri.encode(str));
        }
        String strEncode = Uri.encode("KlineDetailContainerPage?" + CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), "&", null, null, 0, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m52185b(@NotNull String klineType) {
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        return m52187d(klineType) ? "future_kline_rn_enable" : "kc_kline_rn_detail_refactor";
    }

    /* JADX INFO: renamed from: c */
    public final boolean m52186c(@NotNull String klineType) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        String strM52185b = m52185b(klineType);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a(strM52185b, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, false);
        return m52187d(klineType) ? KlineRnDetailDebugOverride.f42150a.m52183b(zM66567e) : KlineRnDetailDebugOverride.f42150a.m52182a(zM66567e);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52187d(String str) {
        return Intrinsics.areEqual(str, SearchCategory$Companion.FUTURES);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52188e(@Nullable String str, @NotNull String klineType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (!m52186c(klineType) || StringsKt.isBlank(string)) {
            return false;
        }
        Router.f46192a.m56184f("krn/router").m4038a(com.kubi.p110rn.Constants.BIZ, "trade_center").m4038a("entry", "main").m4038a(com.kubi.p110rn.Constants.COMPONENT, "kc_trade_center_next").m4038a("route", m52184a(string, klineType, str2)).m4048k();
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final FlutterKlineRouteParams m52189f(@NotNull String route) {
        String strSubstring;
        String strSubstring2;
        String string;
        Intrinsics.checkNotNullParameter(route, "route");
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.trim((CharSequence) route).toString(), (CharSequence) "/");
        String str = null;
        if (!StringsKt.startsWith$default(strRemovePrefix, "market/kline/chart/index", false, 2, (Object) null)) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strRemovePrefix, '?', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            strSubstring = strRemovePrefix.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = strRemovePrefix;
        }
        if (!Intrinsics.areEqual(strSubstring, "market/kline/chart/index")) {
            return null;
        }
        if (iIndexOf$default >= 0) {
            strSubstring2 = strRemovePrefix.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        } else {
            strSubstring2 = "";
        }
        Uri uri = Uri.parse("kucoin://placeholder?" + strSubstring2);
        String queryParameter = uri.getQueryParameter("symbol");
        String string2 = queryParameter != null ? StringsKt.trim((CharSequence) queryParameter).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        if (StringsKt.isBlank(string2)) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("klineType");
        String string3 = queryParameter2 != null ? StringsKt.trim((CharSequence) queryParameter2).toString() : null;
        String str2 = string3 != null ? string3 : "";
        if (StringsKt.isBlank(str2)) {
            str2 = SearchCategory$Companion.SPOT;
        }
        String queryParameter3 = uri.getQueryParameter("leverTradeType");
        if (queryParameter3 != null && (string = StringsKt.trim((CharSequence) queryParameter3).toString()) != null && string.length() > 0) {
            str = string;
        }
        return new FlutterKlineRouteParams(string2, str2, str);
    }
}
