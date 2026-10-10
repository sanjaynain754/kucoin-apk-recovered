package com.kubi.copytrading.futures;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CopyTradingViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.futures.CopyTradingViewModel$fetchCopyTrading$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {34}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CopyTradingViewModel$fetchCopyTrading$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.CopyTradingViewModel$fetchCopyTrading$1$1 */
    /* JADX INFO: compiled from: CopyTradingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.futures.CopyTradingViewModel$fetchCopyTrading$1$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115191 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CopyTradingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115191(CopyTradingViewModel copyTradingViewModel, Continuation<? super C115191> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115191 c115191 = new C115191(this.this$0, continuation);
            c115191.L$0 = obj;
            return c115191;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
            return ((C115191) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f19900W.setValue(Boxing.boxInt(list.size()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingViewModel$fetchCopyTrading$1(CopyTradingViewModel copyTradingViewModel, Continuation<? super CopyTradingViewModel$fetchCopyTrading$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingViewModel$fetchCopyTrading$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingViewModel$fetchCopyTrading$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<List<Object>> interfaceC41634eM20827f = this.this$0.m20863s().m20827f();
            C115191 c115191 = new C115191(this.this$0, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42823d(interfaceC41634eM20827f, false, c115191, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
