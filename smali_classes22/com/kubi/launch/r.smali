.class public final Lcom/kubi/launch/r;
.super Ljava/lang/Object;
.source "AnimationStrategy.kt"

# interfaces
.implements Lcom/kubi/launch/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/launch/LiteAnimationStrategy;",
        "Lcom/kubi/launch/AnimationStrategy;",
        "speedUp",
        "",
        "<init>",
        "(Z)V",
        "showAnimation",
        "",
        "context",
        "Lcom/kubi/launch/LauncherContext;",
        "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LAppFacade_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/LiteAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/LiteAnimationStrategy\n*L\n237#1:315\n242#1:316\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/kubi/launch/r;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/kubi/launch/r;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/kubi/launch/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/launch/l;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lun/q;->a:Lun/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lun/q;->l()Lun/b;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lun/b;->a()Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/kubi/launch/l;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    const-string v1, "lite\u5f53\u524d\u4e0d\u53ef\u7528\u964d\u7ea7"

    .line 20
    .line 21
    const-string v3, "liteAnimationStrategy"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v3}, Lqq/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const/16 v3, 0x71

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lcom/kubi/launch/q;->h(I)V

    .line 34
    .line 35
    new-instance v1, Lcom/kubi/launch/e;

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v3, v2, v0}, Lcom/kubi/launch/e;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, p1, p2}, Lcom/kubi/launch/a;->a(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    if-ne p1, p2, :cond_0

    .line 50
    return-object p1

    .line 51
    .line 52
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/launch/l;->d()Z

    .line 57
    move-result v1

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    const/16 v1, 0x6e

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/kubi/launch/q;->h(I)V

    .line 69
    .line 70
    new-instance v0, Lcom/kubi/launch/d;

    .line 71
    .line 72
    iget-boolean v1, p0, Lcom/kubi/launch/r;->a:Z

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v1}, Lcom/kubi/launch/d;-><init>(Z)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, p1, p2}, Lcom/kubi/launch/a;->a(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 83
    move-result-object p2

    .line 84
    .line 85
    if-ne p1, p2, :cond_2

    .line 86
    return-object p1

    .line 87
    .line 88
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 89
    return-object p1

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {v0}, Lun/q;->l()Lun/b;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    .line 96
    invoke-interface {p2}, Lun/b;->c()Z

    .line 97
    move-result p2

    .line 98
    .line 99
    if-nez p2, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 103
    move-result-object p2

    .line 104
    .line 105
    const/16 v0, 0x6f

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v0}, Lcom/kubi/launch/q;->h(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v2}, Lcom/kubi/launch/l;->m(Z)V

    .line 112
    .line 113
    const-string p1, "\u5f53\u524d\u4e0d\u662flite \u663e\u793a\u52a8\u753b+\u6e05\u7406\u6808"

    .line 114
    .line 115
    const-string p2, "AnimationStrategy"

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p2}, Lqq/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    const/16 p2, 0x70

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lcom/kubi/launch/q;->h(I)V

    .line 129
    .line 130
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    return-object p1
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
.end method
