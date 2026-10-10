package com.kubi.flutter.network.channel;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.network.exception.HttpException;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import gg.C37917a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: INetworkClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R$\u0010(\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010\r¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/network/channel/BaseNetworkClient;", "Lcom/kubi/flutter/network/channel/c;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "", "channelName", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "channelProxy", "<init>", "(Ljava/lang/String;Lcom/kubi/flutter/network/channel/NetworkChannel;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", FirebaseAnalytics.Param.METHOD, "", "arguments", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "Lkotlinx/coroutines/m0;", "d", "Lkotlinx/coroutines/m0;", "()Lkotlinx/coroutines/m0;", "networkScope", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "()Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "setNetworkBinding", "networkBinding", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nINetworkClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,100:1\n48#2,4:101\n*S KotlinDebug\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient\n*L\n46#1:101,4\n*E\n"})
public abstract class BaseNetworkClient implements InterfaceC12605c, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channelProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 networkScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public FlutterPlugin.FlutterPluginBinding networkBinding;

    /* JADX INFO: renamed from: com.kubi.flutter.network.channel.BaseNetworkClient$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/flutter/network/channel/BaseNetworkClient$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient\n+ 3 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,110:1\n46#2:111\n55#3,6:112\n*S KotlinDebug\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient\n*L\n46#1:112,6\n*E\n"})
    public static final class C12600a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseNetworkClient f21999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12600a(CoroutineExceptionHandler.Companion companion, BaseNetworkClient baseNetworkClient) {
            super(companion);
            this.f21999b = baseNetworkClient;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            String str = this.f21999b.channelName;
            if (C37917a.m85739b(exception)) {
                C44128b.m97263g("NetFlutterIssue", exception);
            } else {
                C37917a.m85740c(exception, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.network.channel.BaseNetworkClient$onMethodCall$1 */
    /* JADX INFO: compiled from: INetworkClient.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.flutter.network.channel.BaseNetworkClient$onMethodCall$1", m90122f = "INetworkClient.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nINetworkClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient$onMethodCall$1\n+ 2 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,100:1\n55#2,6:101\n55#2,6:107\n*S KotlinDebug\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient$onMethodCall$1\n*L\n80#1:101,6\n84#1:107,6\n*E\n"})
    public static final class C126011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ MethodCall $call;
        final /* synthetic */ MethodChannel.Result $result;
        Object L$0;
        int label;
        final /* synthetic */ BaseNetworkClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126011(MethodChannel.Result result, BaseNetworkClient baseNetworkClient, MethodCall methodCall, Continuation<? super C126011> continuation) {
            super(2, continuation);
            this.$result = result;
            this.this$0 = baseNetworkClient;
            this.$call = methodCall;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C126011(this.$result, this.this$0, this.$call, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C126011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MethodChannel.Result result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        result = (MethodChannel.Result) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MethodChannel.Result result2 = this.$result;
                    BaseNetworkClient baseNetworkClient = this.this$0;
                    String method = this.$call.method;
                    Intrinsics.checkNotNullExpressionValue(method, "method");
                    Object obj2 = this.$call.arguments;
                    this.L$0 = result2;
                    this.label = 1;
                    Object objMo23799e = baseNetworkClient.mo23799e(method, obj2, this);
                    if (objMo23799e == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = result2;
                    obj = objMo23799e;
                }
                result.success(C12606d.m23811b(obj));
            } catch (HttpException e11) {
                C44128b.m97261e(this.this$0.channelName, "onReceive:[method = " + this.$call.method + ", error = " + e11.getMessage() + ']');
                this.$result.error(String.valueOf(e11.getCode()), e11.getMessage(), e11);
                String str = this.this$0.channelName;
                if (!C37917a.m85739b(e11)) {
                    C37917a.m85740c(e11, str);
                } else {
                    C44128b.m97263g("NetFlutterIssue", e11);
                }
            } catch (Throwable th2) {
                C44128b.m97261e(this.this$0.channelName, "onReceive:[method = " + this.$call.method + ", error = " + th2.getMessage() + ']');
                this.$result.error("-1000", th2.getMessage(), th2);
                String str2 = this.this$0.channelName;
                if (!C37917a.m85739b(th2)) {
                    C37917a.m85740c(th2, str2);
                } else {
                    C44128b.m97263g("NetFlutterIssue", th2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo23799e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable;

    public BaseNetworkClient(@NotNull String channelName, @NotNull NetworkChannel channelProxy) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelProxy, "channelProxy");
        this.channelName = channelName;
        this.channelProxy = channelProxy;
        this.networkScope = C41713n0.m91125a(new CoroutineName(channelName).plus(C42911a.m94120b()).plus(new C12600a(CoroutineExceptionHandler.INSTANCE, this)));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23796g(BaseNetworkClient baseNetworkClient, String str, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSend");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        baseNetworkClient.m23800f(str, obj);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final FlutterPlugin.FlutterPluginBinding getNetworkBinding() {
        return this.networkBinding;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC41709m0 getNetworkScope() {
        return this.networkScope;
    }

    /* JADX INFO: renamed from: f */
    public final void m23800f(@NotNull String method, @Nullable Object arguments) {
        Intrinsics.checkNotNullParameter(method, "method");
        C41696j.m91104d(this.networkScope, null, null, new BaseNetworkClient$onSend$1(this, method, arguments, null), 3, null);
    }

    @Override // com.kubi.flutter.network.channel.InterfaceC12605c
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channelProxy.m23805e(this.channelName, this);
        this.networkBinding = binding;
    }

    @Override // com.kubi.flutter.network.channel.InterfaceC12605c
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channelProxy.m23805e(this.channelName, null);
        C41713n0.m91129e(this.networkScope, null, 1, null);
        this.networkBinding = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C41696j.m91104d(this.networkScope, null, null, new C126011(result, this, call, null), 3, null);
    }
}
