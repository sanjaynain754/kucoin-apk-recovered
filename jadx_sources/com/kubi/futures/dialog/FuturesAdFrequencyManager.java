package com.kubi.futures.dialog;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.futures.dialog.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesAdDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/dialog/FuturesAdFrequencyManager;", "", "<init>", "()V", "ONE_DAY_IN_MILLIS", "", "THREE_DAYS_IN_MILLIS", "SEVEN_DAYS_IN_MILLIS", "shouldShowPopup", "", "id", "", "onReset", "", "onClose", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesAdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdFrequencyManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,188:1\n153#2,2:189\n153#2,2:192\n144#2,2:195\n144#2,2:197\n144#2,2:199\n153#2,2:201\n144#2,2:204\n178#3:191\n178#3:194\n178#3:203\n*S KotlinDebug\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdFrequencyManager\n*L\n132#1:189,2\n162#1:192,2\n166#1:195,2\n167#1:197,2\n168#1:199,2\n177#1:201,2\n180#1:204,2\n132#1:191\n162#1:194\n177#1:203\n*E\n"})
public final class FuturesAdFrequencyManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesAdFrequencyManager f22826a = new FuturesAdFrequencyManager();

    /* JADX INFO: renamed from: b */
    public static final long f22827b;

    /* JADX INFO: renamed from: c */
    public static final long f22828c;

    /* JADX INFO: renamed from: d */
    public static final long f22829d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f22827b = timeUnit.toMillis(1L);
        f22828c = timeUnit.toMillis(3L);
        f22829d = timeUnit.toMillis(7L);
    }

    /* JADX INFO: renamed from: a */
    public final void m25276a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        StorageId<PopData> storageIdM103264d0 = C46894j.f104736a.m103264d0(id2);
        PopData popData = (PopData) C46392a.f104043a.m102336j(storageIdM103264d0, PopData.class, null);
        if (popData == null) {
            popData = new PopData(0, 0L, 3, null);
        }
        C46392a.m102331n(storageIdM103264d0, popData.copy(popData.getCloseCount() + 1, System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: b */
    public final void m25277b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        StorageId<PopData> storageIdM103264d0 = C46894j.f104736a.m103264d0(id2);
        PopData popData = (PopData) C46392a.f104043a.m102336j(storageIdM103264d0, PopData.class, null);
        if (popData == null) {
            popData = new PopData(0, 0L, 3, null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int closeCount = popData.getCloseCount();
        if (closeCount == 0 || closeCount == 1 || closeCount == 2) {
            C46392a.m102331n(storageIdM103264d0, popData.copy(0, jCurrentTimeMillis));
        } else if (closeCount == 3 || closeCount == 4) {
            C46392a.m102331n(storageIdM103264d0, popData.copy(3, jCurrentTimeMillis));
        } else {
            C46392a.m102331n(storageIdM103264d0, popData.copy(5, jCurrentTimeMillis));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25278c(@NotNull String id2) {
        long j11;
        Intrinsics.checkNotNullParameter(id2, "id");
        PopData popData = (PopData) C46392a.f104043a.m102336j(C46894j.f104736a.m103264d0(id2), PopData.class, null);
        if (popData == null) {
            popData = new PopData(0, 0L, 3, null);
        }
        int closeCount = popData.getCloseCount();
        long lastCloseTime = popData.getLastCloseTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lastCloseTime <= 0) {
            return true;
        }
        long j12 = jCurrentTimeMillis - lastCloseTime;
        if (closeCount == 1 || closeCount == 2) {
            j11 = f22827b;
        } else {
            j11 = (closeCount == 3 || closeCount == 4) ? f22828c : f22829d;
        }
        return j12 >= j11;
    }
}
