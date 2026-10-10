package com.kubi.p110rn.core;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnFcpTrackerRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/core/KrnFcpTrackerRegistry;", "", "<init>", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/rn/core/KrnFcpTracker;", "register", "", "rootTag", "tracker", "unregister", "find", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KrnFcpTrackerRegistry {

    @NotNull
    public static final KrnFcpTrackerRegistry INSTANCE = new KrnFcpTrackerRegistry();

    @NotNull
    private static final ConcurrentHashMap<Integer, KrnFcpTracker> map = new ConcurrentHashMap<>();

    @Nullable
    public final KrnFcpTracker find(int rootTag) {
        return map.get(Integer.valueOf(rootTag));
    }

    public final void register(int rootTag, @NotNull KrnFcpTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        map.put(Integer.valueOf(rootTag), tracker);
    }

    public final void unregister(int rootTag) {
        map.remove(Integer.valueOf(rootTag));
    }

    private KrnFcpTrackerRegistry() {
    }
}
