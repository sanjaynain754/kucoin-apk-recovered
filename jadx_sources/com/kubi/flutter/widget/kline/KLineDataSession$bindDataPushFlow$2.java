package com.kubi.flutter.widget.kline;

import com.google.protobuf.kotlin.DslList;
import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.CandleListKt$Dsl;
import com.kubi.flutter.widget.kline.utils.KLineReport;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KLineDataSession.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/flutter/proto/kline/CandleList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineDataSession$bindDataPushFlow$2", m90122f = "KLineDataSession.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {176, 187}, m90125m = "invokeSuspend", m90126n = {"it", "deferred", "it", "deferred", "candleList"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$bindDataPushFlow$2\n+ 2 CandleListKt.kt\ncom/kubi/flutter/proto/kline/CandleListKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n*L\n1#1,322:1\n8#2:323\n1#3:324\n9#4:325\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$bindDataPushFlow$2\n*L\n178#1:323\n178#1:324\n195#1:325\n*E\n"})
public final class KLineDataSession$bindDataPushFlow$2 extends SuspendLambda implements Function2<CandleList, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicReference<InterfaceC41729r0<CandleList>> $deferredRef;
    final /* synthetic */ String $from;
    final /* synthetic */ long $startTime;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KLineDataSession this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(CandleList candleList, Continuation<? super Unit> continuation) {
        return ((KLineDataSession$bindDataPushFlow$2) create(candleList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineDataSession$bindDataPushFlow$2(AtomicReference<InterfaceC41729r0<CandleList>> atomicReference, KLineDataSession kLineDataSession, long j11, String str, Continuation<? super KLineDataSession$bindDataPushFlow$2> continuation) {
        super(2, continuation);
        this.$deferredRef = atomicReference;
        this.this$0 = kLineDataSession;
        this.$startTime = j11;
        this.$from = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLineDataSession$bindDataPushFlow$2 kLineDataSession$bindDataPushFlow$2 = new KLineDataSession$bindDataPushFlow$2(this.$deferredRef, this.this$0, this.$startTime, this.$from, continuation);
        kLineDataSession$bindDataPushFlow$2.L$0 = obj;
        return kLineDataSession$bindDataPushFlow$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r14 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        if (r6.mo24111b(r14, r13) == r1) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0<CandleList> andSet;
        CandleList candleListM23915a;
        CandleList candleList = (CandleList) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                andSet = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.this$0.f22369k.compareAndSet(true, false)) {
                this.this$0.f22361c.mo24147d(KLineLoadingState.LoadSuccess);
                C44128b.m97266j("KLineDataSession", "bindDataPushFlow success");
                KLineReport.f22495a.m24397c("load", this.this$0.f22359a.getSymbol(), this.this$0.f22359a.getBiz(), this.this$0.f22359a.getType().getType(), System.currentTimeMillis() - this.$startTime, this.$from, this.this$0.f22370l.getAndSet(false));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        andSet = this.$deferredRef.getAndSet(null);
        if (andSet != null) {
            this.L$0 = candleList;
            this.L$1 = SpillingKt.nullOutSpilledVariable(andSet);
            this.label = 1;
            obj = andSet.mo91198h(this);
        } else {
            candleListM23915a = candleList;
            IKLineChannel iKLineChannel = this.this$0.f22363e;
            this.L$0 = SpillingKt.nullOutSpilledVariable(candleList);
            this.L$1 = SpillingKt.nullOutSpilledVariable(andSet);
            this.L$2 = SpillingKt.nullOutSpilledVariable(candleListM23915a);
            this.label = 2;
        }
        return coroutine_suspended;
        C44128b.m97266j("KLineDataSession", "bindDataPushFlow merge data");
        CandleListKt$Dsl.Companion companion = CandleListKt$Dsl.f22079b;
        CandleList.C12644b c12644bNewBuilder = CandleList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12644bNewBuilder, "newBuilder(...)");
        CandleListKt$Dsl candleListKt$Dsl_create = companion._create(c12644bNewBuilder);
        CandleList.UpdateType updateType = candleList.getUpdateType();
        Intrinsics.checkNotNullExpressionValue(updateType, "getUpdateType(...)");
        candleListKt$Dsl_create.m23918d(updateType);
        DslList dslListM23917c = candleListKt$Dsl_create.m23917c();
        List<CandleItem> itemsList = ((CandleList) obj).getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList, "getItemsList(...)");
        candleListKt$Dsl_create.m23916b(dslListM23917c, itemsList);
        DslList dslListM23917c2 = candleListKt$Dsl_create.m23917c();
        List<CandleItem> itemsList2 = candleList.getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList2, "getItemsList(...)");
        candleListKt$Dsl_create.m23916b(dslListM23917c2, itemsList2);
        candleListM23915a = candleListKt$Dsl_create.m23915a();
        IKLineChannel iKLineChannel2 = this.this$0.f22363e;
        this.L$0 = SpillingKt.nullOutSpilledVariable(candleList);
        this.L$1 = SpillingKt.nullOutSpilledVariable(andSet);
        this.L$2 = SpillingKt.nullOutSpilledVariable(candleListM23915a);
        this.label = 2;
    }
}
