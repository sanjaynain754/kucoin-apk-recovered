package okhttp3;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: JavaNetCookieJar.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "cookieHandler", "Ljava/net/CookieHandler;", "(Ljava/net/CookieHandler;)V", "decodeHeaderAsJavaNetCookies", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "header", "", "loadForRequest", "saveFromResponse", "", "cookies", "okhttp-urlconnection"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler cookieHandler;

    public JavaNetCookieJar(@NotNull CookieHandler cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.cookieHandler = cookieHandler;
    }

    private final List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl url, String header) {
        ArrayList arrayList = new ArrayList();
        int length = header.length();
        int i11 = 0;
        while (i11 < length) {
            int iDelimiterOffset = Util.delimiterOffset(header, ";,", i11, length);
            int iDelimiterOffset2 = Util.delimiterOffset(header, '=', i11, iDelimiterOffset);
            String strTrimSubstring = Util.trimSubstring(header, i11, iDelimiterOffset2);
            if (!StringsKt.startsWith$default(strTrimSubstring, "$", false, 2, (Object) null)) {
                String strTrimSubstring2 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(header, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (StringsKt.startsWith$default(strTrimSubstring2, "\"", false, 2, (Object) null) && StringsKt.endsWith$default(strTrimSubstring2, "\"", false, 2, (Object) null)) {
                    strTrimSubstring2 = strTrimSubstring2.substring(1, strTrimSubstring2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strTrimSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new Cookie.Builder().name(strTrimSubstring).value(strTrimSubstring2).domain(url.host()).build());
            }
            i11 = iDelimiterOffset + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.cookieHandler.get(url.uri(), MapsKt.emptyMap());
            Intrinsics.checkNotNullExpressionValue(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (StringsKt.equals(HttpHeaders.COOKIE, key, true) || StringsKt.equals("Cookie2", key, true)) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (!value.isEmpty()) {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.checkNotNullExpressionValue(header, "header");
                            arrayList.addAll(decodeHeaderAsJavaNetCookies(url, header));
                        }
                    }
                }
            }
            if (arrayList != null) {
                List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
                return listUnmodifiableList;
            }
            return CollectionsKt.emptyList();
        } catch (IOException e11) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb2.append(httpUrlResolve);
            platform.log(sb2.toString(), 5, e11);
            return CollectionsKt.emptyList();
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(Internal.cookieToString(it.next(), true));
        }
        try {
            this.cookieHandler.put(url.uri(), MapsKt.mapOf(TuplesKt.m90091to(HttpHeaders.SET_COOKIE, arrayList)));
        } catch (IOException e11) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb2.append(httpUrlResolve);
            platform.log(sb2.toString(), 5, e11);
        }
    }
}
