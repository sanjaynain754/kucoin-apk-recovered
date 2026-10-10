package com.kubi.core.spot.helper;

import com.google.firebase.messaging.Constants;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.spot.api.ISpotService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.spot.helper.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeManagerProxy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001c\u0010\f\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0012\u001a\u00020\u0010¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/core/spot/helper/TradeManagerProxy;", "", "<init>", "()V", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "Lcom/kubi/data/entity/MaintenanceEntity;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "allowCancelOrder", "", "symbol", "", "getMaintenance", "getNotifyMaintenanceEventKey", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeManagerProxy {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeManagerProxy f21264a = new TradeManagerProxy();

    /* JADX INFO: renamed from: a */
    public final boolean m23361a(@Nullable String str) {
        return ISpotService.f49646a.get().mo59995h(str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23362b(@Nullable String str) {
        return ISpotService.f49646a.get().mo59992c(str);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m23363c() {
        return ISpotCommonService.f49644a.get().mo59978v();
    }
}
