package com.kubi.user.protocol.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper", m90122f = "ShowSignProtocolDialogHelper.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {88, 99, 101}, m90125m = "showSignProtocolContentDialogList", m90126n = {"protocolContentItemList", "activeIndex", "isFromFirstStep", "protocolContentItemList", "signProtocolContentResult", "activeIndex", "isFromFirstStep", "currentActiveIndex", "protocolContentItemList", "signProtocolContentResult", "signProtocolContentRetainResult", "activeIndex", "isFromFirstStep", "currentActiveIndex"}, m90127s = {"L$0", "I$0", "Z$0", "L$0", "L$1", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1"})
public final class ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowSignProtocolDialogHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1(ShowSignProtocolDialogHelper showSignProtocolDialogHelper, Continuation<? super ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1> continuation) {
        super(continuation);
        this.this$0 = showSignProtocolDialogHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65581f(null, 0, false, this);
    }
}
