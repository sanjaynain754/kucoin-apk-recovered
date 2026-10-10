package com.kubi.sdk.flutter;

import android.annotation.SuppressLint;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
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

/* JADX INFO: renamed from: com.kubi.sdk.flutter.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterMethodChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0015H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/flutter/FlutterMethodChannel;", "", "<init>", "()V", "LOG_TAG", "", "METHOD_CHANNEL_NAME", "methodChannelMap", "Ljava/util/HashMap;", "Lio/flutter/embedding/engine/FlutterEngine;", "Lio/flutter/plugin/common/MethodChannel;", "Lkotlin/collections/HashMap;", "registerHandler", "Lkotlin/Result;", "", "engine", "registerHandler-IoAF18A$LFlutter_googleRelease", "(Lio/flutter/embedding/engine/FlutterEngine;)Ljava/lang/Object;", "callMethod", "methodName", "data", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nFlutterMethodChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterMethodChannel.kt\ncom/kubi/sdk/flutter/FlutterMethodChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1#2:81\n44#3,15:82\n44#3,15:101\n19#4,2:97\n1869#5,2:99\n*S KotlinDebug\n*F\n+ 1 FlutterMethodChannel.kt\ncom/kubi/sdk/flutter/FlutterMethodChannel\n*L\n62#1:82,15\n75#1:101,15\n70#1:97,2\n72#1:99,2\n*E\n"})
public final class FlutterMethodChannel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterMethodChannel f46610a = new FlutterMethodChannel();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<FlutterEngine, MethodChannel> f46611b = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.b0$a */
    /* JADX INFO: compiled from: FlutterMethodChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/sdk/flutter/FlutterMethodChannel$1", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements MultiLanguageManager.a {
        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            FlutterMethodChannel.m56671B("appInfoChanged", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.b0$b */
    /* JADX INFO: compiled from: FlutterMethodChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/sdk/flutter/FlutterMethodChannel$registerHandler$1$1", "Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;", "onPreEngineRestart", "", "onEngineWillDestroy", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements FlutterEngine.EngineLifecycleListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FlutterEngine f46612a;

        public b(FlutterEngine flutterEngine) {
            this.f46612a = flutterEngine;
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public void onEngineWillDestroy() {
            FlutterMethodChannel.f46611b.remove(this.f46612a);
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public void onPreEngineRestart() {
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m56687n(Boolean bool) {
        m56671B("appInfoChanged", null, 2, null);
        return Unit.INSTANCE;
    }

    static {
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new a());
        PublishSubject<Boolean> publishSubjectM89963a = C41016c.m89963a();
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.flutter.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56687n((Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.sdk.flutter.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56688o(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.sdk.flutter.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56691r((Throwable) obj);
            }
        };
        publishSubjectM89963a.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.flutter.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56692s(function2, obj);
            }
        });
        UserInfo userInfo = UserInfo.a;
        Observable observableE = userInfo.e();
        final Function1 function3 = new Function1() { // from class: com.kubi.sdk.flutter.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56693t((Boolean) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.sdk.flutter.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56694u(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.sdk.flutter.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56695v((Throwable) obj);
            }
        };
        observableE.subscribe(consumer2, new Consumer() { // from class: com.kubi.sdk.flutter.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56696w(function4, obj);
            }
        });
        Observable observableJ = userInfo.j();
        final Function1 function5 = new Function1() { // from class: com.kubi.sdk.flutter.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56697x((LoginUserEntity) obj);
            }
        };
        Consumer consumer3 = new Consumer() { // from class: com.kubi.sdk.flutter.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56698y(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.sdk.flutter.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterMethodChannel.m56689p((Throwable) obj);
            }
        };
        observableJ.subscribe(consumer3, new Consumer() { // from class: com.kubi.sdk.flutter.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterMethodChannel.m56690q(function6, obj);
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final void m56670A(@NotNull final String methodName, @NotNull final Map<String, Object> data) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(data, "data");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.sdk.flutter.r
            @Override // java.lang.Runnable
            public final void run() {
                FlutterMethodChannel.m56672C(methodName, data);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m56671B(String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = new LinkedHashMap();
        }
        m56670A(str, map);
    }

    /* JADX INFO: renamed from: C */
    public static final void m56672C(String str, Map map) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Collection<MethodChannel> collectionValues = f46611b.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((MethodChannel) it.next()).invokeMethod(str, map);
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
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterMethodChannel");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterMethodChannel", true, null, 8, null), null, 2, null);
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: D */
    public static final Object m56673D(@NotNull FlutterEngine engine) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(engine, "engine");
        try {
            Result.Companion companion = Result.INSTANCE;
            engine.addEngineLifecycleListener(new b(engine));
            f46611b.put(engine, new MethodChannel(engine.getDartExecutor(), "com.kc/config"));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterMethodChannel");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterMethodChannel", true, null, 8, null), null, 2, null);
            }
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m56689p(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m56691r(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m56693t(Boolean bool) {
        m56670A("login_state", MapsKt.mutableMapOf(TuplesKt.m90091to("hasLogin", Boolean.valueOf(UserInfo.a.n()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m56695v(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m56697x(LoginUserEntity loginUserEntity) {
        m56670A("user_info_state", MapsKt.mutableMapOf(TuplesKt.m90091to("updateUserInfo", Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m56688o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m56690q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m56692s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final void m56694u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m56696w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m56698y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
