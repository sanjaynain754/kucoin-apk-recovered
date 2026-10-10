package com.kubi.copytrading.futures;

import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.entity.LeadUserEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.futures.CopyTradingDelegate$onViewCreated$1", m90122f = "CopyTradingDelegate.kt", m90123i = {}, m90124l = {79}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CopyTradingDelegate$onViewCreated$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingDelegate this$0;

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.CopyTradingDelegate$onViewCreated$1$a */
    /* JADX INFO: compiled from: CopyTradingDelegate.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11518a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CopyTradingDelegate f19897b;

        public C11518a(CopyTradingDelegate copyTradingDelegate) {
            this.f19897b = copyTradingDelegate;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Pair<LeadUserEntity, LeadUserEntity> pair, Continuation<? super Unit> continuation) {
            CopyTradingDelegate copyTradingDelegate = this.f19897b;
            copyTradingDelegate.m20852p(copyTradingDelegate.f19890b);
            FutureCopyTradingConfig futureCopyTradingConfig = FutureCopyTradingConfig.f19902a;
            if (!futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount()) {
                LeadUserEntity first = pair.getFirst();
                String uid = first != null ? first.getUid() : null;
                LeadUserEntity second = pair.getSecond();
                if (!Intrinsics.areEqual(uid, second != null ? second.getUid() : null) || (pair.getFirst() == null && pair.getSecond() == null)) {
                    FutureCopyTradingConfig.m20870f(futureCopyTradingConfig, true, false, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingDelegate$onViewCreated$1(CopyTradingDelegate copyTradingDelegate, Continuation<? super CopyTradingDelegate$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingDelegate;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingDelegate$onViewCreated$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingDelegate$onViewCreated$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<Pair<LeadUserEntity, LeadUserEntity>> interfaceC41678wM20595k = CopyTradingConfig.f19710a.m20595k();
            C11518a c11518a = new C11518a(this.this$0);
            this.label = 1;
            if (interfaceC41678wM20595k.collect(c11518a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
