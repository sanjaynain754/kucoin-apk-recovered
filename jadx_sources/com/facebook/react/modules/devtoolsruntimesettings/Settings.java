package com.facebook.react.modules.devtoolsruntimesettings;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: ReactDevToolsRuntimeSettingsModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/modules/devtoolsruntimesettings/Settings;", "", "<init>", "()V", "shouldReloadAndProfile", "", "getShouldReloadAndProfile", "()Z", "setShouldReloadAndProfile", "(Z)V", "recordChangeDescriptions", "getRecordChangeDescriptions", "setRecordChangeDescriptions", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
final class Settings {
    private boolean recordChangeDescriptions;
    private boolean shouldReloadAndProfile;

    public final boolean getRecordChangeDescriptions() {
        return this.recordChangeDescriptions;
    }

    public final boolean getShouldReloadAndProfile() {
        return this.shouldReloadAndProfile;
    }

    public final void setRecordChangeDescriptions(boolean z11) {
        this.recordChangeDescriptions = z11;
    }

    public final void setShouldReloadAndProfile(boolean z11) {
        this.shouldReloadAndProfile = z11;
    }
}
