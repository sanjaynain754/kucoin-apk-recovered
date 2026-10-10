package com.kubi.sdk.web.http;

import android.webkit.CookieManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebCoreException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CookieManagerJar.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/web/http/CookieManagerJar;", "Lokhttp3/CookieJar;", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "cookies", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCookieManagerJar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieManagerJar.kt\ncom/kubi/sdk/web/http/CookieManagerJar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,45:1\n1603#2,9:46\n1855#2:55\n1856#2:57\n1612#2:58\n1855#2,2:62\n1#3:56\n86#4,3:59\n86#4,3:64\n*S KotlinDebug\n*F\n+ 1 CookieManagerJar.kt\ncom/kubi/sdk/web/http/CookieManagerJar\n*L\n20#1:46,9\n20#1:55\n20#1:57\n20#1:58\n33#1:62,2\n20#1:56\n25#1:59,3\n37#1:64,3\n*E\n"})
public final class CookieManagerJar implements CookieJar {
    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String cookie = CookieManager.getInstance().getCookie(url.getUrl());
            if (cookie == null) {
                return CollectionsKt.emptyList();
            }
            List listSplit$default = StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Cookie cookie2 = Cookie.INSTANCE.parse(url, (String) it.next());
                if (cookie2 != null) {
                    arrayList.add(cookie2);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C43846g.m96568c(new WebCoreException(th2, "CookieManagerJar", false, "loadForRequest", 4, null), null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        String url2 = url.getUrl();
        try {
            Iterator<T> it = cookies.iterator();
            while (it.hasNext()) {
                CookieManager.getInstance().setCookie(url2, ((Cookie) it.next()).toString());
            }
        } catch (Throwable th2) {
            C43846g.m96568c(new WebCoreException(th2, "CookieManagerJar", false, "saveFromResponse", 4, null), null, 2, null);
        }
    }
}
