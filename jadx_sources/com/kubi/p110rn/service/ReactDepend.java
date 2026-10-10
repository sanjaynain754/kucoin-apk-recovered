package com.kubi.p110rn.service;

import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.web.api.IWebService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ReactDepend.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/service/ReactDepend;", "", "<init>", "()V", "webService", "Lcom/kubi/web/api/IWebService;", "getUserService", "Lcom/kubi/user/api/IUserService;", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "getKuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReactDepend {

    @NotNull
    public static final ReactDepend INSTANCE = new ReactDepend();

    @NotNull
    public final IKuMexService getKuMexService() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    public final IQuoteFacadeService getQuoteFacadeService() {
        return IQuoteFacadeService.f41383a.get();
    }

    @NotNull
    public final ISpotService getSpotService() {
        return ISpotService.f49646a.get();
    }

    @NotNull
    public final IUserService getUserService() {
        return IUserService.a.get();
    }

    @NotNull
    public final IWebService webService() {
        return IWebService.f54644a.get();
    }

    private ReactDepend() {
    }
}
