package com.kubi.agora;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.agora.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ScreenCaptureHelper.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureServiceCallbackStore;", "Lcom/kubi/agora/ProjectionCallbackStore;", "<init>", "()V", "value", "Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "pendingCallback", "getPendingCallback", "()Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "setPendingCallback", "(Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;)V", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenCaptureServiceCallbackStore implements ProjectionCallbackStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ScreenCaptureServiceCallbackStore f15333a = new ScreenCaptureServiceCallbackStore();

    @Override // com.kubi.agora.ProjectionCallbackStore
    /* JADX INFO: renamed from: a */
    public void mo14948a(@Nullable ScreenCaptureService.InterfaceC9383a interfaceC9383a) {
        ScreenCaptureService.f15296c.setPendingCallback$AgoraLib_googleRelease(interfaceC9383a);
    }
}
