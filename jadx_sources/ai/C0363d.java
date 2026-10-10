package ai;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.Constants;
import com.kubi.router.utils.RouteExKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ai.d */
/* JADX INFO: compiled from: FuturesRnRouteAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J#\u0010\u0010\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0011J8\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0005J.\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d*\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnRouteAdapter;", "", "<init>", "()V", "TRADE_RN_BIZ", "", "TRADE_RN_ENTRY", "TRADE_RN_COMPONENT", "ROUTE_FUTURES_PAGE", "ROUTE_FUTURES_MAIN_PAGE", "supportedBottomTabs", "", "buildInitialArgs", "Landroid/os/Bundle;", "source", "instanceId", "buildRoute", "buildRoute$KumexLib_googleRelease", "buildHotRoutePayload", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "buildRouteParams", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "buildRouteWithQuery", "routeName", ReportDataTable.COLUMN_PARAMS, "", "readTooltip", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesRnRouteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRnRouteAdapter.kt\ncom/kubi/futures/entry/rn/FuturesRnRouteAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class C0363d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0363d f1077a = new C0363d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f1078b = SetsKt.setOf((Object[]) new String[]{ViewProps.POSITION, "order", "funds"});

    /* JADX INFO: renamed from: g */
    public static final CharSequence m1425g(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        return Uri.encode((String) entry.getKey()) + '=' + Uri.encode((String) entry.getValue());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final HashMap<String, Object> m1426b(@Nullable Bundle bundle, @NotNull String instanceId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        LinkedHashMap<String, String> linkedHashMapM1429e = m1429e(bundle);
        linkedHashMapM1429e.put("instanceId", instanceId);
        return MapsKt.hashMapOf(TuplesKt.m90091to("route", "FuturesMainPage"), TuplesKt.m90091to(ReportDataTable.COLUMN_PARAMS, new HashMap(linkedHashMapM1429e)));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Bundle m1427c(@Nullable Bundle bundle, @Nullable String str) {
        Pair pairM90091to = TuplesKt.m90091to(Constants.BIZ, "trade_center");
        Pair pairM90091to2 = TuplesKt.m90091to("entry", "main");
        Pair pairM90091to3 = TuplesKt.m90091to(Constants.COMPONENT, "kc_trade_center_next");
        Pair pairM90091to4 = TuplesKt.m90091to("route", m1428d(bundle, str));
        Boolean bool = Boolean.TRUE;
        return BundleKt.bundleOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("ignoreHandleBackPressed", bool), TuplesKt.m90091to("titleBarHidden", bool), TuplesKt.m90091to("isEmbedMode", bool));
    }

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap<String, String> m1429e(Bundle bundle) {
        String strM56284y;
        String string;
        String strM56284y2;
        String string2;
        String strM56284y3;
        String strM56284y4;
        String string3;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (bundle != null && (strM56284y4 = RouteExKt.m56284y(bundle, "symbol")) != null && (string3 = StringsKt.trim((CharSequence) strM56284y4).toString()) != null) {
            if (string3.length() <= 0) {
                string3 = null;
            }
            if (string3 != null) {
                linkedHashMap.put("symbol", string3);
            }
        }
        if (bundle != null && (strM56284y3 = RouteExKt.m56284y(bundle, "bottomTab")) != null) {
            if (!f1078b.contains(strM56284y3)) {
                strM56284y3 = null;
            }
            if (strM56284y3 != null) {
                linkedHashMap.put("bottomTab", strM56284y3);
            }
        }
        if (bundle != null && (strM56284y2 = RouteExKt.m56284y(bundle, "leadUserId")) != null && (string2 = StringsKt.trim((CharSequence) strM56284y2).toString()) != null) {
            if (string2.length() <= 0) {
                string2 = null;
            }
            if (string2 != null) {
                linkedHashMap.put("leadUserId", string2);
            }
        }
        if (bundle != null && (strM56284y = RouteExKt.m56284y(bundle, "leadUserConfigId")) != null && (string = StringsKt.trim((CharSequence) strM56284y).toString()) != null) {
            String str = string.length() > 0 ? string : null;
            if (str != null) {
                linkedHashMap.put("leadUserConfigId", str);
            }
        }
        if (m1431h(bundle)) {
            linkedHashMap.put("tooltip", CredentialEntry.TRUE_STRING);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1431h(Bundle bundle) {
        Object obj = bundle != null ? bundle.get("tooltip") : null;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return StringsKt.equals((String) obj, CredentialEntry.TRUE_STRING, true);
        }
        return (obj instanceof Number) && ((Number) obj).intValue() == 1;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m1428d(@Nullable Bundle bundle, @Nullable String str) {
        String string;
        LinkedHashMap<String, String> linkedHashMapM1429e = m1429e(bundle);
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                linkedHashMapM1429e.put("instanceId", string);
            }
        }
        return m1430f("FuturesPage", linkedHashMapM1429e);
    }

    /* JADX INFO: renamed from: f */
    public final String m1430f(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return str;
        }
        return str + '?' + CollectionsKt.joinToString$default(map.entrySet(), "&", null, null, 0, null, new Function1() { // from class: ai.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0363d.m1425g((Map.Entry) obj);
            }
        }, 30, null);
    }
}
