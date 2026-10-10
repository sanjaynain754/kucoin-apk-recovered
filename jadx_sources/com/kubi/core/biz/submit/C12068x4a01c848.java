package com.kubi.core.biz.submit;

import com.kubi.core.biz.loan.entity.MarginLeverageEntity;
import java.util.List;
import p593rd.InterfaceC43990a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1$result$1 */
/* JADX INFO: compiled from: UtaMarginTradeCoreViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/core/biz/loan/entity/MarginLeverageEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1$result$1", m90122f = "UtaMarginTradeCoreViewModel.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C12068x4a01c848 extends SuspendLambda implements Function1<Continuation<? super MarginLeverageEntity>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ UtaMarginTradeCoreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12068x4a01c848(UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModel, String str, Continuation<? super C12068x4a01c848> continuation) {
        super(1, continuation);
        this.this$0 = utaMarginTradeCoreViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C12068x4a01c848(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super MarginLeverageEntity> continuation) {
        return ((C12068x4a01c848) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            InterfaceC43990a interfaceC43990aM22509u = this.this$0.m22509u();
            String str = this.$symbol;
            this.label = 1;
            obj = interfaceC43990aM22509u.m96948a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return ((List) obj).get(0);
    }
}
