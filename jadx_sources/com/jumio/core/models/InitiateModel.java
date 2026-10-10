package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/models/InitiateModel;", "Lcom/jumio/core/model/StaticModel;", "accountId", "", "workflowExecutionId", "merchantId", "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getWorkflowExecutionId", "getMerchantId", "getMerchantName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("InitiateModel")
public final /* data */ class InitiateModel implements StaticModel {

    /* JADX INFO: renamed from: e */
    public static final Companion f14254e = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14255a;

    /* JADX INFO: renamed from: b */
    public final String f14256b;

    /* JADX INFO: renamed from: c */
    public final String f14257c;

    /* JADX INFO: renamed from: d */
    public final String f14258d;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/InitiateModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/InitiateModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final InitiateModel fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("acquisitionReference");
            String string2 = jsonObject.getString("accountId");
            String strOptString = jsonObject.optString("merchantId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = jsonObject.optString("merchantName");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            return new InitiateModel(string2, string, strOptString, strOptString2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public InitiateModel() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitiateModel)) {
            return false;
        }
        InitiateModel initiateModel = (InitiateModel) other;
        return Intrinsics.areEqual(this.f14255a, initiateModel.f14255a) && Intrinsics.areEqual(this.f14256b, initiateModel.f14256b) && Intrinsics.areEqual(this.f14257c, initiateModel.f14257c) && Intrinsics.areEqual(this.f14258d, initiateModel.f14258d);
    }

    public InitiateModel(@Nullable String str, @Nullable String str2, @NotNull String merchantId, @NotNull String merchantName) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f14255a = str;
        this.f14256b = str2;
        this.f14257c = merchantId;
        this.f14258d = merchantName;
    }

    @Nullable
    /* JADX INFO: renamed from: getWorkflowExecutionId, reason: from getter */
    public final String getF14256b() {
        return this.f14256b;
    }

    public final int hashCode() {
        String str = this.f14255a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14256b;
        return this.f14258d.hashCode() + AbstractC40511C.m89148a(this.f14257c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "InitiateModel(accountId=" + this.f14255a + ", workflowExecutionId=" + this.f14256b + ", merchantId=" + this.f14257c + ", merchantName=" + this.f14258d + ')';
    }

    public /* synthetic */ InitiateModel(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4);
    }
}
