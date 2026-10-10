.class final Lshark/HprofHeapGraph$objects$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HprofHeapGraph.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/HprofHeapGraph;->k()Lkotlin/sequences/Sequence;
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
        "Lshark/internal/h;",
        ">;",
        "Lshark/HeapObject;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lshark/internal/hppc/d;",
        "Lshark/internal/h;",
        "it",
        "Lshark/HeapObject;",
        "invoke",
        "(Lshark/internal/hppc/d;)Lshark/HeapObject;",
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
.field final synthetic $objectIndex:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic this$0:Lshark/HprofHeapGraph;


# direct methods
.method public constructor <init>(Lshark/HprofHeapGraph;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/HprofHeapGraph$objects$1;->this$0:Lshark/HprofHeapGraph;

    .line 3
    .line 4
    iput-object p2, p0, Lshark/HprofHeapGraph$objects$1;->$objectIndex:Lkotlin/jvm/internal/Ref$IntRef;

    .line 5
    const/4 p1, 0x1

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lshark/internal/hppc/d;

    invoke-virtual {p0, p1}, Lshark/HprofHeapGraph$objects$1;->invoke(Lshark/internal/hppc/d;)Lshark/HeapObject;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/internal/hppc/d;)Lshark/HeapObject;
    .locals 5
    .param p1    # Lshark/internal/hppc/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/internal/hppc/d<",
            "+",
            "Lshark/internal/h;",
            ">;)",
            "Lshark/HeapObject;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lshark/HprofHeapGraph$objects$1;->this$0:Lshark/HprofHeapGraph;

    iget-object v1, p0, Lshark/HprofHeapGraph$objects$1;->$objectIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {p1}, Lshark/internal/hppc/d;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lshark/internal/h;

    invoke-virtual {p1}, Lshark/internal/hppc/d;->a()J

    move-result-wide v3

    invoke-static {v0, v2, v1, v3, v4}, Lshark/HprofHeapGraph;->p(Lshark/HprofHeapGraph;ILshark/internal/h;J)Lshark/HeapObject;

    move-result-object p1

    return-object p1
.end method
