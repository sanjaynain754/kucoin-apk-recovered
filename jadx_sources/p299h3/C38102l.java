package p299h3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: h3.l */
/* JADX INFO: compiled from: InAppPurchaseEventManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJM\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J1\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J3\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00182\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J9\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010(J7\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b+\u0010,J%\u00101\u001a\u0004\u0018\u0001002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J%\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u00010-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b4\u00105JC\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u00012\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0002¢\u0006\u0004\b9\u0010:R0\u0010>\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002000;j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000200`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R8\u0010?\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0;j\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030-`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010=R\u001c\u0010B\u001a\n @*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010AR\u001c\u0010E\u001a\n @*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010DR\u001c\u0010F\u001a\n @*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010D¨\u0006G"}, m90084d2 = {"Lh3/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Landroid/os/IBinder;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", "k", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/Object;Z)Ljava/util/Map;", "i", "(Landroid/content/Context;Ljava/lang/Object;)Ljava/util/ArrayList;", "j", "g", "", "b", "skuDetail", "m", "(Ljava/lang/String;)Z", CmcdData.Factory.STREAM_TYPE_LIVE, "", "p", "(Ljava/util/ArrayList;)Ljava/util/Map;", "skuDetailsMap", "q", "(Ljava/util/Map;)V", "type", "o", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/ArrayList;", "f", "purchases", "c", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "e", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", "className", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Class;", "obj", "", "args", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodMap", "classMap", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "PACKAGE_NAME", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "purchaseInappSharedPrefs", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C38102l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38102l f85766a = new C38102l();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Method> methodMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Class<?>> classMap = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final String PACKAGE_NAME = C5501a.m7799m().getPackageName();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final SharedPreferences skuDetailSharedPrefs = C5501a.m7799m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final SharedPreferences purchaseInappSharedPrefs = C5501a.m7799m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m86012a(@NotNull Context context, @Nullable IBinder service) {
        if (C42757a.m93689d(C38102l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f85766a.m86025n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m86013b() {
        if (C42757a.m93689d(C38102l.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j11 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j11 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j11 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final ArrayList<String> m86014g(@NotNull Context context, @Nullable Object inAppBillingObj) {
        C38102l c38102l;
        Class<?> clsM86019d;
        if (C42757a.m93689d(C38102l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && (clsM86019d = (c38102l = f85766a).m86019d(context, "com.android.vending.billing.IInAppBillingService")) != null && c38102l.m86020e(clsM86019d, "getPurchaseHistory") != null) {
                return c38102l.m86018c(c38102l.m86021f(context, inAppBillingObj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final ArrayList<String> m86015i(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (C42757a.m93689d(C38102l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            C38102l c38102l = f85766a;
            return c38102l.m86018c(c38102l.m86022h(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ArrayList<String> m86016j(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (C42757a.m93689d(C38102l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            C38102l c38102l = f85766a;
            return c38102l.m86018c(c38102l.m86022h(context, inAppBillingObj, "subs"));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Map<String, String> m86017k(@NotNull Context context, @NotNull ArrayList<String> skuList, @Nullable Object inAppBillingObj, boolean isSubscription) {
        if (C42757a.m93689d(C38102l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map<String, String> mapM86027p = f85766a.m86027p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapM86027p.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapM86027p.putAll(f85766a.m86023l(context, arrayList, inAppBillingObj, isSubscription));
            return mapM86027p;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38102l.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> m86018c(ArrayList<String> purchases) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j11 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j11 / 1000) <= 86400 && !Intrinsics.areEqual(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Class<?> m86019d(Context context, String className) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> cls = map.get(className);
            if (cls != null) {
                return cls;
            }
            Class<?> clsM8181b = InAppPurchaseUtils.m8181b(context, className);
            if (clsM8181b != null) {
                map.put(className, clsM8181b);
                return clsM8181b;
            }
            return clsM8181b;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX INFO: renamed from: e */
    public final Method m86020e(Class<?> classObj, String methodName) {
        Class[] clsArr;
        Method methodM8182c;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method method = map.get(methodName);
            if (method != null) {
                return method;
            }
            Class TYPE = Integer.TYPE;
            switch (methodName) {
                case "getPurchases":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                methodM8182c = InAppPurchaseUtils.m8182c(classObj, methodName, null);
            } else {
                methodM8182c = InAppPurchaseUtils.m8182c(classObj, methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodM8182c != null) {
                map.put(methodName, methodM8182c);
            }
            return methodM8182c;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX INFO: renamed from: f */
    public final ArrayList<String> m86021f(Context context, Object inAppBillingObj, String type) {
        ArrayList<String> stringArrayList;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m86026o(context, inAppBillingObj, type)) {
                int i11 = 0;
                String string = null;
                boolean z11 = false;
                do {
                    Object objM86025n = m86025n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", inAppBillingObj, new Object[]{6, PACKAGE_NAME, type, string, new Bundle()});
                    if (objM86025n != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objM86025n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                        z11 = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i11++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    if (i11 >= 30 || string == null) {
                        break;
                    }
                } while (!z11);
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX INFO: renamed from: h */
    public final ArrayList<String> m86022h(Context context, Object inAppBillingObj, String type) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && m86026o(context, inAppBillingObj, type)) {
                int size = 0;
                String string = null;
                while (true) {
                    Context context2 = context;
                    Object obj = inAppBillingObj;
                    try {
                        Object objM86025n = m86025n(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, PACKAGE_NAME, type, string});
                        if (objM86025n != null) {
                            Bundle bundle = (Bundle) objM86025n;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                size += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            } else {
                                string = null;
                            }
                            if (size >= 30 || string == null) {
                                break;
                            }
                            context = context2;
                            inAppBillingObj = obj;
                        } else {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C42757a.m93687b(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: l */
    public final Map<String, String> m86023l(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        String str;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", skuList);
                String str2 = PACKAGE_NAME;
                if (isSubscription) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                try {
                    Object objM86025n = m86025n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", inAppBillingObj, new Object[]{3, str2, str, bundle});
                    if (objM86025n != null) {
                        Bundle bundle2 = (Bundle) objM86025n;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && skuList.size() == stringArrayList.size()) {
                                int size = skuList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    String str3 = skuList.get(i11);
                                    Intrinsics.checkNotNullExpressionValue(str3, "skuList[i]");
                                    String str4 = stringArrayList.get(i11);
                                    Intrinsics.checkNotNullExpressionValue(str4, "skuDetailsList[i]");
                                    linkedHashMap.put(str3, str4);
                                }
                            }
                            m86028q(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C42757a.m93687b(th, this);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            C42757a.m93687b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m86024m(@NotNull String skuDetail) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (strOptString == null || strOptString.length() <= 0) {
                    return false;
                }
                return true;
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Object m86025n(Context context, String className, String methodName, Object obj, Object[] args) {
        Method methodM86020e;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Class<?> clsM86019d = m86019d(context, className);
            if (clsM86019d == null || (methodM86020e = m86020e(clsM86019d, methodName)) == null) {
                return null;
            }
            return InAppPurchaseUtils.m8184e(clsM86019d, methodM86020e, obj, Arrays.copyOf(args, args.length));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m86026o(Context context, Object inAppBillingObj, String type) {
        if (C42757a.m93689d(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            try {
                Object objM86025n = m86025n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
                if (objM86025n == null || ((Integer) objM86025n).intValue() != 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                C42757a.m93687b(th, this);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, String> m86027p(ArrayList<String> skuList) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String sku : skuList) {
                String string = skuDetailSharedPrefs.getString(sku, null);
                if (string != null) {
                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, listSplit$default.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m86028q(Map<String, String> skuDetailsMap) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : skuDetailsMap.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
