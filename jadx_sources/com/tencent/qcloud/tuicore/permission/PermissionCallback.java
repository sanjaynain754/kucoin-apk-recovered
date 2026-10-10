package com.tencent.qcloud.tuicore.permission;

/* JADX INFO: loaded from: classes56.dex */
public abstract class PermissionCallback {
    public abstract void onGranted();

    public void onDenied() {
    }

    public void onRequesting() {
    }
}
