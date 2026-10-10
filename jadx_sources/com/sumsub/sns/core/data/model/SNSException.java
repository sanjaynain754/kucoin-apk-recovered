package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0007\b\t\nB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wrap", "", "<init>", "(Ljava/lang/Throwable;)V", "Api", "Network", "Unknown", "Internal", "Lcom/sumsub/sns/core/data/model/SNSException$Api;", "Lcom/sumsub/sns/core/data/model/SNSException$Internal;", "Lcom/sumsub/sns/core/data/model/SNSException$Network;", "Lcom/sumsub/sns/core/data/model/SNSException$Unknown;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class SNSException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Api;", "Lcom/sumsub/sns/core/data/model/SNSException;", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "code", "", "correlationId", "errorCode", "errorName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCorrelationId", "getErrorCode", "getErrorName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/SNSException$Api;", "equals", "", "other", "", "hashCode", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Api extends SNSException {

        @Nullable
        private final Integer code;

        @Nullable
        private final String correlationId;

        @Nullable
        private final String description;

        @Nullable
        private final Integer errorCode;

        @Nullable
        private final String errorName;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Api)) {
                return false;
            }
            Api api = (Api) other;
            return Intrinsics.areEqual(this.description, api.description) && Intrinsics.areEqual(this.code, api.code) && Intrinsics.areEqual(this.correlationId, api.correlationId) && Intrinsics.areEqual(this.errorCode, api.errorCode) && Intrinsics.areEqual(this.errorName, api.errorName);
        }

        public Api(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
            super(new Exception(str), null);
            this.description = str;
            this.code = num;
            this.correlationId = str2;
            this.errorCode = num2;
            this.errorName = str3;
        }

        public static /* synthetic */ Api copy$default(Api api, String str, Integer num, String str2, Integer num2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = api.description;
            }
            if ((i11 & 2) != 0) {
                num = api.code;
            }
            if ((i11 & 4) != 0) {
                str2 = api.correlationId;
            }
            if ((i11 & 8) != 0) {
                num2 = api.errorCode;
            }
            if ((i11 & 16) != 0) {
                str3 = api.errorName;
            }
            String str4 = str3;
            String str5 = str2;
            return api.copy(str, num, str5, num2, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCorrelationId() {
            return this.correlationId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorName() {
            return this.errorName;
        }

        @NotNull
        public final Api copy(@Nullable String description, @Nullable Integer code, @Nullable String correlationId, @Nullable Integer errorCode, @Nullable String errorName) {
            return new Api(description, code, correlationId, errorCode, errorName);
        }

        @Nullable
        public final Integer getCode() {
            return this.code;
        }

        @Nullable
        public final String getCorrelationId() {
            return this.correlationId;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final String getErrorName() {
            return this.errorName;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.code;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.correlationId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.errorCode;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.errorName;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Api(description=" + this.description + ", code=" + this.code + ", correlationId=" + this.correlationId + ", errorCode=" + this.errorCode + ", errorName=" + this.errorName + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Internal;", "Lcom/sumsub/sns/core/data/model/SNSException;", "wrap", "", "<init>", "(Ljava/lang/Throwable;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Internal extends SNSException {
        /* JADX WARN: Multi-variable type inference failed */
        public Internal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Internal(@Nullable Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ Internal(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Network;", "Lcom/sumsub/sns/core/data/model/SNSException;", "wrap", "", "<init>", "(Ljava/lang/Throwable;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Network extends SNSException {
        public Network(@NotNull Throwable th2) {
            super(th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Unknown;", "Lcom/sumsub/sns/core/data/model/SNSException;", "wrap", "", "<init>", "(Ljava/lang/Throwable;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Unknown extends SNSException {
        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Unknown(@Nullable Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ Unknown(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    public /* synthetic */ SNSException(Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2);
    }

    private SNSException(Throwable th2) {
        super(th2);
    }

    public /* synthetic */ SNSException(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : th2, null);
    }
}
