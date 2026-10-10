package com.kubi.payment.p2p.trade;

import android.content.Context;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.otc.trade.OtcDealFragment;
import com.kubi.payment.fast.common.helper.TradeLimitHelper;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PTradeMarketListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.trade.P2PTradeMarketListFragment$observeData$3$2$1", m90122f = "P2PTradeMarketListFragment.kt", m90123i = {}, m90124l = {845}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PTradeMarketListFragment$observeData$3$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ OtcInfoEntity $it;
    final /* synthetic */ OtcInfoEntity $this_apply;
    int label;
    final /* synthetic */ P2PTradeMarketListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PTradeMarketListFragment$observeData$3$2$1(P2PTradeMarketListFragment p2PTradeMarketListFragment, OtcInfoEntity otcInfoEntity, OtcInfoEntity otcInfoEntity2, Continuation<? super P2PTradeMarketListFragment$observeData$3$2$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PTradeMarketListFragment;
        this.$this_apply = otcInfoEntity;
        this.$it = otcInfoEntity2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PTradeMarketListFragment$observeData$3$2$1(this.this$0, this.$this_apply, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PTradeMarketListFragment$observeData$3$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String plainString;
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
            TradeLimitHelper tradeLimitHelperM49267b5 = this.this$0.m49267b5();
            String strM66668h = C27041f.m66668h(this.$this_apply.getLegal());
            this.label = 1;
            obj = tradeLimitHelperM49267b5.m46374d(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            P2PTradeMarketListFragment p2PTradeMarketListFragment = this.this$0;
            OtcInfoEntity otcInfoEntity = this.$it;
            Intrinsics.checkNotNull(otcInfoEntity);
            p2PTradeMarketListFragment.m49255L5(otcInfoEntity);
        } else if (this.this$0.m49268c5()) {
            this.this$0.m49278q5(this.$it.getId(), this.$it.isBuy(), C27041f.m66668h(this.$it.getCurrency()));
        } else {
            OtcDealFragment.Companion companion = OtcDealFragment.f38042f0;
            Context context = ((OldBaseFragment) this.this$0).mContext;
            Intrinsics.checkNotNullExpressionValue(context, "access$getMContext$p$s-1797388960(...)");
            OtcInfoEntity otcInfoEntity2 = this.$it;
            Intrinsics.checkNotNull(otcInfoEntity2);
            BigDecimal floatPrice = this.$this_apply.getFloatPrice();
            String strM96601m = null;
            if (floatPrice != null) {
                plainString = floatPrice.toPlainString();
            } else {
                plainString = null;
            }
            if (this.$this_apply.isBuy()) {
                strM96601m = C43852m.m96601m("B7P2P", "buy", "buyButton");
            }
            companion.startFragment(context, otcInfoEntity2, plainString, strM96601m);
        }
        return Unit.INSTANCE;
    }
}
