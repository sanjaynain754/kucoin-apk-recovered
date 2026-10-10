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
@DebugMetadata(m90121c = "com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper", m90122f = "ShowSignProtocolDialogHelper.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3}, m90124l = {60, 66, 72, 74}, m90125m = "showSignProtocolLinkDialogList", m90126n = {"protocolLinkItemList", "protocolContentItemList", "protocolLinkItemList", "protocolContentItemList", "signLinkProtocolResult", "protocolLinkItemList", "protocolContentItemList", "signLinkProtocolResult", "protocolLinkItemList", "protocolContentItemList", "signLinkProtocolResult", "signLinkProtocolRetainResult"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowSignProtocolDialogHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1(ShowSignProtocolDialogHelper showSignProtocolDialogHelper, Continuation<? super ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1> continuation) {
        super(continuation);
        this.this$0 = showSignProtocolDialogHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65583h(null, null, this);
    }
}
