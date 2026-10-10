package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.meta.InspectUUID;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34032y4 implements IMemoryLeakListener {
    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public boolean onFilter(@NotNull Object obj) {
        return false;
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public boolean onLeaked(@NotNull InspectUUID inspectUUID) {
        return true;
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    @Nullable
    public List<String> onPrepareDump(@NotNull String str) {
        return new ArrayList();
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    public void onHprofDumped(@NotNull String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener
    public void onCheckingLeaked(int i11, @NotNull String str) {
    }

    @Override // com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener
    public void onFinishDump(boolean z11, @NotNull String str, @NotNull String str2) {
    }
}
