.class final Lshark/HeapObject$HeapInstance$readFields$fieldReader$2;
.super Lkotlin/jvm/internal/Lambda;
.source "HeapObject.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/HeapObject$HeapInstance;->w()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lshark/internal/FieldValuesReader;",
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lshark/internal/FieldValuesReader;",
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
.field final synthetic this$0:Lshark/HeapObject$HeapInstance;


# direct methods
.method public constructor <init>(Lshark/HeapObject$HeapInstance;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/HeapObject$HeapInstance$readFields$fieldReader$2;->this$0:Lshark/HeapObject$HeapInstance;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lshark/HeapObject$HeapInstance$readFields$fieldReader$2;->invoke()Lshark/internal/FieldValuesReader;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lshark/internal/FieldValuesReader;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lshark/HeapObject$HeapInstance$readFields$fieldReader$2;->this$0:Lshark/HeapObject$HeapInstance;

    invoke-static {v0}, Lshark/HeapObject$HeapInstance;->i(Lshark/HeapObject$HeapInstance;)Lshark/HprofHeapGraph;

    move-result-object v0

    iget-object v1, p0, Lshark/HeapObject$HeapInstance$readFields$fieldReader$2;->this$0:Lshark/HeapObject$HeapInstance;

    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->x()Lshark/l$b$c$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lshark/HprofHeapGraph;->x(Lshark/l$b$c$b;)Lshark/internal/FieldValuesReader;

    move-result-object v0

    return-object v0
.end method
