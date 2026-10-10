package com.appsflyer.internal;

import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import java.nio.charset.Charset;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.appsflyer.internal.AFc1aSDK, reason: from toString */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017"}, m90084d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "AFAdRevenueData", "()Lorg/json/JSONObject;", "getMediationNetwork", "()Ljava/lang/String;", "toString", "getRevenue", "I", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1tSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class ExceptionInfo {

    /* JADX INFO: renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    @NotNull
    public String stackTrace;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    @NotNull
    public String label;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    @NotNull
    final String hashName;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata and from toString */
    int counter;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1aSDK$AFa1tSDK, reason: from kotlin metadata */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, m90084d2 = {"Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1aSDK;", "getRevenue", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1aSDK;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nExceptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13579#2,2:95\n*S KotlinDebug\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n*L\n65#1:95,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        private static boolean getMediationNetwork(Integer p11, String... p12) {
            boolean z11 = p11 == null;
            int length = p12.length;
            for (int i11 = 0; i11 < 3; i11++) {
                String str = p12[i11];
                z11 = z11 || str == null || str.length() == 0;
            }
            return z11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static ExceptionInfo getRevenue(@NotNull String p11) {
            Intrinsics.checkNotNullParameter(p11, "");
            List<String> listSplit$default = StringsKt.split$default((CharSequence) p11, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String monetizationNetwork = null;
            String monetizationNetwork2 = null;
            String monetizationNetwork3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (StringsKt.startsWith$default(str, "label=", false, 2, (Object) null)) {
                    monetizationNetwork = getMonetizationNetwork(str, "label=");
                } else if (StringsKt.startsWith$default(str, "hashName=", false, 2, (Object) null)) {
                    monetizationNetwork2 = getMonetizationNetwork(str, "hashName=");
                } else if (!StringsKt.startsWith$default(str, "stackTrace=", false, 2, (Object) null)) {
                    if (!StringsKt.startsWith$default(str, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) strSubstring).toString()));
                } else {
                    monetizationNetwork3 = getMonetizationNetwork(str, "stackTrace=");
                }
            }
            if (getMediationNetwork(numValueOf, monetizationNetwork, monetizationNetwork2, monetizationNetwork3)) {
                return null;
            }
            Intrinsics.checkNotNull(monetizationNetwork);
            Intrinsics.checkNotNull(monetizationNetwork2);
            Intrinsics.checkNotNull(monetizationNetwork3);
            Intrinsics.checkNotNull(numValueOf);
            return new ExceptionInfo(monetizationNetwork, monetizationNetwork2, monetizationNetwork3, numValueOf.intValue());
        }

        private static String getMonetizationNetwork(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.trim((CharSequence) strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }
    }

    public ExceptionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i11;
    }

    public final boolean equals(@Nullable Object p11) {
        if (this == p11) {
            return true;
        }
        if (!(p11 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p11;
        return Intrinsics.areEqual(this.label, exceptionInfo.label) && Intrinsics.areEqual(this.hashName, exceptionInfo.hashName) && Intrinsics.areEqual(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    @NotNull
    public final JSONObject AFAdRevenueData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put(CmcdConfiguration.KEY_STREAM_TYPE, this.stackTrace);
        jSONObject.put("c", String.valueOf(this.counter));
        return jSONObject;
    }

    @NotNull
    public final String getMediationNetwork() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + Integer.hashCode(this.counter);
    }

    @NotNull
    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? 1 : i11);
    }
}
