package com.kubi.assets;

import com.kubi.assets.entity.AccountOrderEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.view.tab.AssetTabSortHelper;
import com.kubi.assets.view.tab.C11296e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
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
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetTabSortViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetTabSortViewModel$loadAccountOrders$1", m90122f = "AssetTabSortViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {46, 47, 49}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "orderConfig", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "orderConfig", "assetConfig"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class AssetTabSortViewModel$loadAccountOrders$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Boolean, String, List<AccountSortIndexItem>, Unit> $callback;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AssetTabSortViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.AssetTabSortViewModel$loadAccountOrders$1$1 */
    /* JADX INFO: compiled from: AssetTabSortViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.AssetTabSortViewModel$loadAccountOrders$1$1", m90122f = "AssetTabSortViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetTabSortViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel$loadAccountOrders$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1563#2:178\n1634#2,3:179\n1563#2:182\n1634#2,3:183\n*S KotlinDebug\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel$loadAccountOrders$1$1\n*L\n59#1:178\n59#1:179,3\n71#1:182\n71#1:183,3\n*E\n"})
    public static final class C94461 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetV2OverviewEntity $assetConfig;
        final /* synthetic */ Function3<Boolean, String, List<AccountSortIndexItem>, Unit> $callback;
        final /* synthetic */ AccountOrderEntity $orderConfig;
        int label;
        final /* synthetic */ AssetTabSortViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C94461(AccountOrderEntity accountOrderEntity, AssetV2OverviewEntity assetV2OverviewEntity, Function3<? super Boolean, ? super String, ? super List<AccountSortIndexItem>, Unit> function3, AssetTabSortViewModel assetTabSortViewModel, Continuation<? super C94461> continuation) {
            super(2, continuation);
            this.$orderConfig = accountOrderEntity;
            this.$assetConfig = assetV2OverviewEntity;
            this.$callback = function3;
            this.this$0 = assetTabSortViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C94461(this.$orderConfig, this.$assetConfig, this.$callback, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C94461) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> listEmptyList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$orderConfig != null && this.$assetConfig != null) {
                    this.this$0.f16331Y.setValue(this.$orderConfig.getSortType());
                    AssetTabSortHelper assetTabSortHelper = AssetTabSortHelper.f19161a;
                    assetTabSortHelper.m20075r(this.$orderConfig.getSortType(), this.$orderConfig.getAccountTypeList());
                    List<String> listM20066i = assetTabSortHelper.m20066i();
                    AssetV2OverviewEntity assetV2OverviewEntity = this.$assetConfig;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20066i, 10));
                    for (String str : listM20066i) {
                        arrayList.add(new AccountSortIndexItem(str, C11296e.m20097d(str), C11296e.m20094a(str, assetV2OverviewEntity)));
                    }
                    this.this$0.f16333a0.setValue(arrayList);
                    if (Intrinsics.areEqual(this.this$0.f16331Y.getValue(), "VALUE_DESC")) {
                        this.this$0.m15172A();
                        AssetTabSortHelper assetTabSortHelper2 = AssetTabSortHelper.f19161a;
                        List list = (List) this.this$0.f16333a0.getValue();
                        if (list != null) {
                            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listEmptyList.add(((AccountSortIndexItem) it.next()).getF16605a());
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        assetTabSortHelper2.m20075r("VALUE_DESC", listEmptyList);
                    }
                    this.$callback.invoke(Boxing.boxBoolean(true), this.$orderConfig.getSortType(), arrayList);
                } else {
                    this.$callback.invoke(Boxing.boxBoolean(false), "DEFAULT", CollectionsKt.emptyList());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssetTabSortViewModel$loadAccountOrders$1(Function3<? super Boolean, ? super String, ? super List<AccountSortIndexItem>, Unit> function3, AssetTabSortViewModel assetTabSortViewModel, Continuation<? super AssetTabSortViewModel$loadAccountOrders$1> continuation) {
        super(2, continuation);
        this.$callback = function3;
        this.this$0 = assetTabSortViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetTabSortViewModel$loadAccountOrders$1 assetTabSortViewModel$loadAccountOrders$1 = new AssetTabSortViewModel$loadAccountOrders$1(this.$callback, this.this$0, continuation);
        assetTabSortViewModel$loadAccountOrders$1.L$0 = obj;
        return assetTabSortViewModel$loadAccountOrders$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetTabSortViewModel$loadAccountOrders$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r15, r8, r14) == r0) goto L22;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        AccountOrderEntity accountOrderEntity;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new C9448xe06e4a7d(null), 3, null);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new C9447x4edbdcd9(null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
            this.L$2 = interfaceC41729r0M91102b2;
            this.label = 1;
            Object objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b2;
                obj = objMo91198h;
                interfaceC41729r1 = interfaceC41729r0M91102b;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r1 = interfaceC41729r3;
            interfaceC41729r0 = interfaceC41729r2;
        } else if (i11 == 2) {
            accountOrderEntity = (AccountOrderEntity) this.L$3;
            interfaceC41729r0 = (InterfaceC41729r0) this.L$2;
            interfaceC41729r1 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            AccountOrderEntity accountOrderEntity2 = accountOrderEntity;
            AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) obj;
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            C94461 c94461 = new C94461(accountOrderEntity2, assetV2OverviewEntity, this.$callback, this.this$0, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
            this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
            this.label = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        accountOrderEntity = (AccountOrderEntity) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$3 = accountOrderEntity;
        this.label = 2;
        obj = interfaceC41729r0.mo91198h(this);
        if (obj != coroutine_suspended) {
            AccountOrderEntity accountOrderEntity3 = accountOrderEntity;
            AssetV2OverviewEntity assetV2OverviewEntity2 = (AssetV2OverviewEntity) obj;
            AbstractC41586e2 abstractC41586e2M91393c2 = C41782z0.m91393c();
            C94461 c94462 = new C94461(accountOrderEntity3, assetV2OverviewEntity2, this.$callback, this.this$0, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity3);
            this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
