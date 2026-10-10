package com.jumio.core.network;

import com.jumio.core.util.CloseableExtKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.HttpsURLConnection;
import jumio.core.C40611W0;
import jumio.core.C40616X0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/network/DownloadService;", "Lcom/jumio/core/network/DownloadServiceInterface;", "<init>", "()V", "connection", "Ljavax/net/ssl/HttpsURLConnection;", "download", "Lcom/jumio/core/network/DownloadResponse;", "url", "", "timeout", "", "id", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DownloadService implements DownloadServiceInterface {

    /* JADX INFO: renamed from: a */
    public HttpsURLConnection f14415a;

    @Override // com.jumio.core.network.DownloadServiceInterface
    public void close() throws IOException {
        HttpsURLConnection httpsURLConnection = this.f14415a;
        if (httpsURLConnection != null) {
            InputStream inputStream = httpsURLConnection.getInputStream();
            if (inputStream != null) {
                CloseableExtKt.closeQuietly(inputStream);
            }
            HttpsURLConnection httpsURLConnection2 = this.f14415a;
            HttpsURLConnection httpsURLConnection3 = null;
            if (httpsURLConnection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connection");
                httpsURLConnection2 = null;
            }
            if (httpsURLConnection2.getDoOutput()) {
                HttpsURLConnection httpsURLConnection4 = this.f14415a;
                if (httpsURLConnection4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connection");
                    httpsURLConnection4 = null;
                }
                OutputStream outputStream = httpsURLConnection4.getOutputStream();
                if (outputStream != null) {
                    CloseableExtKt.closeQuietly(outputStream);
                }
            }
            HttpsURLConnection httpsURLConnection5 = this.f14415a;
            if (httpsURLConnection5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connection");
                httpsURLConnection5 = null;
            }
            InputStream errorStream = httpsURLConnection5.getErrorStream();
            if (errorStream != null) {
                CloseableExtKt.closeQuietly(errorStream);
            }
            HttpsURLConnection httpsURLConnection6 = this.f14415a;
            if (httpsURLConnection6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connection");
            } else {
                httpsURLConnection3 = httpsURLConnection6;
            }
            httpsURLConnection3.disconnect();
        }
    }

    @Override // com.jumio.core.network.DownloadServiceInterface
    @Nullable
    public Object download(@NotNull String str, int i11, @NotNull String str2, @NotNull Continuation<? super C40611W0> continuation) throws IllegalArgumentException {
        return C41686h.m91049g(C41782z0.m91392b(), new C40616X0(str, this, i11, null), continuation);
    }
}
