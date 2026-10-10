package com.kubi.core.biz.banner;

import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.banner.BannerViewModel$fetchGetNoticeList$1", m90122f = "BannerViewModel.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$fetchGetNoticeList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n25#2:126\n26#2:128\n1#3:127\n*S KotlinDebug\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$fetchGetNoticeList$1\n*L\n88#1:126\n88#1:128\n88#1:127\n*E\n"})
public final class BannerViewModel$fetchGetNoticeList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ BannerViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.banner.BannerViewModel$fetchGetNoticeList$1$1 */
    /* JADX INFO: compiled from: BannerViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.BannerViewModel$fetchGetNoticeList$1$1", m90122f = "BannerViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$fetchGetNoticeList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n774#2:126\n865#2,2:127\n774#2:129\n865#2,2:130\n*S KotlinDebug\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$fetchGetNoticeList$1$1\n*L\n82#1:126\n82#1:127,2\n83#1:129\n83#1:130,2\n*E\n"})
    public static final class C116841 extends SuspendLambda implements Function2<SpotBannerEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BannerViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotBannerEntity spotBannerEntity, Continuation<? super Unit> continuation) {
            return ((C116841) create(spotBannerEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116841(BannerViewModel bannerViewModel, String str, Continuation<? super C116841> continuation) {
            super(2, continuation);
            this.this$0 = bannerViewModel;
            this.$symbol = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116841 c116841 = new C116841(this.this$0, this.$symbol, continuation);
            c116841.L$0 = obj;
            return c116841;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final SpotBannerEntity spotBannerEntity = (SpotBannerEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.banner.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BannerViewModel$fetchGetNoticeList$1.C116841.m21274g(spotBannerEntity, (SpotBannerUiState) obj2);
                }
            });
            final BannerViewModel bannerViewModel = this.this$0;
            bannerViewModel.updateState(new Function1() { // from class: com.kubi.core.biz.banner.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BannerViewModel$fetchGetNoticeList$1.C116841.m21275h(spotBannerEntity, bannerViewModel, (SpotBannerUiState) obj2);
                }
            });
            this.this$0.f20139Y.close();
            this.this$0.m21267J(this.$symbol);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final SpotBannerUiState m21274g(SpotBannerEntity spotBannerEntity, SpotBannerUiState spotBannerUiState) {
            ArrayList arrayList;
            String id2;
            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) obj;
                    if (spotBannerItemEntity.getNoticeType() == 3 && (id2 = spotBannerItemEntity.getId()) != null && C11711r.m21307c(id2)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return SpotBannerUiState.copy$default(spotBannerUiState, null, arrayList, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static final SpotBannerUiState m21275h(SpotBannerEntity spotBannerEntity, BannerViewModel bannerViewModel, SpotBannerUiState spotBannerUiState) {
            ArrayList arrayList;
            List<SpotBannerItemEntity> complianceNoticeList;
            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((SpotBannerItemEntity) obj).getNoticeType() == 1 && ((complianceNoticeList = ((SpotBannerUiState) bannerViewModel.getState()).getComplianceNoticeList()) == null || complianceNoticeList.isEmpty())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return SpotBannerUiState.copy$default(spotBannerUiState, arrayList, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final SpotBannerUiState m21270g(SpotBannerUiState spotBannerUiState) {
        return SpotBannerUiState.copy$default(spotBannerUiState, null, null, 1, null);
    }

    /* JADX INFO: renamed from: h */
    public static final SpotBannerUiState m21271h(SpotBannerUiState spotBannerUiState) {
        return SpotBannerUiState.copy$default(spotBannerUiState, null, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel$fetchGetNoticeList$1(BannerViewModel bannerViewModel, String str, Continuation<? super BannerViewModel$fetchGetNoticeList$1> continuation) {
        super(2, continuation);
        this.this$0 = bannerViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerViewModel$fetchGetNoticeList$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BannerViewModel$fetchGetNoticeList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM21264D = this.this$0.m21264D(this.$symbol);
            C116841 c116841 = new C116841(this.this$0, this.$symbol, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM21264D, false, c116841, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        BannerViewModel bannerViewModel = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            bannerViewModel.updateState(new Function1() { // from class: com.kubi.core.biz.banner.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BannerViewModel$fetchGetNoticeList$1.m21270g((SpotBannerUiState) obj2);
                }
            });
            bannerViewModel.updateState(new Function1() { // from class: com.kubi.core.biz.banner.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BannerViewModel$fetchGetNoticeList$1.m21271h((SpotBannerUiState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
