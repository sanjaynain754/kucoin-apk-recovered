.class public Lcom/google/firebase/remoteconfig/CustomSignals;
.super Ljava/lang/Object;
.source "CustomSignals.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/remoteconfig/CustomSignals$Builder;
    }
.end annotation


# instance fields
.field final customSignals:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/remoteconfig/CustomSignals$Builder;)V
    .locals 0
    .param p1    # Lcom/google/firebase/remoteconfig/CustomSignals$Builder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/firebase/remoteconfig/CustomSignals$Builder;->access$000(Lcom/google/firebase/remoteconfig/CustomSignals$Builder;)Ljava/util/Map;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/firebase/remoteconfig/CustomSignals;->customSignals:Ljava/util/Map;

    .line 10
    return-void
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
    .line 24
.end method
