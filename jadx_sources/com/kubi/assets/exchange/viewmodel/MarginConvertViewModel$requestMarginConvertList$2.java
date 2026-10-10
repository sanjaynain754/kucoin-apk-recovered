package com.kubi.assets.exchange.viewmodel;

import com.kubi.assets.exchange.contract.UIState;
import com.kubi.assets.exchange.model.ConvertEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.unify.api.IUnifyAccountService;
import java.math.BigDecimal;
import java.util.List;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarginConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/exchange/model/ConvertEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MarginConvertViewModel$requestMarginConvertList$2", m90122f = "MarginConvertViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginConvertViewModel$requestMarginConvertList$2 extends SuspendLambda implements Function2<List<? extends ConvertEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginConvertViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ConvertEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ConvertEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginConvertViewModel$requestMarginConvertList$2(MarginConvertViewModel marginConvertViewModel, Continuation<? super MarginConvertViewModel$requestMarginConvertList$2> continuation) {
        super(2, continuation);
        this.this$0 = marginConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginConvertViewModel$requestMarginConvertList$2 marginConvertViewModel$requestMarginConvertList$2 = new MarginConvertViewModel$requestMarginConvertList$2(this.this$0, continuation);
        marginConvertViewModel$requestMarginConvertList$2.L$0 = obj;
        return marginConvertViewModel$requestMarginConvertList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ConvertEntity> list, Continuation<? super Unit> continuation) {
        return ((MarginConvertViewModel$requestMarginConvertList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BigDecimal feeRate;
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final List listM16541w = this.this$0.m16541w(list, IUnifyAccountService.f53155a.get().mo64979C());
        ConvertEntity convertEntity = (ConvertEntity) CollectionsKt.getOrNull(list, 0);
        final String strM92642g = (convertEntity == null || (feeRate = convertEntity.getFeeRate()) == null) ? null : C42180b.m92642g(feeRate, null, null, 0, false, false, false, 31, null);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.exchange.viewmodel.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarginConvertViewModel$requestMarginConvertList$2.m16545f(listM16541w, strM92642g, (UIState) obj2);
            }
        });
        this.this$0.sendSingleEvent(SingleEvent.C19247c.f35626b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16545f(List list, String str, UIState uIState) {
        return uIState.copy(list, str);
    }
}
