package z30;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: z30.d */
/* JADX INFO: compiled from: TradeRnRouteAdapter.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010\"\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u001e*\u0004\u0018\u00010\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010 H\u0002J \u0010!\u001a\u00020\u001e*\u00020\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010 H\u0002J0\u0010\"\u001a\u00020\u001e*\u00020\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002J\u001d\u0010%\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u0004\u0018\u00010\u0005*\u00020\u00152\u0006\u0010&\u001a\u00020\u0005H\u0002J\u001b\u0010)\u001a\u0004\u0018\u00010\u0018*\u00020\u00152\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u0004\u0018\u00010\u0001*\u00020\u00152\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/tradefacade/service/TradeRnRouteAdapter;", "", "<init>", "()V", "TRADE_RN_BIZ", "", "TRADE_RN_ENTRY", "TRADE_RN_COMPONENT", "ROUTE_TRADE_MAIN", "NATIVE_ROUTE_TRADE", "NATIVE_ROUTE_LEVER_TRADE", "NATIVE_ROUTE_LEVER_CROSS", "NATIVE_ROUTE_LEVER_ISOLATED", "NATIVE_ROUTE_ALPHA", "TYPE_SPOT", "", "TYPE_MARGIN_CROSS", "TYPE_MARGIN_ISOLATED", "TYPE_MARGIN_LAST", "TYPE_ALPHA", "buildInitialArgs", "Landroid/os/Bundle;", "source", "defaultIsUta", "", "(Landroid/os/Bundle;Ljava/lang/Boolean;)Landroid/os/Bundle;", "resolveTarget", "Lcom/kubi/tradefacade/service/TradeRnRouteTarget;", "(Landroid/os/Bundle;Ljava/lang/Boolean;)Lcom/kubi/tradefacade/service/TradeRnRouteTarget;", "copyTradeParamsTo", "", ReportDataTable.COLUMN_PARAMS, "", "copyUnknownParamsTo", "putStringParam", "sourceKey", "targetKey", "compatIntValue", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "compatStringValue", "readBooleanLike", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "readRawValue", "toRouteParamValue", "RESERVED_ROOT_KEYS", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeRnRouteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeRnRouteAdapter.kt\ncom/kubi/tradefacade/service/TradeRnRouteAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n216#2,2:215\n1#3:217\n827#4:218\n855#4,2:219\n1869#4,2:221\n*S KotlinDebug\n*F\n+ 1 TradeRnRouteAdapter.kt\ncom/kubi/tradefacade/service/TradeRnRouteAdapter\n*L\n46#1:215,2\n126#1:218\n126#1:219,2\n127#1:221,2\n*E\n"})
public final class C46686d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46686d f104523a = new C46686d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f104524b = SetsKt.setOf((Object[]) new String[]{Constants.BIZ, "entry", Constants.COMPONENT, "route"});

    /* JADX INFO: renamed from: b */
    public final Integer m102911b(Bundle bundle, String str) {
        Object objM102917h;
        if (bundle != null && bundle.containsKey(str) && (objM102917h = m102917h(bundle, str)) != null) {
            if (objM102917h instanceof Integer) {
                return (Integer) objM102917h;
            }
            if (objM102917h instanceof Number) {
                return Integer.valueOf(((Number) objM102917h).intValue());
            }
            if (objM102917h instanceof String) {
                return StringsKt.toIntOrNull((String) objM102917h);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m102913d(Bundle bundle, Map<String, Object> map) {
        if (bundle == null) {
            return;
        }
        m102915f(bundle, map, "symbol", "symbol");
        m102915f(bundle, map, FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY);
        m102915f(bundle, map, "currencySeq", "currencySeq");
        m102915f(bundle, map, "currencySeq", "alphaCurrencySeq");
        m102915f(bundle, map, "sourcePage", "sourcePage");
        m102915f(bundle, map, "preSpmId", "preSpmId");
        m102915f(bundle, map, "spm", "spm");
        m102915f(bundle, map, "layoutMode", "layoutMode");
        m102915f(bundle, map, "userAccountMode", "userAccountMode");
        m102915f(bundle, map, "accountMode", "accountMode");
        m102915f(bundle, map, "nativeAccountMode", "nativeAccountMode");
        m102915f(bundle, map, "bottomTab", "bottomTab");
        m102915f(bundle, map, "isBuy", "isBuy");
        m102915f(bundle, map, "type", "type");
        Boolean boolM102916g = m102916g(bundle, "isBuy");
        if (boolM102916g != null) {
            map.put("side", boolM102916g.booleanValue() ? "buy" : "sell");
        }
        Boolean boolM102916g2 = m102916g(bundle, "isUTA");
        if (boolM102916g2 != null) {
            map.put("isUTA", boolM102916g2);
        }
        m102914e(bundle, map);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TradeRnRouteTarget m102918i(@Nullable Bundle bundle, @Nullable Boolean bool) {
        LinkedHashMap linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(TuplesKt.m90091to("isEmbedMode", Boolean.TRUE));
        Integer numM102911b = m102911b(bundle, "type");
        if (numM102911b != null && numM102911b.intValue() == 0) {
            linkedHashMapLinkedMapOf.put("nativeRoute", "trade");
            linkedHashMapLinkedMapOf.put("tradeDomain", SearchCategory$Companion.SPOT);
            linkedHashMapLinkedMapOf.put("activeDomain", SearchCategory$Companion.SPOT);
        } else if (numM102911b != null && numM102911b.intValue() == 1) {
            linkedHashMapLinkedMapOf.put("nativeRoute", "leverCrossTrade");
            linkedHashMapLinkedMapOf.put("tradeDomain", ViewProps.MARGIN);
            linkedHashMapLinkedMapOf.put("activeDomain", ViewProps.MARGIN);
            linkedHashMapLinkedMapOf.put("marginMode", "cross");
        } else if (numM102911b != null && numM102911b.intValue() == 2) {
            linkedHashMapLinkedMapOf.put("nativeRoute", "leverIsolatedTrade");
            linkedHashMapLinkedMapOf.put("tradeDomain", ViewProps.MARGIN);
            linkedHashMapLinkedMapOf.put("activeDomain", ViewProps.MARGIN);
            linkedHashMapLinkedMapOf.put("marginMode", "isolated");
        } else if (numM102911b != null && numM102911b.intValue() == 3) {
            linkedHashMapLinkedMapOf.put("nativeRoute", "leverTrade");
            linkedHashMapLinkedMapOf.put("tradeDomain", ViewProps.MARGIN);
            linkedHashMapLinkedMapOf.put("activeDomain", ViewProps.MARGIN);
        } else if (numM102911b != null && numM102911b.intValue() == 6) {
            linkedHashMapLinkedMapOf.put("nativeRoute", "trade/alpha");
            linkedHashMapLinkedMapOf.put("activeDomain", "alpha");
        }
        m102913d(bundle, linkedHashMapLinkedMapOf);
        if (!linkedHashMapLinkedMapOf.containsKey("isUTA") && bool != null) {
            linkedHashMapLinkedMapOf.put("isUTA", bool);
        }
        return new TradeRnRouteTarget("TradeMainPage", linkedHashMapLinkedMapOf);
    }

    /* JADX INFO: renamed from: j */
    public final Object m102919j(Object obj) {
        if (obj instanceof String) {
            if (((String) obj).length() <= 0) {
                obj = null;
            }
            return (Serializable) obj;
        }
        if (obj instanceof Boolean) {
            return (Serializable) obj;
        }
        if (obj instanceof Number) {
            return (Serializable) obj;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Bundle m102910a(@Nullable Bundle bundle, @Nullable Boolean bool) {
        TradeRnRouteTarget tradeRnRouteTargetM102918i = m102918i(bundle, bool);
        Pair pairM90091to = TuplesKt.m90091to(Constants.BIZ, "trade_center");
        Pair pairM90091to2 = TuplesKt.m90091to("entry", "main");
        Pair pairM90091to3 = TuplesKt.m90091to(Constants.COMPONENT, "kc_trade_center_next");
        Pair pairM90091to4 = TuplesKt.m90091to("route", tradeRnRouteTargetM102918i.m102925d());
        Boolean bool2 = Boolean.TRUE;
        Bundle bundleBundleOf = BundleKt.bundleOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("ignoreHandleBackPressed", bool2), TuplesKt.m90091to("titleBarHidden", bool2), TuplesKt.m90091to("isEmbedMode", bool2));
        for (Map.Entry<String, Object> entry : tradeRnRouteTargetM102918i.m102924c().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.areEqual(key, "isEmbedMode")) {
                bundleBundleOf.putString(key, value.toString());
            }
        }
        return bundleBundleOf;
    }

    /* JADX INFO: renamed from: c */
    public final String m102912c(Bundle bundle, String str) {
        Object objM102917h;
        if (!bundle.containsKey(str) || (objM102917h = m102917h(bundle, str)) == null) {
            return null;
        }
        return objM102917h.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m102914e(Bundle bundle, Map<String, Object> map) {
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        List listSorted = CollectionsKt.sorted(setKeySet);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listSorted) {
            if (!f104524b.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            if (!map.containsKey(str)) {
                C46686d c46686d = f104523a;
                Intrinsics.checkNotNull(str);
                Object objM102919j = c46686d.m102919j(c46686d.m102917h(bundle, str));
                if (objM102919j != null) {
                    map.put(str, objM102919j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m102915f(Bundle bundle, Map<String, Object> map, String str, String str2) {
        String strM102912c = m102912c(bundle, str);
        if (strM102912c != null) {
            if (strM102912c.length() <= 0) {
                strM102912c = null;
            }
            if (strM102912c != null) {
                map.put(str2, strM102912c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r3.equals(androidx.credentials.provider.CredentialEntry.FALSE_STRING) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r3.equals(androidx.credentials.provider.CredentialEntry.TRUE_STRING) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r3.equals("1") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r3.equals("0") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m102916g(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        Object objM102917h = m102917h(bundle, str);
        if (objM102917h instanceof Boolean) {
            return (Boolean) objM102917h;
        }
        if (objM102917h instanceof Number) {
            int iIntValue = ((Number) objM102917h).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (!(objM102917h instanceof String)) {
            return null;
        }
        String lowerCase = StringsKt.trim((CharSequence) objM102917h).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3569038) {
                    if (iHashCode == 97196323) {
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m102917h(Bundle bundle, String str) {
        return bundle.get(str);
    }
}
