package com.kubi.futures.dialog;

import android.os.Bundle;
import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
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
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1", m90122f = "OpenFuturesTradingDialog.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {315}, m90125m = "invokeSuspend", m90126n = {"it", "this_$iv", "json$iv", "$completion$iv", "$i$a$-let-OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nOpenFuturesTradingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,312:1\n196#2,3:313\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1\n*L\n137#1:313,3\n*E\n"})
public final class OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends OpenFuturesAgreement>>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OpenFuturesTradingDialog this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends OpenFuturesAgreement>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<OpenFuturesAgreement>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1(OpenFuturesTradingDialog openFuturesTradingDialog, Continuation<? super OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1> continuation) {
        super(2, continuation);
        this.this$0 = openFuturesTradingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<OpenFuturesAgreement>> continuation) {
        return ((OpenFuturesTradingDialog$setAgreementsInfo$1$agreements$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM56284y;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (strM56284y = RouteExKt.m56284y(arguments, "AgreementsOfOpenFuturesStr")) == null) {
                return null;
            }
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C13044x784081a4(strM56284y, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM56284y);
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$2 = SpillingKt.nullOutSpilledVariable(strM56284y);
            this.L$3 = SpillingKt.nullOutSpilledVariable(this);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return (List) obj;
    }
}
