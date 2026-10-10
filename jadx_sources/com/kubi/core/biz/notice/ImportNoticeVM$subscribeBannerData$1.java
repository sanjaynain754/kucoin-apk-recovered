package com.kubi.core.biz.notice;

import com.kubi.core.biz.banner.C11711r;
import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.spot.entity.SpotBannerPushEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ImportNoticeVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1", m90122f = "ImportNoticeVM.kt", m90123i = {0}, m90124l = {131}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class ImportNoticeVM$subscribeBannerData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImportNoticeVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1$1 */
    /* JADX INFO: compiled from: ImportNoticeVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/core/spot/entity/SpotBannerPushEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1$1", m90122f = "ImportNoticeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119941 extends SuspendLambda implements Function3<InterfaceC41635f<? super SpotBannerPushEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C119941(Continuation<? super C119941> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super SpotBannerPushEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C119941 c119941 = new C119941(continuation);
            c119941.L$0 = th2;
            return c119941.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97263g("spotBanner", th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeVM$subscribeBannerData$1(ImportNoticeVM importNoticeVM, String str, Continuation<? super ImportNoticeVM$subscribeBannerData$1> continuation) {
        super(2, continuation);
        this.this$0 = importNoticeVM;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImportNoticeVM$subscribeBannerData$1 importNoticeVM$subscribeBannerData$1 = new ImportNoticeVM$subscribeBannerData$1(this.this$0, this.$symbol, continuation);
        importNoticeVM$subscribeBannerData$1.L$0 = obj;
        return importNoticeVM$subscribeBannerData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImportNoticeVM$subscribeBannerData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(this.this$0.m22028E().m21297a("/delivery/block"), new C119941(null));
            final ImportNoticeVM importNoticeVM = this.this$0;
            final String str = this.$symbol;
            InterfaceC41635f interfaceC41635f = new InterfaceC41635f() { // from class: com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1.2

                /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: ImportNoticeVM.kt */
                @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$subscribeBannerData$1$2$1", m90122f = "ImportNoticeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
                @SourceDebugExtension({"SMAP\nImportNoticeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$subscribeBannerData$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n774#2:164\n865#2,2:165\n*S KotlinDebug\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$subscribeBannerData$1$2$1\n*L\n141#1:164\n141#1:165,2\n*E\n"})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<SpotBannerEntity, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ ImportNoticeVM this$0;

                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(SpotBannerEntity spotBannerEntity, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(spotBannerEntity, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ImportNoticeVM importNoticeVM, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = importNoticeVM;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX INFO: renamed from: f */
                    public static final UiState m22054f(List list, boolean z11, UiState uiState) {
                        return UiState.copy$default(uiState, null, list, null, z11, !z11, !z11, 5, null);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        final List listEmptyList;
                        String id2;
                        SpotBannerEntity spotBannerEntity = (SpotBannerEntity) this.L$0;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        List<SpotBannerItemEntity> list = spotBannerEntity.getList();
                        if (list != null) {
                            listEmptyList = new ArrayList();
                            for (T t11 : list) {
                                SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) t11;
                                if (spotBannerItemEntity.getNoticeType() == 2 && (id2 = spotBannerItemEntity.getId()) != null && C11711r.m21307c(id2)) {
                                    listEmptyList.add(t11);
                                }
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        final boolean z11 = !listEmptyList.isEmpty();
                        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.notice.o
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ImportNoticeVM$subscribeBannerData$1.C119952.AnonymousClass1.m22054f(listEmptyList, z11, (UiState) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(SpotBannerPushEntity spotBannerPushEntity, Continuation<? super Unit> continuation) {
                    if (!C41713n0.m91132h(interfaceC41709m0)) {
                        return Unit.INSTANCE;
                    }
                    if (!Intrinsics.areEqual(spotBannerPushEntity.getType(), "noticeUpdate")) {
                        return Unit.INSTANCE;
                    }
                    Object objM42823d = RetrofitFlowExKt.m42823d(importNoticeVM.m22027B().m97924c("KC", "default", str), false, new AnonymousClass1(importNoticeVM, null), continuation);
                    return objM42823d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42823d : Unit.INSTANCE;
                }
            };
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            if (interfaceC41634eM90917h.collect(interfaceC41635f, this) == coroutine_suspended) {
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
