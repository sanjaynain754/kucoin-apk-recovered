.class public interface abstract Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "",
        "onUpdate",
        "",
        "jumioScanUpdate",
        "Lcom/jumio/sdk/enums/JumioScanUpdate;",
        "data",
        "onScanStep",
        "jumioScanStep",
        "Lcom/jumio/sdk/enums/JumioScanStep;",
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
.method public abstract onScanStep(Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;)V
    .param p1    # Lcom/jumio/sdk/enums/JumioScanStep;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onUpdate(Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;)V
    .param p1    # Lcom/jumio/sdk/enums/JumioScanUpdate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method
