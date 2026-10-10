package com.kubi.p110rn.core.turbo;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes39.dex */
public class NativeKycTurboModulePackage extends TurboReactPackage {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m55913a() {
        HashMap map = new HashMap();
        map.put("Kyc", new ReactModuleInfo("Kyc", "Kyc", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (!str.equals("Kyc")) {
            return null;
        }
        String str2 = "META-INF/services/" + NativeKycTurboModuleAbs.class.getName();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            if (classLoader == null) {
                classLoader = Thread.currentThread().getContextClassLoader();
            }
            Enumeration<URL> resources = classLoader.getResources(str2);
            while (resources.hasMoreElements()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(resources.nextElement()), "UTF-8"));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String strTrim = line.trim();
                        if (!strTrim.isEmpty() && !strTrim.startsWith(RunnableC33958ua.f72251f)) {
                            try {
                                Class<?> cls = Class.forName(strTrim, true, classLoader);
                                if (NativeKycTurboModuleAbs.class.isAssignableFrom(cls)) {
                                    return new NativeKycTurboModuleBridge(reactApplicationContext, (NativeKycTurboModuleAbs) cls.getConstructor(ReactApplicationContext.class).newInstance(reactApplicationContext));
                                }
                                continue;
                            } catch (ClassNotFoundException unused) {
                                continue;
                            }
                        }
                    }
                }
                bufferedReader.close();
            }
        } catch (Exception unused2) {
        }
        try {
            ClassLoader classLoader2 = getClass().getClassLoader();
            if (classLoader2 == null) {
                classLoader2 = Thread.currentThread().getContextClassLoader();
            }
            Class<?> cls2 = Class.forName("com.kubi.rn.core.turbo.NativeKycTurboModule", true, classLoader2);
            if (NativeKycTurboModuleSpec.class.isAssignableFrom(cls2)) {
                return (NativeModule) cls2.getConstructor(ReactApplicationContext.class).newInstance(reactApplicationContext);
            }
        } catch (Exception unused3) {
        }
        throw new RuntimeException("No implementation found for Kyc.\nOption A (new):    @AutoService(NativeKycTurboModuleAbs::class) + extend NativeKycTurboModuleAbs\nOption B (legacy): class NativeKycTurboModule(ctx) : NativeKycTurboModuleSpec(ctx)");
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.kubi.rn.core.turbo.b2
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return NativeKycTurboModulePackage.m55913a();
            }
        };
    }
}
