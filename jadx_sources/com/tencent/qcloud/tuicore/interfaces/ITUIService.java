package com.tencent.qcloud.tuicore.interfaces;

import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public interface ITUIService {
    default Object onCall(String str, Map<String, Object> map) {
        return null;
    }

    default Object onCall(String str, Map<String, Object> map, TUIServiceCallback tUIServiceCallback) {
        return null;
    }
}
