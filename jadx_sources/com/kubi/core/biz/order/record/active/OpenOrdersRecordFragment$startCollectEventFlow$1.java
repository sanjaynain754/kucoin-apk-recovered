package com.kubi.core.biz.order.record.active;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OpenOrdersRecordFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$startCollectEventFlow$1", m90122f = "OpenOrdersRecordFragment.kt", m90123i = {}, m90124l = {168}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OpenOrdersRecordFragment$startCollectEventFlow$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OpenOrdersRecordFragment this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$startCollectEventFlow$1$a */
    /* JADX INFO: compiled from: OpenOrdersRecordFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12018a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OpenOrdersRecordFragment f20580b;

        public C12018a(OpenOrdersRecordFragment openOrdersRecordFragment) {
            this.f20580b = openOrdersRecordFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC12019a interfaceC12019a, Continuation<? super Unit> continuation) {
            if (!(interfaceC12019a instanceof InterfaceC12019a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f20580b.hideDialogLoadingCompat();
            InterfaceC12019a.a aVar = (InterfaceC12019a.a) interfaceC12019a;
            this.f20580b.m22109P3(aVar.getF20581a(), aVar.getF20582b(), aVar.getF20583c());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOrdersRecordFragment$startCollectEventFlow$1(OpenOrdersRecordFragment openOrdersRecordFragment, Continuation<? super OpenOrdersRecordFragment$startCollectEventFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = openOrdersRecordFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenOrdersRecordFragment$startCollectEventFlow$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OpenOrdersRecordFragment$startCollectEventFlow$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.this$0.m22116S3().m22138x());
            C12018a c12018a = new C12018a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM90881E.collect(c12018a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
