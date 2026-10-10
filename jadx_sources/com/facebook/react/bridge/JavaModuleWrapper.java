package com.facebook.react.bridge;

import androidx.annotation.Nullable;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.kubi.p110rn.RNConstantKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p053c7.C4858a;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @InterfaceC44695a
    public static class MethodDescriptor {

        @InterfaceC44695a
        Method method;

        @InterfaceC44695a
        String name;

        @InterfaceC44695a
        String signature;

        @InterfaceC44695a
        String type;
    }

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    @InterfaceC44695a
    private void findMethods() {
        com.facebook.systrace.Systrace.m10662c(0L, "findMethods");
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                String type = javaMethodWrapper.getType();
                methodDescriptor.type = type;
                if ("sync".equals(type)) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        com.facebook.systrace.Systrace.m10667i(0L);
    }

    @InterfaceC44695a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @InterfaceC44695a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @InterfaceC44695a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @InterfaceC44695a
    public void invoke(int i11, ReadableNativeArray readableNativeArray) {
        if (i11 >= this.mMethods.size()) {
            return;
        }
        this.mMethods.get(i11).invoke(this.mJSInstance, readableNativeArray);
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @Nullable
    @InterfaceC44695a
    public NativeMap getConstants() {
        String name = getName();
        C4858a.m4990a(0L, "JavaModuleWrapper.getConstants").mo4993b(RNConstantKt.PARAM_MODULE_NAME, name).mo4994c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        com.facebook.systrace.Systrace.m10662c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        com.facebook.systrace.Systrace.m10667i(0L);
        com.facebook.systrace.Systrace.m10662c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            com.facebook.systrace.Systrace.m10667i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C4858a.m4991b(0L).mo4994c();
        }
    }
}
