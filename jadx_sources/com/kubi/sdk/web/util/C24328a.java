package com.kubi.sdk.web.util;

import android.webkit.CookieManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebCoreException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.a */
/* JADX INFO: compiled from: CookieUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/web/util/a;", "", "<init>", "()V", "", "cookie", "Lkotlin/text/Regex;", "regex", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/text/Regex;)Ljava/lang/String;", "url", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Lkotlin/text/Regex;", "grayRegex", "sessionRegex", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\ncom/kubi/sdk/web/util/CookieUtils\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,56:1\n86#2,3:57\n86#2,3:60\n86#2,3:63\n*S KotlinDebug\n*F\n+ 1 CookieUtils.kt\ncom/kubi/sdk/web/util/CookieUtils\n*L\n28#1:57,3\n40#1:60,3\n52#1:63,3\n*E\n"})
public final class C24328a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24328a f48555a = new C24328a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Regex grayRegex = new Regex("WEBGRAY=([^;]+)");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Regex sessionRegex = new Regex("SESSION=([^;]+)");

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m58858a(@NotNull String cookie, @NotNull Regex regex) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(regex, "regex");
        try {
            MatchResult matchResultFind$default = Regex.find$default(regex, cookie, 0, 2, null);
            if (matchResultFind$default == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(matchResultFind$default.getGroupValues(), 1);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "CookieUtils", false, "findValue " + regex + " err", 4, null), null, 2, null);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m58859b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String cookie = CookieManager.getInstance().getCookie(url);
            if (cookie == null) {
                return null;
            }
            return m58858a(cookie, sessionRegex);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "CookieUtils", false, "getSessionValue err", 4, null), null, 2, null);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m58860c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String cookie = CookieManager.getInstance().getCookie(url);
            if (cookie == null) {
                return null;
            }
            return m58858a(cookie, grayRegex);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "CookieUtils", false, "getWebGrayValue err", 4, null), null, 2, null);
            return null;
        }
    }
}
