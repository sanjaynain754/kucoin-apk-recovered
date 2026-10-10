package com.kubi.otc.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrecheckBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/otc/entity/PrecheckBean;", "", "<init>", "()V", "Request", "Response", "FailField", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PrecheckBean {

    /* JADX INFO: compiled from: PrecheckBean.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/entity/PrecheckBean$FailField;", "", "field", "", "hint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "getHint", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FailField {

        @Nullable
        private final String field;

        @Nullable
        private final String hint;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailField)) {
                return false;
            }
            FailField failField = (FailField) other;
            return Intrinsics.areEqual(this.field, failField.field) && Intrinsics.areEqual(this.hint, failField.hint);
        }

        public static /* synthetic */ FailField copy$default(FailField failField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = failField.field;
            }
            if ((i11 & 2) != 0) {
                str2 = failField.hint;
            }
            return failField.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getField() {
            return this.field;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final FailField copy(@Nullable String field, @Nullable String hint) {
            return new FailField(field, hint);
        }

        @Nullable
        public final String getField() {
            return this.field;
        }

        @Nullable
        public final String getHint() {
            return this.hint;
        }

        public int hashCode() {
            String str = this.field;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.hint;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FailField(field=" + this.field + ", hint=" + this.hint + ')';
        }

        public FailField(@Nullable String str, @Nullable String str2) {
            this.field = str;
            this.hint = str2;
        }
    }

    /* JADX INFO: compiled from: PrecheckBean.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/entity/PrecheckBean$Request;", "", "payTypeId", "", JPushConstants.Analysis.KEY_JSON, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPayTypeId", "()Ljava/lang/String;", "getJson", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String json;

        @NotNull
        private final String payTypeId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.payTypeId, request.payTypeId) && Intrinsics.areEqual(this.json, request.json);
        }

        public Request(@NotNull String payTypeId, @NotNull String json) {
            Intrinsics.checkNotNullParameter(payTypeId, "payTypeId");
            Intrinsics.checkNotNullParameter(json, "json");
            this.payTypeId = payTypeId;
            this.json = json;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.payTypeId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.json;
            }
            return request.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayTypeId() {
            return this.payTypeId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getJson() {
            return this.json;
        }

        @NotNull
        public final Request copy(@NotNull String payTypeId, @NotNull String json) {
            Intrinsics.checkNotNullParameter(payTypeId, "payTypeId");
            Intrinsics.checkNotNullParameter(json, "json");
            return new Request(payTypeId, json);
        }

        @NotNull
        public final String getJson() {
            return this.json;
        }

        @NotNull
        public final String getPayTypeId() {
            return this.payTypeId;
        }

        public int hashCode() {
            return (this.payTypeId.hashCode() * 31) + this.json.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(payTypeId=" + this.payTypeId + ", json=" + this.json + ')';
        }
    }

    /* JADX INFO: compiled from: PrecheckBean.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/otc/entity/PrecheckBean$Response;", "", "failFields", "", "Lcom/kubi/otc/entity/PrecheckBean$FailField;", "<init>", "(Ljava/util/List;)V", "getFailFields", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final List<FailField> failFields;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.failFields, ((Response) other).failFields);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = response.failFields;
            }
            return response.copy(list);
        }

        @Nullable
        public final List<FailField> component1() {
            return this.failFields;
        }

        @NotNull
        public final Response copy(@Nullable List<FailField> failFields) {
            return new Response(failFields);
        }

        @Nullable
        public final List<FailField> getFailFields() {
            return this.failFields;
        }

        public int hashCode() {
            List<FailField> list = this.failFields;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(failFields=" + this.failFields + ')';
        }

        public Response(@Nullable List<FailField> list) {
            this.failFields = list;
        }
    }
}
