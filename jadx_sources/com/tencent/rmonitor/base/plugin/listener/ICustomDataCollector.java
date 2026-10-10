package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.custom.ICustomDataEditor;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public interface ICustomDataCollector extends IBaseListener {
    void collectCustomData(String str, String str2, ICustomDataEditor iCustomDataEditor);
}
