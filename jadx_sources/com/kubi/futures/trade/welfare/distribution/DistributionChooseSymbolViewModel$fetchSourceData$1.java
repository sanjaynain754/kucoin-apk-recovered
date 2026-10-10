package com.kubi.futures.trade.welfare.distribution;

import com.kubi.kumex.data.market.model.DistributionPageEntity;
import com.kubi.kumex.data.market.model.DistributionQuoteEntity;
import com.kubi.kumex.data.market.model.DistributionQuoteFooterEntity;
import com.kubi.kumex.data.market.model.IDistributionData;
import com.kubi.kumex.utils.C17035b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolViewModel$fetchSourceData$1", m90122f = "DistributionChooseSymbolDialog.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDistributionChooseSymbolDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel$fetchSourceData$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n25#2:283\n26#2:285\n1#3:284\n*S KotlinDebug\n*F\n+ 1 DistributionChooseSymbolDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionChooseSymbolViewModel$fetchSourceData$1\n*L\n204#1:283\n204#1:285\n204#1:284\n*E\n"})
public final class DistributionChooseSymbolViewModel$fetchSourceData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ DistributionChooseSymbolViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolViewModel$fetchSourceData$1$1 */
    /* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/kumex/data/market/model/DistributionPageEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolViewModel$fetchSourceData$1$1", m90122f = "DistributionChooseSymbolDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C142811 extends SuspendLambda implements Function2<DistributionPageEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DistributionChooseSymbolViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DistributionPageEntity distributionPageEntity, Continuation<? super Unit> continuation) {
            return ((C142811) create(distributionPageEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142811(DistributionChooseSymbolViewModel distributionChooseSymbolViewModel, Continuation<? super C142811> continuation) {
            super(2, continuation);
            this.this$0 = distributionChooseSymbolViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142811 c142811 = new C142811(this.this$0, continuation);
            c142811.L$0 = obj;
            return c142811;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DistributionPageEntity distributionPageEntity = (DistributionPageEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m28533F(distributionPageEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolViewModel$fetchSourceData$1$2 */
    /* JADX INFO: compiled from: DistributionChooseSymbolDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/kumex/data/market/model/DistributionPageEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionChooseSymbolViewModel$fetchSourceData$1$2", m90122f = "DistributionChooseSymbolDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C142822 extends SuspendLambda implements Function2<DistributionPageEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DistributionChooseSymbolViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DistributionPageEntity distributionPageEntity, Continuation<? super Unit> continuation) {
            return ((C142822) create(distributionPageEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142822(DistributionChooseSymbolViewModel distributionChooseSymbolViewModel, Continuation<? super C142822> continuation) {
            super(2, continuation);
            this.this$0 = distributionChooseSymbolViewModel;
        }

        /* JADX INFO: renamed from: f */
        public static final boolean m28538f(IDistributionData iDistributionData) {
            return iDistributionData instanceof DistributionQuoteFooterEntity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142822 c142822 = new C142822(this.this$0, continuation);
            c142822.L$0 = obj;
            return c142822;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DistributionPageEntity distributionPageEntity = (DistributionPageEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List arrayList = (List) this.this$0.f24692V.getValue();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C17035b.m36494a(arrayList, new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(DistributionChooseSymbolViewModel$fetchSourceData$1.C142822.m28538f((IDistributionData) obj2));
                }
            });
            List<DistributionQuoteEntity> items = distributionPageEntity.getItems();
            if (items == null) {
                items = new ArrayList<>();
            }
            arrayList.addAll(items);
            if (distributionPageEntity.getTotalPage() > this.this$0.f24698b0) {
                arrayList.add(new DistributionQuoteFooterEntity(false));
            }
            this.this$0.f24692V.postValue(arrayList);
            this.this$0.f24698b0 = distributionPageEntity.getCurrentPage() + 1;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributionChooseSymbolViewModel$fetchSourceData$1(DistributionChooseSymbolViewModel distributionChooseSymbolViewModel, String str, Continuation<? super DistributionChooseSymbolViewModel$fetchSourceData$1> continuation) {
        super(2, continuation);
        this.this$0 = distributionChooseSymbolViewModel;
        this.$code = str;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m28536f(IDistributionData iDistributionData) {
        return iDistributionData instanceof DistributionQuoteFooterEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DistributionChooseSymbolViewModel$fetchSourceData$1(this.this$0, this.$code, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DistributionChooseSymbolViewModel$fetchSourceData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DistributionChooseSymbolViewModel$fetchSourceData$1 distributionChooseSymbolViewModel$fetchSourceData$1;
        List arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                distributionChooseSymbolViewModel$fetchSourceData$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90915g(C41636g.m90896T(this.this$0.m28529B().mo101248a(this.$code, this.this$0.f24698b0, this.this$0.f24699c0), new C142811(this.this$0, null))), C42911a.m94120b());
            C142822 c142822 = new C142822(this.this$0, null);
            this.label = 1;
            distributionChooseSymbolViewModel$fetchSourceData$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c142822, distributionChooseSymbolViewModel$fetchSourceData$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        DistributionChooseSymbolViewModel distributionChooseSymbolViewModel = distributionChooseSymbolViewModel$fetchSourceData$1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            List list = (List) distributionChooseSymbolViewModel.f24692V.getValue();
            if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
                arrayList = new ArrayList();
            }
            C17035b.m36494a(arrayList, new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(DistributionChooseSymbolViewModel$fetchSourceData$1.m28536f((IDistributionData) obj2));
                }
            });
            if (arrayList.isEmpty()) {
                distributionChooseSymbolViewModel.f24694X.postValue(throwable);
            } else {
                arrayList.add(new DistributionQuoteFooterEntity(false));
                distributionChooseSymbolViewModel.f24692V.postValue(arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
