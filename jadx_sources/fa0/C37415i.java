package fa0;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: fa0.i */
/* JADX INFO: compiled from: AsyncStoragePackage.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37415i extends TurboReactPackage {

    /* JADX INFO: renamed from: fa0.i$a */
    /* JADX INFO: compiled from: AsyncStoragePackage.java */
    public class a implements ReactModuleInfoProvider {
        public a() {
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            HashMap map = new HashMap();
            Class cls = new Class[]{AsyncStorageModule.class}[0];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), true));
            return map;
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        try {
            return (ReactModuleInfoProvider) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (!str.equals("RNCAsyncStorage")) {
            return null;
        }
        return new AsyncStorageModule(reactApplicationContext);
    }
}
