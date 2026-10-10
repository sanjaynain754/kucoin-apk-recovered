package com.kubi.assets.overview.ongoing;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import com.kubi.utils.extensions.C27039d;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p637ta.C44887w1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOnGoingFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingFragment$autoClickItemAtPosition$1", m90122f = "AssetOnGoingFragment.kt", m90123i = {}, m90124l = {427, 429}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetOnGoingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment$autoClickItemAtPosition$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,439:1\n360#2,7:440\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment$autoClickItemAtPosition$1\n*L\n431#1:440,7\n*E\n"})
public final class AssetOnGoingFragment$autoClickItemAtPosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ AssetOnGoingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingFragment$autoClickItemAtPosition$1(AssetOnGoingFragment assetOnGoingFragment, int i11, Continuation<? super AssetOnGoingFragment$autoClickItemAtPosition$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOnGoingFragment;
        this.$type = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetOnGoingFragment$autoClickItemAtPosition$1(this.this$0, this.$type, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOnGoingFragment$autoClickItemAtPosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(3000, r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(1000, r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<ProductItem> data;
        Integer numBoxInt;
        Integer numBoxInt2;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        List<ProductItem> data2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            AssetOnGoingAdapter assetOnGoingAdapter = this.this$0.f18405U;
            if (assetOnGoingAdapter != null && (data = assetOnGoingAdapter.getData()) != null && data.isEmpty()) {
                this.label = 1;
            } else {
                this.label = 2;
            }
        }
        AssetOnGoingAdapter assetOnGoingAdapter2 = this.this$0.f18405U;
        RecyclerView recyclerView2 = null;
        if (assetOnGoingAdapter2 != null && (data2 = assetOnGoingAdapter2.getData()) != null) {
            int i12 = this.$type;
            Iterator<ProductItem> it = data2.iterator();
            int i13 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getF18435a() == i12) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            numBoxInt = Boxing.boxInt(i13);
        } else {
            numBoxInt = null;
        }
        int iM66650j = C27039d.m66650j(numBoxInt);
        if (iM66650j >= 0) {
            C44887w1 c44887w1M18695v3 = this.this$0.m18695v3();
            if (c44887w1M18695v3 != null && (recyclerView = c44887w1M18695v3.f101044g) != null && (adapter = recyclerView.getAdapter()) != null) {
                numBoxInt2 = Boxing.boxInt(adapter.getItemCount());
            } else {
                numBoxInt2 = null;
            }
            if (iM66650j < C27039d.m66650j(numBoxInt2)) {
                C44887w1 c44887w1M18695v4 = this.this$0.m18695v3();
                if (c44887w1M18695v4 != null) {
                    recyclerView2 = c44887w1M18695v4.f101044g;
                }
                AssetExKt.m15134v(recyclerView2, iM66650j);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
