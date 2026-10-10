package com.kubi.futures.trade;

import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.p072ad.api.service.IAdService;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$fetchFuturesAd$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {215}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesViewModel$fetchFuturesAd$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$fetchFuturesAd$1$1 */
    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$fetchFuturesAd$1$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {216}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C136111 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FuturesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136111(FuturesViewModel futuresViewModel, Continuation<? super C136111> continuation) {
            super(2, continuation);
            this.this$0 = futuresViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C136111(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C136111) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                IAdService iAdService = IAdService.f14934a.get();
                this.label = 1;
                obj = iAdService.mo14647a("app-futures-pop-up", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List listEmptyList = (List) obj;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            ResAdEntity resAdEntity = (ResAdEntity) CollectionsKt.firstOrNull(listEmptyList);
            if (resAdEntity != null) {
                this.this$0.m26731z().postValue(resAdEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$fetchFuturesAd$1(FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$fetchFuturesAd$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$fetchFuturesAd$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$fetchFuturesAd$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C136111 c136111 = new C136111(this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c136111, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
