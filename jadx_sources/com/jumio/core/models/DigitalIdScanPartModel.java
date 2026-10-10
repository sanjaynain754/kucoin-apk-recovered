package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentPart;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/jumio/core/models/DigitalIdScanPartModel;", "Lcom/jumio/core/models/ScanPartModel;", "mode", "Lcom/jumio/core/data/ScanMode;", "selectionModel", "Lcom/jumio/core/models/DigitalSelectionModel;", "<init>", "(Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/DigitalSelectionModel;)V", "getSelectionModel", "()Lcom/jumio/core/models/DigitalSelectionModel;", "country", "Lcom/jumio/core/data/country/Country;", "getCountry", "()Lcom/jumio/core/data/country/Country;", "documentType", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "getDocumentType", "()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "parts", "", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;", "getParts", "()Ljava/util/List;", "isComplete", "", "()Z", DbParams.KEY_CHANNEL_RESULT, "", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DigitalIdScanPartModel")
public final class DigitalIdScanPartModel extends ScanPartModel {

    /* JADX INFO: renamed from: l */
    public final DigitalSelectionModel f14208l;

    /* JADX INFO: renamed from: m */
    public final Country f14209m;

    /* JADX INFO: renamed from: n */
    public final DigitalDocumentType f14210n;

    /* JADX INFO: renamed from: o */
    public final List f14211o;

    /* JADX INFO: renamed from: p */
    public String f14212p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalIdScanPartModel(@NotNull ScanMode mode, @NotNull DigitalSelectionModel selectionModel) {
        super(JumioCredentialPart.DIGITAL, mode, null, 4, null);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(selectionModel, "selectionModel");
        this.f14208l = selectionModel;
        this.f14209m = selectionModel.getF14323a();
        this.f14210n = selectionModel.getF14214b();
        this.f14211o = selectionModel.getF14214b().getParts();
        this.f14212p = "";
    }

    @NotNull
    /* JADX INFO: renamed from: getCountry, reason: from getter */
    public final Country getF14209m() {
        return this.f14209m;
    }

    @NotNull
    /* JADX INFO: renamed from: getDocumentType, reason: from getter */
    public final DigitalDocumentType getF14210n() {
        return this.f14210n;
    }

    @NotNull
    public final List<DigitalDocumentPart> getParts() {
        return this.f14211o;
    }

    @NotNull
    /* JADX INFO: renamed from: getResult, reason: from getter */
    public final String getF14212p() {
        return this.f14212p;
    }

    @NotNull
    /* JADX INFO: renamed from: getSelectionModel, reason: from getter */
    public final DigitalSelectionModel getF14208l() {
        return this.f14208l;
    }

    public final void setResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f14212p = str;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public boolean isComplete() {
        if (getF14313b() != ScanMode.FILE || !getF14314c().getHasData()) {
            if (this.f14212p.length() > 0 && !StringsKt.isBlank(this.f14212p)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
