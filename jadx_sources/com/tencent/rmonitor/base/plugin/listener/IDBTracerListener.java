package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.base.meta.DBMeta;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/IDBTracerListener;", "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "onDBInfoPublish", "", "metas", "", "Lcom/tencent/rmonitor/base/meta/DBMeta;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IDBTracerListener extends IBaseListener {
    void onDBInfoPublish(@NotNull List<DBMeta> metas);
}
