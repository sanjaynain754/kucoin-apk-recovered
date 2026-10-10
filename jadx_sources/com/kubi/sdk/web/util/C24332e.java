package com.kubi.sdk.web.util;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.collection.LruCache;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.tracker.CacheFileType;
import com.tencent.bugly.proguard.C33590cg;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.e */
/* JADX INFO: compiled from: MimeTypeUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/web/util/e;", "", "<init>", "()V", "", "url", "c", "(Ljava/lang/String;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/web/tracker/CacheFileType;", "b", "(Ljava/lang/String;)Lcom/kubi/sdk/web/tracker/CacheFileType;", "Landroidx/collection/LruCache;", "Landroidx/collection/LruCache;", C33590cg.f69440j, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24332e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24332e f48564a = new C24332e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final LruCache<String, String> cache = new LruCache<>(16);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m58876c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String strM58880b = C24333f.m58880b(MimeTypeMap.getFileExtensionFromUrl(url));
            return strM58880b == null ? "" : strM58880b;
        } catch (Exception unused) {
            C44128b.m97259c("MimeTypeUtils", "error url is " + url);
            return "";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58877a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        LruCache<String, String> lruCache = cache;
        String str = lruCache.get(url);
        if (str != null) {
            return str;
        }
        String strM58876c = m58876c(url);
        lruCache.put(url, strM58876c);
        return strM58876c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final CacheFileType m58878b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uriM58889h = C24335h.f48569a.m58889h(url);
        if (uriM58889h == null) {
            return CacheFileType.OTHER;
        }
        String encodedPath = uriM58889h.getEncodedPath();
        if (encodedPath == null) {
            return CacheFileType.OTHER;
        }
        if (StringsKt.endsWith(encodedPath, ".css", true)) {
            return CacheFileType.CSS;
        }
        if (StringsKt.endsWith(encodedPath, ".js", true)) {
            return CacheFileType.JS;
        }
        if (StringsKt.endsWith(encodedPath, ".png", true) || StringsKt.endsWith(url, ".jpg", true) || StringsKt.endsWith(url, ".jpeg", true) || StringsKt.endsWith(url, ".gif", true) || StringsKt.endsWith(url, ".bmp", true) || StringsKt.endsWith(url, ".webp", true)) {
            return CacheFileType.IMG;
        }
        return StringsKt.endsWith(encodedPath, ".html", true) ? CacheFileType.HTML : CacheFileType.OTHER;
    }
}
