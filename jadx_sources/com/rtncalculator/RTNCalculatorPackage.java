package com.rtncalculator;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.rtncalculator.RTNCalculatorPackage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class RTNCalculatorPackage extends TurboReactPackage {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m68565a() {
        HashMap map = new HashMap();
        map.put("RTNCalculator", new ReactModuleInfo("RTNCalculator", "RTNCalculator", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RTNCalculator")) {
            return new RTNCalculatorModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: eb0.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return RTNCalculatorPackage.m68565a();
            }
        };
    }
}
