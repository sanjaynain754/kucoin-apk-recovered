package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.internal.FeatureManager;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p299h3.C38101k;
import p299h3.InAppPurchase;
import p357j3.C40259h;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.appevents.iap.e */
/* JADX INFO: compiled from: InAppPurchaseManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u0018\u001a\u0004\u0018\u00010\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$RB\u0010(\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'RB\u0010)\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.¨\u00060"}, m90084d2 = {"Lcom/facebook/appevents/iap/e;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, CmcdData.Factory.STREAMING_FORMAT_HLS, "", "version", "g", "(Ljava/lang/String;)V", "e", "()Ljava/lang/String;", "", "Lh3/a;", "purchases", "", "time", "", "isImplicitlyLogged", "Lkotlin/Pair;", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "purchaseParameters", "f", "(Ljava/util/List;JZLjava/util/List;)Landroid/os/Bundle;", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "withTestDedupeKeys", "c", "(Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;ZZ)Ljava/lang/String;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "b", "()Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "timesOfManualPurchases", "timesOfImplicitPurchases", "d", "Ljava/lang/String;", "specificBillingLibraryVersion", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5537e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String specificBillingLibraryVersion;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5537e f7943a = new C5537e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.appevents.iap.e$a */
    /* JADX INFO: compiled from: InAppPurchaseManager.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m8216a() {
        if (C42757a.m93689d(C5537e.class)) {
            return;
        }
        try {
            if (!C40259h.m88615g()) {
                C5536d.m8212i();
            } else {
                enabled.set(true);
                m8221h();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5537e.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m8217d(C5537e c5537e, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z11, boolean z12, int i11, Object obj) {
        if (C42757a.m93689d(C5537e.class)) {
            return null;
        }
        try {
            return c5537e.m8223c(bundle, operationalData, bundle2, operationalData2, z11, (i11 & 32) != 0 ? false : z12);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5537e.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m8218e() {
        if (C42757a.m93689d(C5537e.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5537e.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final synchronized Bundle m8219f(@NotNull List<InAppPurchase> purchases, long time, boolean isImplicitlyLogged, @NotNull List<Pair<Bundle, OperationalData>> purchaseParameters) {
        Bundle bundle;
        ?? r11;
        ?? ValueOf;
        ?? r12;
        boolean z11;
        List<InAppPurchase> purchases2 = purchases;
        List<Pair<Bundle, OperationalData>> purchaseParameters2 = purchaseParameters;
        synchronized (C5537e.class) {
            Bundle bundle2 = null;
            if (C42757a.m93689d(C5537e.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases2, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters2, "purchaseParameters");
                if (purchaseParameters2.isEmpty()) {
                    return null;
                }
                if (purchases2.size() != purchaseParameters2.size()) {
                    return null;
                }
                ArrayList<Pair> arrayList = new ArrayList();
                int size = purchases2.size();
                ?? bundle3 = 0;
                int i11 = 0;
                while (i11 < size) {
                    InAppPurchase inAppPurchase = purchases2.get(i11);
                    Pair<Bundle, OperationalData> pair = purchaseParameters2.get(i11);
                    Bundle bundleComponent1 = pair.component1();
                    OperationalData operationalDataComponent2 = pair.component2();
                    bundle = bundle2;
                    try {
                        int i12 = i11;
                        InAppPurchase inAppPurchase2 = new InAppPurchase(inAppPurchase.getEventName(), new BigDecimal(String.valueOf(inAppPurchase.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase.getCurrency());
                        List<Pair<Long, Pair<Bundle, OperationalData>>> list = isImplicitlyLogged ? timesOfManualPurchases.get(inAppPurchase2) : timesOfImplicitPurchases.get(inAppPurchase2);
                        if (list == null || list.isEmpty()) {
                            r11 = bundle;
                            ValueOf = r11;
                            r12 = ValueOf;
                            z11 = false;
                        } else {
                            r11 = bundle;
                            ValueOf = r11;
                            r12 = ValueOf;
                            z11 = false;
                            for (Pair<Long, Pair<Bundle, OperationalData>> pair2 : list) {
                                long jLongValue = pair2.getFirst().longValue();
                                Pair<Bundle, OperationalData> second = pair2.getSecond();
                                Bundle bundleComponent2 = second.component1();
                                OperationalData operationalDataComponent3 = second.component2();
                                if (Math.abs(time - jLongValue) <= C38101k.f85761a.m86008e() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    C5537e c5537e = f7943a;
                                    String strM8217d = m8217d(c5537e, bundleComponent1, operationalDataComponent2, bundleComponent2, operationalDataComponent3, !isImplicitlyLogged, false, 32, null);
                                    String strM8223c = c5537e.m8223c(bundleComponent1, operationalDataComponent2, bundleComponent2, operationalDataComponent3, !isImplicitlyLogged, true);
                                    r11 = r11;
                                    if (strM8223c != null) {
                                        r11 = strM8223c;
                                    }
                                    if (strM8217d != null) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new Pair(inAppPurchase2, Long.valueOf(jLongValue)));
                                        z11 = true;
                                    }
                                    r12 = strM8217d;
                                }
                            }
                        }
                        if (r11 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r11);
                        }
                        if (z11) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / ((long) 1000) : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", r12);
                        }
                        if (isImplicitlyLogged && !z11) {
                            ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap = timesOfImplicitPurchases;
                            if (concurrentHashMap.get(inAppPurchase2) == null) {
                                concurrentHashMap.put(inAppPurchase2, new ArrayList());
                            }
                            List<Pair<Long, Pair<Bundle, OperationalData>>> list2 = concurrentHashMap.get(inAppPurchase2);
                            if (list2 != null) {
                                list2.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, operationalDataComponent2)));
                            }
                        } else if (!isImplicitlyLogged && !z11) {
                            ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap2 = timesOfManualPurchases;
                            if (concurrentHashMap2.get(inAppPurchase2) == null) {
                                concurrentHashMap2.put(inAppPurchase2, new ArrayList());
                            }
                            List<Pair<Long, Pair<Bundle, OperationalData>>> list3 = concurrentHashMap2.get(inAppPurchase2);
                            if (list3 != null) {
                                list3.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, operationalDataComponent2)));
                            }
                        }
                        i11 = i12 + 1;
                        purchases2 = purchases;
                        purchaseParameters2 = purchaseParameters;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                for (Pair pair3 : arrayList) {
                    List<Pair<Long, Pair<Bundle, OperationalData>>> list4 = isImplicitlyLogged ? timesOfManualPurchases.get(pair3.getFirst()) : timesOfImplicitPurchases.get(pair3.getFirst());
                    if (list4 != null) {
                        Iterator<Pair<Long, Pair<Bundle, OperationalData>>> it = list4.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            int i14 = i13 + 1;
                            if (it.next().getFirst().longValue() == ((Number) pair3.getSecond()).longValue()) {
                                list4.remove(i13);
                                break;
                            }
                            i13 = i14;
                        }
                        if (isImplicitlyLogged) {
                            if (list4.isEmpty()) {
                                timesOfManualPurchases.remove(pair3.getFirst());
                            } else {
                                timesOfManualPurchases.put((InAppPurchase) pair3.getFirst(), list4);
                            }
                        } else if (list4.isEmpty()) {
                            timesOfImplicitPurchases.remove(pair3.getFirst());
                        } else {
                            timesOfImplicitPurchases.put((InAppPurchase) pair3.getFirst(), list4);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            C42757a.m93687b(th, C5537e.class);
            return bundle;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m8220g(String version) {
        if (C42757a.m93689d(C5537e.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5537e.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m8221h() {
        if (C42757a.m93689d(C5537e.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersionM8222b = f7943a.m8222b();
                int i11 = a.$EnumSwitchMapping$0[billingClientVersionM8222b.ordinal()];
                if (i11 == 2) {
                    C5533a.m8191g(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i11 != 3) {
                    if (i11 == 4 && FeatureManager.m9939g(FeatureManager.Feature.IapLoggingLib5To7)) {
                        C5534b.m8202e(C5501a.m7799m(), billingClientVersionM8222b);
                        return;
                    }
                    return;
                }
                if (FeatureManager.m9939g(FeatureManager.Feature.IapLoggingLib2)) {
                    C5534b.m8202e(C5501a.m7799m(), billingClientVersionM8222b);
                } else {
                    C5533a.m8191g(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5537e.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InAppPurchaseUtils.BillingClientVersion m8222b() {
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                Context contextM7799m = C5501a.m7799m();
                ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{C33978va.f72339h}, false, 3, 2, (Object) null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                m8220g("GPBL." + string);
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                if (intOrNull != null) {
                    int iIntValue = intOrNull.intValue();
                    if (iIntValue == 1) {
                        return InAppPurchaseUtils.BillingClientVersion.V1;
                    }
                    if (iIntValue < 5) {
                        return InAppPurchaseUtils.BillingClientVersion.V2_V4;
                    }
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m8223c(@Nullable Bundle newPurchaseParameters, @Nullable OperationalData newPurchaseOperationalData, @Nullable Bundle oldPurchaseParameters, @Nullable OperationalData oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        List<Pair<String, List<String>>> listM86007d;
        String str;
        String str2;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (withTestDedupeKeys) {
                listM86007d = C38101k.f85761a.m86009f(dedupingWithImplicitlyLoggedHistory);
            } else {
                listM86007d = C38101k.f85761a.m86007d(dedupingWithImplicitlyLoggedHistory);
            }
            if (listM86007d == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : listM86007d) {
                Object parameter = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, pair.getFirst(), newPurchaseParameters, newPurchaseOperationalData);
                if (parameter instanceof String) {
                    str = (String) parameter;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    for (String str3 : pair.getSecond()) {
                        Object parameter2 = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, str3, oldPurchaseParameters, oldPurchaseOperationalData);
                        if (parameter2 instanceof String) {
                            str2 = (String) parameter2;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && str2.length() != 0 && Intrinsics.areEqual(str2, str)) {
                            if (dedupingWithImplicitlyLoggedHistory) {
                                return pair.getFirst();
                            }
                            return str3;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
