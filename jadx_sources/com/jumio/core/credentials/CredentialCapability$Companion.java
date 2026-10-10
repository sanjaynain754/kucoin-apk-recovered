package com.jumio.core.credentials;

import jumio.core.C40512C0;
import jumio.core.EnumC40517D0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/credentials/CredentialCapability$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/credentials/CredentialCapability;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CredentialCapability$Companion {
    @NotNull
    public final C40512C0 fromJson(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        EnumC40517D0 enumC40517D0FromString = EnumC40517D0.f89942a.fromString(jsonObject.optString("name"));
        String strOptString = jsonObject.optString("id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new C40512C0(enumC40517D0FromString, strOptString);
    }

    public CredentialCapability$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
