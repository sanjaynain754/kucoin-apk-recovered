package com.kubi.core.biz.margininfo.dialog;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {475, 476}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaLeverageSettingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1> continuation) {
        super(2, continuation);
        this.this$0 = utaLeverageSettingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r6.m21928M4(r5) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        if (DelayKt.m90350b(300L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        UtaLeverageSettingDialog utaLeverageSettingDialog = this.this$0;
        this.label = 2;
    }
}
