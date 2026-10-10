package com.kubi.utaspotlib.service;

import android.content.Context;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utaspotlib.R$string;
import com.kubi.utaspotlib.biz.delegation.detail.UtaSpotAbsOrderDetailFragment;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import p199dd.C36661a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaSpotService.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.service.UtaSpotService$jumpUtaDelegationDetailFragment$1", m90122f = "UtaSpotService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaSpotService$jumpUtaDelegationDetailFragment$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bussinesType;
    final /* synthetic */ String $content;
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaSpotService$jumpUtaDelegationDetailFragment$1(String str, Context context, String str2, Continuation<? super UtaSpotService$jumpUtaDelegationDetailFragment$1> continuation) {
        super(2, continuation);
        this.$content = str;
        this.$ctx = context;
        this.$bussinesType = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaSpotService$jumpUtaDelegationDetailFragment$1(this.$content, this.$ctx, this.$bussinesType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaSpotService$jumpUtaDelegationDetailFragment$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ResponseItemEntity responseItemEntity = (ResponseItemEntity) C27099x.m66913c(this.$content, ResponseItemEntity.class);
            if (responseItemEntity == null) {
                return Unit.INSTANCE;
            }
            HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntityM82027b = C36661a.m82027b(responseItemEntity);
            if (historyOrdersUiData$ItemEntityM82027b == null) {
                return Unit.INSTANCE;
            }
            Context context = this.$ctx;
            String string = context.getString(R$string.deal_detail);
            String name = UtaSpotAbsOrderDetailFragment.class.getName();
            C27051h c27051h = new C27051h();
            String str = this.$bussinesType;
            c27051h.m66721e("data", historyOrdersUiData$ItemEntityM82027b);
            c27051h.m66724h("tradeType", str);
            Unit unit = Unit.INSTANCE;
            BaseFragmentActivity.m56574n0(context, string, name, c27051h.m66717a());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
