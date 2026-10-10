package com.squareup.picasso;

import android.net.NetworkInfo;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes59.dex */
public class NetworkRequestHandler extends AbstractC27836t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC27826j f56670a;

    /* JADX INFO: renamed from: b */
    public final C27838v f56671b;

    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i11, int i12) {
            super("HTTP " + i11);
            this.code = i11;
            this.networkPolicy = i12;
        }
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: e */
    public int mo68784e() {
        return 2;
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: i */
    public boolean mo68786i() {
        return true;
    }

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Request m68783j(C27834r c27834r, int i11) {
        CacheControl cacheControlBuild;
        if (i11 == 0) {
            cacheControlBuild = null;
        } else if (NetworkPolicy.isOfflineOnly(i11)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i11)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i11)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(c27834r.f56803d.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        return builderUrl.build();
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        String scheme = c27834r.f56803d.getScheme();
        return "http".equals(scheme) || ProxyConfig.MATCH_HTTPS.equals(scheme);
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: h */
    public boolean mo68785h(boolean z11, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public NetworkRequestHandler(InterfaceC27826j interfaceC27826j, C27838v c27838v) {
        this.f56670a = interfaceC27826j;
        this.f56671b = c27838v;
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        Picasso.LoadedFrom loadedFrom;
        Response responseMo68876a = this.f56670a.mo68876a(m68783j(c27834r, i11));
        ResponseBody responseBodyBody = responseMo68876a.body();
        if (responseMo68876a.isSuccessful()) {
            if (responseMo68876a.cacheResponse() == null) {
                loadedFrom = Picasso.LoadedFrom.NETWORK;
            } else {
                loadedFrom = Picasso.LoadedFrom.DISK;
            }
            if (loadedFrom == Picasso.LoadedFrom.DISK && responseBodyBody.getContentLength() == 0) {
                responseBodyBody.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseBodyBody.getContentLength() > 0) {
                this.f56671b.m68926f(responseBodyBody.getContentLength());
            }
            return new AbstractC27836t.a(responseBodyBody.getBodySource(), loadedFrom);
        }
        responseBodyBody.close();
        throw new ResponseException(responseMo68876a.code(), c27834r.f56802c);
    }
}
