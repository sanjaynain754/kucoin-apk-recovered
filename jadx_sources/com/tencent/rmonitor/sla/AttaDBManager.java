package com.tencent.rmonitor.sla;

import com.tencent.bugly.proguard.C33986vi;
import com.tencent.rmonitor.base.p144db.table.AttaEventTable;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaDBManager;", "", "()V", "LIMIT", "", "TAG", "isLocalDataReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "batchDeleteData", "", "list", "", "Lcom/tencent/rmonitor/sla/AttaEvent;", "batchSaveData", "", "deleteData", "attaEvent", "reportLocalData", "saveData", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaDBManager {

    @NotNull
    private static final String LIMIT = "30";

    @NotNull
    private static final String TAG = "RMonitor_sla_AttaDBManager";

    @NotNull
    public static final AttaDBManager INSTANCE = new AttaDBManager();

    @NotNull
    private static AtomicBoolean isLocalDataReported = new AtomicBoolean(false);

    public final int batchDeleteData(@NotNull List<AttaEvent> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int iBatchDelete = AttaEventTable.INSTANCE.getInstance().batchDelete(list);
        Logger.INSTANCE.mo77130d(TAG, C33986vi.m75326a("deleteDataInDB count:", iBatchDelete));
        return iBatchDelete;
    }

    public final void batchSaveData(@NotNull List<AttaEvent> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Logger.INSTANCE.mo77130d(TAG, "batchSaveData size:" + list.size());
        if (!isLocalDataReported.get()) {
            reportLocalData();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AttaEventTable.INSTANCE.getInstance().replace((AttaEvent) it.next());
        }
    }

    public final int deleteData(@NotNull AttaEvent attaEvent) {
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        Logger.INSTANCE.mo77130d(TAG, "deleteData , eventCode:" + attaEvent.getEventCode());
        return AttaEventTable.INSTANCE.getInstance().delete(attaEvent);
    }

    public final void reportLocalData() {
        if (!isLocalDataReported.compareAndSet(false, true)) {
            Logger.INSTANCE.mo77130d(TAG, "already report local data");
            return;
        }
        List<AttaEvent> listQuery$default = AttaEventTable.query$default(AttaEventTable.INSTANCE.getInstance(), null, null, null, false, null, null, null, "30", 127, null);
        Logger.INSTANCE.mo77130d(TAG, "reportLocalData , size:" + listQuery$default.size());
        if (!listQuery$default.isEmpty() && AttaEventReporter.INSTANCE.getInstance().batchReportSync(listQuery$default, false)) {
            batchDeleteData(listQuery$default);
        }
    }

    public final void saveData(@NotNull AttaEvent attaEvent) {
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        Logger.INSTANCE.mo77130d(TAG, "saveData eventCode:" + attaEvent.getEventCode());
        if (!isLocalDataReported.get()) {
            reportLocalData();
        }
        AttaEventTable.INSTANCE.getInstance().replace(attaEvent);
    }

    private AttaDBManager() {
    }
}
