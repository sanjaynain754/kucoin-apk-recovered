package com.jumio.sdk.scanpart;

import com.jumio.sdk.document.JumioDocumentInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/sdk/scanpart/JumioAddonScanPartConfiguration;", "", "documentInfo", "Lcom/jumio/sdk/document/JumioDocumentInfo;", "skippable", "", "<init>", "(Lcom/jumio/sdk/document/JumioDocumentInfo;Z)V", "getDocumentInfo", "()Lcom/jumio/sdk/document/JumioDocumentInfo;", "getSkippable", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioAddonScanPartConfiguration {

    /* JADX INFO: renamed from: a */
    public final JumioDocumentInfo f14744a;

    /* JADX INFO: renamed from: b */
    public final boolean f14745b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioAddonScanPartConfiguration)) {
            return false;
        }
        JumioAddonScanPartConfiguration jumioAddonScanPartConfiguration = (JumioAddonScanPartConfiguration) other;
        return Intrinsics.areEqual(this.f14744a, jumioAddonScanPartConfiguration.f14744a) && this.f14745b == jumioAddonScanPartConfiguration.f14745b;
    }

    public JumioAddonScanPartConfiguration(@NotNull JumioDocumentInfo documentInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(documentInfo, "documentInfo");
        this.f14744a = documentInfo;
        this.f14745b = z11;
    }

    public static /* synthetic */ JumioAddonScanPartConfiguration copy$default(JumioAddonScanPartConfiguration jumioAddonScanPartConfiguration, JumioDocumentInfo jumioDocumentInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jumioDocumentInfo = jumioAddonScanPartConfiguration.f14744a;
        }
        if ((i11 & 2) != 0) {
            z11 = jumioAddonScanPartConfiguration.f14745b;
        }
        return jumioAddonScanPartConfiguration.copy(jumioDocumentInfo, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JumioDocumentInfo getF14744a() {
        return this.f14744a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF14745b() {
        return this.f14745b;
    }

    @NotNull
    public final JumioAddonScanPartConfiguration copy(@NotNull JumioDocumentInfo documentInfo, boolean skippable) {
        Intrinsics.checkNotNullParameter(documentInfo, "documentInfo");
        return new JumioAddonScanPartConfiguration(documentInfo, skippable);
    }

    @NotNull
    public final JumioDocumentInfo getDocumentInfo() {
        return this.f14744a;
    }

    public final boolean getSkippable() {
        return this.f14745b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14745b) + (this.f14744a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "JumioAddonScanPartConfiguration(documentInfo=" + this.f14744a + ", skippable=" + this.f14745b + ')';
    }
}
