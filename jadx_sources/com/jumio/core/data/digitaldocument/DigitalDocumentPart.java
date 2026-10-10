package com.jumio.core.data.digitaldocument;

import com.jumio.core.data.ScanMode;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;", "Ljava/io/Serializable;", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "part", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getPart", "()Lcom/jumio/sdk/enums/JumioCredentialPart;", "extraction", "Lcom/jumio/core/data/ScanMode;", "getExtraction", "()Lcom/jumio/core/data/ScanMode;", "options", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;", "getOptions", "()Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DigitalDocumentPart implements Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioCredentialPart f13772a;

    /* JADX INFO: renamed from: b */
    public final ScanMode f13773b;

    /* JADX INFO: renamed from: c */
    public final DigitalDocumentOptions f13774c;

    public DigitalDocumentPart(@NotNull JSONObject jsonObject) throws JSONException {
        ScanMode scanModeValueOf;
        DigitalDocumentOptions digitalDocumentOptionsFromJson;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("part");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f13772a = JumioCredentialPart.valueOf(string);
        String string2 = jsonObject.getString("extraction");
        if (Intrinsics.areEqual(string2, "PDF")) {
            scanModeValueOf = ScanMode.FILE;
        } else {
            Intrinsics.checkNotNull(string2);
            scanModeValueOf = ScanMode.valueOf(string2);
        }
        this.f13773b = scanModeValueOf;
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("options");
        this.f13774c = (jSONObjectOptJSONObject == null || (digitalDocumentOptionsFromJson = DigitalDocumentOptions.INSTANCE.fromJson(jSONObjectOptJSONObject)) == null) ? new DigitalDocumentOptions(null, null, null, null, null, 31, null) : digitalDocumentOptionsFromJson;
    }

    @NotNull
    /* JADX INFO: renamed from: getExtraction, reason: from getter */
    public final ScanMode getF13773b() {
        return this.f13773b;
    }

    @NotNull
    /* JADX INFO: renamed from: getOptions, reason: from getter */
    public final DigitalDocumentOptions getF13774c() {
        return this.f13774c;
    }

    @NotNull
    /* JADX INFO: renamed from: getPart, reason: from getter */
    public final JumioCredentialPart getF13772a() {
        return this.f13772a;
    }
}
