package com.jumio.core.network;

import com.jumio.sdk.enums.JumioDataCenter;
import jumio.core.AbstractC40552K0;
import jumio.core.AbstractC40642c;
import jumio.core.AbstractC40667h;
import jumio.core.C40682k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/network/DefaultBackendConfig;", "Lcom/jumio/core/network/BackendConfigInterface;", "<init>", "()V", "euSettings", "Lcom/jumio/core/network/BackendSettings;", "usSettings", "sgSettings", "get", "dataCenter", "Lcom/jumio/sdk/enums/JumioDataCenter;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultBackendConfig implements BackendConfigInterface {

    /* JADX INFO: renamed from: a */
    public final C40682k f14412a = new C40682k(AbstractC40667h.f90280b, AbstractC40642c.f90225b, AbstractC40642c.f90228e);

    /* JADX INFO: renamed from: b */
    public final C40682k f14413b = new C40682k(AbstractC40667h.f90279a, AbstractC40642c.f90224a, AbstractC40642c.f90227d);

    /* JADX INFO: renamed from: c */
    public final C40682k f14414c = new C40682k(AbstractC40667h.f90281c, AbstractC40642c.f90226c, AbstractC40642c.f90229f);

    @Override // com.jumio.core.network.BackendConfigInterface
    @NotNull
    public C40682k get(@NotNull JumioDataCenter dataCenter) {
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        int i11 = AbstractC40552K0.f90023a[dataCenter.ordinal()];
        if (i11 == 1) {
            return this.f14412a;
        }
        if (i11 == 2) {
            return this.f14413b;
        }
        if (i11 == 3) {
            return this.f14414c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
