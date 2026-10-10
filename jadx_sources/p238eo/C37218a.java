package p238eo;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.ui.LiteMainActivity;
import com.kubi.route.config.C23629a;
import com.kubi.route.config.RouteConfigManager;
import com.kubi.route.config.model.RouteEntry;
import com.kubi.route.config.model.RouteTechStack;
import com.kubi.router.utils.RouteExKt;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p291go.C37976a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: eo.a */
/* JADX INFO: compiled from: LiteRouteUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/lite/tab/kv/LiteRouteUtil;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getTechStackForTab", "Lcom/kubi/route/config/model/RouteTechStack;", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "getJumpUrl", "safeUrl", "handleTab", "", "liteMainActivity", "Lcom/kubi/lite/tab/ui/LiteMainActivity;", "tabConfigList", "", "isRNTab", "config", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteRouteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteRouteUtil.kt\ncom/kubi/lite/tab/kv/LiteRouteUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,88:1\n360#2,7:89\n1869#2:97\n1870#2:99\n29#3:96\n1#4:98\n216#5,2:100\n*S KotlinDebug\n*F\n+ 1 LiteRouteUtil.kt\ncom/kubi/lite/tab/kv/LiteRouteUtil\n*L\n45#1:89,7\n58#1:97\n58#1:99\n55#1:96\n67#1:100,2\n*E\n"})
public final class C37218a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37218a f82536a = new C37218a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f82537b = "LiteV2-RouteUtil";

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m83260a(@NotNull String safeUrl) {
        String strM56162a;
        Intrinsics.checkNotNullParameter(safeUrl, "safeUrl");
        RouteEntry routeEntryM56161e = RouteConfigManager.f46179a.m56161e(safeUrl);
        if (routeEntryM56161e == null || (strM56162a = C23629a.m56162a(routeEntryM56161e)) == null) {
            strM56162a = safeUrl;
        }
        C44128b.m97266j(f82537b, "safeUrl = " + safeUrl + ", jumpUrl =  " + strM56162a);
        return strM56162a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final RouteTechStack m83261b(@NotNull TabConfig tabConfig) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        String url = tabConfig.getUrl();
        if (url == null) {
            url = "";
        }
        RouteTechStack routeTechStackM56159c = RouteConfigManager.f46179a.m56159c(url);
        C44128b.m97266j(f82537b, "getTechStackForTab start: url=" + url + ", techStack = " + routeTechStackM56159c);
        return routeTechStackM56159c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83262c(@NotNull LiteMainActivity liteMainActivity, @NotNull List<TabConfig> tabConfigList) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(liteMainActivity, "liteMainActivity");
        Intrinsics.checkNotNullParameter(tabConfigList, "tabConfigList");
        try {
            Intent intent = liteMainActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            String strM56280w = RouteExKt.m56280w(intent, "tab");
            if (strM56280w != null && strM56280w.length() != 0) {
                String strDecode = URLDecoder.decode(strM56280w, "UTF-8");
                C44128b.m97266j(f82537b, "handleTab decode tab = " + strDecode);
                Intrinsics.checkNotNull(strDecode);
                String strSubstringBefore$default = StringsKt.substringBefore$default(strDecode, '?', (String) null, 2, (Object) null);
                if (strSubstringBefore$default.length() == 0) {
                    return false;
                }
                Iterator<TabConfig> it = tabConfigList.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (StringsKt.contains$default((CharSequence) it.next().getUrl(), (CharSequence) strSubstringBefore$default, false, 2, (Object) null)) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    return false;
                }
                TabConfig tabConfig = tabConfigList.get(i11);
                RouteTechStack routeTechStackM83261b = m83261b(tabConfig);
                C37976a c37976a = (C37976a) new ViewModelProvider(liteMainActivity).get(C37976a.class);
                if (routeTechStackM83261b != RouteTechStack.RN) {
                    C44128b.m97266j(f82537b, "handleTab Generic: index=" + i11);
                    C37976a.m85821v(c37976a, i11, null, 2, null);
                    return true;
                }
                Intrinsics.checkNotNull(strDecode);
                Uri uri = Uri.parse(strDecode);
                String queryParameter2 = uri.getQueryParameter("route");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str : queryParameterNames) {
                        if (!Intrinsics.areEqual(str, "route") && (queryParameter = uri.getQueryParameter(str)) != null) {
                            linkedHashMap.put(str, queryParameter);
                        }
                    }
                }
                Uri.Builder builderBuildUpon = Uri.parse(tabConfig.getUrl()).buildUpon();
                builderBuildUpon.appendQueryParameter("route", queryParameter2);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String string = builderBuildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                C44128b.m97266j(f82537b, "handleTab RN: index=" + i11 + ", newUrl=" + string);
                c37976a.m85829u(i11, string);
                return true;
            }
            return false;
        } catch (Exception e11) {
            C44128b.m97261e(f82537b, "handleTab error: " + e11.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m83263d(@NotNull TabConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return m83261b(config) == RouteTechStack.RN;
    }
}
