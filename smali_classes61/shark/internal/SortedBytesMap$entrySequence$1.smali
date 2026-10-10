.class final Lshark/internal/SortedBytesMap$entrySequence$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SortedBytesMap.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/internal/SortedBytesMap;->g()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lshark/internal/hppc/d<",
        "+",
        "Lshark/internal/b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "keyIndex",
        "Lshark/internal/hppc/d;",
        "Lshark/internal/b;",
        "invoke",
        "(I)Lshark/internal/hppc/d;",
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
.field final synthetic this$0:Lshark/internal/SortedBytesMap;


# direct methods
.method public constructor <init>(Lshark/internal/SortedBytesMap;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

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
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lshark/internal/SortedBytesMap$entrySequence$1;->invoke(I)Lshark/internal/hppc/d;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(I)Lshark/internal/hppc/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-static {v0}, Lshark/internal/SortedBytesMap;->a(Lshark/internal/SortedBytesMap;)I

    move-result v0

    mul-int/2addr v0, p1

    iget-object v1, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-static {v1}, Lshark/internal/SortedBytesMap;->b(Lshark/internal/SortedBytesMap;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3
    iget-object v1, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-virtual {v1, p1}, Lshark/internal/SortedBytesMap;->l(I)J

    move-result-wide v1

    new-instance p1, Lshark/internal/b;

    iget-object v3, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-static {v3}, Lshark/internal/SortedBytesMap;->e(Lshark/internal/SortedBytesMap;)[B

    move-result-object v3

    iget-object v4, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-static {v4}, Lshark/internal/SortedBytesMap;->c(Lshark/internal/SortedBytesMap;)I

    move-result v4

    iget-object v5, p0, Lshark/internal/SortedBytesMap$entrySequence$1;->this$0:Lshark/internal/SortedBytesMap;

    invoke-static {v5}, Lshark/internal/SortedBytesMap;->d(Lshark/internal/SortedBytesMap;)Z

    move-result v5

    invoke-direct {p1, v3, v0, v4, v5}, Lshark/internal/b;-><init>([BIIZ)V

    invoke-static {v1, v2, p1}, Lshark/internal/hppc/f;->c(JLjava/lang/Object;)Lshark/internal/hppc/d;

    move-result-object p1

    return-object p1
.end method
