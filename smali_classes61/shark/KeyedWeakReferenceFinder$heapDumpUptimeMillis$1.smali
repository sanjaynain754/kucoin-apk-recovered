.class final Lshark/KeyedWeakReferenceFinder$heapDumpUptimeMillis$1;
.super Lkotlin/jvm/internal/Lambda;
.source "KeyedWeakReferenceFinder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/KeyedWeakReferenceFinder;->c(Lshark/i;)Ljava/lang/Long;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Long;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Long;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $graph:Lshark/i;


# direct methods
.method public constructor <init>(Lshark/i;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/KeyedWeakReferenceFinder$heapDumpUptimeMillis$1;->$graph:Lshark/i;

    .line 3
    const/4 p1, 0x0

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
.method public final invoke()Ljava/lang/Long;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    iget-object v0, p0, Lshark/KeyedWeakReferenceFinder$heapDumpUptimeMillis$1;->$graph:Lshark/i;

    const-string v1, "leakcanary.KeyedWeakReference"

    invoke-interface {v0, v1}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v2, "heapDumpUptimeMillis"

    invoke-virtual {v0, v2}, Lshark/HeapObject$HeapClass;->j(Ljava/lang/String;)Lshark/h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lshark/h;->c()Lshark/j;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lshark/j;->b()Ljava/lang/Long;

    move-result-object v1

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 4
    sget-object v0, Lshark/v;->a:Lshark/v;

    .line 5
    invoke-virtual {v0}, Lshark/v;->a()Lshark/v$a;

    :cond_2
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lshark/KeyedWeakReferenceFinder$heapDumpUptimeMillis$1;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
