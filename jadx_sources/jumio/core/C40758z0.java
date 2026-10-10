package jumio.core;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.document.DocumentPart;
import com.jumio.core.data.document.DocumentVariant;
import com.jumio.core.data.document.PhysicalDocumentType;
import com.jumio.core.models.CountryDocumentModel;
import com.jumio.core.models.DigitalSelectionModel;
import com.jumio.core.models.PhysicalSelectionModel;
import com.jumio.core.models.SelectionModel;
import com.jumio.sdk.document.JumioDigitalDocument;
import com.jumio.sdk.document.JumioDocument;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioDocumentVariant;
import com.jumio.sdk.document.JumioPhysicalDocument;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.z0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40758z0 implements InterfaceC40502A0, Serializable {

    /* JADX INFO: renamed from: a */
    public final CountryDocumentModel f90496a;

    /* JADX INFO: renamed from: b */
    public final String f90497b;

    /* JADX INFO: renamed from: c */
    public final C40584Q2 f90498c;

    /* JADX INFO: renamed from: d */
    public final List f90499d;

    /* JADX INFO: renamed from: e */
    public Country f90500e;

    /* JADX INFO: renamed from: f */
    public PhysicalDocumentType f90501f;

    /* JADX INFO: renamed from: g */
    public DocumentVariant f90502g;

    /* JADX INFO: renamed from: h */
    public DigitalDocumentType f90503h;

    /* JADX INFO: renamed from: i */
    public final boolean f90504i;

    /* JADX INFO: renamed from: a */
    public final Map m89274a() {
        HashMap map = new HashMap();
        for (Country country : this.f90499d) {
            ArrayList arrayListM89273a = m89273a(country);
            if (!arrayListM89273a.isEmpty()) {
                map.put(country.getF13765a(), Collections.unmodifiableList(arrayListM89273a));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public C40758z0(CountryDocumentModel countryModel, String countryForIp, C40532G0 credentialsDataModel, boolean z11) {
        List list;
        DocumentFormat documentFormat;
        JumioDocumentType jumioDocumentType;
        Pair pair;
        Intrinsics.checkNotNullParameter(countryModel, "countryModel");
        Intrinsics.checkNotNullParameter(countryForIp, "countryForIp");
        Intrinsics.checkNotNullParameter(credentialsDataModel, "credentialsDataModel");
        this.f90496a = countryModel;
        this.f90497b = countryForIp;
        ArrayList arrayList = credentialsDataModel.f89970i;
        this.f90498c = new C40584Q2(arrayList);
        List<Country> countriesFor = countryModel.f14196a.getCountriesFor(arrayList, null);
        ArrayList arrayList2 = credentialsDataModel.f89969h;
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : countriesFor) {
                if (credentialsDataModel.f89969h.contains(((Country) obj).getF13765a())) {
                    arrayList3.add(obj);
                }
            }
            countriesFor = arrayList3;
        }
        if (countriesFor.isEmpty()) {
            countriesFor = CollectionsKt.toMutableList((Collection) this.f90496a.f14196a.getCountries());
            this.f90498c.f90102b = false;
        }
        List listSorted = CollectionsKt.sorted(countriesFor);
        this.f90499d = listSorted;
        listSorted = (listSorted.size() != 1 || m89272a(((Country) CollectionsKt.first(listSorted)).getF13765a()) == null) ? null : listSorted;
        Country country = listSorted != null ? m89272a(((Country) CollectionsKt.first(listSorted)).getF13765a()) : null;
        if (country != null) {
            C40584Q2 c40584q2 = this.f90498c;
            ArrayList arrayList4 = c40584q2.f90102b ? c40584q2.f90101a : null;
            boolean z12 = arrayList4 == null || arrayList4.isEmpty();
            List listM89271a = m89271a(this, country);
            CountryDocumentModel countryDocumentModel = this.f90496a;
            countryDocumentModel.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            List<DigitalDocumentType> digitalDocumentTypes = countryDocumentModel.f14196a.getDigitalDocumentTypes(country);
            if (((ArrayList) listM89271a).size() > 1 || (z12 && !digitalDocumentTypes.isEmpty())) {
                pair = new Pair(null, null);
            } else {
                PhysicalDocumentType physicalDocumentType = (PhysicalDocumentType) CollectionsKt.first(listM89271a);
                DocumentVariant documentVariant = physicalDocumentType.getVariants().size() == 1 ? (DocumentVariant) CollectionsKt.first((List) physicalDocumentType.getVariants()) : null;
                if (!this.f90504i) {
                    Analytics.INSTANCE.add(MobileEvents.misc$default("skipDoctype", null, 2, null));
                    this.f90504i = true;
                }
                pair = new Pair(physicalDocumentType, documentVariant);
            }
            PhysicalDocumentType physicalDocumentType2 = (PhysicalDocumentType) pair.component1();
            DocumentVariant documentVariant2 = (DocumentVariant) pair.component2();
            this.f90501f = physicalDocumentType2;
            this.f90502g = documentVariant2;
        } else {
            country = null;
        }
        this.f90500e = country;
        if (z11) {
            if (m89274a().isEmpty()) {
                list = AbstractC40507B0.f89918e;
                documentFormat = AbstractC40507B0.f89919f;
                jumioDocumentType = AbstractC40507B0.f89917d;
            } else {
                Map mapM89274a = m89274a();
                if (!mapM89274a.isEmpty()) {
                    Iterator it = mapM89274a.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Iterable iterable = (Iterable) ((Map.Entry) it.next()).getValue();
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it2 = iterable.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        JumioPhysicalDocument jumioPhysicalDocument = (JumioPhysicalDocument) it2.next();
                                        if (jumioPhysicalDocument.getParts().size() != 1 || !jumioPhysicalDocument.getParts().contains(JumioCredentialPart.FRONT)) {
                                            list = AbstractC40507B0.f89918e;
                                            documentFormat = AbstractC40507B0.f89919f;
                                            jumioDocumentType = AbstractC40507B0.f89917d;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                list = AbstractC40507B0.f89915b;
                documentFormat = AbstractC40507B0.f89916c;
                jumioDocumentType = AbstractC40507B0.f89914a;
            }
            List listMutableListOf = CollectionsKt.mutableListOf(ScanMode.DOCFINDER, ScanMode.MANUAL);
            JumioDocumentVariant jumioDocumentVariant = AbstractC40507B0.f89920g;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new DocumentPart((JumioCredentialPart) it3.next(), listMutableListOf));
            }
            DocumentVariant documentVariant3 = new DocumentVariant(jumioDocumentVariant, arrayList5, documentFormat);
            this.f90502g = documentVariant3;
            this.f90501f = new PhysicalDocumentType(jumioDocumentType, CollectionsKt.listOf(documentVariant3));
            this.f90500e = new Country("USA", false, 2, null);
            if (!this.f90504i) {
                Analytics.INSTANCE.add(MobileEvents.misc$default("skipDoctype", null, 2, null));
                this.f90504i = true;
            }
        }
        String str = credentialsDataModel.f89972k;
        JumioDocument jumioDocument = credentialsDataModel.f89973l;
        if (str == null) {
            return;
        }
        if (jumioDocument instanceof JumioPhysicalDocument) {
            m89276a(str, (JumioPhysicalDocument) jumioDocument);
        } else if (jumioDocument instanceof JumioDigitalDocument) {
            m89275a(str, (JumioDigitalDocument) jumioDocument);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89279c() {
        if (this.f90500e != null) {
            return ((this.f90501f == null || this.f90502g == null) && this.f90503h == null) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final SelectionModel m89278b() {
        Country country;
        DocumentVariant documentVariant;
        if (!m89279c() || (country = this.f90500e) == null) {
            return null;
        }
        PhysicalDocumentType physicalDocumentType = this.f90501f;
        if (physicalDocumentType != null && (documentVariant = this.f90502g) != null) {
            return new PhysicalSelectionModel(country, physicalDocumentType, documentVariant);
        }
        DigitalDocumentType digitalDocumentType = this.f90503h;
        if (digitalDocumentType == null) {
            return null;
        }
        return new DigitalSelectionModel(country, digitalDocumentType);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89277a(String isoCode, JumioDocument document) {
        Object next;
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(document, "document");
        Country country = m89272a(isoCode);
        if (country == null) {
            return false;
        }
        if (document instanceof JumioPhysicalDocument) {
            JumioPhysicalDocument jumioPhysicalDocument = (JumioPhysicalDocument) document;
            Iterator it = ((ArrayList) m89271a(this, country)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((PhysicalDocumentType) next).getF13814a() != jumioPhysicalDocument.getType());
            PhysicalDocumentType physicalDocumentType = (PhysicalDocumentType) next;
            if (physicalDocumentType == null) {
                return false;
            }
            return physicalDocumentType.hasVariant(jumioPhysicalDocument.getVariant());
        }
        if (document instanceof JumioDigitalDocument) {
            JumioDigitalDocument jumioDigitalDocument = (JumioDigitalDocument) document;
            CountryDocumentModel countryDocumentModel = this.f90496a;
            countryDocumentModel.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            List<DigitalDocumentType> digitalDocumentTypes = countryDocumentModel.f14196a.getDigitalDocumentTypes(country);
            if (digitalDocumentTypes != null && digitalDocumentTypes.isEmpty()) {
                return false;
            }
            Iterator<T> it2 = digitalDocumentTypes.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((DigitalDocumentType) it2.next()).getF13775a(), jumioDigitalDocument.getType())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final Country m89272a(String str) {
        Object obj = null;
        if (str.length() == 0) {
            return null;
        }
        for (Object obj2 : this.f90499d) {
            if (Intrinsics.areEqual(((Country) obj2).getF13765a(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Country) obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m89275a(String isoCode, JumioDigitalDocument digitalDocument) {
        Object next;
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(digitalDocument, "digitalDocument");
        Country country = m89272a(isoCode);
        if (country != null) {
            this.f90500e = country;
            CountryDocumentModel countryDocumentModel = this.f90496a;
            countryDocumentModel.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Iterator<T> it = countryDocumentModel.f14196a.getDigitalDocumentTypes(country).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((DigitalDocumentType) next).getF13775a(), digitalDocument.getType()));
            DigitalDocumentType digitalDocumentType = (DigitalDocumentType) next;
            if (digitalDocumentType != null) {
                this.f90501f = null;
                this.f90502g = null;
                this.f90503h = digitalDocumentType;
                return;
            }
            throw new IllegalArgumentException("Unsupported digital document");
        }
        throw new IllegalArgumentException("Unsupported country code");
    }

    /* JADX INFO: renamed from: a */
    public final void m89276a(String isoCode, JumioPhysicalDocument document) {
        Object next;
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(document, "document");
        Country countryM89272a = m89272a(isoCode);
        if (countryM89272a != null) {
            this.f90500e = countryM89272a;
            Iterator it = ((ArrayList) m89271a(this, countryM89272a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((PhysicalDocumentType) next).getF13814a() != document.getType());
            PhysicalDocumentType physicalDocumentType = (PhysicalDocumentType) next;
            if (physicalDocumentType != null) {
                if (physicalDocumentType.hasVariant(document.getVariant())) {
                    this.f90503h = null;
                    this.f90501f = physicalDocumentType;
                    this.f90502g = physicalDocumentType.getVariant(document.getVariant());
                    return;
                }
                throw new IllegalArgumentException("Unsupported document variant");
            }
            throw new IllegalArgumentException("Unsupported document type");
        }
        throw new IllegalArgumentException("Unsupported country code");
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m89273a(Country country) {
        List listM89271a = m89271a(this, country);
        ArrayList arrayList = new ArrayList();
        for (PhysicalDocumentType physicalDocumentType : (ArrayList) listM89271a) {
            List<DocumentVariant> variants = physicalDocumentType.getVariants();
            ArrayList<DocumentVariant> arrayList2 = new ArrayList();
            for (Object obj : variants) {
                JumioDocumentVariant variant = ((DocumentVariant) obj).getF13809a();
                Intrinsics.checkNotNullParameter(variant, "variant");
                arrayList2.add(obj);
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (DocumentVariant documentVariant : arrayList2) {
                JumioDocumentType f13814a = physicalDocumentType.getF13814a();
                JumioDocumentVariant f13809a = documentVariant.getF13809a();
                List<DocumentPart> parts = documentVariant.getParts();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parts, 10));
                Iterator<T> it = parts.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((DocumentPart) it.next()).getF13807a());
                }
                arrayList3.add(new JumioPhysicalDocument(f13814a, f13809a, arrayList4));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static List m89271a(C40758z0 c40758z0, Country country) {
        CountryDocumentModel countryDocumentModel = c40758z0.f90496a;
        countryDocumentModel.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        List<PhysicalDocumentType> physicalDocumentTypes = countryDocumentModel.f14196a.getPhysicalDocumentTypes(country);
        ArrayList arrayList = new ArrayList();
        for (Object obj : physicalDocumentTypes) {
            C40584Q2 c40584q2 = c40758z0.f90498c;
            JumioDocumentType type = ((PhysicalDocumentType) obj).getF13814a();
            Intrinsics.checkNotNullParameter(type, "type");
            ArrayList arrayList2 = c40584q2.f90102b ? c40584q2.f90101a : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList arrayList3 = c40584q2.f90102b ? c40584q2.f90101a : null;
                if (arrayList3 == null || !arrayList3.contains(type)) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
