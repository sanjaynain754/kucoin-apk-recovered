package p357j3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: j3.g */
/* JADX INFO: compiled from: AppEventUtility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lj3/g;", "", "<init>", "()V", "", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "value", "", "g", "(Ljava/lang/String;)D", "", "bytes", "c", "([B)Ljava/lang/String;", "", "f", "()Z", "d", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/view/View;", "e", "(Landroid/app/Activity;)Landroid/view/View;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40258g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40258g f89480a = new C40258g();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m88608c(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bytes) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final View m88610e(@Nullable Activity activity) {
        if (C42757a.m93689d(C40258g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40258g.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m88611f() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT, "unknown", false, 2, (Object) null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                return true;
            }
        }
        return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final double m88612g(@Nullable String value) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(value);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C5760c.m10091z()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m88609d() {
        Context contextM7799m = C5501a.m7799m();
        try {
            String str = contextM7799m.getPackageManager().getPackageInfo(contextM7799m.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m88606a() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m88607b() {
    }
}
