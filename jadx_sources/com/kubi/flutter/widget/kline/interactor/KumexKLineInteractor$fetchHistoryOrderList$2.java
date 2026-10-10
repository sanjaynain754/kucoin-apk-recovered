package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KlineOrderEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KumexKLineInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor$fetchHistoryOrderList$2", m90122f = "KumexKLineInteractor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKumexKLineInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$fetchHistoryOrderList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1056#2:191\n1563#2:192\n1634#2,3:193\n*S KotlinDebug\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$fetchHistoryOrderList$2\n*L\n142#1:191\n143#1:192\n143#1:193,3\n*E\n"})
public final class KumexKLineInteractor$fetchHistoryOrderList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends OrderItem>>, Object> {
    final /* synthetic */ long $begin;
    final /* synthetic */ IKLineDataInteractor.OrderParam $param;
    int label;
    final /* synthetic */ KumexKLineInteractor this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor$fetchHistoryOrderList$2$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$fetchHistoryOrderList$2\n*L\n1#1,328:1\n142#2:329\n*E\n"})
    public static final class C12780a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((KlineOrderEntity) t11).getDate(), ((KlineOrderEntity) t12).getDate());
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends OrderItem>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<OrderItem>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KumexKLineInteractor$fetchHistoryOrderList$2(IKLineDataInteractor.OrderParam orderParam, KumexKLineInteractor kumexKLineInteractor, long j11, Continuation<? super KumexKLineInteractor$fetchHistoryOrderList$2> continuation) {
        super(2, continuation);
        this.$param = orderParam;
        this.this$0 = kumexKLineInteractor;
        this.$begin = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KumexKLineInteractor$fetchHistoryOrderList$2(this.$param, this.this$0, this.$begin, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<OrderItem>> continuation) {
        return ((KumexKLineInteractor$fetchHistoryOrderList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listSortedWith;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$param.getShowHistory() && this.$param.getEnableHistory() && !Intrinsics.areEqual(this.$param.getType(), KLineType.f22375e.getONE_MINUTE())) {
                List<KlineOrderEntity> listM24341d = this.this$0.m24335F().m24341d(this.$param.getSymbol(), this.$param.getType().getType(), this.$begin);
                if (listM24341d != null && (listSortedWith = CollectionsKt.sortedWith(listM24341d, new C12780a())) != null) {
                    KumexKLineInteractor kumexKLineInteractor = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                    Iterator it = listSortedWith.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kumexKLineInteractor.m24337J((KlineOrderEntity) it.next(), OrderItem.BizType.BIZ_FUTURES));
                    }
                    return arrayList;
                }
                return CollectionsKt.emptyList();
            }
            return CollectionsKt.emptyList();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
