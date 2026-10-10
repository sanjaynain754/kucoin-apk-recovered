package com.tencent.rmonitor.base.plugin.listener;

import com.tencent.rmonitor.custom.ICustomDataEditorForIssue;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public interface ICustomDataCollectorForIssue extends IBaseListener {
    void collectCustomData(String str, String str2, ICustomDataEditorForIssue iCustomDataEditorForIssue);
}
