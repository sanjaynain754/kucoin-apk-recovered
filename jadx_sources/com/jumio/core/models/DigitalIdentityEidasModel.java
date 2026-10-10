package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/models/DigitalIdentityEidasModel;", "Lcom/jumio/core/model/StaticModel;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DigitalIdentityEidasModel")
public final /* data */ class DigitalIdentityEidasModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14213a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/DigitalIdentityEidasModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/DigitalIdentityEidasModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final DigitalIdentityEidasModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("url", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new DigitalIdentityEidasModel(strOptString);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DigitalIdentityEidasModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DigitalIdentityEidasModel) && Intrinsics.areEqual(this.f14213a, ((DigitalIdentityEidasModel) other).f14213a);
    }

    public DigitalIdentityEidasModel(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f14213a = url;
    }

    public static /* synthetic */ DigitalIdentityEidasModel copy$default(DigitalIdentityEidasModel digitalIdentityEidasModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = digitalIdentityEidasModel.f14213a;
        }
        return digitalIdentityEidasModel.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14213a() {
        return this.f14213a;
    }

    @NotNull
    public final DigitalIdentityEidasModel copy(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new DigitalIdentityEidasModel(url);
    }

    @NotNull
    public final String getUrl() {
        return this.f14213a;
    }

    public int hashCode() {
        return this.f14213a.hashCode();
    }

    @NotNull
    public String toString() {
        return "DigitalIdentityEidasModel(url=" + this.f14213a + ')';
    }

    public /* synthetic */ DigitalIdentityEidasModel(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
