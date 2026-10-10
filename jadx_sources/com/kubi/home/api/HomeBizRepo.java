package com.kubi.home.api;

import com.kubi.home.entity.GridNavigationMoreEntity;
import com.kubi.home.entity.GridNavigationSaveReqEntity;
import com.kubi.home.v2.biz.kuming.KuMiningDataEntity;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36719d;
import kotlinx.coroutines.flow.C41636g;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeBizRepo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\rR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/api/HomeBizRepo;", "", "<init>", "()V", "api", "Lcom/kubi/home/api/HomeBizApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/home/api/HomeBizApi;", "api$delegate", "Lkotlin/Lazy;", "cachedGridNavigationMore", "Lcom/kubi/home/entity/GridNavigationMoreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGridNavigationMore", "saveHomeGridNavigation", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/GridNavigationSaveReqEntity;", "(Lcom/kubi/home/entity/GridNavigationSaveReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchKuMiningData", "Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeBizRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeBizRepo.kt\ncom/kubi/home/api/HomeBizRepo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,77:1\n32#2:78\n23#2,2:82\n196#3,3:79\n*S KotlinDebug\n*F\n+ 1 HomeBizRepo.kt\ncom/kubi/home/api/HomeBizRepo\n*L\n33#1:78\n45#1:82,2\n35#1:79,3\n*E\n"})
public final class HomeBizRepo {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f25432b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f25433a = LazyKt.lazy(new Function0() { // from class: com.kubi.home.api.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeBizRepo.m28939b();
        }
    });

    /* JADX INFO: compiled from: HomeBizRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/api/HomeBizRepo$Companion;", "", "<init>", "()V", "TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m28940c(@NotNull Continuation<? super GridNavigationMoreEntity> continuation) {
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82263h(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new HomeBizRepo$cachedGridNavigationMore$$inlined$fromJsonOrNull$1(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m28941d(@NotNull Continuation<? super KuMiningDataEntity> continuation) {
        HomeBizRepo$fetchKuMiningData$1 homeBizRepo$fetchKuMiningData$1;
        if (continuation instanceof HomeBizRepo$fetchKuMiningData$1) {
            homeBizRepo$fetchKuMiningData$1 = (HomeBizRepo$fetchKuMiningData$1) continuation;
            int i11 = homeBizRepo$fetchKuMiningData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeBizRepo$fetchKuMiningData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeBizRepo$fetchKuMiningData$1 = new HomeBizRepo$fetchKuMiningData$1(this, continuation);
            }
        } else {
            homeBizRepo$fetchKuMiningData$1 = new HomeBizRepo$fetchKuMiningData$1(this, continuation);
        }
        Object objM28958c = homeBizRepo$fetchKuMiningData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeBizRepo$fetchKuMiningData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28958c);
                HomeBizApi homeBizApiM28942e = m28942e();
                homeBizRepo$fetchKuMiningData$1.label = 1;
                objM28958c = homeBizApiM28942e.m28958c(homeBizRepo$fetchKuMiningData$1);
                if (objM28958c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28958c);
            }
            return (KuMiningDataEntity) objM28958c;
        } catch (Exception e11) {
            C44128b.m97263g("HomeBizRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final HomeBizApi m28942e() {
        return (HomeBizApi) this.f25433a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m28943f(@NotNull Continuation<? super GridNavigationMoreEntity> continuation) {
        HomeBizRepo$getGridNavigationMore$1 homeBizRepo$getGridNavigationMore$1;
        if (continuation instanceof HomeBizRepo$getGridNavigationMore$1) {
            homeBizRepo$getGridNavigationMore$1 = (HomeBizRepo$getGridNavigationMore$1) continuation;
            int i11 = homeBizRepo$getGridNavigationMore$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeBizRepo$getGridNavigationMore$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeBizRepo$getGridNavigationMore$1 = new HomeBizRepo$getGridNavigationMore$1(this, continuation);
            }
        } else {
            homeBizRepo$getGridNavigationMore$1 = new HomeBizRepo$getGridNavigationMore$1(this, continuation);
        }
        Object objM28960e = homeBizRepo$getGridNavigationMore$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeBizRepo$getGridNavigationMore$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28960e);
                HomeBizApi homeBizApiM28942e = m28942e();
                homeBizRepo$getGridNavigationMore$1.label = 1;
                objM28960e = homeBizApiM28942e.m28960e(homeBizRepo$getGridNavigationMore$1);
                if (objM28960e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28960e);
            }
            GridNavigationMoreEntity gridNavigationMoreEntity = (GridNavigationMoreEntity) objM28960e;
            if (gridNavigationMoreEntity == null) {
                return null;
            }
            if (gridNavigationMoreEntity.getNavigationList() != null) {
                StorageId<String> storageIdM82263h = C36719d.f79632a.m82263h();
                String strM66606i = C27029c.m66606i(gridNavigationMoreEntity);
                Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
                C46392a.m102333p(storageIdM82263h, strM66606i);
            }
            return gridNavigationMoreEntity;
        } catch (Exception e11) {
            C44128b.m97263g("HomeBizRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m28944g(@NotNull GridNavigationSaveReqEntity gridNavigationSaveReqEntity, @NotNull Continuation<? super Boolean> continuation) {
        HomeBizRepo$saveHomeGridNavigation$1 homeBizRepo$saveHomeGridNavigation$1;
        if (continuation instanceof HomeBizRepo$saveHomeGridNavigation$1) {
            homeBizRepo$saveHomeGridNavigation$1 = (HomeBizRepo$saveHomeGridNavigation$1) continuation;
            int i11 = homeBizRepo$saveHomeGridNavigation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeBizRepo$saveHomeGridNavigation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeBizRepo$saveHomeGridNavigation$1 = new HomeBizRepo$saveHomeGridNavigation$1(this, continuation);
            }
        } else {
            homeBizRepo$saveHomeGridNavigation$1 = new HomeBizRepo$saveHomeGridNavigation$1(this, continuation);
        }
        Object objM28957b = homeBizRepo$saveHomeGridNavigation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeBizRepo$saveHomeGridNavigation$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM28957b);
                HomeBizApi homeBizApiM28942e = m28942e();
                homeBizRepo$saveHomeGridNavigation$1.L$0 = SpillingKt.nullOutSpilledVariable(gridNavigationSaveReqEntity);
                homeBizRepo$saveHomeGridNavigation$1.label = 1;
                objM28957b = homeBizApiM28942e.m28957b(gridNavigationSaveReqEntity, homeBizRepo$saveHomeGridNavigation$1);
                if (objM28957b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28957b);
            }
            return (Boolean) objM28957b;
        } catch (Exception e11) {
            C19331c.m42836c(e11, null, 2, null);
            C44128b.m97263g("HomeBizRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final HomeBizApi m28939b() {
        return (HomeBizApi) C42597a.m93388d().create(HomeBizApi.class);
    }
}
