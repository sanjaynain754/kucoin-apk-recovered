package com.kubi.payment.fasttradev2;

import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.p021ts.TsExtractor;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p477nt.C42875h;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2", m90122f = "FastTradeViewModel.kt", m90123i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, m90124l = {170, TsExtractor.TS_PACKET_SIZE, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT, 203}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "fiatCurrencyList", "$this$launch", "fiatCurrencyList", "cacheFiatCurrencyList", "remoteFiatCurrencyList", "hasCache", "$this$launch", "fiatCurrencyList", "cacheFiatCurrencyList", "remoteFiatCurrencyList", "hasCache", "$this$launch", "fiatCurrencyList", "cacheFiatCurrencyList", "remoteFiatCurrencyList", "selectedFiatCurrency", "hasCache"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
public final class FastTradeViewModel$loadTradingPair$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$1 */
    /* JADX INFO: compiled from: FastTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$1", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {184, 184}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C206961 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41729r0<List<FastTradeFiatCurrency.Response>> $remoteFiatCurrencyList;
        Object L$0;
        int label;
        final /* synthetic */ FastTradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C206961(FastTradeViewModel fastTradeViewModel, InterfaceC41729r0<? extends List<FastTradeFiatCurrency.Response>> interfaceC41729r0, Continuation<? super C206961> continuation) {
            super(2, continuation);
            this.this$0 = fastTradeViewModel;
            this.$remoteFiatCurrencyList = interfaceC41729r0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206961(this.this$0, this.$remoteFiatCurrencyList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C206961) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r1.m47301a0((java.util.List) r5, r4) == r0) goto L15;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FastTradeViewModel fastTradeViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    fastTradeViewModel = (FastTradeViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            fastTradeViewModel = this.this$0;
            InterfaceC41729r0<List<FastTradeFiatCurrency.Response>> interfaceC41729r0 = this.$remoteFiatCurrencyList;
            this.L$0 = fastTradeViewModel;
            this.label = 1;
            obj = interfaceC41729r0.mo91198h(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$2 */
    /* JADX INFO: compiled from: FastTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$2", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {197}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C206972 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<FastTradeFiatCurrency.Response> $fiatCurrencyList;
        final /* synthetic */ FastTradeFiatCurrency.Response $selectedFiatCurrency;
        int label;
        final /* synthetic */ FastTradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C206972(FastTradeViewModel fastTradeViewModel, FastTradeFiatCurrency.Response response, List<FastTradeFiatCurrency.Response> list, Continuation<? super C206972> continuation) {
            super(2, continuation);
            this.this$0 = fastTradeViewModel;
            this.$selectedFiatCurrency = response;
            this.$fiatCurrencyList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206972(this.this$0, this.$selectedFiatCurrency, this.$fiatCurrencyList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C206972) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FastTradeViewModel fastTradeViewModel = this.this$0;
                FastTradeFiatCurrency.Response response = this.$selectedFiatCurrency;
                List<FastTradeFiatCurrency.Response> list = this.$fiatCurrencyList;
                this.label = 1;
                if (fastTradeViewModel.m47307g0(response, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$3 */
    /* JADX INFO: compiled from: FastTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$3", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {212}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C206983 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<FastTradeCryptoCurrency.Response> $cryptoCurrencyList;
        final /* synthetic */ FastTradeCryptoCurrency.Response $selectedCryptoCurrency;
        int label;
        final /* synthetic */ FastTradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C206983(FastTradeViewModel fastTradeViewModel, FastTradeCryptoCurrency.Response response, List<FastTradeCryptoCurrency.Response> list, Continuation<? super C206983> continuation) {
            super(2, continuation);
            this.this$0 = fastTradeViewModel;
            this.$selectedCryptoCurrency = response;
            this.$cryptoCurrencyList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206983(this.this$0, this.$selectedCryptoCurrency, this.$cryptoCurrencyList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C206983) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FastTradeViewModel fastTradeViewModel = this.this$0;
                FastTradeCryptoCurrency.Response response = this.$selectedCryptoCurrency;
                List<FastTradeCryptoCurrency.Response> list = this.$cryptoCurrencyList;
                MutableLiveData mutableLiveData = fastTradeViewModel.f39002f0;
                this.label = 1;
                if (fastTradeViewModel.m47306f0(response, list, mutableLiveData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$loadTradingPair$2(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$loadTradingPair$2> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FastTradeViewModel$loadTradingPair$2 fastTradeViewModel$loadTradingPair$2 = new FastTradeViewModel$loadTradingPair$2(this.this$0, continuation);
        fastTradeViewModel$loadTradingPair$2.L$0 = obj;
        return fastTradeViewModel$loadTradingPair$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$loadTradingPair$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0124  */
    /* JADX WARN: Code duplicated, block: B:35:0x0144  */
    /* JADX WARN: Code duplicated, block: B:39:0x0182  */
    /* JADX WARN: Code duplicated, block: B:42:0x018b  */
    /* JADX WARN: Code duplicated, block: B:43:0x019e  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        Object objM47282F0;
        List list;
        boolean z11;
        InterfaceC41729r0 interfaceC41729r0;
        List list2;
        int i11;
        Object objMo91198h;
        List list3;
        List list4;
        List list5;
        Object objM47311l0;
        List list6;
        InterfaceC41729r0 interfaceC41729r1;
        FastTradeFiatCurrency.Response response;
        InterfaceC41709m0 interfaceC41709m0;
        Object objM47252H0;
        FastTradeFiatCurrency.Response response2;
        List list7;
        FastTradeCryptoCurrency.Response responseM47310j0;
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            FastTradeViewModel fastTradeViewModel = this.this$0;
            this.L$0 = interfaceC41709m1;
            this.L$1 = arrayList;
            this.label = 1;
            objM47282F0 = fastTradeViewModel.m47282F0(this);
            if (objM47282F0 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            arrayList = (List) this.L$1;
            ResultKt.throwOnFailure(obj);
            objM47282F0 = obj;
        } else {
            if (i12 == 2) {
                i11 = this.I$0;
                List list8 = (List) this.L$4;
                InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$3;
                List list9 = (List) this.L$2;
                list4 = (List) this.L$1;
                ResultKt.throwOnFailure(obj);
                list = list9;
                z11 = false;
                interfaceC41729r0 = interfaceC41729r2;
                list3 = list8;
                objMo91198h = obj;
                list3.addAll((Collection) objMo91198h);
                list2 = list4;
                list5 = list;
                if (list2.isEmpty()) {
                    FastTradeViewModel fastTradeViewModel2 = this.this$0;
                    this.L$0 = interfaceC41709m1;
                    this.L$1 = list2;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list5);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$4 = null;
                    this.I$0 = i11;
                    this.label = 3;
                    objM47311l0 = fastTradeViewModel2.m47311l0(list2, this);
                    if (objM47311l0 != coroutine_suspended) {
                        list6 = list5;
                        interfaceC41729r1 = interfaceC41729r0;
                        response = (FastTradeFiatCurrency.Response) objM47311l0;
                        C41696j.m91102b(interfaceC41709m1, null, null, new C206972(this.this$0, response, list2, null), 3, null);
                        interfaceC41709m0 = interfaceC41709m1;
                        FastTradeViewModel fastTradeViewModel3 = this.this$0;
                        this.L$0 = interfaceC41709m0;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(list6);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                        this.L$4 = response;
                        this.I$0 = i11;
                        this.label = 4;
                        objM47252H0 = FastTradeViewModel.m47252H0(fastTradeViewModel3, response, false, this, 2, null);
                        if (objM47252H0 != coroutine_suspended) {
                            response2 = response;
                        }
                    }
                    return coroutine_suspended;
                }
                this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                i11 = this.I$0;
                InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$3;
                List list10 = (List) this.L$2;
                list2 = (List) this.L$1;
                ResultKt.throwOnFailure(obj);
                list6 = list10;
                z11 = false;
                interfaceC41729r1 = interfaceC41729r3;
                objM47311l0 = obj;
                response = (FastTradeFiatCurrency.Response) objM47311l0;
                C41696j.m91102b(interfaceC41709m1, null, null, new C206972(this.this$0, response, list2, null), 3, null);
                interfaceC41709m0 = interfaceC41709m1;
                FastTradeViewModel fastTradeViewModel4 = this.this$0;
                this.L$0 = interfaceC41709m0;
                this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                this.L$2 = SpillingKt.nullOutSpilledVariable(list6);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                this.L$4 = response;
                this.I$0 = i11;
                this.label = 4;
                objM47252H0 = FastTradeViewModel.m47252H0(fastTradeViewModel4, response, false, this, 2, null);
                if (objM47252H0 != coroutine_suspended) {
                    response2 = response;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FastTradeFiatCurrency.Response response3 = (FastTradeFiatCurrency.Response) this.L$4;
            ResultKt.throwOnFailure(obj);
            response2 = response3;
            interfaceC41709m0 = interfaceC41709m1;
            z11 = false;
            objM47252H0 = obj;
        }
        list7 = (List) objM47252H0;
        if (list7.isEmpty()) {
            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
        } else {
            C43841b.m96557d("B7fast_trade_load", "data_load_finish", null, 4, null);
            responseM47310j0 = this.this$0.m47310j0(list7);
            C41696j.m91102b(interfaceC41709m0, null, null, new C206983(this.this$0, responseM47310j0, list7, null), 3, null);
            if (response2 != null) {
                this.this$0.f39000d0.setValue(response2);
            }
            if (responseM47310j0 != null) {
                this.this$0.f39001e0.setValue(responseM47310j0);
            }
            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(true)));
        }
        return Unit.INSTANCE;
        List list11 = (List) objM47282F0;
        boolean zIsEmpty = list11.isEmpty();
        int i13 = !zIsEmpty ? 1 : 0;
        if (!zIsEmpty) {
            arrayList.addAll(list11);
        }
        C43841b.m96557d("B7fast_trade_load", "data_load_start", null, 4, null);
        list = list11;
        z11 = false;
        InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m1, null, null, new FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1(this.this$0, null), 3, null);
        C41696j.m91102b(interfaceC41709m1, null, null, new C206961(this.this$0, interfaceC41729r0M91102b, null), 3, null);
        if (!zIsEmpty) {
            interfaceC41729r0 = interfaceC41729r0M91102b;
            list2 = arrayList;
            i11 = i13;
            list5 = list;
            if (list2.isEmpty()) {
                FastTradeViewModel fastTradeViewModel5 = this.this$0;
                this.L$0 = interfaceC41709m1;
                this.L$1 = list2;
                this.L$2 = SpillingKt.nullOutSpilledVariable(list5);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$4 = null;
                this.I$0 = i11;
                this.label = 3;
                objM47311l0 = fastTradeViewModel5.m47311l0(list2, this);
                if (objM47311l0 != coroutine_suspended) {
                    list6 = list5;
                    interfaceC41729r1 = interfaceC41729r0;
                    response = (FastTradeFiatCurrency.Response) objM47311l0;
                    C41696j.m91102b(interfaceC41709m1, null, null, new C206972(this.this$0, response, list2, null), 3, null);
                    interfaceC41709m0 = interfaceC41709m1;
                    FastTradeViewModel fastTradeViewModel6 = this.this$0;
                    this.L$0 = interfaceC41709m0;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list6);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                    this.L$4 = response;
                    this.I$0 = i11;
                    this.label = 4;
                    objM47252H0 = FastTradeViewModel.m47252H0(fastTradeViewModel6, response, false, this, 2, null);
                    if (objM47252H0 != coroutine_suspended) {
                        response2 = response;
                        list7 = (List) objM47252H0;
                        if (list7.isEmpty()) {
                            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
                        } else {
                            C43841b.m96557d("B7fast_trade_load", "data_load_finish", null, 4, null);
                            responseM47310j0 = this.this$0.m47310j0(list7);
                            C41696j.m91102b(interfaceC41709m0, null, null, new C206983(this.this$0, responseM47310j0, list7, null), 3, null);
                            if (response2 != null) {
                                this.this$0.f39000d0.setValue(response2);
                            }
                            if (responseM47310j0 != null) {
                                this.this$0.f39001e0.setValue(responseM47310j0);
                            }
                            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(true)));
                        }
                    }
                }
                return coroutine_suspended;
            }
            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
            return Unit.INSTANCE;
        }
        this.L$0 = interfaceC41709m1;
        this.L$1 = arrayList;
        this.L$2 = SpillingKt.nullOutSpilledVariable(list);
        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$4 = arrayList;
        this.I$0 = i13;
        this.label = 2;
        interfaceC41729r0 = interfaceC41729r0M91102b;
        objMo91198h = interfaceC41729r0.mo91198h(this);
        if (objMo91198h != coroutine_suspended) {
            list3 = arrayList;
            list4 = list3;
            i11 = i13;
            list3.addAll((Collection) objMo91198h);
            list2 = list4;
            list5 = list;
            if (list2.isEmpty()) {
                this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
            } else {
                FastTradeViewModel fastTradeViewModel7 = this.this$0;
                this.L$0 = interfaceC41709m1;
                this.L$1 = list2;
                this.L$2 = SpillingKt.nullOutSpilledVariable(list5);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$4 = null;
                this.I$0 = i11;
                this.label = 3;
                objM47311l0 = fastTradeViewModel7.m47311l0(list2, this);
                if (objM47311l0 != coroutine_suspended) {
                    list6 = list5;
                    interfaceC41729r1 = interfaceC41729r0;
                    response = (FastTradeFiatCurrency.Response) objM47311l0;
                    C41696j.m91102b(interfaceC41709m1, null, null, new C206972(this.this$0, response, list2, null), 3, null);
                    interfaceC41709m0 = interfaceC41709m1;
                    FastTradeViewModel fastTradeViewModel8 = this.this$0;
                    this.L$0 = interfaceC41709m0;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list6);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                    this.L$4 = response;
                    this.I$0 = i11;
                    this.label = 4;
                    objM47252H0 = FastTradeViewModel.m47252H0(fastTradeViewModel8, response, false, this, 2, null);
                    if (objM47252H0 != coroutine_suspended) {
                        response2 = response;
                        list7 = (List) objM47252H0;
                        if (list7.isEmpty()) {
                            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(z11)));
                        } else {
                            C43841b.m96557d("B7fast_trade_load", "data_load_finish", null, 4, null);
                            responseM47310j0 = this.this$0.m47310j0(list7);
                            C41696j.m91102b(interfaceC41709m0, null, null, new C206983(this.this$0, responseM47310j0, list7, null), 3, null);
                            if (response2 != null) {
                                this.this$0.f39000d0.setValue(response2);
                            }
                            if (responseM47310j0 != null) {
                                this.this$0.f39001e0.setValue(responseM47310j0);
                            }
                            this.this$0.f39003g0.setValue(new C42875h(Boxing.boxBoolean(true)));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
        return coroutine_suspended;
    }
}
