package com.kubi.spot.service;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.operation.api.IOperationService;
import com.kubi.otc.api.IOtcService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.service.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotDepend.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/spot/service/SpotDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getOtcService", "Lcom/kubi/otc/api/IOtcService;", "getKuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "getOperationService", "Lcom/kubi/operation/api/IOperationService;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SpotDepend f51244a = new SpotDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IAssetsCenterService m63031a() {
        return IAssetsCenterService.f16464a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IKuMexService m63032b() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IMarginService m63033c() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IOperationService m63034d() {
        return IOperationService.f36504a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IOtcService m63035e() {
        return IOtcService.f37164a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final IUserService m63036f() {
        return IUserService.a.get();
    }
}
