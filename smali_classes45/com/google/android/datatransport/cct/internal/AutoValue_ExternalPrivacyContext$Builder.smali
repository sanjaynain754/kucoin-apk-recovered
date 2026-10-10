.class final Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext$Builder;
.super Lcom/google/android/datatransport/cct/internal/ExternalPrivacyContext$Builder;
.source "AutoValue_ExternalPrivacyContext.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private prequest:Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/datatransport/cct/internal/ExternalPrivacyContext$Builder;-><init>()V

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
.end method


# virtual methods
.method public build()Lcom/google/android/datatransport/cct/internal/ExternalPrivacyContext;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext$Builder;->prequest:Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext;-><init>(Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext$1;)V

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public setPrequest(Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;)Lcom/google/android/datatransport/cct/internal/ExternalPrivacyContext$Builder;
    .locals 0
    .param p1    # Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ExternalPrivacyContext$Builder;->prequest:Lcom/google/android/datatransport/cct/internal/ExternalPRequestContext;

    .line 3
    return-object p0
    .line 4
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
    .line 23
.end method
