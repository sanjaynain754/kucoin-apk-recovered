package com.facebook.react.uimanager;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ViewManagerPropertyUpdater {
    private static final String TAG = "ViewManagerPropertyUpdater";
    private static final Map<Class<?>, ViewManagerSetter<?, ?>> VIEW_MANAGER_SETTER_MAP = new HashMap();
    private static final Map<Class<?>, ShadowNodeSetter<?>> SHADOW_NODE_SETTER_MAP = new HashMap();

    public static class FallbackShadowNodeSetter<T extends ReactShadowNode> implements ShadowNodeSetter<T> {
        private final Map<String, ViewManagersPropertyCache.PropSetter> mPropSetters;

        private FallbackShadowNodeSetter(Class<? extends ReactShadowNode> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForShadowNodeClass(cls);
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> map) {
            for (ViewManagersPropertyCache.PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter
        public void setProperty(ReactShadowNode reactShadowNode, String str, Object obj) {
            ViewManagersPropertyCache.PropSetter propSetter = this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateShadowNodeProp(reactShadowNode, obj);
            }
        }
    }

    public static class FallbackViewManagerSetter<T extends ViewManager, V extends View> implements ViewManagerSetter<T, V> {
        private final Map<String, ViewManagersPropertyCache.PropSetter> mPropSetters;

        private FallbackViewManagerSetter(Class<? extends ViewManager> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForViewManagerClass(cls);
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> map) {
            for (ViewManagersPropertyCache.PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter
        public void setProperty(T t11, V v11, String str, Object obj) {
            ViewManagersPropertyCache.PropSetter propSetter = this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateViewProp(t11, v11, obj);
            }
        }
    }

    public interface Settable {
        void getProperties(Map<String, String> map);
    }

    public interface ShadowNodeSetter<T extends ReactShadowNode> extends Settable {
        void setProperty(T t11, String str, Object obj);
    }

    public interface ViewManagerSetter<T extends ViewManager, V extends View> extends Settable {
        void setProperty(T t11, V v11, String str, Object obj);
    }

    public static <T extends ViewManagerDelegate<V>, V extends View> void updateProps(T t11, V v11, ReactStylesDiffMap reactStylesDiffMap) {
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.mBackingMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t11.setProperty(v11, next.getKey(), next.getValue());
        }
    }

    private static <T extends ViewManager, V extends View> ViewManagerSetter<T, V> findManagerSetter(Class<? extends ViewManager> cls) {
        Map<Class<?>, ViewManagerSetter<?, ?>> map = VIEW_MANAGER_SETTER_MAP;
        ViewManagerSetter<T, V> fallbackViewManagerSetter = (ViewManagerSetter) map.get(cls);
        if (fallbackViewManagerSetter == null) {
            fallbackViewManagerSetter = (ViewManagerSetter) findGeneratedSetter(cls);
            if (fallbackViewManagerSetter == null) {
                fallbackViewManagerSetter = new FallbackViewManagerSetter<>(cls);
            }
            map.put(cls, (ViewManagerSetter<?, ?>) fallbackViewManagerSetter);
        }
        return fallbackViewManagerSetter;
    }

    private static <T extends ReactShadowNode> ShadowNodeSetter<T> findNodeSetter(Class<? extends ReactShadowNode> cls) {
        Map<Class<?>, ShadowNodeSetter<?>> map = SHADOW_NODE_SETTER_MAP;
        ShadowNodeSetter<T> fallbackShadowNodeSetter = (ShadowNodeSetter) map.get(cls);
        if (fallbackShadowNodeSetter == null) {
            fallbackShadowNodeSetter = (ShadowNodeSetter) findGeneratedSetter(cls);
            if (fallbackShadowNodeSetter == null) {
                fallbackShadowNodeSetter = new FallbackShadowNodeSetter<>(cls);
            }
            map.put(cls, (ShadowNodeSetter<?>) fallbackShadowNodeSetter);
        }
        return fallbackShadowNodeSetter;
    }

    public static Map<String, String> getNativeProps(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap map = new HashMap();
        findManagerSetter(cls).getProperties(map);
        findNodeSetter(cls2).getProperties(map);
        return map;
    }

    public static void clear() {
        ViewManagersPropertyCache.clear();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    private static <T> T findGeneratedSetter(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            C45999a.m101488I(TAG, "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    public static <T extends ViewManager, V extends View> void updateProps(T t11, V v11, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerSetter viewManagerSetterFindManagerSetter = findManagerSetter(t11.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.mBackingMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            viewManagerSetterFindManagerSetter.setProperty(t11, v11, next.getKey(), next.getValue());
        }
    }

    public static <T extends ReactShadowNode> void updateProps(T t11, ReactStylesDiffMap reactStylesDiffMap) {
        ShadowNodeSetter shadowNodeSetterFindNodeSetter = findNodeSetter(t11.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.mBackingMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            shadowNodeSetterFindNodeSetter.setProperty(t11, next.getKey(), next.getValue());
        }
    }
}
