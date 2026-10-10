package com.kubi.transfer.helper;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TransferAccountHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.helper.TransferAccountHelper", m90122f = "TransferAccountHelper.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "fetchBalanceList", m90126n = {"coin", "toType", "contractBalance", TUIConstants.TIMPush.NOTIFICATION.ACTION, "accountType", "precision", "isContract"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0"})
public final class TransferAccountHelper$fetchBalanceList$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransferAccountHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAccountHelper$fetchBalanceList$1(TransferAccountHelper transferAccountHelper, Continuation<? super TransferAccountHelper$fetchBalanceList$1> continuation) {
        super(continuation);
        this.this$0 = transferAccountHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64575e(null, 0, null, false, null, null, this);
    }
}
