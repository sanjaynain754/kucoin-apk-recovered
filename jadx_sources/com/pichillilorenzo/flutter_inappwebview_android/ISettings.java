package com.pichillilorenzo.flutter_inappwebview_android;

import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public interface ISettings<T> {
    Map<String, Object> getRealSettings(T t11);

    ISettings<T> parse(Map<String, Object> map);

    Map<String, Object> toMap();
}
