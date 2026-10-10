package com.kubi.flutter.security.channel;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.safe.keychain.exception.KeyChainException;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import mg.C42532a;
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

/* JADX INFO: compiled from: SecurityClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \u00182\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R$\u0010'\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b\u001d\u0010%\"\u0004\b&\u0010\n¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/security/channel/SecurityClient;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lcom/kubi/flutter/security/channel/a;", AppsFlyerProperties.CHANNEL, "<init>", "(Lcom/kubi/flutter/security/channel/a;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "c", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "d", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "b", "Lcom/kubi/flutter/security/channel/a;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/m0;", "getBaseScope", "()Lkotlinx/coroutines/m0;", "baseScope", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "()Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "setBaseBinding", "baseBinding", "Companion", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSecurityClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,79:1\n48#2,4:80\n*S KotlinDebug\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient\n*L\n26#1:80,4\n*E\n"})
public abstract class SecurityClient implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12740a channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 baseScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public FlutterPlugin.FlutterPluginBinding baseBinding;

    /* JADX INFO: renamed from: com.kubi.flutter.security.channel.SecurityClient$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/flutter/security/channel/SecurityClient$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient\n+ 3 SecurityFlutterIssue.kt\ncom/kubi/flutter/security/exception/SecurityFlutterIssueKt\n*L\n1#1,110:1\n26#2:111\n43#3,9:112\n*S KotlinDebug\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient\n*L\n26#1:112,9\n*E\n"})
    public static final class C12738a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            C42532a.m93250b(exception, "SecurityClient");
        }

        public C12738a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.security.channel.SecurityClient$onMethodCall$1 */
    /* JADX INFO: compiled from: SecurityClient.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.flutter.security.channel.SecurityClient$onMethodCall$1", m90122f = "SecurityClient.kt", m90123i = {}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSecurityClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient$onMethodCall$1\n+ 2 SecurityFlutterIssue.kt\ncom/kubi/flutter/security/exception/SecurityFlutterIssueKt\n*L\n1#1,79:1\n43#2,9:80\n43#2,9:89\n*S KotlinDebug\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient$onMethodCall$1\n*L\n57#1:80,9\n60#1:89,9\n*E\n"})
    public static final class C127391 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ MethodCall $call;
        final /* synthetic */ MethodChannel.Result $result;
        Object L$0;
        int label;
        final /* synthetic */ SecurityClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127391(MethodChannel.Result result, SecurityClient securityClient, MethodCall methodCall, Continuation<? super C127391> continuation) {
            super(2, continuation);
            this.$result = result;
            this.this$0 = securityClient;
            this.$call = methodCall;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C127391(this.$result, this.this$0, this.$call, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C127391) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    SecurityClient securityClient = this.this$0;
                    String method = this.$call.method;
                    Intrinsics.checkNotNullExpressionValue(method, "method");
                    Object obj2 = this.$call.arguments;
                    this.L$0 = result2;
                    this.label = 1;
                    Object objMo24073e = securityClient.mo24073e(method, obj2, this);
                    if (objMo24073e == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = result2;
                    obj = objMo24073e;
                }
                result.success(C12743d.m24083b(obj));
            } catch (KeyChainException e11) {
                this.$result.error(String.valueOf(e11.getCode()), e11.getMessage(), e11);
                C42532a.m93250b(e11, "SecurityClient");
            } catch (Throwable th2) {
                this.$result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th2.getMessage(), th2);
                C42532a.m93250b(th2, "SecurityClient");
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo24073e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable;

    public SecurityClient(@NotNull C12740a channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.baseScope = C41713n0.m91125a(new CoroutineName("SecurityClient").plus(C42911a.m94120b()).plus(new C12738a(CoroutineExceptionHandler.INSTANCE)));
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FlutterPlugin.FlutterPluginBinding getBaseBinding() {
        return this.baseBinding;
    }

    /* JADX INFO: renamed from: c */
    public final void m24071c(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m24077b(this);
        this.baseBinding = binding;
    }

    /* JADX INFO: renamed from: d */
    public final void m24072d(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m24077b(null);
        this.baseBinding = null;
        C41713n0.m91129e(this.baseScope, null, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m24074f(@NotNull String method, @Nullable Object arguments) {
        Intrinsics.checkNotNullParameter(method, "method");
        C41696j.m91104d(this.baseScope, null, null, new SecurityClient$onSend$1(this, method, arguments, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Context m24075g() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.baseBinding;
        Context applicationContext = flutterPluginBinding != null ? flutterPluginBinding.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext);
        return applicationContext;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C41696j.m91104d(this.baseScope, null, null, new C127391(result, this, call, null), 3, null);
    }
}
