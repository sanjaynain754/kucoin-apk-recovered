.class public final Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;
.super Lcom/jumio/core/extraction/ExtractionUpdateState;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;",
        "Lcom/jumio/core/extraction/ExtractionUpdateState;",
        "<init>",
        "()V",
        "validCorners",
        "",
        "getValidCorners",
        "()I",
        "invalidCorners",
        "getInvalidCorners",
        "jumio-docfinder_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final v:I

.field public static final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    .line 8
    .line 9
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    move-result v1

    .line 18
    .line 19
    sput v1, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->v:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 27
    move-result v0

    .line 28
    .line 29
    sput v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->w:I

    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/extraction/ExtractionUpdateState;-><init>()V

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
.end method


# virtual methods
.method public final getInvalidCorners()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->w:I

    .line 3
    return v0
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
.end method

.method public final getValidCorners()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->v:I

    .line 3
    return v0
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
.end method
