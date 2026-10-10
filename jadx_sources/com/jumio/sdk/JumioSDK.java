package com.jumio.sdk;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import com.jumio.commons.log.LogUtils;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.ServiceLocator;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.models.TermsOfUseModel;
import com.jumio.core.plugins.DefaultPluginRegistry;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.core.util.DeviceUtilKt;
import com.jumio.sdk.JumioSDK;
import com.jumio.sdk.controller.JumioController;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.enums.JumioDataCenter;
import com.jumio.sdk.exceptions.PlatformNotSupportedException;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.termsofuse.JumioTermsOfUse;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jumio.core.AbstractC40716q3;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ¬\u0001\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0081\u0001\u0010\u001d\u001a}\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020(0'¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010,¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(-\u0012\u0015\u0012\u0013\u0018\u00010.¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001e0#R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00061"}, m90084d2 = {"Lcom/jumio/sdk/JumioSDK;", "", "<init>", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "customThemeId", "", "getCustomThemeId", "()I", "setCustomThemeId", "(I)V", InterfaceC33826o0.f71244p, "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "dataCenter", "Lcom/jumio/sdk/enums/JumioDataCenter;", "getDataCenter", "()Lcom/jumio/sdk/enums/JumioDataCenter;", "setDataCenter", "(Lcom/jumio/sdk/enums/JumioDataCenter;)V", "start", "Lcom/jumio/sdk/controller/JumioController;", "controllerInterface", "Lcom/jumio/sdk/interfaces/JumioControllerInterface;", "restore", "", "data", "Landroid/os/Bundle;", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "controller", "", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "credentials", "Lcom/jumio/sdk/credentials/JumioCredential;", "activeCredential", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "activeScanPart", "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;", "termsOfUse", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioSDK.kt\ncom/jumio/sdk/JumioSDK\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class JumioSDK {

    @StyleRes
    private int customThemeId;

    @Nullable
    private JumioDataCenter dataCenter;

    @NotNull
    private String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String version = "4.17.0 (1)";

    @NotNull
    private static final String[] requiredPermissions = {"android.permission.CAMERA"};

    @Keep
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J#\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/sdk/JumioSDK$Companion;", "", "<init>", "()V", "version", "", "getVersion$annotations", "getVersion", "()Ljava/lang/String;", "isSupportedPlatform", "", "context", "Landroid/content/Context;", "isRooted", "isTablet", "requiredPermissions", "", "getRequiredPermissions$annotations", "getRequiredPermissions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "hasAllRequiredPermissions", "hasPermissionsFor", "names", "(Landroid/content/Context;[Ljava/lang/String;)Z", "getMissingPermissions", "(Landroid/content/Context;)[Ljava/lang/String;", "checkSDKRequirements", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJumioSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioSDK.kt\ncom/jumio/sdk/JumioSDK$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,240:1\n37#2:241\n36#2,3:242\n*S KotlinDebug\n*F\n+ 1 JumioSDK.kt\ncom/jumio/sdk/JumioSDK$Companion\n*L\n133#1:241\n133#1:242,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void checkSDKRequirements(Context context) throws PlatformNotSupportedException {
            PluginRegistryInterface pluginRegistryInterface = (PluginRegistryInterface) ServiceLocator.INSTANCE.getServiceImplementation(PluginRegistryInterface.class, new Function0() { // from class: z9.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioSDK.Companion.checkSDKRequirements$lambda$0();
                }
            });
            if (Environment.INSTANCE.getAndroidSdkVersion() < 23) {
                throw new PlatformNotSupportedException("SDK Version 23 required");
            }
            if (Camera.getNumberOfCameras() == 0) {
                throw new PlatformNotSupportedException("No usable camera present");
            }
            if (!DeviceUtilKt.getDeviceUtil().isSupportedPlatform(context, pluginRegistryInterface.hasPlugin(EnumC40613W2.EMULATOR) && DeviceUtilKt.getDeviceUtil().isDebug(context))) {
                throw new PlatformNotSupportedException("ARMv7 CPU Architecture with NEON Intrinsics required");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PluginRegistryInterface checkSDKRequirements$lambda$0() {
            return new DefaultPluginRegistry();
        }

        @JvmStatic
        @NotNull
        public final String[] getMissingPermissions(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (hasAllRequiredPermissions(context)) {
                return new String[0];
            }
            ArrayList arrayList = new ArrayList();
            for (String str : getRequiredPermissions()) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @JvmStatic
        public final boolean hasAllRequiredPermissions(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return hasPermissionsFor(context, getRequiredPermissions());
        }

        @JvmStatic
        public final boolean hasPermissionsFor(@NotNull Context context, @NotNull String[] names) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(names, "names");
            for (String str : names) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
            return true;
        }

        @JvmStatic
        public final boolean isRooted(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AbstractC40716q3.m89265a(context);
        }

        @JvmStatic
        public final boolean isSupportedPlatform(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                checkSDKRequirements(context);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        @JvmStatic
        public final boolean isTablet(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return DeviceRotationManager.INSTANCE.isTabletDevice(context);
        }

        @NotNull
        public final String[] getRequiredPermissions() {
            return JumioSDK.requiredPermissions;
        }

        @NotNull
        public final String getVersion() {
            return JumioSDK.version;
        }

        @JvmStatic
        public static /* synthetic */ void getRequiredPermissions$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getVersion$annotations() {
        }
    }

    private JumioSDK() {
        this.token = "";
    }

    @JvmStatic
    private static final void checkSDKRequirements(Context context) throws PlatformNotSupportedException {
        INSTANCE.checkSDKRequirements(context);
    }

    @JvmStatic
    @NotNull
    public static final String[] getMissingPermissions(@NotNull Context context) {
        return INSTANCE.getMissingPermissions(context);
    }

    @NotNull
    public static final String[] getRequiredPermissions() {
        return INSTANCE.getRequiredPermissions();
    }

    @NotNull
    public static final String getVersion() {
        return INSTANCE.getVersion();
    }

    @JvmStatic
    public static final boolean hasAllRequiredPermissions(@NotNull Context context) {
        return INSTANCE.hasAllRequiredPermissions(context);
    }

    @JvmStatic
    public static final boolean hasPermissionsFor(@NotNull Context context, @NotNull String[] strArr) {
        return INSTANCE.hasPermissionsFor(context, strArr);
    }

    @JvmStatic
    public static final boolean isRooted(@NotNull Context context) {
        return INSTANCE.isRooted(context);
    }

    @JvmStatic
    public static final boolean isSupportedPlatform(@NotNull Context context) {
        return INSTANCE.isSupportedPlatform(context);
    }

    @JvmStatic
    public static final boolean isTablet(@NotNull Context context) {
        return INSTANCE.isTablet(context);
    }

    public final int getCustomThemeId() {
        return this.customThemeId;
    }

    @Nullable
    public final JumioDataCenter getDataCenter() {
        return this.dataCenter;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final void restore(@NotNull Context context, @NotNull Bundle data, @NotNull JumioControllerInterface controllerInterface, @Nullable JumioScanPartInterface scanPartInterface, @NotNull Function5<? super JumioController, ? super List<JumioCredentialInfo>, ? super JumioCredential, ? super JumioScanPart, ? super JumioTermsOfUse, Unit> restore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        Intrinsics.checkNotNullParameter(restore, "restore");
        JumioController jumioController = new JumioController(context, data, controllerInterface, scanPartInterface);
        ArrayList arrayListM14555a = ((CredentialsModel) jumioController.getF14674a().getF13603d().get(CredentialsModel.class)).m14555a();
        JumioCredential f13612m = jumioController.getF14674a().getF13612m();
        JumioCredential f13612m2 = jumioController.getF14674a().getF13612m();
        restore.invoke(jumioController, arrayListM14555a, f13612m, f13612m2 != null ? f13612m2.getF14677c() : null, ((TermsOfUseModel) jumioController.getF14674a().getF13603d().get(TermsOfUseModel.class)).f14365a);
        JumioCredential f13612m3 = jumioController.getF14674a().getF13612m();
        if (f13612m3 != null) {
            f13612m3.restore$jumio_core_release();
        }
    }

    public final void setCustomThemeId(int i11) {
        this.customThemeId = i11;
    }

    public final void setDataCenter(@Nullable JumioDataCenter jumioDataCenter) {
        this.dataCenter = jumioDataCenter;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    @NotNull
    public final JumioController start(@NotNull Context context, @NotNull JumioControllerInterface controllerInterface) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        JumioDataCenter jumioDataCenter = this.dataCenter;
        String str = this.token;
        if (str.length() <= 0 || jumioDataCenter == null) {
            throw new IllegalArgumentException("token and dataCenter need to be set");
        }
        LogUtils.INSTANCE.init();
        AuthorizationModel authorizationModel = new AuthorizationModel();
        authorizationModel.setToken(str);
        authorizationModel.setDataCenter(jumioDataCenter);
        authorizationModel.getF14185c().generate();
        Logger.getLogger("org.jmrtd").setLevel(Level.OFF);
        return new JumioController(context, authorizationModel, controllerInterface, this.customThemeId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JumioSDK(@NotNull Context context) {
        this();
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
