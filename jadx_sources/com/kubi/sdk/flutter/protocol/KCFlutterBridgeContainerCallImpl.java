package com.kubi.sdk.flutter.protocol;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b00.InterfaceC4418e;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.protocol.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeContainerCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JD\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JB\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JB\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeContainerCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeContainerCall;", "<init>", "()V", "pop", "", "ctx", "Landroid/content/Context;", "data", "", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "popWithoutPushAndPresent", "openFlutter", "route", "openFlutterDialog", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeContainerCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeContainerCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeContainerCallImpl\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,92:1\n19#2,2:93\n19#2,2:95\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeContainerCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeContainerCallImpl\n*L\n26#1:93,2\n49#1:95,2\n*E\n"})
public final class KCFlutterBridgeContainerCallImpl implements InterfaceC4418e {
    /* JADX INFO: renamed from: k */
    public static final Unit m56908k(Function2 function2, Map map) {
        function2.invoke(map, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m56909l(Function2 function2, Map map) {
        function2.invoke(map, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m56910m(final Context context, Map map) {
        Intent intent = ((Activity) context).getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        long jM56266p = RouteExKt.m56266p(intent, "kcFlutterCallbackId", 0L);
        C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.flutter.protocol.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCFlutterBridgeContainerCallImpl.m56911n(context);
            }
        });
        if (jM56266p > 0) {
            KCFlutterRouteManager.f46704a.m56848h(jM56266p, map);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m56912o(final Context context, Map map) {
        Intent intent = ((Activity) context).getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        long jM56266p = RouteExKt.m56266p(intent, "kcFlutterCallbackId", 0L);
        C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.flutter.protocol.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCFlutterBridgeContainerCallImpl.m56913p(context);
            }
        });
        if (jM56266p > 0) {
            KCFlutterRouteManager.f46704a.m56848h(jM56266p, map);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m56911n(Context context) {
        ((Activity) context).finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m56913p(Context context) {
        ((Activity) context).finish();
        return Unit.INSTANCE;
    }

    @Override // b00.InterfaceC4418e
    /* JADX INFO: renamed from: a */
    public void mo4112a(@NotNull Context ctx, @NotNull String route, @NotNull final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (route.length() > 0) {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, route, false, new Function1() { // from class: com.kubi.sdk.flutter.protocol.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCFlutterBridgeContainerCallImpl.m56908k(callback, (Map) obj);
                }
            }, 2, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalArgumentException("route is empty"), null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4418e
    /* JADX INFO: renamed from: b */
    public void mo4113b(@NotNull final Context ctx, @Nullable final Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof Activity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not Activity."), null, false, 12, null));
            return;
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.protocol.c
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgeContainerCallImpl.m56910m(ctx, map);
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4418e
    /* JADX INFO: renamed from: c */
    public void mo4114c(@NotNull final Context ctx, @Nullable final Map<String, ? extends Object> map, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof Activity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not Activity."), null, false, 12, null));
            return;
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.protocol.d
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgeContainerCallImpl.m56912o(ctx, map);
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4418e
    /* JADX INFO: renamed from: d */
    public void mo4115d(@NotNull Context ctx, @NotNull String route, @NotNull final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (route.length() > 0) {
            KCFlutterRouteManager.f46704a.m56851l(route, new Function1() { // from class: com.kubi.sdk.flutter.protocol.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCFlutterBridgeContainerCallImpl.m56909l(callback, (Map) obj);
                }
            });
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalArgumentException("route is empty"), null, false, 12, null));
        }
    }
}
