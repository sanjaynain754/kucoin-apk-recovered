package com.kubi.kyc.protocol;

import androidx.credentials.provider.CredentialEntry;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedCertificationProtocolHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kyc/protocol/AdvancedCertificationResult;", "", "success", "", "code", "", "msg", "data", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getSuccess", "()Z", "getCode", "()Ljava/lang/String;", "getMsg", "getData", "()Ljava/util/Map;", "toProtocolMap", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AdvancedCertificationResult {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f31242e = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String msg;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final Map<String, Object> data;

    /* JADX INFO: compiled from: AdvancedCertificationProtocolHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/protocol/AdvancedCertificationResult$Companion;", "", "<init>", "()V", "success", "Lcom/kubi/kyc/protocol/AdvancedCertificationResult;", "data", "", "", "failure", "code", "msg", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AdvancedCertificationResult failure(@NotNull String code, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new AdvancedCertificationResult(false, code, msg, MapsKt.mapOf(TuplesKt.m90091to(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)));
        }

        @NotNull
        public final AdvancedCertificationResult success(@NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new AdvancedCertificationResult(true, "0", "", data);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedCertificationResult)) {
            return false;
        }
        AdvancedCertificationResult advancedCertificationResult = (AdvancedCertificationResult) other;
        return this.success == advancedCertificationResult.success && Intrinsics.areEqual(this.code, advancedCertificationResult.code) && Intrinsics.areEqual(this.msg, advancedCertificationResult.msg) && Intrinsics.areEqual(this.data, advancedCertificationResult.data);
    }

    public AdvancedCertificationResult(boolean z11, @NotNull String code, @NotNull String msg, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(data, "data");
        this.success = z11;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m36856a() {
        return MapsKt.linkedMapOf(TuplesKt.m90091to("success", Boolean.valueOf(this.success)), TuplesKt.m90091to("code", this.code), TuplesKt.m90091to("msg", this.msg), TuplesKt.m90091to("data", this.data));
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.success) * 31) + this.code.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdvancedCertificationResult(success=" + this.success + ", code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ')';
    }
}
