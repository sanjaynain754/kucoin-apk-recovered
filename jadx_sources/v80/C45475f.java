package v80;

import androidx.room.util.TableInfo;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import d10.InterfaceC36593a;
import org.jetbrains.annotations.NotNull;
import p80.C43414a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: v80.f */
/* JADX INFO: compiled from: WebShareCommonUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/WebShareCommonUtils;", "", "<init>", "()V", "TAG", "", "getIndexHtmlPath", "getHtmlIndexPath", "getShareWebImpl", "Lcom/kubi/sdk/web/sharesite/WebShareSite;", "getKWebSideInfo", "Lcom/kubi/widget/web/sharesite/KWebViewSiteInfo;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebShareCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebShareCommonUtils.kt\ncom/kubi/widget/web/sharesite/WebShareCommonUtils\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,49:1\n17#2,2:50\n17#2,2:52\n*S KotlinDebug\n*F\n+ 1 WebShareCommonUtils.kt\ncom/kubi/widget/web/sharesite/WebShareCommonUtils\n*L\n38#1:50,2\n45#1:52,2\n*E\n"})
public final class C45475f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45475f f102497a = new C45475f();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100429a() {
        String strM100426a = C45471b.f102494a.m100426a();
        if (strM100426a.length() <= 0) {
            return "index.html";
        }
        return TableInfo.Index.DEFAULT_PREFIX + strM100426a + ".html";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m100430b() {
        String asString = null;
        try {
            JsonElement jsonElement = JsonParser.parseString(SiteConfigManager.f47884a.m58046m(SiteBizConfigKey.CustomParam)).getAsJsonObject().get("htmlName");
            if (jsonElement != null) {
                asString = jsonElement.getAsString();
            }
        } catch (Exception e11) {
            C44128b.m97270n("WebDynamicShareSiteImpl", "getIndexHtmlPath: " + e11);
        }
        return asString == null ? m100429a() : asString;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KWebViewSiteInfo m100431c() {
        KWebViewSiteInfo kWebViewSiteInfoMo100427c;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45476g.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (kWebViewSiteInfoMo100427c = ((InterfaceC45476g) objM56186h).mo100427c()) == null) ? C43414a.f95860a.m95605b() : kWebViewSiteInfoMo100427c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC36593a m100432d() {
        InterfaceC36593a service;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45476g.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (service = ((InterfaceC45476g) objM56186h).getService()) == null) ? new C45472c() : service;
    }
}
