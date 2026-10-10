package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "", "component4", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "AFAdRevenueData", "getRevenue", "()Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1kSDK;", "", "()Z", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1pSDK;", "areAllFieldsValid", "component2", "AFa1tSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFe1vSDK {

    @Nullable
    private static AFe1wSDK component3;

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final Lazy getRevenue;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK areAllFieldsValid;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK AFAdRevenueData;

    /* JADX INFO: renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String getCurrencyIso4217Code = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String getMonetizationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> areAllFieldsValid = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$AFa1tSDK, reason: from kotlin metadata */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\n\u0010\u0011"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1tSDK;", "", "<init>", "()V", "", "", "areAllFieldsValid", "Ljava/util/List;", "getMediationNetwork", "()Ljava/util/List;", "getMonetizationNetwork", "getCurrencyIso4217Code", "Ljava/lang/String;", "getRevenue", "Lcom/appsflyer/internal/AFe1wSDK;", "component3", "Lcom/appsflyer/internal/AFe1wSDK;", "(Lcom/appsflyer/internal/AFe1wSDK;)V"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "getMediationNetwork")
        @NotNull
        public static List<String> getMediationNetwork() {
            return AFe1vSDK.areAllFieldsValid;
        }

        @JvmName(name = "getMonetizationNetwork")
        public static void getMonetizationNetwork(@Nullable AFe1wSDK aFe1wSDK) {
            AFe1vSDK.component3 = aFe1wSDK;
        }
    }

    @JvmName(name = "getRevenue")
    public static boolean getRevenue() {
        return component3 == null;
    }

    @JvmName(name = "AFAdRevenueData")
    @NotNull
    public final String AFAdRevenueData() {
        int i11 = AFa1ySDK.getRevenue[(getRevenue() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i11 == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1wSDK aFe1wSDK = component3;
        String str = aFe1wSDK != null ? aFe1wSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    public AFe1vSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1pSDK aFc1pSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        this.AFAdRevenueData = aFc1kSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.5
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String mediationNetwork = com.appsflyer.internal.AFa1ySDK.getMediationNetwork(AFe1vSDK.this.areAllFieldsValid, AFe1vSDK.this.AFAdRevenueData.component4());
                if (mediationNetwork != null && !StringsKt.isBlank(mediationNetwork)) {
                    String string = StringsKt.trim((CharSequence) mediationNetwork).toString();
                    List<String> mediationNetwork2 = Companion.getMediationNetwork();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (mediationNetwork2.contains(lowerCase)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        AFLogger.afWarnLog(str);
                        mediationNetwork = "";
                    } else {
                        mediationNetwork = C33820nf.f71144W + string;
                    }
                }
                return StringsKt.trim((CharSequence) (mediationNetwork != null ? mediationNetwork : "")).toString();
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.4
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1vSDK.this.AFAdRevenueData.getMediationNetwork.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1vSDK.AFAdRevenueData(packageName, AFe1vSDK.getRevenue(AFe1vSDK.this));
            }
        });
    }

    public static final /* synthetic */ String getRevenue(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.getCurrencyIso4217Code.getValue();
    }

    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    public final String getCurrencyIso4217Code() {
        AFe1tSDK aFe1tSDK;
        String str;
        if (getRevenue()) {
            aFe1tSDK = AFe1tSDK.DEFAULT;
        } else {
            aFe1tSDK = AFe1tSDK.API;
        }
        int i11 = AFa1ySDK.getRevenue[aFe1tSDK.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            AFe1wSDK aFe1wSDK = component3;
            if (aFe1wSDK != null) {
                str = aFe1wSDK.getMonetizationNetwork;
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        return "appsflyersdk.com";
    }

    public static final /* synthetic */ String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + C33978va.f72339h;
    }

    public static final void AFAdRevenueData(@Nullable AFe1wSDK aFe1wSDK) {
        Companion.getMonetizationNetwork(aFe1wSDK);
    }
}
