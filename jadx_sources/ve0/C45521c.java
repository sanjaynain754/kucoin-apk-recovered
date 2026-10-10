package ve0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import fr.greweb.reactnativeviewshot.NativeRNViewShotSpec;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ve0.c */
/* JADX INFO: compiled from: RNViewShotPackage.java */
/* JADX INFO: loaded from: classes60.dex */
public class C45521c extends TurboReactPackage {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m100509a() {
        HashMap map = new HashMap();
        map.put(NativeRNViewShotSpec.NAME, new ReactModuleInfo(NativeRNViewShotSpec.NAME, NativeRNViewShotSpec.NAME, false, false, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNViewShotModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NonNull String str, @NonNull ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNViewShotSpec.NAME)) {
            return new RNViewShotModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: ve0.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return C45521c.m100509a();
            }
        };
    }
}
