package com.kubi.alpha;

import androidx.fragment.app.FragmentManager;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.business.kyc.KycGuideHandler;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradebase.business.kyc.NoticeDetailEntity;
import com.kubi.utils.ToastCompat;
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

/* JADX INFO: compiled from: AlphaFragment.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.alpha.AlphaFragment$onViewCreated$1$1", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AlphaFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ AlphaFragment this$0;

    /* JADX INFO: renamed from: com.kubi.alpha.AlphaFragment$onViewCreated$1$1$a */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9406a implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AlphaFragment f15345b;

        public C9406a(AlphaFragment alphaFragment) {
            this.f15345b = alphaFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m14976a() {
            this.f15345b.showLoadingDialog();
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m14976a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.alpha.AlphaFragment$onViewCreated$1$1$b */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9407b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AlphaFragment f15346b;

        public C9407b(AlphaFragment alphaFragment) {
            this.f15346b = alphaFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m14977a() {
            if (this.f15346b.isShowing()) {
                BaseFragment.hideLoadingDialog$default(this.f15346b, false, 1, null);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m14977a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaFragment$onViewCreated$1$1(AlphaFragment alphaFragment, String str, Continuation<? super AlphaFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = alphaFragment;
        this.$it = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlphaFragment$onViewCreated$1$1(this.this$0, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AlphaFragment$onViewCreated$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            KycViewModel kycViewModelM14969t3 = this.this$0.m14969t3();
            C9406a c9406a = new C9406a(this.this$0);
            C9407b c9407b = new C9407b(this.this$0);
            this.label = 1;
            obj = kycViewModelM14969t3.m63181o("KYC_LIMIT", c9406a, c9407b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        NoticeDetailEntity noticeDetailEntity = (NoticeDetailEntity) obj;
        if (noticeDetailEntity != null) {
            AlphaFragment alphaFragment = this.this$0;
            KycGuideHandler kycGuideHandler = KycGuideHandler.f51552a;
            FragmentManager childFragmentManager = alphaFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            KycGuideHandler.m63189k(kycGuideHandler, noticeDetailEntity, childFragmentManager, "B5trading", null, 8, null);
        } else {
            ToastCompat.m66441G(this.$it, new Object[0]);
        }
        return Unit.INSTANCE;
    }
}
