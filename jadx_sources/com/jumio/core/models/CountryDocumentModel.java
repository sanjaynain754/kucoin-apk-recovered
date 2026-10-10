package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.document.CountryDocumentProviderInterface;
import com.jumio.core.data.document.DefaultCountryDocumentProvider;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0010\u001a\u00020\bJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0010\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0086\u0002J\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0015HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006&"}, m90084d2 = {"Lcom/jumio/core/models/CountryDocumentModel;", "Lcom/jumio/core/model/StaticModel;", "countryDocumentProvider", "Lcom/jumio/core/data/document/CountryDocumentProviderInterface;", "<init>", "(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;)V", "countries", "", "Lcom/jumio/core/data/country/Country;", "getCountries", "()Ljava/util/List;", "isEmpty", "", "()Z", "getDigitalDocumentTypesFor", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "country", "getPhysicalDocumentTypesFor", "Lcom/jumio/core/data/document/PhysicalDocumentType;", "getPhysicalDocumentTypeFor", "iso3", "", "jumioDocumentType", "Lcom/jumio/sdk/document/JumioDocumentType;", "getCountriesFor", "supportedDocumentTypes", "restrictVariant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "getCountryForIso3", "contains", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CountryDocumentModel")
public final /* data */ class CountryDocumentModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final CountryDocumentProviderInterface f14196a;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryDocumentModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CountryDocumentModel) && Intrinsics.areEqual(this.f14196a, ((CountryDocumentModel) other).f14196a);
    }

    public CountryDocumentModel(@NotNull CountryDocumentProviderInterface countryDocumentProvider) {
        Intrinsics.checkNotNullParameter(countryDocumentProvider, "countryDocumentProvider");
        this.f14196a = countryDocumentProvider;
    }

    public final int hashCode() {
        return this.f14196a.hashCode();
    }

    public final String toString() {
        return "CountryDocumentModel(countryDocumentProvider=" + this.f14196a + ')';
    }

    public /* synthetic */ CountryDocumentModel(CountryDocumentProviderInterface countryDocumentProviderInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new DefaultCountryDocumentProvider(null, false, 3, null) : countryDocumentProviderInterface);
    }
}
