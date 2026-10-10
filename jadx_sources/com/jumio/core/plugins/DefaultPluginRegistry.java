package com.jumio.core.plugins;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.util.ReflectionUtil;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jumio.core.EnumC40608V2;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\t2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/plugins/DefaultPluginRegistry;", "Lcom/jumio/core/plugins/PluginRegistryInterface;", "<init>", "()V", "lock", "", "cachedPlugins", "Ljava/util/EnumMap;", "Lcom/jumio/core/plugins/PluginModule;", "Lcom/jumio/core/plugins/Plugin;", "getPlugin", ExifInterface.GPS_DIRECTION_TRUE, "pluginModule", "(Lcom/jumio/core/plugins/PluginModule;)Lcom/jumio/core/plugins/Plugin;", "hasPlugin", "", "hasDependency", "pluginDependency", "Lcom/jumio/core/plugins/PluginDependency;", "clearCache", "", "hasDependencies", "dependencies", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultPluginRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPluginRegistry.kt\ncom/jumio/core/plugins/DefaultPluginRegistry\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n216#2,2:56\n1734#3,3:58\n*S KotlinDebug\n*F\n+ 1 DefaultPluginRegistry.kt\ncom/jumio/core/plugins/DefaultPluginRegistry\n*L\n42#1:56,2\n52#1:58,3\n*E\n"})
public final class DefaultPluginRegistry implements PluginRegistryInterface {

    /* JADX INFO: renamed from: a */
    public final Object f14465a = new Object();

    /* JADX INFO: renamed from: b */
    public final EnumMap f14466b = new EnumMap(EnumC40613W2.class);

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    public void clearCache() {
        synchronized (this.f14465a) {
            try {
                Iterator it = this.f14466b.entrySet().iterator();
                while (it.hasNext()) {
                    ((Plugin) ((Map.Entry) it.next()).getValue()).unload();
                }
                this.f14466b.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    @Nullable
    public <T extends Plugin> T getPlugin(@NotNull EnumC40613W2 pluginModule) {
        Intrinsics.checkNotNullParameter(pluginModule, "pluginModule");
        List list = pluginModule.f90172b;
        T t11 = null;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hasDependency((EnumC40608V2) it.next())) {
                    return null;
                }
            }
        }
        synchronized (this.f14465a) {
            Plugin plugin = (Plugin) this.f14466b.get(pluginModule);
            if (plugin != null) {
                t11 = (T) plugin;
            } else {
                Class<?> cls = ReflectionUtil.INSTANCE.getClass(pluginModule.f90171a);
                if (cls != null) {
                    try {
                        Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type T of com.jumio.core.plugins.DefaultPluginRegistry.getPlugin");
                        plugin = (Plugin) objNewInstance;
                    } catch (Exception unused) {
                        plugin = null;
                    }
                    if (plugin != null) {
                        this.f14466b.put(pluginModule, plugin);
                        t11 = (T) plugin;
                    }
                }
            }
        }
        return t11;
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    public boolean hasDependency(@NotNull EnumC40608V2 pluginDependency) {
        boolean zHasClass;
        Intrinsics.checkNotNullParameter(pluginDependency, "pluginDependency");
        synchronized (this.f14465a) {
            zHasClass = ReflectionUtil.INSTANCE.hasClass(pluginDependency.f90150a);
        }
        return zHasClass;
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    public boolean hasPlugin(@NotNull EnumC40613W2 pluginModule) {
        boolean z11;
        Intrinsics.checkNotNullParameter(pluginModule, "pluginModule");
        synchronized (this.f14465a) {
            if (ReflectionUtil.INSTANCE.hasClass(pluginModule.f90171a)) {
                List list = pluginModule.f90172b;
                if (!list.isEmpty() && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!hasDependency((EnumC40608V2) it.next())) {
                                z11 = false;
                            }
                        }
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    @NotNull
    public List<String> getAvailablePluginNames() {
        return super.getAvailablePluginNames();
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    @NotNull
    public List<EnumC40613W2> getAvailablePlugins() {
        return super.getAvailablePlugins();
    }

    @Override // com.jumio.core.plugins.PluginRegistryInterface
    @NotNull
    public String getLinkedModulesCode() {
        return super.getLinkedModulesCode();
    }
}
