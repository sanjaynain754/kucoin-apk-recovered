package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyPositionModeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.ModifyPositionModeViewModel$submitPositionMode$1", m90122f = "ModifyPositionModeViewModel.kt", m90123i = {0}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {"positionModeEntity"}, m90127s = {"L$0"})
public final class ModifyPositionModeViewModel$submitPositionMode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $positionMode;
    Object L$0;
    int label;
    final /* synthetic */ ModifyPositionModeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.ModifyPositionModeViewModel$submitPositionMode$1$1 */
    /* JADX INFO: compiled from: ModifyPositionModeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.ModifyPositionModeViewModel$submitPositionMode$1$1", m90122f = "ModifyPositionModeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135111 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ PositionModeEntity $positionModeEntity;
        int label;
        final /* synthetic */ ModifyPositionModeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135111(boolean z11, PositionModeEntity positionModeEntity, ModifyPositionModeViewModel modifyPositionModeViewModel, Continuation<? super C135111> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.$positionModeEntity = positionModeEntity;
            this.this$0 = modifyPositionModeViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135111(this.$isTrial, this.$positionModeEntity, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135111) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89032F0(this.$isTrial, this.$positionModeEntity);
                this.this$0.m26402p().postValue(Boxing.boxBoolean(false));
                this.this$0.m26403q().postValue(TuplesKt.m90091to(Boxing.boxBoolean(true), null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyPositionModeViewModel$submitPositionMode$1(String str, boolean z11, ModifyPositionModeViewModel modifyPositionModeViewModel, Continuation<? super ModifyPositionModeViewModel$submitPositionMode$1> continuation) {
        super(2, continuation);
        this.$positionMode = str;
        this.$isTrial = z11;
        this.this$0 = modifyPositionModeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifyPositionModeViewModel$submitPositionMode$1(this.$positionMode, this.$isTrial, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ModifyPositionModeViewModel$submitPositionMode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m26406f(ModifyPositionModeViewModel modifyPositionModeViewModel, Throwable th2) {
        MutableLiveData<Boolean> mutableLiveDataM26402p = modifyPositionModeViewModel.m26402p();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataM26402p.postValue(bool);
        modifyPositionModeViewModel.m26403q().postValue(TuplesKt.m90091to(bool, th2));
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
            PositionModeEntity positionModeEntity = new PositionModeEntity(Intrinsics.areEqual(this.$positionMode, "HEDGE") ? 1 : 0);
            C135111 c135111 = new C135111(this.$isTrial, positionModeEntity, this.this$0, null);
            final ModifyPositionModeViewModel modifyPositionModeViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ModifyPositionModeViewModel$submitPositionMode$1.m26406f(modifyPositionModeViewModel, (Throwable) obj2);
                }
            };
            this.L$0 = SpillingKt.nullOutSpilledVariable(positionModeEntity);
            this.label = 1;
            if (CoroutineExKt.m36471a(c135111, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
