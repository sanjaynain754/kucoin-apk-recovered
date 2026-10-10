.class public final Lcom/kubi/launch/d0;
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
        "Lcom/kubi/launch/WalletAnimationStrategy;",
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
        "SMAP\nAnimationStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/WalletAnimationStrategy\n+ 2 AnimationStrategy.kt\ncom/kubi/launch/AnimationStrategyKt\n*L\n1#1,314:1\n57#2:315\n57#2:316\n*S KotlinDebug\n*F\n+ 1 AnimationStrategy.kt\ncom/kubi/launch/WalletAnimationStrategy\n*L\n203#1:315\n208#1:316\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/kubi/launch/d0;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/kubi/launch/d0;-><init>(Z)V

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
    invoke-virtual {v0}, Lun/q;->q()Lun/h;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lun/h;->a()Z

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
    const-string v1, "\u94b1\u5305\u5f53\u524d\u4e0d\u53ef\u7528\u964d\u7ea7"

    .line 20
    .line 21
    const-string v3, "WalletAnimationStrategy"

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
    const/4 v3, 0x7

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Lcom/kubi/launch/q;->h(I)V

    .line 33
    .line 34
    new-instance v1, Lcom/kubi/launch/e;

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v3, v2, v0}, Lcom/kubi/launch/e;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, p1, p2}, Lcom/kubi/launch/a;->a(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    if-ne p1, p2, :cond_0

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    return-object p1

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/launch/l;->d()Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 62
    move-result-object v0

    .line 63
    const/4 v1, 0x4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/kubi/launch/q;->h(I)V

    .line 67
    .line 68
    new-instance v0, Lcom/kubi/launch/d;

    .line 69
    .line 70
    iget-boolean v1, p0, Lcom/kubi/launch/d0;->a:Z

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v1}, Lcom/kubi/launch/d;-><init>(Z)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, p1, p2}, Lcom/kubi/launch/a;->a(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    if-ne p1, p2, :cond_2

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 87
    return-object p1

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v0}, Lun/q;->q()Lun/h;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    .line 94
    invoke-interface {p2}, Lun/h;->g()Z

    .line 95
    move-result p2

    .line 96
    .line 97
    if-nez p2, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 101
    move-result-object p2

    .line 102
    const/4 v0, 0x5

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0}, Lcom/kubi/launch/q;->h(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Lcom/kubi/launch/l;->m(Z)V

    .line 109
    .line 110
    const-string p1, "\u5f53\u524d\u4e0d\u662f\u94b1\u5305 \u663e\u793a\u52a8\u753b+\u6e05\u7406\u6808"

    .line 111
    .line 112
    const-string p2, "AnimationStrategy"

    .line 113
    .line 114
    .line 115
    invoke-static {p1, p2}, Lqq/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    goto :goto_0

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    .line 120
    move-result-object p1

    .line 121
    const/4 p2, 0x6

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Lcom/kubi/launch/q;->h(I)V

    .line 125
    .line 126
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    return-object p1
    .line 128
    .line 129
    .line 130
    .line 131
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
