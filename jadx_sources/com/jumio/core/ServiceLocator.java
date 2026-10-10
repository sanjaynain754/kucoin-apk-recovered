package com.jumio.core;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.core.util.ReflectionUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J4\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J1\u0010\u0011\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0006\u0010\u0012\u001a\u0002H\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J1\u0010\u0019\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002J#\u0010!\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0002¢\u0006\u0002\u0010\"J#\u0010#\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0002¢\u0006\u0002\u0010\"R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/jumio/core/ServiceLocator;", "Lcom/jumio/core/ServiceLocatorInterface;", "<init>", "()V", "applicationContext", "Landroid/content/Context;", "init", "", "context", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "bindServiceClass", ExifInterface.GPS_DIRECTION_TRUE, "interfaceClass", "Ljava/lang/Class;", "implementationClass", "priority", "", "bindServiceInstance", "instanceClass", "(Ljava/lang/Class;Ljava/lang/Object;I)V", "bindReflectionClass", "", "unbind", "", "maxPriority", "getServiceImplementation", "onError", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requireInterface", "newInstanceOf", "", "clazz", "instanceDefault", "(Ljava/lang/Class;)Ljava/lang/Object;", "instanceWithContext", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nServiceLocator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceLocator.kt\ncom/jumio/core/ServiceLocator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class ServiceLocator implements ServiceLocatorInterface {

    @NotNull
    public static final ServiceLocator INSTANCE = new ServiceLocator();

    /* JADX INFO: renamed from: a */
    public static volatile Context f13683a;

    /* JADX INFO: renamed from: a */
    public static Object m14494a(Class cls) {
        Object objNewInstance;
        Object objNewInstance2 = null;
        if (cls == null) {
            return null;
        }
        INSTANCE.getClass();
        try {
            objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            return objNewInstance;
        }
        INSTANCE.getClass();
        try {
            objNewInstance2 = cls.getConstructor(Context.class).newInstance(f13683a);
        } catch (Exception unused2) {
        }
        return objNewInstance2;
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public synchronized void destroy() {
        f13683a = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[PHI: r0
      0x0044: PHI (r0v25 java.lang.Object) = (r0v14 java.lang.Object), (r0v17 java.lang.Object), (r0v22 java.lang.Object), (r0v29 java.lang.Object) binds: [B:43:0x00b6, B:34:0x008c, B:25:0x0065, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.jumio.core.ServiceLocatorInterface
    public synchronized <T> T getServiceImplementation(@NotNull Class<T> interfaceClass, @Nullable Function0<? extends T> onError) {
        EnumC40613W2 second;
        Object plugin;
        try {
            Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
            if (!interfaceClass.isInterface()) {
                throw new IllegalArgumentException("Provided class is not an interface");
            }
            T t11 = null;
            if (f13683a != null) {
                Map<String, Pair<Integer, Object>> defaultInstanceMappings = getDefaultInstanceMappings(this);
                Map<String, Pair<Integer, Class<?>>> defaultClassMappings = getDefaultClassMappings(this);
                Map<String, Pair<Integer, String>> defaultReflectionMappings = getDefaultReflectionMappings(this);
                Map<String, Pair<Integer, EnumC40613W2>> defaultPluginMappings = getDefaultPluginMappings(this);
                String name = interfaceClass.getName();
                if (defaultInstanceMappings.keySet().contains(name)) {
                    Pair<Integer, Object> pair = defaultInstanceMappings.get(name);
                    plugin = pair != null ? pair.getSecond() : null;
                    if (plugin != null) {
                        t11 = (T) plugin;
                    }
                } else if (defaultClassMappings.keySet().contains(name)) {
                    Pair<Integer, Class<?>> pair2 = defaultClassMappings.get(name);
                    plugin = m14494a(pair2 != null ? pair2.getSecond() : null);
                    if (plugin != null) {
                        t11 = (T) plugin;
                    }
                } else if (defaultReflectionMappings.keySet().contains(name)) {
                    ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
                    Pair<Integer, String> pair3 = defaultReflectionMappings.get(name);
                    plugin = m14494a(reflectionUtil.getClass(pair3 != null ? pair3.getSecond() : null));
                    if (plugin != null) {
                        t11 = (T) plugin;
                    }
                } else if (defaultPluginMappings.keySet().contains(name)) {
                    PluginRegistryInterface pluginRegistryInterface = (PluginRegistryInterface) ServiceLocatorInterface.getServiceImplementation$default(this, PluginRegistryInterface.class, null, 2, null);
                    Pair<Integer, EnumC40613W2> pair4 = defaultPluginMappings.get(name);
                    if (pair4 != null && (second = pair4.getSecond()) != null && (plugin = pluginRegistryInterface.getPlugin(second)) != null) {
                        t11 = (T) plugin;
                    }
                }
            }
            if (t11 != null) {
                return t11;
            }
            if (onError != null) {
                return onError.invoke();
            }
            throw new RuntimeException("Cannot locate or create instance of class ".concat(interfaceClass.getName()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public synchronized void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        f13683a = context.getApplicationContext();
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public void bindReflectionClass(@NotNull String interfaceClass, @NotNull String instanceClass, int priority) {
        Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public <T> void bindServiceClass(@NotNull Class<T> interfaceClass, @NotNull Class<? extends T> implementationClass, int priority) {
        Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
        Intrinsics.checkNotNullParameter(implementationClass, "implementationClass");
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public <T> void bindServiceInstance(@NotNull Class<T> interfaceClass, T instanceClass, int priority) {
        Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public boolean unbind(@NotNull Class<?> interfaceClass, int maxPriority) {
        Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
        return false;
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    @NotNull
    public Map<String, Pair<Integer, Class<?>>> getDefaultClassMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        return super.getDefaultClassMappings(serviceLocatorInterface);
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    @NotNull
    public Map<String, Pair<Integer, Object>> getDefaultInstanceMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        return super.getDefaultInstanceMappings(serviceLocatorInterface);
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    @NotNull
    public Map<String, Pair<Integer, EnumC40613W2>> getDefaultPluginMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        return super.getDefaultPluginMappings(serviceLocatorInterface);
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    @NotNull
    public Map<String, Pair<Integer, String>> getDefaultReflectionMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        return super.getDefaultReflectionMappings(serviceLocatorInterface);
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public int getPRIORITY_DEFAULT() {
        return super.getPRIORITY_DEFAULT();
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public int getPRIORITY_MAX() {
        return super.getPRIORITY_MAX();
    }

    @Override // com.jumio.core.ServiceLocatorInterface
    public int getPRIORITY_MIDDLE() {
        return super.getPRIORITY_MIDDLE();
    }
}
