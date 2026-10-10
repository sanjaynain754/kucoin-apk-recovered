package com.tencent.bugly.common.looper;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&¨\u0006\r"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/ILooperDispatchListener;", "", "isOpen", "", "onDispatchEnd", "", "msg", "", "endTime", "", TypedValues.TransitionType.S_DURATION, "onDispatchStart", "startTime", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface ILooperDispatchListener {
    boolean isOpen();

    void onDispatchEnd(@NotNull String msg, long endTime, long duration);

    void onDispatchStart(@NotNull String msg, long startTime);
}
