package com.jumio.core;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.camera.CameraManagerInterface;
import com.jumio.commons.camera.renderer.utils.DefaultOpenGLInterface;
import com.jumio.commons.camera.renderer.utils.OpenGLInterface;
import com.jumio.core.camera.CameraConnectionInterface;
import com.jumio.core.camera.CameraDataInterface;
import com.jumio.core.camera.DefaultCameraConnection;
import com.jumio.core.cdn.CDNConfigInterface;
import com.jumio.core.cdn.DefaultCDNConfig;
import com.jumio.core.extraction.DefaultExtractionUpdate;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.image.DiskImageStore;
import com.jumio.core.image.ImageStoreInterface;
import com.jumio.core.interfaces.ConnectionInterface;
import com.jumio.core.interfaces.DeviceUtilInterface;
import com.jumio.core.interfaces.QAInterface;
import com.jumio.core.interfaces.VibratorInterface;
import com.jumio.core.network.AWSTrustManager;
import com.jumio.core.network.BackendConfigInterface;
import com.jumio.core.network.DefaultBackendConfig;
import com.jumio.core.network.DownloadService;
import com.jumio.core.network.DownloadServiceInterface;
import com.jumio.core.network.TrustManagerInterface;
import com.jumio.core.plugins.DefaultPluginRegistry;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.core.scope.DefaultScopeProvider;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.sensors.DefaultSensorFactory;
import com.jumio.core.sensors.SensorFactoryInterface;
import com.jumio.core.util.ConnectionChecker;
import com.jumio.core.util.DefaultDeviceUtil;
import com.jumio.core.util.DefaultQA;
import com.jumio.core.util.Vibrator;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&J6\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00100\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0003H&J3\u0010\u0015\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\u0006\u0010\u0016\u001a\u0002H\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0003H&¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u0003H&J\u001e\u0010\u001a\u001a\u00020\u001b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&J3\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u001fH&¢\u0006\u0002\u0010 J$\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#0\"*\u00020\u0000H\u0016J(\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120#0\"*\u00020\u0000H\u0016J$\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190#0\"*\u00020\u0000H\u0016J$\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0#0\"*\u00020\u0000H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006(À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/ServiceLocatorInterface;", "", "PRIORITY_DEFAULT", "", "getPRIORITY_DEFAULT", "()I", "PRIORITY_MIDDLE", "getPRIORITY_MIDDLE", "PRIORITY_MAX", "getPRIORITY_MAX", "init", "", "context", "Landroid/content/Context;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "bindServiceClass", ExifInterface.GPS_DIRECTION_TRUE, "interfaceClass", "Ljava/lang/Class;", "implementationClass", "priority", "bindServiceInstance", "instanceClass", "(Ljava/lang/Class;Ljava/lang/Object;I)V", "bindReflectionClass", "", "unbind", "", "maxPriority", "getServiceImplementation", "onError", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getDefaultInstanceMappings", "", "Lkotlin/Pair;", "getDefaultClassMappings", "getDefaultReflectionMappings", "getDefaultPluginMappings", "Lcom/jumio/core/plugins/PluginModule;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ServiceLocatorInterface {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Map<String, Pair<Integer, Class<?>>> getDefaultClassMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface, @NotNull ServiceLocatorInterface receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ServiceLocatorInterface.super.getDefaultClassMappings(receiver);
        }

        @Deprecated
        @NotNull
        public static Map<String, Pair<Integer, Object>> getDefaultInstanceMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface, @NotNull ServiceLocatorInterface receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ServiceLocatorInterface.super.getDefaultInstanceMappings(receiver);
        }

        @Deprecated
        @NotNull
        public static Map<String, Pair<Integer, EnumC40613W2>> getDefaultPluginMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface, @NotNull ServiceLocatorInterface receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ServiceLocatorInterface.super.getDefaultPluginMappings(receiver);
        }

        @Deprecated
        @NotNull
        public static Map<String, Pair<Integer, String>> getDefaultReflectionMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface, @NotNull ServiceLocatorInterface receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ServiceLocatorInterface.super.getDefaultReflectionMappings(receiver);
        }

        @Deprecated
        public static int getPRIORITY_DEFAULT(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
            return ServiceLocatorInterface.super.getPRIORITY_DEFAULT();
        }

        @Deprecated
        public static int getPRIORITY_MAX(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
            return ServiceLocatorInterface.super.getPRIORITY_MAX();
        }

        @Deprecated
        public static int getPRIORITY_MIDDLE(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
            return ServiceLocatorInterface.super.getPRIORITY_MIDDLE();
        }
    }

    void bindReflectionClass(@NotNull String interfaceClass, @NotNull String instanceClass, int priority);

    <T> void bindServiceClass(@NotNull Class<T> interfaceClass, @NotNull Class<? extends T> implementationClass, int priority);

    <T> void bindServiceInstance(@NotNull Class<T> interfaceClass, T instanceClass, int priority);

    void destroy();

    default int getPRIORITY_DEFAULT() {
        return 0;
    }

    <T> T getServiceImplementation(@NotNull Class<T> interfaceClass, @Nullable Function0<? extends T> onError);

    void init(@NotNull Context context);

    boolean unbind(@NotNull Class<?> interfaceClass, int maxPriority);

    static /* synthetic */ void bindReflectionClass$default(ServiceLocatorInterface serviceLocatorInterface, String str, String str2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindReflectionClass");
        }
        if ((i12 & 4) != 0) {
            i11 = serviceLocatorInterface.getPRIORITY_DEFAULT();
        }
        serviceLocatorInterface.bindReflectionClass(str, str2, i11);
    }

    static /* synthetic */ void bindServiceClass$default(ServiceLocatorInterface serviceLocatorInterface, Class cls, Class cls2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindServiceClass");
        }
        if ((i12 & 4) != 0) {
            i11 = serviceLocatorInterface.getPRIORITY_DEFAULT();
        }
        serviceLocatorInterface.bindServiceClass(cls, cls2, i11);
    }

    static /* synthetic */ void bindServiceInstance$default(ServiceLocatorInterface serviceLocatorInterface, Class cls, Object obj, int i11, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindServiceInstance");
        }
        if ((i12 & 4) != 0) {
            i11 = serviceLocatorInterface.getPRIORITY_DEFAULT();
        }
        serviceLocatorInterface.bindServiceInstance(cls, obj, i11);
    }

    static /* synthetic */ Object getServiceImplementation$default(ServiceLocatorInterface serviceLocatorInterface, Class cls, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServiceImplementation");
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return serviceLocatorInterface.getServiceImplementation(cls, function0);
    }

    static /* synthetic */ boolean unbind$default(ServiceLocatorInterface serviceLocatorInterface, Class cls, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unbind");
        }
        if ((i12 & 2) != 0) {
            i11 = serviceLocatorInterface.getPRIORITY_DEFAULT();
        }
        return serviceLocatorInterface.unbind(cls, i11);
    }

    @NotNull
    default Map<String, Pair<Integer, Class<?>>> getDefaultClassMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        Intrinsics.checkNotNullParameter(serviceLocatorInterface, "<this>");
        return MapsKt.mapOf(TuplesKt.m90091to(ExtractionUpdateInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), DefaultExtractionUpdate.class)), TuplesKt.m90091to(TrustManagerInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), AWSTrustManager.class)), TuplesKt.m90091to(ImageStoreInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), DiskImageStore.class)), TuplesKt.m90091to(DownloadServiceInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), DownloadService.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    default Map<String, Pair<Integer, Object>> getDefaultInstanceMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        Intrinsics.checkNotNullParameter(serviceLocatorInterface, "<this>");
        return MapsKt.mapOf(TuplesKt.m90091to(PluginRegistryInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultPluginRegistry())), TuplesKt.m90091to(BackendConfigInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultBackendConfig())), TuplesKt.m90091to(CDNConfigInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultCDNConfig())), TuplesKt.m90091to(DeviceUtilInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultDeviceUtil(null, 1, 0 == true ? 1 : 0))), TuplesKt.m90091to(QAInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultQA())), TuplesKt.m90091to(VibratorInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new Vibrator())), TuplesKt.m90091to(ScopeProviderInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultScopeProvider(null, null, null, null, 15, null))), TuplesKt.m90091to(SensorFactoryInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultSensorFactory())), TuplesKt.m90091to(ConnectionInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new ConnectionChecker())), TuplesKt.m90091to(CameraConnectionInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultCameraConnection())), TuplesKt.m90091to(OpenGLInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), new DefaultOpenGLInterface())));
    }

    @NotNull
    default Map<String, Pair<Integer, EnumC40613W2>> getDefaultPluginMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        Intrinsics.checkNotNullParameter(serviceLocatorInterface, "<this>");
        return MapsKt.mapOf(TuplesKt.m90091to(CameraManagerInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), EnumC40613W2.CAMERA_X)));
    }

    @NotNull
    default Map<String, Pair<Integer, String>> getDefaultReflectionMappings(@NotNull ServiceLocatorInterface serviceLocatorInterface) {
        Intrinsics.checkNotNullParameter(serviceLocatorInterface, "<this>");
        return MapsKt.mapOf(TuplesKt.m90091to("com.jumio.core.extraction.nfc.core.NfcControllerInterface", new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), "com.jumio.core.extraction.nfc.core.DefaultNfcController")), TuplesKt.m90091to(CameraDataInterface.class.getName(), new Pair(Integer.valueOf(serviceLocatorInterface.getPRIORITY_DEFAULT()), "com.jumio.liveness.StandaloneCameraData")));
    }

    default int getPRIORITY_MAX() {
        return 99;
    }

    default int getPRIORITY_MIDDLE() {
        return 49;
    }
}
