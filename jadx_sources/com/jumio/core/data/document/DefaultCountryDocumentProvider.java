package com.jumio.core.data.document;

import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.core.data.document.DefaultCountryDocumentProvider;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioDocumentVariant;
import com.jumio.sdk.util.IsoCountryConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020$H\u0016J\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bH\u0096\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m90084d2 = {"Lcom/jumio/core/data/document/DefaultCountryDocumentProvider;", "Lcom/jumio/core/data/document/CountryDocumentProviderInterface;", "Ljava/io/Serializable;", "supportedCountries", "Lorg/json/JSONArray;", "localize", "", "<init>", "(Lorg/json/JSONArray;Z)V", "documentsForCountry", "", "Lcom/jumio/core/data/country/Country;", "Lcom/jumio/core/data/document/DocumentWrapper;", "isEmpty", "()Z", "countries", "", "getCountries", "()Ljava/util/List;", "initDocuments", "", "country", "physicalDocuments", "Lcom/jumio/core/data/document/PhysicalDocumentType;", "digitalDocuments", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "clear", "getDigitalDocumentTypes", "getPhysicalDocumentTypes", "getCountriesFor", "documentTypes", "Lcom/jumio/sdk/document/JumioDocumentType;", "documentVariant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "getCountryForIso3", "iso3", "", "getCountryForIso2", "iso2", "contains", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCountryDocumentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCountryDocumentProvider.kt\ncom/jumio/core/data/document/DefaultCountryDocumentProvider\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n535#2:99\n520#2,2:100\n522#2,4:105\n1755#3,3:102\n295#3,2:109\n295#3,2:111\n*S KotlinDebug\n*F\n+ 1 DefaultCountryDocumentProvider.kt\ncom/jumio/core/data/document/DefaultCountryDocumentProvider\n*L\n84#1:99\n84#1:100,2\n84#1:105,4\n85#1:102,3\n91#1:109,2\n94#1:111,2\n*E\n"})
public final class DefaultCountryDocumentProvider implements CountryDocumentProviderInterface, Serializable {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f13794a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultCountryDocumentProvider() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14523a(boolean z11, DefaultCountryDocumentProvider defaultCountryDocumentProvider, JSONObject jsonCountry) throws JSONException {
        List<DigitalDocumentType> arrayList;
        Intrinsics.checkNotNullParameter(jsonCountry, "jsonCountry");
        String string = jsonCountry.getString("country");
        Intrinsics.checkNotNull(string);
        Country country = new Country(string, z11);
        if (StringsKt.equals(country.getF13766b(), IsoCountryConverter.convertToAlpha2(string), true)) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jsonCountry.optJSONArray("idTypes");
        if (jSONArrayOptJSONArray != null) {
            arrayList2.addAll(JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: m9.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultCountryDocumentProvider.m14522a((JSONObject) obj);
                }
            }));
        } else {
            JSONObject jSONObject = jsonCountry.getJSONObject("idTypes");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList2.add(new PhysicalDocumentType(jSONObject));
        }
        JSONArray jSONArrayOptJSONArray2 = jsonCountry.optJSONArray("digitalIdentityTypes");
        if (jSONArrayOptJSONArray2 == null || (arrayList = JsonUtilKt.map(jSONArrayOptJSONArray2, new Function1() { // from class: m9.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCountryDocumentProvider.m14524b((JSONObject) obj);
            }
        })) == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        CollectionsKt.sort(arrayList2);
        CollectionsKt.sort(arrayList);
        defaultCountryDocumentProvider.initDocuments(country, arrayList2, arrayList);
        return Unit.INSTANCE;
    }

    public DefaultCountryDocumentProvider(@NotNull JSONArray supportedCountries, final boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        this.f13794a = new LinkedHashMap();
        JsonUtilKt.forEach(supportedCountries, new Function1() { // from class: m9.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCountryDocumentProvider.m14523a(z11, this, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final DigitalDocumentType m14524b(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DigitalDocumentType(it);
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    public void clear() {
        this.f13794a.clear();
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    public boolean contains(@NotNull Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return this.f13794a.containsKey(getCountryForIso3(country.getF13765a()));
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @NotNull
    public List<Country> getCountries() {
        return CollectionsKt.toList(this.f13794a.keySet());
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @NotNull
    public List<Country> getCountriesFor(@Nullable List<? extends JumioDocumentType> documentTypes, @Nullable JumioDocumentVariant documentVariant) {
        LinkedHashMap linkedHashMap = this.f13794a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List<PhysicalDocumentType> physicalDocuments = ((DocumentWrapper) entry.getValue()).getPhysicalDocuments();
            if (physicalDocuments == null || !physicalDocuments.isEmpty()) {
                for (PhysicalDocumentType physicalDocumentType : physicalDocuments) {
                    if ((documentTypes != null && documentTypes.contains(physicalDocumentType.getF13814a())) || documentTypes == null) {
                        if ((documentVariant != null && physicalDocumentType.hasVariant(documentVariant)) || documentVariant == null) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    }
                }
            }
        }
        return CollectionsKt.toList(linkedHashMap2.keySet());
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @Nullable
    public Country getCountryForIso2(@NotNull String iso2) {
        Object next;
        Intrinsics.checkNotNullParameter(iso2, "iso2");
        Iterator it = this.f13794a.keySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(IsoCountryConverter.convertToAlpha2(((Country) next).getF13765a()), iso2)) {
                return (Country) next;
            }
        }
        next = null;
        return (Country) next;
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @Nullable
    public Country getCountryForIso3(@NotNull String iso3) {
        Object next;
        Intrinsics.checkNotNullParameter(iso3, "iso3");
        Iterator it = this.f13794a.keySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getF13765a(), iso3)) {
                return (Country) next;
            }
        }
        next = null;
        return (Country) next;
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @NotNull
    public List<DigitalDocumentType> getDigitalDocumentTypes(@NotNull Country country) {
        List<DigitalDocumentType> digitalDocuments;
        Intrinsics.checkNotNullParameter(country, "country");
        DocumentWrapper documentWrapper = (DocumentWrapper) this.f13794a.get(getCountryForIso3(country.getF13765a()));
        return (documentWrapper == null || (digitalDocuments = documentWrapper.getDigitalDocuments()) == null) ? CollectionsKt.emptyList() : digitalDocuments;
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    @NotNull
    public List<PhysicalDocumentType> getPhysicalDocumentTypes(@NotNull Country country) {
        List<PhysicalDocumentType> physicalDocuments;
        Intrinsics.checkNotNullParameter(country, "country");
        DocumentWrapper documentWrapper = (DocumentWrapper) this.f13794a.get(getCountryForIso3(country.getF13765a()));
        return (documentWrapper == null || (physicalDocuments = documentWrapper.getPhysicalDocuments()) == null) ? CollectionsKt.emptyList() : physicalDocuments;
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    public void initDocuments(@NotNull Country country, @NotNull List<PhysicalDocumentType> physicalDocuments, @NotNull List<DigitalDocumentType> digitalDocuments) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(physicalDocuments, "physicalDocuments");
        Intrinsics.checkNotNullParameter(digitalDocuments, "digitalDocuments");
        this.f13794a.put(country, new DocumentWrapper(CollectionsKt.toList(physicalDocuments), CollectionsKt.toList(digitalDocuments)));
    }

    @Override // com.jumio.core.data.document.CountryDocumentProviderInterface
    public boolean isEmpty() {
        return this.f13794a.isEmpty();
    }

    public /* synthetic */ DefaultCountryDocumentProvider(JSONArray jSONArray, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new JSONArray() : jSONArray, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: a */
    public static final PhysicalDocumentType m14522a(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PhysicalDocumentType(it);
    }
}
