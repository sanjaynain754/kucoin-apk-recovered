package com.jumio.core.models;

import com.jumio.core.JumioMrzData;
import com.jumio.core.enums.EMRTDStatus;
import com.jumio.core.model.StaticModel;
import java.util.Date;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0012\u0010&\u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R \u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u0004\u0018\u00010-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010#¨\u00062À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/models/MrtdDataModel;", "Lcom/jumio/core/model/StaticModel;", "placeOfBirth", "", "getPlaceOfBirth", "()Ljava/lang/String;", "issuingDate", "Ljava/util/Date;", "getIssuingDate", "()Ljava/util/Date;", "verificationStatus", "Lcom/jumio/core/enums/EMRTDStatus;", "getVerificationStatus", "()Lcom/jumio/core/enums/EMRTDStatus;", "mrzString", "getMrzString", "mrzFirstName", "getMrzFirstName", "mrzLastName", "getMrzLastName", "mrzPersonalNumber", "getMrzPersonalNumber", "mrzIdNumber", "getMrzIdNumber", "mrzIssuingCountry", "getMrzIssuingCountry", "mrzOriginatingCountry", "getMrzOriginatingCountry", "mrzData", "Lcom/jumio/core/JumioMrzData;", "getMrzData", "()Lcom/jumio/core/JumioMrzData;", "bacCheckResult", "", "getBacCheckResult", "()I", "dscCheckResult", "getDscCheckResult", "activeAuthResult", "getActiveAuthResult", "htCheckResults", "", "getHtCheckResults", "()Ljava/util/Map;", "encodedDataItems", "", "getEncodedDataItems", "()[I", "rootCertCheck", "getRootCertCheck", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface MrtdDataModel extends StaticModel {
    int getActiveAuthResult();

    int getBacCheckResult();

    int getDscCheckResult();

    @Nullable
    int[] getEncodedDataItems();

    @Nullable
    Map<String, Integer> getHtCheckResults();

    @Nullable
    Date getIssuingDate();

    @Nullable
    JumioMrzData getMrzData();

    @Nullable
    String getMrzFirstName();

    @Nullable
    String getMrzIdNumber();

    @Nullable
    String getMrzIssuingCountry();

    @Nullable
    String getMrzLastName();

    @Nullable
    String getMrzOriginatingCountry();

    @Nullable
    String getMrzPersonalNumber();

    @Nullable
    String getMrzString();

    @Nullable
    String getPlaceOfBirth();

    int getRootCertCheck();

    @NotNull
    EMRTDStatus getVerificationStatus();
}
