package com.jumio.core.extraction.barcode.model;

import com.jumio.commons.PersistWith;
import com.jumio.core.models.DocumentDataModel;
import com.jumio.core.models.ScanPartModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/model/BarcodeDataModel;", "Lcom/jumio/core/models/DocumentDataModel;", "<init>", "()V", "barcodes", "", "Lcom/jumio/core/extraction/barcode/model/Barcode;", "getBarcodes", "()Ljava/util/List;", "setBarcodes", "(Ljava/util/List;)V", "fillRequest", "", "request", "Lorg/json/JSONObject;", "scanPart", "Lcom/jumio/core/models/ScanPartModel;", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("BarcodeDataModel")
@SourceDebugExtension({"SMAP\nBarcodeDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeDataModel.kt\ncom/jumio/core/extraction/barcode/model/BarcodeDataModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1557#2:26\n1628#2,3:27\n*S KotlinDebug\n*F\n+ 1 BarcodeDataModel.kt\ncom/jumio/core/extraction/barcode/model/BarcodeDataModel\n*L\n22#1:26\n22#1:27,3\n*E\n"})
public final class BarcodeDataModel extends DocumentDataModel {

    @NotNull
    private List<Barcode> barcodes = new ArrayList();

    @Override // com.jumio.core.models.DocumentDataModel
    public void fillRequest(@NotNull JSONObject request, @NotNull ScanPartModel scanPart) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        super.fillRequest(request, scanPart);
        if (this.barcodes.isEmpty()) {
            return;
        }
        List<Barcode> list = this.barcodes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).toJson());
        }
        appendValue(request, "barcodes", new JSONArray((Collection) arrayList));
    }

    @NotNull
    public final List<Barcode> getBarcodes() {
        return this.barcodes;
    }

    public final void setBarcodes(@NotNull List<Barcode> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.barcodes = list;
    }
}
