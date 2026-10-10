package com.facebook.imagepipeline.backends.okhttp3;

import okhttp3.Headers;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OkHttpNetworkFetcherException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00060\u0002j\u0002`\u0001:\u0001\u000eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "responseCode", "", "responseHeaders", "Lokhttp3/Headers;", "<init>", "(Ljava/lang/Integer;Lokhttp3/Headers;)V", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponseHeaders", "()Lokhttp3/Headers;", "Companion", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class OkHttpNetworkFetcherException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer responseCode;

    @Nullable
    private final Headers responseHeaders;

    /* JADX INFO: compiled from: OkHttpNetworkFetcherException.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException$Companion;", "", "<init>", "()V", "fromResponse", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "response", "Lokhttp3/Response;", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final OkHttpNetworkFetcherException fromResponse(@NotNull Response response) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(response, "response");
            Response responseNetworkResponse = response.networkResponse();
            Headers headers = null;
            if (responseNetworkResponse != null) {
                numValueOf = Integer.valueOf(responseNetworkResponse.code());
            } else {
                numValueOf = null;
            }
            Response responseNetworkResponse2 = response.networkResponse();
            if (responseNetworkResponse2 != null) {
                headers = responseNetworkResponse2.headers();
            }
            return new OkHttpNetworkFetcherException(numValueOf, headers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpNetworkFetcherException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ OkHttpNetworkFetcherException(Integer num, Headers headers, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : headers);
    }

    @JvmStatic
    @NotNull
    public static final OkHttpNetworkFetcherException fromResponse(@NotNull Response response) {
        return INSTANCE.fromResponse(response);
    }

    @Nullable
    public final Integer getResponseCode() {
        return this.responseCode;
    }

    @Nullable
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    public OkHttpNetworkFetcherException(@Nullable Integer num, @Nullable Headers headers) {
        this.responseCode = num;
        this.responseHeaders = headers;
    }
}
