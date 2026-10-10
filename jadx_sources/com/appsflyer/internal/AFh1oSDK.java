package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1oSDK implements AFh1qSDK {

    @NotNull
    private final AFc1kSDK AFAdRevenueData;
    private boolean areAllFieldsValid;
    private boolean component2;

    @NotNull
    private final AFj1sSDK getCurrencyIso4217Code;

    @Nullable
    private Long getMediationNetwork;

    @Nullable
    private JSONObject getMonetizationNetwork;

    @Nullable
    private Long getRevenue;

    private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        aFh1mSDK.getMonetizationNetwork(map3);
        Map<String, Object> map4 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1oSDK aFe1oSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFe1oSDKAFAdRevenueData, "");
        getCurrencyIso4217Code(map4, aFe1oSDKAFAdRevenueData);
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map, AFe1oSDK aFe1oSDK) {
        Long l11;
        int i11 = AFa1tSDK.getCurrencyIso4217Code[aFe1oSDK.ordinal()];
        if (i11 != 1) {
            l11 = i11 != 2 ? null : this.getRevenue;
        } else {
            l11 = this.getMediationNetwork;
        }
        if (l11 != null) {
            long jLongValue = l11.longValue();
            Map<String, Object> monetizationNetwork = AFa1ySDK.getMonetizationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("migration", MapsKt.mapOf(TuplesKt.m90091to("delay", Long.valueOf(jLongValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    @WorkerThread
    public final void getMediationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject jSONObject = this.getMonetizationNetwork;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            AFAdRevenueData("attr", aFh1mSDK, jSONObject);
        } else {
            JSONObject mediationNetwork = getMediationNetwork();
            if (mediationNetwork != null) {
                AFAdRevenueData("attr", aFh1mSDK, mediationNetwork);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFAdRevenueData("attr", aFh1mSDK, attributionData);
            this.component2 = true;
        }
        MigrationDataProvider.clear();
    }

    /* JADX INFO: loaded from: classes34.dex */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1oSDK.values().length];
            try {
                iArr[AFe1oSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1oSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    public AFh1oSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.AFAdRevenueData = aFc1kSDK;
        this.getCurrencyIso4217Code = aFj1sSDK;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean getRevenue() {
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    /* JADX INFO: renamed from: u_ */
    public final void mo5984u_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.areAllFieldsValid = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1qSDK};
            Map map = AFa1hSDK.f6283e;
            Object declaredConstructor = map.get(171890876);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (61387 - ImageFormat.getBitsPerPixel(0)), 36 - (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(Uri.class, AFa1qSDK.class);
                map.put(171890876, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = map.get(287567774);
            if (method == null) {
                method = ((Class) AFa1hSDK.getMediationNetwork(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 61389), (KeyEvent.getMaxKeyCode() >> 16) + 36)).getMethod("getMonetizationNetwork", null);
                map.put(287567774, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(1357378971);
            if (method2 == null) {
                method2 = ((Class) AFa1hSDK.getMediationNetwork(Color.argb(0, 0, 0, 0) + 36, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50)).getMethod("getMediationNetwork", null);
                map.put(1357378971, method2);
            }
            this.areAllFieldsValid = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    @WorkerThread
    public final void getMonetizationNetwork(@NotNull AFf1sSDK aFf1sSDK, @NotNull Function0<Unit> function0) {
        JSONObject mediationNetwork;
        Intrinsics.checkNotNullParameter(aFf1sSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.AFAdRevenueData.getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 1 && aFf1sSDK.getMediationNetwork == AFe1oSDK.CONVERSION && this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !getCurrencyIso4217Code() && (mediationNetwork = getMediationNetwork()) != null) {
            this.getMonetizationNetwork = mediationNetwork;
            function0.invoke();
        }
    }

    private final JSONObject getMediationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (jSONObjectWaitForAttributionData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean getCurrencyIso4217Code() {
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    @WorkerThread
    public final void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.getMediationNetwork = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            AFAdRevenueData(CmcdConfiguration.KEY_DEADLINE, aFh1mSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMonetizationNetwork() {
        this.areAllFieldsValid = false;
        MigrationDataProvider.clear();
    }
}
