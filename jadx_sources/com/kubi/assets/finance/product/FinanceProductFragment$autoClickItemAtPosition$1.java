package com.kubi.assets.finance.product;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.entity.FinanceProductEntity;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FinanceProductFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductFragment$autoClickItemAtPosition$1", m90122f = "FinanceProductFragment.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFinanceProductFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceProductFragment.kt\ncom/kubi/assets/finance/product/FinanceProductFragment$autoClickItemAtPosition$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n360#2,7:131\n*S KotlinDebug\n*F\n+ 1 FinanceProductFragment.kt\ncom/kubi/assets/finance/product/FinanceProductFragment$autoClickItemAtPosition$1\n*L\n118#1:131,7\n*E\n"})
public final class FinanceProductFragment$autoClickItemAtPosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ FinanceProductFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceProductFragment$autoClickItemAtPosition$1(FinanceProductFragment financeProductFragment, String str, Continuation<? super FinanceProductFragment$autoClickItemAtPosition$1> continuation) {
        super(2, continuation);
        this.this$0 = financeProductFragment;
        this.$type = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinanceProductFragment$autoClickItemAtPosition$1(this.this$0, this.$type, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FinanceProductFragment$autoClickItemAtPosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m16821f(FinanceProductFragment financeProductFragment, int i11) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        RecyclerView recyclerView;
        C44859s1 c44859s1M16818q3 = financeProductFragment.m16818q3();
        if (c44859s1M16818q3 != null && (recyclerView = c44859s1M16818q3.f100772f) != null) {
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
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<FinanceProductEntity> data = this.this$0.f17466V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        String str = this.$type;
        Iterator<FinanceProductEntity> it = data.iterator();
        final int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (StringsKt.equals(it.next().getCategoryGroup(), str, true)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            C44859s1 c44859s1M16818q3 = this.this$0.m16818q3();
            if (c44859s1M16818q3 != null && (recyclerView3 = c44859s1M16818q3.f100772f) != null && (adapter = recyclerView3.getAdapter()) != null) {
                numBoxInt = Boxing.boxInt(adapter.getItemCount());
            } else {
                numBoxInt = null;
            }
            if (i12 < C27039d.m66650j(numBoxInt)) {
                C44859s1 c44859s1M16818q4 = this.this$0.m16818q3();
                if (c44859s1M16818q4 != null && (recyclerView2 = c44859s1M16818q4.f100772f) != null) {
                    recyclerView2.scrollToPosition(i12);
                }
                C44859s1 c44859s1M16818q5 = this.this$0.m16818q3();
                if (c44859s1M16818q5 != null && (recyclerView = c44859s1M16818q5.f100772f) != null) {
                    final FinanceProductFragment financeProductFragment = this.this$0;
                    Boxing.boxBoolean(recyclerView.postDelayed(new Runnable() { // from class: com.kubi.assets.finance.product.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            FinanceProductFragment$autoClickItemAtPosition$1.m16821f(financeProductFragment, i12);
                        }
                    }, 100L));
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
