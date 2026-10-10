.class public final Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter;
.super Lt5/a;
.source "ProducerToDataSourceAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lt5/a<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u000b*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000cB\'\u0008\u0002\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter;",
        "T",
        "Lt5/a;",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "producer",
        "Lcom/facebook/imagepipeline/producers/c1;",
        "settableProducerContext",
        "Lz5/c;",
        "listener",
        "<init>",
        "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V",
        "j",
        "Companion",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final j:Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter;->j:Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;

    .line 9
    return-void
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

.method public constructor <init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/c1;",
            "Lz5/c;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lt5/a;-><init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter;-><init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V

    return-void
.end method
