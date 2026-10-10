package com.kubi.assets.main.detail;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import o00.C42911a;
import p637ta.C44828n5;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.main.detail.MainAccountDetailFragment$initAsnycAssetsHeaderItems$1", m90122f = "MainAccountDetailFragment.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {324, 325, 327}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "deferredGetConvertItem", "deferredGetB2cItem", "$this$launch", "deferredGetConvertItem", "deferredGetB2cItem", "convertItem", "$this$launch", "deferredGetConvertItem", "deferredGetB2cItem", "convertItem", "b2cItem"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class MainAccountDetailFragment$initAsnycAssetsHeaderItems$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MainAccountDetailFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.main.detail.MainAccountDetailFragment$initAsnycAssetsHeaderItems$1$1 */
    /* JADX INFO: compiled from: MainAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.detail.MainAccountDetailFragment$initAsnycAssetsHeaderItems$1$1", m90122f = "MainAccountDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103251 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseAccountDetailFragment.AssetHeaderFunction $b2cItem;
        final /* synthetic */ BaseAccountDetailFragment.AssetHeaderFunction $convertItem;
        int label;
        final /* synthetic */ MainAccountDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103251(MainAccountDetailFragment mainAccountDetailFragment, BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction, BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction2, Continuation<? super C103251> continuation) {
            super(2, continuation);
            this.this$0 = mainAccountDetailFragment;
            this.$convertItem = assetHeaderFunction;
            this.$b2cItem = assetHeaderFunction2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C103251(this.this$0, this.$convertItem, this.$b2cItem, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C103251) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView.Adapter adapter;
            BaseQuickAdapter baseQuickAdapter;
            RecyclerView recyclerView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C44828n5 c44828n5M17767g4 = this.this$0.m17767g4();
                List listEmptyList = null;
                if (c44828n5M17767g4 != null && (recyclerView = c44828n5M17767g4.f100520j) != null) {
                    adapter = recyclerView.getAdapter();
                } else {
                    adapter = null;
                }
                if (adapter instanceof BaseQuickAdapter) {
                    baseQuickAdapter = (BaseQuickAdapter) adapter;
                } else {
                    baseQuickAdapter = null;
                }
                if (baseQuickAdapter != null) {
                    listEmptyList = baseQuickAdapter.getData();
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<BaseAccountDetailFragment.AssetHeaderFunction> mutableList = CollectionsKt.toMutableList((Collection) listEmptyList);
                BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction = this.$convertItem;
                if (assetHeaderFunction != null) {
                    Boxing.boxBoolean(mutableList.add(assetHeaderFunction));
                }
                BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction2 = this.$b2cItem;
                if (assetHeaderFunction2 != null) {
                    Boxing.boxBoolean(mutableList.add(assetHeaderFunction2));
                }
                this.this$0.m15902B4(mutableList);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAccountDetailFragment$initAsnycAssetsHeaderItems$1(MainAccountDetailFragment mainAccountDetailFragment, Continuation<? super MainAccountDetailFragment$initAsnycAssetsHeaderItems$1> continuation) {
        super(2, continuation);
        this.this$0 = mainAccountDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainAccountDetailFragment$initAsnycAssetsHeaderItems$1 mainAccountDetailFragment$initAsnycAssetsHeaderItems$1 = new MainAccountDetailFragment$initAsnycAssetsHeaderItems$1(this.this$0, continuation);
        mainAccountDetailFragment$initAsnycAssetsHeaderItems$1.L$0 = obj;
        return mainAccountDetailFragment$initAsnycAssetsHeaderItems$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MainAccountDetailFragment$initAsnycAssetsHeaderItems$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r5, r6, r11) == r0) goto L22;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new C10327xadb014a(this.this$0, null), 3, null);
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new C10326x4770656a(this.this$0, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.L$2 = interfaceC41729r0M91102b;
            this.label = 1;
            Object objMo91198h = interfaceC41729r0M91102b2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b2;
                obj = objMo91198h;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0 = interfaceC41729r2;
        } else if (i11 == 2) {
            assetHeaderFunction = (BaseAccountDetailFragment.AssetHeaderFunction) this.L$3;
            interfaceC41729r1 = (InterfaceC41729r0) this.L$2;
            interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction2 = (BaseAccountDetailFragment.AssetHeaderFunction) obj;
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C103251 c103251 = new C103251(this.this$0, assetHeaderFunction, assetHeaderFunction2, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$3 = SpillingKt.nullOutSpilledVariable(assetHeaderFunction);
            this.L$4 = SpillingKt.nullOutSpilledVariable(assetHeaderFunction2);
            this.label = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        interfaceC41729r1 = interfaceC41729r0M91102b;
        assetHeaderFunction = (BaseAccountDetailFragment.AssetHeaderFunction) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
        this.L$3 = assetHeaderFunction;
        this.label = 2;
        obj = interfaceC41729r1.mo91198h(this);
        if (obj != coroutine_suspended) {
            BaseAccountDetailFragment.AssetHeaderFunction assetHeaderFunction3 = (BaseAccountDetailFragment.AssetHeaderFunction) obj;
            AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
            C103251 c103252 = new C103251(this.this$0, assetHeaderFunction, assetHeaderFunction3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$3 = SpillingKt.nullOutSpilledVariable(assetHeaderFunction);
            this.L$4 = SpillingKt.nullOutSpilledVariable(assetHeaderFunction3);
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
