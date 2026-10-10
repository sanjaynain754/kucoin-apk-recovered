package com.kubi.p110rn.core;

import com.facebook.react.ReactInstanceManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNInstanceManagerHolder.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/RNInstanceManagerHolder;", "", "<init>", "()V", "TAG", "", "currentInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "destroyingInstanceManager", "listeners", "", "Lcom/kubi/rn/core/RNInstanceManagerHolder$OnInstanceManagerChangeListener;", "setCurrentInstanceManager", "", "instanceManager", "getCurrentInstanceManager", "markDestroying", "clearDestroying", "isDestroying", "", "isAliveInstance", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "clear", "OnInstanceManagerChangeListener", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNInstanceManagerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNInstanceManagerHolder.kt\ncom/kubi/rn/core/RNInstanceManagerHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1869#2,2:69\n*S KotlinDebug\n*F\n+ 1 RNInstanceManagerHolder.kt\ncom/kubi/rn/core/RNInstanceManagerHolder\n*L\n28#1:69,2\n*E\n"})
public final class RNInstanceManagerHolder {

    @NotNull
    private static final String TAG = "RNInstanceManagerHolder";

    @Nullable
    private static ReactInstanceManager currentInstanceManager;

    @Nullable
    private static volatile ReactInstanceManager destroyingInstanceManager;

    @NotNull
    public static final RNInstanceManagerHolder INSTANCE = new RNInstanceManagerHolder();

    @NotNull
    private static final Set<OnInstanceManagerChangeListener> listeners = new LinkedHashSet();

    /* JADX INFO: compiled from: RNInstanceManagerHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/RNInstanceManagerHolder$OnInstanceManagerChangeListener;", "", "onInstanceManagerChanged", "", "instanceManager", "Lcom/facebook/react/ReactInstanceManager;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface OnInstanceManagerChangeListener {
        void onInstanceManagerChanged(@Nullable ReactInstanceManager instanceManager);
    }

    public final void clear() {
        currentInstanceManager = null;
        destroyingInstanceManager = null;
        listeners.clear();
    }

    public final void addListener(@NotNull OnInstanceManagerChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    public final void clearDestroying(@Nullable ReactInstanceManager instanceManager) {
        if (destroyingInstanceManager == instanceManager) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("clearDestroying manager=");
            sb2.append(instanceManager != null ? Integer.valueOf(instanceManager.hashCode()) : null);
            C44128b.m97266j(TAG, sb2.toString());
            destroyingInstanceManager = null;
        }
    }

    @Nullable
    public final ReactInstanceManager getCurrentInstanceManager() {
        return currentInstanceManager;
    }

    public final boolean isAliveInstance(@Nullable ReactInstanceManager instanceManager) {
        return (instanceManager == null || currentInstanceManager != instanceManager || destroyingInstanceManager == instanceManager) ? false : true;
    }

    public final boolean isDestroying(@Nullable ReactInstanceManager instanceManager) {
        return instanceManager != null && destroyingInstanceManager == instanceManager;
    }

    public final void markDestroying(@Nullable ReactInstanceManager instanceManager) {
        destroyingInstanceManager = instanceManager;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("markDestroying manager=");
        sb2.append(instanceManager != null ? Integer.valueOf(instanceManager.hashCode()) : null);
        sb2.append(" current=");
        ReactInstanceManager reactInstanceManager = currentInstanceManager;
        sb2.append(reactInstanceManager != null ? Integer.valueOf(reactInstanceManager.hashCode()) : null);
        C44128b.m97266j(TAG, sb2.toString());
    }

    public final void removeListener(@NotNull OnInstanceManagerChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    public final void setCurrentInstanceManager(@Nullable ReactInstanceManager instanceManager) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setCurrentInstanceManager old=");
        ReactInstanceManager reactInstanceManager = currentInstanceManager;
        sb2.append(reactInstanceManager != null ? Integer.valueOf(reactInstanceManager.hashCode()) : null);
        sb2.append(" new=");
        sb2.append(instanceManager != null ? Integer.valueOf(instanceManager.hashCode()) : null);
        sb2.append(" destroying=");
        ReactInstanceManager reactInstanceManager2 = destroyingInstanceManager;
        sb2.append(reactInstanceManager2 != null ? Integer.valueOf(reactInstanceManager2.hashCode()) : null);
        C44128b.m97266j(TAG, sb2.toString());
        currentInstanceManager = instanceManager;
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((OnInstanceManagerChangeListener) it.next()).onInstanceManagerChanged(instanceManager);
        }
    }

    private RNInstanceManagerHolder() {
    }
}
