package com.kubi.futures.view;

import android.view.View;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.operation.api.IOperationService;
import com.kubi.operation.api.entity.WelfareGuideInfo;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37755g;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KycLeadView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.view.KycLeadHelper$checkKycLead$1$1", m90122f = "KycLeadView.kt", m90123i = {1}, m90124l = {82, 84}, m90125m = "invokeSuspend", m90126n = {"welfareGuideInfo"}, m90127s = {"L$0"})
public final class KycLeadHelper$checkKycLead$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KycLeadView $leadView;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.view.KycLeadHelper$checkKycLead$1$1$1 */
    /* JADX INFO: compiled from: KycLeadView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.view.KycLeadHelper$checkKycLead$1$1$1", m90122f = "KycLeadView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C144521 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ KycLeadView $leadView;
        final /* synthetic */ WelfareGuideInfo $welfareGuideInfo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.futures.view.KycLeadHelper$checkKycLead$1$1$1$a */
        /* JADX INFO: compiled from: KycLeadView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WelfareGuideInfo.GuideType.values().length];
                try {
                    iArr[WelfareGuideInfo.GuideType.Kyc.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WelfareGuideInfo.GuideType.Deposit.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144521(WelfareGuideInfo welfareGuideInfo, KycLeadView kycLeadView, Continuation<? super C144521> continuation) {
            super(2, continuation);
            this.$welfareGuideInfo = welfareGuideInfo;
            this.$leadView = kycLeadView;
        }

        /* JADX INFO: renamed from: f */
        public static final void m28854f(View view) {
            InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
            C43852m.m96591c(C17060n0.m36552b(), "verifyGuide", "verifyNowButton", null, 8, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144521 c144521 = new C144521(this.$welfareGuideInfo, this.$leadView, continuation);
            c144521.L$0 = obj;
            return c144521;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C144521) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WelfareGuideInfo.GuideType f36583a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WelfareGuideInfo welfareGuideInfo = this.$welfareGuideInfo;
            if (welfareGuideInfo == null || (f36583a = welfareGuideInfo.getF36583a()) == null) {
                ViewExtKt.m66577h(this.$leadView);
            } else {
                KycLeadView kycLeadView = this.$leadView;
                WelfareGuideInfo welfareGuideInfo2 = this.$welfareGuideInfo;
                int i11 = a.$EnumSwitchMapping$0[f36583a.ordinal()];
                if (i11 == 1) {
                    ViewExtKt.m66594y(kycLeadView);
                    kycLeadView.setMessage(C27041f.m66668h(welfareGuideInfo2.getF36584b()));
                    kycLeadView.setBtnText(R$string.kyc_goto_verify);
                    kycLeadView.setBtnClick(new View.OnClickListener() { // from class: com.kubi.futures.view.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            KycLeadHelper$checkKycLead$1$1.C144521.m28854f(view);
                        }
                    });
                } else if (i11 != 2) {
                    ViewExtKt.m66577h(kycLeadView);
                } else {
                    ViewExtKt.m66577h(kycLeadView);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycLeadHelper$checkKycLead$1$1(KycLeadView kycLeadView, Continuation<? super KycLeadHelper$checkKycLead$1$1> continuation) {
        super(2, continuation);
        this.$leadView = kycLeadView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycLeadHelper$checkKycLead$1$1(this.$leadView, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KycLeadHelper$checkKycLead$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r3, r6) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
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
        IOperationService iOperationService = IOperationService.f36504a.get();
        this.label = 1;
        obj = iOperationService.mo4608j(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        WelfareGuideInfo welfareGuideInfo = (WelfareGuideInfo) obj;
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C144521 c144521 = new C144521(welfareGuideInfo, this.$leadView, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(welfareGuideInfo);
        this.label = 2;
    }
}
