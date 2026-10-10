package com.kubi.assets.freeze;

import com.kubi.assets.R$string;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RwaAgreementSignDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.freeze.RwaAgreementSignDialog$initView$3$1", m90122f = "RwaAgreementSignDialog.kt", m90123i = {}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRwaAgreementSignDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RwaAgreementSignDialog.kt\ncom/kubi/assets/freeze/RwaAgreementSignDialog$initView$3$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n25#2:113\n26#2:115\n1#3:114\n*S KotlinDebug\n*F\n+ 1 RwaAgreementSignDialog.kt\ncom/kubi/assets/freeze/RwaAgreementSignDialog$initView$3$1\n*L\n101#1:113\n101#1:115\n101#1:114\n*E\n"})
public final class RwaAgreementSignDialog$initView$3$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $articleId;
    final /* synthetic */ String $version;
    int label;
    final /* synthetic */ RwaAgreementSignDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.freeze.RwaAgreementSignDialog$initView$3$1$1 */
    /* JADX INFO: compiled from: RwaAgreementSignDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.freeze.RwaAgreementSignDialog$initView$3$1$1", m90122f = "RwaAgreementSignDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100431 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RwaAgreementSignDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C100431(RwaAgreementSignDialog rwaAgreementSignDialog, Continuation<? super C100431> continuation) {
            super(2, continuation);
            this.this$0 = rwaAgreementSignDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C100431(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C100431) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ToastCompat.m66441G(this.this$0.getString(R$string.kc_trade_rwa_success), new Object[0]);
                this.this$0.dismissAllowingStateLoss();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RwaAgreementSignDialog$initView$3$1(RwaAgreementSignDialog rwaAgreementSignDialog, String str, String str2, Continuation<? super RwaAgreementSignDialog$initView$3$1> continuation) {
        super(2, continuation);
        this.this$0 = rwaAgreementSignDialog;
        this.$articleId = str;
        this.$version = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RwaAgreementSignDialog$initView$3$1(this.this$0, this.$articleId, this.$version, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RwaAgreementSignDialog$initView$3$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RwaAgreementSignDialog$initView$3$1 rwaAgreementSignDialog$initView$3$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                rwaAgreementSignDialog$initView$3$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eM16913h = this.this$0.m16908s4().m16913h(MapsKt.mapOf(TuplesKt.m90091to("agreementTag", "SPOT-RWA-TRADE-AGREEMENT"), TuplesKt.m90091to("agreementId", this.$articleId), TuplesKt.m90091to("version", this.$version)));
            C100431 c100431 = new C100431(this.this$0, null);
            this.label = 1;
            rwaAgreementSignDialog$initView$3$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM16913h, false, c100431, rwaAgreementSignDialog$initView$3$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        RwaAgreementSignDialog rwaAgreementSignDialog = rwaAgreementSignDialog$initView$3$1.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            ToastCompat.m66441G(rwaAgreementSignDialog.getString(R$string.kc_trade_rwa_fail), new Object[0]);
        }
        return Unit.INSTANCE;
    }
}
