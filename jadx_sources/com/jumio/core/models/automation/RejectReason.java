package com.jumio.core.models.automation;

import com.google.firebase.messaging.Constants;
import com.jumio.core.models.automation.RejectReason;
import com.jumio.core.util.JsonUtilKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jumio.core.C40676i3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/models/automation/RejectReason;", "Ljava/io/Serializable;", "reasonCode", "", "details", "", "Lcom/jumio/core/models/automation/RejectReasonDetail;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getReasonCode", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", "code", "getCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RejectReason implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14401a;

    /* JADX INFO: renamed from: b */
    public final List f14402b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/automation/RejectReason$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/automation/RejectReason;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final C40676i3 m14570a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString(Constants.ScionAnalytics.PARAM_LABEL, "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = json.optString("reasonDetailCode", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            return new C40676i3(strOptString, strOptString2);
        }

        @NotNull
        public final RejectReason fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("reasonCode");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("details");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            List map = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: s9.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RejectReason.Companion.m14570a((JSONObject) obj);
                }
            });
            Intrinsics.checkNotNull(strOptString);
            return new RejectReason(strOptString, map);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RejectReason() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RejectReason)) {
            return false;
        }
        RejectReason rejectReason = (RejectReason) other;
        return Intrinsics.areEqual(this.f14401a, rejectReason.f14401a) && Intrinsics.areEqual(this.f14402b, rejectReason.f14402b);
    }

    public RejectReason(@NotNull String reasonCode, @NotNull List<C40676i3> details) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f14401a = reasonCode;
        this.f14402b = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RejectReason copy$default(RejectReason rejectReason, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rejectReason.f14401a;
        }
        if ((i11 & 2) != 0) {
            list = rejectReason.f14402b;
        }
        return rejectReason.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14401a() {
        return this.f14401a;
    }

    @NotNull
    public final List<C40676i3> component2() {
        return this.f14402b;
    }

    @NotNull
    public final RejectReason copy(@NotNull String reasonCode, @NotNull List<C40676i3> details) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(details, "details");
        return new RejectReason(reasonCode, details);
    }

    @NotNull
    public final String getCode() {
        return this.f14402b.isEmpty() ? this.f14401a : ((C40676i3) this.f14402b.get(0)).f90295b;
    }

    @NotNull
    public final List<C40676i3> getDetails() {
        return this.f14402b;
    }

    @NotNull
    public final String getReasonCode() {
        return this.f14401a;
    }

    public int hashCode() {
        return this.f14402b.hashCode() + (this.f14401a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RejectReason(reasonCode=" + this.f14401a + ", details=" + this.f14402b + ')';
    }

    public /* synthetic */ RejectReason(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
