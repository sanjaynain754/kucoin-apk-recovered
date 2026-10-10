package p299h3;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: compiled from: InAppPurchaseDedupeConfig.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R,\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!¨\u0006'"}, m90084d2 = {"Lh3/k;", "", "<init>", "()V", "", "dedupingWithImplicitlyLoggedHistory", "", "Lkotlin/Pair;", "", "d", "(Z)Ljava/util/List;", "f", "c", "()Ljava/util/List;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/os/Bundle;", "parameters", "Ljava/util/Currency;", "b", "(Landroid/os/Bundle;)Ljava/util/Currency;", "", "valueToSum", "g", "(Ljava/lang/Double;Landroid/os/Bundle;)Ljava/lang/Double;", "", "e", "()J", "dedupeParameters", "originalParameters", "Lcom/facebook/appevents/OperationalData;", "originalOperationalData", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)Lkotlin/Pair;", "Ljava/util/List;", "defaultCurrencyParameterEquivalents", "defaultValueParameterEquivalents", "J", "defaultDedupeWindow", "defaultDedupeParameters", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C38101k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38101k f85761a = new C38101k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> defaultCurrencyParameterEquivalents = CollectionsKt.listOf("fb_currency");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> defaultValueParameterEquivalents = CollectionsKt.listOf("_valueToSum");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final long defaultDedupeWindow = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final List<Pair<String, List<String>>> defaultDedupeParameters = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m90091to("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.m90091to("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.m90091to("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.m90091to("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Pair<Bundle, OperationalData> m86004a(@Nullable Bundle dedupeParameters, @Nullable Bundle originalParameters, @Nullable OperationalData originalOperationalData) {
        Bundle bundle;
        OperationalData operationalDataComponent2;
        if (dedupeParameters == null) {
            return new Pair<>(originalParameters, originalOperationalData);
        }
        try {
            bundle = originalParameters;
            operationalDataComponent2 = originalOperationalData;
            for (String key : dedupeParameters.keySet()) {
                try {
                    String string = dedupeParameters.getString(key);
                    if (string != null) {
                        OperationalData.Companion companion = OperationalData.INSTANCE;
                        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Pair<Bundle, OperationalData> pairAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, key, string, bundle, operationalDataComponent2);
                        Bundle bundleComponent1 = pairAddParameterAndReturn.component1();
                        operationalDataComponent2 = pairAddParameterAndReturn.component2();
                        bundle = bundleComponent1;
                    }
                } catch (Exception unused) {
                    originalParameters = bundle;
                    originalOperationalData = operationalDataComponent2;
                    bundle = originalParameters;
                    operationalDataComponent2 = originalOperationalData;
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair<>(bundle, operationalDataComponent2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Double m86010g(@Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (valueToSum != null) {
            return valueToSum;
        }
        Iterator<String> it = m86011h().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (parameters != null) {
                try {
                    return Double.valueOf(parameters.getDouble(next));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Currency m86005b(@Nullable Bundle parameters) {
        Iterator<String> it = m86006c().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            if (parameters != null) {
                try {
                    string = parameters.getString(next);
                    if (string != null && string.length() != 0) {
                        return Currency.getInstance(string);
                    }
                } catch (Exception unused) {
                    continue;
                }
            } else {
                if (string != null) {
                    return Currency.getInstance(string);
                }
                continue;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m86006c() {
        List<String> listM9948e;
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f != null) {
            listM9948e = fetchedAppSettingsM9975f.m9948e();
        } else {
            listM9948e = null;
        }
        if (listM9948e != null && !fetchedAppSettingsM9975f.m9948e().isEmpty()) {
            return fetchedAppSettingsM9975f.m9948e();
        }
        return defaultCurrencyParameterEquivalents;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Pair<String, List<String>>> m86007d(boolean dedupingWithImplicitlyLoggedHistory) {
        List<Pair<String, List<String>>> listM9955l;
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f != null) {
            listM9955l = fetchedAppSettingsM9975f.m9955l();
        } else {
            listM9955l = null;
        }
        if (listM9955l != null && !fetchedAppSettingsM9975f.m9955l().isEmpty()) {
            if (!dedupingWithImplicitlyLoggedHistory) {
                return fetchedAppSettingsM9975f.m9955l();
            }
            ArrayList arrayList = new ArrayList();
            for (Pair<String, List<String>> pair : fetchedAppSettingsM9975f.m9955l()) {
                Iterator<String> it = pair.getSecond().iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
                }
            }
            return arrayList;
        }
        return defaultDedupeParameters;
    }

    /* JADX INFO: renamed from: e */
    public final long m86008e() {
        Long dedupeWindow;
        Long dedupeWindow2;
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f != null) {
            dedupeWindow = fetchedAppSettingsM9975f.getDedupeWindow();
        } else {
            dedupeWindow = null;
        }
        if (dedupeWindow != null && ((dedupeWindow2 = fetchedAppSettingsM9975f.getDedupeWindow()) == null || dedupeWindow2.longValue() != 0)) {
            return fetchedAppSettingsM9975f.getDedupeWindow().longValue();
        }
        return defaultDedupeWindow;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<Pair<String, List<String>>> m86009f(boolean dedupingWithImplicitlyLoggedHistory) {
        List<Pair<String, List<String>>> listM9966w;
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f == null || (listM9966w = fetchedAppSettingsM9975f.m9966w()) == null || listM9966w.isEmpty()) {
            return null;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return fetchedAppSettingsM9975f.m9966w();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : fetchedAppSettingsM9975f.m9966w()) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<String> m86011h() {
        List<String> listM9957n;
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f != null) {
            listM9957n = fetchedAppSettingsM9975f.m9957n();
        } else {
            listM9957n = null;
        }
        if (listM9957n != null && !fetchedAppSettingsM9975f.m9957n().isEmpty()) {
            return fetchedAppSettingsM9975f.m9957n();
        }
        return defaultValueParameterEquivalents;
    }
}
