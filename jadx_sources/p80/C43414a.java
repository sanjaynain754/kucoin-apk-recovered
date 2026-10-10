package p80;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import ro.C44128b;
import v80.KWebViewSiteInfo;

/* JADX INFO: renamed from: p80.a */
/* JADX INFO: compiled from: KWebConstant.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/widget/web/KWebConstant;", "", "<init>", "()V", "TAG", "", "KEY_NIGHT", "KEY_UA", "KEY_FORCE_LOADING", "LOADING_MODE_HIDE", "", "LOADING_MODE_BAR", "LOADING_MODE_CIRCLE", "defaultLanguage", "getDefaultLanguage", "()Ljava/lang/String;", "defaultLanPath", "getDefaultLanPath", "defaultGlobal", "Lcom/kubi/widget/web/sharesite/KWebViewSiteInfo;", "getDefaultGlobal", "()Lcom/kubi/widget/web/sharesite/KWebViewSiteInfo;", "defaultDynamic", "getDefaultDynamic", "fetchDefaultLanPath", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43414a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43414a f95860a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f95861b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f95862c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final KWebViewSiteInfo f95863d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final KWebViewSiteInfo f95864e;

    static {
        C43414a c43414a = new C43414a();
        f95860a = c43414a;
        String strM58046m = SiteConfigManager.f47884a.m58046m(SiteBizConfigKey.DefaultLanguage);
        f95861b = strM58046m;
        String strM95604a = c43414a.m95604a();
        f95862c = strM95604a;
        f95863d = new KWebViewSiteInfo("KuCoin", strM95604a, strM58046m);
        f95864e = new KWebViewSiteInfo("KuCoin " + SiteType.INSTANCE.getCurrentSiteType(), strM95604a, strM58046m);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m95604a() {
        String asString = null;
        try {
            JsonElement jsonElement = JsonParser.parseString(SiteConfigManager.f47884a.m58046m(SiteBizConfigKey.CustomParam)).getAsJsonObject().get("defaultLanPath");
            if (jsonElement != null) {
                asString = jsonElement.getAsString();
            }
        } catch (Exception e11) {
            C44128b.m97270n("KWebConstant", "fetchDefaultLanPath: " + e11);
        }
        return asString == null ? TUIThemeManager.LANGUAGE_EN : asString;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KWebViewSiteInfo m95605b() {
        return f95864e;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KWebViewSiteInfo m95606c() {
        return f95863d;
    }
}
