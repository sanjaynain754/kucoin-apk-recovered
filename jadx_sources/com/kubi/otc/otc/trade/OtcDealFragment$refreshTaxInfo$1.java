package com.kubi.otc.otc.trade;

import android.text.Editable;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37631i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OtcDealFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.trade.OtcDealFragment$refreshTaxInfo$1", m90122f = "OtcDealFragment.kt", m90123i = {}, m90124l = {411}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OtcDealFragment$refreshTaxInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OtcDealFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcDealFragment$refreshTaxInfo$1(OtcDealFragment otcDealFragment, Continuation<? super OtcDealFragment$refreshTaxInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = otcDealFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtcDealFragment$refreshTaxInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OtcDealFragment$refreshTaxInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolBoxBoolean;
        OtcDealFragment otcDealFragment;
        FilterEmojiEditText filterEmojiEditText;
        Editable text;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String string = null;
        if (i11 != 0) {
            if (i11 == 1) {
                otcDealFragment = (OtcDealFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            OtcInfoEntity otcInfoEntity = this.this$0.f38046W;
            if (otcInfoEntity != null) {
                boolBoxBoolean = Boxing.boxBoolean(otcInfoEntity.isBuy());
            } else {
                boolBoxBoolean = null;
            }
            if (C27025c.m66566d(boolBoxBoolean)) {
                return Unit.INSTANCE;
            }
            OtcDealFragment otcDealFragment2 = this.this$0;
            P2PHelper p2PHelper = P2PHelper.f39683a;
            this.L$0 = otcDealFragment2;
            this.label = 1;
            Object objM48409a = p2PHelper.m48409a(this);
            if (objM48409a == coroutine_suspended) {
                return coroutine_suspended;
            }
            otcDealFragment = otcDealFragment2;
            obj = objM48409a;
        }
        otcDealFragment.f38054e0 = (TaxInfo) obj;
        OtcDealFragment otcDealFragment3 = this.this$0;
        C37631i c37631iM45398I4 = otcDealFragment3.m45398I4();
        if (c37631iM45398I4 != null && (filterEmojiEditText = c37631iM45398I4.f84009g) != null && (text = filterEmojiEditText.getText()) != null) {
            string = text.toString();
        }
        otcDealFragment3.m45412r6(C27041f.m66668h(string));
        return Unit.INSTANCE;
    }
}
