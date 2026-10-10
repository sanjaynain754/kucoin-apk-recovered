package com.kubi.sdk.flutter;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.FlutterError;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.utils.extensions.C27041f;
import io.flutter.plugin.common.MethodCall;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FlutterIssuesHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087@¢\u0006\u0002\u0010\nJ\u001e\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0003J,\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/flutter/FlutterIssuesHandler;", "", "<init>", "()V", "TAG", "", "handleError", "", "call", "Lio/flutter/plugin/common/MethodCall;", "(Lio/flutter/plugin/common/MethodCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEvent", "handleErrorInner", "Lcom/kubi/monitor/FlutterError;", "arguments", "", "handleEventInner", "Lkotlin/Pair;", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterIssuesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,117:1\n47#2,4:118\n47#2,4:122\n1617#3,9:126\n1869#3:135\n1870#3:137\n1626#3:138\n1#4:136\n37#5:139\n36#5,3:140\n504#6,7:143\n216#7,2:150\n*S KotlinDebug\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n*L\n30#1:118,4\n42#1:122,4\n80#1:126,9\n80#1:135\n80#1:137\n80#1:138\n80#1:136\n88#1:139\n88#1:140,3\n104#1:143,7\n104#1:150,2\n*E\n"})
public final class FlutterIssuesHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterIssuesHandler f46608a = new FlutterIssuesHandler();

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.FlutterIssuesHandler$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,49:1\n31#2:50\n32#2:66\n44#3,15:51\n*S KotlinDebug\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n*L\n31#1:51,15\n*E\n"})
    public static final class C23716a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C23716a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            String message = exception.getMessage();
            if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(exception, "FlutterIssuesHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(exception, "FlutterIssuesHandler", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.FlutterIssuesHandler$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,49:1\n43#2:50\n44#2:66\n44#3,15:51\n*S KotlinDebug\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/sdk/flutter/FlutterIssuesHandler\n*L\n43#1:51,15\n*E\n"})
    public static final class C23717b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C23717b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            String message = exception.getMessage();
            if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(exception, "FlutterIssuesHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(exception, "FlutterIssuesHandler", true, null, 8, null), null, 2, null);
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final FlutterError m56665d(Map<String, ? extends Object> map) {
        Object objM103844constructorimpl;
        Object obj = map.get("exception");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get("reason");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = map.get(TtmlNode.TAG_INFORMATION);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj3;
        Object obj4 = map.get("stackTraceElements");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        List<Map> list = (List) obj4;
        Exception exc = new Exception(str2.length() == 0 ? str : str + ". Error thrown " + str2 + '.');
        ArrayList arrayList = new ArrayList();
        for (Map map2 : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new StackTraceElement(C27041f.m66668h((String) map2.get("class")), C27041f.m66668h((String) map2.get(FirebaseAnalytics.Param.METHOD)), C27041f.m66668h((String) map2.get("file")), Integer.parseInt(C27041f.m66668h((String) map2.get("line")))));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            StackTraceElement stackTraceElement = (StackTraceElement) objM103844constructorimpl;
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        FlutterError flutterError = new FlutterError(exc, str, null, null, null, null, 60, null);
        if (str2.length() > 0) {
            flutterError.setReason(str2);
        }
        if (str3.length() > 0) {
            flutterError.setInformation(str3);
        }
        return flutterError;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final Pair<String, TechnologyEvent.EventParametersBuilder> m56667f(Map<String, ? extends Object> map) {
        Object obj = map.get("eventName");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Map map2 = (Map) map.get("parameters");
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object value = entry2.getValue();
                if (value instanceof String) {
                    eventParametersBuilderAcquire.m42393d((String) entry2.getKey(), (String) value);
                } else if (value instanceof Integer) {
                    eventParametersBuilderAcquire.m42391b((String) entry2.getKey(), ((Number) value).intValue());
                } else if (value instanceof Long) {
                    eventParametersBuilderAcquire.m42392c((String) entry2.getKey(), ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    eventParametersBuilderAcquire.m42394e((String) entry2.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof Double) {
                    eventParametersBuilderAcquire.m42395f((String) entry2.getKey(), ((Number) value).doubleValue());
                } else {
                    eventParametersBuilderAcquire.m42393d((String) entry2.getKey(), String.valueOf(value));
                }
            }
        }
        if (map2 == null) {
            eventParametersBuilderAcquire = null;
        }
        return TuplesKt.m90091to(str, eventParametersBuilderAcquire);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m56664c(@NotNull MethodCall methodCall, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b().plus(new C23716a(CoroutineExceptionHandler.INSTANCE)), new FlutterIssuesHandler$handleError$3(methodCall, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m56666e(@NotNull MethodCall methodCall, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b().plus(new C23717b(CoroutineExceptionHandler.INSTANCE)), new FlutterIssuesHandler$handleEvent$3(methodCall, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
