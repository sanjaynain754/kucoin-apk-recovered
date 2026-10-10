package y70;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.storage.StorageType;
import com.kubi.utils.storage.WrapperList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y70.a */
/* JADX INFO: compiled from: KVStore.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\f\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u000f\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\u000f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u000f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J1\u0010\"\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170!0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0007¢\u0006\u0004\b\"\u0010#J7\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170!2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170!0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0007¢\u0006\u0004\b$\u0010%J/\u0010'\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\f\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J;\u0010+\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020&2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0007¢\u0006\u0004\b+\u0010,JC\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\b\b\u0000\u0010\u0004*\u00020&2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0007¢\u0006\u0004\b-\u0010.J!\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u0001002\u0006\u0010/\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010/\u001a\u00020\u0017H\u0007¢\u0006\u0004\b4\u00105J?\u00108\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b8\u00109¨\u0006:"}, m90084d2 = {"Ly70/a;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Ly70/g;", CmcdConfiguration.KEY_SESSION_ID, "r", "(Ly70/g;)Ly70/a;", "", "b", "(Ly70/g;)Z", "value", "k", "(Ly70/g;Z)Ly70/a;", "defaultValue", "d", "(Ly70/g;Z)Z", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ly70/g;I)Ly70/a;", "e", "(Ly70/g;I)I", "", "p", "(Ly70/g;Ljava/lang/String;)Ly70/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ly70/g;Ljava/lang/String;)Ljava/lang/String;", "", "m", "(Ly70/g;J)Ly70/a;", "f", "(Ly70/g;J)J", "", "q", "(Ly70/g;Ljava/util/Set;)Ly70/a;", "i", "(Ly70/g;Ljava/util/Set;)Ljava/util/Set;", "Landroid/os/Parcelable;", "n", "(Ly70/g;Landroid/os/Parcelable;)Ly70/a;", "", "list", "o", "(Ly70/g;Ljava/util/List;)Ly70/a;", "g", "(Ly70/g;Ljava/util/List;)Ljava/util/List;", "category", "", "c", "(Ljava/lang/String;)[Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "Ljava/lang/Class;", "clazz", "j", "(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKVStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 2 KVStoreCompat.kt\ncom/kubi/utils/storage/KVStoreCompat\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,238:1\n144#2:239\n13#2,2:240\n145#2,5:242\n21#2:247\n13#2,10:248\n30#2:258\n13#2,2:259\n31#2,2:261\n105#2:263\n13#2,2:264\n106#2,15:266\n13#2:281\n121#2,17:282\n30#2:299\n13#2,2:300\n31#2,2:302\n105#2:304\n13#2,2:305\n106#2,15:307\n13#2:322\n121#2,17:323\n30#2:340\n13#2,2:341\n31#2,2:343\n105#2:345\n13#2,2:346\n106#2,15:348\n13#2:363\n121#2,17:364\n30#2:381\n13#2,2:382\n31#2,2:384\n105#2:386\n13#2,2:387\n106#2,15:389\n13#2:404\n121#2,17:405\n30#2:422\n13#2,2:423\n31#2,2:425\n105#2:427\n13#2,2:428\n106#2,15:430\n13#2:445\n121#2,17:446\n30#2:463\n13#2,2:464\n31#2,2:466\n105#2:468\n13#2,2:469\n106#2,15:471\n13#2:486\n121#2,17:487\n30#2:505\n13#2,2:506\n31#2,2:508\n39#2:510\n13#2,2:511\n40#2,4:513\n13#2:517\n44#2,12:518\n66#2:531\n13#2,2:532\n68#2,8:534\n13#2:542\n76#2,16:543\n30#2:559\n13#2,2:560\n31#2,2:562\n105#2:564\n13#2,2:565\n106#2,15:567\n13#2:582\n121#2,17:583\n53#3:504\n53#3:530\n*S KotlinDebug\n*F\n+ 1 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n21#1:239\n21#1:240,2\n21#1:242,5\n30#1:247\n30#1:248,10\n43#1:258\n43#1:259,2\n43#1:261,2\n58#1:263\n58#1:264,2\n58#1:266,15\n58#1:281\n58#1:282,17\n69#1:299\n69#1:300,2\n69#1:302,2\n81#1:304\n81#1:305,2\n81#1:307,15\n81#1:322\n81#1:323,17\n92#1:340\n92#1:341,2\n92#1:343,2\n104#1:345\n104#1:346,2\n104#1:348,15\n104#1:363\n104#1:364,17\n112#1:381\n112#1:382,2\n112#1:384,2\n121#1:386\n121#1:387,2\n121#1:389,15\n121#1:404\n121#1:405,17\n130#1:422\n130#1:423,2\n130#1:425,2\n140#1:427\n140#1:428,2\n140#1:430,15\n140#1:445\n140#1:446,17\n148#1:463\n148#1:464,2\n148#1:466,2\n157#1:468\n157#1:469,2\n157#1:471,15\n157#1:486\n157#1:487,17\n166#1:505\n166#1:506,2\n166#1:508,2\n183#1:510\n183#1:511,2\n183#1:513,4\n183#1:517\n183#1:518,12\n199#1:531\n199#1:532,2\n199#1:534,8\n199#1:542\n199#1:543,16\n208#1:559\n208#1:560,2\n208#1:562,2\n218#1:564\n218#1:565,2\n218#1:567,15\n218#1:582\n218#1:583,17\n166#1:504\n191#1:530\n*E\n"})
public final class C46392a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46392a f104043a = new C46392a();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m102319a(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        C46397f.m102361a(category);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String[] m102321c(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return C46397f.m102363c(category);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final <T> boolean m102320b(@NotNull StorageId<T> sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        return C46397f.m102362b(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey());
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m102322d(@NotNull StorageId<Boolean> sid, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (!sid.getSupportLegacy() || C46397f.m102362b(strM102383e, sid.getKey())) {
            String strM102380b = sid.getKey();
            return C46397f.m102364d(strM102383e, strM102380b, defaultValue);
        }
        if (sid.getStorageType() == StorageType.Shared) {
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                boolean zM102364d = C46397f.m102364d("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102371l(strM102383e, sid.getKey(), zM102364d);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return zM102364d;
            }
            return defaultValue;
        }
        if (Intrinsics.areEqual(c46395d.m102342b(), "global")) {
            if (C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                boolean zM102364d2 = C46397f.m102364d(sid.getCategory(), sid.getKey(), defaultValue);
                C46397f.m102371l(strM102383e, sid.getKey(), zM102364d2);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return zM102364d2;
            }
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                boolean zM102364d3 = C46397f.m102364d("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102371l(strM102383e, sid.getKey(), zM102364d3);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return zM102364d3;
            }
            return defaultValue;
        }
        return defaultValue;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m102323e(@NotNull StorageId<Integer> sid, int defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (!sid.getSupportLegacy() || C46397f.m102362b(strM102383e, sid.getKey())) {
            String strM102380b = sid.getKey();
            return C46397f.m102365e(strM102383e, strM102380b, defaultValue);
        }
        if (sid.getStorageType() == StorageType.Shared) {
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                int iM102365e = C46397f.m102365e("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102372m(strM102383e, sid.getKey(), iM102365e);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return iM102365e;
            }
            return defaultValue;
        }
        if (Intrinsics.areEqual(c46395d.m102342b(), "global")) {
            if (C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                int iM102365e2 = C46397f.m102365e(sid.getCategory(), sid.getKey(), defaultValue);
                C46397f.m102372m(strM102383e, sid.getKey(), iM102365e2);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return iM102365e2;
            }
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                int iM102365e3 = C46397f.m102365e("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102372m(strM102383e, sid.getKey(), iM102365e3);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return iM102365e3;
            }
            return defaultValue;
        }
        return defaultValue;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final long m102324f(@NotNull StorageId<Long> sid, long defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (!sid.getSupportLegacy() || C46397f.m102362b(strM102383e, sid.getKey())) {
            String strM102380b = sid.getKey();
            return C46397f.m102366f(strM102383e, strM102380b, defaultValue);
        }
        if (sid.getStorageType() == StorageType.Shared) {
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                long jM102366f = C46397f.m102366f("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102373n(strM102383e, sid.getKey(), jM102366f);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return jM102366f;
            }
            return defaultValue;
        }
        if (Intrinsics.areEqual(c46395d.m102342b(), "global")) {
            if (C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                long jM102366f2 = C46397f.m102366f(sid.getCategory(), sid.getKey(), defaultValue);
                C46397f.m102373n(strM102383e, sid.getKey(), jM102366f2);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return jM102366f2;
            }
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                long jM102366f3 = C46397f.m102366f("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102373n(strM102383e, sid.getKey(), jM102366f3);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return jM102366f3;
            }
            return defaultValue;
        }
        return defaultValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T extends Parcelable> List<T> m102325g(@NotNull StorageId<List<T>> sid, @NotNull List<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        List<T> jsonList = null;
        if (sid.getSupportLegacy() && !C46397f.m102362b(strM102383e, sid.getKey())) {
            if (sid.getStorageType() != StorageType.Shared && Intrinsics.areEqual(c46395d.m102342b(), "global") && C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                WrapperList wrapperList = (WrapperList) C46397f.m102367h(sid.getCategory(), sid.getKey(), WrapperList.class, null);
                if (wrapperList != null) {
                    jsonList = wrapperList.getJsonList();
                }
                if (jsonList != null) {
                    C46397f.m102374o(strM102383e, sid.getKey(), wrapperList);
                    C46397f.m102377r(sid.getCategory(), sid.getKey());
                    return jsonList;
                }
            }
        } else {
            WrapperList wrapperList2 = (WrapperList) C46397f.m102367h(strM102383e, sid.getKey(), WrapperList.class, null);
            if (wrapperList2 != null) {
                List<T> jsonList2 = wrapperList2.getJsonList();
                Intrinsics.checkNotNull(jsonList2, "null cannot be cast to non-null type kotlin.collections.List<T of com.kubi.utils.storage.KVStoreCompat.getObjListReal>");
                return jsonList2;
            }
        }
        return defaultValue;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m102326h(@NotNull StorageId<String> sid, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (!sid.getSupportLegacy() || C46397f.m102362b(strM102383e, sid.getKey())) {
            String strM102380b = sid.getKey();
            return C46397f.m102368i(strM102383e, strM102380b, defaultValue);
        }
        if (sid.getStorageType() == StorageType.Shared) {
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                String strM102368i = C46397f.m102368i("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102375p(strM102383e, sid.getKey(), strM102368i);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return strM102368i;
            }
            return defaultValue;
        }
        if (Intrinsics.areEqual(c46395d.m102342b(), "global")) {
            if (C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                String strM102368i2 = C46397f.m102368i(sid.getCategory(), sid.getKey(), defaultValue);
                C46397f.m102375p(strM102383e, sid.getKey(), strM102368i2);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return strM102368i2;
            }
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                String strM102368i3 = C46397f.m102368i("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102375p(strM102383e, sid.getKey(), strM102368i3);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return strM102368i3;
            }
            return defaultValue;
        }
        return defaultValue;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Set<String> m102327i(@NotNull StorageId<Set<String>> sid, @NotNull Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (!sid.getSupportLegacy() || C46397f.m102362b(strM102383e, sid.getKey())) {
            String strM102380b = sid.getKey();
            return C46397f.m102369j(strM102383e, strM102380b, defaultValue);
        }
        if (sid.getStorageType() == StorageType.Shared) {
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                Set<String> setM102369j = C46397f.m102369j("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102376q(strM102383e, sid.getKey(), setM102369j);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return setM102369j;
            }
            return defaultValue;
        }
        if (Intrinsics.areEqual(c46395d.m102342b(), "global")) {
            if (C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                Set<String> setM102369j2 = C46397f.m102369j(sid.getCategory(), sid.getKey(), defaultValue);
                C46397f.m102376q(strM102383e, sid.getKey(), setM102369j2);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return setM102369j2;
            }
            if (C46397f.m102362b("mmkv.default", sid.getKey())) {
                Set<String> setM102369j3 = C46397f.m102369j("mmkv.default", sid.getKey(), defaultValue);
                C46397f.m102376q(strM102383e, sid.getKey(), setM102369j3);
                C46397f.m102377r("mmkv.default", sid.getKey());
                return setM102369j3;
            }
            return defaultValue;
        }
        return defaultValue;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final C46392a m102328k(@NotNull StorageId<Boolean> sid, boolean value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102371l(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C46392a m102329l(@NotNull StorageId<Integer> sid, int value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102372m(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C46392a m102330m(@NotNull StorageId<Long> sid, long value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102373n(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final <T extends Parcelable> C46392a m102331n(@NotNull StorageId<T> sid, @NotNull Parcelable value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        StorageId c46398g = new StorageId(sid.getCategory(), sid.getKey(), sid.getStorageType(), sid.getSupportLegacy());
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102374o(c46398g.m102383e(c46395d.m102342b(), c46395d.m102343e()), c46398g.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final <T extends Parcelable> C46392a m102332o(@NotNull StorageId<List<T>> sid, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(list, "list");
        return m102331n(new StorageId(sid.getCategory(), sid.getKey(), sid.getStorageType(), sid.getSupportLegacy()), new WrapperList(list));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C46392a m102333p(@NotNull StorageId<String> sid, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102375p(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C46392a m102334q(@NotNull StorageId<Set<String>> sid, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102376q(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey(), value);
        return f104043a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final <T> C46392a m102335r(@NotNull StorageId<T> sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        C46397f.m102377r(sid.m102383e(c46395d.m102342b(), c46395d.m102343e()), sid.getKey());
        if (sid.getSupportLegacy()) {
            DataMapUtil.f54245a.m66381p(sid.getKey());
        }
        return f104043a;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final <T extends Parcelable> T m102336j(@NotNull StorageId<T> sid, @NotNull Class<T> clazz, @Nullable T defaultValue) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        C46393b c46393b = C46393b.f104044a;
        C46395d c46395d = C46395d.f104046a;
        String strM102383e = sid.m102383e(c46395d.m102342b(), c46395d.m102343e());
        if (sid.getSupportLegacy() && !C46397f.m102362b(strM102383e, sid.getKey())) {
            if (sid.getStorageType() != StorageType.Shared && Intrinsics.areEqual(c46395d.m102342b(), "global") && C46397f.m102362b(sid.getCategory(), sid.getKey())) {
                T t11 = (T) C46397f.m102367h(sid.getCategory(), sid.getKey(), clazz, defaultValue);
                String strM102380b = sid.getKey();
                Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type android.os.Parcelable");
                C46397f.m102374o(strM102383e, strM102380b, t11);
                C46397f.m102377r(sid.getCategory(), sid.getKey());
                return t11;
            }
            return defaultValue;
        }
        return (T) C46397f.m102367h(strM102383e, sid.getKey(), clazz, defaultValue);
    }
}
