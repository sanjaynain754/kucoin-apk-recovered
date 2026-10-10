package com.kubi.sdk.flutter;

import android.annotation.SuppressLint;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterRouterChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0007J.\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0007J.\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0007J.\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0007J.\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0007JG\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/flutter/FlutterRouterChannel;", "", "<init>", "()V", "LOG_TAG", "", "EVENT_CHANNEL_NAME", "channelMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/flutter/embedding/engine/FlutterEngine;", "Lio/flutter/plugin/common/MethodChannel;", "registerChannel", "Lkotlin/Result;", "", "engine", "registerChannel-IoAF18A$LFlutter_googleRelease", "(Lio/flutter/embedding/engine/FlutterEngine;)Ljava/lang/Object;", "push", "path", ReportDataTable.COLUMN_PARAMS, "", "pushReplacement", "pushAndRemoveUntil", "popUntil", "popFirst", "invokeMethod", "methodName", "invokeMethod-BWLJW6A", "(Lio/flutter/embedding/engine/FlutterEngine;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nFlutterRouterChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterRouterChannel.kt\ncom/kubi/sdk/flutter/FlutterRouterChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,110:1\n1#2:111\n44#3,15:112\n44#3,15:127\n*S KotlinDebug\n*F\n+ 1 FlutterRouterChannel.kt\ncom/kubi/sdk/flutter/FlutterRouterChannel\n*L\n33#1:112,15\n109#1:127,15\n*E\n"})
public final class FlutterRouterChannel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterRouterChannel f46614a = new FlutterRouterChannel();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<FlutterEngine, MethodChannel> f46615b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.c0$a */
    /* JADX INFO: compiled from: FlutterRouterChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/sdk/flutter/FlutterRouterChannel$registerChannel$1$1", "Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;", "onPreEngineRestart", "", "onEngineWillDestroy", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements FlutterEngine.EngineLifecycleListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FlutterEngine f46616a;

        public a(FlutterEngine flutterEngine) {
            this.f46616a = flutterEngine;
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public void onEngineWillDestroy() {
            FlutterRouterChannel.f46615b.remove(this.f46616a);
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public void onPreEngineRestart() {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final Object m56703b(FlutterEngine flutterEngine, String str, String str2, Map<String, ? extends Object> map) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            MethodChannel methodChannel = f46615b.get(flutterEngine);
            if (methodChannel != null) {
                methodChannel.invokeMethod(str, MapsKt.hashMapOf(TuplesKt.m90091to("path", str2), TuplesKt.m90091to("param", map)));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterRouterChannel");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterRouterChannel", true, null, 8, null), null, 2, null);
            }
        }
        return objM103844constructorimpl;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m56704c(@NotNull FlutterEngine engine, @NotNull String path, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        m56703b(engine, "popFirst", path, params);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Object m56705d(@NotNull FlutterEngine engine) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(engine, "engine");
        try {
            Result.Companion companion = Result.INSTANCE;
            engine.addEngineLifecycleListener(new a(engine));
            f46615b.put(engine, new MethodChannel(engine.getDartExecutor().getBinaryMessenger(), "kc_router_bridge"));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterRouterChannel");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterRouterChannel", true, null, 8, null), null, 2, null);
            }
        }
        return objM103844constructorimpl;
    }
}
