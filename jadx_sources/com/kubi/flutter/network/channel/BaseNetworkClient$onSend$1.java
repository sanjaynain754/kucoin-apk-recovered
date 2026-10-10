package com.kubi.flutter.network.channel;

import gg.C37917a;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: INetworkClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.network.channel.BaseNetworkClient$onSend$1", m90122f = "INetworkClient.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nINetworkClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient$onSend$1\n+ 2 NetFlutterIssue.kt\ncom/kubi/flutter/network/exception/NetFlutterIssueKt\n*L\n1#1,100:1\n55#2,6:101\n*S KotlinDebug\n*F\n+ 1 INetworkClient.kt\ncom/kubi/flutter/network/channel/BaseNetworkClient$onSend$1\n*L\n68#1:101,6\n*E\n"})
public final class BaseNetworkClient$onSend$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $arguments;
    final /* synthetic */ String $method;
    int label;
    final /* synthetic */ BaseNetworkClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNetworkClient$onSend$1(BaseNetworkClient baseNetworkClient, String str, Object obj, Continuation<? super BaseNetworkClient$onSend$1> continuation) {
        super(2, continuation);
        this.this$0 = baseNetworkClient;
        this.$method = str;
        this.$arguments = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseNetworkClient$onSend$1(this.this$0, this.$method, this.$arguments, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseNetworkClient$onSend$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                NetworkChannel networkChannel = this.this$0.channelProxy;
                String str = this.this$0.channelName;
                String str2 = this.$method;
                Object obj2 = this.$arguments;
                this.label = 1;
                if (networkChannel.m23801a(str, str2, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            C44128b.m97261e(this.this$0.channelName, "onSend:[method = " + this.$method + ", error = " + th2.getMessage() + ']');
            String str3 = this.this$0.channelName;
            if (!C37917a.m85739b(th2)) {
                C37917a.m85740c(th2, str3);
            } else {
                C44128b.m97263g("NetFlutterIssue", th2);
            }
        }
        return Unit.INSTANCE;
    }
}
