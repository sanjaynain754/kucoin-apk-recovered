package com.kubi.tradingbotkit.business.coupons;

import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridCouponsActivity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$changeViewSelect$1", m90122f = "GridCouponsActivity.kt", m90123i = {}, m90124l = {105}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class GridCouponsActivity$changeViewSelect$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AllCouponsItemModel $data;
    int label;
    final /* synthetic */ GridCouponsActivity this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$changeViewSelect$1$1 */
    /* JADX INFO: compiled from: GridCouponsActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$changeViewSelect$1$1", m90122f = "GridCouponsActivity.kt", m90123i = {0, 0, 0}, m90124l = {104}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "value", "coverList"}, m90127s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nGridCouponsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridCouponsActivity.kt\ncom/kubi/tradingbotkit/business/coupons/GridCouponsActivity$changeViewSelect$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1563#2:247\n1634#2,3:248\n*S KotlinDebug\n*F\n+ 1 GridCouponsActivity.kt\ncom/kubi/tradingbotkit/business/coupons/GridCouponsActivity$changeViewSelect$1$1\n*L\n95#1:247\n95#1:248,3\n*E\n"})
    public static final class C261011 extends SuspendLambda implements Function2<InterfaceC41635f<? super List<? extends AllCouponsItemModel>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AllCouponsItemModel $data;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ GridCouponsActivity this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super List<? extends AllCouponsItemModel>> interfaceC41635f, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC41635f<? super List<AllCouponsItemModel>>) interfaceC41635f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261011(GridCouponsActivity gridCouponsActivity, AllCouponsItemModel allCouponsItemModel, Continuation<? super C261011> continuation) {
            super(2, continuation);
            this.this$0 = gridCouponsActivity;
            this.$data = allCouponsItemModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C261011 c261011 = new C261011(this.this$0, this.$data, continuation);
            c261011.L$0 = obj;
            return c261011;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41635f<? super List<AllCouponsItemModel>> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C261011) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                CouponsSelectUIState<List<AllCouponsItemModel>> value = this.this$0.m63898q0().m63936A().getValue();
                List<AllCouponsItemModel> listM66560c = C27024b.m66560c(value != null ? value.m63916d() : null);
                AllCouponsItemModel allCouponsItemModel = this.$data;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
                for (AllCouponsItemModel allCouponsItemModel2 : listM66560c) {
                    if (Intrinsics.areEqual(allCouponsItemModel2.getCouponsId(), allCouponsItemModel.getCouponsId())) {
                        allCouponsItemModel2.setChecked(allCouponsItemModel.getIsChecked());
                    } else {
                        allCouponsItemModel2.setChecked(false);
                    }
                    arrayList.add(allCouponsItemModel2);
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                this.L$1 = SpillingKt.nullOutSpilledVariable(value);
                this.L$2 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.label = 1;
                if (interfaceC41635f.emit(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$changeViewSelect$1$a */
    /* JADX INFO: compiled from: GridCouponsActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26102a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridCouponsActivity f52301b;

        public C26102a(GridCouponsActivity gridCouponsActivity) {
            this.f52301b = gridCouponsActivity;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<AllCouponsItemModel> list, Continuation<? super Unit> continuation) {
            CouponsSelectUIState couponsSelectUIState = new CouponsSelectUIState();
            couponsSelectUIState.m63920h(list);
            t0.d(this.f52301b.m63898q0().m63936A(), couponsSelectUIState);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridCouponsActivity$changeViewSelect$1(GridCouponsActivity gridCouponsActivity, AllCouponsItemModel allCouponsItemModel, Continuation<? super GridCouponsActivity$changeViewSelect$1> continuation) {
        super(2, continuation);
        this.this$0 = gridCouponsActivity;
        this.$data = allCouponsItemModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridCouponsActivity$changeViewSelect$1(this.this$0, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GridCouponsActivity$changeViewSelect$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C261011(this.this$0, this.$data, null)), C42911a.m94119a());
            C26102a c26102a = new C26102a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM90890N.collect(c26102a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
