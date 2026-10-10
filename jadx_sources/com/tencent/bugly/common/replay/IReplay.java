package com.tencent.bugly.common.replay;

import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.Closeable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/IReplay;", "Ljava/io/Closeable;", "pause", "", "resume", "start", InterfaceC33730j9.f70350a, "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IReplay extends Closeable {
    void pause();

    void resume();

    void start();

    void stop();
}
