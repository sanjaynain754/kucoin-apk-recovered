package com.kubi.sdk;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.d3 */
/* JADX INFO: compiled from: ResultDelegate.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"finishDispatcher", "", "obj", "", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C23700d3 {
    /* JADX INFO: renamed from: a */
    public static final void m56610a(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj instanceof ResultDelegate.a) {
            ((ResultDelegate.a) obj).preformBackPressed();
        }
    }
}
