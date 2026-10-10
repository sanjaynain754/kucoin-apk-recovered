package com.kubi.sdk.web.scene;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.match.C24322a;
import com.kubi.sdk.web.match.C24323b;
import com.kubi.sdk.web.match.WhiteListManager;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: SceneMatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/web/scene/SceneMatcher;", "", "<init>", "()V", "", "url", "Lcom/kubi/sdk/web/scene/SceneType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lcom/kubi/sdk/web/scene/SceneType;", "Ljava/lang/String;", "currentUrl", "b", "Lcom/kubi/sdk/web/scene/SceneType;", "sceneType", "c", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SceneMatcher {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String currentUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public SceneType sceneType = SceneType.Default;

    /* JADX INFO: compiled from: SceneMatcher.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/web/scene/SceneMatcher$Companion;", "", "<init>", "()V", "", "url", "Lcom/kubi/sdk/web/scene/SceneType;", "match", "(Ljava/lang/String;)Lcom/kubi/sdk/web/scene/SceneType;", "", "b", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Lcom/kubi/sdk/web/scene/SceneType;", "LOG_TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSceneMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneMatcher.kt\ncom/kubi/sdk/web/scene/SceneMatcher$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1747#2,3:122\n*S KotlinDebug\n*F\n+ 1 SceneMatcher.kt\ncom/kubi/sdk/web/scene/SceneMatcher$Companion\n*L\n31#1:122,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final SceneType m58829a(Uri uri) {
            if (C24323b.f48518a.m58824d(uri)) {
                return SceneType.BaseCachedWebApp;
            }
            return C24322a.f48515a.m58818c(uri) == null ? SceneType.BasicWebApp : SceneType.CachedWebApp;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m58830b(String url) {
            HashSet<String> hashSetM58593d;
            WebConfig webConfig = WebConfig.f48355a;
            if (!webConfig.m58592c() || ((hashSetM58593d = webConfig.m58593d()) != null && hashSetM58593d.isEmpty())) {
                return false;
            }
            Iterator<T> it = hashSetM58593d.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final SceneType match(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            WhiteListManager whiteListManager = WhiteListManager.f48507a;
            boolean zM58801b = whiteListManager.m58801b(url);
            boolean zM58802c = zM58801b ? false : whiteListManager.m58802c(url);
            if (Intrinsics.areEqual("about:black", url)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("match scene=");
                SceneType sceneType = SceneType.Default;
                sb2.append(sceneType);
                sb2.append(" url=");
                sb2.append(url);
                sb2.append(" hitHost=");
                sb2.append(zM58801b);
                sb2.append(" hitWhiteList=");
                sb2.append(zM58802c);
                C44128b.m97266j("KWebLangPath", sb2.toString());
                return sceneType;
            }
            if (Intrinsics.areEqual(Util.ANDROID_ASSET_URL, url)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("match scene=");
                SceneType sceneType2 = SceneType.Template;
                sb3.append(sceneType2);
                sb3.append(" url=");
                sb3.append(url);
                sb3.append(" hitHost=");
                sb3.append(zM58801b);
                sb3.append(" hitWhiteList=");
                sb3.append(zM58802c);
                C44128b.m97266j("KWebLangPath", sb3.toString());
                return sceneType2;
            }
            if (m58830b(url)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("match scene=");
                SceneType sceneType3 = SceneType.ProxyWebApp;
                sb4.append(sceneType3);
                sb4.append(" url=");
                sb4.append(url);
                sb4.append(" hitHost=");
                sb4.append(zM58801b);
                sb4.append(" hitWhiteList=");
                sb4.append(zM58802c);
                C44128b.m97266j("KWebLangPath", sb4.toString());
                return sceneType3;
            }
            if (zM58801b) {
                C24329b.f48558a.m58864d("allWebsiteURL", "checkUrlInHost url:" + url);
                Uri uriM58889h = C24335h.f48569a.m58889h(url);
                SceneType sceneTypeM58829a = uriM58889h == null ? SceneType.BasicWebApp : m58829a(uriM58889h);
                C44128b.m97266j("KWebLangPath", "match scene=" + sceneTypeM58829a + " url=" + url + " hitHost=true hitWhiteList=false");
                return sceneTypeM58829a;
            }
            if (!zM58802c) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("match scene=");
                SceneType sceneType4 = SceneType.Disable;
                sb5.append(sceneType4);
                sb5.append(" url=");
                sb5.append(url);
                sb5.append(" hitHost=false hitWhiteList=false");
                C44128b.m97266j("KWebLangPath", sb5.toString());
                return sceneType4;
            }
            C24329b.f48558a.m58864d("allWebsiteURL", "checkUrlInWhiteList url:" + url);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("match scene=");
            SceneType sceneType5 = SceneType.Default;
            sb6.append(sceneType5);
            sb6.append(" url=");
            sb6.append(url);
            sb6.append(" hitHost=false hitWhiteList=true");
            C44128b.m97266j("KWebLangPath", sb6.toString());
            return sceneType5;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SceneType m58828a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String str = this.currentUrl;
        if (str != null && StringsKt.startsWith(url, str, true)) {
            return this.sceneType;
        }
        SceneType sceneTypeMatch = INSTANCE.match(url);
        SceneType sceneType = SceneType.Disable;
        if (sceneTypeMatch == sceneType) {
            return sceneType;
        }
        this.currentUrl = url;
        this.sceneType = sceneTypeMatch;
        return sceneTypeMatch;
    }
}
