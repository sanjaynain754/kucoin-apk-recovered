.class public final Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$a;
.super Ljava/lang/Object;
.source "DoubleColumnListView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDoubleColumnListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n774#2:293\n865#2,2:294\n1869#2,2:296\n*S KotlinDebug\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$1\n*L\n122#1:293\n122#1:294,2\n123#1:296,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$a;->b:Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 38
    .line 39
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result p1

    .line 5
    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$a;->b:Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;->g(Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;)Ljava/util/Set;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    new-instance p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    move-object v1, v0

    .line 33
    .line 34
    check-cast v1, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;->c()Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result p2

    .line 53
    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    check-cast p2, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;->e()V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    return-object p1
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$a;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
