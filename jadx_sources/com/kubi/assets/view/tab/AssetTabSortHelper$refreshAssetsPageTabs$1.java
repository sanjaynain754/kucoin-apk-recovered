package com.kubi.assets.view.tab;

import com.kubi.assets.AccountSortIndexItem;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.entity.AccountOrderEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.sort.AccountTabSortData;
import com.kubi.assets.sort.AccountTabSortManager;
import com.kubi.assets.sort.C10997l;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import lb.C42153h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1", m90122f = "AssetTabSortHelper.kt", m90123i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7}, m90124l = {250, 259, 271, 272, 275, 286, 292, 308}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "deferredAccountAssetsRequest", "$this$launch", "deferredAccountAssetsRequest", "assetBalances", "it", "accountList", "$i$a$-let-AssetTabSortHelper$refreshAssetsPageTabs$1$1", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "sortConfig", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "sortConfig", "assetBalances", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "sortConfig", "assetBalances", "sortType", "sortList", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "sortConfig", "assetBalances", "sortType", "sortList", "$this$launch", "deferredAccountOrderConfig", "deferredAccountAssetsRequest", "sortConfig", "assetBalances", "sortType", "sortList", "assetBalances"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
@SourceDebugExtension({"SMAP\nAssetTabSortHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTabSortHelper.kt\ncom/kubi/assets/view/tab/AssetTabSortHelper$refreshAssetsPageTabs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,518:1\n1563#2:519\n1634#2,3:520\n23#3,2:523\n*S KotlinDebug\n*F\n+ 1 AssetTabSortHelper.kt\ncom/kubi/assets/view/tab/AssetTabSortHelper$refreshAssetsPageTabs$1\n*L\n295#1:519\n295#1:520,3\n303#1:523,2\n*E\n"})
public final class AssetTabSortHelper$refreshAssetsPageTabs$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$2 */
    /* JADX INFO: compiled from: AssetTabSortHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$2", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C112822 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C112822(Continuation<? super C112822> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112822(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C112822) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TabManager tabManager = (TabManager) AssetTabSortHelper.f19163c.get();
                if (tabManager != null) {
                    tabManager.m20090i(AssetTabSortHelper.f19161a.m20072o());
                    return Unit.INSTANCE;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$3 */
    /* JADX INFO: compiled from: AssetTabSortHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$3", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C112833 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C112833(Continuation<? super C112833> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112833(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C112833) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TabManager tabManager = (TabManager) AssetTabSortHelper.f19163c.get();
                if (tabManager != null) {
                    tabManager.m20090i(AssetTabSortHelper.f19161a.m20072o());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$5 */
    /* JADX INFO: compiled from: AssetTabSortHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$5", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C112845 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C112845(Continuation<? super C112845> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112845(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C112845) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TabManager tabManager = (TabManager) AssetTabSortHelper.f19163c.get();
                if (tabManager != null) {
                    tabManager.m20090i(AssetTabSortHelper.f19161a.m20072o());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AssetTabSortHelper$refreshAssetsPageTabs$1(Continuation<? super AssetTabSortHelper$refreshAssetsPageTabs$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetTabSortHelper$refreshAssetsPageTabs$1 assetTabSortHelper$refreshAssetsPageTabs$1 = new AssetTabSortHelper$refreshAssetsPageTabs$1(continuation);
        assetTabSortHelper$refreshAssetsPageTabs$1.L$0 = obj;
        return assetTabSortHelper$refreshAssetsPageTabs$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetTabSortHelper$refreshAssetsPageTabs$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0169  */
    /* JADX WARN: Code duplicated, block: B:34:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f3 A[LOOP:0: B:52:0x01ed->B:54:0x01f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0289  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ca  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r5, r7, r25) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0273, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r8, r11, r25) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c4, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r8, r10, r25) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0300, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r4, r25) == r1) goto L72;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0M91102b2;
        Object objMo91198h;
        InterfaceC41729r0 interfaceC41729r0M91102b3;
        Object objMo91198h2;
        AssetV2OverviewEntity assetV2OverviewEntity;
        AccountTabSortManager accountTabSortManager;
        AccountOrderEntity accountOrderEntity;
        Object objMo91198h3;
        InterfaceC41729r0 interfaceC41729r0;
        AccountOrderEntity accountOrderEntity2;
        AssetV2OverviewEntity assetV2OverviewEntity2;
        String sortType;
        List<String> accountTypeList;
        Object objMo91198h4;
        AssetV2OverviewEntity assetV2OverviewEntity3;
        ArrayList arrayList;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!C10997l.m19368a()) {
                    interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new C11287x660a5ae(null), 3, null);
                    interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new C11286xc1a42fcb(null), 3, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                    this.L$2 = interfaceC41729r0M91102b2;
                    this.label = 3;
                    objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
                    if (objMo91198h != coroutine_suspended) {
                        accountOrderEntity = (AccountOrderEntity) objMo91198h;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                        this.L$2 = interfaceC41729r0M91102b2;
                        this.L$3 = accountOrderEntity;
                        this.label = 4;
                        objMo91198h3 = interfaceC41729r0M91102b2.mo91198h(this);
                        if (objMo91198h3 != coroutine_suspended) {
                            interfaceC41729r0 = interfaceC41729r0M91102b2;
                            accountOrderEntity2 = accountOrderEntity;
                            assetV2OverviewEntity2 = (AssetV2OverviewEntity) objMo91198h3;
                            if (accountOrderEntity2 != null && assetV2OverviewEntity2 != null) {
                                sortType = accountOrderEntity2.getSortType();
                                accountTypeList = accountOrderEntity2.getAccountTypeList();
                                AssetTabSortHelper.f19161a.m20075r(sortType, accountTypeList);
                                int iHashCode = sortType.hashCode();
                                if (iHashCode == -2032180703) {
                                    if (sortType.equals("DEFAULT")) {
                                        AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
                                        C112833 c112833 = new C112833(null);
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                                        this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                                        this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                                        this.L$5 = SpillingKt.nullOutSpilledVariable(sortType);
                                        this.L$6 = SpillingKt.nullOutSpilledVariable(accountTypeList);
                                        this.label = 6;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (iHashCode == -2028086330) {
                                    if (sortType.equals("MANUAL")) {
                                        AbstractC41586e2 abstractC41586e2M91393c2 = C41782z0.m91393c();
                                        C112833 c112834 = new C112833(null);
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                                        this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                                        this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                                        this.L$5 = SpillingKt.nullOutSpilledVariable(sortType);
                                        this.L$6 = SpillingKt.nullOutSpilledVariable(accountTypeList);
                                        this.label = 6;
                                    }
                                    break;
                                } else {
                                    if (iHashCode == -1737473857 && sortType.equals("VALUE_DESC")) {
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                                        this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                                        this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                                        this.L$5 = SpillingKt.nullOutSpilledVariable(sortType);
                                        this.L$6 = SpillingKt.nullOutSpilledVariable(accountTypeList);
                                        this.label = 7;
                                        objMo91198h4 = interfaceC41729r0.mo91198h(this);
                                        if (objMo91198h4 != coroutine_suspended) {
                                            assetV2OverviewEntity3 = (AssetV2OverviewEntity) objMo91198h4;
                                            if (assetV2OverviewEntity3 != null) {
                                                List<String> listM20069l = AssetTabSortHelper.f19161a.m20069l();
                                                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20069l, 10));
                                                for (String str : listM20069l) {
                                                    arrayList.add(new AccountSortIndexItem(str, C11296e.m20097d(str), C11296e.m20094a(str, assetV2OverviewEntity3)));
                                                }
                                                C46392a.m102333p(C42153h.f93593a.m92515e(), CollectionsKt.joinToString$default(AssetTabSortHelper.f19161a.m20076s(arrayList), ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.view.tab.d
                                                    @Override // p852kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return AssetTabSortHelper$refreshAssetsPageTabs$1.m20079f((AccountSortIndexItem) obj2);
                                                    }
                                                }, 30, null));
                                            }
                                            AbstractC41586e2 abstractC41586e2M91393c3 = C41782z0.m91393c();
                                            C112845 c112845 = new C112845(null);
                                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                                            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                                            this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                                            this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                                            this.L$5 = SpillingKt.nullOutSpilledVariable(sortType);
                                            this.L$6 = SpillingKt.nullOutSpilledVariable(accountTypeList);
                                            this.L$7 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity3);
                                            this.label = 8;
                                        }
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            AssetsLog.Common.m15234e("refreshAssetsPageTabs失败，使用本地配置");
                            AbstractC41586e2 abstractC41586e2M91393c4 = C41782z0.m91393c();
                            C112822 c112822 = new C112822(null);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                            this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                            this.label = 5;
                        }
                    }
                    break;
                } else {
                    interfaceC41729r0M91102b3 = C41696j.m91102b(interfaceC41709m0, null, null, new C11285xc1a42fca(null), 3, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b3);
                    this.label = 1;
                    objMo91198h2 = interfaceC41729r0M91102b3.mo91198h(this);
                    if (objMo91198h2 != coroutine_suspended) {
                        assetV2OverviewEntity = (AssetV2OverviewEntity) objMo91198h2;
                        accountTabSortManager = AccountTabSortManager.f18789a;
                        accountTabSortManager.m19365h();
                        if (assetV2OverviewEntity != null) {
                            List<AccountTabSortData> listM19358a = accountTabSortManager.m19358a(assetV2OverviewEntity);
                            accountTabSortManager.m19366i(listM19358a);
                            AbstractC41586e2 abstractC41586e2M91393c5 = C41782z0.m91393c();
                            AssetTabSortHelper$refreshAssetsPageTabs$1$1$1 assetTabSortHelper$refreshAssetsPageTabs$1$1$1 = new AssetTabSortHelper$refreshAssetsPageTabs$1$1$1(assetV2OverviewEntity, null);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b3);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
                            this.L$4 = SpillingKt.nullOutSpilledVariable(listM19358a);
                            this.I$0 = 0;
                            this.label = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 1:
                interfaceC41729r0M91102b3 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                objMo91198h2 = obj;
                assetV2OverviewEntity = (AssetV2OverviewEntity) objMo91198h2;
                accountTabSortManager = AccountTabSortManager.f18789a;
                accountTabSortManager.m19365h();
                if (assetV2OverviewEntity != null) {
                    List<AccountTabSortData> listM19358a2 = accountTabSortManager.m19358a(assetV2OverviewEntity);
                    accountTabSortManager.m19366i(listM19358a2);
                    AbstractC41586e2 abstractC41586e2M91393c6 = C41782z0.m91393c();
                    AssetTabSortHelper$refreshAssetsPageTabs$1$1$1 assetTabSortHelper$refreshAssetsPageTabs$1$1$2 = new AssetTabSortHelper$refreshAssetsPageTabs$1$1$1(assetV2OverviewEntity, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b3);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(listM19358a2);
                    this.I$0 = 0;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                interfaceC41729r0M91102b2 = (InterfaceC41729r0) this.L$2;
                InterfaceC41729r0 interfaceC41729r1 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                interfaceC41729r0M91102b = interfaceC41729r1;
                objMo91198h = obj;
                accountOrderEntity = (AccountOrderEntity) objMo91198h;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                this.L$2 = interfaceC41729r0M91102b2;
                this.L$3 = accountOrderEntity;
                this.label = 4;
                objMo91198h3 = interfaceC41729r0M91102b2.mo91198h(this);
                if (objMo91198h3 != coroutine_suspended) {
                    interfaceC41729r0 = interfaceC41729r0M91102b2;
                    accountOrderEntity2 = accountOrderEntity;
                    assetV2OverviewEntity2 = (AssetV2OverviewEntity) objMo91198h3;
                    if (accountOrderEntity2 != null) {
                        AssetsLog.Common.m15234e("refreshAssetsPageTabs失败，使用本地配置");
                        AbstractC41586e2 abstractC41586e2M91393c7 = C41782z0.m91393c();
                        C112822 c112823 = new C112822(null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                        this.label = 5;
                    } else {
                        AssetsLog.Common.m15234e("refreshAssetsPageTabs失败，使用本地配置");
                        AbstractC41586e2 abstractC41586e2M91393c8 = C41782z0.m91393c();
                        C112822 c112824 = new C112822(null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                        this.label = 5;
                    }
                    break;
                }
                return coroutine_suspended;
            case 4:
                AccountOrderEntity accountOrderEntity3 = (AccountOrderEntity) this.L$3;
                InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$2;
                InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                accountOrderEntity2 = accountOrderEntity3;
                interfaceC41729r0 = interfaceC41729r2;
                interfaceC41729r0M91102b = interfaceC41729r3;
                objMo91198h3 = obj;
                assetV2OverviewEntity2 = (AssetV2OverviewEntity) objMo91198h3;
                if (accountOrderEntity2 != null) {
                    AssetsLog.Common.m15234e("refreshAssetsPageTabs失败，使用本地配置");
                    AbstractC41586e2 abstractC41586e2M91393c9 = C41782z0.m91393c();
                    C112822 c112825 = new C112822(null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                    this.label = 5;
                    break;
                } else {
                    AssetsLog.Common.m15234e("refreshAssetsPageTabs失败，使用本地配置");
                    AbstractC41586e2 abstractC41586e2M91393c10 = C41782z0.m91393c();
                    C112822 c112826 = new C112822(null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                    this.label = 5;
                    break;
                }
                return coroutine_suspended;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                accountTypeList = (List) this.L$6;
                sortType = (String) this.L$5;
                assetV2OverviewEntity2 = (AssetV2OverviewEntity) this.L$4;
                accountOrderEntity2 = (AccountOrderEntity) this.L$3;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$2;
                interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                objMo91198h4 = obj;
                assetV2OverviewEntity3 = (AssetV2OverviewEntity) objMo91198h4;
                if (assetV2OverviewEntity3 != null) {
                    List<String> listM20069l2 = AssetTabSortHelper.f19161a.m20069l();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20069l2, 10));
                    while (r11.hasNext()) {
                        arrayList.add(new AccountSortIndexItem(str, C11296e.m20097d(str), C11296e.m20094a(str, assetV2OverviewEntity3)));
                    }
                    C46392a.m102333p(C42153h.f93593a.m92515e(), CollectionsKt.joinToString$default(AssetTabSortHelper.f19161a.m20076s(arrayList), ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.view.tab.d
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AssetTabSortHelper$refreshAssetsPageTabs$1.m20079f((AccountSortIndexItem) obj2);
                        }
                    }, 30, null));
                }
                AbstractC41586e2 abstractC41586e2M91393c11 = C41782z0.m91393c();
                C112845 c112846 = new C112845(null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(accountOrderEntity2);
                this.L$4 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity2);
                this.L$5 = SpillingKt.nullOutSpilledVariable(sortType);
                this.L$6 = SpillingKt.nullOutSpilledVariable(accountTypeList);
                this.L$7 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity3);
                this.label = 8;
                break;
            case 8:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m20079f(AccountSortIndexItem accountSortIndexItem) {
        return accountSortIndexItem.getF16605a();
    }
}
