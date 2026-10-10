.class final Lshark/HeapObject$HeapClass$readStaticFields$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HeapObject.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/HeapObject$HeapClass;->y()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lshark/l$b$c$a$b;",
        "Lshark/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lshark/l$b$c$a$b;",
        "fieldRecord",
        "Lshark/h;",
        "invoke",
        "(Lshark/l$b$c$a$b;)Lshark/h;",
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
.field final synthetic this$0:Lshark/HeapObject$HeapClass;


# direct methods
.method public constructor <init>(Lshark/HeapObject$HeapClass;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/HeapObject$HeapClass$readStaticFields$1;->this$0:Lshark/HeapObject$HeapClass;

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
    check-cast p1, Lshark/l$b$c$a$b;

    invoke-virtual {p0, p1}, Lshark/HeapObject$HeapClass$readStaticFields$1;->invoke(Lshark/l$b$c$a$b;)Lshark/h;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/l$b$c$a$b;)Lshark/h;
    .locals 5
    .param p1    # Lshark/l$b$c$a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lshark/h;

    .line 3
    iget-object v1, p0, Lshark/HeapObject$HeapClass$readStaticFields$1;->this$0:Lshark/HeapObject$HeapClass;

    invoke-static {v1}, Lshark/HeapObject$HeapClass;->i(Lshark/HeapObject$HeapClass;)Lshark/HprofHeapGraph;

    move-result-object v2

    iget-object v3, p0, Lshark/HeapObject$HeapClass$readStaticFields$1;->this$0:Lshark/HeapObject$HeapClass;

    invoke-virtual {v3}, Lshark/HeapObject$HeapClass;->f()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4, p1}, Lshark/HprofHeapGraph;->R(JLshark/l$b$c$a$b;)Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v3, Lshark/j;

    iget-object v4, p0, Lshark/HeapObject$HeapClass$readStaticFields$1;->this$0:Lshark/HeapObject$HeapClass;

    invoke-static {v4}, Lshark/HeapObject$HeapClass;->i(Lshark/HeapObject$HeapClass;)Lshark/HprofHeapGraph;

    move-result-object v4

    invoke-virtual {p1}, Lshark/l$b$c$a$b;->b()Lshark/ValueHolder;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Lshark/j;-><init>(Lshark/i;Lshark/ValueHolder;)V

    .line 5
    invoke-direct {v0, v1, v2, v3}, Lshark/h;-><init>(Lshark/HeapObject$HeapClass;Ljava/lang/String;Lshark/j;)V

    return-object v0
.end method
