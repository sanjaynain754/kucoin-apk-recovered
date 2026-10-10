package com.kubi.core.base.quote.inner;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.network.restful.C19321b;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.DowngradeExKt;
import ee.C37136a;
import er.C37237b;
import ge.InterfaceC37871a;
import gf.C37890n;
import gr.C38000b;
import gr.C38006h;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p260fd.InterfaceC37432d;
import p756xc.ETFInfoResponse;
import p756xc.Request;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: EftTickerFetchAndSubHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J8\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestAndSubHandler;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$Request;", "Lcom/kubi/core/base/arch/api/data/SymbolQuoteData$ETFInfoResponse;", "<init>", "()V", "subQuoteApi", "Lcom/kubi/core/spot/api/ISpotWSDynamicTopic;", "getSubQuoteApi", "()Lcom/kubi/core/spot/api/ISpotWSDynamicTopic;", "subQuoteApi$delegate", "Lkotlin/Lazy;", "execute", "Lkotlinx/coroutines/flow/StateFlow;", "req", "subScope", "Lkotlinx/coroutines/CoroutineScope;", "mergeTradeAndEftDataRealtime", "fetchTradeDataFlow", "Lkotlinx/coroutines/flow/Flow;", "symbol", "", "baseCurrency", "getSubEftInfoFlow", "Ljava/math/BigDecimal;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEftTickerFetchAndSubHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EftTickerFetchAndSubHandler.kt\ncom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,121:1\n49#2:122\n51#2:126\n17#2:127\n19#2:131\n46#3:123\n51#3:125\n46#3:128\n51#3:130\n105#4:124\n105#4:129\n*S KotlinDebug\n*F\n+ 1 EftTickerFetchAndSubHandler.kt\ncom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler\n*L\n110#1:122\n110#1:126\n119#1:127\n119#1:131\n110#1:123\n110#1:125\n119#1:128\n119#1:130\n110#1:124\n119#1:129\n*E\n"})
public final class EftTickerFetchAndSubHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f20087a = LazyKt.lazy(new Function0() { // from class: com.kubi.core.base.quote.inner.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EftTickerFetchAndSubHandler.m21141n();
        }
    });

    /* JADX INFO: renamed from: g */
    public static final Unit m21137g(InterfaceC41669n interfaceC41669n, Request request, SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal) {
        String symbol = request.getSymbol();
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        interfaceC41669n.setValue(new ETFInfoResponse(symbol, baseCurrency, new InterfaceC37432d.Detail(request.getSymbol(), bigDecimal)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21139i(Throwable th2) {
        C44128b.m97263g("eftTickerObserverHandler", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC37871a m21141n() {
        return (InterfaceC37871a) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37871a.class);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC41678w<ETFInfoResponse> m21142f(@NotNull final Request req, @NotNull InterfaceC41709m0 subScope) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(subScope, "subScope");
        final InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        final SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(req.getSymbol());
        if (symbolInfoEntityM85601B == null) {
            return interfaceC41669nM91009a;
        }
        if (symbolInfoEntityM85601B.isEtfSymbol()) {
            IMarginService iMarginServiceM83062a = C37136a.f82407a.m83062a();
            String baseCurrency = symbolInfoEntityM85601B.getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            Observable observableObserveOn = iMarginServiceM83062a.mo37943k(baseCurrency).compose(C24217a1.m58390n()).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.core.base.quote.inner.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EftTickerFetchAndSubHandler.m21137g(interfaceC41669nM91009a, req, symbolInfoEntityM85601B, (BigDecimal) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.core.base.quote.inner.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EftTickerFetchAndSubHandler.m21138h(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.core.base.quote.inner.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EftTickerFetchAndSubHandler.m21139i((Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.base.quote.inner.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EftTickerFetchAndSubHandler.m21140j(function2, obj);
                }
            });
        }
        String symbol = req.getSymbol();
        String baseCurrency2 = symbolInfoEntityM85601B.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency2, "getBaseCurrency(...)");
        return m21145m(interfaceC41669nM91009a, symbol, baseCurrency2, subScope);
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC37871a m21144l() {
        return (InterfaceC37871a) this.f20087a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final void m21138h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static final void m21140j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC41634e<BigDecimal> m21143k(String str) {
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(m21144l().m85489b(DowngradeExKt.m66551u("/margin-fund/nav:%s", new Object[]{str}, null, 2, null)));
        final InterfaceC41634e<BigDecimal> interfaceC41634e = new InterfaceC41634e<BigDecimal>() { // from class: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EftTickerFetchAndSubHandler.kt\ncom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler\n*L\n1#1,49:1\n50#2:50\n111#3,7:51\n*E\n"})
            public static final class C116362<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20091b;

                /* JADX INFO: renamed from: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$map$1$2", m90122f = "EftTickerFetchAndSubHandler.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C116362.this.emit(null, this);
                    }
                }

                public C116362(InterfaceC41635f interfaceC41635f) {
                    this.f20091b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BigDecimal bigDecimalNegate;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20091b;
                        try {
                            String strOptString = new JSONObject((String) obj).optString("netAssetValue");
                            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                            bigDecimalNegate = new BigDecimal(strOptString);
                        } catch (Exception e11) {
                            C44128b.m97263g("getSubEftInfoFlow", e11);
                            BigDecimal ONE = BigDecimal.ONE;
                            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                            bigDecimalNegate = ONE.negate();
                            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(bigDecimalNegate, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super BigDecimal> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C116362(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new InterfaceC41634e<BigDecimal>() { // from class: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EftTickerFetchAndSubHandler.kt\ncom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler\n*L\n1#1,49:1\n18#2:50\n19#2:52\n119#3:51\n*E\n"})
            public static final class C116352<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20089b;

                /* JADX INFO: renamed from: com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler$getSubEftInfoFlow$$inlined$filter$1$2", m90122f = "EftTickerFetchAndSubHandler.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C116352.this.emit(null, this);
                    }
                }

                public C116352(InterfaceC41635f interfaceC41635f) {
                    this.f20089b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20089b;
                        if (((BigDecimal) obj).doubleValue() > 0.0d) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super BigDecimal> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C116352(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC41678w<ETFInfoResponse> m21145m(InterfaceC41634e<ETFInfoResponse> interfaceC41634e, String str, String str2, InterfaceC41709m0 interfaceC41709m0) {
        return C41636g.m90916g0(C41636g.m90939v(C41636g.m90888L(interfaceC41634e, m21143k(str), new EftTickerFetchAndSubHandler$mergeTradeAndEftDataRealtime$1(str, str2, null))), interfaceC41709m0, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
    }
}
