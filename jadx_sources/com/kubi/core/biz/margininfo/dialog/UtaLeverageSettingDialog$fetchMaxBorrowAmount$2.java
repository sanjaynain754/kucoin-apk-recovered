package com.kubi.core.biz.margininfo.dialog;

import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "", "Lkotlin/jvm/JvmSuppressWildcards;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$fetchMaxBorrowAmount$2", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaLeverageSettingDialog$fetchMaxBorrowAmount$2 extends SuspendLambda implements Function2<Map<String, String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UtaLeverageSettingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaLeverageSettingDialog$fetchMaxBorrowAmount$2(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super UtaLeverageSettingDialog$fetchMaxBorrowAmount$2> continuation) {
        super(2, continuation);
        this.this$0 = utaLeverageSettingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UtaLeverageSettingDialog$fetchMaxBorrowAmount$2 utaLeverageSettingDialog$fetchMaxBorrowAmount$2 = new UtaLeverageSettingDialog$fetchMaxBorrowAmount$2(this.this$0, continuation);
        utaLeverageSettingDialog$fetchMaxBorrowAmount$2.L$0 = obj;
        return utaLeverageSettingDialog$fetchMaxBorrowAmount$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, String> map, Continuation<? super Unit> continuation) {
        return ((UtaLeverageSettingDialog$fetchMaxBorrowAmount$2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) map.get("remainingBorrowAmount");
        if (str == null) {
            str = "0";
        }
        C44128b.m97266j("UtaLeverageSettingDialog", "fetchMaxBorrowAmount result: " + str);
        this.this$0.m21941f5(str);
        return Unit.INSTANCE;
    }
}
