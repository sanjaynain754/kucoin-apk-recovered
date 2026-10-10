.class public abstract Lcom/google/android/datatransport/EventContext$Builder;
.super Ljava/lang/Object;
.source "EventContext.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/datatransport/EventContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
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
.end method


# virtual methods
.method public abstract build()Lcom/google/android/datatransport/EventContext;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract setExperimentIdsClear([B)Lcom/google/android/datatransport/EventContext$Builder;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract setExperimentIdsEncrypted([B)Lcom/google/android/datatransport/EventContext$Builder;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract setPseudonymousId(Ljava/lang/String;)Lcom/google/android/datatransport/EventContext$Builder;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
