package com.sumsub.sns.internal.core.data.network.interceptor;

import androidx.media3.common.MimeTypes;
import androidx.webkit.ProxyConfig;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.util.json.AbstractC33409a;
import com.tencent.bugly.proguard.C33627eb;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.interceptor.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28523e implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final List f58059a;

    /* JADX INFO: renamed from: b */
    public final List f58060b;

    /* JADX INFO: renamed from: c */
    public final List f58061c;

    /* JADX INFO: renamed from: d */
    public final List f58062d;

    /* JADX INFO: renamed from: e */
    public final AbstractC46162a f58063e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC28522d f58064f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f58065g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f58066h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f58067i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f58068j;

    /* JADX INFO: renamed from: k */
    public HttpLoggingInterceptor$Level f58069k;

    /* JADX INFO: renamed from: a */
    public final void m69394a(Interceptor.Chain chain, HttpUrl httpUrl, boolean z11, RequestBody requestBody) throws IOException {
        Request request = chain.request();
        Connection connection = chain.connection();
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        for (String str : httpUrl.queryParameterNames()) {
            if (this.f58065g.contains(str)) {
                builderNewBuilder.setQueryParameter(str, "...");
            }
        }
        String url = builderNewBuilder.build().getUrl();
        String str2 = "--> " + request.method() + C33627eb.f69716f + url;
        if (connection != null) {
            str2 = str2 + C33627eb.f69716f + connection.protocol();
        }
        if (!z11 && requestBody != null) {
            str2 = str2 + " (" + requestBody.contentLength() + "-byte body)";
        }
        this.f58064f.mo69371a(str2);
    }

    public C28523e(List list, List list2, List list3, List list4, InterfaceC28522d interfaceC28522d, int i11) {
        list = (i11 & 1) != 0 ? CollectionsKt.emptyList() : list;
        list2 = (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2;
        list3 = (i11 & 4) != 0 ? CollectionsKt.emptyList() : list3;
        list4 = (i11 & 8) != 0 ? CollectionsKt.emptyList() : list4;
        AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
        interfaceC28522d = (i11 & 32) != 0 ? C28521c.f58058a : interfaceC28522d;
        this.f58059a = list;
        this.f58060b = list2;
        this.f58061c = list3;
        this.f58062d = list4;
        this.f58063e = abstractC46162aM69286a;
        this.f58064f = interfaceC28522d;
        this.f58065g = new LinkedHashSet();
        this.f58066h = new LinkedHashSet();
        this.f58067i = new LinkedHashSet();
        this.f58068j = new LinkedHashSet();
        this.f58069k = HttpLoggingInterceptor$Level.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z11;
        boolean z12;
        long j11;
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = this.f58069k;
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        String url = httpUrlUrl.getUrl();
        if (httpLoggingInterceptor$Level != HttpLoggingInterceptor$Level.NONE) {
            List list = this.f58059a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Regex) it.next()).containsMatchIn(url)) {
                    }
                }
            }
            RequestBody requestBodyBody = request.body();
            List list2 = this.f58061c;
            if (list2 != null && list2.isEmpty()) {
                z11 = false;
                break;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                if (((Regex) it2.next()).containsMatchIn(url)) {
                    z11 = true;
                    break;
                }
            }
            LinkedHashSet linkedHashSet = this.f58068j;
            if (linkedHashSet != null && linkedHashSet.isEmpty()) {
                z12 = false;
                break;
            }
            Iterator it3 = linkedHashSet.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z12 = false;
                    break;
                }
                if (((Regex) it3.next()).containsMatchIn(url)) {
                    z12 = true;
                    break;
                }
            }
            HttpLoggingInterceptor$Level httpLoggingInterceptor$Level2 = HttpLoggingInterceptor$Level.BODY;
            boolean z13 = httpLoggingInterceptor$Level == httpLoggingInterceptor$Level2;
            boolean z14 = httpLoggingInterceptor$Level == httpLoggingInterceptor$Level2 || httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.HEADERS;
            m69394a(chain, httpUrlUrl, z14, requestBodyBody);
            m69395a(request, z14, z13, z11, z12);
            long jNanoTime = System.nanoTime();
            try {
                Response responseProceed = chain.proceed(request);
                m69399a(responseProceed, z14, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
                if (z14) {
                    Headers headers = responseProceed.headers();
                    int size = headers.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        m69393a(headers, i11);
                    }
                    if (!z13 || Intrinsics.areEqual(responseProceed.request().method(), "HEAD")) {
                        this.f58064f.mo69371a("<-- END HTTP");
                    } else {
                        int iCode = responseProceed.code();
                        if ((100 <= iCode && iCode < 200) || iCode == 204 || iCode == 304) {
                            String str = responseProceed.headers().get("Content-Length");
                            if (str != null) {
                                try {
                                    j11 = Long.parseLong(str);
                                } catch (NumberFormatException unused) {
                                    j11 = -1;
                                }
                            } else {
                                j11 = -1;
                            }
                            if (j11 == -1 && !StringsKt.equals("chunked", Response.header$default(responseProceed, HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) {
                                this.f58064f.mo69371a("<-- END HTTP");
                            }
                        }
                        if (z11) {
                            this.f58064f.mo69371a("<-- END HTTP (body skipped)");
                        } else {
                            String str2 = responseProceed.headers().get("Content-Encoding");
                            if (str2 == null || StringsKt.equals(str2, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, true) || StringsKt.equals(str2, "gzip", true)) {
                                m69398a(responseProceed, headers, z12);
                            } else {
                                this.f58064f.mo69371a("<-- END HTTP (encoded body omitted)");
                            }
                        }
                    }
                }
                return responseProceed;
            } catch (Exception e11) {
                this.f58064f.mo69371a("<-- HTTP FAILED: " + e11);
                throw e11;
            }
        }
        return chain.proceed(request);
    }

    /* JADX INFO: renamed from: a */
    public final void m69395a(Request request, boolean z11, boolean z12, boolean z13, boolean z14) throws IOException {
        if (z11) {
            Headers headers = request.headers();
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null) {
                m69397a(requestBodyBody, headers);
            }
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                m69393a(headers, i11);
            }
            if (!z12 || requestBodyBody == null) {
                this.f58064f.mo69371a("--> END " + request.method());
                return;
            }
            if (z13) {
                this.f58064f.mo69371a("--> END " + request.method() + " (body skipped)");
                return;
            }
            String str = request.headers().get("Content-Encoding");
            if (str != null && !StringsKt.equals(str, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, true) && !StringsKt.equals(str, "gzip", true)) {
                this.f58064f.mo69371a("--> END " + request.method() + " (encoded body omitted)");
                return;
            }
            if (requestBodyBody.isDuplex()) {
                this.f58064f.mo69371a("--> END " + request.method() + " (duplex request body omitted)");
                return;
            }
            if (requestBodyBody.isOneShot()) {
                this.f58064f.mo69371a("--> END " + request.method() + " (one-shot body omitted)");
                return;
            }
            m69396a(requestBodyBody, request.method(), z14);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69397a(RequestBody requestBody, Headers headers) throws IOException {
        MediaType mediaType = requestBody.getF27464i();
        if (mediaType != null && headers.get("Content-Type") == null) {
            this.f58064f.mo69371a("Content-Type: " + mediaType);
        }
        if (requestBody.contentLength() == -1 || headers.get("Content-Length") != null) {
            return;
        }
        this.f58064f.mo69371a("Content-Length: " + requestBody.contentLength());
    }

    /* JADX INFO: renamed from: a */
    public final void m69396a(RequestBody requestBody, String str, boolean z11) throws IOException {
        Charset charset;
        MediaType mediaType = requestBody.getF27464i();
        this.f58064f.mo69371a("");
        if (m69400a(mediaType)) {
            this.f58064f.mo69371a("--> END " + str + " (" + mediaType + C33627eb.f69716f + requestBody.contentLength() + "-byte body omitted)");
            return;
        }
        if (z11) {
            this.f58064f.mo69371a("██");
            this.f58064f.mo69371a("--> END " + str + " (" + requestBody.contentLength() + "-byte body)");
            return;
        }
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        if (mediaType == null || (charset = mediaType.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
        }
        if (!m69391a(buffer)) {
            this.f58064f.mo69371a("--> END " + str + " (binary " + requestBody.contentLength() + "-byte body omitted)");
            return;
        }
        String string = buffer.readString(charset);
        if (mediaType != null && Intrinsics.areEqual(mediaType.type(), MimeTypes.BASE_TYPE_APPLICATION) && Intrinsics.areEqual(mediaType.subtype(), JPushConstants.Analysis.KEY_JSON)) {
            string = m69392a(string);
        }
        this.f58064f.mo69371a(string);
        this.f58064f.mo69371a("--> END " + str + " (" + requestBody.contentLength() + "-byte body)");
    }

    /* JADX INFO: renamed from: a */
    public final void m69399a(Response response, boolean z11, long j11) {
        ResponseBody responseBodyBody = response.body();
        long j12 = responseBodyBody != null ? responseBodyBody.getContentLength() : 0L;
        String str = response.message().length() == 0 ? "" : C33627eb.f69716f + response.message();
        String str2 = z11 ? "" : ", " + (j12 != -1 ? j12 + "-byte" : "unknown-length") + " body";
        HttpUrl httpUrlUrl = response.request().url();
        HttpUrl.Builder builderNewBuilder = httpUrlUrl.newBuilder();
        for (String str3 : httpUrlUrl.queryParameterNames()) {
            if (this.f58065g.contains(str3)) {
                builderNewBuilder.setQueryParameter(str3, "...");
            }
        }
        this.f58064f.mo69371a("<-- " + response.code() + str + C33627eb.f69716f + builderNewBuilder.build().getUrl() + " (" + j11 + "ms" + str2 + ")");
    }

    /* JADX INFO: renamed from: a */
    public final void m69398a(Response response, Headers headers, boolean z11) throws IOException {
        Long lValueOf;
        Buffer buffer;
        Charset charset;
        ResponseBody responseBodyBody = response.body();
        Long lValueOf2 = responseBodyBody != null ? Long.valueOf(responseBodyBody.getContentLength()) : null;
        BufferedSource bodySource = responseBodyBody != null ? responseBodyBody.getSource() : null;
        if (bodySource != null) {
            bodySource.request(Long.MAX_VALUE);
        }
        if (StringsKt.equals("gzip", headers.get("Content-Encoding"), true) && bodySource != null) {
            lValueOf = Long.valueOf(bodySource.getBuffer().size());
            GzipSource gzipSource = new GzipSource(bodySource.getBuffer().clone());
            try {
                buffer = new Buffer();
                buffer.writeAll(gzipSource);
                CloseableKt.closeFinally(gzipSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(gzipSource, th2);
                    throw th3;
                }
            }
        } else if (bodySource != null) {
            buffer = bodySource.getBuffer();
            lValueOf = null;
        } else {
            lValueOf = null;
            buffer = null;
        }
        MediaType mediaType = responseBodyBody != null ? responseBodyBody.get$contentType() : null;
        if (mediaType == null || (charset = mediaType.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
        }
        if (buffer == null) {
            this.f58064f.mo69371a("");
            this.f58064f.mo69371a("<-- END HTTP (null body)");
            return;
        }
        if (!m69391a(buffer)) {
            this.f58064f.mo69371a("");
            this.f58064f.mo69371a("<-- END HTTP (binary " + buffer.size() + "-byte body omitted)");
            return;
        }
        if (m69400a(mediaType)) {
            this.f58064f.mo69371a("");
            this.f58064f.mo69371a("<-- END HTTP (" + mediaType + C33627eb.f69716f + buffer.size() + "-byte body omitted)");
            return;
        }
        if (lValueOf2 == null || lValueOf2.longValue() != 0) {
            this.f58064f.mo69371a("");
            if (z11) {
                this.f58064f.mo69371a("██");
            } else {
                String string = buffer.clone().readString(charset);
                if (mediaType != null && Intrinsics.areEqual(mediaType.type(), MimeTypes.BASE_TYPE_APPLICATION) && Intrinsics.areEqual(mediaType.subtype(), JPushConstants.Analysis.KEY_JSON)) {
                    string = m69392a(string);
                }
                this.f58064f.mo69371a(string);
            }
        }
        if (lValueOf != null) {
            this.f58064f.mo69371a("<-- END HTTP (" + buffer.size() + "-byte, " + lValueOf + "-gzipped-byte body)");
            return;
        }
        this.f58064f.mo69371a("<-- END HTTP (" + buffer.size() + "-byte body)");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69400a(MediaType mediaType) {
        if (mediaType == null) {
            return false;
        }
        List<MediaType> list = this.f58062d;
        if (list == null || !list.isEmpty()) {
            for (MediaType mediaType2 : list) {
                if (Intrinsics.areEqual(mediaType2.type(), mediaType.type()) && Intrinsics.areEqual(mediaType2.subtype(), ProxyConfig.MATCH_ALL_SCHEMES)) {
                    return true;
                }
            }
        }
        List<MediaType> list2 = this.f58062d;
        if (list2 == null || !list2.isEmpty()) {
            for (MediaType mediaType3 : list2) {
                if (Intrinsics.areEqual(mediaType3.type(), mediaType.type()) && Intrinsics.areEqual(mediaType3.subtype(), mediaType.subtype())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m69393a(Headers headers, int i11) {
        String strName = headers.name(i11);
        List list = this.f58060b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).containsMatchIn(strName)) {
                    return;
                }
            }
        }
        String strValue = this.f58066h.contains(strName) ? "██" : headers.value(i11);
        this.f58064f.mo69371a(strName + ": " + strValue);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m69391a(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, RangesKt.coerceAtMost(buffer.size(), 64L));
            for (int i11 = 0; i11 < 16 && !buffer2.exhausted(); i11++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m69392a(String str) {
        if (this.f58067i.isEmpty()) {
            return str;
        }
        try {
            JsonElement jsonElementM101767g = this.f58063e.m101767g(str);
            AbstractC46162a abstractC46162a = this.f58063e;
            JsonElement jsonElementM71694a = AbstractC33409a.m71694a(jsonElementM101767g, this.f58067i, "");
            abstractC46162a.getSerializersModule();
            return abstractC46162a.mo99409b(JsonElement.INSTANCE.serializer(), jsonElementM71694a);
        } catch (SerializationException unused) {
            return str;
        }
    }
}
