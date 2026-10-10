.class final Lshark/HeapAnalyzer$updateTrie$childNode$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HeapAnalyzer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/HeapAnalyzer;->q(Lshark/internal/j;Ljava/util/List;ILshark/HeapAnalyzer$e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lshark/HeapAnalyzer$e$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lshark/HeapAnalyzer$e$b;",
        "invoke",
        "()Lshark/HeapAnalyzer$e$b;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $objectId:J

.field final synthetic $parentNode:Lshark/HeapAnalyzer$e$b;


# direct methods
.method public constructor <init>(JLshark/HeapAnalyzer$e$b;)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lshark/HeapAnalyzer$updateTrie$childNode$1;->$objectId:J

    .line 3
    .line 4
    iput-object p3, p0, Lshark/HeapAnalyzer$updateTrie$childNode$1;->$parentNode:Lshark/HeapAnalyzer$e$b;

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lshark/HeapAnalyzer$updateTrie$childNode$1;->invoke()Lshark/HeapAnalyzer$e$b;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lshark/HeapAnalyzer$e$b;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lshark/HeapAnalyzer$e$b;

    iget-wide v1, p0, Lshark/HeapAnalyzer$updateTrie$childNode$1;->$objectId:J

    invoke-direct {v0, v1, v2}, Lshark/HeapAnalyzer$e$b;-><init>(J)V

    .line 3
    iget-object v1, p0, Lshark/HeapAnalyzer$updateTrie$childNode$1;->$parentNode:Lshark/HeapAnalyzer$e$b;

    invoke-virtual {v1}, Lshark/HeapAnalyzer$e$b;->a()Ljava/util/Map;

    move-result-object v1

    iget-wide v2, p0, Lshark/HeapAnalyzer$updateTrie$childNode$1;->$objectId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
