package com.kubi.sdk.flutter.delegate;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KnbHandlerHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/KnbHandlerHelper;", "", "<init>", "()V", "TAG", "", "knbErrorSet", "", "EVENT_NAME", "USE_BASE_KNB", "NOT_BASE_KNB", "enableBaseKnbBridge", "", "getEnableBaseKnbBridge", "()Z", "enableBaseKnbBridge$delegate", "Lkotlin/Lazy;", "getKnbAbTestArgs", "", "args", "getMapArg", "", "arguments", "execute", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.METHOD, DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "handleKnb", "call", "Lio/flutter/plugin/common/MethodCall;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKnbHandlerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnbHandlerHelper.kt\ncom/kubi/sdk/flutter/delegate/KnbHandlerHelper\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 7 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,141:1\n32#2,2:142\n71#3,4:144\n71#3,4:159\n71#3,4:163\n47#4,4:148\n35#5,4:152\n39#5:158\n44#6,2:156\n44#7,15:167\n44#7,15:182\n*S KotlinDebug\n*F\n+ 1 KnbHandlerHelper.kt\ncom/kubi/sdk/flutter/delegate/KnbHandlerHelper\n*L\n60#1:142,2\n123#1:144,4\n91#1:159,4\n94#1:163,4\n130#1:148,4\n36#1:152,4\n36#1:158\n36#1:156,2\n96#1:167,15\n103#1:182,15\n*E\n"})
public final class KnbHandlerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KnbHandlerHelper f46655a = new KnbHandlerHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f46656b = SetsKt.setOf((Object[]) new String[]{"-9001", "-9002", "-9003"});

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f46657c = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(KnbHandlerHelper.m56782e());
        }
    });

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.KnbHandlerHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C23729a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.KnbHandlerHelper$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KnbHandlerHelper.kt\ncom/kubi/sdk/flutter/delegate/KnbHandlerHelper\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,49:1\n130#2:50\n44#3,15:51\n*S KotlinDebug\n*F\n+ 1 KnbHandlerHelper.kt\ncom/kubi/sdk/flutter/delegate/KnbHandlerHelper\n*L\n130#1:51,15\n*E\n"})
    public static final class C23730b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C23730b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            String message = exception.getMessage();
            if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(exception, "KnbHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(exception, "KnbHandler", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m56782e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C23729a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("flutter_base_bridge ", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m56783g(MethodChannel.Result result, Object obj, ProtocolException protocolException) {
        Throwable th2;
        try {
            if (protocolException != null) {
                String code = protocolException.getCode();
                if (code == null) {
                    code = "";
                }
                Throwable throwable = protocolException.getThrowable();
                result.error(code, throwable != null ? throwable.getMessage() : null, protocolException.getThrowable());
                TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
                eventParametersBuilderAcquire.m42391b("code", 1);
                TechnologyEvent.m42388d("KNBFlutterBridge", eventParametersBuilderAcquire);
                if (f46656b.contains(code)) {
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
                    eventParametersBuilderAcquire2.m42391b("code", 2);
                    TechnologyEvent.m42388d("KNBFlutterBridge", eventParametersBuilderAcquire2);
                } else if (!protocolException.isIgnore()) {
                    Throwable throwable2 = protocolException.getThrowable();
                    if (throwable2 == null) {
                        throwable2 = new Throwable("KNB Error,code:" + code);
                    }
                    Throwable th3 = throwable2;
                    String message = th3.getMessage();
                    if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                        C44199a.m97421b(th3, "KnbHandler");
                    } else {
                        C43846g.m96568c(new FlutterIssueException(th3, "KnbHandler", true, null, 8, null), null, 2, null);
                    }
                }
            } else if (obj instanceof Object[]) {
                result.success(ArraysKt.toList((Object[]) obj));
            } else {
                result.success(obj);
            }
        } catch (Throwable th4) {
            if (protocolException == null || (th2 = protocolException.getThrowable()) == null) {
                th2 = new Throwable("result error: " + th4.getMessage());
            }
            Throwable th5 = th2;
            String message2 = th5.getMessage();
            if (message2 == null || !(StringsKt.contains$default((CharSequence) message2, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message2, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message2, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(th5, "KnbHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(th5, "KnbHandler", true, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m56784f(Context context, String str, Map<String, ? extends Object> map, final MethodChannel.Result result) {
        KCFlutterProtocolManager.f47495a.m57889a(context, str, map, new Function2() { // from class: com.kubi.sdk.flutter.delegate.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KnbHandlerHelper.m56783g(result, obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final boolean m56785h() {
        return ((Boolean) f46657c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, Object> m56787j(Object obj) {
        try {
            if (obj == null) {
                return new HashMap();
            }
            if (obj instanceof Map) {
                Map<String, Object> map = obj instanceof Map ? (Map) obj : null;
                return map == null ? new HashMap() : map;
            }
            if (!(obj instanceof JSONObject)) {
                return new HashMap();
            }
            HashMap map2 = new HashMap();
            Iterator<String> itKeys = ((JSONObject) obj).keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map2.put(next, ((JSONObject) obj).get(next));
            }
            return map2;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final boolean m56788k(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String method = call.method;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        if (!StringsKt.startsWith$default(method, "knb#", false, 2, (Object) null)) {
            return false;
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", 0);
        TechnologyEvent.m42388d("KNBFlutterBridge", eventParametersBuilderAcquire);
        C41696j.m91104d(context instanceof FragmentActivity ? LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context) : C41713n0.m91125a(new CoroutineName("KnbHandler").plus(C42911a.m94120b()).plus(new C23730b(CoroutineExceptionHandler.INSTANCE))), C42911a.m94120b(), null, new KnbHandlerHelper$handleKnb$2(call, context, result, null), 2, null);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<String> m56786i(@Nullable List<String> list) {
        String str;
        if (m56785h()) {
            str = "useBaseKnb=true";
        } else {
            str = "useBaseKnb=false";
        }
        List<String> listListOf = CollectionsKt.listOf(str);
        if (list == null) {
            return listListOf;
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) list);
    }
}
