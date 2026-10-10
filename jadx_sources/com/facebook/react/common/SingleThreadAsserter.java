package com.facebook.react.common;

import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SingleThreadAsserter.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/common/SingleThreadAsserter;", "", "<init>", "()V", InterfaceC33953u5.f72225u, "Ljava/lang/Thread;", "assertNow", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SingleThreadAsserter {

    @Nullable
    private Thread thread;

    public final void assertNow() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.thread == null) {
            this.thread = threadCurrentThread;
        }
        C38115a.m86045a(Intrinsics.areEqual(this.thread, threadCurrentThread));
    }
}
