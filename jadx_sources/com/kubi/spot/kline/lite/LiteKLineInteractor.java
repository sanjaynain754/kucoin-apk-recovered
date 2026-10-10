package com.kubi.spot.kline.lite;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleItemKt$Dsl;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineCdnRange;
import com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import mr.C42597a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: compiled from: LiteKLineInteractor.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0094@¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\u0006\u0010\u0013\u001a\u00020 H\u0094@¢\u0006\u0002\u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\u0006\u0010\u0013\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0094@¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020\u001f*\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J\u0014\u0010(\u001a\u00020\u001f*\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J!\u0010)\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00120*2\b\b\u0001\u0010+\u001a\u00020\u0012H\u0014¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010/\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00120*H\u0002¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u00062"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteKLineInteractor;", "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;", "isKucoinSource", "", "<init>", "(Z)V", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "Lcom/kubi/flutter/proto/kline/CandleList;", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "liteSocket", "Lcom/kubi/spot/kline/lite/LiteKLineInteractor$ILiteSocket;", "getLiteSocket", "()Lcom/kubi/spot/kline/lite/LiteKLineInteractor$ILiteSocket;", "liteSocket$delegate", "Lkotlin/Lazy;", "getTopic", "", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "buildKlineRequest", "Lokhttp3/Request;", "begin", "", "end", "fetchCdnKlineList", "", "Lcom/kubi/flutter/proto/kline/CandleItem;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveOrderList", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrderList", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toActiveOrderItem", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "toHistoryOrderItem", "toCandleItem", "", "source", "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "bindDataPushFlow", "Lkotlinx/coroutines/flow/Flow;", "convertToCandleItemWithEmpty", "([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "ILiteSocket", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteKLineInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteKLineInteractor.kt\ncom/kubi/spot/kline/lite/LiteKLineInteractor\n+ 2 OrderItemKt.kt\ncom/kubi/flutter/proto/kline/OrderItemKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 CandleItemKt.kt\ncom/kubi/flutter/proto/kline/CandleItemKtKt\n*L\n1#1,132:1\n8#2:133\n8#2:135\n1#3:134\n1#3:136\n1#3:143\n49#4:137\n51#4:141\n46#5:138\n51#5:140\n105#6:139\n8#7:142\n*S KotlinDebug\n*F\n+ 1 LiteKLineInteractor.kt\ncom/kubi/spot/kline/lite/LiteKLineInteractor\n*L\n101#1:133\n105#1:135\n101#1:134\n105#1:136\n118#1:143\n112#1:137\n112#1:141\n112#1:138\n112#1:140\n112#1:139\n118#1:142\n*E\n"})
public final class LiteKLineInteractor extends KLineBaseDataInteractor {

    /* JADX INFO: renamed from: b */
    public final boolean f50723b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41565d<CandleList> f50724c = C41568g.m90691b(-1, null, null, 6, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f50725d = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.lite.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteKLineInteractor.m62127G();
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteKLineInteractor$a */
    /* JADX INFO: compiled from: LiteKLineInteractor.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J\u001c\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteKLineInteractor$ILiteSocket;", "", "getMarketLiteKline", "Lokhttp3/Request;", "symbol", "", "type", "begin", "", "end", "getQuickSilverKline", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC25429a {
        @GET("v1/kcop/order-book/candles")
        @NotNull
        /* JADX INFO: renamed from: a */
        Request m62131a(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11, @Query("end") long j12);

        @GET("v1/kcop/quick-silver/universe-currency/symbols/candles")
        @NotNull
        /* JADX INFO: renamed from: b */
        Request m62132b(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2);
    }

    /* JADX INFO: renamed from: D */
    public final CandleItem m62128D(String[] strArr) {
        CandleItemKt$Dsl.Companion companion = CandleItemKt$Dsl.f22073b;
        CandleItem.C12640b c12640bNewBuilder = CandleItem.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12640bNewBuilder, "newBuilder(...)");
        CandleItemKt$Dsl candleItemKt$Dsl_create = companion._create(c12640bNewBuilder);
        candleItemKt$Dsl_create.m23908f(strArr[0].length() == 0 ? 0L : Long.parseLong(strArr[0]));
        double dM66537g = DowngradeExKt.m66537g(strArr[2], 0.0d);
        candleItemKt$Dsl_create.m23907e(DowngradeExKt.m66537g(strArr[1], dM66537g));
        candleItemKt$Dsl_create.m23904b(dM66537g);
        candleItemKt$Dsl_create.m23905c(DowngradeExKt.m66537g(strArr[3], dM66537g));
        candleItemKt$Dsl_create.m23906d(DowngradeExKt.m66537g(strArr[4], dM66537g));
        if (strArr.length >= 7) {
            candleItemKt$Dsl_create.m23909g(DowngradeExKt.m66537g(strArr[6], 0.0d));
        }
        return candleItemKt$Dsl_create.m23903a();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final InterfaceC41565d<CandleList> m62129E() {
        return this.f50724c;
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC25429a m62130F() {
        Object value = this.f50725d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC25429a) value;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor, com.kubi.flutter.widget.kline.IKLineDataInteractor
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<CandleList> mo24271b(@NotNull IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        final InterfaceC41634e<CandleList> interfaceC41634eMo24271b = super.mo24271b(param);
        return new InterfaceC41634e<CandleList>() { // from class: com.kubi.spot.kline.lite.LiteKLineInteractor$bindDataPushFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteKLineInteractor$bindDataPushFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LiteKLineInteractor.kt\ncom/kubi/spot/kline/lite/LiteKLineInteractor\n*L\n1#1,49:1\n50#2:50\n113#3,2:51\n*E\n"})
            public static final class C254302<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f50728b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ LiteKLineInteractor f50729c;

                /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteKLineInteractor$bindDataPushFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.spot.kline.lite.LiteKLineInteractor$bindDataPushFlow$$inlined$map$1$2", m90122f = "LiteKLineInteractor.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {51, 50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-LiteKLineInteractor$bindDataPushFlow$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C254302.this.emit(null, this);
                    }
                }

                public C254302(InterfaceC41635f interfaceC41635f, LiteKLineInteractor liteKLineInteractor) {
                    this.f50728b = interfaceC41635f;
                    this.f50729c = liteKLineInteractor;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
                
                    if (r4.emit(r2, r0) == r1) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    CandleList candleList;
                    InterfaceC41635f interfaceC41635f;
                    InterfaceC41635f interfaceC41635f2;
                    AnonymousClass1 anonymousClass2;
                    int i11;
                    Object obj2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i12 = anonymousClass1.label;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i12 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i13 = anonymousClass1.label;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            int i14 = anonymousClass1.I$0;
                            candleList = (CandleList) anonymousClass1.L$6;
                            interfaceC41635f = (InterfaceC41635f) anonymousClass1.L$4;
                            interfaceC41635f2 = (InterfaceC41635f) anonymousClass1.L$3;
                            obj2 = anonymousClass1.L$2;
                            anonymousClass2 = (AnonymousClass1) anonymousClass1.L$1;
                            Object obj4 = anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            i11 = i14;
                            obj = obj4;
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj3);
                    InterfaceC41635f interfaceC41635f3 = this.f50728b;
                    candleList = (CandleList) obj;
                    InterfaceC41565d<CandleList> interfaceC41565dM62129E = this.f50729c.m62129E();
                    anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                    anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                    anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                    anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f3);
                    anonymousClass1.L$4 = interfaceC41635f3;
                    anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                    anonymousClass1.L$6 = candleList;
                    anonymousClass1.I$0 = 0;
                    anonymousClass1.I$1 = 0;
                    anonymousClass1.label = 1;
                    if (interfaceC41565dM62129E.send(candleList, anonymousClass1) != coroutine_suspended) {
                        interfaceC41635f = interfaceC41635f3;
                        interfaceC41635f2 = interfaceC41635f;
                        anonymousClass2 = anonymousClass1;
                        i11 = 0;
                        obj2 = obj;
                    }
                    return coroutine_suspended;
                    anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                    anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass2);
                    anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj2);
                    anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f2);
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.L$6 = null;
                    anonymousClass1.I$0 = i11;
                    anonymousClass1.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super CandleList> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eMo24271b.collect(new C254302(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: q */
    public Request mo24306q(@NotNull IKLineDataInteractor.DataParam param, long j11, long j12) {
        Intrinsics.checkNotNullParameter(param, "param");
        if (!this.f50723b) {
            return m62130F().m62132b(param.getSymbol(), param.getType().getName());
        }
        KLineCdnRange kLineCdnRangeM62147n = LiteKLineType.f50733a.m62147n(param.getType());
        return m62130F().m62131a(param.getSymbol(), param.getType().getType(), kLineCdnRangeM62147n.getBegin(), kLineCdnRangeM62147n.getEnd());
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo24311v(@NotNull IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        String str = String.format(this.f50723b ? "/market/candlesFrequency1000:%s" : "/quicksilver/candles:%s", Arrays.copyOf(new Object[]{param.getSymbol() + '_' + param.getType().getType()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: z */
    public CandleItem mo24312z(@NotNull String[] strArr, @NotNull String source) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return m62128D(strArr);
    }

    public LiteKLineInteractor(boolean z11) {
        this.f50723b = z11;
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC25429a m62127G() {
        return (InterfaceC25429a) C42597a.m93390f().create(InterfaceC25429a.class);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo24307r(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo24308s(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12, @NotNull Continuation<? super List<CandleItem>> continuation) {
        return CollectionsKt.emptyList();
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo24309t(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return CollectionsKt.emptyList();
    }
}
