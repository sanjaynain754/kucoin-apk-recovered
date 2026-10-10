package p357j3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.C5537e;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.C5758a;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p299h3.C38101k;
import p299h3.C38102l;
import p299h3.InAppPurchase;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: j3.h */
/* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010!J7\u0010)\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,JE\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060-2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b/\u00100R\u001c\u00103\u001a\n 1*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105¨\u00067"}, m90084d2 = {"Lj3/h;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "activityName", "", "timeSpentInSeconds", "i", "(Ljava/lang/String;J)V", FirebaseAnalytics.Event.PURCHASE, "skuDetails", "", "isSubscription", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", "j", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "", "Lj3/h$a;", "purchaseLoggingParametersList", "Landroid/os/Bundle;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)Landroid/os/Bundle;", "eventName", "f", "(Ljava/util/List;Ljava/lang/String;)Landroid/os/Bundle;", "g", "()Z", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "type", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/appevents/OperationalData;", "operationalData", "Lorg/json/JSONObject;", "purchaseJSON", "skuDetailsJSON", "d", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lj3/h$a;", "e", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Lorg/json/JSONObject;)Ljava/util/List;", "", "extraParameter", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/facebook/appevents/InternalAppEventsLogger;", "Lcom/facebook/appevents/InternalAppEventsLogger;", "internalAppEventsLogger", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAutomaticAnalyticsLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomaticAnalyticsLogger.kt\ncom/facebook/appevents/internal/AutomaticAnalyticsLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,518:1\n1549#2:519\n1620#2,3:520\n215#3,2:523\n*S KotlinDebug\n*F\n+ 1 AutomaticAnalyticsLogger.kt\ncom/facebook/appevents/internal/AutomaticAnalyticsLogger\n*L\n198#1:519\n198#1:520,3\n466#1:523,2\n*E\n"})
public final class C40259h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40259h f89481a = new C40259h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C40259h.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(C5501a.m7799m());

    /* JADX INFO: renamed from: j3.h$a */
    /* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lj3/h$a;", "", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Landroid/os/Bundle;", "param", "Lcom/facebook/appevents/OperationalData;", "operationalData", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "b", "Ljava/util/Currency;", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "c", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "Lcom/facebook/appevents/OperationalData;", "()Lcom/facebook/appevents/OperationalData;", "setOperationalData", "(Lcom/facebook/appevents/OperationalData;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public BigDecimal purchaseAmount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Currency currency;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Bundle param;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public OperationalData operationalData;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final OperationalData getOperationalData() {
            return this.operationalData;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bundle getParam() {
            return this.param;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public a(@NotNull BigDecimal purchaseAmount, @NotNull Currency currency, @NotNull Bundle param, @NotNull OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            this.purchaseAmount = purchaseAmount;
            this.currency = currency;
            this.param = param;
            this.operationalData = operationalData;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final synchronized Bundle m88613a(@NotNull List<a> purchaseLoggingParametersList) {
        a aVar;
        Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        aVar = purchaseLoggingParametersList.get(0);
        return C5537e.m8219f(CollectionsKt.listOf(new InAppPurchase("fb_mobile_purchase", aVar.getPurchaseAmount().doubleValue(), aVar.getCurrency())), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(aVar.getParam(), aVar.getOperationalData())));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final synchronized Bundle m88614f(@NotNull List<a> purchaseLoggingParametersList, @NotNull String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            arrayList = new ArrayList();
            for (a aVar : purchaseLoggingParametersList) {
                arrayList.add(new InAppPurchase(eventName, aVar.getPurchaseAmount().doubleValue(), aVar.getCurrency()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purchaseLoggingParametersList, 10));
            for (a aVar2 : purchaseLoggingParametersList) {
                arrayList2.add(new Pair(aVar2.getParam(), aVar2.getOperationalData()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C5537e.m8219f(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m88619k(String str, String str2, boolean z11, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z12, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        m88618j(str, str2, z11, billingClientVersion, z12);
    }

    /* JADX INFO: renamed from: b */
    public final List<a> m88620b(String purchase, String skuDetails, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return m88621c(purchase, skuDetails, new HashMap(), billingClientVersion);
    }

    /* JADX INFO: renamed from: d */
    public final a m88622d(String type, Bundle params, OperationalData operationalData, JSONObject purchaseJSON, JSONObject skuDetailsJSON) {
        Bundle bundle;
        OperationalData operationalData2;
        if (Intrinsics.areEqual(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = Boolean.toString(purchaseJSON.optBoolean("autoRenewing", false));
            Intrinsics.checkNotNullExpressionValue(string, "toString(\n              …      )\n                )");
            bundle = params;
            operationalData2 = operationalData;
            companion.addParameter(operationalDataEnum, "fb_iap_subs_auto_renewing", string, bundle, operationalData2);
            String strOptString = skuDetailsJSON.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            companion.addParameter(operationalDataEnum, "fb_iap_subs_period", strOptString, bundle, operationalData2);
            String strOptString2 = skuDetailsJSON.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            companion.addParameter(operationalDataEnum, "fb_free_trial_period", strOptString2, bundle, operationalData2);
            String introductoryPriceCycles = skuDetailsJSON.optString("introductoryPriceCycles");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                companion.addParameter(operationalDataEnum, "fb_intro_price_cycles", introductoryPriceCycles, bundle, operationalData2);
            }
            String introductoryPricePeriod = skuDetailsJSON.optString("introductoryPricePeriod");
            Intrinsics.checkNotNullExpressionValue(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                companion.addParameter(operationalDataEnum, "fb_intro_period", introductoryPricePeriod, bundle, operationalData2);
            }
            String introductoryPriceAmountMicros = skuDetailsJSON.optString("introductoryPriceAmountMicros");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                companion.addParameter(operationalDataEnum, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle, operationalData2);
            }
        } else {
            bundle = params;
            operationalData2 = operationalData;
        }
        BigDecimal bigDecimal = new BigDecimal(skuDetailsJSON.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(skuDetailsJSON.getString("price_currency_code"));
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, currency, bundle, operationalData2);
    }

    /* JADX INFO: renamed from: e */
    public final List<a> m88623e(String type, Bundle params, OperationalData operationalData, JSONObject skuDetailsJSON) throws JSONException {
        if (!Intrinsics.areEqual(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            JSONObject jSONObject = skuDetailsJSON.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return CollectionsKt.mutableListOf(new a(bigDecimal, currency, params, operationalData));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = skuDetailsJSON.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject2 = skuDetailsJSON.getJSONArray("subscriptionOfferDetails").getJSONObject(i11);
            if (jSONObject2 == null) {
                return null;
            }
            Bundle bundle = new Bundle(params);
            OperationalData operationalDataM7889c = operationalData.m7889c();
            String basePlanId = jSONObject2.getString("basePlanId");
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            Intrinsics.checkNotNullExpressionValue(basePlanId, "basePlanId");
            companion.addParameter(operationalDataEnum, "fb_iap_base_plan", basePlanId, bundle, operationalDataM7889c);
            JSONArray jSONArray2 = jSONObject2.getJSONArray("pricingPhases");
            JSONObject jSONObject3 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject3 == null) {
                return null;
            }
            String strOptString = jSONObject3.optString("billingPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            companion.addParameter(operationalDataEnum, "fb_iap_subs_period", strOptString, bundle, operationalDataM7889c);
            if (!jSONObject3.has("recurrenceMode") || jSONObject3.getInt("recurrenceMode") == 3) {
                companion.addParameter(operationalDataEnum, "fb_iap_subs_auto_renewing", CredentialEntry.FALSE_STRING, bundle, operationalDataM7889c);
            } else {
                companion.addParameter(operationalDataEnum, "fb_iap_subs_auto_renewing", CredentialEntry.TRUE_STRING, bundle, operationalDataM7889c);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject3.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject3.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new a(bigDecimal2, currency2, bundle, operationalDataM7889c));
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m88615g() {
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f != null && C5501a.m7803q() && fetchedAppSettingsM9975f.getIAPAutomaticLoggingEnabled()) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m88616h() {
        Context contextM7799m = C5501a.m7799m();
        String strM7800n = C5501a.m7800n();
        if (C5501a.m7803q()) {
            if (contextM7799m instanceof Application) {
                AppEventsLogger.INSTANCE.activateApp((Application) contextM7799m, strM7800n);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m88617i(@Nullable String activityName, long timeSpentInSeconds) {
        Context contextM7799m = C5501a.m7799m();
        FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
        if (fetchedAppSettingsM9982u != null && fetchedAppSettingsM9982u.getAutomaticLoggingEnabled() && timeSpentInSeconds > 0) {
            InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextM7799m);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
            internalAppEventsLogger2.m7881c("fb_aa_time_spent_on_view", timeSpentInSeconds, bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m88618j(@NotNull String purchase, @NotNull String skuDetails, boolean isSubscription, @Nullable InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        List<a> listM88620b;
        String str;
        String str2;
        Bundle bundleM88613a;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (!m88615g() || (listM88620b = f89481a.m88620b(purchase, skuDetails, billingClientVersion)) == null || listM88620b.isEmpty()) {
            return;
        }
        if (isSubscription && C5758a.m10026d("app_events_if_auto_log_subs", C5501a.m7800n(), false)) {
            if (isFirstAppLaunch) {
                str2 = "SubscriptionRestore";
            } else if (C38102l.f85766a.m86024m(skuDetails)) {
                str2 = "StartTrial";
            } else {
                str2 = "Subscribe";
            }
        } else {
            if (!isFirstAppLaunch) {
                str = "fb_mobile_purchase";
            } else {
                str2 = "fb_mobile_purchase_restored";
            }
            if (!isSubscription && FeatureManager.m9939g(FeatureManager.Feature.AndroidManualImplicitSubsDedupe)) {
                bundleM88613a = m88614f(listM88620b, str);
            } else if (isSubscription && FeatureManager.m9939g(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe)) {
                bundleM88613a = m88613a(listM88620b);
            } else {
                bundleM88613a = null;
            }
            C38101k.f85761a.m86004a(bundleM88613a, listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
            if (!Intrinsics.areEqual(str, "fb_mobile_purchase")) {
                internalAppEventsLogger.m7885g(str, listM88620b.get(0).getPurchaseAmount(), listM88620b.get(0).getCurrency(), listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
            } else {
                internalAppEventsLogger.m7886h(listM88620b.get(0).getPurchaseAmount(), listM88620b.get(0).getCurrency(), listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
            }
        }
        str = str2;
        if (!isSubscription) {
            if (isSubscription) {
                bundleM88613a = null;
            } else {
                bundleM88613a = null;
            }
        } else if (isSubscription) {
            bundleM88613a = null;
        } else {
            bundleM88613a = null;
        }
        C38101k.f85761a.m86004a(bundleM88613a, listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
        if (!Intrinsics.areEqual(str, "fb_mobile_purchase")) {
            internalAppEventsLogger.m7885g(str, listM88620b.get(0).getPurchaseAmount(), listM88620b.get(0).getCurrency(), listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
        } else {
            internalAppEventsLogger.m7886h(listM88620b.get(0).getPurchaseAmount(), listM88620b.get(0).getCurrency(), listM88620b.get(0).getParam(), listM88620b.get(0).getOperationalData());
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<a> m88621c(String purchase, String skuDetails, Map<String, String> extraParameter, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        try {
            JSONObject jSONObject = new JSONObject(purchase);
            JSONObject jSONObject2 = new JSONObject(skuDetails);
            Bundle bundle = new Bundle(1);
            OperationalData operationalData = new OperationalData();
            if (billingClientVersion != null) {
                OperationalData.INSTANCE.addParameter(OperationalDataEnum.IAPParameters, "fb_iap_sdk_supported_library_versions", billingClientVersion.getType(), bundle, operationalData);
            }
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, "fb_iap_product_id", string, bundle, operationalData);
            String string2 = jSONObject.getString("purchaseTime");
            Intrinsics.checkNotNullExpressionValue(string2, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            companion.addParameter(operationalDataEnum, "fb_iap_purchase_time", string2, bundle, operationalData);
            String string3 = jSONObject.getString("purchaseToken");
            Intrinsics.checkNotNullExpressionValue(string3, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            companion.addParameter(operationalDataEnum, "fb_iap_purchase_token", string3, bundle, operationalData);
            String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            Intrinsics.checkNotNullExpressionValue(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            companion.addParameter(operationalDataEnum, "fb_iap_package_name", strOptString, bundle, operationalData);
            String strOptString2 = jSONObject2.optString("title");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            companion.addParameter(operationalDataEnum, "fb_iap_product_title", strOptString2, bundle, operationalData);
            String strOptString3 = jSONObject2.optString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
            Intrinsics.checkNotNullExpressionValue(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            companion.addParameter(operationalDataEnum, "fb_iap_product_description", strOptString3, bundle, operationalData);
            String type = jSONObject2.optString("type");
            Intrinsics.checkNotNullExpressionValue(type, "type");
            companion.addParameter(operationalDataEnum, "fb_iap_product_type", type, bundle, operationalData);
            String strM8218e = C5537e.m8218e();
            if (strM8218e != null) {
                companion.addParameter(operationalDataEnum, "fb_iap_client_library_version", strM8218e, bundle, operationalData);
            }
            for (Map.Entry<String, String> entry : extraParameter.entrySet()) {
                OperationalData.INSTANCE.addParameter(OperationalDataEnum.IAPParameters, entry.getKey(), entry.getValue(), bundle, operationalData);
            }
            if (jSONObject2.has("price_amount_micros")) {
                return CollectionsKt.mutableListOf(m88622d(type, bundle, operationalData, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                return null;
            }
            return m88623e(type, bundle, operationalData, jSONObject2);
        } catch (JSONException e11) {
            Log.e(TAG, "Error parsing in-app purchase/subscription data.", e11);
            return null;
        } catch (Exception e12) {
            Log.e(TAG, "Failed to get purchase logging parameters,", e12);
            return null;
        }
    }
}
