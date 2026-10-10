package com.kubi.sdk.pkg.bundle.i18n;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnI18nModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPackageMeta;", "", "namespace", "", "projectId", "(Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Ljava/lang/String;", "getProjectId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class RnI18nPackageMeta {

    @Nullable
    private final String namespace;

    @SerializedName(alternate = {"projectId"}, value = "project_id")
    @Nullable
    private final String projectId;

    /* JADX WARN: Multi-variable type inference failed */
    public RnI18nPackageMeta() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnI18nPackageMeta)) {
            return false;
        }
        RnI18nPackageMeta rnI18nPackageMeta = (RnI18nPackageMeta) other;
        return Intrinsics.areEqual(this.namespace, rnI18nPackageMeta.namespace) && Intrinsics.areEqual(this.projectId, rnI18nPackageMeta.projectId);
    }

    public RnI18nPackageMeta(@Nullable String str, @Nullable String str2) {
        this.namespace = str;
        this.projectId = str2;
    }

    public static /* synthetic */ RnI18nPackageMeta copy$default(RnI18nPackageMeta rnI18nPackageMeta, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rnI18nPackageMeta.namespace;
        }
        if ((i11 & 2) != 0) {
            str2 = rnI18nPackageMeta.projectId;
        }
        return rnI18nPackageMeta.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final RnI18nPackageMeta copy(@Nullable String namespace, @Nullable String projectId) {
        return new RnI18nPackageMeta(namespace, projectId);
    }

    @Nullable
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        String str = this.namespace;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.projectId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RnI18nPackageMeta(namespace=" + this.namespace + ", projectId=" + this.projectId + ')';
    }

    public /* synthetic */ RnI18nPackageMeta(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
