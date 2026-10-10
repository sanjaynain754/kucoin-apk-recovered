.class final Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HprofInMemoryIndex.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/internal/HprofInMemoryIndex;->s()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lshark/internal/hppc/d<",
        "+",
        "Lshark/internal/b;",
        ">;",
        "Lshark/internal/hppc/d<",
        "+",
        "Lshark/internal/h$d;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lshark/internal/hppc/d;",
        "Lshark/internal/b;",
        "it",
        "Lshark/internal/h$d;",
        "invoke",
        "(Lshark/internal/hppc/d;)Lshark/internal/hppc/d;",
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
.field final synthetic this$0:Lshark/internal/HprofInMemoryIndex;


# direct methods
.method public constructor <init>(Lshark/internal/HprofInMemoryIndex;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;->this$0:Lshark/internal/HprofInMemoryIndex;

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
    check-cast p1, Lshark/internal/hppc/d;

    invoke-virtual {p0, p1}, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;->invoke(Lshark/internal/hppc/d;)Lshark/internal/hppc/d;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/internal/hppc/d;)Lshark/internal/hppc/d;
    .locals 8
    .param p1    # Lshark/internal/hppc/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/b;",
            ">;)",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h$d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lshark/internal/hppc/d;->a()J

    move-result-wide v0

    .line 3
    invoke-virtual {p1}, Lshark/internal/hppc/d;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lshark/internal/b;

    .line 4
    new-instance v2, Lshark/internal/h$d;

    .line 5
    iget-object v3, p0, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;->this$0:Lshark/internal/HprofInMemoryIndex;

    invoke-static {v3}, Lshark/internal/HprofInMemoryIndex;->d(Lshark/internal/HprofInMemoryIndex;)I

    move-result v3

    invoke-virtual {p1, v3}, Lshark/internal/b;->e(I)J

    move-result-wide v3

    .line 6
    invoke-static {}, Lshark/PrimitiveType;->values()[Lshark/PrimitiveType;

    move-result-object v5

    invoke-virtual {p1}, Lshark/internal/b;->a()B

    move-result v6

    .line 7
    aget-object v5, v5, v6

    .line 8
    iget-object v6, p0, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;->this$0:Lshark/internal/HprofInMemoryIndex;

    invoke-static {v6}, Lshark/internal/HprofInMemoryIndex;->c(Lshark/internal/HprofInMemoryIndex;)I

    move-result v6

    invoke-virtual {p1, v6}, Lshark/internal/b;->e(I)J

    move-result-wide v6

    .line 9
    invoke-direct/range {v2 .. v7}, Lshark/internal/h$d;-><init>(JLshark/PrimitiveType;J)V

    .line 10
    invoke-static {v0, v1, v2}, Lshark/internal/hppc/f;->c(JLjava/lang/Object;)Lshark/internal/hppc/d;

    move-result-object p1

    return-object p1
.end method
