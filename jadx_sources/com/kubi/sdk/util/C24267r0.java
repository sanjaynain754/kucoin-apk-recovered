package com.kubi.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.NetworkUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.reflect.TypeToken;
import com.kubi.sdk.exception.AppBaseException;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ly.C42329a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.r0 */
/* JADX INFO: compiled from: RnUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0004\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0004*\u0004\u0018\u00010\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\u001d\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f*\u00020\n2\u0006\u0010\r\u001a\u0002H\f¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f*\u00020\n2\u0006\u0010\r\u001a\u0002H\f¢\u0006\u0002\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u0011\"\b\b\u0000\u0010\f*\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u0001H\f¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u0018*\b\u0012\u0002\b\u0003\u0018\u00010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u0018*\b\u0012\u0002\b\u0003\u0018\u00010\u001b¢\u0006\u0002\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0002\u001a\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0019*\u00020!\u001a\f\u0010\"\u001a\u00020\u0004*\u00020#H\u0007\u001a\n\u0010$\u001a\u00020\u0001*\u00020%\u001a\u0016\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u0016*\u00020\u0005¨\u0006'"}, m90084d2 = {"join", "", "name", "logInfo", "", "Lcom/facebook/react/bridge/ReadableMap;", "logError", "", "toNative", "Lcom/kubi/sdk/entity/ReactPromise;", "Lcom/facebook/react/bridge/Promise;", "resolveResult", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V", "resolveResultBackup", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", "", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "map2RnMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "", "list2RnArray", "Lcom/facebook/react/bridge/WritableNativeArray;", "", "array2RnArray", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;", "putValueByType", DbParams.KEY_CHANNEL_RESULT, "it", "toStringList", "Lorg/json/JSONArray;", "releaseMemory", "Lcom/facebook/react/ReactInstanceManager;", "map2RnType", "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;", "toMap", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnUtils.kt\ncom/kubi/sdk/util/RnUtilsKt\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n45#2,2:321\n149#3:323\n137#3,5:326\n149#3:337\n1#4:324\n36#5:325\n1869#6,2:331\n1869#6,2:333\n13472#7,2:335\n*S KotlinDebug\n*F\n+ 1 RnUtils.kt\ncom/kubi/sdk/util/RnUtilsKt\n*L\n53#1:321,2\n87#1:323\n110#1:326,5\n222#1:337\n110#1:325\n114#1:331,2\n170#1:333,2\n179#1:335,2\n*E\n"})
public final class C24267r0 {

    /* JADX INFO: renamed from: com.kubi.sdk.util.r0$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<Map<?, ?>> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.r0$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class c extends TypeToken<Map<String, ? extends Object>> {
    }

    /* JADX INFO: renamed from: h */
    public static final void m58524h(WritableNativeArray writableNativeArray, Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.valueOf(obj == null))) {
            writableNativeArray.pushNull();
            return;
        }
        if (obj instanceof Boolean) {
            writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableNativeArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Double) {
            writableNativeArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableNativeArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Map) {
            writableNativeArray.pushMap(m58522f((Map) obj));
            return;
        }
        if (obj instanceof Object[]) {
            writableNativeArray.pushArray(m58517a((Object[]) obj));
            return;
        }
        if (obj instanceof List) {
            writableNativeArray.pushArray(m58518b((List) obj));
            return;
        }
        if (obj instanceof Float) {
            writableNativeArray.pushDouble(((Number) obj).floatValue());
        } else {
            if (obj instanceof Long) {
                writableNativeArray.pushDouble(((Number) obj).longValue());
                return;
            }
            try {
                writableNativeArray.pushMap(m58522f((Map) C27099x.m66914d(C27099x.m66919i(obj, false, 2, null), new c().getType())));
            } catch (Exception unused) {
                writableNativeArray.pushString(String.valueOf(obj));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final <T> WritableMap m58528l(@Nullable T t11) {
        return m58522f(MapsKt.mapOf(TuplesKt.m90091to("code", 0), TuplesKt.m90091to("data", t11)));
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.r0$a */
    /* JADX INFO: compiled from: RnUtils.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final WritableNativeArray m58517a(@Nullable Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (objArr != null) {
            for (Object obj : objArr) {
                m58524h(writableNativeArray, obj);
            }
        }
        return writableNativeArray;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final WritableNativeArray m58518b(@Nullable List<?> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m58524h(writableNativeArray, it.next());
            }
        }
        return writableNativeArray;
    }

    /* JADX INFO: renamed from: c */
    public static final void m58519c(@Nullable Throwable th2) {
        if (th2 == null) {
            return;
        }
        C44128b.m97262f("KTurbo", th2.getMessage(), th2);
        C43846g.m96568c(new AppBaseException(th2, "RnUtils", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m58520d(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        C44128b.m97266j("KTurbo", C27029c.m66606i(readableMap.toHashMap()));
    }

    /* JADX INFO: renamed from: e */
    public static final void m58521e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C44128b.m97266j("KTurbo", str);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final WritableNativeMap m58522f(@Nullable Map<?, ?> map) {
        Object objM103844constructorimpl;
        Object objM66914d;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    objM66914d = C27099x.m66914d(C27099x.m66918h(map, true), new b().getType());
                } catch (Throwable th2) {
                    C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                    objM66914d = null;
                }
                Map map2 = (Map) objM66914d;
                if (map2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                for (Object obj : map2.keySet()) {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        Object obj2 = map2.get(obj);
                        if (obj2 == null) {
                            writableNativeMap.putNull(String.valueOf(obj));
                        } else if (obj2 instanceof Boolean) {
                            writableNativeMap.putBoolean(String.valueOf(obj), ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            writableNativeMap.putString(String.valueOf(obj), (String) obj2);
                        } else if (obj2 instanceof Double) {
                            writableNativeMap.putDouble(String.valueOf(obj), ((Number) obj2).doubleValue());
                        } else if (obj2 instanceof Integer) {
                            writableNativeMap.putInt(String.valueOf(obj), ((Number) obj2).intValue());
                        } else if (obj2 instanceof Map) {
                            writableNativeMap.putMap(String.valueOf(obj), m58522f((Map) obj2));
                        } else if (obj2 instanceof List) {
                            writableNativeMap.putArray(String.valueOf(obj), m58518b((List) obj2));
                        } else if (obj2 instanceof Object[]) {
                            writableNativeMap.putArray(String.valueOf(obj), m58517a((Object[]) obj2));
                        } else if (obj2 instanceof Long) {
                            writableNativeMap.putDouble(String.valueOf(obj), ((Number) obj2).longValue());
                        } else if (obj2 instanceof Float) {
                            writableNativeMap.putDouble(String.valueOf(obj), ((Number) obj2).floatValue());
                        } else {
                            writableNativeMap.putString(String.valueOf(obj), map.toString());
                        }
                        Result.m103844constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m103844constructorimpl(ResultKt.createFailure(th3));
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                    writableNativeMap.putString(DbParams.KEY_CHANNEL_RESULT, map.toString());
                }
            } catch (Throwable th4) {
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
            }
        }
        return writableNativeMap;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m58523g(@NotNull NetworkUtils.NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "<this>");
        if (networkType == NetworkUtils.NetworkType.NETWORK_NO || networkType == NetworkUtils.NetworkType.NETWORK_UNKNOWN) {
            return "NONE";
        }
        return networkType == NetworkUtils.NetworkType.NETWORK_WIFI ? "WIFI" : "CELLULAR";
    }

    /* JADX INFO: renamed from: i */
    public static final <T> void m58525i(@NotNull Promise promise, T t11) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        promise.resolve(m58522f(MapsKt.mapOf(TuplesKt.m90091to("code", 0), TuplesKt.m90091to("data", t11))));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Map<String, Object> m58526j(@NotNull ReadableMap readableMap) {
        Object arrayList;
        Object objValueOf;
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (a.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    linkedHashMap.put(strNextKey, "null");
                    break;
                case 2:
                    linkedHashMap.put(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
                    break;
                case 3:
                    double d11 = readableMap.getDouble(strNextKey);
                    long j11 = (long) d11;
                    int i11 = (int) d11;
                    if (d11 == i11) {
                        objValueOf = Integer.valueOf(i11);
                    } else {
                        objValueOf = d11 == ((double) j11) ? Long.valueOf(j11) : Double.valueOf(d11);
                    }
                    linkedHashMap.put(strNextKey, objValueOf);
                    break;
                case 4:
                    String string = readableMap.getString(strNextKey);
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap.put(strNextKey, string);
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    arrayList = map != null ? m58526j(map) : null;
                    if (arrayList == null) {
                        arrayList = MapsKt.emptyMap();
                    }
                    linkedHashMap.put(strNextKey, arrayList);
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(strNextKey);
                    arrayList = array != null ? array.toArrayList() : null;
                    if (arrayList == null) {
                        arrayList = CollectionsKt.emptyList();
                    }
                    linkedHashMap.put(strNextKey, arrayList);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final C42329a m58527k(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        return new C42329a(promise);
    }
}
