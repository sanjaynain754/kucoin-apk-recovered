package com.kubi.operation.lib.realtime.gempool;

import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p842zs.C46913b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: GempoolRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtime.gempool.GempoolRealtimeDataHelper$startWsSubcribe$1", m90122f = "GempoolRealtimeDataHelper.kt", m90123i = {}, m90124l = {93}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class GempoolRealtimeDataHelper$startWsSubcribe$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public GempoolRealtimeDataHelper$startWsSubcribe$1(Continuation<? super GempoolRealtimeDataHelper$startWsSubcribe$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GempoolRealtimeDataHelper$startWsSubcribe$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GempoolRealtimeDataHelper$startWsSubcribe$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m43524g(final GemPoolRealtimeData gemPoolRealtimeData) {
        if (!C41713n0.m91132h(GempoolRealtimeDataHelper.f36781d)) {
            return Unit.INSTANCE;
        }
        final GempoolItemEntity entity = gemPoolRealtimeData.getEntity();
        if (entity == null) {
            return Unit.INSTANCE;
        }
        C46913b.f104783a.m103333d("[helper-gempool]wsSubcribe.entity=" + entity);
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.realtime.gempool.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GempoolRealtimeDataHelper$startWsSubcribe$1.m43525h(entity, gemPoolRealtimeData);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m43525h(GempoolItemEntity gempoolItemEntity, GemPoolRealtimeData gemPoolRealtimeData) {
        if (gempoolItemEntity.isFinished() && C27039d.m66653m(gempoolItemEntity.getRemainSeconds(), -1L) == 0) {
            C46913b c46913b = C46913b.f104783a;
            c46913b.m103333d("[helper-gempool]wsSubcribe.remove=" + gempoolItemEntity.getEarnTokenName());
            c46913b.m103331b().mo30035e(gemPoolRealtimeData);
        } else {
            C46913b c46913b2 = C46913b.f104783a;
            c46913b2.m103333d("[helper-gempool]wsSubcribe.addOrUpdate=" + gempoolItemEntity.getEarnTokenName());
            c46913b2.m103331b().mo30036f(gemPoolRealtimeData);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C46913b.f104783a.m103333d("[helper-gempool]startWsSubcribe.");
            OperationRepo operationRepo = GempoolRealtimeDataHelper.f36779b;
            Function1<? super GemPoolRealtimeData, Unit> function1 = new Function1() { // from class: com.kubi.operation.lib.realtime.gempool.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GempoolRealtimeDataHelper$startWsSubcribe$1.m43524g((GemPoolRealtimeData) obj2);
                }
            };
            this.label = 1;
            if (operationRepo.m43280u(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
