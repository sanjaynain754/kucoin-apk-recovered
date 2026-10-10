package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40653e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/core/models/NfcSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "nfcRetries", "", "nfcTimeout", "downloadNfcImage", "", "nfcMandatory", "readOnlyAllowed", "<init>", "(IIZZZ)V", "getNfcRetries", "()I", "getNfcTimeout", "getDownloadNfcImage", "()Z", "getNfcMandatory", "getReadOnlyAllowed", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("NfcSettingsModel")
public final /* data */ class NfcSettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f14289a;

    /* JADX INFO: renamed from: b */
    public final int f14290b;

    /* JADX INFO: renamed from: c */
    public final boolean f14291c;

    /* JADX INFO: renamed from: d */
    public final boolean f14292d;

    /* JADX INFO: renamed from: e */
    public final boolean f14293e;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/NfcSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/NfcSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final NfcSettingsModel fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("configurations");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("merchantSettings");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            return new NfcSettingsModel(jSONObjectOptJSONObject.optInt("nfcRetries", 1), jSONObjectOptJSONObject.optInt("nfcTimeout", 10000), jSONObjectOptJSONObject2.optBoolean("allowNfcImageExtraction", false), jSONObjectOptJSONObject2.optBoolean("nfcScanningMandatory", false), jSONObjectOptJSONObject2.optBoolean("nfcReadOnlyAllowed", false));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public NfcSettingsModel() {
        this(0, 0, false, false, false, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcSettingsModel)) {
            return false;
        }
        NfcSettingsModel nfcSettingsModel = (NfcSettingsModel) other;
        return this.f14289a == nfcSettingsModel.f14289a && this.f14290b == nfcSettingsModel.f14290b && this.f14291c == nfcSettingsModel.f14291c && this.f14292d == nfcSettingsModel.f14292d && this.f14293e == nfcSettingsModel.f14293e;
    }

    public NfcSettingsModel(int i11, int i12, boolean z11, boolean z12, boolean z13) {
        this.f14289a = i11;
        this.f14290b = i12;
        this.f14291c = z11;
        this.f14292d = z12;
        this.f14293e = z13;
    }

    public static /* synthetic */ NfcSettingsModel copy$default(NfcSettingsModel nfcSettingsModel, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = nfcSettingsModel.f14289a;
        }
        if ((i13 & 2) != 0) {
            i12 = nfcSettingsModel.f14290b;
        }
        if ((i13 & 4) != 0) {
            z11 = nfcSettingsModel.f14291c;
        }
        if ((i13 & 8) != 0) {
            z12 = nfcSettingsModel.f14292d;
        }
        if ((i13 & 16) != 0) {
            z13 = nfcSettingsModel.f14293e;
        }
        boolean z14 = z13;
        boolean z15 = z11;
        return nfcSettingsModel.copy(i11, i12, z15, z12, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF14289a() {
        return this.f14289a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF14290b() {
        return this.f14290b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getF14291c() {
        return this.f14291c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getF14292d() {
        return this.f14292d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getF14293e() {
        return this.f14293e;
    }

    @NotNull
    public final NfcSettingsModel copy(int nfcRetries, int nfcTimeout, boolean downloadNfcImage, boolean nfcMandatory, boolean readOnlyAllowed) {
        return new NfcSettingsModel(nfcRetries, nfcTimeout, downloadNfcImage, nfcMandatory, readOnlyAllowed);
    }

    public final boolean getDownloadNfcImage() {
        return this.f14291c;
    }

    public final boolean getNfcMandatory() {
        return this.f14292d;
    }

    public final int getNfcRetries() {
        return this.f14289a;
    }

    public final int getNfcTimeout() {
        return this.f14290b;
    }

    public final boolean getReadOnlyAllowed() {
        return this.f14293e;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14293e) + AbstractC40637b0.m89251a(this.f14292d, AbstractC40637b0.m89251a(this.f14291c, AbstractC40653e0.m89252a(this.f14290b, Integer.hashCode(this.f14289a) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "NfcSettingsModel(nfcRetries=" + this.f14289a + ", nfcTimeout=" + this.f14290b + ", downloadNfcImage=" + this.f14291c + ", nfcMandatory=" + this.f14292d + ", readOnlyAllowed=" + this.f14293e + ')';
    }

    public /* synthetic */ NfcSettingsModel(int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 : i11, (i13 & 2) != 0 ? 10000 : i12, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? false : z13);
    }
}
