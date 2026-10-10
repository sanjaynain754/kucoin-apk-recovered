package com.jumio.core.models;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.util.Iterator;
import java.util.Locale;
import jumio.core.C40605V;
import jumio.core.C40625Z;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/CameraChallengeConfig$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/CameraChallengeConfig;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraChallengeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraChallengeModel.kt\ncom/jumio/core/models/CameraChallengeConfig$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n295#2,2:145\n*S KotlinDebug\n*F\n+ 1 CameraChallengeModel.kt\ncom/jumio/core/models/CameraChallengeConfig$Companion\n*L\n96#1:145,2\n*E\n"})
public final class CameraChallengeConfig$Companion {
    @NotNull
    public final C40605V fromJson(@NotNull JSONObject json) {
        JumioCredentialPart next;
        String strName;
        String upperCase;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = json.optString("side", "FRONT");
        boolean zOptBoolean = json.optBoolean("manualEnabled", true);
        boolean zOptBoolean2 = json.optBoolean("uploadImages", false);
        String strOptString2 = json.optString(DocumentClassifier.KEY_SIDE, "");
        CameraChallengePart$Companion cameraChallengePart$Companion = C40625Z.f90188f;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(JAnalysisConstants.TYPE_EXPOSURE);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        C40625Z c40625zFromJson = cameraChallengePart$Companion.fromJson(jSONObjectOptJSONObject, 0.5d, 0.2d);
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("focus");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        C40625Z c40625zFromJson2 = cameraChallengePart$Companion.fromJson(jSONObjectOptJSONObject2, 0.5d, 0.1d);
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("whiteBalance");
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject3 = new JSONObject();
        }
        C40625Z c40625zFromJson3 = cameraChallengePart$Companion.fromJson(jSONObjectOptJSONObject3, 0.35d, 0.15d);
        Iterator<JumioCredentialPart> it = JumioCredentialPart.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            strName = next.name();
            Intrinsics.checkNotNull(strOptString);
            upperCase = strOptString.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } while (!Intrinsics.areEqual(strName, upperCase));
        JumioCredentialPart jumioCredentialPart = next;
        if (jumioCredentialPart == null) {
            jumioCredentialPart = JumioCredentialPart.FRONT;
        }
        Intrinsics.checkNotNull(strOptString2);
        return new C40605V(jumioCredentialPart, zOptBoolean, zOptBoolean2, strOptString2, c40625zFromJson, c40625zFromJson2, c40625zFromJson3);
    }

    public CameraChallengeConfig$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
