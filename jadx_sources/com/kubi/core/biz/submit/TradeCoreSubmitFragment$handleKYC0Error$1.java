package com.kubi.core.biz.submit;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.utils.C12462a;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.business.kyc.KycGuideHandler;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradebase.business.kyc.NoticeDetailEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$handleKYC0Error$1", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {575}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeCoreSubmitFragment$handleKYC0Error$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ TradeCoreSubmitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreSubmitFragment$handleKYC0Error$1(TradeCoreSubmitFragment tradeCoreSubmitFragment, Throwable th2, Continuation<? super TradeCoreSubmitFragment$handleKYC0Error$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeCoreSubmitFragment;
        this.$it = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeCoreSubmitFragment$handleKYC0Error$1(this.this$0, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeCoreSubmitFragment$handleKYC0Error$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m22395g(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        tradeCoreSubmitFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m22396h(TradeCoreSubmitFragment tradeCoreSubmitFragment) {
        if (tradeCoreSubmitFragment.isShowing()) {
            BaseFragment.hideLoadingDialog$default(tradeCoreSubmitFragment, false, 1, null);
        }
        return Unit.INSTANCE;
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
            KycViewModel kycViewModelM22296V4 = this.this$0.m22296V4();
            final TradeCoreSubmitFragment tradeCoreSubmitFragment = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: com.kubi.core.biz.submit.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeCoreSubmitFragment$handleKYC0Error$1.m22395g(tradeCoreSubmitFragment);
                }
            };
            final TradeCoreSubmitFragment tradeCoreSubmitFragment2 = this.this$0;
            Function0<Unit> function1 = new Function0() { // from class: com.kubi.core.biz.submit.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeCoreSubmitFragment$handleKYC0Error$1.m22396h(tradeCoreSubmitFragment2);
                }
            };
            this.label = 1;
            obj = kycViewModelM22296V4.m63181o("KYC_LIMIT", function0, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        NoticeDetailEntity noticeDetailEntity = (NoticeDetailEntity) obj;
        if (noticeDetailEntity != null) {
            TradeCoreSubmitFragment tradeCoreSubmitFragment3 = this.this$0;
            KycGuideHandler kycGuideHandler = KycGuideHandler.f51552a;
            FragmentManager childFragmentManager = tradeCoreSubmitFragment3.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            KycGuideHandler.m63189k(kycGuideHandler, noticeDetailEntity, childFragmentManager, C12462a.m23402a(), null, 8, null);
        } else {
            C19331c.m42836c(this.$it, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
