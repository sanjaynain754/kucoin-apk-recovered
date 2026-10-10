package com.kubi.sdk.flutter;

import android.annotation.SuppressLint;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.EventChannel;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o00.C42917g;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/flutter/FlutterEvent;", "", "<init>", "()V", "LOG_TAG", "", "EVENT_CHANNEL_NAME", "eventSinkMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "Lio/flutter/plugin/common/EventChannel$EventSink;", "registerHandler", "Lkotlin/Result;", "", "dartExecutor", "Lio/flutter/embedding/engine/dart/DartExecutor;", "registerHandler-IoAF18A$LFlutter_googleRelease", "(Lio/flutter/embedding/engine/dart/DartExecutor;)Ljava/lang/Object;", "tag", "arguments", "sendEvent", "eventName", "data", "", "sendEvent-gIAlu-s", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nFlutterEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEvent.kt\ncom/kubi/sdk/flutter/FlutterEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,98:1\n1#2:99\n44#3,15:100\n44#3,15:126\n44#3,15:141\n488#4,7:115\n216#5:122\n217#5:125\n19#6,2:123\n*S KotlinDebug\n*F\n+ 1 FlutterEvent.kt\ncom/kubi/sdk/flutter/FlutterEvent\n*L\n65#1:100,15\n87#1:126,15\n84#1:141,15\n78#1:115,7\n78#1:122\n78#1:125\n80#1:123,2\n*E\n"})
public final class FlutterEvent {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterEvent f46711a = new FlutterEvent();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, WeakReference<EventChannel.EventSink>> f46712b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.m$a */
    /* JADX INFO: compiled from: FlutterEvent.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/sdk/flutter/FlutterEvent$registerHandler$1$1", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "onListen", "", "arguments", "", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "onCancel", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFlutterEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEvent.kt\ncom/kubi/sdk/flutter/FlutterEvent$registerHandler$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,98:1\n1#2:99\n44#3,15:100\n44#3,15:115\n*S KotlinDebug\n*F\n+ 1 FlutterEvent.kt\ncom/kubi/sdk/flutter/FlutterEvent$registerHandler$1$1\n*L\n52#1:100,15\n62#1:115,15\n*E\n"})
    public static final class a implements EventChannel.StreamHandler {
        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object arguments) {
            Object objM103844constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                String strM56876w = FlutterEvent.f46711a.m56876w(arguments);
                if (strM56876w.length() > 0) {
                    FlutterEvent.f46712b.remove(strM56876w);
                    C44128b.m97268l("FlutterEvent", "onCancel...[" + strM56876w + ']');
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                String message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEvent");
                } else {
                    C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEvent", true, null, 8, null), null, 2, null);
                }
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object arguments, EventChannel.EventSink eventSink) {
            Object objM103844constructorimpl;
            if (eventSink == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                String strM56876w = FlutterEvent.f46711a.m56876w(arguments);
                if (strM56876w.length() > 0) {
                    FlutterEvent.f46712b.put(strM56876w, new WeakReference(eventSink));
                    C44128b.m97268l("FlutterEvent", "onListen...[" + strM56876w + ']');
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                String message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEvent");
                } else {
                    C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEvent", true, null, 8, null), null, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m56875v(Map map, Map.Entry entry) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            map.put("nativeEventTag", entry.getKey());
            EventChannel.EventSink eventSink = (EventChannel.EventSink) ((WeakReference) entry.getValue()).get();
            if (eventSink != null) {
                eventSink.success(map);
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
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEvent");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEvent", true, null, 8, null), null, 2, null);
            }
        }
    }

    static {
        UserInfo userInfo = UserInfo.a;
        Observable observableE = userInfo.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.flutter.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterEvent.m56863j((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.sdk.flutter.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterEvent.m56864k(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.sdk.flutter.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterEvent.m56865l((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.flutter.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterEvent.m56866m(function2, obj);
            }
        });
        Observable observableJ = userInfo.j();
        final Function1 function3 = new Function1() { // from class: com.kubi.sdk.flutter.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterEvent.m56867n((LoginUserEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.sdk.flutter.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterEvent.m56868o(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.sdk.flutter.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterEvent.m56869p((Throwable) obj);
            }
        };
        observableJ.subscribe(consumer2, new Consumer() { // from class: com.kubi.sdk.flutter.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterEvent.m56870q(function4, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m56863j(Boolean bool) {
        m56874u("login_state", MapsKt.mutableMapOf(TuplesKt.m90091to("hasLogin", Boolean.valueOf(UserInfo.a.n()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m56865l(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m56867n(LoginUserEntity loginUserEntity) {
        m56874u("user_info_state", MapsKt.mutableMapOf(TuplesKt.m90091to("updateUserInfo", Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m56869p(Throwable th2) {
        return Unit.INSTANCE;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final Object m56873t(@NotNull DartExecutor dartExecutor) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(dartExecutor, "dartExecutor");
        try {
            Result.Companion companion = Result.INSTANCE;
            new EventChannel(dartExecutor.getBinaryMessenger(), "ku_core/native_event_channel").setStreamHandler(new a());
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEvent");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEvent", true, null, 8, null), null, 2, null);
            }
        }
        return objM103844constructorimpl;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Object m56874u(@NotNull String eventName, @NotNull final Map<String, Object> data) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.INSTANCE;
            ConcurrentHashMap<String, WeakReference<EventChannel.EventSink>> concurrentHashMap = f46712b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, WeakReference<EventChannel.EventSink>> entry : concurrentHashMap.entrySet()) {
                if (StringsKt.contains((CharSequence) entry.getKey(), (CharSequence) eventName, true)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (final Map.Entry entry2 : linkedHashMap.entrySet()) {
                C44128b.m97268l("FlutterEvent", "sendEvent...[" + ((String) entry2.getKey()) + "], data=" + data);
                C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterEvent.m56875v(data, entry2);
                    }
                });
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEvent");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEvent", true, null, 8, null), null, 2, null);
            }
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: w */
    public final String m56876w(Object obj) {
        Object objM103844constructorimpl;
        if (!(obj instanceof List) || ((Collection) obj).isEmpty()) {
            return "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(String.valueOf(((List) obj).get(0)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? "" : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: k */
    public static final void m56864k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static final void m56866m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final void m56868o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m56870q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
