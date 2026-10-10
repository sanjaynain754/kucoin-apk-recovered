package com.tencent.rmonitor.looper.provider;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.C33878qa;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.looper.listener.IMonitorCallback;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH&¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;", "", "Ljava/lang/Thread;", InterfaceC33953u5.f72225u, "Lcom/tencent/bugly/proguard/qa;", "lagParam", "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;", TUIConstants.TUIChat.CALL_BACK, "", "prepare", "", InterfaceC33730j9.f70350a, "", "startTime", "dispatchStart", "endTime", TypedValues.TransitionType.S_DURATION, "dispatchEnd", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public interface LooperStackProvider {
    void dispatchEnd(long endTime, long duration);

    void dispatchStart(long startTime);

    boolean prepare(@NotNull Thread thread, @NotNull C33878qa lagParam, @NotNull IMonitorCallback callback);

    void stop();
}
