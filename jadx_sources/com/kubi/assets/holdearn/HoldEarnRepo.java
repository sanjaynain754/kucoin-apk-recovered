package com.kubi.assets.holdearn;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: HoldEarnRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnRepo;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "getHoldEarnCardInfo", "Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HoldEarnRepo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HoldEarnRepo f17741a = new HoldEarnRepo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17742b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.holdearn.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HoldEarnRepo.m17381b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final AssetV2Api m17382c() {
        return (AssetV2Api) f17742b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m17383d(@NotNull Continuation<? super HoldEarnInfoEntity> continuation) {
        HoldEarnRepo$getHoldEarnCardInfo$1 holdEarnRepo$getHoldEarnCardInfo$1;
        Object objM103844constructorimpl;
        Integer type;
        if (continuation instanceof HoldEarnRepo$getHoldEarnCardInfo$1) {
            holdEarnRepo$getHoldEarnCardInfo$1 = (HoldEarnRepo$getHoldEarnCardInfo$1) continuation;
            int i11 = holdEarnRepo$getHoldEarnCardInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                holdEarnRepo$getHoldEarnCardInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                holdEarnRepo$getHoldEarnCardInfo$1 = new HoldEarnRepo$getHoldEarnCardInfo$1(this, continuation);
            }
        } else {
            holdEarnRepo$getHoldEarnCardInfo$1 = new HoldEarnRepo$getHoldEarnCardInfo$1(this, continuation);
        }
        Object objM90884H = holdEarnRepo$getHoldEarnCardInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = holdEarnRepo$getHoldEarnCardInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90884H);
                if (!C24129b.m58030b(SiteVisibleConfigKey.Financing) || !C24129b.m58030b(SiteVisibleConfigKey.EARN_HOLD_TO_EARN) || !IUserService.a.get().c() || UserInfo.c().getType() == 3) {
                    return null;
                }
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e<HoldEarnInfoEntity> interfaceC41634eM17110X = m17382c().m17110X();
                holdEarnRepo$getHoldEarnCardInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(this);
                holdEarnRepo$getHoldEarnCardInfo$1.I$0 = 0;
                holdEarnRepo$getHoldEarnCardInfo$1.label = 1;
                objM90884H = C41636g.m90884H(interfaceC41634eM17110X, holdEarnRepo$getHoldEarnCardInfo$1);
                if (objM90884H == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90884H);
            }
            HoldEarnInfoEntity holdEarnInfoEntity = (HoldEarnInfoEntity) objM90884H;
            if (holdEarnInfoEntity != null && (type = holdEarnInfoEntity.getType()) != null && type.intValue() == 2) {
                return holdEarnInfoEntity;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: b */
    public static final AssetV2Api m17381b() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
