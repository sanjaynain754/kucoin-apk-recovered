package com.pichillilorenzo.flutter_inappwebview_android.types;

import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes23.dex */
public interface IChannelDelegate extends MethodChannel.MethodCallHandler, Disposable {
    MethodChannel getChannel();
}
