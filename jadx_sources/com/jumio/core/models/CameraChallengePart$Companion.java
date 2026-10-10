package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import jumio.core.C40625Z;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/models/CameraChallengePart$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/CameraChallengePart;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "defaultSetupThreshold", "", "defaultCoolDownThreshold", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CameraChallengePart$Companion {
    public static /* synthetic */ C40625Z fromJson$default(CameraChallengePart$Companion cameraChallengePart$Companion, JSONObject jSONObject, double d11, double d12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d11 = 0.0d;
        }
        if ((i11 & 4) != 0) {
            d12 = 0.0d;
        }
        return cameraChallengePart$Companion.fromJson(jSONObject, d11, d12);
    }

    @NotNull
    public final C40625Z fromJson(@NotNull JSONObject json, double d11, double d12) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new C40625Z(json.optInt("min", 0), json.optInt("max", 0), (float) json.optDouble("setupThreshold", d11), (float) json.optDouble("coolDownThreshold", d12), json.optLong("holdStillTime", 0L));
    }

    public CameraChallengePart$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
