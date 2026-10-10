package com.kubi.loan.repo.platform;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.api.entity.LeverCoinConfig;
import io.reactivex.Flowable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406ko.C41086j;
import p436lo.InterfaceC42278a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IPlatformService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/loan/repo/platform/IPlatformService;", "Lcom/kubi/loan/repo/platform/IPlatformApi;", "getLeverCurrency", "", "getLeverCoinList", "Lio/reactivex/Flowable;", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "supportIsolated", "", "getLeverCoinConfig", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", FirebaseAnalytics.Param.CURRENCY, RemoteConfigComponent.FETCH_FILE_NAME, "Companion", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPlatformService extends InterfaceC42278a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32483a = Companion.f32484a;

    /* JADX INFO: compiled from: IPlatformService.kt */
    /* JADX INFO: loaded from: classes26.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/loan/repo/platform/IPlatformService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/loan/repo/platform/IPlatformService;", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f32484a = new Companion();

        @NotNull
        public final IPlatformService get() {
            return (IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    Flowable<List<CoinInfoEntity>> mo37797c(boolean z11);

    @Nullable
    /* JADX INFO: renamed from: e */
    LeverCoinConfig mo37798e(@NotNull String str, boolean z11);

    @NotNull
    /* JADX INFO: renamed from: f */
    String mo37799f();

    /* JADX INFO: renamed from: b */
    static /* synthetic */ LeverCoinConfig m37796b(IPlatformService iPlatformService, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLeverCoinConfig");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return iPlatformService.mo37798e(str, z11);
    }
}
