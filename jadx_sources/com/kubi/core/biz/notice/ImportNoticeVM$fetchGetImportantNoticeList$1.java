package com.kubi.core.biz.notice;

import com.kubi.core.biz.banner.C11711r;
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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImportNoticeVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$fetchGetImportantNoticeList$1", m90122f = "ImportNoticeVM.kt", m90123i = {1, 1, 1, 1, 1, 1}, m90124l = {85, 105}, m90125m = "invokeSuspend", m90126n = {"$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-ImportNoticeVM$fetchGetImportantNoticeList$1$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nImportNoticeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$fetchGetImportantNoticeList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n25#2:164\n26#2:166\n1#3:165\n*S KotlinDebug\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$fetchGetImportantNoticeList$1\n*L\n103#1:164\n103#1:166\n103#1:165\n*E\n"})
public final class ImportNoticeVM$fetchGetImportantNoticeList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ImportNoticeVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeVM$fetchGetImportantNoticeList$1$1 */
    /* JADX INFO: compiled from: ImportNoticeVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$fetchGetImportantNoticeList$1$1", m90122f = "ImportNoticeVM.kt", m90123i = {0, 0, 0}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {"it", "importantList", "importShow"}, m90127s = {"L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nImportNoticeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$fetchGetImportantNoticeList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n774#2:164\n865#2,2:165\n*S KotlinDebug\n*F\n+ 1 ImportNoticeVM.kt\ncom/kubi/core/biz/notice/ImportNoticeVM$fetchGetImportantNoticeList$1$1\n*L\n86#1:164\n86#1:165,2\n*E\n"})
    public static final class C119931 extends SuspendLambda implements Function2<SpotBannerEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int I$0;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ImportNoticeVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotBannerEntity spotBannerEntity, Continuation<? super Unit> continuation) {
            return ((C119931) create(spotBannerEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119931(ImportNoticeVM importNoticeVM, String str, Continuation<? super C119931> continuation) {
            super(2, continuation);
            this.this$0 = importNoticeVM;
            this.$symbol = str;
        }

        /* JADX INFO: renamed from: f */
        public static final UiState m22049f(List list, boolean z11, UiState uiState) {
            return UiState.copy$default(uiState, null, list, null, z11, !z11, !z11, 5, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119931 c119931 = new C119931(this.this$0, this.$symbol, continuation);
            c119931.L$0 = obj;
            return c119931;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList;
            String id2;
            SpotBannerEntity spotBannerEntity = (SpotBannerEntity) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                List<SpotBannerItemEntity> list = spotBannerEntity.getList();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) obj2;
                        if (spotBannerItemEntity.getNoticeType() == 2 && (id2 = spotBannerItemEntity.getId()) != null && C11711r.m21307c(id2)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                final boolean z11 = ((arrayList == null || arrayList.isEmpty()) ? (char) 1 : (char) 0) ^ 1;
                this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.notice.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return ImportNoticeVM$fetchGetImportantNoticeList$1.C119931.m22049f(arrayList, z11, (UiState) obj3);
                    }
                });
                this.this$0.f20541Y.close();
                this.this$0.m22031I(this.$symbol);
                ImportNoticeVM importNoticeVM = this.this$0;
                String str = this.$symbol;
                this.L$0 = SpillingKt.nullOutSpilledVariable(spotBannerEntity);
                this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.I$0 = z11 ? 1 : 0;
                this.label = 1;
                if (importNoticeVM.m22044D(str, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeVM$fetchGetImportantNoticeList$1(ImportNoticeVM importNoticeVM, String str, Continuation<? super ImportNoticeVM$fetchGetImportantNoticeList$1> continuation) {
        super(2, continuation);
        this.this$0 = importNoticeVM;
        this.$symbol = str;
    }

    /* JADX INFO: renamed from: f */
    public static final UiState m22047f(UiState uiState) {
        return UiState.copy$default(uiState, null, null, null, false, false, false, 53, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImportNoticeVM$fetchGetImportantNoticeList$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImportNoticeVM$fetchGetImportantNoticeList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r1.m22044D(r3, r8) == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e<SpotBannerEntity> interfaceC41634eM97924c = this.this$0.m22027B().m97924c("KC", "default", this.$symbol);
        C119931 c119931 = new C119931(this.this$0, this.$symbol, null);
        this.label = 1;
        obj = RetrofitFlowExKt.m42823d(interfaceC41634eM97924c, false, c119931, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C19334f c19334f = (C19334f) obj;
        ImportNoticeVM importNoticeVM = this.this$0;
        String str = this.$symbol;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            importNoticeVM.updateState(new Function1() { // from class: com.kubi.core.biz.notice.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ImportNoticeVM$fetchGetImportantNoticeList$1.m22047f((UiState) obj2);
                }
            });
            this.L$0 = c19334f;
            this.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
            this.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
