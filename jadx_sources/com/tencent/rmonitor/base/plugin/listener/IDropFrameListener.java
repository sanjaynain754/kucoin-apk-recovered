package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/IDropFrameListener;", "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "onRecordData", "", "meta", "Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IDropFrameListener extends IBaseListener {
    void onRecordData(@Nullable DropFrameResultMeta meta);
}
