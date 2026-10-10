package p345ik;

import android.annotation.SuppressLint;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Proxy;
import android.system.ErrnoException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5287o0;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.httpdns.interpret.NoServerException;
import dk.C36724a;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: ik.c */
/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lik/c;", "", "<init>", "()V", "", "f", "()Z", "g", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "b", "c", "Landroid/net/ConnectivityManager;", "connectivityManager", "d", "(Landroid/net/ConnectivityManager;)Z", "Landroid/net/NetworkCapabilities;", "capabilities", "e", "(Landroid/net/NetworkCapabilities;)Z", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nNetworkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkUtils.kt\ncom/kubi/httpdns/utils/NetworkUtils\n+ 2 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,119:1\n36#2,14:120\n*S KotlinDebug\n*F\n+ 1 NetworkUtils.kt\ncom/kubi/httpdns/utils/NetworkUtils\n*L\n80#1:120,14\n*E\n"})
public final class C38655c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38655c f86665a = new C38655c();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m87386c() {
        try {
            Application applicationM6331a = C5287o0.m6331a();
            if (applicationM6331a == null) {
                return false;
            }
            Object systemService = applicationM6331a.getSystemService("connectivity");
            return m87387d(systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null);
        } catch (Throwable th2) {
            if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                C44128b.m97263g("NetworkUtils", th2);
            } else {
                C36724a.m82299b(th2, "NetworkUtils");
            }
            return false;
        }
    }

    @JvmStatic
    @SuppressLint({"WrongConstant", "InlinedApi"})
    /* JADX INFO: renamed from: e */
    public static final boolean m87388e(NetworkCapabilities capabilities) {
        if (capabilities == null) {
            return false;
        }
        return (capabilities.hasTransport(1) || capabilities.hasTransport(0) || capabilities.hasTransport(3) || capabilities.hasTransport(7) || capabilities.hasTransport(4) || capabilities.hasCapability(16)) && capabilities.hasCapability(16);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m87384a() {
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
    /* JADX INFO: renamed from: b */
    public static final String m87385b() {
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

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m87387d(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return m87388e(networkCapabilities);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m87389f() {
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
    /* JADX INFO: renamed from: g */
    public static final boolean m87390g() {
        NetworkCapabilities networkCapabilities;
        try {
            Result.Companion companion = Result.INSTANCE;
            Application applicationM6331a = C5287o0.m6331a();
            if (applicationM6331a == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(applicationM6331a, "Utils.getApp() ?: return false");
            Object systemService = applicationM6331a.getSystemService("connectivity");
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
}
