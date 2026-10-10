package com.kubi.flutter.security.channel;

import kotlinx.coroutines.InterfaceC41709m0;
import mg.C42532a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SecurityClient.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.security.channel.SecurityClient$onSend$1", m90122f = "SecurityClient.kt", m90123i = {}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSecurityClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient$onSend$1\n+ 2 SecurityFlutterIssue.kt\ncom/kubi/flutter/security/exception/SecurityFlutterIssueKt\n*L\n1#1,79:1\n43#2,9:80\n*S KotlinDebug\n*F\n+ 1 SecurityClient.kt\ncom/kubi/flutter/security/channel/SecurityClient$onSend$1\n*L\n46#1:80,9\n*E\n"})
public final class SecurityClient$onSend$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $arguments;
    final /* synthetic */ String $method;
    int label;
    final /* synthetic */ SecurityClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityClient$onSend$1(SecurityClient securityClient, String str, Object obj, Continuation<? super SecurityClient$onSend$1> continuation) {
        super(2, continuation);
        this.this$0 = securityClient;
        this.$method = str;
        this.$arguments = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityClient$onSend$1(this.this$0, this.$method, this.$arguments, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SecurityClient$onSend$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C12740a c12740a = this.this$0.com.appsflyer.AppsFlyerProperties.CHANNEL java.lang.String;
                String str = this.$method;
                Object obj2 = this.$arguments;
                this.label = 1;
                if (c12740a.m24076a(str, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            C42532a.m93250b(th2, "SecurityClient");
        }
        return Unit.INSTANCE;
    }
}
