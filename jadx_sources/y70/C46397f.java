package y70;

import android.app.Application;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.mmkv.MMKV;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y70.f */
/* JADX INFO: compiled from: MMKVUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J-\u0010(\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0007¢\u0006\u0004\b(\u0010)J5\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0007¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.JE\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010/*\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b2\u00103J!\u00105\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u0001042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002090<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010?¨\u0006A"}, m90084d2 = {"Ly70/f;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", "isDebug", "", "k", "(Landroid/app/Application;Z)V", "", "category", "key", "r", "(Ljava/lang/String;Ljava/lang/String;)Ly70/f;", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "defaultValue", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "value", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;Z)Ly70/f;", "", "m", "(Ljava/lang/String;Ljava/lang/String;I)Ly70/f;", "e", "(Ljava/lang/String;Ljava/lang/String;I)I", "", "n", "(Ljava/lang/String;Ljava/lang/String;J)Ly70/f;", "f", "(Ljava/lang/String;Ljava/lang/String;J)J", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/f;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "values", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/f;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "Landroid/os/Parcelable;", "o", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/f;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "", "c", "(Ljava/lang/String;)[Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lkotlin/Unit;", "Lcom/tencent/mmkv/MMKV;", "g", "(Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "mmkvMap", "Landroid/app/Application;", "mContext", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMMKVUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MMKVUtils.kt\ncom/kubi/utils/storage/MMKVUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class C46397f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46397f f104050a = new C46397f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, MMKV> mmkvMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Application mContext;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Unit m102361a(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        if (mmkvM102378g == null) {
            return null;
        }
        mmkvM102378g.clearAll();
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m102362b(@NotNull String category, @NotNull String key) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        return C27025c.m66566d(mmkvM102378g != null ? Boolean.valueOf(mmkvM102378g.containsKey(key)) : null);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String[] m102363c(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        if (mmkvM102378g != null) {
            return mmkvM102378g.allKeys();
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m102364d(@NotNull String category, @NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        return C27025c.m66567e(mmkvM102378g != null ? Boolean.valueOf(mmkvM102378g.getBoolean(key, defaultValue)) : null, defaultValue);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m102365e(@NotNull String category, @NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        return C27039d.m66651k(mmkvM102378g != null ? Integer.valueOf(mmkvM102378g.getInt(key, defaultValue)) : null, defaultValue);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final long m102366f(@NotNull String category, @NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        return C27039d.m66653m(mmkvM102378g != null ? Long.valueOf(mmkvM102378g.getLong(key, defaultValue)) : null, defaultValue);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final <T extends Parcelable> T m102367h(@NotNull String category, @NotNull String key, @NotNull Class<T> type, @Nullable T defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        if (mmkvM102378g != null) {
            return (T) mmkvM102378g.decodeParcelable(key, type, defaultValue);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m102368i(@NotNull String category, @NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        return C27041f.m66669i(mmkvM102378g != null ? mmkvM102378g.getString(key, defaultValue) : null, defaultValue);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Set<String> m102369j(@NotNull String category, @NotNull String key, @NotNull Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        MMKV mmkvM102378g = f104050a.m102378g(category);
        Set<String> stringSet = mmkvM102378g != null ? mmkvM102378g.getStringSet(key, CollectionsKt.toMutableSet(defaultValue)) : null;
        return stringSet == null ? defaultValue : stringSet;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m102370k(@NotNull Application context, boolean isDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        mContext = context;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C46397f m102371l(@NotNull String category, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.putBoolean(key, value);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C46397f m102372m(@NotNull String category, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.putInt(key, value);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final C46397f m102373n(@NotNull String category, @NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.putLong(key, value);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final C46397f m102374o(@NotNull String category, @NotNull String key, @NotNull Parcelable value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.encode(key, value);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C46397f m102375p(@NotNull String category, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.putString(key, value);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C46397f m102376q(@NotNull String category, @NotNull String key, @NotNull Set<String> values) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.putStringSet(key, values);
        }
        return c46397f;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final C46397f m102377r(@NotNull String category, @NotNull String key) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        C46397f c46397f = f104050a;
        MMKV mmkvM102378g = c46397f.m102378g(category);
        if (mmkvM102378g != null) {
            mmkvM102378g.remove(key);
        }
        return c46397f;
    }

    /* JADX INFO: renamed from: g */
    public final MMKV m102378g(String category) {
        ConcurrentHashMap<String, MMKV> concurrentHashMap = mmkvMap;
        MMKV mmkvMmkvWithID = concurrentHashMap.get(category);
        if (mmkvMmkvWithID == null && (mmkvMmkvWithID = MMKV.mmkvWithID(category)) != null) {
            concurrentHashMap.put(category, mmkvMmkvWithID);
        }
        return mmkvMmkvWithID;
    }
}
