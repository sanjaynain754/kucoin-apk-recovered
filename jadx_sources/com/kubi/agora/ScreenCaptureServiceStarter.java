package com.kubi.agora;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.agora.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ScreenCaptureHelper.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureServiceStarter;", "Lcom/kubi/agora/ProjectionServiceStarter;", "<init>", "()V", "startShareScreen", "", "resultCode", "", "data", "Landroid/content/Intent;", "stopShareScreen", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenCaptureServiceStarter implements ProjectionServiceStarter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ScreenCaptureServiceStarter f15334a = new ScreenCaptureServiceStarter();

    @Override // com.kubi.agora.ProjectionServiceStarter
    /* JADX INFO: renamed from: a */
    public void mo14949a() {
        ScreenCaptureService.f15296c.stopShareScreen();
    }

    @Override // com.kubi.agora.ProjectionServiceStarter
    /* JADX INFO: renamed from: b */
    public void mo14950b(int i11, @Nullable Intent intent) {
        ScreenCaptureService.f15296c.startShareScreen(i11, intent);
    }
}
