package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.document.JumioDocumentType;
import com.kubi.kyc.KycKey;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/models/ReusableIdLookupResult;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "value", "", "state", "getState", "()Ljava/lang/String;", "Lcom/jumio/sdk/document/JumioDocumentType;", KycKey.idType, "getIdType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "update", "", "clear", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ReusableIdLookupResult")
public final class ReusableIdLookupResult implements StaticModel {

    /* JADX INFO: renamed from: b */
    public static final Companion f14310b = new Companion(null);

    /* JADX INFO: renamed from: a */
    public JumioDocumentType f14311a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/ReusableIdLookupResult$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/ReusableIdLookupResult;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final ReusableIdLookupResult fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            ReusableIdLookupResult reusableIdLookupResult = new ReusableIdLookupResult();
            JumioDocumentType.Companion companion = JumioDocumentType.INSTANCE;
            String strOptString = jsonObject.optString(KycKey.idType, "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            JumioDocumentType jumioDocumentTypeFromString = companion.fromString(strOptString);
            if (jumioDocumentTypeFromString != null) {
                jsonObject.optString("state", null);
                reusableIdLookupResult.f14311a = jumioDocumentTypeFromString;
            }
            return reusableIdLookupResult;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
