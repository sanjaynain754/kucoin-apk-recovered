package com.kubi.futures.trade.marginMode;

import androidx.lifecycle.MutableLiveData;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModifyMarginModeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.ModifyMarginModeViewModel$submitMarginMode$1", m90122f = "ModifyMarginModeViewModel.kt", m90123i = {}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ModifyMarginModeViewModel$submitMarginMode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $marginMode;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ ModifyMarginModeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m27030f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyMarginModeViewModel$submitMarginMode$1(ModifyMarginModeViewModel modifyMarginModeViewModel, String str, String str2, boolean z11, Continuation<? super ModifyMarginModeViewModel$submitMarginMode$1> continuation) {
        super(2, continuation);
        this.this$0 = modifyMarginModeViewModel;
        this.$symbol = str;
        this.$marginMode = str2;
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifyMarginModeViewModel$submitMarginMode$1(this.this$0, this.$symbol, this.$marginMode, this.$isTrial, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ModifyMarginModeViewModel$submitMarginMode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ModifyMarginModeViewModel$submitMarginMode$1$result$1 modifyMarginModeViewModel$submitMarginMode$1$result$1 = new ModifyMarginModeViewModel$submitMarginMode$1$result$1(this.$symbol, this.$marginMode, this.$isTrial, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.marginMode.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ModifyMarginModeViewModel$submitMarginMode$1.m27030f((Throwable) obj2);
                }
            };
            this.label = 1;
            obj = CoroutineExKt.m36471a(modifyMarginModeViewModel$submitMarginMode$1$result$1, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ModifyMarginModeResultEntity modifyMarginModeResultEntity = (ModifyMarginModeResultEntity) obj;
        this.this$0.m27026n().postValue(Boxing.boxBoolean(false));
        MutableLiveData<Pair<Boolean, ModifyMarginModeResultEntity>> mutableLiveDataM27027o = this.this$0.m27027o();
        if (modifyMarginModeResultEntity == null) {
            z11 = false;
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
        if (modifyMarginModeResultEntity == null) {
            modifyMarginModeResultEntity = new ModifyMarginModeResultEntity(MapsKt.mapOf(new Pair(this.$symbol, this.$marginMode)), null);
        }
        mutableLiveDataM27027o.postValue(new Pair<>(boolBoxBoolean, modifyMarginModeResultEntity));
        return Unit.INSTANCE;
    }
}
