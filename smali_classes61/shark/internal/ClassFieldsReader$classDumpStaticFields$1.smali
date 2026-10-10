.class final Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ClassFieldsReader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/internal/ClassFieldsReader;->m(Lshark/internal/h$a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lshark/internal/ClassFieldsReader$a;",
        "Ljava/util/ArrayList<",
        "Lshark/l$b$c$a$b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u0004*\u00060\u0000R\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lshark/internal/ClassFieldsReader$a;",
        "Lshark/internal/ClassFieldsReader;",
        "Ljava/util/ArrayList;",
        "Lshark/l$b$c$a$b;",
        "Lkotlin/collections/ArrayList;",
        "invoke",
        "(Lshark/internal/ClassFieldsReader$a;)Ljava/util/ArrayList;",
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
.field public static final INSTANCE:Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;->INSTANCE:Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;

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
    const/4 v0, 0x1

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lshark/internal/ClassFieldsReader$a;

    invoke-virtual {p0, p1}, Lshark/internal/ClassFieldsReader$classDumpStaticFields$1;->invoke(Lshark/internal/ClassFieldsReader$a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/internal/ClassFieldsReader$a;)Ljava/util/ArrayList;
    .locals 8
    .param p1    # Lshark/internal/ClassFieldsReader$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/internal/ClassFieldsReader$a;",
            ")",
            "Ljava/util/ArrayList<",
            "Lshark/l$b$c$a$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->l()I

    move-result v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 4
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->g()J

    move-result-wide v3

    .line 5
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->k()I

    move-result v5

    .line 6
    invoke-virtual {p1, v5}, Lshark/internal/ClassFieldsReader$a;->m(I)Lshark/ValueHolder;

    move-result-object v6

    .line 7
    new-instance v7, Lshark/l$b$c$a$b;

    invoke-direct {v7, v3, v4, v5, v6}, Lshark/l$b$c$a$b;-><init>(JILshark/ValueHolder;)V

    .line 8
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
