package v80;

import com.kubi.sdk.site.SiteType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: v80.b */
/* JADX INFO: compiled from: WebCommonParamKey.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/WebCommonParamKey;", "", "<init>", "()V", "QUERY_KEY_APP_NEED_LANG", "", "QUERY_KEY_APP_IGNORE_LANG", "QUERY_KEY_LANG", "indexHtmlPath", "", "getIndexHtmlPath", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45471b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45471b f102494a = new C45471b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, String> f102495b = MapsKt.mapOf(TuplesKt.m90091to(SiteType.EUROPE_NAME, "eu"), TuplesKt.m90091to(SiteType.EUROPE_STAGING_NAME, "eu"), TuplesKt.m90091to(SiteType.AUSTRALIA_NAME, "au"), TuplesKt.m90091to(SiteType.TURKEY_NAME, "tr"), TuplesKt.m90091to(SiteType.THAILAND_NAME, "th"));

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100426a() {
        String str = f102495b.get(SiteType.INSTANCE.getCurrentSiteType());
        return str == null ? "" : str;
    }
}
