package com.horcrux.svg;

import androidx.annotation.Nullable;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes56.dex */
public class SvgPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    @Nullable
    private Map<String, ModuleSpec> mViewManagers;

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$a */
    public class C9196a implements Provider<NativeModule> {
        public C9196a() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$a0 */
    public class C9197a0 implements Provider<NativeModule> {
        public C9197a0() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$b */
    public class C9198b implements Provider<NativeModule> {
        public C9198b() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$b0 */
    public class C9199b0 implements Provider<NativeModule> {
        public C9199b0() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$c */
    public class C9200c implements Provider<NativeModule> {
        public C9200c() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$c0 */
    public class C9201c0 implements Provider<NativeModule> {
        public C9201c0() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$d */
    public class C9202d implements Provider<NativeModule> {
        public C9202d() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$d0 */
    public class C9203d0 implements Provider<NativeModule> {
        public C9203d0() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$e */
    public class C9204e implements Provider<NativeModule> {
        public C9204e() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$f */
    public class C9205f implements Provider<NativeModule> {
        public C9205f() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$g */
    public class C9206g implements Provider<NativeModule> {
        public C9206g() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$h */
    public class C9207h implements Provider<NativeModule> {
        public C9207h() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$i */
    public class C9208i implements Provider<NativeModule> {
        public C9208i() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$j */
    public class C9209j implements Provider<NativeModule> {
        public C9209j() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$k */
    public class C9210k implements Provider<NativeModule> {
        public C9210k() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$l */
    public class C9211l implements Provider<NativeModule> {
        public C9211l() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeBlendManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$m */
    public class C9212m implements Provider<NativeModule> {
        public C9212m() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$n */
    public class C9213n implements Provider<NativeModule> {
        public C9213n() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeCompositeManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$o */
    public class C9214o implements Provider<NativeModule> {
        public C9214o() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeFloodManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$p */
    public class C9215p implements Provider<NativeModule> {
        public C9215p() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$q */
    public class C9216q implements Provider<NativeModule> {
        public C9216q() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$r */
    public class C9217r implements Provider<NativeModule> {
        public C9217r() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$s */
    public class C9218s implements Provider<NativeModule> {
        public C9218s() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$t */
    public class C9219t implements Provider<NativeModule> {
        public C9219t() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$u */
    public class C9220u implements Provider<NativeModule> {
        public C9220u() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$v */
    public class C9221v implements Provider<NativeModule> {
        public C9221v() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$w */
    public class C9222w implements ReactModuleInfoProvider {
        public C9222w() {
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            HashMap map = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i11 = 0; i11 < 2; i11++) {
                Class cls = clsArr[i11];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true));
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$x */
    public class C9223x implements Provider<NativeModule> {
        public C9223x() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$y */
    public class C9224y implements Provider<NativeModule> {
        public C9224y() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$z */
    public class C9225z implements Provider<NativeModule> {
        public C9225z() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap mapNewHashMap = MapBuilder.newHashMap();
            mapNewHashMap.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9210k()));
            mapNewHashMap.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9221v()));
            mapNewHashMap.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9223x()));
            mapNewHashMap.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9224y()));
            mapNewHashMap.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9225z()));
            mapNewHashMap.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9197a0()));
            mapNewHashMap.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9199b0()));
            mapNewHashMap.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9201c0()));
            mapNewHashMap.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9203d0()));
            mapNewHashMap.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9196a()));
            mapNewHashMap.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9198b()));
            mapNewHashMap.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9200c()));
            mapNewHashMap.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9202d()));
            mapNewHashMap.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9204e()));
            mapNewHashMap.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9205f()));
            mapNewHashMap.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9206g()));
            mapNewHashMap.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9207h()));
            mapNewHashMap.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9208i()));
            mapNewHashMap.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9209j()));
            mapNewHashMap.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9211l()));
            mapNewHashMap.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9212m()));
            mapNewHashMap.put(RenderableViewManager.FeCompositeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9213n()));
            mapNewHashMap.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9214o()));
            mapNewHashMap.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9215p()));
            mapNewHashMap.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9216q()));
            mapNewHashMap.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9217r()));
            mapNewHashMap.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9218s()));
            mapNewHashMap.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9219t()));
            mapNewHashMap.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C9220u()));
            this.mViewManagers = mapNewHashMap;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        try {
            return (ReactModuleInfoProvider) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new C9222w();
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }

    @Override // com.facebook.react.BaseReactPackage
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @Nullable
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (!str.equals("RNSVGRenderableModule")) {
            if (!str.equals("RNSVGSvgViewModule")) {
                return null;
            }
            return new SvgViewModule(reactApplicationContext);
        }
        return new RNSVGRenderableManager(reactApplicationContext);
    }
}
