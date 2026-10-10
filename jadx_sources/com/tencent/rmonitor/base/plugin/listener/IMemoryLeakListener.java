package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.InspectUUID;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;", "Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;", "onCheckingLeaked", "", "currentWaitSecond", "", "objInfo", "", "onFilter", "", "willCheckedObj", "", "onLeaked", "uuid", "Lcom/tencent/rmonitor/base/meta/InspectUUID;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IMemoryLeakListener extends IMemoryDumpListener {
    void onCheckingLeaked(int currentWaitSecond, @NotNull String objInfo);

    boolean onFilter(@NotNull Object willCheckedObj);

    boolean onLeaked(@NotNull InspectUUID uuid);
}
