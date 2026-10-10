package com.th3rdwave.safeareacontext;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerDelegate;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeAreaProviderManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = SafeAreaProviderManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00100\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaProviderManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/RNCSafeAreaProviderManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "addEventEmitters", "", "reactContext", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "react-native-safe-area-context_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> implements RNCSafeAreaProviderManagerInterface<SafeAreaProvider> {

    @NotNull
    public static final String REACT_CLASS = "RNCSafeAreaProvider";

    @NotNull
    private final RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> mDelegate = new RNCSafeAreaProviderManagerDelegate<>(this);

    /* JADX INFO: renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$addEventEmitters$1 */
    /* JADX INFO: compiled from: SafeAreaProviderManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C358621 extends FunctionReferenceImpl implements Function3<SafeAreaProvider, EdgeInsets, Rect, Unit> {
        public static final C358621 INSTANCE = new C358621();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
            invoke2(safeAreaProvider, edgeInsets, rect);
            return Unit.INSTANCE;
        }

        public C358621() {
            super(3, SafeAreaProviderManagerKt.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SafeAreaProvider p11, EdgeInsets p12, Rect p13) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p13, "p2");
            SafeAreaProviderManagerKt.handleOnInsetsChange(p11, p12, p13);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull SafeAreaProvider view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        view.setOnInsetsChangeHandler(C358621.INSTANCE);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public SafeAreaProvider createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SafeAreaProvider(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.m90091to(InsetsChangeEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.m90091to("registrationName", "onInsetsChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }
}
