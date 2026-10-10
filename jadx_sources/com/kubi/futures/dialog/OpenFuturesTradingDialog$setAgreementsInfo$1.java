package com.kubi.futures.dialog;

import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.OpenFuturesTradingDialog$setAgreementsInfo$1", m90122f = "OpenFuturesTradingDialog.kt", m90123i = {1}, m90124l = {135, 141}, m90125m = "invokeSuspend", m90126n = {"agreements"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nOpenFuturesTradingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n774#2:313\n865#2,2:314\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1\n*L\n141#1:313\n141#1:314,2\n*E\n"})
public final class OpenFuturesTradingDialog$setAgreementsInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OpenFuturesTradingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFuturesTradingDialog$setAgreementsInfo$1(OpenFuturesTradingDialog openFuturesTradingDialog, Continuation<? super OpenFuturesTradingDialog$setAgreementsInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = openFuturesTradingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenFuturesTradingDialog$setAgreementsInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OpenFuturesTradingDialog$setAgreementsInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r1.m25174H4(r2, r8) == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String agreementLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        ArrayList arrayList = null;
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
        AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
        OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1 openFuturesTradingDialog$setAgreementsInfo$1$agreements$1 = new OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1(this.this$0, null);
        this.label = 1;
        obj = C41686h.m91049g(abstractC41697j0M94120b, openFuturesTradingDialog$setAgreementsInfo$1$agreements$1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list = (List) obj;
        OpenFuturesTradingDialog openFuturesTradingDialog = this.this$0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                OpenFuturesAgreement openFuturesAgreement = (OpenFuturesAgreement) obj2;
                String agreementName = openFuturesAgreement.getAgreementName();
                if (agreementName != null && agreementName.length() != 0 && (agreementLink = openFuturesAgreement.getAgreementLink()) != null && agreementLink.length() != 0) {
                    arrayList.add(obj2);
                }
            }
        }
        this.L$0 = SpillingKt.nullOutSpilledVariable(list);
        this.label = 2;
    }
}
