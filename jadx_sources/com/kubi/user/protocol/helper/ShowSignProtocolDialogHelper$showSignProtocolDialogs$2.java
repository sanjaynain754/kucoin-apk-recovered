package com.kubi.user.protocol.helper;

import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper$showSignProtocolDialogs$2", m90122f = "ShowSignProtocolDialogHelper.kt", m90123i = {1, 1, 2, 2}, m90124l = {43, 47, 50}, m90125m = "invokeSuspend", m90126n = {"protocolLinkItemList", "protocolContentItemList", "protocolLinkItemList", "protocolContentItemList"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
public final class ShowSignProtocolDialogHelper$showSignProtocolDialogs$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $signTermListJson;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSignProtocolDialogHelper$showSignProtocolDialogs$2(String str, Continuation<? super ShowSignProtocolDialogHelper$showSignProtocolDialogs$2> continuation) {
        super(2, continuation);
        this.$signTermListJson = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShowSignProtocolDialogHelper$showSignProtocolDialogs$2(this.$signTermListJson, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((ShowSignProtocolDialogHelper$showSignProtocolDialogs$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r7 == r0) goto L25;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        return Boxing.boxBoolean(zBooleanValue);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                return Boxing.boxBoolean(zBooleanValue);
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            SignProtocolHelper signProtocolHelper = SignProtocolHelper.f53730a;
            String str = this.$signTermListJson;
            this.label = 1;
            obj = signProtocolHelper.m65584a(str, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        Pair pair = (Pair) obj;
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        if (!list.isEmpty()) {
            ShowSignProtocolDialogHelper showSignProtocolDialogHelper = ShowSignProtocolDialogHelper.f53727a;
            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
            this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
            this.label = 2;
            obj = showSignProtocolDialogHelper.m65583h(list, list2, this);
        } else {
            if (!list2.isEmpty()) {
                ShowSignProtocolDialogHelper showSignProtocolDialogHelper2 = ShowSignProtocolDialogHelper.f53727a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                this.label = 3;
                obj = showSignProtocolDialogHelper2.m65581f(list2, 0, true, this);
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        return coroutine_suspended;
    }
}
