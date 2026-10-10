package com.kubi.sdk.flutter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.ui.FlutterDialogActivity;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterRouteManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052*\b\u0002\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fJ@\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00052(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fJD\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172*\b\u0002\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fJ4\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2$\u0010\u0012\u001a \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\fJ\u0010\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001c\u001a\u00020\bH\u0002J\u0014\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R8\u0010\u0006\u001a,\u0012\u0004\u0012\u00020\b\u0012\"\u0012 \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/flutter/KCFlutterRouteManager;", "", "<init>", "()V", "TAG", "", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Function1;", "", "", "Lcom/kubi/sdk/flutter/KCFlutterCallback;", "callbackIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "callbackId", "openFlutterDialog", "flutterRoutePath", TUIConstants.TUIChat.CALL_BACK, "context", "Landroid/content/Context;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "needLogin", "", "setKCFlutterCallback", "intent", "Landroid/content/Intent;", "removeKCFlutterCallback", "createCallbackId", "createFlutterFullRoute", "onCallback", ReportDataTable.COLUMN_PARAMS, "onCallback$LFlutter_googleRelease", "hasCallbackId", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterRouteManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterRouteManager.kt\ncom/kubi/sdk/flutter/KCFlutterRouteManager\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,167:1\n19#2,2:168\n19#2,2:170\n44#3,2:172\n*S KotlinDebug\n*F\n+ 1 KCFlutterRouteManager.kt\ncom/kubi/sdk/flutter/KCFlutterRouteManager\n*L\n39#1:168,2\n53#1:170,2\n155#1:172,2\n*E\n"})
public final class KCFlutterRouteManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCFlutterRouteManager f46704a = new KCFlutterRouteManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<Long, Function1<Map<String, ? extends Object>, Unit>> f46705b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ReentrantLock f46706c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static long f46707d = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m56839j(KCFlutterRouteManager kCFlutterRouteManager, String str, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        kCFlutterRouteManager.m56849i(str, z11, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m56840m(KCFlutterRouteManager kCFlutterRouteManager, String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        kCFlutterRouteManager.m56851l(str, function1);
    }

    /* JADX INFO: renamed from: n */
    public static final void m56841n(String str, final Function1 function1) {
        FlutterDialogActivity.f46738k.showFlutterDialog(str, new Function1() { // from class: com.kubi.sdk.flutter.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterRouteManager.m56842o(function1, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m56842o(Function1 function1, Map map) {
        if (function1 != null) {
            function1.invoke(map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m56843p(Context context, String str, final Function1 function1) {
        FlutterDialogActivity.f46738k.showFlutterDialog(context, str, new Function1() { // from class: com.kubi.sdk.flutter.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterRouteManager.m56844q(function1, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m56844q(Function1 function1, Map map) {
        if (function1 != null) {
            function1.invoke(map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m56845s(Intent intent) {
        if (intent == null) {
            return Unit.INSTANCE;
        }
        long jM56266p = RouteExKt.m56266p(intent, "kcFlutterCallbackId", 0L);
        if (jM56266p > 0) {
            f46705b.remove(Long.valueOf(jM56266p));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final long m56846f() {
        ReentrantLock reentrantLock = f46706c;
        reentrantLock.lock();
        long j11 = f46707d;
        f46707d = 1 + j11;
        reentrantLock.unlock();
        return j11;
    }

    /* JADX INFO: renamed from: g */
    public final String m56847g(String str, boolean z11) {
        return "flutter?route=" + Uri.encode(str) + "&needLogin=" + z11;
    }

    /* JADX INFO: renamed from: h */
    public final void m56848h(long j11, @Nullable Map<String, ? extends Object> map) {
        try {
            ConcurrentHashMap<Long, Function1<Map<String, ? extends Object>, Unit>> concurrentHashMap = f46705b;
            Function1<Map<String, ? extends Object>, Unit> function1 = concurrentHashMap.get(Long.valueOf(j11));
            if (function1 != null) {
                function1.invoke(map);
            }
            concurrentHashMap.remove(Long.valueOf(j11));
            C43840a.m96550d("callback invoked. callbackId:" + j11 + ", params=" + map, "KCFlutterRouteManager");
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "KCFlutterRouteManager", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m56849i(@NotNull String flutterRoutePath, boolean z11, @Nullable Function1<? super Map<String, ? extends Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(flutterRoutePath, "flutterRoutePath");
        if (StringsKt.isBlank(flutterRoutePath)) {
            C43840a.m96550d("flutterRoutePath is empty", "KCFlutterRouteManager");
            return;
        }
        if (function1 == null) {
            RouteExKt.m56217H(m56847g(flutterRoutePath, z11));
            C43840a.m96550d("jump with no-callback. routerPath:" + flutterRoutePath, "KCFlutterRouteManager");
            return;
        }
        Uri uri = Uri.parse("kucoin://" + flutterRoutePath);
        Intrinsics.checkNotNull(uri);
        String strM56216G = RouteExKt.m56216G(uri);
        if (strM56216G == null || strM56216G.length() == 0) {
            C43840a.m96550d("uri.action isNullOrEmpty. routerPath:" + flutterRoutePath, "KCFlutterRouteManager");
            return;
        }
        if (uri.getQueryParameterNames().contains("kcFlutterCallbackId")) {
            C43840a.m96550d("used reserved key. routerPath:" + flutterRoutePath, "KCFlutterRouteManager");
            return;
        }
        long jM56846f = m56846f();
        f46705b.put(Long.valueOf(jM56846f), function1);
        String strM56847g = m56847g(strM56216G, z11);
        String strM56886j = C23767n.m56886j(RouteExKt.m56242d(new Bundle(), uri));
        if (strM56886j.length() > 0) {
            strM56847g = strM56847g + Typography.amp + strM56886j;
        }
        String string = Uri.parse(strM56847g).buildUpon().appendQueryParameter("kcFlutterCallbackId", String.valueOf(jM56846f)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C43840a.m96550d("jump with callback. fullRoute:" + string, "KCFlutterRouteManager");
        RouteExKt.m56217H(string);
    }

    /* JADX INFO: renamed from: k */
    public final void m56850k(@NotNull final Context context, @NotNull final String flutterRoutePath, @Nullable final Function1<? super Map<String, ? extends Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterRoutePath, "flutterRoutePath");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.g0
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterRouteManager.m56843p(context, flutterRoutePath, function1);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m56851l(@NotNull final String flutterRoutePath, @Nullable final Function1<? super Map<String, ? extends Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(flutterRoutePath, "flutterRoutePath");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.e0
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterRouteManager.m56841n(flutterRoutePath, function1);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m56852r(@Nullable final Intent intent) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.flutter.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCFlutterRouteManager.m56845s(intent);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m56853t(@NotNull Intent intent, @NotNull Function1<? super Map<String, ? extends Object>, Unit> callback) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        long jM56846f = m56846f();
        f46705b.put(Long.valueOf(jM56846f), callback);
        RouteExKt.m56265o0(intent, "kcFlutterCallbackId", jM56846f);
    }
}
