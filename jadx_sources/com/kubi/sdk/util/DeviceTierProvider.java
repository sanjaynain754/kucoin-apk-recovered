package com.kubi.sdk.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.util.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DeviceTierProvider.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/util/DeviceTierProvider;", "", "<init>", "()V", "DEVICE_TIER_PROPERTY", "", "LOW_DEVICE_PROPERTY", "MIB_BYTES", "", "ULTRA_LOW_LIMIT_BYTES", "LOW_LIMIT_BYTES", "HIGH_LIMIT_BYTES", "HIGH_MEDIA_PERFORMANCE_CLASS", "", "FORCED_ULTRA_LOW_MODELS", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "cachedTier", "Lcom/kubi/sdk/util/DeviceTier;", "get", "context", "Landroid/content/Context;", "detectDeviceTier", "normalizeModel", "model", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeviceTierProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceTierProvider.kt\ncom/kubi/sdk/util/DeviceTierProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1#2:124\n1634#3,3:125\n*S KotlinDebug\n*F\n+ 1 DeviceTierProvider.kt\ncom/kubi/sdk/util/DeviceTierProvider\n*L\n54#1:125,3\n*E\n"})
public final class DeviceTierProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DeviceTierProvider f48163a = new DeviceTierProvider();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashSet<String> f48164b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile DeviceTier f48165c;

    static {
        Set of2 = SetsKt.setOf((Object[]) new String[]{"sdk_gphone16k_arm64", "OnePlus8Pro", "sdk_gphone64_x86_64", "Android SDK built for x86_64", "Phone", "sdk_gphone_x86_64", "sdk_gphone64_arm64", "redroid11_arm64", "ums9230_hulk_Natv", "AOSP on blueline", "17 Pro Max"});
        HashSet<String> hashSet = new HashSet<>();
        Iterator it = of2.iterator();
        while (it.hasNext()) {
            hashSet.add(f48163a.m58407c((String) it.next()));
        }
        f48164b = hashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final DeviceTier m58405b(@NotNull Context context) {
        DeviceTier deviceTier;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceTier deviceTier2 = f48165c;
        if (deviceTier2 != null) {
            return deviceTier2;
        }
        DeviceTierProvider deviceTierProvider = f48163a;
        synchronized (deviceTierProvider) {
            deviceTier = f48165c;
            if (deviceTier == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(deviceTierProvider.m58406a(context));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                DeviceTier deviceTier3 = DeviceTier.UNKNOWN;
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = deviceTier3;
                }
                f48165c = (DeviceTier) objM103844constructorimpl;
                deviceTier = (DeviceTier) objM103844constructorimpl;
            }
        }
        return deviceTier;
    }

    /* JADX INFO: renamed from: a */
    public final DeviceTier m58406a(Context context) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        HashSet<String> hashSet = f48164b;
        if (!hashSet.isEmpty()) {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (hashSet.contains(m58407c(MODEL))) {
                return DeviceTier.UNKNOWN;
            }
        }
        Object systemService = context.getSystemService("activity");
        Long l11 = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(activityManager.isLowRamDevice()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            if (((Boolean) objM103844constructorimpl).booleanValue()) {
                return DeviceTier.ULTRA_LOW;
            }
        }
        if (activityManager != null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                Long lValueOf = Long.valueOf(memoryInfo.totalMem);
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                objM103844constructorimpl2 = Result.m103844constructorimpl(lValueOf);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            l11 = (Long) (Result.m103850isFailureimpl(objM103844constructorimpl2) ? null : objM103844constructorimpl2);
        }
        if (l11 != null && l11.longValue() <= 3355443200L) {
            return DeviceTier.ULTRA_LOW;
        }
        String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
        if (SUPPORTED_64_BIT_ABIS.length == 0) {
            return DeviceTier.LOW;
        }
        if (l11 != null && l11.longValue() <= 5033164800L) {
            return DeviceTier.LOW;
        }
        if (Build.VERSION.SDK_INT >= 31 && Build.VERSION.MEDIA_PERFORMANCE_CLASS >= 34) {
            return DeviceTier.HIGH;
        }
        if (l11 == null || l11.longValue() < 15032385536L) {
            return l11 != null ? DeviceTier.MID : DeviceTier.UNKNOWN;
        }
        return DeviceTier.HIGH;
    }

    /* JADX INFO: renamed from: c */
    public final String m58407c(String str) {
        String string = StringsKt.trim((CharSequence) str).toString();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = string.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
