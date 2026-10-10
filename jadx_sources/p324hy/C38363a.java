package p324hy;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.core.content.p020pm.PackageInfoCompat;
import com.kubi.sdk.util.DeviceTier;
import com.kubi.sdk.util.DeviceTierProvider;
import com.tencent.bugly.library.Bugly;
import com.tencent.bugly.library.BuglyBuilder;
import com.tencent.bugly.library.BuglyLogLevel;
import com.tencent.bugly.proguard.C33938ta;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: hy.a */
/* JADX INFO: compiled from: BuglyInit.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/bugly/BuglyInit;", "", "<init>", "()V", "TAG", "", "SERVER_HOST_TYPE_BUGLY_CLOUD_SGP", "initBugly", "", "context", "Landroid/content/Context;", "maskSecret", "value", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuglyInit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuglyInit.kt\ncom/kubi/sdk/bugly/BuglyInit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class C38363a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38363a f86124a = new C38363a();

    /* JADX INFO: renamed from: a */
    public final void m86561a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C44128b.m97266j(C33938ta.f72060a, "config variant=googleRelease, enabled=true, debug=false, appId=" + m86562b("2fccf9e0b1"));
        if (StringsKt.isBlank("2fccf9e0b1") || StringsKt.isBlank("4124c04a-d9b5-4a0a-a8c8-7037a20ab0b7")) {
            C44128b.m97266j(C33938ta.f72060a, "Bugly config missing for flavor: google");
            return;
        }
        BuglyBuilder buglyBuilder = new BuglyBuilder("2fccf9e0b1", "4124c04a-d9b5-4a0a-a8c8-7037a20ab0b7");
        C44128b.m97259c(C33938ta.f72060a, "initBugly: appId=" + m86562b("2fccf9e0b1") + ", appKey=" + m86562b("4124c04a-d9b5-4a0a-a8c8-7037a20ab0b7"));
        buglyBuilder.setServerHostType("https://buglycloud.sgp.tencent.com");
        String str = Build.MODEL;
        Intrinsics.checkNotNull(str);
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            str = "unknown";
        }
        buglyBuilder.deviceModel = str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String strValueOf = String.valueOf(PackageInfoCompat.getLongVersionCode(packageInfo));
            buglyBuilder.buildNumber = strValueOf;
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                buglyBuilder.appVersion = str2 + '.' + strValueOf;
            }
            C44128b.m97259c(C33938ta.f72060a, "initBugly version: " + packageInfo.versionName + " ,buildNum: " + strValueOf);
        } catch (Exception unused) {
        }
        C44128b.m97259c(C33938ta.f72060a, "initBugly debuggable = false");
        buglyBuilder.appVersionType = "Release";
        buglyBuilder.appChannel = "google";
        buglyBuilder.logLevel = BuglyLogLevel.LEVEL_OFF;
        buglyBuilder.enableAllThreadStackCrash = true;
        buglyBuilder.enableAllThreadStackAnr = true;
        buglyBuilder.enableCrashProtect = true;
        buglyBuilder.debugMode = false;
        DeviceTier deviceTierM58405b = DeviceTierProvider.m58405b(context);
        boolean zInit = Bugly.init(context, buglyBuilder);
        C44128b.m97259c(C33938ta.f72060a, "initBugly " + zInit);
        if (zInit) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Bugly.putUserData(context, "kc_device_tier", deviceTierM58405b.getStrValue());
                Bugly.putUserData(context, "LOW_DEVICE", String.valueOf(deviceTierM58405b.getIsLowDevice()));
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m86562b(String str) {
        if (str.length() <= 8) {
            return "***";
        }
        return StringsKt.take(str, 4) + "***" + StringsKt.takeLast(str, 4);
    }
}
