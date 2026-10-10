package com.kubi.quotefacade.chain;

import androidx.lifecycle.MutableLiveData;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.user.api.IUserService;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: ChainContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.ChainContainerViewModel$startLoopLoadData$1$1", m90122f = "ChainContainerViewModel.kt", m90123i = {0}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class ChainContainerViewModel$startLoopLoadData$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderByRange;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainContainerViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.ChainContainerViewModel$startLoopLoadData$1$1$1 */
    /* JADX INFO: compiled from: ChainContainerViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.ChainContainerViewModel$startLoopLoadData$1$1$1", m90122f = "ChainContainerViewModel.kt", m90123i = {}, m90124l = {144, 146}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217441 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $orderByRange;
        Object L$0;
        int label;
        final /* synthetic */ ChainContainerViewModel this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C217441) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C217441(ChainContainerViewModel chainContainerViewModel, String str, Continuation<? super C217441> continuation) {
            super(2, continuation);
            this.this$0 = chainContainerViewModel;
            this.$orderByRange = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C217441(this.this$0, this.$orderByRange, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        List<ChainItemEntity> list = (List) obj;
                        if (!list.isEmpty()) {
                            this.this$0.m50755r().postValue(list);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableLiveData.postValue(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j(this.this$0.f41471V, "startLoopLoadData reall");
                if (!IUserService.a.get().c()) {
                    MutableLiveData<List<ChainItemEntity>> mutableLiveDataM50755r = this.this$0.m50755r();
                    ChainContainerViewModel chainContainerViewModel = this.this$0;
                    String str = this.$orderByRange;
                    this.L$0 = mutableLiveDataM50755r;
                    this.label = 1;
                    Object objM50754q = chainContainerViewModel.m50754q(str, this);
                    if (objM50754q != coroutine_suspended) {
                        mutableLiveData = mutableLiveDataM50755r;
                        obj = objM50754q;
                        mutableLiveData.postValue(obj);
                    }
                } else {
                    ChainContainerViewModel chainContainerViewModel2 = this.this$0;
                    String str2 = this.$orderByRange;
                    this.label = 2;
                    obj = chainContainerViewModel2.m50754q(str2, this);
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainContainerViewModel$startLoopLoadData$1$1(ChainContainerViewModel chainContainerViewModel, String str, Continuation<? super ChainContainerViewModel$startLoopLoadData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chainContainerViewModel;
        this.$orderByRange = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainContainerViewModel$startLoopLoadData$1$1 chainContainerViewModel$startLoopLoadData$1$1 = new ChainContainerViewModel$startLoopLoadData$1$1(this.this$0, this.$orderByRange, continuation);
        chainContainerViewModel$startLoopLoadData$1$1.L$0 = obj;
        return chainContainerViewModel$startLoopLoadData$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChainContainerViewModel$startLoopLoadData$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = interfaceC41709m0;
            this.label = 1;
            if (DelayKt.m90350b(60000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!C41713n0.m91132h(interfaceC41709m0)) {
            return Unit.INSTANCE;
        }
        ChainContainerViewModel chainContainerViewModel = this.this$0;
        chainContainerViewModel.f41476a0 = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, 60000L, null, null, null, new C217441(chainContainerViewModel, this.$orderByRange, null), 28, null);
        return Unit.INSTANCE;
    }
}
