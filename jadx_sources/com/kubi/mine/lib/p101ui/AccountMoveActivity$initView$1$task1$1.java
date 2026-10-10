package com.kubi.mine.lib.p101ui;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.mine.lib.service.MineDepend;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountMoveActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Ljava/math/BigDecimal;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.AccountMoveActivity$initView$1$task1$1", m90122f = "AccountMoveActivity.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountMoveActivity$initView$1$task1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BigDecimal>, Object> {
    int label;

    public AccountMoveActivity$initView$1$task1$1(Continuation<? super AccountMoveActivity$initView$1$task1$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountMoveActivity$initView$1$task1$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BigDecimal> continuation) {
        return ((AccountMoveActivity$initView$1$task1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        IAssetsCenterService iAssetsCenterServiceM41825d = MineDepend.f35159a.m41825d();
        this.label = 1;
        Object objMo15350p = iAssetsCenterServiceM41825d.mo15350p("BTC", this);
        if (objMo15350p == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo15350p;
    }
}
