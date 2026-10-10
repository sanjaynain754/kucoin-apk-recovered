package com.kubi.mine.lib.service;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.advert.api.IAdvertService;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.mine.api.service.IMineService;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27025c;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.AbstractC45585n0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.mine.lib.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MineDepend.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020%J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'J\u0006\u0010(\u001a\u00020\u001b¨\u0006)"}, m90084d2 = {"Lcom/kubi/mine/lib/service/MineDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "kucoinService", "Lcom/kubi/kucoin/api/IKuFacadeService;", "homeService", "Lcom/kubi/home/api/IHomeService;", "otcService", "Lcom/kubi/otc/api/IOtcService;", "noticeService", "Lcom/kubi/notice/api/service/INoticeService;", "helpCenterService", "Lcom/kubi/helpcenter/api/local/IHelpCenterService;", "spotService", "Lcom/kubi/spot/api/ISpotService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getSafeService", "Lcom/kubi/safe/api/service/ISafeService;", "autoCleanService", "Lcom/kubi/clean/api/service/IAutoCleanService;", "advertService", "Lcom/kubi/advert/api/IAdvertService;", "hasLogin", "", "getUserLevelChange", "checkAppUpgrade", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "isPageShow", "Lkotlin/Function0;", "refreshUserInfo", "getLoginEntity", "Lcom/kubi/user/model/LoginUserEntity;", "getUserInfoObs", "Lio/reactivex/Observable;", "isRestrictedKyc", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMineDepend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineDepend.kt\ncom/kubi/mine/lib/service/MineDepend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class MineDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MineDepend f35159a = new MineDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IAdvertService m41822a() {
        return IAdvertService.f15070a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IAutoCleanService m41823b() {
        return IAutoCleanService.f19482a.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m41824c(@NotNull BaseFragment fragment, @NotNull Function0<Boolean> isPageShow) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(isPageShow, "isPageShow");
        if (m41831j() != null) {
            IMineService iMineService = IMineService.f35025a.get();
            AbstractC45585n0.a aVar = new AbstractC45585n0.a();
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            iMineService.mo41626i(aVar, childFragmentManager, LifecycleOwnerKt.getLifecycleScope(fragment), isPageShow, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IAssetsCenterService m41825d() {
        return IAssetsCenterService.f16464a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ISafeService m41827f() {
        return ISafeService.f46324a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Observable<LoginUserEntity> m41828g() {
        return UserInfo.a.j();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final IKuFacadeService m41831j() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuFacadeService.f27711a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IKuFacadeService) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ISpotService m41833l() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ISpotService.f49646a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (ISpotService) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final IUserService m41834m() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IUserService.a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IUserService) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final LoginUserEntity m41826e() {
        LoginUserEntity loginUserEntityD0;
        IUserService iUserServiceM41834m = m41834m();
        if (iUserServiceM41834m != null && (loginUserEntityD0 = iUserServiceM41834m.d0()) != null) {
            return loginUserEntityD0;
        }
        return new LoginUserEntity();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m41829h() {
        Boolean boolValueOf;
        IUserService iUserServiceM41834m = m41834m();
        if (iUserServiceM41834m != null) {
            boolValueOf = Boolean.valueOf(iUserServiceM41834m.c());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m41830i() {
        Boolean boolValueOf;
        IUserService iUserServiceM41834m = m41834m();
        if (iUserServiceM41834m != null) {
            boolValueOf = Boolean.valueOf(iUserServiceM41834m.q());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: k */
    public final void m41832k() {
        IUserService iUserServiceM41834m = m41834m();
        if (iUserServiceM41834m != null) {
            IUserService.z(iUserServiceM41834m, (Function0) null, 1, (Object) null);
        }
    }
}
