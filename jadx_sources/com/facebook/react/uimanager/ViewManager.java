package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@ReactPropertyHolder
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String NAME = "ViewManager";

    @Nullable
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createViewInstance(int i11, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        T t11 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(themedReactContext) : (T) recycleView(themedReactContext, recyclableViewStack.pop());
        t11.setId(i11);
        addEventEmitters(themedReactContext, t11);
        if (reactStylesDiffMap != null) {
            updateProperties(t11, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(t11, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(t11, objUpdateState);
        }
        return t11;
    }

    @NonNull
    public abstract T createViewInstance(@NonNull ThemedReactContext themedReactContext);

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    @Nullable
    public ViewManagerDelegate<T> getDelegate() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2, @Nullable float[] fArr) {
        return 0L;
    }

    @Nullable
    public abstract T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t11);

    @Deprecated
    public void receiveCommand(@NonNull T t11, int i11, @Nullable ReadableArray readableArray) {
    }

    public abstract void updateExtraData(@NonNull T t11, Object obj);

    @Nullable
    public Object updateState(@NonNull T t11, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }

    @Nullable
    private Stack<T> getRecyclableViewStack(int i11, boolean z11) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z11 && !map.containsKey(Integer.valueOf(i11))) {
            this.mRecyclableViews.put(Integer.valueOf(i11), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i11));
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public long measure(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, @Nullable MapBuffer mapBuffer3, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2, @Nullable float[] fArr) {
        return 0L;
    }

    public void onSurfaceStopped(int i11) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i11));
        }
    }

    public void receiveCommand(@NonNull T t11, String str, @Nullable ReadableArray readableArray) {
        ViewManagerDelegate<T> delegate = getDelegate();
        if (delegate != null) {
            delegate.receiveCommand(t11, str, readableArray);
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public ViewManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRecyclableViews = null;
    }

    @NonNull
    public T createView(int i11, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T t11 = (T) createViewInstance(i11, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (t11 instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) t11).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return t11;
    }

    public Map<String, String> getNativeProps() {
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public void onDropViewInstance(@NonNull T t11) {
        View viewPrepareToRecycleView;
        Context context = t11.getContext();
        if (context == null) {
            C45999a.m101507m(NAME, "onDropViewInstance: view [" + t11.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            C45999a.m101507m(NAME, "onDropViewInstance: view [" + t11.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack != null && (viewPrepareToRecycleView = prepareToRecycleView(themedReactContext, t11)) != null) {
            recyclableViewStack.push(viewPrepareToRecycleView);
        }
    }

    public void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public void updateProperties(@NonNull T t11, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> delegate = getDelegate();
        if (delegate != null) {
            ViewManagerPropertyUpdater.updateProps(delegate, t11, reactStylesDiffMap);
        } else {
            ViewManagerPropertyUpdater.updateProps(this, t11, reactStylesDiffMap);
        }
        onAfterUpdateTransaction(t11);
    }

    public void onAfterUpdateTransaction(@NonNull T t11) {
    }

    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t11) {
    }

    public T recycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t11) {
        return t11;
    }

    public void setPadding(T t11, int i11, int i12, int i13, int i14) {
    }
}
