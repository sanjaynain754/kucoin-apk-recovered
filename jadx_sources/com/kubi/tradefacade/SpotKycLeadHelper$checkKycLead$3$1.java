package com.kubi.tradefacade;

import android.view.View;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SpotKycLeadView.kt */
/* JADX INFO: loaded from: classes49.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradefacade.SpotKycLeadHelper$checkKycLead$3$1", m90122f = "SpotKycLeadView.kt", m90123i = {1}, m90124l = {99, 101}, m90125m = "invokeSuspend", m90126n = {"welfareGuideInfo"}, m90127s = {"L$0"})
public final class SpotKycLeadHelper$checkKycLead$3$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Boolean> $displayAllowedProvider;
    final /* synthetic */ SpotKycLeadView $leadView;
    final /* synthetic */ Function0<String> $trackPageProvider;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.tradefacade.SpotKycLeadHelper$checkKycLead$3$1$1 */
    /* JADX INFO: compiled from: SpotKycLeadView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradefacade.SpotKycLeadHelper$checkKycLead$3$1$1", m90122f = "SpotKycLeadView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C259521 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Boolean> $displayAllowedProvider;
        final /* synthetic */ SpotKycLeadView $leadView;
        final /* synthetic */ Function0<String> $trackPageProvider;
        final /* synthetic */ WelfareGuideInfo $welfareGuideInfo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.tradefacade.SpotKycLeadHelper$checkKycLead$3$1$1$a */
        /* JADX INFO: compiled from: SpotKycLeadView.kt */
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
        public C259521(WelfareGuideInfo welfareGuideInfo, Function0<Boolean> function0, SpotKycLeadView spotKycLeadView, Function0<String> function1, Continuation<? super C259521> continuation) {
            super(2, continuation);
            this.$welfareGuideInfo = welfareGuideInfo;
            this.$displayAllowedProvider = function0;
            this.$leadView = spotKycLeadView;
            this.$trackPageProvider = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C259521 c259521 = new C259521(this.$welfareGuideInfo, this.$displayAllowedProvider, this.$leadView, this.$trackPageProvider, continuation);
            c259521.L$0 = obj;
            return c259521;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C259521) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Function0<Boolean> function0 = this.$displayAllowedProvider;
                SpotKycLeadView spotKycLeadView = this.$leadView;
                WelfareGuideInfo welfareGuideInfo2 = this.$welfareGuideInfo;
                final Function0<String> function1 = this.$trackPageProvider;
                int i11 = a.$EnumSwitchMapping$0[f36583a.ordinal()];
                if (i11 == 1) {
                    if (function0.invoke().booleanValue()) {
                        ViewExtKt.m66594y(spotKycLeadView);
                    } else {
                        ViewExtKt.m66577h(spotKycLeadView);
                    }
                    spotKycLeadView.setMessage(C27041f.m66668h(welfareGuideInfo2.getF36584b()));
                    spotKycLeadView.setBtnText(R$string.kyc_goto_verify);
                    spotKycLeadView.setBtnClick(new View.OnClickListener() { // from class: com.kubi.tradefacade.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SpotKycLeadHelper$checkKycLead$3$1.C259521.m63460f(function1, view);
                        }
                    });
                } else if (i11 != 2) {
                    ViewExtKt.m66577h(spotKycLeadView);
                } else {
                    ViewExtKt.m66577h(spotKycLeadView);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m63460f(Function0 function0, View view) {
            String str = (String) function0.invoke();
            InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, C43852m.m96601m(String.valueOf(str), "openOrders", "verifyNowButton"), null, null, 27, null);
            SpotKycLeadHelper.f51852a.m63458f(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotKycLeadHelper$checkKycLead$3$1(Function0<Boolean> function0, SpotKycLeadView spotKycLeadView, Function0<String> function1, Continuation<? super SpotKycLeadHelper$checkKycLead$3$1> continuation) {
        super(2, continuation);
        this.$displayAllowedProvider = function0;
        this.$leadView = spotKycLeadView;
        this.$trackPageProvider = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotKycLeadHelper$checkKycLead$3$1(this.$displayAllowedProvider, this.$leadView, this.$trackPageProvider, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SpotKycLeadHelper$checkKycLead$3$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r10, r3, r9) == r0) goto L15;
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
        C259521 c259521 = new C259521(welfareGuideInfo, this.$displayAllowedProvider, this.$leadView, this.$trackPageProvider, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(welfareGuideInfo);
        this.label = 2;
    }
}
