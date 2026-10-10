package com.jumio.core.models;

import com.jumio.core.data.country.Country;
import com.jumio.core.data.document.DocumentVariant;
import com.jumio.core.data.document.PhysicalDocumentType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/jumio/core/models/PhysicalSelectionModel;", "Lcom/jumio/core/models/SelectionModel;", "country", "Lcom/jumio/core/data/country/Country;", "physicalDocumentType", "Lcom/jumio/core/data/document/PhysicalDocumentType;", "variant", "Lcom/jumio/core/data/document/DocumentVariant;", "<init>", "(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/document/PhysicalDocumentType;Lcom/jumio/core/data/document/DocumentVariant;)V", "getPhysicalDocumentType", "()Lcom/jumio/core/data/document/PhysicalDocumentType;", "getVariant", "()Lcom/jumio/core/data/document/DocumentVariant;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PhysicalSelectionModel extends SelectionModel {

    /* JADX INFO: renamed from: b */
    public final PhysicalDocumentType f14302b;

    /* JADX INFO: renamed from: c */
    public final DocumentVariant f14303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhysicalSelectionModel(@NotNull Country country, @NotNull PhysicalDocumentType physicalDocumentType, @NotNull DocumentVariant variant) {
        super(country, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(physicalDocumentType, "physicalDocumentType");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f14302b = physicalDocumentType;
        this.f14303c = variant;
    }

    @NotNull
    /* JADX INFO: renamed from: getPhysicalDocumentType, reason: from getter */
    public final PhysicalDocumentType getF14302b() {
        return this.f14302b;
    }

    @NotNull
    /* JADX INFO: renamed from: getVariant, reason: from getter */
    public final DocumentVariant getF14303c() {
        return this.f14303c;
    }
}
