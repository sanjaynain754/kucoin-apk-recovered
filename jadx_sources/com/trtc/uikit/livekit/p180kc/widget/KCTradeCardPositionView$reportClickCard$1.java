package com.trtc.uikit.livekit.p180kc.widget;

import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KCTradeCardPositionView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCTradeCardPositionView$reportClickCard$1", m90122f = "KCTradeCardPositionView.kt", m90123i = {0, 0}, m90124l = {245}, m90125m = "invokeSuspend", m90126n = {"reportData", "request"}, m90127s = {"L$0", "L$1"})
public final class KCTradeCardPositionView$reportClickCard$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $closeIdValue;
    final /* synthetic */ String $roomIdValue;
    final /* synthetic */ String $symbolValue;
    final /* synthetic */ String $userIdValue;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTradeCardPositionView$reportClickCard$1(String str, String str2, String str3, String str4, Continuation<? super KCTradeCardPositionView$reportClickCard$1> continuation) {
        super(2, continuation);
        this.$symbolValue = str;
        this.$closeIdValue = str2;
        this.$userIdValue = str3;
        this.$roomIdValue = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCTradeCardPositionView$reportClickCard$1(this.$symbolValue, this.$closeIdValue, this.$userIdValue, this.$roomIdValue, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTradeCardPositionView$reportClickCard$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ClickCardReport.ReportData reportData = new ClickCardReport.ReportData(this.$symbolValue, ClickCardReport.ReportData.CARD_TYPE_FUTURE, this.$closeIdValue);
                ClickCardReport.Request request = new ClickCardReport.Request(this.$userIdValue, this.$roomIdValue, ClickCardReport.Request.REPORT_TYPE_CLICK_CARD, reportData);
                C44128b.m97266j("Live", "KCTradeCardPositionView: Reporting click card - userId=" + this.$userIdValue + ", roomId=" + this.$roomIdValue + ", symbol=" + this.$symbolValue + ", businessId=" + this.$closeIdValue);
                InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                this.L$0 = SpillingKt.nullOutSpilledVariable(reportData);
                this.L$1 = SpillingKt.nullOutSpilledVariable(request);
                this.label = 1;
                obj = interfaceC42178aM89024b.m92616d(request, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C44128b.m97266j("Live", "KCTradeCardPositionView: Report click card success - eventId=" + ((ClickCardReport.Response) obj).getEventId());
        } catch (Exception e11) {
            C44128b.m97261e("Live", "KCTradeCardPositionView: Report click card failed - " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}
