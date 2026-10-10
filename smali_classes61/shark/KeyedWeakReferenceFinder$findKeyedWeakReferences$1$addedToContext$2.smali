.class final Lshark/KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$2;
.super Lkotlin/jvm/internal/Lambda;
.source "KeyedWeakReferenceFinder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/KeyedWeakReferenceFinder$findKeyedWeakReferences$1;->invoke()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lshark/HeapObject$HeapInstance;",
        "Lshark/internal/KeyedWeakReferenceMirror;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lshark/internal/KeyedWeakReferenceMirror;",
        "it",
        "Lshark/HeapObject$HeapInstance;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $heapDumpUptimeMillis:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/Long;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$2;->$heapDumpUptimeMillis:Ljava/lang/Long;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lshark/HeapObject$HeapInstance;

    invoke-virtual {p0, p1}, Lshark/KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$2;->invoke(Lshark/HeapObject$HeapInstance;)Lshark/internal/KeyedWeakReferenceMirror;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/HeapObject$HeapInstance;)Lshark/internal/KeyedWeakReferenceMirror;
    .locals 2
    .param p1    # Lshark/HeapObject$HeapInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    sget-object v0, Lshark/internal/KeyedWeakReferenceMirror;->h:Lshark/internal/KeyedWeakReferenceMirror$Companion;

    .line 3
    iget-object v1, p0, Lshark/KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$2;->$heapDumpUptimeMillis:Ljava/lang/Long;

    .line 4
    invoke-virtual {v0, p1, v1}, Lshark/internal/KeyedWeakReferenceMirror$Companion;->fromInstance(Lshark/HeapObject$HeapInstance;Ljava/lang/Long;)Lshark/internal/KeyedWeakReferenceMirror;

    move-result-object p1

    return-object p1
.end method
