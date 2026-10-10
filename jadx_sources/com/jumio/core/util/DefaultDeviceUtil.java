package com.jumio.core.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.environment.CpuInfo;
import com.jumio.core.environment.Environment;
import com.jumio.core.interfaces.DeviceUtilInterface;
import com.tencent.bugly.proguard.C33812n7;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jumio.core.AbstractC40519D2;
import jumio.core.AbstractC40547J0;
import jumio.core.AbstractC40716q3;
import jumio.core.C40570N3;
import jumio.core.InterfaceC40602U1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/util/DefaultDeviceUtil;", "Lcom/jumio/core/interfaces/DeviceUtilInterface;", "installationIdProvider", "Lcom/jumio/core/provider/InstallationIdProvider;", "<init>", "(Lcom/jumio/core/provider/InstallationIdProvider;)V", "EMULATOR_PROPS", "", "", "getEMULATOR_PROPS$annotations", "()V", "cpuFamily", "getCpuFamily", "()Ljava/lang/String;", "cpuFeatures", "getCpuFeatures", "isSupportedPlatform", "", "context", "Landroid/content/Context;", "useIntel", "isDebug", "areAnimationsEnabled", "isDarkModeActive", "isTalkbackEnabled", "installationId", C33812n7.f71057p, "isEmulatorPropertiesPresent", "hasEmulatorRelatedFiles", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeviceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUtil.kt\ncom/jumio/core/util/DefaultDeviceUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1755#2,3:154\n*S KotlinDebug\n*F\n+ 1 DeviceUtil.kt\ncom/jumio/core/util/DefaultDeviceUtil\n*L\n145#1:154,3\n*E\n"})
public final class DefaultDeviceUtil implements DeviceUtilInterface {

    /* JADX INFO: renamed from: a */
    public final InterfaceC40602U1 f14580a;

    /* JADX INFO: renamed from: b */
    public final Map f14581b;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDeviceUtil() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean isDebug(@Nullable Context context) {
        ApplicationInfo applicationInfo;
        return (((context == null || (applicationInfo = context.getApplicationInfo()) == null) ? 0 : applicationInfo.flags) & 2) != 0;
    }

    public DefaultDeviceUtil(@NotNull InterfaceC40602U1 installationIdProvider) {
        Intrinsics.checkNotNullParameter(installationIdProvider, "installationIdProvider");
        this.f14580a = installationIdProvider;
        this.f14581b = MapsKt.mutableMapOf(TuplesKt.m90091to(StringDeobfuscator.deobfuscate(new byte[]{0, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.QuantizeOptions, -89, 7, BuiltinOptions.LeakyReluOptions, 22, BuiltinOptions.ResizeNearestNeighborOptions, 3, -94, BuiltinOptions.CastOptions, -124, -94, BuiltinOptions.AddNOptions}, -6319064459816739747L), "1"), TuplesKt.m90091to(StringDeobfuscator.deobfuscate(new byte[]{25, -97, BuiltinOptions.SplitVOptions, BuiltinOptions.SparseToDenseOptions, -17, -31, -74, -62, 24, -77, -85, -76}, -3554266572659500706L), "1"));
    }

    /* JADX INFO: renamed from: a */
    public static String m14597a() {
        int cpuFamily = CpuInfo.INSTANCE.getCpuFamily();
        switch (cpuFamily) {
            case 1:
                return "ARM";
            case 2:
                return "X86";
            case 3:
                return "MIPS";
            case 4:
                return "ARM64";
            case 5:
                return "X86_64";
            case 6:
                return "MIPS64";
            default:
                return "UNKNOWN (" + cpuFamily + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m14598b() {
        String strM89156a;
        CpuInfo cpuInfo = CpuInfo.INSTANCE;
        int cpuFeatures = cpuInfo.getCpuFeatures();
        int cpuFamily = cpuInfo.getCpuFamily();
        if (cpuFamily != 1) {
            if (cpuFamily == 2) {
                strM89156a = (cpuFeatures & 1) == 1 ? "SSSE3 " : "";
                if ((cpuFeatures & 2) == 2) {
                    strM89156a = strM89156a.concat("POPCNT ");
                }
                return (cpuFeatures & 4) == 4 ? AbstractC40519D2.m89156a(strM89156a, "MOVBE ") : strM89156a;
            }
            if (cpuFamily != 4) {
                return "";
            }
            strM89156a = (cpuFeatures & 1) == 1 ? "FP " : "";
            if ((cpuFeatures & 2) == 2) {
                strM89156a = strM89156a.concat("ASIMD ");
            }
            if ((cpuFeatures & 4) == 4) {
                strM89156a = AbstractC40519D2.m89156a(strM89156a, "AES ");
            }
            if ((cpuFeatures & 8) == 8) {
                strM89156a = AbstractC40519D2.m89156a(strM89156a, "PMULL ");
            }
            if ((cpuFeatures & 16) == 16) {
                strM89156a = AbstractC40519D2.m89156a(strM89156a, "SHA1 ");
            }
            if ((cpuFeatures & 32) == 32) {
                strM89156a = AbstractC40519D2.m89156a(strM89156a, "SHA2 ");
            }
            return (cpuFeatures & 64) == 64 ? AbstractC40519D2.m89156a(strM89156a, "CRC32 ") : strM89156a;
        }
        strM89156a = (cpuFeatures & 1) == 1 ? "ARMv7 " : "";
        if ((cpuFeatures & 2) == 2) {
            strM89156a = strM89156a.concat("VFPv3 ");
        }
        if ((cpuFeatures & 4) == 4) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "NEON ");
        }
        if ((cpuFeatures & 8) == 8) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "LDREX_STREX ");
        }
        if ((cpuFeatures & 16) == 16) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "VFPv2 ");
        }
        if ((cpuFeatures & 32) == 32) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "VFP_D32 ");
        }
        if ((cpuFeatures & 64) == 64) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "VFP_FP16 ");
        }
        if ((cpuFeatures & 128) == 128) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "VFP_FMA ");
        }
        if ((cpuFeatures & 256) == 256) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "NEON_FMA ");
        }
        if ((cpuFeatures & 512) == 512) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "IDIV_ARM ");
        }
        if ((cpuFeatures & 1024) == 1024) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "IDIV_THUMB2 ");
        }
        if ((cpuFeatures & 2048) == 2048) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "iWMMXt ");
        }
        if ((cpuFeatures & 4096) == 4096) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "AES ");
        }
        if ((cpuFeatures & 8192) == 8192) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "PMULL ");
        }
        if ((cpuFeatures & 16384) == 16384) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "SHA1 ");
        }
        if ((cpuFeatures & 32768) == 32768) {
            strM89156a = AbstractC40519D2.m89156a(strM89156a, "SHA2 ");
        }
        return (65536 & cpuFeatures) == 65536 ? AbstractC40519D2.m89156a(strM89156a, "CRC32 ") : strM89156a;
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean areAnimationsEnabled(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f) == 0.0f) ? false : true;
        } catch (Exception unused) {
        }
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean hasEmulatorRelatedFiles() {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"/dev/qemu_pipe", "/dev/qemu_pipe_virtio", "/system/bin/qemu-props", "/system/bin/vboxservice", "/system/bin/and64", "/init.goldfish.rc"});
        if (listListOf != null && listListOf.isEmpty()) {
            return false;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (new File((String) it.next()).exists()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    @NotNull
    public String installationId(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((C40570N3) this.f14580a).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC40547J0.m89193a(context);
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean isDarkModeActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean isEmulatorPropertiesPresent() {
        return AbstractC40716q3.m89266a(this.f14581b);
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean isSupportedPlatform(@NotNull Context context, boolean useIntel) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Environment.INSTANCE.loadCpuInfoLib(context)) {
            return (Intrinsics.areEqual(m14597a(), "ARM") && StringsKt.contains$default((CharSequence) m14598b(), (CharSequence) "ARMv7", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) m14598b(), (CharSequence) "NEON", false, 2, (Object) null)) || Intrinsics.areEqual(m14597a(), "ARM64") || (Intrinsics.areEqual(m14597a(), "X86") && useIntel) || (Intrinsics.areEqual(m14597a(), "X86_64") && useIntel);
        }
        return false;
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    public boolean isTalkbackEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // com.jumio.core.interfaces.DeviceUtilInterface
    @NotNull
    public String userAgent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "Android; " + Build.VERSION.RELEASE + "; " + Build.MANUFACTURER + ' ' + Build.MODEL + "; SDK 4.17.0 (1)";
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return StringsKt.startsWith$default(packageName, "com.jumio.instantverify", false, 2, (Object) null) ? AbstractC40519D2.m89156a(str, "; instantverify") : str;
    }

    public /* synthetic */ DefaultDeviceUtil(InterfaceC40602U1 interfaceC40602U1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new C40570N3() : interfaceC40602U1);
    }
}
