package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.document.JumioLookupResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/models/LegalStatementModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "value", "", "text", "getText", "()Ljava/lang/String;", "Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "legalStatement", "getLegalStatement", "()Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "", "userConsented", "getUserConsented", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "saveResult", "", DbParams.KEY_CHANNEL_RESULT, "reset", "clear", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("LegalStatementModel")
public final class LegalStatementModel implements StaticModel {

    /* JADX INFO: renamed from: d */
    public static final Companion f14259d = new Companion(null);

    /* JADX INFO: renamed from: a */
    public String f14260a = "By clicking Continue,' you consent to Jumio speeding up the process by sharing the image of your previously provided identification document with the customer requesting verification.";

    /* JADX INFO: renamed from: b */
    public JumioLookupResult.JumioLegalStatement f14261b;

    /* JADX INFO: renamed from: c */
    public Boolean f14262c;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/LegalStatementModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/LegalStatementModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final LegalStatementModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            LegalStatementModel legalStatementModel = new LegalStatementModel();
            String strOptString = jsonObject.optString("text", "By clicking Continue,' you consent to Jumio speeding up the process by sharing the image of your previously provided identification document with the customer requesting verification.");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            legalStatementModel.f14260a = strOptString;
            return legalStatementModel;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
