package com.kubi.kyc.knb;

import com.kubi.kyc.ui.kycv2.KycBridgeManager;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycAdvanceResult;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKycCallImpl.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.knb.KCFlutterBridgeKycCallImpl$advancebyChannel$4", m90122f = "KCFlutterBridgeKycCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeKycCallImpl$advancebyChannel$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<KCFlutterBridgeKycKycAdvanceResult, ProtocolException, Unit> $callback;
    final /* synthetic */ FlutterEntryActivity $context;
    final /* synthetic */ String $infoData;
    int label;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m36807f(Function2 function2, KCFlutterBridgeKycKycAdvanceResult kCFlutterBridgeKycKycAdvanceResult) {
        function2.invoke(kCFlutterBridgeKycKycAdvanceResult, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKycCallImpl$advancebyChannel$4(FlutterEntryActivity flutterEntryActivity, String str, Function2<? super KCFlutterBridgeKycKycAdvanceResult, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeKycCallImpl$advancebyChannel$4> continuation) {
        super(2, continuation);
        this.$context = flutterEntryActivity;
        this.$infoData = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeKycCallImpl$advancebyChannel$4(this.$context, this.$infoData, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKycCallImpl$advancebyChannel$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
            FlutterEntryActivity flutterEntryActivity = this.$context;
            String str = this.$infoData;
            Intrinsics.checkNotNull(str);
            final Function2<KCFlutterBridgeKycKycAdvanceResult, ProtocolException, Unit> function2 = this.$callback;
            kycBridgeManager.m37177G(flutterEntryActivity, str, new Function1() { // from class: com.kubi.kyc.knb.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCFlutterBridgeKycCallImpl$advancebyChannel$4.m36807f(function2, (KCFlutterBridgeKycKycAdvanceResult) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
