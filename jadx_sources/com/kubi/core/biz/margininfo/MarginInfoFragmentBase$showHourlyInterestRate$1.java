package com.kubi.core.biz.margininfo;

import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import com.kubi.utils.C27017c;
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
import ro.C44128b;
import v30.C45410w;

/* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$showHourlyInterestRate$1", m90122f = "MarginInfoFragmentBase.kt", m90123i = {}, m90124l = {125}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginInfoFragmentBase$showHourlyInterestRate$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int label;
    final /* synthetic */ MarginInfoFragmentBase this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$showHourlyInterestRate$1$1 */
    /* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "rates", "", "", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$showHourlyInterestRate$1$1", m90122f = "MarginInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119251 extends SuspendLambda implements Function2<Map<String, ? extends UnifyHourlyRateEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currency;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MarginInfoFragmentBase this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends UnifyHourlyRateEntity> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, UnifyHourlyRateEntity>) map, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119251(String str, MarginInfoFragmentBase marginInfoFragmentBase, Continuation<? super C119251> continuation) {
            super(2, continuation);
            this.$currency = str;
            this.this$0 = marginInfoFragmentBase;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119251 c119251 = new C119251(this.$currency, this.this$0, continuation);
            c119251.L$0 = obj;
            return c119251;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, UnifyHourlyRateEntity> map, Continuation<? super Unit> continuation) {
            return ((C119251) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM66516f;
            BaseTextView baseTextView;
            BaseTextView baseTextView2;
            Map map = (Map) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UnifyHourlyRateEntity unifyHourlyRateEntity = (UnifyHourlyRateEntity) map.get(this.$currency);
            if (unifyHourlyRateEntity != null) {
                try {
                    strM66516f = C42180b.m92642g(new BigDecimal(unifyHourlyRateEntity.getRate()), null, null, 20, false, false, false, 27, null);
                } catch (Exception e11) {
                    C44128b.m97260d("showHourlyInterestRate---->" + e11);
                    strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
                }
                C45410w c45410wM21858Y3 = this.this$0.m21858Y3();
                if (c45410wM21858Y3 != null && (baseTextView = c45410wM21858Y3.f102375c) != null) {
                    baseTextView.setText(strM66516f);
                }
            } else {
                C45410w c45410wM21858Y4 = this.this$0.m21858Y3();
                if (c45410wM21858Y4 != null && (baseTextView2 = c45410wM21858Y4.f102375c) != null) {
                    baseTextView2.setText(C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInfoFragmentBase$showHourlyInterestRate$1(String str, MarginInfoFragmentBase marginInfoFragmentBase, Continuation<? super MarginInfoFragmentBase$showHourlyInterestRate$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = marginInfoFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginInfoFragmentBase$showHourlyInterestRate$1(this.$currency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginInfoFragmentBase$showHourlyInterestRate$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C119251 c119251 = new C119251(this.$currency, this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eMo64994i, c119251, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
