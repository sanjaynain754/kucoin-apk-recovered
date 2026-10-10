package com.kubi.home.main.refresh;

import android.widget.ImageView;
import com.kubi.home.api.HomeBizApi;
import com.kubi.home.common.p086ex.ViewExKt;
import com.kubi.home.entity.CmsAdEntity;
import com.kubi.home.entity.PullRefreshConfigEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27100x0;
import dj.C36716a;
import dj.C36719d;
import fj.C37529l;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import y70.C46392a;

/* JADX INFO: compiled from: HomePullRefresh.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.refresh.HomePullRefresh$fetchTwoLevelConfig$1", m90122f = "HomePullRefresh.kt", m90123i = {0, 1, 1, 2, 2, 2}, m90124l = {132, 143, 150}, m90125m = "invokeSuspend", m90126n = {"startTime", "data", "startTime", "data", "startTime", "delayTime"}, m90127s = {"J$0", "L$0", "J$0", "L$0", "J$0", "J$1"})
@SourceDebugExtension({"SMAP\nHomePullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePullRefresh.kt\ncom/kubi/home/main/refresh/HomePullRefresh$fetchTwoLevelConfig$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,304:1\n136#2:305\n*S KotlinDebug\n*F\n+ 1 HomePullRefresh.kt\ncom/kubi/home/main/refresh/HomePullRefresh$fetchTwoLevelConfig$1\n*L\n145#1:305\n*E\n"})
public final class HomePullRefresh$fetchTwoLevelConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    final /* synthetic */ HomePullRefresh this$0;

    /* JADX INFO: renamed from: com.kubi.home.main.refresh.HomePullRefresh$fetchTwoLevelConfig$1$2 */
    /* JADX INFO: compiled from: HomePullRefresh.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.refresh.HomePullRefresh$fetchTwoLevelConfig$1$2", m90122f = "HomePullRefresh.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146402 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HomePullRefresh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146402(HomePullRefresh homePullRefresh, Continuation<? super C146402> continuation) {
            super(2, continuation);
            this.this$0 = homePullRefresh;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146402(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C146402) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m29440f(HomePullRefresh homePullRefresh) throws Throwable {
            String icon;
            PullRefreshConfigEntity pullRefreshConfigEntity = homePullRefresh.f25796e;
            if (pullRefreshConfigEntity != null) {
                icon = pullRefreshConfigEntity.getIcon();
            } else {
                icon = null;
            }
            C36716a.m82239b(icon);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final HomePullRefresh homePullRefresh = this.this$0;
                C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomePullRefresh$fetchTwoLevelConfig$1.C146402.m29440f(homePullRefresh);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePullRefresh$fetchTwoLevelConfig$1(HomePullRefresh homePullRefresh, Continuation<? super HomePullRefresh$fetchTwoLevelConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = homePullRefresh;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomePullRefresh$fetchTwoLevelConfig$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomePullRefresh$fetchTwoLevelConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(r4, r16) == r6) goto L45;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object objM42826g;
        HashMap map;
        long j11;
        List list;
        CmsAdEntity cmsAdEntity;
        ImageView imageView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC41634e<HashMap<String, List<CmsAdEntity>>> interfaceC41634eM28956a = ((HomeBizApi) RetrofitFlowExKt.m42820a(HomeBizApi.class)).m28956a(MultiLanguageManager.f46811g.getLocalString());
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM28956a, false, null, this, 2, null);
            if (objM42826g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            long j12 = this.J$0;
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = j12;
            objM42826g = obj;
        } else {
            if (i11 == 2) {
                j11 = this.J$0;
                map = (HashMap) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!C46392a.m102322d(C36719d.f79632a.m82268m(), false)) {
                    long jCoerceAtLeast = RangesKt.coerceAtLeast(2000 - (System.currentTimeMillis() - j11), 0L);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(map);
                    this.J$0 = j11;
                    this.J$1 = jCoerceAtLeast;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.m29433r();
        return Unit.INSTANCE;
        map = (HashMap) ((C19334f) objM42826g).m42846a();
        if (map != null && (list = (List) map.get("app-drop-down")) != null && (cmsAdEntity = (CmsAdEntity) CollectionsKt.firstOrNull(list)) != null) {
            HomePullRefresh homePullRefresh = this.this$0;
            String strIconUrl = cmsAdEntity.iconUrl();
            String alt = cmsAdEntity.getAlt();
            if (alt == null) {
                alt = "";
            }
            String url = cmsAdEntity.getUrl();
            homePullRefresh.f25796e = new PullRefreshConfigEntity(strIconUrl, alt, url != null ? url : "");
            C37529l c37529l = homePullRefresh.f25797f;
            if (c37529l != null && (imageView = c37529l.f83361c) != null) {
                ViewExKt.m29094e(imageView, cmsAdEntity.iconUrl(), 0, 2, null);
            }
        }
        if (this.this$0.f25796e == null) {
            return Unit.INSTANCE;
        }
        AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
        C146402 c146402 = new C146402(this.this$0, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(map);
        this.J$0 = jCurrentTimeMillis;
        this.label = 2;
        if (C41686h.m91049g(abstractC41697j0M94120b, c146402, this) != coroutine_suspended) {
            j11 = jCurrentTimeMillis;
            if (!C46392a.m102322d(C36719d.f79632a.m82268m(), false)) {
                long jCoerceAtLeast2 = RangesKt.coerceAtLeast(2000 - (System.currentTimeMillis() - j11), 0L);
                this.L$0 = SpillingKt.nullOutSpilledVariable(map);
                this.J$0 = j11;
                this.J$1 = jCoerceAtLeast2;
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
