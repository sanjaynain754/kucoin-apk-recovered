package p047c1;

import androidx.annotation.NonNull;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.p059BV.LinearGradient.LinearGradientManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: compiled from: LinearGradientPackage.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4772a implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new LinearGradientManager());
    }
}
