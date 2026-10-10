package com.kubi.utaspotlib.biz.order;

import android.content.Context;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$string;
import com.kubi.utaspotlib.api.data.PreCalRiskRatioData;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import q70.C43660g;

/* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$fetchPreRiskRatio$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {272}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUtaOrderConfirmationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaOrderConfirmationDialog.kt\ncom/kubi/utaspotlib/biz/order/UtaOrderConfirmationDialog$fetchPreRiskRatio$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n25#2:528\n26#2:530\n1#3:529\n*S KotlinDebug\n*F\n+ 1 UtaOrderConfirmationDialog.kt\ncom/kubi/utaspotlib/biz/order/UtaOrderConfirmationDialog$fetchPreRiskRatio$1\n*L\n276#1:528\n276#1:530\n276#1:529\n*E\n"})
public final class UtaOrderConfirmationDialog$fetchPreRiskRatio$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaOrderConfirmationDialog this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$fetchPreRiskRatio$1$1 */
    /* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/utaspotlib/api/data/PreCalRiskRatioData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$fetchPreRiskRatio$1$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C269091 extends SuspendLambda implements Function2<PreCalRiskRatioData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaOrderConfirmationDialog this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(PreCalRiskRatioData preCalRiskRatioData, Continuation<? super Unit> continuation) {
            return ((C269091) create(preCalRiskRatioData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C269091(UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super C269091> continuation) {
            super(2, continuation);
            this.this$0 = utaOrderConfirmationDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C269091 c269091 = new C269091(this.this$0, continuation);
            c269091.L$0 = obj;
            return c269091;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BaseTextView baseTextView;
            BigDecimal riskRatio;
            PreCalRiskRatioData preCalRiskRatioData = (PreCalRiskRatioData) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C43660g c43660gM66145R3 = this.this$0.m66145R3();
            if (c43660gM66145R3 != null && (baseTextView = c43660gM66145R3.f96397o) != null) {
                baseTextView.setText(this.this$0.m66138K3((preCalRiskRatioData == null || (riskRatio = preCalRiskRatioData.getRiskRatio()) == null) ? null : this.this$0.m66148Y3(riskRatio)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaOrderConfirmationDialog$fetchPreRiskRatio$1(UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super UtaOrderConfirmationDialog$fetchPreRiskRatio$1> continuation) {
        super(2, continuation);
        this.this$0 = utaOrderConfirmationDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaOrderConfirmationDialog$fetchPreRiskRatio$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaOrderConfirmationDialog$fetchPreRiskRatio$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UtaOrderConfirmationDialog$fetchPreRiskRatio$1 utaOrderConfirmationDialog$fetchPreRiskRatio$1;
        C43660g c43660gM66145R3;
        BaseTextView baseTextView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String string = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                utaOrderConfirmationDialog$fetchPreRiskRatio$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<PreCalRiskRatioData> interfaceC41634eM66165g = C26914a.m66165g(this.this$0.f54160c0);
            C269091 c269091 = new C269091(this.this$0, null);
            this.label = 1;
            utaOrderConfirmationDialog$fetchPreRiskRatio$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM66165g, false, c269091, utaOrderConfirmationDialog$fetchPreRiskRatio$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        UtaOrderConfirmationDialog utaOrderConfirmationDialog = utaOrderConfirmationDialog$fetchPreRiskRatio$1.this$0;
        if (((C19334f) obj).getThrowable() != null && (c43660gM66145R3 = utaOrderConfirmationDialog.m66145R3()) != null && (baseTextView = c43660gM66145R3.f96397o) != null) {
            Context context = utaOrderConfirmationDialog.getContext();
            if (context != null) {
                string = context.getString(R$string.stub);
            }
            baseTextView.setText(string);
        }
        return Unit.INSTANCE;
    }
}
