package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rb0.InterfaceC43969c;

/* JADX INFO: compiled from: RNGestureHandlerInteractionManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\""}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerInteractionManager;", "Lrb0/c;", "<init>", "()V", "", "handlerTag", "", "g", "(I)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "e", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/facebook/react/bridge/ReadableMap;)V", "otherHandler", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "b", "d", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "key", "", "f", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)[I", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "waitForRelations", "simultaneousRelations", "blockingRelations", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerInteractionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerInteractionManager.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerInteractionManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n12604#2,2:80\n12604#2,2:82\n12604#2,2:84\n*S KotlinDebug\n*F\n+ 1 RNGestureHandlerInteractionManager.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerInteractionManager\n*L\n45#1:80,2\n50#1:82,2\n66#1:84,2\n*E\n"})
public final class RNGestureHandlerInteractionManager implements InterfaceC43969c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<int[]> waitForRelations = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<int[]> simultaneousRelations = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<int[]> blockingRelations = new SparseArray<>();

    @Override // rb0.InterfaceC43969c
    /* JADX INFO: renamed from: a */
    public boolean mo71996a(@NotNull GestureHandler<?> handler, @NotNull GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.waitForRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rb0.InterfaceC43969c
    /* JADX INFO: renamed from: b */
    public boolean mo71997b(@NotNull GestureHandler<?> handler, @NotNull GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.blockingRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rb0.InterfaceC43969c
    /* JADX INFO: renamed from: c */
    public boolean mo71998c(@NotNull GestureHandler<?> handler, @NotNull GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.simultaneousRelations.get(handler.getTag());
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == otherHandler.getTag()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rb0.InterfaceC43969c
    /* JADX INFO: renamed from: d */
    public boolean mo71999d(@NotNull GestureHandler<?> handler, @NotNull GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        if (otherHandler instanceof NativeViewGestureHandler) {
            return ((NativeViewGestureHandler) otherHandler).getDisallowInterruption();
        }
        return otherHandler instanceof RNGestureHandlerRootHelper.C33439a;
    }

    /* JADX INFO: renamed from: e */
    public final void m72000e(@NotNull GestureHandler<?> handler, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.m71807y0(this);
        if (config.hasKey("waitFor")) {
            this.waitForRelations.put(handler.getTag(), m72001f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.simultaneousRelations.put(handler.getTag(), m72001f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.blockingRelations.put(handler.getTag(), m72001f(config, "blocksHandlers"));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m72002g(int handlerTag) {
        this.waitForRelations.remove(handlerTag);
        this.simultaneousRelations.remove(handlerTag);
    }

    /* JADX INFO: renamed from: h */
    public final void m72003h() {
        this.waitForRelations.clear();
        this.simultaneousRelations.clear();
    }

    /* JADX INFO: renamed from: f */
    public final int[] m72001f(ReadableMap config, String key) {
        ReadableArray array = config.getArray(key);
        Intrinsics.checkNotNull(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = array.getInt(i11);
        }
        return iArr;
    }
}
