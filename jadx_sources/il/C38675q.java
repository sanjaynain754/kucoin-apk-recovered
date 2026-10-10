package il;

import com.kubi.kucoin.exception.AppRouterMessage;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: il.q */
/* JADX INFO: compiled from: RouteAppSiteInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteAppSiteInterceptor;", "", "<init>", "()V", "TAG", "", "intercept", "", "bizType", "siteTypeList", "", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteAppSiteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteAppSiteInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteAppSiteInterceptor\n+ 2 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n*L\n1#1,38:1\n101#2,2:39\n101#2,2:41\n*S KotlinDebug\n*F\n+ 1 RouteAppSiteInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteAppSiteInterceptor\n*L\n22#1:39,2\n31#1:41,2\n*E\n"})
public final class C38675q {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38675q f86694a = new C38675q();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m87419a(@NotNull String bizType, @NotNull List<String> siteTypeList) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(siteTypeList, "siteTypeList");
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.INSTANCE.tryParse(bizType));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("intercept bizType=");
        sb2.append(bizType);
        sb2.append(", remoteEnable=");
        sb2.append(zM58030b);
        sb2.append(", siteTypeList=");
        sb2.append(siteTypeList);
        sb2.append("，curSiteType=");
        SiteType.Companion companion = SiteType.INSTANCE;
        sb2.append(companion.getCurrentSiteType());
        C44128b.m97266j("RouteSiteConfigInterceptor", sb2.toString());
        if (!zM58030b) {
            C44128b.m97261e("RouteSiteConfigInterceptor", "intercept bizType=" + bizType + " is forbidden");
            C43846g.m96568c(new AppRouterMessage("shared sit biz forbidden", "RouteSiteConfigInterceptor", false, 4, null), null, 2, null);
            return true;
        }
        if (siteTypeList.isEmpty()) {
            return false;
        }
        String currentSiteType = companion.getCurrentSiteType();
        C44128b.m97266j("RouteSiteConfigInterceptor", "intercept siteTypeList=" + siteTypeList + ", curSiteType=" + currentSiteType);
        if (siteTypeList.contains(currentSiteType)) {
            return false;
        }
        C44128b.m97261e("RouteSiteConfigInterceptor", "intercept siteTypeList=" + siteTypeList + ", curSiteType=" + currentSiteType + " is forbidden");
        C43846g.m96568c(new AppRouterMessage("shared siteTypeList=" + siteTypeList + ", curSiteType=" + currentSiteType + " is forbidden", "RouteSiteConfigInterceptor", false, 4, null), null, 2, null);
        return true;
    }
}
