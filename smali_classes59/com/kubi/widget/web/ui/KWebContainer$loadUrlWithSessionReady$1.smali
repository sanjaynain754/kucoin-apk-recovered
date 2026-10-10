.class final Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "KWebContainer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/widget/web/ui/KWebContainer;->D(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.widget.web.ui.KWebContainer"
    f = "KWebContainer.kt"
    i = {
        0x0
    }
    l = {
        0xda
    }
    m = "loadUrlWithSessionReady"
    n = {
        "url"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/kubi/widget/web/ui/KWebContainer;


# direct methods
.method public constructor <init>(Lcom/kubi/widget/web/ui/KWebContainer;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/ui/KWebContainer;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;->this$0:Lcom/kubi/widget/web/ui/KWebContainer;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;->result:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;->label:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;->label:I

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$loadUrlWithSessionReady$1;->this$0:Lcom/kubi/widget/web/ui/KWebContainer;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p0}, Lcom/kubi/widget/web/ui/KWebContainer;->D(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
