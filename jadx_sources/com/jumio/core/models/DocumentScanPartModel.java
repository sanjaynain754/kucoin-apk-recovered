package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.Document;
import com.jumio.core.data.scan.FileData;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.sdk.enums.JumioCredentialPart;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/models/DocumentScanPartModel;", "Lcom/jumio/core/models/ScanPartModel;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "mode", "Lcom/jumio/core/data/ScanMode;", "country", "", "type", "Lcom/jumio/core/data/document/Document;", "fileData", "Lcom/jumio/core/data/scan/FileDataInterface;", "<init>", "(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;Lcom/jumio/core/data/document/Document;Lcom/jumio/core/data/scan/FileDataInterface;)V", "getCountry", "()Ljava/lang/String;", "getType", "()Lcom/jumio/core/data/document/Document;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DocumentScanPartModel")
public final class DocumentScanPartModel extends ScanPartModel {

    /* JADX INFO: renamed from: l */
    public final String f14240l;

    /* JADX INFO: renamed from: m */
    public final Document f14241m;

    public /* synthetic */ DocumentScanPartModel(JumioCredentialPart jumioCredentialPart, ScanMode scanMode, String str, Document document, FileDataInterface fileDataInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jumioCredentialPart, scanMode, str, document, (i11 & 16) != 0 ? new FileData() : fileDataInterface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanPartModel(@NotNull JumioCredentialPart credentialPart, @NotNull ScanMode mode, @NotNull String country, @NotNull Document type, @NotNull FileDataInterface fileData) {
        super(credentialPart, mode, fileData);
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        this.f14240l = country;
        this.f14241m = type;
    }
}
