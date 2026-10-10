package com.kubi.futures.compliance.leverage;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.utils.extensions.C27025c;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import sh.EuropeUnlockLeverageComposeEntity;

/* JADX INFO: compiled from: EuropeUnlockLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1", m90122f = "EuropeUnlockLeverageViewModel.kt", m90123i = {1}, m90124l = {67, 71}, m90125m = "invokeSuspend", m90126n = {FirebaseAnalytics.Param.LEVEL}, m90127s = {"L$0"})
public final class EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ EuropeUnlockLeverageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1(EuropeUnlockLeverageViewModel europeUnlockLeverageViewModel, Continuation<? super EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1> continuation) {
        super(2, continuation);
        this.this$0 = europeUnlockLeverageViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean guide;
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity;
        List listEmptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    europeUnlockLeverageLevelEntity = (EuropeUnlockLeverageLevelEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            listEmptyList = (List) obj;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.this$0.m24685s().postValue(new EuropeUnlockLeverageComposeEntity(europeUnlockLeverageLevelEntity, listEmptyList));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1 europeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1 = new EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1(null);
        this.label = 1;
        obj = CoroutineExKt.m36472b(europeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1, null, this, 2, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity2 = (EuropeUnlockLeverageLevelEntity) obj;
        if (europeUnlockLeverageLevelEntity2 != null) {
            guide = europeUnlockLeverageLevelEntity2.getGuide();
        } else {
            guide = null;
        }
        if (C27025c.m66566d(guide)) {
            EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$tasks$1 europeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$tasks$1 = new EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$tasks$1(null);
            this.L$0 = europeUnlockLeverageLevelEntity2;
            this.label = 2;
            Object objM36472b = CoroutineExKt.m36472b(europeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$tasks$1, null, this, 2, null);
            if (objM36472b != coroutine_suspended) {
                europeUnlockLeverageLevelEntity = europeUnlockLeverageLevelEntity2;
                obj = objM36472b;
                listEmptyList = (List) obj;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            return coroutine_suspended;
        }
        europeUnlockLeverageLevelEntity = europeUnlockLeverageLevelEntity2;
        listEmptyList = CollectionsKt.emptyList();
        this.this$0.m24685s().postValue(new EuropeUnlockLeverageComposeEntity(europeUnlockLeverageLevelEntity, listEmptyList));
        return Unit.INSTANCE;
    }
}
