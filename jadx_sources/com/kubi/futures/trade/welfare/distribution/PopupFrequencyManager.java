package com.kubi.futures.trade.welfare.distribution;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.r0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PopupFrequencyManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/PopupFrequencyManager;", "", "<init>", "()V", "shouldShowPopup", "", "storageId", "Lcom/kubi/utils/storage/StorageId;", "Lcom/kubi/futures/trade/welfare/distribution/PopupData;", "onPopupClosed", "", "onPopupInteracted", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPopupFrequencyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupFrequencyManager.kt\ncom/kubi/futures/trade/welfare/distribution/PopupFrequencyManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,89:1\n153#2,2:90\n153#2,2:93\n144#2,2:96\n153#2,2:98\n144#2,2:101\n178#3:92\n178#3:95\n178#3:100\n*S KotlinDebug\n*F\n+ 1 PopupFrequencyManager.kt\ncom/kubi/futures/trade/welfare/distribution/PopupFrequencyManager\n*L\n32#1:90,2\n53#1:93,2\n69#1:96,2\n77#1:98,2\n87#1:101,2\n32#1:92\n53#1:95\n77#1:100\n*E\n"})
public final class PopupFrequencyManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PopupFrequencyManager f24773a = new PopupFrequencyManager();

    /* JADX INFO: renamed from: a */
    public final void m28614a(@NotNull StorageId<PopupData> storageId) {
        Intrinsics.checkNotNullParameter(storageId, "storageId");
        PopupData popupData = (PopupData) C46392a.f104043a.m102336j(storageId, PopupData.class, null);
        if (popupData == null) {
            popupData = new PopupData(0L, 0, 0, 7, null);
        }
        int i11 = 1;
        int consecutiveCloseCount = popupData.getConsecutiveCloseCount() + 1;
        if (consecutiveCloseCount >= 5) {
            i11 = 7;
        } else if (consecutiveCloseCount >= 3) {
            i11 = 3;
        }
        C46392a.m102331n(storageId, popupData.copy(System.currentTimeMillis(), consecutiveCloseCount, i11));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28615b(@NotNull StorageId<PopupData> storageId) {
        Intrinsics.checkNotNullParameter(storageId, "storageId");
        PopupData popupData = (PopupData) C46392a.f104043a.m102336j(storageId, PopupData.class, null);
        if (popupData == null) {
            popupData = new PopupData(0L, 0, 0, 7, null);
        }
        return popupData.getLastCloseTimestamp() == 0 || System.currentTimeMillis() - popupData.getLastCloseTimestamp() >= TimeUnit.DAYS.toMillis((long) popupData.getCurrentCooldownDays());
    }
}
