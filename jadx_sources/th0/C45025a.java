package th0;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.reactnative.maskedview.RNCMaskedViewManager;

/* JADX INFO: renamed from: th0.a */
/* JADX INFO: compiled from: RNCMaskedViewPackage.java */
/* JADX INFO: loaded from: classes61.dex */
public class C45025a implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNCMaskedViewManager());
    }
}
