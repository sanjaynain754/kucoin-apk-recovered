package com.kubi.kumex.flutter;

import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.protocol.ProtocolException;
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

/* JADX INFO: compiled from: KCFlutterBridgeKumexCallImpl.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.flutter.KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1", m90122f = "KCFlutterBridgeKumexCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKumexCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKumexCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,139:1\n106#2,2:140\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKumexCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1\n*L\n115#1:140,2\n*E\n"})
public final class KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCFlutterBridgeKumexCallImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1(Function2<? super String, ? super ProtocolException, Unit> function2, KCFlutterBridgeKumexCallImpl kCFlutterBridgeKumexCallImpl, Continuation<? super KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.this$0 = kCFlutterBridgeKumexCallImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1 kCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1 = new KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1(this.$callback, this.this$0, continuation);
        kCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1.L$0 = obj;
        return kCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function2<String, ProtocolException, Unit> function2 = this.$callback;
        KCFlutterBridgeKumexCallImpl kCFlutterBridgeKumexCallImpl = this.this$0;
        if (C12573b.f21598a.m23696a()) {
            "modify_twap_order_flutter_callback".length();
        }
        C12572a.m23693b(interfaceC41709m0, new C15977xd7176d57("modify_twap_order_flutter_callback", null, function2, kCFlutterBridgeKumexCallImpl));
        return Unit.INSTANCE;
    }
}
