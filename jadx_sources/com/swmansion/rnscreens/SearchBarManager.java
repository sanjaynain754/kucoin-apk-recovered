package com.swmansion.rnscreens;

import android.util.Log;
import androidx.autofill.HintConstants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSearchBarManagerDelegate;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.swmansion.rnscreens.events.SearchBarBlurEvent;
import com.swmansion.rnscreens.events.SearchBarChangeTextEvent;
import com.swmansion.rnscreens.events.SearchBarCloseEvent;
import com.swmansion.rnscreens.events.SearchBarFocusEvent;
import com.swmansion.rnscreens.events.SearchBarOpenEvent;
import com.swmansion.rnscreens.events.SearchBarSearchButtonPressEvent;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchBarManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = SearchBarManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0017J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015H\u0017J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\nH\u0017J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0015H\u0017J\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0016J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\nH\u0002J\u0012\u0010+\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010,\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010-\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010.\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020\u0015H\u0016J\u001c\u00100\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u00102\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u00103\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\nH\u0016J\u001a\u00104\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00105\u001a\u00020\u0015H\u0016J\u001a\u00106\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00105\u001a\u00020\u0015H\u0016J\u001a\u00107\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00105\u001a\u00020\u0015H\u0016J\u001c\u00108\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u00010\nH\u0016J!\u00109\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/SearchBarView;", "Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onAfterUpdateTransaction", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setAutoCapitalize", "autoCapitalize", "setAutoFocus", "autoFocus", "", "(Lcom/swmansion/rnscreens/SearchBarView;Ljava/lang/Boolean;)V", "setBarTintColor", "color", "", "(Lcom/swmansion/rnscreens/SearchBarView;Ljava/lang/Integer;)V", "setDisableBackButtonOverride", "disableBackButtonOverride", "setInputType", "inputType", "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setTextColor", "setHeaderIconColor", "setHintTextColor", "setShouldShowHintSearchIcon", "shouldShowHintSearchIcon", "getExportedCustomDirectEventTypeConstants", "", "", "logNotAvailable", "propName", "blur", "focus", "clearText", "toggleCancelButton", "flag", "setText", "text", "cancelSearch", "setPlacement", "setHideWhenScrolling", "value", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SearchBarManager extends ViewGroupManager<SearchBarView> implements RNSSearchBarManagerInterface<SearchBarView> {

    @NotNull
    public static final String REACT_CLASS = "RNSSearchBar";

    @NotNull
    private final ViewManagerDelegate<SearchBarView> delegate = new RNSSearchBarManagerDelegate(this);

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void blur(@Nullable SearchBarView view) {
        if (view != null) {
            view.handleBlurJsRequest();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void cancelSearch(@Nullable SearchBarView view) {
        if (view != null) {
            view.handleFocusJsRequest();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void clearText(@Nullable SearchBarView view) {
        if (view != null) {
            view.handleClearTextJsRequest();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public SearchBarView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SearchBarView(context);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void focus(@Nullable SearchBarView view) {
        if (view != null) {
            view.handleFocusJsRequest();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<SearchBarView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull SearchBarView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.onUpdate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r3.equals("none") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoCapitalize(@NotNull SearchBarView view, @Nullable String autoCapitalize) {
        SearchBarView.SearchBarAutoCapitalize searchBarAutoCapitalize;
        Intrinsics.checkNotNullParameter(view, "view");
        if (autoCapitalize != null) {
            switch (autoCapitalize.hashCode()) {
                case 3387192:
                    break;
                case 113318569:
                    if (autoCapitalize.equals("words")) {
                        searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.WORDS;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 490141296:
                    if (autoCapitalize.equals("sentences")) {
                        searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.SENTENCES;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 1245424234:
                    if (autoCapitalize.equals("characters")) {
                        searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.CHARACTERS;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
            }
        } else {
            searchBarAutoCapitalize = SearchBarView.SearchBarAutoCapitalize.NONE;
        }
        view.setAutoCapitalize(searchBarAutoCapitalize);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "barTintColor")
    public void setBarTintColor(@NotNull SearchBarView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTintColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setCancelButtonText(@Nullable SearchBarView view, @Nullable String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(@NotNull SearchBarView view, boolean disableBackButtonOverride) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(@NotNull SearchBarView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHeaderIconColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideNavigationBar(@Nullable SearchBarView view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideWhenScrolling(@Nullable SearchBarView view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(@NotNull SearchBarView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInputType(@NotNull SearchBarView view, @Nullable String inputType) {
        SearchBarView.SearchBarInputTypes searchBarInputTypes;
        Intrinsics.checkNotNullParameter(view, "view");
        if (inputType != null) {
            switch (inputType.hashCode()) {
                case -1034364087:
                    if (inputType.equals("number")) {
                        searchBarInputTypes = SearchBarView.SearchBarInputTypes.NUMBER;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 3556653:
                    break;
                case 96619420:
                    if (inputType.equals("email")) {
                        searchBarInputTypes = SearchBarView.SearchBarInputTypes.EMAIL;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 106642798:
                    if (inputType.equals(HintConstants.AUTOFILL_HINT_PHONE)) {
                        searchBarInputTypes = SearchBarView.SearchBarInputTypes.PHONE;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
            }
        } else {
            searchBarInputTypes = SearchBarView.SearchBarInputTypes.TEXT;
        }
        view.setInputType(searchBarInputTypes);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setObscureBackground(@Nullable SearchBarView view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(@NotNull SearchBarView view, @Nullable String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setPlacement(@NotNull SearchBarView view, @Nullable String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(@NotNull SearchBarView view, boolean shouldShowHintSearchIcon) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setText(@Nullable SearchBarView view, @Nullable String text) {
        if (view != null) {
            view.handleSetTextJsRequest(text);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "textColor")
    public void setTextColor(@NotNull SearchBarView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setTintColor(@Nullable SearchBarView view, @Nullable Integer value) {
        logNotAvailable("tintColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void toggleCancelButton(@Nullable SearchBarView view, boolean flag) {
        if (view != null) {
            view.handleToggleCancelButtonJsRequest(flag);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m10227of(SearchBarBlurEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onSearchBlur"), SearchBarChangeTextEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onChangeText"), SearchBarCloseEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onClose"), SearchBarFocusEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onSearchFocus"), SearchBarOpenEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onOpen"), SearchBarSearchButtonPressEvent.EVENT_NAME, MapBuilder.m10222of("registrationName", "onSearchButtonPress"));
    }

    @ReactProp(name = "autoFocus")
    public final void setAutoFocus(@NotNull SearchBarView view, @Nullable Boolean autoFocus) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(view, "view");
        if (autoFocus != null) {
            zBooleanValue = autoFocus.booleanValue();
        } else {
            zBooleanValue = false;
        }
        view.setAutoFocus(zBooleanValue);
    }
}
