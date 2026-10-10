package com.kubi.assets.finance;

import android.widget.CompoundButton;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.utils.ToastCompat;
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

/* JADX INFO: compiled from: FinanceAutoRenewBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceAutoRenewBinder$handleToggle$1", m90122f = "FinanceAutoRenewBinder.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFinanceAutoRenewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceAutoRenewBinder.kt\ncom/kubi/assets/finance/FinanceAutoRenewBinder$handleToggle$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n25#2:134\n26#2:136\n1#3:135\n*S KotlinDebug\n*F\n+ 1 FinanceAutoRenewBinder.kt\ncom/kubi/assets/finance/FinanceAutoRenewBinder$handleToggle$1\n*L\n89#1:134\n89#1:136\n89#1:135\n*E\n"})
public final class FinanceAutoRenewBinder$handleToggle$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ ProductChildEntity $item;
    final /* synthetic */ String $lockId;
    final /* synthetic */ KcSmallSwitchButton $switch;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceAutoRenewBinder$handleToggle$1$1 */
    /* JADX INFO: compiled from: FinanceAutoRenewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceAutoRenewBinder$handleToggle$1$1", m90122f = "FinanceAutoRenewBinder.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99461 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ ProductChildEntity $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C99461(ProductChildEntity productChildEntity, boolean z11, Continuation<? super C99461> continuation) {
            super(2, continuation);
            this.$item = productChildEntity;
            this.$isChecked = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C99461(this.$item, this.$isChecked, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C99461) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$item.setUserRelock(this.$isChecked);
                if (this.$isChecked) {
                    i11 = R$string.kc_asset_auto_renewal_on;
                } else {
                    i11 = R$string.kc_asset_auto_renewal_off;
                }
                ToastCompat.m66437C(i11);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceAutoRenewBinder$handleToggle$1(String str, boolean z11, ProductChildEntity productChildEntity, KcSmallSwitchButton kcSmallSwitchButton, Continuation<? super FinanceAutoRenewBinder$handleToggle$1> continuation) {
        super(2, continuation);
        this.$lockId = str;
        this.$isChecked = z11;
        this.$item = productChildEntity;
        this.$switch = kcSmallSwitchButton;
    }

    /* JADX INFO: renamed from: f */
    public static final void m16624f(KcSmallSwitchButton kcSmallSwitchButton, ProductChildEntity productChildEntity, CompoundButton compoundButton, boolean z11) {
        FinanceAutoRenewBinder.f17374a.m16622k(kcSmallSwitchButton, productChildEntity, z11);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinanceAutoRenewBinder$handleToggle$1(this.$lockId, this.$isChecked, this.$item, this.$switch, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FinanceAutoRenewBinder$handleToggle$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FinanceAutoRenewBinder$handleToggle$1 financeAutoRenewBinder$handleToggle$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                financeAutoRenewBinder$handleToggle$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eM17161s = FinanceAutoRenewBinder.f17374a.m16621j().m17161s(this.$lockId, this.$isChecked ? 1 : 0);
            C99461 c99461 = new C99461(this.$item, this.$isChecked, null);
            this.label = 1;
            financeAutoRenewBinder$handleToggle$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM17161s, false, c99461, financeAutoRenewBinder$handleToggle$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final KcSmallSwitchButton kcSmallSwitchButton = financeAutoRenewBinder$handleToggle$1.$switch;
        boolean z11 = financeAutoRenewBinder$handleToggle$1.$isChecked;
        final ProductChildEntity productChildEntity = financeAutoRenewBinder$handleToggle$1.$item;
        if (((C19334f) obj).getThrowable() != null) {
            kcSmallSwitchButton.setOnCheckedChangeListener(null);
            kcSmallSwitchButton.setChecked(!z11);
            kcSmallSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.finance.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    FinanceAutoRenewBinder$handleToggle$1.m16624f(kcSmallSwitchButton, productChildEntity, compoundButton, z12);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
