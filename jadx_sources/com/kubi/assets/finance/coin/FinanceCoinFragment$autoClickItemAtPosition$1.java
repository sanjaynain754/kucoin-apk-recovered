package com.kubi.assets.finance.coin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.utils.extensions.C27039d;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p637ta.C44859s1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FinanceCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.coin.FinanceCoinFragment$autoClickItemAtPosition$1", m90122f = "FinanceCoinFragment.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFinanceCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCoinFragment.kt\ncom/kubi/assets/finance/coin/FinanceCoinFragment$autoClickItemAtPosition$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n360#2,7:124\n*S KotlinDebug\n*F\n+ 1 FinanceCoinFragment.kt\ncom/kubi/assets/finance/coin/FinanceCoinFragment$autoClickItemAtPosition$1\n*L\n67#1:124,7\n*E\n"})
public final class FinanceCoinFragment$autoClickItemAtPosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ boolean $isFirstItem;
    int label;
    final /* synthetic */ FinanceCoinFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceCoinFragment$autoClickItemAtPosition$1(boolean z11, FinanceCoinFragment financeCoinFragment, String str, Continuation<? super FinanceCoinFragment$autoClickItemAtPosition$1> continuation) {
        super(2, continuation);
        this.$isFirstItem = z11;
        this.this$0 = financeCoinFragment;
        this.$currency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinanceCoinFragment$autoClickItemAtPosition$1(this.$isFirstItem, this.this$0, this.$currency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FinanceCoinFragment$autoClickItemAtPosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m16789f(FinanceCoinFragment financeCoinFragment, int i11) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        RecyclerView recyclerView;
        C44859s1 c44859s1M16786p3 = financeCoinFragment.m16786p3();
        if (c44859s1M16786p3 != null && (recyclerView = c44859s1M16786p3.f100772f) != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i11);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            view.performClick();
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer numBoxInt;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.Adapter adapter;
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
            if (!this.$isFirstItem) {
                this.label = 1;
                if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        List<FinanceCoinEntity> data = this.this$0.f17425V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        String str = this.$currency;
        Iterator<FinanceCoinEntity> it = data.iterator();
        final int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getInvestCurrency(), str)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            C44859s1 c44859s1M16786p3 = this.this$0.m16786p3();
            if (c44859s1M16786p3 != null && (recyclerView3 = c44859s1M16786p3.f100772f) != null && (adapter = recyclerView3.getAdapter()) != null) {
                numBoxInt = Boxing.boxInt(adapter.getItemCount());
            } else {
                numBoxInt = null;
            }
            if (i12 < C27039d.m66650j(numBoxInt)) {
                C44859s1 c44859s1M16786p4 = this.this$0.m16786p3();
                if (c44859s1M16786p4 != null && (recyclerView2 = c44859s1M16786p4.f100772f) != null) {
                    recyclerView2.scrollToPosition(i12);
                }
                C44859s1 c44859s1M16786p5 = this.this$0.m16786p3();
                if (c44859s1M16786p5 != null && (recyclerView = c44859s1M16786p5.f100772f) != null) {
                    final FinanceCoinFragment financeCoinFragment = this.this$0;
                    Boxing.boxBoolean(recyclerView.postDelayed(new Runnable() { // from class: com.kubi.assets.finance.coin.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            FinanceCoinFragment$autoClickItemAtPosition$1.m16789f(financeCoinFragment, i12);
                        }
                    }, 100L));
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
