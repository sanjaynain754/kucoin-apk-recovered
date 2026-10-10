package com.sumsub.sns.internal.features.data.model.common;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sentry.AbstractC27897U;
import com.tencent.bugly.proguard.C33612dh;
import com.tencent.bugly.proguard.C33812n7;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJf\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00069"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/LogParams;", "", "", "errorType", FirebaseAnalytics.Param.LOCATION, "externalUserId", "fileName", "applicantId", "message", C33612dh.f69618m, C33812n7.f71061t, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V", "self", "Lwg0/b;", "output", "Lvg0/f;", "serialDesc", "", "write$Self$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/internal/features/data/model/common/LogParams;Lwg0/b;Lvg0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/LogParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorType", "getLocation", "getExternalUserId", "getFileName", "getApplicantId", "getMessage", "getKind", "getStacktrace", "Companion", "com/sumsub/sns/internal/features/data/model/common/w2", "com/sumsub/sns/internal/features/data/model/common/x2", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public final /* data */ class LogParams {

    @NotNull
    public static final C29717x2 Companion = new C29717x2();

    @NotNull
    private final String applicantId;

    @NotNull
    private final String errorType;

    @Nullable
    private final String externalUserId;

    @Nullable
    private final String fileName;

    @NotNull
    private final String kind;

    @NotNull
    private final String location;

    @NotNull
    private final String message;

    @Nullable
    private final String stacktrace;

    public /* synthetic */ LogParams(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C41876r2 c41876r2) {
        if (50 != (i11 & 50)) {
            C41801c2.m91514a(i11, 50, C29712w2.f59775a.getDescriptor());
        }
        this.errorType = (i11 & 1) == 0 ? "msdkError" : str;
        this.location = str2;
        if ((i11 & 4) == 0) {
            this.externalUserId = null;
        } else {
            this.externalUserId = str3;
        }
        if ((i11 & 8) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str4;
        }
        this.applicantId = str5;
        this.message = str6;
        if ((i11 & 64) == 0) {
            this.kind = "sdk";
        } else {
            this.kind = str7;
        }
        if ((i11 & 128) == 0) {
            this.stacktrace = null;
        } else {
            this.stacktrace = str8;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$idensic_mobile_sdk_aar_defaultRelease(LogParams self, InterfaceC45829b output, InterfaceC45533f serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.errorType, "msdkError")) {
            output.encodeStringElement(serialDesc, 0, self.errorType);
        }
        output.encodeStringElement(serialDesc, 1, self.location);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.externalUserId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C41897w2.f92051a, self.externalUserId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fileName != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C41897w2.f92051a, self.fileName);
        }
        output.encodeStringElement(serialDesc, 4, self.applicantId);
        output.encodeStringElement(serialDesc, 5, self.message);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.kind, "sdk")) {
            output.encodeStringElement(serialDesc, 6, self.kind);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.stacktrace == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, C41897w2.f92051a, self.stacktrace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogParams)) {
            return false;
        }
        LogParams logParams = (LogParams) other;
        return Intrinsics.areEqual(this.errorType, logParams.errorType) && Intrinsics.areEqual(this.location, logParams.location) && Intrinsics.areEqual(this.externalUserId, logParams.externalUserId) && Intrinsics.areEqual(this.fileName, logParams.fileName) && Intrinsics.areEqual(this.applicantId, logParams.applicantId) && Intrinsics.areEqual(this.message, logParams.message) && Intrinsics.areEqual(this.kind, logParams.kind) && Intrinsics.areEqual(this.stacktrace, logParams.stacktrace);
    }

    public static /* synthetic */ LogParams copy$default(LogParams logParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logParams.errorType;
        }
        if ((i11 & 2) != 0) {
            str2 = logParams.location;
        }
        if ((i11 & 4) != 0) {
            str3 = logParams.externalUserId;
        }
        if ((i11 & 8) != 0) {
            str4 = logParams.fileName;
        }
        if ((i11 & 16) != 0) {
            str5 = logParams.applicantId;
        }
        if ((i11 & 32) != 0) {
            str6 = logParams.message;
        }
        if ((i11 & 64) != 0) {
            str7 = logParams.kind;
        }
        if ((i11 & 128) != 0) {
            str8 = logParams.stacktrace;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return logParams.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    @NotNull
    public final LogParams copy(@NotNull String errorType, @NotNull String location, @Nullable String externalUserId, @Nullable String fileName, @NotNull String applicantId, @NotNull String message, @NotNull String kind, @Nullable String stacktrace) {
        return new LogParams(errorType, location, externalUserId, fileName, applicantId, message, kind, stacktrace);
    }

    @NotNull
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getStacktrace() {
        return this.stacktrace;
    }

    public int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.location, this.errorType.hashCode() * 31, 31);
        String str = this.externalUserId;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        int iM68983a2 = AbstractC27897U.m68983a(this.kind, AbstractC27897U.m68983a(this.message, AbstractC27897U.m68983a(this.applicantId, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        String str3 = this.stacktrace;
        return iM68983a2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LogParams(errorType=" + this.errorType + ", location=" + this.location + ", externalUserId=" + this.externalUserId + ", fileName=" + this.fileName + ", applicantId=" + this.applicantId + ", message=" + this.message + ", kind=" + this.kind + ", stacktrace=" + this.stacktrace + ")";
    }

    public LogParams(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8) {
        this.errorType = str;
        this.location = str2;
        this.externalUserId = str3;
        this.fileName = str4;
        this.applicantId = str5;
        this.message = str6;
        this.kind = str7;
        this.stacktrace = str8;
    }

    public /* synthetic */ LogParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "msdkError" : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, str6, (i11 & 64) != 0 ? "sdk" : str7, (i11 & 128) != 0 ? null : str8);
    }
}
