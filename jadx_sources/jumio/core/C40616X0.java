package jumio.core;

import androidx.webkit.ProxyConfig;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.core.ServiceLocator;
import com.jumio.core.ServiceLocatorInterface;
import com.jumio.core.network.DownloadService;
import com.jumio.core.network.TrustManagerInterface;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.TrustManager;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.X0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40616X0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f90174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadService f90175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f90176c;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URL url = new URL(this.f90174a);
        if (!url.getProtocol().equals(ProxyConfig.MATCH_HTTPS)) {
            throw new IllegalArgumentException("Only https DownloadTasks are supported!");
        }
        DownloadService downloadService = this.f90175b;
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        downloadService.f14415a = (HttpsURLConnection) uRLConnection;
        HttpsURLConnection httpsURLConnection = null;
        TrustManagerInterface trustManagerInterface = (TrustManagerInterface) ServiceLocatorInterface.getServiceImplementation$default(ServiceLocator.INSTANCE, TrustManagerInterface.class, null, 2, null);
        String host = url.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
        trustManagerInterface.setHostname(host);
        HttpsURLConnection httpsURLConnection2 = this.f90175b.f14415a;
        if (httpsURLConnection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection2 = null;
        }
        httpsURLConnection2.setSSLSocketFactory(new C40594S3(new TrustManager[]{trustManagerInterface}));
        HttpsURLConnection httpsURLConnection3 = this.f90175b.f14415a;
        if (httpsURLConnection3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection3 = null;
        }
        httpsURLConnection3.setDoInput(true);
        HttpsURLConnection httpsURLConnection4 = this.f90175b.f14415a;
        if (httpsURLConnection4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection4 = null;
        }
        httpsURLConnection4.setConnectTimeout(this.f90176c);
        HttpsURLConnection httpsURLConnection5 = this.f90175b.f14415a;
        if (httpsURLConnection5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection5 = null;
        }
        httpsURLConnection5.setReadTimeout(this.f90176c);
        HttpsURLConnection httpsURLConnection6 = this.f90175b.f14415a;
        if (httpsURLConnection6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection6 = null;
        }
        httpsURLConnection6.connect();
        HttpsURLConnection httpsURLConnection7 = this.f90175b.f14415a;
        if (httpsURLConnection7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection7 = null;
        }
        int responseCode = httpsURLConnection7.getResponseCode();
        HttpsURLConnection httpsURLConnection8 = this.f90175b.f14415a;
        if (httpsURLConnection8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
            httpsURLConnection8 = null;
        }
        int contentLength = httpsURLConnection8.getContentLength();
        HttpsURLConnection httpsURLConnection9 = this.f90175b.f14415a;
        if (httpsURLConnection9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connection");
        } else {
            httpsURLConnection = httpsURLConnection9;
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return new C40611W0(responseCode, contentLength, inputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40616X0(String str, DownloadService downloadService, int i11, Continuation continuation) {
        super(2, continuation);
        this.f90174a = str;
        this.f90175b = downloadService;
        this.f90176c = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40616X0(this.f90174a, this.f90175b, this.f90176c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40616X0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }
}
