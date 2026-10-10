package com.kubi.jsbridge.impl.network;

import android.content.Context;
import com.kubi.config.exception.KCConfigException;
import com.kubi.network.restful.C19321b;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.socket.KRNSocketNativeBridge;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiKrnSocketConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36575j;
import er.C37237b;
import er.InterfaceC37236a;
import gr.C38000b;
import gr.C38006h;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCJSWebSocket.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002JH\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00100\u0019H\u0016JH\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00100\u0019H\u0016J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/KCJSWebSocket;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiKrnSocketModule;", "Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;", "<init>", "()V", "taskMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Job;", "wsApiCache", "Lcom/kubi/jsbridge/impl/network/IKrnSocketWsApi;", "getWsApi", "channelType", "resolveWebSocketClient", "Lcom/kubi/network/api/IWebSocketClient;", "startSocketTask", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "config", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiKrnSocketConfig;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "endSocketTask", "taskId", "", "startTask", "topic", "extraJson", "endTask", "parseExtra", "Lorg/json/JSONObject;", "extractBinaryBytes", "", "extension", "", "Companion", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,337:1\n72#2,2:338\n1#3:340\n1#3:345\n47#4,4:341\n47#4,4:346\n*S KotlinDebug\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n*L\n81#1:338,2\n81#1:340\n153#1:341,4\n243#1:346,4\n*E\n"})
public final class KCJSWebSocket implements InterfaceC36575j, KRNSocketNativeBridge.KRNSocketHandler {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f27444c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC41775x1> f27445a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ConcurrentHashMap<String, IKrnSocketWsApi> f27446b = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: KCJSWebSocket.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/KCJSWebSocket$Companion;", "", "<init>", "()V", "TAG", "", "ACTION_SOCKET", "DEFAULT_THROTTLE_INTERVAL", "", "THROTTLE_NONE", "", "THROTTLE_SAMPLE", "KEY_TASK_ID", "KEY_ACTION", "KEY_DATA", "CLIENT_UNIFIED", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJSWebSocket$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n153#2:50\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n*L\n153#1:51,2\n*E\n"})
    public static final class C15255a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "KCJSWebSocket", false, null, 8, null), null, 2, null);
        }

        public C15255a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJSWebSocket$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n243#2:50\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 KCJSWebSocket.kt\ncom/kubi/jsbridge/impl/network/KCJSWebSocket\n*L\n243#1:51,2\n*E\n"})
    public static final class C15256b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "KCJSWebSocket", false, null, 8, null), null, 2, null);
        }

        public C15256b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m31721d(Object obj) {
        Object objM103844constructorimpl;
        if (obj == null || (obj instanceof String)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objInvoke = obj.getClass().getMethod("getData", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return null;
            }
            Object objInvoke2 = objInvoke.getClass().getMethod("toByteArray", new Class[0]).invoke(objInvoke, new Object[0]);
            objM103844constructorimpl = Result.m103844constructorimpl(objInvoke2 instanceof byte[] ? (byte[]) objInvoke2 : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (byte[]) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Override // d00.InterfaceC36575j
    /* JADX INFO: renamed from: a */
    public void mo31719a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String taskId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "only rn source is supported", false, 10, null));
            return;
        }
        if (taskId.length() == 0) {
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "taskId is empty", false, 10, null));
            return;
        }
        InterfaceC41775x1 interfaceC41775x1Remove = this.f27445a.remove(taskId);
        if (interfaceC41775x1Remove == null) {
            C44128b.m97259c("KCJSWebSocket", "endTask: taskId=" + taskId + " not found");
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "task not found", false, 10, null));
            return;
        }
        InterfaceC41775x1.a.m91377a(interfaceC41775x1Remove, null, 1, null);
        C44128b.m97259c("KCJSWebSocket", "endTask: taskId=" + taskId + " cancelled");
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36575j
    /* JADX INFO: renamed from: b */
    public void mo31720b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiKrnSocketConfig config, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "only rn source is supported", false, 10, null));
            return;
        }
        String topic = config.getTopic();
        if (topic.length() == 0) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "topic is empty", false, 10, null));
            return;
        }
        Map<String, Object> extra = config.getExtra();
        if (!(extra instanceof Map)) {
            extra = null;
        }
        Object obj2 = extra != null ? extra.get("channelType") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = extra != null ? extra.get("throttle") : null;
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        Object obj4 = extra != null ? extra.get("throttleInterval") : null;
        Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
        long jLongValue = number2 != null ? number2.longValue() : 500L;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        try {
            IKrnSocketWsApi iKrnSocketWsApiM31722e = m31722e(str);
            this.f27445a.put(string, C41696j.m91104d(C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()).plus(new CoroutineName("KCJSWebSocket-" + string)).plus(new C15255a(CoroutineExceptionHandler.INSTANCE))), null, null, new KCJSWebSocket$startSocketTask$job$1(iKrnSocketWsApiM31722e, topic, iIntValue, jLongValue, string, null), 3, null));
            C44128b.m97259c("KCJSWebSocket", "startTask: taskId=" + string + ", topic=" + topic + ", channelType=" + str + ", throttle=" + iIntValue + ", throttleInterval=" + jLongValue);
            callback.invoke(string, null);
        } catch (Throwable th2) {
            C44128b.m97262f("KCJSWebSocket", "startTask failed: topic=" + topic + ", channelType=" + str, th2);
            String message = th2.getMessage();
            if (message == null) {
                message = "getWsApi failed";
            }
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, message, false, 10, null));
        }
    }

    /* JADX INFO: renamed from: e */
    public final IKrnSocketWsApi m31722e(String str) {
        String str2 = str == null ? "" : str;
        ConcurrentHashMap<String, IKrnSocketWsApi> concurrentHashMap = this.f27446b;
        IKrnSocketWsApi iKrnSocketWsApi = concurrentHashMap.get(str2);
        if (iKrnSocketWsApi == null) {
            IKrnSocketWsApi iKrnSocketWsApi2 = (IKrnSocketWsApi) new C19321b.a().m42777b(new C38000b(m31724g(str))).m42778c(new C38006h()).m42776a().m42772b(IKrnSocketWsApi.class);
            IKrnSocketWsApi iKrnSocketWsApiPutIfAbsent = concurrentHashMap.putIfAbsent(str2, iKrnSocketWsApi2);
            iKrnSocketWsApi = iKrnSocketWsApiPutIfAbsent == null ? iKrnSocketWsApi2 : iKrnSocketWsApiPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(iKrnSocketWsApi, "getOrPut(...)");
        return iKrnSocketWsApi;
    }

    @Override // com.kubi.rn.core.socket.KRNSocketNativeBridge.KRNSocketHandler
    public void endTask(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        InterfaceC41775x1 interfaceC41775x1Remove = this.f27445a.remove(taskId);
        if (interfaceC41775x1Remove == null) {
            C44128b.m97259c("KCJSWebSocket", "endTask(binary): taskId=" + taskId + " not found");
            return;
        }
        InterfaceC41775x1.a.m91377a(interfaceC41775x1Remove, null, 1, null);
        C44128b.m97259c("KCJSWebSocket", "endTask(binary): taskId=" + taskId + " cancelled");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0.equals("platformim") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0.equals("default") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0.equals("platform_im") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        return er.C37237b.m83280c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r0.equals("kumex") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r0.equals(com.kubi.search.searchresult.SearchCategory$Companion.SPOT) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r0.equals("push") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r0.equals("") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r0.equals(com.kubi.search.searchresult.SearchCategory$Companion.FUTURES) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r0.equals("contract") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        return er.C37237b.m83279b();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x00ab, please report this as an issue */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC37236a m31724g(String str) {
        String lowerCase;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -795192327:
                    if (lowerCase.equals("wallet")) {
                        return C37237b.m83281d();
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(C37237b.m83282e(str));
                        break;
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97262f("KCJSWebSocket", "getWsApi: WebSocket client not found for channelType=" + str + ", fallback to default", thM103847exceptionOrNullimpl);
                        objM103844constructorimpl = C37237b.m83278a();
                    }
                    return (InterfaceC37236a) objM103844constructorimpl;
                case -566947566:
                    break;
                case -503567600:
                    break;
                case 0:
                    break;
                case 116130:
                    if (lowerCase.equals("uta")) {
                        return C37237b.m83282e("network/channel_unified");
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(C37237b.m83282e(str));
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97262f("KCJSWebSocket", "getWsApi: WebSocket client not found for channelType=" + str + ", fallback to default", thM103847exceptionOrNullimpl);
                        objM103844constructorimpl = C37237b.m83278a();
                    }
                    return (InterfaceC37236a) objM103844constructorimpl;
                case 3452698:
                    break;
                case 3537154:
                    break;
                case 102410294:
                    break;
                case 1251954800:
                    break;
                case 1544803905:
                    break;
                case 1980048599:
                    break;
                default:
                    Result.Companion companion4 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(C37237b.m83282e(str));
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97262f("KCJSWebSocket", "getWsApi: WebSocket client not found for channelType=" + str + ", fallback to default", thM103847exceptionOrNullimpl);
                        objM103844constructorimpl = C37237b.m83278a();
                    }
                    return (InterfaceC37236a) objM103844constructorimpl;
            }
        }
        return C37237b.m83278a();
    }

    @Override // com.kubi.rn.core.socket.KRNSocketNativeBridge.KRNSocketHandler
    public void startTask(@NotNull String taskId, @NotNull String topic, @NotNull String extraJson) {
        String strOptString;
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(extraJson, "extraJson");
        if (taskId.length() == 0) {
            C44128b.m97261e("KCJSWebSocket", "startTask ignored: empty taskId");
            return;
        }
        if (topic.length() == 0) {
            C44128b.m97261e("KCJSWebSocket", "startTask ignored: empty topic, taskId=" + taskId);
            return;
        }
        JSONObject jSONObjectM31723f = m31723f(extraJson);
        String str = (jSONObjectM31723f == null || (strOptString = jSONObjectM31723f.optString("channelType")) == null || strOptString.length() <= 0) ? null : strOptString;
        int iOptInt = jSONObjectM31723f != null ? jSONObjectM31723f.optInt("throttle", 0) : 0;
        long jOptLong = jSONObjectM31723f != null ? jSONObjectM31723f.optLong("throttleInterval", 500L) : 500L;
        IKrnSocketWsApi iKrnSocketWsApiM31722e = m31722e(str);
        InterfaceC41775x1 interfaceC41775x1Put = this.f27445a.put(taskId, C41696j.m91104d(C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()).plus(new CoroutineName("KCJSWebSocket-bin-" + taskId)).plus(new C15256b(CoroutineExceptionHandler.INSTANCE))), null, null, new KCJSWebSocket$startTask$job$1(iKrnSocketWsApiM31722e, topic, iOptInt, jOptLong, taskId, this, null), 3, null));
        if (interfaceC41775x1Put != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1Put, null, 1, null);
        }
        C44128b.m97259c("KCJSWebSocket", "startTask(binary): taskId=" + taskId + ", topic=" + topic + ", channelType=" + str + ", throttle=" + iOptInt + ", throttleInterval=" + jOptLong);
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m31723f(String str) {
        Object objM103844constructorimpl;
        Object obj = null;
        if (str.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new JSONObject(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (JSONObject) obj;
    }
}
