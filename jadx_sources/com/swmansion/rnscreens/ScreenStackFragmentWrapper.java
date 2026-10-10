package com.swmansion.rnscreens;

import androidx.appcompat.widget.Toolbar;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ScreenStackFragmentWrapper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "removeToolbar", "", "setToolbar", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setToolbarShadowHidden", ViewProps.HIDDEN, "", "setToolbarTranslucent", "translucent", "canNavigateBack", "dismissFromContainer", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface ScreenStackFragmentWrapper extends ScreenFragmentWrapper {
    boolean canNavigateBack();

    void dismissFromContainer();

    void removeToolbar();

    void setToolbar(@NotNull Toolbar toolbar);

    void setToolbarShadowHidden(boolean hidden);

    void setToolbarTranslucent(boolean translucent);
}
