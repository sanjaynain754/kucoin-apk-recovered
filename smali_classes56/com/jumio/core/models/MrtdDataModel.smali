.class public interface abstract Lcom/jumio/core/models/MrtdDataModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0012\u0010$\u001a\u00020!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010#R\u0012\u0010&\u001a\u00020!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010#R \u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010)X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0014\u0010,\u001a\u0004\u0018\u00010-X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0012\u00100\u001a\u00020!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010#\u00a8\u00062\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/models/MrtdDataModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "placeOfBirth",
        "",
        "getPlaceOfBirth",
        "()Ljava/lang/String;",
        "issuingDate",
        "Ljava/util/Date;",
        "getIssuingDate",
        "()Ljava/util/Date;",
        "verificationStatus",
        "Lcom/jumio/core/enums/EMRTDStatus;",
        "getVerificationStatus",
        "()Lcom/jumio/core/enums/EMRTDStatus;",
        "mrzString",
        "getMrzString",
        "mrzFirstName",
        "getMrzFirstName",
        "mrzLastName",
        "getMrzLastName",
        "mrzPersonalNumber",
        "getMrzPersonalNumber",
        "mrzIdNumber",
        "getMrzIdNumber",
        "mrzIssuingCountry",
        "getMrzIssuingCountry",
        "mrzOriginatingCountry",
        "getMrzOriginatingCountry",
        "mrzData",
        "Lcom/jumio/core/JumioMrzData;",
        "getMrzData",
        "()Lcom/jumio/core/JumioMrzData;",
        "bacCheckResult",
        "",
        "getBacCheckResult",
        "()I",
        "dscCheckResult",
        "getDscCheckResult",
        "activeAuthResult",
        "getActiveAuthResult",
        "htCheckResults",
        "",
        "getHtCheckResults",
        "()Ljava/util/Map;",
        "encodedDataItems",
        "",
        "getEncodedDataItems",
        "()[I",
        "rootCertCheck",
        "getRootCertCheck",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getActiveAuthResult()I
.end method

.method public abstract getBacCheckResult()I
.end method

.method public abstract getDscCheckResult()I
.end method

.method public abstract getEncodedDataItems()[I
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getHtCheckResults()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getIssuingDate()Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzData()Lcom/jumio/core/JumioMrzData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzFirstName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzIdNumber()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzIssuingCountry()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzLastName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzOriginatingCountry()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzPersonalNumber()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMrzString()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getPlaceOfBirth()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getRootCertCheck()I
.end method

.method public abstract getVerificationStatus()Lcom/jumio/core/enums/EMRTDStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
