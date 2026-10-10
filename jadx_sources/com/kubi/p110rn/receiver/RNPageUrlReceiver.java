package com.kubi.p110rn.receiver;

import android.app.Activity;
import com.kubi.p110rn.p111ui.ReactContainerActivity;
import com.kubi.utils.C27012a;
import gy.InterfaceC38056a;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RNPageUrlReceiver.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/rn/receiver/RNPageUrlReceiver;", "Lcom/kubi/sdk/base/IRNPageUrlReceiver;", "<init>", "()V", "getCurrentRnPageUrl", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNPageUrlReceiver implements InterfaceC38056a {
    @Override // gy.InterfaceC38056a
    @Nullable
    public String getCurrentRnPageUrl() {
        ReactContainerActivity reactContainerActivity;
        Activity activityM66494h = C27012a.m66486i().m66494h();
        if (activityM66494h instanceof ReactContainerActivity) {
            reactContainerActivity = (ReactContainerActivity) activityM66494h;
        } else {
            reactContainerActivity = null;
        }
        if (reactContainerActivity == null) {
            return null;
        }
        return reactContainerActivity.url();
    }
}
