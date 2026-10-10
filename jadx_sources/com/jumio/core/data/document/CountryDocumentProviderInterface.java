package com.jumio.core.data.document;

import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioDocumentVariant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&J\b\u0010\u0011\u001a\u00020\u000bH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\f\u001a\u00020\u0007H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\f\u001a\u00020\u0007H&J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001bH&J\u0011\u0010\u001e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H¦\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/data/document/CountryDocumentProviderInterface;", "", "isEmpty", "", "()Z", "countries", "", "Lcom/jumio/core/data/country/Country;", "getCountries", "()Ljava/util/List;", "initDocuments", "", "country", "physicalDocuments", "Lcom/jumio/core/data/document/PhysicalDocumentType;", "digitalDocuments", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "clear", "getDigitalDocumentTypes", "getPhysicalDocumentTypes", "getCountriesFor", "documentTypes", "Lcom/jumio/sdk/document/JumioDocumentType;", "documentVariant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "getCountryForIso3", "iso3", "", "getCountryForIso2", "iso2", "contains", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CountryDocumentProviderInterface {
    void clear();

    boolean contains(@NotNull Country country);

    @NotNull
    List<Country> getCountries();

    @NotNull
    List<Country> getCountriesFor(@Nullable List<? extends JumioDocumentType> documentTypes, @Nullable JumioDocumentVariant documentVariant);

    @Nullable
    Country getCountryForIso2(@NotNull String iso2);

    @Nullable
    Country getCountryForIso3(@NotNull String iso3);

    @NotNull
    List<DigitalDocumentType> getDigitalDocumentTypes(@NotNull Country country);

    @NotNull
    List<PhysicalDocumentType> getPhysicalDocumentTypes(@NotNull Country country);

    void initDocuments(@NotNull Country country, @NotNull List<PhysicalDocumentType> physicalDocuments, @NotNull List<DigitalDocumentType> digitalDocuments);

    boolean isEmpty();
}
