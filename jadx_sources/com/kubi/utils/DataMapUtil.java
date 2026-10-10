package com.kubi.utils;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.mmkv.MMKV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import v70.C45463a;

/* JADX INFO: compiled from: DataMapUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Deprecated(message = "KVStore", replaceWith = @ReplaceWith(expression = "KVStore", imports = {}))
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-¨\u0006/"}, m90084d2 = {"Lcom/kubi/utils/DataMapUtil;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", "isDebug", "", "k", "(Landroid/app/Application;Z)V", "", "name", "Landroid/content/SharedPreferences;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Landroid/content/SharedPreferences;", "key", "p", "(Ljava/lang/String;)Lcom/kubi/utils/DataMapUtil;", "defValue", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Z)Z", "", "c", "(Ljava/lang/String;I)I", "", "e", "(Ljava/lang/String;J)J", "i", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "n", "(Ljava/lang/String;J)Lcom/kubi/utils/DataMapUtil;", "m", "(Ljava/lang/String;I)Lcom/kubi/utils/DataMapUtil;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Z)Lcom/kubi/utils/DataMapUtil;", "o", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/DataMapUtil;", "Lcom/tencent/mmkv/MMKV;", "b", "Lkotlin/Lazy;", "g", "()Lcom/tencent/mmkv/MMKV;", "mObj", "Landroid/app/Application;", "mContext", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DataMapUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DataMapUtil f54245a = new DataMapUtil();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mObj = LazyKt.lazy(new Function0<MMKV>() { // from class: com.kubi.utils.DataMapUtil$mObj$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final MMKV invoke() {
            return MMKV.defaultMMKV();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Application mContext;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m66366b(DataMapUtil dataMapUtil, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return dataMapUtil.m66370a(str, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m66367d(DataMapUtil dataMapUtil, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return dataMapUtil.m66371c(str, i11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m66368f(DataMapUtil dataMapUtil, String str, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return dataMapUtil.m66372e(str, j11);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m66369j(DataMapUtil dataMapUtil, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return dataMapUtil.m66375i(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public final MMKV m66373g() {
        return (MMKV) mObj.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m66376k(@NotNull Application context, boolean isDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        mContext = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66370a(@NotNull String key, boolean defValue) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            boolValueOf = Boolean.valueOf(mmkvM66373g.getBoolean(key, defValue));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: c */
    public final int m66371c(@NotNull String key, int defValue) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            numValueOf = Integer.valueOf(mmkvM66373g.getInt(key, defValue));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: e */
    public final long m66372e(@NotNull String key, long defValue) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            lValueOf = Long.valueOf(mmkvM66373g.getLong(key, defValue));
        } else {
            lValueOf = null;
        }
        return C27039d.m66652l(lValueOf);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final SharedPreferences m66374h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            return mmkvM66373g;
        }
        C45463a.m100409b("getSharedPreferences is null " + name, "DataMapUtil");
        Application application = mContext;
        Intrinsics.checkNotNull(application);
        SharedPreferences sharedPreferences = application.getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "mContext!!.getSharedPref…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m66375i(@NotNull String key, @NotNull String defValue) {
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            string = mmkvM66373g.getString(key, defValue);
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final DataMapUtil m66377l(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            mmkvM66373g.putBoolean(key, value);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final DataMapUtil m66378m(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            mmkvM66373g.putInt(key, value);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final DataMapUtil m66379n(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            mmkvM66373g.putLong(key, value);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final DataMapUtil m66380o(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            mmkvM66373g.putString(key, value);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final DataMapUtil m66381p(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MMKV mmkvM66373g = m66373g();
        if (mmkvM66373g != null) {
            mmkvM66373g.remove(key);
        }
        return this;
    }
}
