package com.reactnativeimageresizer;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.reactnativeimageresizer.c */
/* JADX INFO: compiled from: ImageResizerPackage.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27517c extends TurboReactPackage {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m68161a() {
        HashMap map = new HashMap();
        map.put("ImageResizer", new ReactModuleInfo("ImageResizer", "ImageResizer", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("ImageResizer")) {
            return new ImageResizerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.reactnativeimageresizer.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return C27517c.m68161a();
            }
        };
    }
}
