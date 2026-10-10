package y70;

import android.app.Application;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.storage.StorageType;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y70.e */
/* JADX INFO: compiled from: MMKVHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Deprecated(message = "use KVStore", replaceWith = @ReplaceWith(expression = "KVStore", imports = {}))
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0007¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0007¢\u0006\u0004\b)\u0010*J'\u0010,\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-JE\u00101\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020+2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b1\u00102J!\u00104\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u0001032\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b6\u00107¨\u00068"}, m90084d2 = {"Ly70/e;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", "isDebug", "", "j", "(Landroid/app/Application;Z)V", "", "category", "key", "q", "(Ljava/lang/String;Ljava/lang/String;)Ly70/e;", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "value", "k", "(Ljava/lang/String;Ljava/lang/String;Z)Ly70/e;", "defaultValue", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;I)Ly70/e;", "e", "(Ljava/lang/String;Ljava/lang/String;I)I", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "m", "(Ljava/lang/String;Ljava/lang/String;J)Ly70/e;", "f", "(Ljava/lang/String;Ljava/lang/String;J)J", "", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/e;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "Landroid/os/Parcelable;", "n", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/e;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "", "c", "(Ljava/lang/String;)[Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMMKVHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 2 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,292:1\n17#1:293\n17#1:294\n17#1:295\n17#1:296\n17#1:297\n17#1:298\n17#1:299\n17#1:300\n17#1:301\n17#1:302\n17#1:303\n17#1:304\n17#1:305\n17#1:306\n17#1:307\n17#1:308\n17#1:310\n17#1:311\n17#1:312\n17#1:313\n17#1:314\n178#2:309\n*S KotlinDebug\n*F\n+ 1 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n*L\n28#1:293\n37#1:294\n43#1:295\n51#1:296\n57#1:297\n64#1:298\n71#1:299\n79#1:300\n85#1:301\n92#1:302\n98#1:303\n106#1:304\n112#1:305\n119#1:306\n128#1:307\n139#1:308\n150#1:310\n160#1:311\n172#1:312\n181#1:313\n193#1:314\n139#1:309\n*E\n"})
public final class C46396e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46396e f104049a = new C46396e();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m102344a(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        C46392a.m102319a(category);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m102345b(@NotNull String category, @NotNull String key) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        return C46392a.m102320b(new StorageId(category, key, StorageType.Shared, true));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String[] m102346c(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return C46392a.m102321c(category);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m102347d(@NotNull String category, @NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        return C46392a.m102322d(new StorageId(category, key, StorageType.Shared, true), defaultValue);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m102348e(@NotNull String category, @NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        return C46392a.m102323e(new StorageId(category, key, StorageType.Shared, true), defaultValue);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final long m102349f(@NotNull String category, @NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        return C46392a.m102324f(new StorageId(category, key, StorageType.Shared, true), defaultValue);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ Parcelable m102350g(String category, String key, Class type, Parcelable defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return C46392a.f104043a.m102336j(new StorageId(category, key, StorageType.Shared, true), type, defaultValue);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m102351h(@NotNull String category, @NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return C46392a.m102326h(new StorageId(category, key, StorageType.Shared, true), defaultValue);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Set<String> m102352i(@NotNull String category, @NotNull String key, @NotNull Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return CollectionsKt.toMutableSet(C46392a.m102327i(new StorageId(category, key, StorageType.Shared, true), defaultValue));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m102353j(@NotNull Application context, boolean isDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        C46395d.m102338c(context, isDebug);
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final C46396e m102354k(@NotNull String category, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46392a.m102328k(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C46396e m102355l(@NotNull String category, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46392a.m102329l(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C46396e m102356m(@NotNull String category, @NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46392a.m102330m(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final C46396e m102357n(@NotNull String category, @NotNull String key, @NotNull Parcelable value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46392a.m102331n(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final C46396e m102358o(@NotNull String category, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46392a.m102333p(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @Deprecated(message = "use StorageId", replaceWith = @ReplaceWith(expression = "StorageId", imports = {}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C46396e m102359p(@NotNull String category, @NotNull String key, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46392a.m102334q(new StorageId(category, key, StorageType.Shared, true), value);
        return f104049a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C46396e m102360q(@NotNull String category, @NotNull String key) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46392a.m102335r(new StorageId(category, key, StorageType.Shared, true));
        return f104049a;
    }
}
