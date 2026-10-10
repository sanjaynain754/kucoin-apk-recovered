package com.jumio.core.models;

import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/models/DigitalSelectionModel;", "Lcom/jumio/core/models/SelectionModel;", "country", "Lcom/jumio/core/data/country/Country;", "digitalDocumentType", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "<init>", "(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;)V", "getDigitalDocumentType", "()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DigitalSelectionModel extends SelectionModel {

    /* JADX INFO: renamed from: b */
    public final DigitalDocumentType f14214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalSelectionModel(@NotNull Country country, @NotNull DigitalDocumentType digitalDocumentType) {
        super(country, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(digitalDocumentType, "digitalDocumentType");
        this.f14214b = digitalDocumentType;
    }

    @NotNull
    /* JADX INFO: renamed from: getDigitalDocumentType, reason: from getter */
    public final DigitalDocumentType getF14214b() {
        return this.f14214b;
    }
}
