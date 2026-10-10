package com.kubi.kyc.ui.kycv2;

import a3d20260409.C0106s;
import a3d20260409.C0108u;
import aai.liveness.activity.LivenessActivity;
import ai.advance.liveness.lib.Market;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.event.api.C12572a;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: AdvanceFaceFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/AdvanceFaceFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startLivenessDetection", InterfaceC33826o0.f71244p, "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "FaceLivenessInfo", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdvanceFaceFragment extends Fragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public static final Companion f31409U = new Companion(null);

    /* JADX INFO: compiled from: AdvanceFaceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/AdvanceFaceFragment$Companion;", "", "<init>", "()V", "TAG", "", "REQUEST_CODE_LIVENESS", "", "ADVANCE_LICENSE_ERROR_CODE", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: AdvanceFaceFragment.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/AdvanceFaceFragment$FaceLivenessInfo;", "", "livenessId", "", "isSuccess", "", AppsFlyerProperties.CHANNEL, "transactionId", "errorCode", "errorMsg", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLivenessId", "()Ljava/lang/String;", "setLivenessId", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getChannel", "setChannel", "getTransactionId", "setTransactionId", "getErrorCode", "setErrorCode", "getErrorMsg", "setErrorMsg", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/ui/kycv2/AdvanceFaceFragment$FaceLivenessInfo;", "equals", "other", "hashCode", "", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FaceLivenessInfo {

        @Nullable
        private String channel;

        @Nullable
        private String errorCode;

        @Nullable
        private String errorMsg;

        @Nullable
        private Boolean isSuccess;

        @Nullable
        private String livenessId;

        @Nullable
        private String transactionId;

        public FaceLivenessInfo() {
            this(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceLivenessInfo)) {
                return false;
            }
            FaceLivenessInfo faceLivenessInfo = (FaceLivenessInfo) other;
            return Intrinsics.areEqual(this.livenessId, faceLivenessInfo.livenessId) && Intrinsics.areEqual(this.isSuccess, faceLivenessInfo.isSuccess) && Intrinsics.areEqual(this.channel, faceLivenessInfo.channel) && Intrinsics.areEqual(this.transactionId, faceLivenessInfo.transactionId) && Intrinsics.areEqual(this.errorCode, faceLivenessInfo.errorCode) && Intrinsics.areEqual(this.errorMsg, faceLivenessInfo.errorMsg);
        }

        public FaceLivenessInfo(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.livenessId = str;
            this.isSuccess = bool;
            this.channel = str2;
            this.transactionId = str3;
            this.errorCode = str4;
            this.errorMsg = str5;
        }

        public static /* synthetic */ FaceLivenessInfo copy$default(FaceLivenessInfo faceLivenessInfo, String str, Boolean bool, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = faceLivenessInfo.livenessId;
            }
            if ((i11 & 2) != 0) {
                bool = faceLivenessInfo.isSuccess;
            }
            if ((i11 & 4) != 0) {
                str2 = faceLivenessInfo.channel;
            }
            if ((i11 & 8) != 0) {
                str3 = faceLivenessInfo.transactionId;
            }
            if ((i11 & 16) != 0) {
                str4 = faceLivenessInfo.errorCode;
            }
            if ((i11 & 32) != 0) {
                str5 = faceLivenessInfo.errorMsg;
            }
            String str6 = str4;
            String str7 = str5;
            return faceLivenessInfo.copy(str, bool, str2, str3, str6, str7);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLivenessId() {
            return this.livenessId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsSuccess() {
            return this.isSuccess;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        @NotNull
        public final FaceLivenessInfo copy(@Nullable String livenessId, @Nullable Boolean isSuccess, @Nullable String channel, @Nullable String transactionId, @Nullable String errorCode, @Nullable String errorMsg) {
            return new FaceLivenessInfo(livenessId, isSuccess, channel, transactionId, errorCode, errorMsg);
        }

        @Nullable
        public final String getChannel() {
            return this.channel;
        }

        @Nullable
        public final String getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        @Nullable
        public final String getLivenessId() {
            return this.livenessId;
        }

        @Nullable
        public final String getTransactionId() {
            return this.transactionId;
        }

        public int hashCode() {
            String str = this.livenessId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isSuccess;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.channel;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.transactionId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorMsg;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @Nullable
        public final Boolean isSuccess() {
            return this.isSuccess;
        }

        public final void setChannel(@Nullable String str) {
            this.channel = str;
        }

        public final void setErrorCode(@Nullable String str) {
            this.errorCode = str;
        }

        public final void setErrorMsg(@Nullable String str) {
            this.errorMsg = str;
        }

        public final void setLivenessId(@Nullable String str) {
            this.livenessId = str;
        }

        public final void setSuccess(@Nullable Boolean bool) {
            this.isSuccess = bool;
        }

        public final void setTransactionId(@Nullable String str) {
            this.transactionId = str;
        }

        @NotNull
        public String toString() {
            return "FaceLivenessInfo(livenessId=" + this.livenessId + ", isSuccess=" + this.isSuccess + ", channel=" + this.channel + ", transactionId=" + this.transactionId + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ')';
        }

        public /* synthetic */ FaceLivenessInfo(String str, Boolean bool, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m37114d3(String str) throws JSONException {
        C0106s.m488n(BaseApplication.INSTANCE.get(), Market.Singapore);
        String strM494t = C0106s.m494t(str);
        C44128b.m97259c("AdvanceFaceFragment", "[startLivenessDetection] checkResult:" + strM494t);
        if (!Intrinsics.areEqual(AppConstants.AB_TEST_SUCCESS, strM494t)) {
            C12572a.m23695d("com.kubi.kyc.event.KycEvent:advance_liveness_event", new FaceLivenessInfo(null, Boolean.FALSE, "ADVANCE", null, "-99999999", "GuardianLivenessDetectionSDK.setLicenseAndCheck=" + strM494t, 9, null), 0L, 4, null);
            return;
        }
        startActivityForResult(new Intent(getContext(), (Class<?>) LivenessActivity.class), 10);
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "data_1") : null;
        if (strM56284y == null) {
            strM56284y = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessType", strM56284y);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("faceVerifyCmpStart", "page", "1", jSONObject);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String str;
        String str2;
        String str3;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            String strM507g = C0108u.m507g();
            String strM508h = C0108u.m508h();
            if (strM508h == null) {
                str = "";
            } else {
                str = strM508h;
            }
            C44128b.m97259c("AdvanceFaceFragment", "[onActivityResult] isSuccess:" + C0108u.m510j());
            if (C0108u.m510j()) {
                C12572a.m23695d("com.kubi.kyc.event.KycEvent:advance_liveness_event", new FaceLivenessInfo(strM507g, Boolean.TRUE, "ADVANCE", str, null, null, 48, null), 0L, 4, null);
            } else {
                String strM506f = C0108u.m506f();
                if (strM506f == null) {
                    str2 = "";
                } else {
                    str2 = strM506f;
                }
                String strM505e = C0108u.m505e();
                if (strM505e == null) {
                    str3 = "";
                } else {
                    str3 = strM505e;
                }
                C12572a.m23695d("com.kubi.kyc.event.KycEvent:advance_liveness_event", new FaceLivenessInfo(strM507g, Boolean.FALSE, "ADVANCE", str, str3, str2), 0L, 4, null);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        m37114d3(string);
    }
}
