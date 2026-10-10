package com.kubi.host.core;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5273h0;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import o00.C42917g;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p799yj.C46509a;
import p834zj.C46881a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.host.core.h */
/* JADX INFO: compiled from: Inet6Monitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/host/core/h;", "", "<init>", "()V", "Lyj/a;", "_config", "", "e", "(Lyj/a;)V", "", "Ljava/net/InetAddress;", "addressList", "", "b", "(Ljava/util/List;)Z", "f", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lyj/a;", "config", "Lcom/kubi/host/core/Inet6CfList;", "Lcom/kubi/host/core/Inet6CfList;", "cfList", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInet6Monitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Inet6Monitor.kt\ncom/kubi/host/core/Inet6Monitor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 HostIssueException.kt\ncom/kubi/host/exception/HostIssueExceptionKt\n*L\n1#1,232:1\n1549#2:233\n1620#2,3:234\n23#3,2:237\n44#4,35:239\n*S KotlinDebug\n*F\n+ 1 Inet6Monitor.kt\ncom/kubi/host/core/Inet6Monitor\n*L\n33#1:233\n33#1:234,3\n66#1:237,2\n78#1:239,35\n*E\n"})
public final class C15186h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public C46509a config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Inet6CfList cfList;

    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX INFO: renamed from: d */
    public static final void m31411d(C15186h this$0) {
        String message;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            C46509a c46509a = this$0.config;
            if (c46509a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
                c46509a = null;
            }
            Response responseExecute = c46509a.getOkHttpClient().newCall(new Request.Builder().url("https://www.cloudflare.com/ips-v6").build()).execute();
            if (responseExecute.isSuccessful()) {
                ResponseBody responseBodyBody = responseExecute.body();
                String strM66668h = C27041f.m66668h(responseBodyBody != null ? responseBodyBody.string() : null);
                if (TextUtils.isEmpty(strM66668h)) {
                    return;
                }
                DataMapUtil.f54245a.m66380o("inet6_cache", strM66668h);
                this$0.cfList = Inet6CfList.INSTANCE.create(strM66668h);
            }
        } catch (Throwable th2) {
            boolean zStartsWith$default = true;
            if (!(th2 instanceof SocketException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof HttpException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
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
                C44128b.m97263g("Inet6Monitor", th2);
            } else {
                C46881a.m103216b(th2, "Inet6Monitor");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m31412b(@NotNull List<? extends InetAddress> addressList) {
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(addressList, 10));
        Iterator<T> it = addressList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getHostAddress());
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Inet6CfList inet6CfList = this.cfList;
        C46509a c46509a = null;
        if (inet6CfList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cfList");
            inet6CfList = null;
        }
        String strM31391e = inet6CfList.m31391e(arrayList);
        if (strM31391e == null) {
            return false;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ping6 -c ");
        C46509a c46509a2 = this.config;
        if (c46509a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        } else {
            c46509a = c46509a2;
        }
        sb2.append(C27039d.m66651k(c46509a.getMonitorConfig().getPingCount(), 3));
        sb2.append(" %s");
        String str = String.format(sb2.toString(), Arrays.copyOf(new Object[]{strM31391e}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        C5273h0.a aVarM6231a = C5273h0.m6231a(str, false);
        if (aVarM6231a.f6545a != 0 || TextUtils.isEmpty(aVarM6231a.f6546b)) {
            return false;
        }
        return Pattern.compile("\\d+(.\\d+)?/\\d+(.\\d+)?/\\d+(.\\d+)?/\\d+(.\\d+)?").matcher(aVarM6231a.f6546b).find();
    }

    /* JADX INFO: renamed from: c */
    public final void m31413c() {
        C42917g.m94138d().execute(new Runnable() { // from class: com.kubi.host.core.g
            @Override // java.lang.Runnable
            public final void run() {
                C15186h.m31411d(this.f27133b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m31414e(@NotNull C46509a _config) {
        Intrinsics.checkNotNullParameter(_config, "_config");
        this.config = _config;
        m31415f();
        m31413c();
    }

    /* JADX INFO: renamed from: f */
    public final void m31415f() {
        Inet6CfList.Companion companion = Inet6CfList.INSTANCE;
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        C46509a c46509a = this.config;
        if (c46509a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            c46509a = null;
        }
        this.cfList = companion.create(dataMapUtil.m66375i("inet6_cache", c46509a.getMonitorInet6Default()));
    }
}
