package com.kubi.network.subscribe.period;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.retrofit.utils.C19333e;
import com.kubi.network.socket.C19343b;
import com.kubi.network.subscribe.period.OnetimeExecutor;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import o00.C42917g;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p735wr.C45917a;
import p841zr.InterfaceC46910a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: OnetimeExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/network/subscribe/period/OnetimeExecutor;", "Lzr/a;", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "Lcom/kubi/network/socket/b;", "config", "<init>", "(Lcom/kubi/network/socket/b;)V", "request", "", "d", "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V", "g", "", "data", "", "ignore", "", "f", "(Ljava/lang/Object;Z)Ljava/lang/String;", "b", "Lcom/kubi/network/socket/b;", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOnetimeExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnetimeExecutor.kt\ncom/kubi/network/subscribe/period/OnetimeExecutor\n+ 2 NetCoreSubIssue.kt\ncom/kubi/network/subscribe/exception/NetCoreSubIssueKt\n*L\n1#1,57:1\n52#2,33:58\n*S KotlinDebug\n*F\n+ 1 OnetimeExecutor.kt\ncom/kubi/network/subscribe/period/OnetimeExecutor\n*L\n28#1:58,33\n*E\n"})
public final class OnetimeExecutor implements InterfaceC46910a<PeriodRequest> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C19343b config;

    public OnetimeExecutor(@NotNull C19343b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX INFO: renamed from: e */
    public static final void m43080e(OnetimeExecutor this$0, PeriodRequest request) {
        String message;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        try {
            this$0.m43084g(request);
        } catch (Throwable th2) {
            boolean zStartsWith$default = true;
            if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
                if (th2 instanceof SecurityException) {
                    String message2 = th2.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    } else {
                        zStartsWith$default = false;
                    }
                } else if (!(th2 instanceof IOException) || (message = th2.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                    zStartsWith$default = false;
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("OnetimeExecutor", th2);
            } else {
                C45917a.m101368b(th2, "OnetimeExecutor");
            }
        }
    }

    @Override // p841zr.InterfaceC46910a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo43081a(@NotNull final PeriodRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C42917g.m94137c().execute(new Runnable() { // from class: zr.b
            @Override // java.lang.Runnable
            public final void run() {
                OnetimeExecutor.m43080e(this.f104781b, request);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final String m43083f(Object data, boolean ignore) throws IOException {
        String string = data != null ? data.toString() : null;
        return (string == null || Intrinsics.areEqual(string, "null")) ? "" : data.toString();
    }

    /* JADX INFO: renamed from: g */
    public final void m43084g(PeriodRequest request) {
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.config.getOkHttpClient().newCall(request.getRequest()));
            if (!responseExecute.isSuccessful() || responseExecute.body() == null) {
                throw new RuntimeException("Socket请求Http失败[code = " + responseExecute.code() + ", request = " + request.getRequest().url() + "]}");
            }
            C19333e c19333e = C19333e.f35973a;
            ResponseBody responseBodyBody = responseExecute.body();
            Intrinsics.checkNotNull(responseBodyBody);
            String str = (String) c19333e.m42845b(responseBodyBody, new OnetimeExecutor$process$body$1(this));
            C44128b.m97268l("CATEGORY_SOCKET", "http.resp = " + str);
            this.config.m42894a().invoke(new NetworkMessage<>(request.getId(), new SubscribeMessage(request.getId(), null, null, null, str, null, System.currentTimeMillis(), 46, null)));
        } catch (Throwable th2) {
            this.config.m42894a().invoke(new NetworkMessage<>(request.getId(), new SubscribeMessage(request.getId(), null, null, null, null, th2, System.currentTimeMillis(), 30, null)));
        }
    }
}
