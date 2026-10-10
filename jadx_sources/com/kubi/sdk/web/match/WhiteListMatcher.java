package com.kubi.sdk.web.match;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.util.C24335h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: WhiteListMatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001 B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/web/match/WhiteListMatcher;", "", "", "allowHttp", "<init>", "(Z)V", "", "url", "g", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "f", "(Landroid/net/Uri;)Z", "", "c", "(Ljava/lang/String;)V", "", "urls", "b", "(Ljava/lang/Iterable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "()V", "e", "()Z", "Z", "", "Ljava/util/Set;", "topDomainSet", "hostSet", "fullUrlSet", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWhiteListMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListMatcher.kt\ncom/kubi/sdk/web/match/WhiteListMatcher\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 3 WhiteListMatcher.kt\ncom/kubi/sdk/web/match/WhiteListMatcher$Companion\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n85#2,4:124\n85#2,4:128\n86#2,3:133\n85#2,4:136\n85#2,4:140\n85#2,4:144\n18#3:132\n1855#4,2:148\n1855#4,2:150\n*S KotlinDebug\n*F\n+ 1 WhiteListMatcher.kt\ncom/kubi/sdk/web/match/WhiteListMatcher\n*L\n27#1:124,4\n38#1:128,4\n74#1:133,3\n79#1:136,4\n83#1:140,4\n89#1:144,4\n61#1:132\n107#1:148,2\n111#1:150,2\n*E\n"})
public final class WhiteListMatcher {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean allowHttp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<String> topDomainSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> hostSet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<String> fullUrlSet;

    /* JADX INFO: compiled from: WhiteListMatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/web/match/WhiteListMatcher$Companion;", "", "<init>", "()V", "Landroid/net/Uri;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m58815a(Uri uri) {
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(host);
        }
    }

    public WhiteListMatcher(boolean z11) {
        this.allowHttp = z11;
        this.topDomainSet = new LinkedHashSet();
        this.hostSet = new LinkedHashSet();
        this.fullUrlSet = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m58808a(@NotNull Iterable<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            m58810c(it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58809b(@NotNull Iterable<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            m58810c(it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58810c(@NotNull String url) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        String string = StringsKt.trim((CharSequence) url).toString();
        try {
            if (URLUtil.isNetworkUrl(string)) {
                str = string;
            } else {
                str = "https://" + string;
            }
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (host == null || host.length() == 0) {
                C43846g.m96568c(new WebCoreMessage("WhiteListMatcher add " + url + " is empty host", "WhiteListMatcher", false, 4, null), null, 2, null);
                return;
            }
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0 && !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
                C43846g.m96568c(new WebCoreMessage("WhiteListMatcher add " + url + "  scheme error", "WhiteListMatcher", false, 4, null), null, 2, null);
                return;
            }
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null && encodedPath.length() != 0 && !Intrinsics.areEqual(uri.getEncodedPath(), "/")) {
                this.fullUrlSet.add(string);
                return;
            }
            Companion companion = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            String strM58815a = companion.m58815a(uri);
            if (strM58815a != null && strM58815a.length() != 0) {
                if (Intrinsics.areEqual(strM58815a, host)) {
                    this.topDomainSet.add(strM58815a);
                    return;
                } else {
                    this.hostSet.add(host);
                    return;
                }
            }
            C43846g.m96568c(new WebCoreMessage("WhiteListMatcher add " + url + " is not a domain", "WhiteListMatcher", false, 4, null), null, 2, null);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "WhiteListMatcher", false, "WhiteListMatcher add " + url + " parse error", 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58811d() {
        this.topDomainSet.clear();
        this.hostSet.clear();
        this.fullUrlSet.clear();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58812e() {
        return this.topDomainSet.isEmpty() && this.hostSet.isEmpty() && this.fullUrlSet.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58813f(@NotNull Uri uri) {
        String strM58815a;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (m58812e()) {
            C43846g.m96568c(new WebCoreMessage("WhiteListMatcher isEmpty " + uri, "WhiteListMatcher", false, 4, null), null, 2, null);
            return false;
        }
        if (this.allowHttp) {
            if (!Intrinsics.areEqual(uri.getScheme(), "http") && !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
                return false;
            }
        } else if (!Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
            return false;
        }
        String host = uri.getHost();
        if (host == null || host.length() == 0 || (strM58815a = INSTANCE.m58815a(uri)) == null || strM58815a.length() == 0) {
            return false;
        }
        if (uri.getPort() == -1 || uri.getPort() == 443) {
            return this.topDomainSet.contains(strM58815a) || this.hostSet.contains(host) || this.fullUrlSet.contains(uri.toString());
        }
        return this.fullUrlSet.contains(uri.toString());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58814g(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!m58812e()) {
            Uri uriM58889h = C24335h.f48569a.m58889h(url);
            if (uriM58889h == null) {
                return false;
            }
            return m58813f(uriM58889h);
        }
        C43846g.m96568c(new WebCoreMessage("WhiteListMatcher isEmpty " + url, "WhiteListMatcher", false, 4, null), null, 2, null);
        return false;
    }

    public /* synthetic */ WhiteListMatcher(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
