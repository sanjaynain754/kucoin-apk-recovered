package com.kubi.utaspotlib.biz.order;

import android.text.SpannableStringBuilder;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import com.kubi.utaspotlib.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import q70.C43660g;
import ro.C44128b;

/* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateHourlyRate$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {150}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaOrderConfirmationDialog$updateHourlyRate$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int label;
    final /* synthetic */ UtaOrderConfirmationDialog this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateHourlyRate$1$1 */
    /* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "rates", "", "", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateHourlyRate$1$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C269131 extends SuspendLambda implements Function2<Map<String, ? extends UnifyHourlyRateEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currency;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaOrderConfirmationDialog this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends UnifyHourlyRateEntity> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, UnifyHourlyRateEntity>) map, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C269131(String str, UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super C269131> continuation) {
            super(2, continuation);
            this.$currency = str;
            this.this$0 = utaOrderConfirmationDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C269131 c269131 = new C269131(this.$currency, this.this$0, continuation);
            c269131.L$0 = obj;
            return c269131;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, UnifyHourlyRateEntity> map, Continuation<? super Unit> continuation) {
            return ((C269131) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM92642g;
            BaseTextView baseTextView;
            Map map = (Map) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UnifyHourlyRateEntity unifyHourlyRateEntity = (UnifyHourlyRateEntity) map.get(this.$currency);
            if (unifyHourlyRateEntity != null) {
                try {
                    strM92642g = C42180b.m92642g(new BigDecimal(unifyHourlyRateEntity.getRate()), null, null, 20, false, false, false, 59, null);
                } catch (Exception e11) {
                    C44128b.m97258b("updateHourlyRate: error=" + e11);
                    strM92642g = "--";
                }
                SpannableStringBuilder spannableStringBuilderM66905e = C27039d.m66656p(this.this$0.m66139L3()).compareTo(BigDecimal.ZERO) <= 0 ? new C27096v0().m66905e("--", C27017c.f54310a.m66512a(R$color.c_text)) : this.this$0.m66140M3(strM92642g);
                C43660g c43660gM66145R3 = this.this$0.m66145R3();
                if (c43660gM66145R3 != null && (baseTextView = c43660gM66145R3.f96395m) != null) {
                    baseTextView.setText(spannableStringBuilderM66905e);
                }
                UtaOrderConfirmationDialog utaOrderConfirmationDialog = this.this$0;
                Intrinsics.checkNotNull(spannableStringBuilderM66905e);
                utaOrderConfirmationDialog.m66156g4(spannableStringBuilderM66905e);
                C44128b.m97258b("updateHourlyRate: currency=" + this.$currency + ", hourlyRate=" + strM92642g);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaOrderConfirmationDialog$updateHourlyRate$1(String str, UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super UtaOrderConfirmationDialog$updateHourlyRate$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = utaOrderConfirmationDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaOrderConfirmationDialog$updateHourlyRate$1(this.$currency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaOrderConfirmationDialog$updateHourlyRate$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC41634e<Map<String, UnifyHourlyRateEntity>> interfaceC41634eMo64994i = IUnifyAccountService.f53155a.get().mo64994i();
            C269131 c269131 = new C269131(this.$currency, this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eMo64994i, c269131, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
