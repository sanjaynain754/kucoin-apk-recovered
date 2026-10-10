.class public abstract Lcom/google/android/datatransport/cct/internal/ComplianceData;
.super Ljava/lang/Object;
.source "ComplianceData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/cct/internal/ComplianceData$Builder;,
        Lcom/google/android/datatransport/cct/internal/ComplianceData$ProductIdOrigin;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static builder()Lcom/google/android/datatransport/cct/internal/ComplianceData$Builder;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/datatransport/cct/internal/AutoValue_ComplianceData$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/datatransport/cct/internal/AutoValue_ComplianceData$Builder;-><init>()V

    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public abstract getPrivacyContext()Lcom/google/android/datatransport/cct/internal/ExternalPrivacyContext;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract getProductIdOrigin()Lcom/google/android/datatransport/cct/internal/ComplianceData$ProductIdOrigin;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method
