package com.kubi.quotefacade.chain;

import androidx.lifecycle.MutableLiveData;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.user.api.IUserService;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ChainContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.ChainContainerViewModel$fetchChainFavData$2", m90122f = "ChainContainerViewModel.kt", m90123i = {1}, m90124l = {54, 57}, m90125m = "invokeSuspend", m90126n = {"resultList"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nChainContainerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel$fetchChainFavData$2\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n25#2:167\n26#2:169\n1#3:168\n*S KotlinDebug\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel$fetchChainFavData$2\n*L\n68#1:167\n68#1:169\n68#1:168\n*E\n"})
public final class ChainContainerViewModel$fetchChainFavData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderByRange;
    Object L$0;
    int label;
    final /* synthetic */ ChainContainerViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.ChainContainerViewModel$fetchChainFavData$2$1 */
    /* JADX INFO: compiled from: ChainContainerViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.ChainContainerViewModel$fetchChainFavData$2$1", m90122f = "ChainContainerViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nChainContainerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel$fetchChainFavData$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1617#2,9:167\n1869#2:176\n1870#2:178\n1626#2:179\n1#3:177\n*S KotlinDebug\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel$fetchChainFavData$2$1\n*L\n61#1:167,9\n61#1:176\n61#1:178\n61#1:179\n61#1:177\n*E\n"})
    public static final class C217431 extends SuspendLambda implements Function2<List<? extends ChainItemEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ChainItemEntity> $resultList;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChainContainerViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChainItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChainItemEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C217431(ChainContainerViewModel chainContainerViewModel, List<ChainItemEntity> list, Continuation<? super C217431> continuation) {
            super(2, continuation);
            this.this$0 = chainContainerViewModel;
            this.$resultList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217431 c217431 = new C217431(this.this$0, this.$resultList, continuation);
            c217431.L$0 = obj;
            return c217431;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChainItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C217431) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<ChainItemEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j(this.this$0.f41471V, "getChainFavList = " + list);
            this.$resultList.addAll(list);
            ChainFavCacheManager chainFavCacheManager = ChainFavCacheManager.f41922a;
            ArrayList arrayList = new ArrayList();
            for (ChainItemEntity chainItemEntity : list) {
                String token = chainItemEntity.getToken();
                String chain = chainItemEntity.getChain();
                String str = (token == null || token.length() == 0 || chain == null || chain.length() == 0) ? null : token + '-' + chain;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            chainFavCacheManager.m51787z(arrayList);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainContainerViewModel$fetchChainFavData$2(ChainContainerViewModel chainContainerViewModel, String str, Continuation<? super ChainContainerViewModel$fetchChainFavData$2> continuation) {
        super(2, continuation);
        this.this$0 = chainContainerViewModel;
        this.$orderByRange = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChainContainerViewModel$fetchChainFavData$2(this.this$0, this.$orderByRange, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChainContainerViewModel$fetchChainFavData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        MutableLiveData mutableLiveData;
        ChainContainerViewModel chainContainerViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    chainContainerViewModel = this.this$0;
                    if (((C19334f) obj).getThrowable() != null) {
                        this.this$0.m50759x(list);
                        this.this$0.m50755r().postValue(this.this$0.m50737C(list));
                    } else {
                        C44128b.m97266j(chainContainerViewModel.f41471V, "getChainFavList error");
                        chainContainerViewModel.m50756s().postValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableLiveData.postValue(obj);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!IUserService.a.get().c()) {
                MutableLiveData<List<ChainItemEntity>> mutableLiveDataM50755r = this.this$0.m50755r();
                ChainContainerViewModel chainContainerViewModel2 = this.this$0;
                String str = this.$orderByRange;
                this.L$0 = mutableLiveDataM50755r;
                this.label = 1;
                Object objM50754q = chainContainerViewModel2.m50754q(str, this);
                if (objM50754q != coroutine_suspended) {
                    mutableLiveData = mutableLiveDataM50755r;
                    obj = objM50754q;
                    mutableLiveData.postValue(obj);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                InterfaceC41634e<List<ChainItemEntity>> interfaceC41634eM52970E = this.this$0.f41474Y.m52970E(this.$orderByRange);
                C217431 c217431 = new C217431(this.this$0, arrayList, null);
                this.L$0 = arrayList;
                this.label = 2;
                Object objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52970E, false, c217431, this);
                if (objM42823d != coroutine_suspended) {
                    list = arrayList;
                    obj = objM42823d;
                    chainContainerViewModel = this.this$0;
                    if (((C19334f) obj).getThrowable() != null) {
                        this.this$0.m50759x(list);
                        this.this$0.m50755r().postValue(this.this$0.m50737C(list));
                    } else {
                        C44128b.m97266j(chainContainerViewModel.f41471V, "getChainFavList error");
                        chainContainerViewModel.m50756s().postValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
