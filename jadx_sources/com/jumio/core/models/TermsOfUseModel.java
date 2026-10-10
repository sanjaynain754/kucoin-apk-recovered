package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.termsofuse.JumioTermsOfUse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/models/TermsOfUseModel;", "Lcom/jumio/core/model/StaticModel;", "termsOfUse", "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;", "<init>", "(Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;)V", "getTermsOfUse", "()Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("TermsOfUseModel")
public final /* data */ class TermsOfUseModel implements StaticModel {

    /* JADX INFO: renamed from: b */
    public static final Companion f14364b = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final JumioTermsOfUse f14365a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/TermsOfUseModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/TermsOfUseModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @Nullable
        public final TermsOfUseModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("text", "");
            String strOptString2 = jsonObject.optString("url", "");
            if (strOptString == null || strOptString.length() == 0 || strOptString2 == null || strOptString2.length() == 0) {
                return null;
            }
            return new TermsOfUseModel(new JumioTermsOfUse(strOptString, strOptString2));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TermsOfUseModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TermsOfUseModel) && Intrinsics.areEqual(this.f14365a, ((TermsOfUseModel) other).f14365a);
    }

    public TermsOfUseModel(@Nullable JumioTermsOfUse jumioTermsOfUse) {
        this.f14365a = jumioTermsOfUse;
    }

    public final int hashCode() {
        JumioTermsOfUse jumioTermsOfUse = this.f14365a;
        if (jumioTermsOfUse == null) {
            return 0;
        }
        return jumioTermsOfUse.hashCode();
    }

    public final String toString() {
        return "TermsOfUseModel(termsOfUse=" + this.f14365a + ')';
    }

    public /* synthetic */ TermsOfUseModel(JumioTermsOfUse jumioTermsOfUse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : jumioTermsOfUse);
    }
}
