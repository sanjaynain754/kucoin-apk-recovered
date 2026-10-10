package com.trtc.uikit.livekit.component.networkInfo.store;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NetworkInfoStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore$addObserver$1", m90122f = "NetworkInfoStore.kt", m90123i = {}, m90124l = {143}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NetworkInfoStore$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NetworkInfoStore this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoStore$addObserver$1$a */
    /* JADX INFO: compiled from: NetworkInfoStore.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35947a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ NetworkInfoStore f77939b;

        public C35947a(NetworkInfoStore networkInfoStore) {
            this.f77939b = networkInfoStore;
        }

        /* JADX INFO: renamed from: a */
        public final Object m79843a(boolean z11, Continuation<? super Unit> continuation) {
            this.f77939b.m79834r(Boxing.boxBoolean(z11));
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m79843a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInfoStore$addObserver$1(NetworkInfoStore networkInfoStore, Continuation<? super NetworkInfoStore$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = networkInfoStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkInfoStore$addObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NetworkInfoStore$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM79810l = this.this$0.getF77928a().m79810l();
            C35947a c35947a = new C35947a(this.this$0);
            this.label = 1;
            if (interfaceC41669nM79810l.collect(c35947a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
