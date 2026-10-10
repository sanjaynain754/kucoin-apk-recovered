package com.kubi.home.service;

import com.kubi.kumex.api.IKuMexService;
import com.kubi.mine.api.service.IMineService;
import com.kubi.qrcode.api.service.IQrCodeService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.home.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeDepend.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/service/HomeDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "kuCoinService", "Lcom/kubi/kucoin/api/IKuFacadeService;", "getOtcService", "Lcom/kubi/otc/api/IOtcService;", "kumexService", "Lcom/kubi/kumex/api/IKuMexService;", "adService", "Lcom/kubi/ad/api/service/IAdService;", "qrService", "Lcom/kubi/qrcode/api/service/IQrCodeService;", "mineService", "Lcom/kubi/mine/api/service/IMineService;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeDepend f26198a = new HomeDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IKuMexService m30222a() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IMineService m30223b() {
        return IMineService.f35025a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IQrCodeService m30224c() {
        return IQrCodeService.f40829a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IUserService m30225d() {
        return IUserService.a.get();
    }
}
