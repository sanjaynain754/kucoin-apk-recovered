package p333i6;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.C5501a;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: i6.p */
/* JADX INFO: compiled from: Validate.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e¨\u0006 "}, m90084d2 = {"Li6/p;", "", "<init>", "()V", "arg", "", "name", "", "g", "(Ljava/lang/Object;Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "", TtmlNode.RUBY_CONTAINER, "e", "(Ljava/util/Collection;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "Landroid/content/Context;", "context", "", "shouldThrow", "c", "(Landroid/content/Context;Z)V", "b", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nValidate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Validate.kt\ncom/facebook/internal/Validate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
public final class C38457p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38457p f86298a = new C38457p();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C38457p.class.getName();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final <T> void m86722a(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static final void m86723b(@NotNull Context context, boolean shouldThrow) {
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (shouldThrow) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m86724c(@NotNull Context context, boolean shouldThrow) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (shouldThrow) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m86725d(@NotNull String arg, @NotNull String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final <T> void m86726e(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        if (container.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final <T> void m86727f(@NotNull Collection<? extends T> container, @NotNull String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        m86722a(container, name);
        m86726e(container, name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m86728g(@Nullable Object arg, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m86729h(@Nullable String arg, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg != null && arg.length() > 0) {
            return arg;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m86730i() {
        if (C5501a.m7768D()) {
        } else {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
