package com.kubi.p110rn.kline;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.site.C24137e;
import com.kubi.sdk.site.SiteType;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.config.UserInfo;
import com.tencent.mmkv.MMKV;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradingViewLegacyStorageModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "readSnapshots", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingViewLegacyStorageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingViewLegacyStorageModule.kt\ncom/kubi/rn/kline/TradingViewLegacyStorageModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,63:1\n18#2:64\n*S KotlinDebug\n*F\n+ 1 TradingViewLegacyStorageModule.kt\ncom/kubi/rn/kline/TradingViewLegacyStorageModule\n*L\n43#1:64\n*E\n"})
public final class TradingViewLegacyStorageModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingViewLegacyStorageModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static final void readSnapshots$add(Set<String> set, MMKV mmkv, JSONArray jSONArray, String str, String str2, String str3) {
        String strDecodeString;
        if (!SetsKt.setOf((Object[]) new String[]{SearchCategory$Companion.SPOT, ViewProps.MARGIN, SearchCategory$Companion.FUTURES}).contains(str) || StringsKt.isBlank(str2)) {
            return;
        }
        String str4 = str + '_' + str2 + '-' + str3;
        if (!set.add(str4) || mmkv == null || (strDecodeString = mmkv.decodeString(str4)) == null) {
            return;
        }
        jSONArray.put(new JSONObject().put("market", str).put("symbol", str2).put("userId", str3).put(JPushConstants.Analysis.KEY_JSON, strDecodeString));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "TradingViewLegacyStorage";
    }

    @ReactMethod
    public final void readSnapshots(@NotNull Promise promise) {
        String strRemoveSuffix;
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
            MMKV mmkvMmkvWithID = MMKV.mmkvWithID(C24137e.m58087a(currentSiteType) ? "flutter_tv_chart.site_" + currentSiteType : "flutter_tv_chart");
            Intrinsics.checkNotNullExpressionValue(mmkvMmkvWithID, "mmkvWithID(...)");
            MMKV mmkvMmkvWithID2 = MMKV.mmkvWithID("flutter_tv_chart");
            Intrinsics.checkNotNullExpressionValue(mmkvMmkvWithID2, "mmkvWithID(...)");
            String strDecodeString = mmkvMmkvWithID2.decodeString("tv_chart_slots_registry");
            if (strDecodeString == null) {
                strDecodeString = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray = new JSONArray(strDecodeString);
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("businessType");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    String strOptString2 = jSONObjectOptJSONObject.optString("symbol");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    String strOptString3 = jSONObjectOptJSONObject.optString("userId");
                    Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                    readSnapshots$add(linkedHashSet, mmkvMmkvWithID, jSONArray2, strOptString, strOptString2, strOptString3);
                }
            }
            String strI = UserInfo.a.i();
            if (strI == null) {
                strI = "";
            }
            Set<String> of2 = SetsKt.setOf((Object[]) new String[]{strI, ""});
            String[] strArrAllKeys = mmkvMmkvWithID.allKeys();
            if (strArrAllKeys == null) {
                strArrAllKeys = new String[0];
            }
            int length2 = strArrAllKeys.length;
            for (int i12 = 0; i12 < length2; i12++) {
                String str = strArrAllKeys[i12];
                for (String str2 : of2) {
                    String str3 = '-' + str2;
                    Intrinsics.checkNotNull(str);
                    Set set = of2;
                    String[] strArr = strArrAllKeys;
                    if (StringsKt.endsWith$default(str, str3, false, 2, (Object) null) && (iIndexOf$default = StringsKt.indexOf$default((CharSequence) (strRemoveSuffix = StringsKt.removeSuffix(str, (CharSequence) str3)), '_', 0, false, 6, (Object) null)) > 0) {
                        String strSubstring = strRemoveSuffix.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        String strSubstring2 = strRemoveSuffix.substring(iIndexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        readSnapshots$add(linkedHashSet, mmkvMmkvWithID, jSONArray2, strSubstring, strSubstring2, str2);
                    }
                    of2 = set;
                    strArrAllKeys = strArr;
                }
            }
            MMKV mmkvMmkvWithID3 = MMKV.mmkvWithID(C24137e.m58087a(currentSiteType) ? "flutter_kline_module.site_" + currentSiteType : "flutter_kline_module");
            Intrinsics.checkNotNullExpressionValue(mmkvMmkvWithID3, "mmkvWithID(...)");
            JSONObject jSONObjectPut = new JSONObject().put("site", currentSiteType.toString()).put("snapshots", jSONArray2);
            String strDecodeString2 = mmkvMmkvWithID2.decodeString("tv_chart_lines_first_seen");
            if (strDecodeString2 == null) {
                strDecodeString2 = "{}";
            }
            promise.resolve(jSONObjectPut.put("firstSeen", new JSONObject(strDecodeString2)).put("settingsVisited", mmkvMmkvWithID3.decodeBool("settings_red_dot_clicked_key", false)).toString());
        } catch (Exception e11) {
            promise.reject("TV_LEGACY_READ_FAILED", "TradingView legacy storage read failed", e11);
        }
    }
}
