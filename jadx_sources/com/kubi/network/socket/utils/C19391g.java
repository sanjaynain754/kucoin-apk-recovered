package com.kubi.network.socket.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Proxy;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.sdk.aspect.NetworkUtillAspect;
import dh0.C36686b;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.g */
/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/network/socket/utils/g;", "", "<init>", "()V", "", CmcdData.Factory.STREAM_TYPE_LIVE, "()Z", "m", "", "b", "()Ljava/lang/String;", "c", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "Landroid/net/ConnectivityManager;", "connectivityManager", "i", "(Landroid/net/ConnectivityManager;)Z", "Landroid/net/NetworkCapabilities;", "capabilities", "k", "(Landroid/net/NetworkCapabilities;)Z", "f", "g", "Landroid/content/Context;", "sContext", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nNetworkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkUtils.kt\ncom/kubi/network/socket/utils/NetworkUtils\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,180:1\n52#2,33:181\n*S KotlinDebug\n*F\n+ 1 NetworkUtils.kt\ncom/kubi/network/socket/utils/NetworkUtils\n*L\n142#1:181,33\n*E\n"})
public final class C19391g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19391g f36153a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Context sContext;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC43175a.a f36155c;

    @SuppressLint({"WrongConstant", "InlinedApi"})
    /* JADX INFO: renamed from: g */
    public final boolean m43064g(NetworkCapabilities capabilities) {
        if (capabilities == null) {
            return false;
        }
        return (capabilities.hasTransport(1) || capabilities.hasTransport(0) || capabilities.hasTransport(3) || capabilities.hasTransport(7) || capabilities.hasTransport(4) || capabilities.hasCapability(16)) && capabilities.hasCapability(16);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final boolean m43067k(NetworkCapabilities capabilities) {
        if (capabilities == null) {
            return false;
        }
        return capabilities.hasTransport(1) || capabilities.hasTransport(0) || capabilities.hasTransport(3) || capabilities.hasTransport(7) || capabilities.hasTransport(4) || capabilities.hasCapability(16);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43055a() {
        C36686b c36686b = new C36686b("NetworkUtils.kt", C19391g.class);
        f36155c = c36686b.m82128h("method-execution", c36686b.m82127g("11", "isNetworkAvailable", "com.kubi.network.socket.utils.NetworkUtils", "", "", "", TypedValues.Custom.S_BOOLEAN), 79);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m43056b() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(NetworkUtils.m6057e().toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = "UnKnown";
        }
        return (String) objM103844constructorimpl;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m43057c() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(NetworkUtils.m6056d());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = "UnKnown";
        }
        return (String) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean m43058j(C19391g c19391g, InterfaceC43175a interfaceC43175a) {
        Context context = sContext;
        if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            return c19391g.m43066i(systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null);
        } catch (Throwable unused) {
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m43059l() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String defaultHost = Proxy.getDefaultHost();
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf((defaultHost == null || defaultHost.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m43060m() {
        NetworkCapabilities networkCapabilities;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = sContext;
            if (context == null) {
                return false;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || !networkCapabilities.hasTransport(4)) ? false : true;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            return ((Boolean) objM103844constructorimpl).booleanValue();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m43061d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sContext = context;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0062  */
    /* JADX INFO: renamed from: e */
    public final boolean m43062e() {
        String message;
        Context context = sContext;
        if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            return m43063f(systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null);
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
                C44128b.m97263g("NetworkUtils", th2);
                return false;
            }
            C44170a.m97380b(th2, "NetworkUtils");
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m43063f(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return m43064g(networkCapabilities);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43065h() {
        return NetworkUtillAspect.m56535b().m56537d(new C19390f(new Object[]{this, C36686b.m82122b(f36155c, this, this)}).linkClosureAndJoinPoint(69648));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m43066i(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return m43067k(networkCapabilities);
    }

    static {
        m43055a();
        f36153a = new C19391g();
    }
}
