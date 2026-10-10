package com.kubi.otc.otc.paytype.add;

import com.kubi.otc.entity.PrecheckBean;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27099x;
import et.InterfaceC37241c;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PayTypeAddViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/PrecheckBean$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.paytype.add.PayTypeAddViewModel$preCheck$1$1$1", m90122f = "PayTypeAddViewModel.kt", m90123i = {}, m90124l = {48}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PayTypeAddViewModel$preCheck$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<PrecheckBean.Response>>, Object> {
    final /* synthetic */ Map<String, String> $mapParams;
    final /* synthetic */ String $payTypeId;
    int label;
    final /* synthetic */ PayTypeAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeAddViewModel$preCheck$1$1$1(PayTypeAddViewModel payTypeAddViewModel, String str, Map<String, String> map, Continuation<? super PayTypeAddViewModel$preCheck$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = payTypeAddViewModel;
        this.$payTypeId = str;
        this.$mapParams = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayTypeAddViewModel$preCheck$1$1$1(this.this$0, this.$payTypeId, this.$mapParams, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<PrecheckBean.Response>> continuation) {
        return ((PayTypeAddViewModel$preCheck$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC37241c interfaceC37241c = this.this$0.f37915V;
        PrecheckBean.Request request = new PrecheckBean.Request(this.$payTypeId, C27099x.m66919i(this.$mapParams, false, 2, null));
        this.label = 1;
        Object objM83337p = interfaceC37241c.m83337p(request, this);
        if (objM83337p == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM83337p;
    }
}
