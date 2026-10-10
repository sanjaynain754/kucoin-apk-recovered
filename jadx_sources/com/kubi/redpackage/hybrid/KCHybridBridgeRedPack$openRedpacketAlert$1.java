package com.kubi.redpackage.hybrid;

import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCHybridBridgeRedPack.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.hybrid.KCHybridBridgeRedPack$openRedpacketAlert$1", m90122f = "KCHybridBridgeRedPack.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCHybridBridgeRedPack$openRedpacketAlert$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $codeVal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeRedPack$openRedpacketAlert$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCHybridBridgeRedPack$openRedpacketAlert$1> continuation) {
        super(2, continuation);
        this.$codeVal = str;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m53748f(Function2 function2, JSONObject jSONObject) {
        function2.invoke(Boolean.valueOf(jSONObject.optInt("code", -1) == 0), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeRedPack$openRedpacketAlert$1(this.$codeVal, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeRedPack$openRedpacketAlert$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$codeVal;
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            RedPackageHelperKt.m53717f(str, new Function1() { // from class: com.kubi.redpackage.hybrid.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCHybridBridgeRedPack$openRedpacketAlert$1.m53748f(function2, (JSONObject) obj2);
                }
            }, null, 4, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
