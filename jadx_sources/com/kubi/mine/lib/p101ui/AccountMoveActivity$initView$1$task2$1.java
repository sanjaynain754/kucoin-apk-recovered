package com.kubi.mine.lib.p101ui;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p319hq.InterfaceC38285b;
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
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u0001`\u0004*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "", "Lkotlin/collections/ArrayList;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.AccountMoveActivity$initView$1$task2$1", m90122f = "AccountMoveActivity.kt", m90123i = {}, m90124l = {60}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountMoveActivity$initView$1$task2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ArrayList<String[]>>, Object> {
    int label;

    public AccountMoveActivity$initView$1$task2$1(Continuation<? super AccountMoveActivity$initView$1$task2$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountMoveActivity$initView$1$task2$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ArrayList<String[]>> continuation) {
        return ((AccountMoveActivity$initView$1$task2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM42826g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM42826g = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM86407i = InterfaceC38285b.m86407i((InterfaceC38285b) RetrofitFlowExKt.m42820a(InterfaceC38285b.class), "USER_UPGRADE", null, null, 4, null);
            this.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM86407i, false, null, this, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return ((C19334f) objM42826g).m42846a();
    }
}
