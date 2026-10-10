.class final Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ClassFieldsReader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/internal/ClassFieldsReader;->l(Lshark/internal/h$a;)Z
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lshark/internal/ClassFieldsReader$a;",
        "Lshark/internal/ClassFieldsReader;",
        "",
        "invoke",
        "(Lshark/internal/ClassFieldsReader$a;)Z",
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
.field final synthetic this$0:Lshark/internal/ClassFieldsReader;


# direct methods
.method public constructor <init>(Lshark/internal/ClassFieldsReader;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;->this$0:Lshark/internal/ClassFieldsReader;

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
    check-cast p1, Lshark/internal/ClassFieldsReader$a;

    invoke-virtual {p0, p1}, Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;->invoke(Lshark/internal/ClassFieldsReader$a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/internal/ClassFieldsReader$a;)Z
    .locals 5
    .param p1    # Lshark/internal/ClassFieldsReader$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->o()V

    .line 3
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->l()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->a()I

    move-result v3

    iget-object v4, p0, Lshark/internal/ClassFieldsReader$classDumpHasReferenceFields$1;->this$0:Lshark/internal/ClassFieldsReader;

    invoke-static {v4}, Lshark/internal/ClassFieldsReader;->h(Lshark/internal/ClassFieldsReader;)I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1, v3}, Lshark/internal/ClassFieldsReader$a;->n(I)V

    .line 5
    invoke-virtual {p1}, Lshark/internal/ClassFieldsReader$a;->k()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
