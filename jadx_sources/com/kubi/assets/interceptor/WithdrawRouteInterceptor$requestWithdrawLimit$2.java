package com.kubi.assets.interceptor;

import android.content.Context;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.withdraw.WithdrawPreVerifyFragment;
import com.kubi.assets.withdraw.v5;
import com.kubi.router.utils.C23636b;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawRouteInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/BlackGroupResponse;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.interceptor.WithdrawRouteInterceptor$requestWithdrawLimit$2", m90122f = "WithdrawRouteInterceptor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WithdrawRouteInterceptor$requestWithdrawLimit$2 extends SuspendLambda implements Function2<BlackGroupResponse, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Function0<Unit> $callBack;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WithdrawRouteInterceptor this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(BlackGroupResponse blackGroupResponse, Continuation<? super Unit> continuation) {
        return ((WithdrawRouteInterceptor$requestWithdrawLimit$2) create(blackGroupResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawRouteInterceptor$requestWithdrawLimit$2(WithdrawRouteInterceptor withdrawRouteInterceptor, Function0<Unit> function0, String str, Continuation<? super WithdrawRouteInterceptor$requestWithdrawLimit$2> continuation) {
        super(2, continuation);
        this.this$0 = withdrawRouteInterceptor;
        this.$callBack = function0;
        this.$address = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WithdrawRouteInterceptor$requestWithdrawLimit$2 withdrawRouteInterceptor$requestWithdrawLimit$2 = new WithdrawRouteInterceptor$requestWithdrawLimit$2(this.this$0, this.$callBack, this.$address, continuation);
        withdrawRouteInterceptor$requestWithdrawLimit$2.L$0 = obj;
        return withdrawRouteInterceptor$requestWithdrawLimit$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlackGroupResponse blackGroupResponse = (BlackGroupResponse) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (blackGroupResponse.isLimitWithdraw()) {
            this.this$0.m17435u(blackGroupResponse);
            C43841b.m96555b("B1withdrawPage_available_coin_load", null, 2, null);
        } else {
            v5 v5Var = v5.a;
            if (v5Var.a() || v5Var.n()) {
                this.$callBack.invoke();
            } else {
                C43841b.m96555b("B1withdrawPage_available_coin_load", null, 2, null);
                WithdrawPreVerifyFragment.Companion companion = WithdrawPreVerifyFragment.X;
                Context contextM56289c = C23636b.m56289c();
                Intrinsics.checkNotNullExpressionValue(contextM56289c, "getTopActivityOrApp(...)");
                companion.startVerifyFragment(contextM56289c, this.this$0.f17774a, this.$address);
            }
        }
        return Unit.INSTANCE;
    }
}
