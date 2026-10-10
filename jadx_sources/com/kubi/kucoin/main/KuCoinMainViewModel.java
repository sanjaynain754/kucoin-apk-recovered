package com.kubi.kucoin.main;

import android.annotation.SuppressLint;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.sdk.BaseViewModel;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.main.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuCoinMainViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u001a\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011J$\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kucoin/main/KuCoinMainViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "mLastRequestTime", "", "showMaintenance", "Landroidx/lifecycle/MutableLiveData;", "", "getShowMaintenance", "()Landroidx/lifecycle/MutableLiveData;", "maintenanceStatus", "Lcom/kubi/data/entity/MaintenanceEntity;", "getMaintenanceStatus", "setUserConfig", "", FirebaseAnalytics.Param.CURRENCY, "", "shouldShowClearCNUserTip", "setShowClearCNUserTip", TIMPushProvider.f75062n, "currentIndex", "", "symbol", "setMaintenanceStatus", "it", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinMainViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    public long f27999X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f28000Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<MaintenanceEntity> f28001Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    public boolean f28002a0;

    /* JADX INFO: renamed from: z */
    public final void m32461z(MaintenanceEntity maintenanceEntity, int i11, String str) {
        if (i11 != 2) {
            MutableLiveData<Boolean> mutableLiveData = this.f28000Y;
            boolean z11 = false;
            if (C27025c.m66566d(maintenanceEntity.getMaintenanceV2())) {
                String appNoticeLocation = maintenanceEntity.getAppNoticeLocation();
                if (C27025c.m66567e(appNoticeLocation != null ? Boolean.valueOf(StringsKt.contains$default((CharSequence) appNoticeLocation, (CharSequence) C15443j0.f28004a[i11], false, 2, (Object) null)) : null, false)) {
                    z11 = true;
                }
            }
            mutableLiveData.setValue(Boolean.valueOf(z11));
        } else {
            this.f28000Y.setValue(Boolean.valueOf(ISpotService.f49646a.get().mo59992c(str)));
        }
        this.f28001Z.setValue(maintenanceEntity);
        this.f27999X = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m32448A(KuCoinMainViewModel kuCoinMainViewModel, MaintenanceEntity maintenanceEntity, int i11, String str, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        kuCoinMainViewModel.m32461z(maintenanceEntity, i11, str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m32452u(KuCoinMainViewModel kuCoinMainViewModel, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        kuCoinMainViewModel.m32459t(i11, str);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m32453v(KuCoinMainViewModel kuCoinMainViewModel, int i11, String str, MaintenanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kuCoinMainViewModel.m32461z(it, i11, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m32455x(KuCoinMainViewModel kuCoinMainViewModel, int i11, MaintenanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m32448A(kuCoinMainViewModel, it, i11, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m32456B(boolean z11) {
        this.f28002a0 = z11;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: C */
    public final void m32457C(@Nullable String str) {
        if (UserInfo.a.n()) {
            IUserService.a.get().j0(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<MaintenanceEntity> m32458s() {
        return this.f28001Z;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final MutableLiveData<Boolean> m32460y() {
        return this.f28000Y;
    }

    public KuCoinMainViewModel() {
        if (Intrinsics.areEqual("CNY", C41016c.m89965c())) {
            C41016c.m89971i("USD");
            m32457C("USD");
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m32454w(final KuCoinMainViewModel kuCoinMainViewModel, final int i11) {
        kuCoinMainViewModel.getF46845W().add(ISpotService.f49646a.get().mo60012y(new Function1() { // from class: com.kubi.kucoin.main.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainViewModel.m32455x(this.f27987b, i11, (MaintenanceEntity) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final void m32459t(final int i11, @Nullable final String str) {
        getF46845W().add(ISpotService.f49646a.get().mo59990a(new Function1() { // from class: com.kubi.kucoin.main.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainViewModel.m32453v(this.f27982b, i11, str, (MaintenanceEntity) obj);
            }
        }, new Function0() { // from class: com.kubi.kucoin.main.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMainViewModel.m32454w(this.f27985b, i11);
            }
        }));
    }
}
