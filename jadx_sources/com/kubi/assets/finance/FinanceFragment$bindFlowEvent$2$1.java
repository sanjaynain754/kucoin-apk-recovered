package com.kubi.assets.finance;

import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.finance.coin.FinanceCoinFragment;
import com.kubi.resources.widget.CustomViewPager;
import java.util.ArrayList;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p637ta.C44844q0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceFragment$bindFlowEvent$2$1", m90122f = "FinanceFragment.kt", m90123i = {}, m90124l = {152}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FinanceFragment$bindFlowEvent$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ FinanceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceFragment$bindFlowEvent$2$1(FinanceFragment financeFragment, String str, Continuation<? super FinanceFragment$bindFlowEvent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = financeFragment;
        this.$it = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinanceFragment$bindFlowEvent$2$1(this.this$0, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FinanceFragment$bindFlowEvent$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppBarLayout appBarLayout;
        CustomViewPager customViewPager;
        FinanceCoinFragment financeCoinFragmentM16635s3;
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
            C44844q0 c44844q0M16679u3 = this.this$0.m16679u3();
            if (c44844q0M16679u3 != null && (customViewPager = c44844q0M16679u3.f100660g) != null) {
                customViewPager.setCurrentItem(0);
            }
            C44844q0 c44844q0M16679u4 = this.this$0.m16679u3();
            if (c44844q0M16679u4 != null && (appBarLayout = c44844q0M16679u4.f100655b) != null) {
                appBarLayout.setExpanded(false, true);
            }
            this.label = 1;
            if (DelayKt.m90350b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ArrayList arrayList = this.this$0.f17385V;
        FinanceCommonFragment financeCommonFragment = null;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        Object orNull = CollectionsKt.getOrNull(arrayList, 0);
        if (orNull instanceof FinanceCommonFragment) {
            financeCommonFragment = (FinanceCommonFragment) orNull;
        }
        if (financeCommonFragment != null && (financeCoinFragmentM16635s3 = financeCommonFragment.m16635s3()) != null) {
            financeCoinFragmentM16635s3.m16785o3(this.$it, false);
        }
        return Unit.INSTANCE;
    }
}
