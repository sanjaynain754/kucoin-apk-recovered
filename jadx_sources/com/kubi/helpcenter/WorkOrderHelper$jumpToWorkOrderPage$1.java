package com.kubi.helpcenter;

import android.app.Activity;
import android.net.Uri;
import com.blankj.utilcode.util.C5258a;
import com.kubi.helpcenter.entity.WorkOrderParams;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import k10.DialogC40864b;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import vi.InterfaceC45554a;

/* JADX INFO: compiled from: WorkOrderHelper.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.helpcenter.WorkOrderHelper$jumpToWorkOrderPage$1", m90122f = "WorkOrderHelper.kt", m90123i = {0}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {"loadingDialog"}, m90127s = {"L$0"})
public final class WorkOrderHelper$jumpToWorkOrderPage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromId;
    Object L$0;
    int label;

    /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0013, B:15:0x005b, B:17:0x0062, B:20:0x0069, B:21:0x007f), top: B:28:0x0013 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DialogC40864b dialogC40864b;
        Object objM42830k;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Activity activityM6125h = C5258a.m6125h();
            Intrinsics.checkNotNullExpressionValue(activityM6125h, "getTopActivity(...)");
            DialogC40864b dialogC40864b2 = new DialogC40864b(activityM6125h, false, 2, null);
            dialogC40864b2.show();
            try {
                InterfaceC41634e<String> interfaceC41634eM100607a = ((InterfaceC45554a) C42597a.m93387c().create(InterfaceC45554a.class)).m100607a(new WorkOrderParams(null, this.$fromId, 1, null));
                this.L$0 = dialogC40864b2;
                this.label = 1;
                objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM100607a, this);
                if (objM42830k == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialogC40864b = dialogC40864b2;
                str = (String) objM42830k;
                dialogC40864b.dismiss();
                if (str != null) {
                    C37304a c37304a = C37304a.f82764a;
                    String strDecode = Uri.decode(WorkOrderHelper.f25242a.m28898b(this.$fromId));
                    Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
                    InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
                } else {
                    C37304a c37304a2 = C37304a.f82764a;
                    String strDecode2 = Uri.decode(WorkOrderHelper.f25242a.m28898b(this.$fromId));
                    Intrinsics.checkNotNullExpressionValue(strDecode2, "decode(...)");
                    InterfaceC37766r.a.m85190a(c37304a2, strDecode2, null, null, null, null, null, null, 126, null);
                }
            } catch (Exception unused) {
                dialogC40864b = dialogC40864b2;
                dialogC40864b.dismiss();
                C37304a c37304a3 = C37304a.f82764a;
                String strDecode3 = Uri.decode(WorkOrderHelper.f25242a.m28898b(this.$fromId));
                Intrinsics.checkNotNullExpressionValue(strDecode3, "decode(...)");
                InterfaceC37766r.a.m85190a(c37304a3, strDecode3, null, null, null, null, null, null, 126, null);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogC40864b = (DialogC40864b) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM42830k = obj;
                str = (String) objM42830k;
                dialogC40864b.dismiss();
                if (str != null || str.length() == 0) {
                    C37304a c37304a4 = C37304a.f82764a;
                    String strDecode4 = Uri.decode(WorkOrderHelper.f25242a.m28898b(this.$fromId));
                    Intrinsics.checkNotNullExpressionValue(strDecode4, "decode(...)");
                    InterfaceC37766r.a.m85190a(c37304a4, strDecode4, null, null, null, null, null, null, 126, null);
                } else {
                    C37304a c37304a5 = C37304a.f82764a;
                    String strDecode5 = Uri.decode(str);
                    Intrinsics.checkNotNullExpressionValue(strDecode5, "decode(...)");
                    InterfaceC37766r.a.m85190a(c37304a5, strDecode5, null, null, null, null, null, null, 126, null);
                }
            } catch (Exception unused2) {
                dialogC40864b.dismiss();
                C37304a c37304a6 = C37304a.f82764a;
                String strDecode6 = Uri.decode(WorkOrderHelper.f25242a.m28898b(this.$fromId));
                Intrinsics.checkNotNullExpressionValue(strDecode6, "decode(...)");
                InterfaceC37766r.a.m85190a(c37304a6, strDecode6, null, null, null, null, null, null, 126, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkOrderHelper$jumpToWorkOrderPage$1(String str, Continuation<? super WorkOrderHelper$jumpToWorkOrderPage$1> continuation) {
        super(2, continuation);
        this.$fromId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkOrderHelper$jumpToWorkOrderPage$1(this.$fromId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WorkOrderHelper$jumpToWorkOrderPage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
