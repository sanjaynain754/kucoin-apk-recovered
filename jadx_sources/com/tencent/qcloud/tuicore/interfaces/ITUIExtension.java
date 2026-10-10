package com.tencent.qcloud.tuicore.interfaces;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public interface ITUIExtension {
    default boolean onRaiseExtension(String str, View view, Map<String, Object> map) {
        return false;
    }

    default List<TUIExtensionInfo> onGetExtension(String str, Map<String, Object> map) {
        return new ArrayList();
    }

    @Deprecated
    default Map<String, Object> onGetExtensionInfo(String str, Map<String, Object> map) {
        return new HashMap();
    }
}
