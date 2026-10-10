.class final Lshark/ObjectInspectors$CLASSLOADER$inspect$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ObjectInspectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/ObjectInspectors$CLASSLOADER;->inspect(Lshark/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lshark/q;",
        "Lshark/HeapObject$HeapInstance;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lshark/q;",
        "Lshark/HeapObject$HeapInstance;",
        "it",
        "",
        "invoke",
        "(Lshark/q;Lshark/HeapObject$HeapInstance;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lshark/ObjectInspectors$CLASSLOADER$inspect$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/ObjectInspectors$CLASSLOADER$inspect$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/ObjectInspectors$CLASSLOADER$inspect$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/ObjectInspectors$CLASSLOADER$inspect$1;->INSTANCE:Lshark/ObjectInspectors$CLASSLOADER$inspect$1;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lshark/q;

    check-cast p2, Lshark/HeapObject$HeapInstance;

    invoke-virtual {p0, p1, p2}, Lshark/ObjectInspectors$CLASSLOADER$inspect$1;->invoke(Lshark/q;Lshark/HeapObject$HeapInstance;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lshark/q;Lshark/HeapObject$HeapInstance;)V
    .locals 0
    .param p1    # Lshark/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/HeapObject$HeapInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Lshark/q;->d()Ljava/util/Set;

    move-result-object p1

    const-string p2, "A ClassLoader is never leaking"

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
