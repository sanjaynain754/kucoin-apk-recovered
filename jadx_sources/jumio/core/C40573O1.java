package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.DocumentPart;
import com.jumio.core.models.CameraChallengeModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.PhysicalSelectionModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.SupplementalImageConfig;
import com.jumio.core.models.SupplementalImageModel;
import com.jumio.sdk.document.JumioDigitalDocument;
import com.jumio.sdk.document.JumioDocument;
import com.jumio.sdk.document.JumioPhysicalDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.O1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40573O1 implements InterfaceC40578P1 {

    /* JADX INFO: renamed from: a */
    public final Controller f90063a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC40502A0 f90064b;

    /* JADX INFO: renamed from: c */
    public final C40532G0 f90065c;

    /* JADX INFO: renamed from: a */
    public final void m89206a(String country, JumioDocument document) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(document, "document");
        if (((C40758z0) this.f90064b).m89277a(country, document)) {
            if (document instanceof JumioPhysicalDocument) {
                ((C40758z0) this.f90064b).m89276a(country, (JumioPhysicalDocument) document);
            } else if (document instanceof JumioDigitalDocument) {
                ((C40758z0) this.f90064b).m89275a(country, (JumioDigitalDocument) document);
            }
            C40532G0 c40532g0 = this.f90065c;
            c40532g0.f89972k = country;
            c40532g0.f89973l = document;
        }
    }

    public C40573O1(Controller controller, InterfaceC40502A0 countrySelection, C40532G0 data) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(countrySelection, "countrySelection");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f90063a = controller;
        this.f90064b = countrySelection;
        this.f90065c = data;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public final PhysicalIdScanPartModel m89205a(DocumentPart documentPart, PhysicalSelectionModel physicalSelectionModel) {
        ?? extraction;
        Map mapEmptyMap;
        Object next;
        C40610W c40610w;
        if (((SettingsModel) this.f90063a.getF13603d().get(SettingsModel.class)).getAutomaticBarcodeExtraction() && documentPart.getExtraction().contains(ScanMode.DOCFINDER) && this.f90063a.getF13605f().hasPlugin(EnumC40613W2.DOCFINDER)) {
            List<ScanMode> extraction2 = documentPart.getExtraction();
            extraction = new ArrayList();
            for (Object obj : extraction2) {
                if (((ScanMode) obj) != ScanMode.PDF417) {
                    extraction.add(obj);
                }
            }
        } else {
            extraction = documentPart.getExtraction();
        }
        ?? r11 = extraction;
        if (((SettingsModel) this.f90063a.getF13603d().get(SettingsModel.class)).getAutomaticBarcodeExtraction()) {
            List<ScanMode> extraction3 = documentPart.getExtraction();
            ScanMode scanMode = ScanMode.DOCFINDER;
            if (extraction3.contains(scanMode) && this.f90063a.getF13605f().hasPlugin(EnumC40613W2.DOCFINDER)) {
                mapEmptyMap = MapsKt.mapOf(TuplesKt.m90091to(scanMode, ScanMode.PDF417));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map map = mapEmptyMap;
        List<SupplementalImageConfig> imageConfigs = ((SupplementalImageModel) this.f90063a.getF13603d().get(SupplementalImageModel.class)).getImageConfigs();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : imageConfigs) {
            String side = ((SupplementalImageConfig) obj2).getSide();
            Locale locale = Locale.ROOT;
            String lowerCase = side.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = documentPart.getF13807a().name().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = ((CameraChallengeModel) this.f90063a.getF13603d().get(CameraChallengeModel.class)).f14191a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C40605V) next).f90132a != documentPart.getF13807a());
        C40605V c40605v = (C40605V) next;
        if (c40605v != null) {
            String id2 = this.f90065c.f14197a;
            Intrinsics.checkNotNullParameter(id2, "id");
            c40610w = AbstractC40620Y.m89248a(c40605v, id2);
        } else {
            c40610w = new C40610W();
        }
        return new PhysicalIdScanPartModel(documentPart.getF13807a(), (ScanMode) r11.get(0), physicalSelectionModel, r11, map, arrayList, c40610w);
    }
}
