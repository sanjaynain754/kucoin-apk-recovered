package com.kubi.p110rn.p111ui;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ReactTransparentContainerActivity.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/ui/ReactTransparentContainerActivity;", "Lcom/kubi/rn/ui/ReactContainerActivity;", "<init>", "()V", "isTransparentContainer", "", "getContainerBackgroundColor", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReactTransparentContainerActivity extends ReactContainerActivity {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f46120j = 0;

    @Override // com.kubi.p110rn.p111ui.ReactContainerActivity
    public int getContainerBackgroundColor() {
        return 0;
    }

    @Override // com.kubi.p110rn.p111ui.ReactContainerActivity
    public boolean isTransparentContainer() {
        return true;
    }

    @Override // com.kubi.p110rn.p111ui.ReactContainerActivity, com.kubi.sdk.applet.KCMiniAppBaseProtocol
    public /* bridge */ /* synthetic */ void exit(@NotNull Context context, @Nullable Object obj, boolean z11, @NotNull Function2 function2) {
        super.exit(context, obj, z11, function2);
    }

    @Override // com.kubi.p110rn.p111ui.ReactContainerActivity, com.kubi.sdk.applet.KCMiniAppBaseProtocol
    public /* bridge */ /* synthetic */ boolean supportAddHome() {
        return super.supportAddHome();
    }
}
