package com.kubi.core.biz.margininfo.dialog;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {0}, m90124l = {493}, m90125m = "fetchMaxBorrowAmount", m90126n = {"leverageInt"}, m90127s = {"I$0"})
public final class UtaLeverageSettingDialog$fetchMaxBorrowAmount$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtaLeverageSettingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaLeverageSettingDialog$fetchMaxBorrowAmount$1(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super UtaLeverageSettingDialog$fetchMaxBorrowAmount$1> continuation) {
        super(continuation);
        this.this$0 = utaLeverageSettingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m21928M4(this);
    }
}
