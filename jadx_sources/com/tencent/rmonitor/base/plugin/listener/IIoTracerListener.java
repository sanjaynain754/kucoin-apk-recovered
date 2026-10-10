package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.CloseableLeakMeta;
import com.tencent.rmonitor.base.meta.IOMeta;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH&¨\u0006\u0013"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/IIoTracerListener;", "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "onCloseableLeakPublish", "", "meta", "Lcom/tencent/rmonitor/base/meta/CloseableLeakMeta;", "onIOInfoPublish", "metas", "", "Lcom/tencent/rmonitor/base/meta/IOMeta;", "onIOStart", "fd", "", "path", "", "time", "", "onIOStop", "ioMeta", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IIoTracerListener extends IBaseListener {
    void onCloseableLeakPublish(@NotNull CloseableLeakMeta meta);

    void onIOInfoPublish(@NotNull List<IOMeta> metas);

    void onIOStart(int fd2, @NotNull String path, long time);

    void onIOStop(int fd2, @NotNull String path, long time, @NotNull IOMeta ioMeta);
}
