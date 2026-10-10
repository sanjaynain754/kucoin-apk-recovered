package io.flutter.plugin.common;

import androidx.annotation.Nullable;
import io.flutter.Log;

/* JADX INFO: loaded from: classes60.dex */
public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, Log.WARN);
    }

    public ErrorLogResult(String str, int i11) {
        this.tag = str;
        this.level = i11;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, @Nullable String str2, @Nullable Object obj) {
        String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i11 = this.level;
        if (i11 < Log.WARN) {
            return;
        }
        Log.println(i11, this.tag, str2 + str3);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        int i11 = this.level;
        if (i11 < Log.WARN) {
            return;
        }
        Log.println(i11, this.tag, "method not implemented");
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(@Nullable Object obj) {
    }
}
