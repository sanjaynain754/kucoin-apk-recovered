package com.kubi.operation.lib.utils;

import android.location.Location;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LocationOnceManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.utils.LocationOnceManager$onResult$1$1", m90122f = "LocationOnceManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class LocationOnceManager$onResult$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ResultCode, Location, Unit> $callback;
    final /* synthetic */ Location $location;
    final /* synthetic */ ResultCode $resultCode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocationOnceManager$onResult$1$1(Function2<? super ResultCode, ? super Location, Unit> function2, ResultCode resultCode, Location location, Continuation<? super LocationOnceManager$onResult$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$resultCode = resultCode;
        this.$location = location;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationOnceManager$onResult$1$1(this.$callback, this.$resultCode, this.$location, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LocationOnceManager$onResult$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m43647f(Function2 function2, ResultCode resultCode, Location location) {
        function2.invoke(resultCode, location);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Function2<ResultCode, Location, Unit> function2 = this.$callback;
            final ResultCode resultCode = this.$resultCode;
            final Location location = this.$location;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocationOnceManager$onResult$1$1.m43647f(function2, resultCode, location);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
