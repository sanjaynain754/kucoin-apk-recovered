package com.kubi.operation.lib.knb;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.kubi.operation.lib.utils.LocationOnceManager;
import com.kubi.operation.lib.utils.ResultCode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeOperationLocationInfo;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCHybridBridgeOperationCallImpl.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.knb.KCHybridBridgeOperationCallImpl$getCurrentLocation$2", m90122f = "KCHybridBridgeOperationCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCHybridBridgeOperationCallImpl$getCurrentLocation$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $act;
    final /* synthetic */ Function2<KCHybridBridgeOperationLocationInfo, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeOperationCallImpl$getCurrentLocation$2(FragmentActivity fragmentActivity, Function2<? super KCHybridBridgeOperationLocationInfo, ? super ProtocolException, Unit> function2, Continuation<? super KCHybridBridgeOperationCallImpl$getCurrentLocation$2> continuation) {
        super(2, continuation);
        this.$act = fragmentActivity;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m43489f(Function2 function2, ResultCode resultCode, Location location) {
        function2.invoke(new KCHybridBridgeOperationLocationInfo(resultCode.getCode(), resultCode.getMsg(), location != null ? Double.valueOf(location.getLongitude()) : null, location != null ? Double.valueOf(location.getLatitude()) : null), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeOperationCallImpl$getCurrentLocation$2(this.$act, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeOperationCallImpl$getCurrentLocation$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LocationOnceManager locationOnceManager = LocationOnceManager.f36846a;
            FragmentActivity fragmentActivity = this.$act;
            final Function2<KCHybridBridgeOperationLocationInfo, ProtocolException, Unit> function2 = this.$callback;
            locationOnceManager.m43638A(fragmentActivity, new Function2() { // from class: com.kubi.operation.lib.knb.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return KCHybridBridgeOperationCallImpl$getCurrentLocation$2.m43489f(function2, (ResultCode) obj2, (Location) obj3);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
