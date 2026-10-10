package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KumexKLineInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/flutter/proto/kline/CandleItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor$fetchCdnKlineList$2", m90122f = "KumexKLineInteractor.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKumexKLineInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$fetchCdnKlineList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1563#2:191\n1634#2,3:192\n*S KotlinDebug\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$fetchCdnKlineList$2\n*L\n115#1:191\n115#1:192,3\n*E\n"})
public final class KumexKLineInteractor$fetchCdnKlineList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends CandleItem>>, Object> {
    final /* synthetic */ long $begin;
    final /* synthetic */ long $end;
    final /* synthetic */ IKLineDataInteractor.DataParam $param;
    int label;
    final /* synthetic */ KumexKLineInteractor this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends CandleItem>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<CandleItem>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KumexKLineInteractor$fetchCdnKlineList$2(KumexKLineInteractor kumexKLineInteractor, IKLineDataInteractor.DataParam dataParam, long j11, long j12, Continuation<? super KumexKLineInteractor$fetchCdnKlineList$2> continuation) {
        super(2, continuation);
        this.this$0 = kumexKLineInteractor;
        this.$param = dataParam;
        this.$begin = j11;
        this.$end = j12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KumexKLineInteractor$fetchCdnKlineList$2(this.this$0, this.$param, this.$begin, this.$end, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<CandleItem>> continuation) {
        return ((KumexKLineInteractor$fetchCdnKlineList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<String[]> listM24340c = this.this$0.m24335F().m24340c(this.$param.getSymbol(), String.valueOf(this.$param.getType().getPeriod() / 60), this.$begin, this.$end);
            KumexKLineInteractor kumexKLineInteractor = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM24340c, 10));
            Iterator<T> it = listM24340c.iterator();
            while (it.hasNext()) {
                arrayList.add(KLineBaseDataInteractor.m24289A(kumexKLineInteractor, (String[]) it.next(), null, 1, null));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
