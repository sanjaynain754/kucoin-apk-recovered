package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.futures.settings.vm.a */
/* JADX INFO: compiled from: BatchLeverageSupport.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m90084d2 = {"submitAllContractsLeverageAndRefresh", "", "primarySymbol", "", "leverage", "refreshLocalAfterBatchLeverageUpdate", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13521a {
    /* JADX INFO: renamed from: a */
    public static final void m26441a(String str, String str2) {
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
            interfaceC44980dM20288g.mo25017l(str, str2);
            interfaceC44980dM20288g.mo25013i();
            Result.m103844constructorimpl(interfaceC44980dM20288g.mo24980G());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m26442b(@NotNull String primarySymbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24473D(new AllContractLeverageUpdateRequest(primarySymbol, leverage));
        m26441a(primarySymbol, leverage);
    }
}
