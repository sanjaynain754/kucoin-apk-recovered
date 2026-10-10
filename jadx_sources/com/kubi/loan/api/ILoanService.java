package com.kubi.loan.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ILoanService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH&J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/loan/api/ILoanService;", "", "getLeverBorrowMin", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "getLeverBorrowUnit", "getLeverConfig", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "getLeverConfigForBridge", RemoteConfigComponent.FETCH_FILE_NAME, "", "fetchLeverConfigListForBridge", "Lio/reactivex/Observable;", "", "needRate", "fetchReferRate", "Lcom/kubi/sdk/base/entity/BaseEntity;", "amount", "Companion", "LoanApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ILoanService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32363a = Companion.f32364a;

    /* JADX INFO: compiled from: ILoanService.kt */
    /* JADX INFO: loaded from: classes26.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/loan/api/ILoanService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/loan/api/ILoanService;", "LoanApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f32364a = new Companion();

        @NotNull
        public final ILoanService get() {
            return (ILoanService) Router.f46192a.m56192n(ILoanService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal mo37703a(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<List<LeverCoinConfig>> mo37704b(boolean z11);

    @Nullable
    /* JADX INFO: renamed from: c */
    BigDecimal mo37705c(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BigDecimal>> mo37706e(@Nullable BigDecimal bigDecimal, @Nullable String str);

    @Nullable
    /* JADX INFO: renamed from: f */
    LeverCoinConfig mo37707f(@NotNull String str, boolean z11);

    @Nullable
    /* JADX INFO: renamed from: g */
    LeverCoinConfig mo37708g(@NotNull String str);

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Observable m37702d(ILoanService iLoanService, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLeverConfigListForBridge");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return iLoanService.mo37704b(z11);
    }
}
