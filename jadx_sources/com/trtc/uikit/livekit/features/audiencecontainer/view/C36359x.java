package com.trtc.uikit.livekit.features.audiencecontainer.view;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.x */
/* JADX INFO: compiled from: PreviewTopActionState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, m90084d2 = {"resolvePreviewTopActionState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/PreviewTopActionState;", "isPreviewVisible", "", "isPortrait", "isPiPEnabled", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36359x {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final PreviewTopActionState m81313a(boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        boolean z15 = z11 && z12;
        boolean z16 = z11 && z12;
        if (z13 && !z11) {
            z14 = true;
        }
        return new PreviewTopActionState(z15, z16, z14);
    }
}
