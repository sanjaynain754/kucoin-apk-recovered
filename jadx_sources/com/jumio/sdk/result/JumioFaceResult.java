package com.jumio.sdk.result;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioFaceResult;", "Lcom/jumio/sdk/result/JumioCredentialResult;", "Ljava/io/Serializable;", "passed", "", "<init>", "(Ljava/lang/Boolean;)V", "getPassed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/jumio/sdk/result/JumioFaceResult;", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioFaceResult extends JumioCredentialResult implements Serializable {

    /* JADX INFO: renamed from: c */
    public final Boolean f14711c;

    /* JADX WARN: Multi-variable type inference failed */
    public JumioFaceResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JumioFaceResult) && Intrinsics.areEqual(this.f14711c, ((JumioFaceResult) other).f14711c);
    }

    public /* synthetic */ JumioFaceResult(Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool);
    }

    public static /* synthetic */ JumioFaceResult copy$default(JumioFaceResult jumioFaceResult, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = jumioFaceResult.f14711c;
        }
        return jumioFaceResult.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getF14711c() {
        return this.f14711c;
    }

    @NotNull
    public final JumioFaceResult copy(@Nullable Boolean passed) {
        return new JumioFaceResult(passed);
    }

    @Nullable
    public final Boolean getPassed() {
        return this.f14711c;
    }

    public int hashCode() {
        Boolean bool = this.f14711c;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "JumioFaceResult(passed=" + this.f14711c + ')';
    }

    public JumioFaceResult(@Nullable Boolean bool) {
        this.f14711c = bool;
    }
}
