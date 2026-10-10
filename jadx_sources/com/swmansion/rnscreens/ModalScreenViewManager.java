package com.swmansion.rnscreens;

import com.facebook.react.module.annotations.ReactModule;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ModalScreenViewManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = ModalScreenViewManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/swmansion/rnscreens/ModalScreenViewManager;", "Lcom/swmansion/rnscreens/ScreenViewManager;", "<init>", "()V", "getName", "", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ModalScreenViewManager extends ScreenViewManager {

    @NotNull
    public static final String REACT_CLASS = "RNSModalScreen";

    @Override // com.swmansion.rnscreens.ScreenViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }
}
