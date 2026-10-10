package com.jumio.core.models.automation;

import com.jumio.core.enums.NfcStandard;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/models/automation/NfcProperties;", "Ljava/io/Serializable;", "hasNfc", "", "nfcStandard", "Lcom/jumio/core/enums/NfcStandard;", "<init>", "(ZLcom/jumio/core/enums/NfcStandard;)V", "getHasNfc", "()Z", "getNfcStandard", "()Lcom/jumio/core/enums/NfcStandard;", "available", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NfcProperties implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final boolean f14399a;

    /* JADX INFO: renamed from: b */
    public final NfcStandard f14400b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/automation/NfcProperties$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/automation/NfcProperties;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final NfcProperties fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            boolean zOptBoolean = jsonObject.optBoolean("hasNfc");
            NfcStandard.Companion companion = NfcStandard.INSTANCE;
            String strOptString = jsonObject.optString("nfcStandard");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new NfcProperties(zOptBoolean, companion.fromString(strOptString));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NfcProperties() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcProperties)) {
            return false;
        }
        NfcProperties nfcProperties = (NfcProperties) other;
        return this.f14399a == nfcProperties.f14399a && this.f14400b == nfcProperties.f14400b;
    }

    public NfcProperties(boolean z11, @NotNull NfcStandard nfcStandard) {
        Intrinsics.checkNotNullParameter(nfcStandard, "nfcStandard");
        this.f14399a = z11;
        this.f14400b = nfcStandard;
    }

    public static /* synthetic */ NfcProperties copy$default(NfcProperties nfcProperties, boolean z11, NfcStandard nfcStandard, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = nfcProperties.f14399a;
        }
        if ((i11 & 2) != 0) {
            nfcStandard = nfcProperties.f14400b;
        }
        return nfcProperties.copy(z11, nfcStandard);
    }

    public final boolean available() {
        return this.f14399a && this.f14400b != NfcStandard.UNDEFINED;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getF14399a() {
        return this.f14399a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NfcStandard getF14400b() {
        return this.f14400b;
    }

    @NotNull
    public final NfcProperties copy(boolean hasNfc, @NotNull NfcStandard nfcStandard) {
        Intrinsics.checkNotNullParameter(nfcStandard, "nfcStandard");
        return new NfcProperties(hasNfc, nfcStandard);
    }

    public final boolean getHasNfc() {
        return this.f14399a;
    }

    @NotNull
    public final NfcStandard getNfcStandard() {
        return this.f14400b;
    }

    public int hashCode() {
        return this.f14400b.hashCode() + (Boolean.hashCode(this.f14399a) * 31);
    }

    @NotNull
    public String toString() {
        return "NfcProperties(hasNfc=" + this.f14399a + ", nfcStandard=" + this.f14400b + ')';
    }

    public /* synthetic */ NfcProperties(boolean z11, NfcStandard nfcStandard, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? NfcStandard.UNDEFINED : nfcStandard);
    }
}
