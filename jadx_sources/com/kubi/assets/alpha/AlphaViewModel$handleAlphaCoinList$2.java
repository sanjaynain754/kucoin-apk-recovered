package com.kubi.assets.alpha;

import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.mvi.event.SingleEvent;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/assets/entity/AlphaAssetEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaViewModel$handleAlphaCoinList$2", m90122f = "AlphaViewModel.kt", m90123i = {0, 0}, m90124l = {106}, m90125m = "invokeSuspend", m90126n = {"data", "hasNonZeroBalance"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nAlphaViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaViewModel.kt\ncom/kubi/assets/alpha/AlphaViewModel$handleAlphaCoinList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1761#2,3:136\n*S KotlinDebug\n*F\n+ 1 AlphaViewModel.kt\ncom/kubi/assets/alpha/AlphaViewModel$handleAlphaCoinList$2\n*L\n102#1:136,3\n*E\n"})
public final class AlphaViewModel$handleAlphaCoinList$2 extends SuspendLambda implements Function2<List<? extends AlphaAssetEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AlphaViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<AlphaAssetEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaViewModel$handleAlphaCoinList$2(AlphaViewModel alphaViewModel, Continuation<? super AlphaViewModel$handleAlphaCoinList$2> continuation) {
        super(2, continuation);
        this.this$0 = alphaViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m15324f(List list, UIState uIState) {
        return UIState.copy$default(uIState, list, null, false, null, false, null, null, null, 254, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlphaViewModel$handleAlphaCoinList$2 alphaViewModel$handleAlphaCoinList$2 = new AlphaViewModel$handleAlphaCoinList$2(this.this$0, continuation);
        alphaViewModel$handleAlphaCoinList$2.L$0 = obj;
        return alphaViewModel$handleAlphaCoinList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
        return ((AlphaViewModel$handleAlphaCoinList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolBoxBoolean;
        final List list = (List) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            List<AlphaAssetEntity> data = ((UIState) this.this$0.getState()).getData();
            if (data != null && !data.isEmpty()) {
                this.this$0.sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
            if (list != null) {
                boolean z11 = false;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!Intrinsics.areEqual(((AlphaAssetEntity) it.next()).getTotalBalance(), BigDecimal.ZERO)) {
                            z11 = true;
                            break;
                        }
                    }
                }
                boolBoxBoolean = Boxing.boxBoolean(z11);
            } else {
                boolBoxBoolean = null;
            }
            if (Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true))) {
                Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.assets.alpha.a0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AlphaViewModel$handleAlphaCoinList$2.m15324f(list, (UIState) obj2);
                    }
                }));
            } else {
                AlphaViewModel alphaViewModel = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.L$1 = SpillingKt.nullOutSpilledVariable(boolBoxBoolean);
                this.label = 1;
                if (alphaViewModel.m15322G(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
