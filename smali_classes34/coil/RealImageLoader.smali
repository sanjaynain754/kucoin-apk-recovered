.class public final Lcoil/RealImageLoader;
.super Ljava/lang/Object;
.source "RealImageLoader.kt"

# interfaces
.implements Lcoil/ImageLoader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/RealImageLoader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 ]2\u00020\u0001:\u0001^BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001b\u0010%R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010&\u001a\u0004\u0008#\u0010\'R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010Q\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u00101R\u001a\u0010V\u001a\u0008\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010[\u001a\u0004\u0008\u001f\u0010\\\u00a8\u0006_"
    }
    d2 = {
        "Lcoil/RealImageLoader;",
        "Lcoil/ImageLoader;",
        "Landroid/content/Context;",
        "context",
        "Lcoil/request/DefaultRequestOptions;",
        "defaults",
        "Lcoil/bitmap/BitmapPool;",
        "bitmapPool",
        "Lx0/h;",
        "memoryCache",
        "Lokhttp3/Call$Factory;",
        "callFactory",
        "Lcoil/EventListener$Factory;",
        "eventListenerFactory",
        "Lcoil/a;",
        "componentRegistry",
        "Lb1/f;",
        "options",
        "Lb1/g;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lcoil/bitmap/BitmapPool;Lx0/h;Lokhttp3/Call$Factory;Lcoil/EventListener$Factory;Lcoil/a;Lb1/f;Lb1/g;)V",
        "",
        "level",
        "",
        "d",
        "(I)V",
        "a",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "b",
        "Lcoil/request/DefaultRequestOptions;",
        "getDefaults",
        "()Lcoil/request/DefaultRequestOptions;",
        "c",
        "Lcoil/bitmap/BitmapPool;",
        "()Lcoil/bitmap/BitmapPool;",
        "Lx0/h;",
        "()Lx0/h;",
        "e",
        "Lokhttp3/Call$Factory;",
        "getCallFactory",
        "()Lokhttp3/Call$Factory;",
        "f",
        "Lcoil/EventListener$Factory;",
        "getEventListenerFactory",
        "()Lcoil/EventListener$Factory;",
        "g",
        "Lcoil/a;",
        "getComponentRegistry",
        "()Lcoil/a;",
        "h",
        "Lb1/f;",
        "getOptions",
        "()Lb1/f;",
        "Lkotlinx/coroutines/m0;",
        "i",
        "Lkotlinx/coroutines/m0;",
        "scope",
        "Lx0/a;",
        "j",
        "Lx0/a;",
        "delegateService",
        "Lx0/g;",
        "k",
        "Lx0/g;",
        "memoryCacheService",
        "Lcoil/memory/RequestService;",
        "l",
        "Lcoil/memory/RequestService;",
        "requestService",
        "Lcoil/decode/DrawableDecoderService;",
        "m",
        "Lcoil/decode/DrawableDecoderService;",
        "drawableDecoder",
        "Lcoil/util/SystemCallbacks;",
        "n",
        "Lcoil/util/SystemCallbacks;",
        "systemCallbacks",
        "o",
        "registry",
        "",
        "",
        "p",
        "Ljava/util/List;",
        "interceptors",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "q",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isShutdown",
        "Lb1/g;",
        "()Lb1/g;",
        "r",
        "Companion",
        "coil-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final r:Lcoil/RealImageLoader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcoil/request/DefaultRequestOptions;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcoil/bitmap/BitmapPool;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lx0/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lokhttp3/Call$Factory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcoil/EventListener$Factory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcoil/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lb1/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lx0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lx0/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcoil/memory/RequestService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcoil/decode/DrawableDecoderService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcoil/util/SystemCallbacks;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Lcoil/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcoil/RealImageLoader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcoil/RealImageLoader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcoil/RealImageLoader;->r:Lcoil/RealImageLoader$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lcoil/bitmap/BitmapPool;Lx0/h;Lokhttp3/Call$Factory;Lcoil/EventListener$Factory;Lcoil/a;Lb1/f;Lb1/g;)V
    .locals 13
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcoil/request/DefaultRequestOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcoil/bitmap/BitmapPool;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lx0/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcoil/EventListener$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcoil/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lb1/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lb1/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    move-object/from16 v2, p4

    .line 5
    .line 6
    move-object/from16 v3, p5

    .line 7
    .line 8
    move-object/from16 v4, p6

    .line 9
    .line 10
    move-object/from16 v5, p7

    .line 11
    .line 12
    move-object/from16 v6, p8

    .line 13
    .line 14
    const-string v7, "context"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    const-string v7, "defaults"

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v7, "bitmapPool"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    const-string v7, "memoryCache"

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v7, "callFactory"

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    const-string v7, "eventListenerFactory"

    .line 40
    .line 41
    .line 42
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    const-string v7, "componentRegistry"

    .line 45
    .line 46
    .line 47
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string/jumbo v7, "options"

    .line 51
    .line 52
    .line 53
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    iput-object p1, p0, Lcoil/RealImageLoader;->a:Landroid/content/Context;

    .line 59
    .line 60
    iput-object p2, p0, Lcoil/RealImageLoader;->b:Lcoil/request/DefaultRequestOptions;

    .line 61
    .line 62
    iput-object v1, p0, Lcoil/RealImageLoader;->c:Lcoil/bitmap/BitmapPool;

    .line 63
    .line 64
    iput-object v2, p0, Lcoil/RealImageLoader;->d:Lx0/h;

    .line 65
    .line 66
    iput-object v3, p0, Lcoil/RealImageLoader;->e:Lokhttp3/Call$Factory;

    .line 67
    .line 68
    iput-object v4, p0, Lcoil/RealImageLoader;->f:Lcoil/EventListener$Factory;

    .line 69
    .line 70
    iput-object v5, p0, Lcoil/RealImageLoader;->g:Lcoil/a;

    .line 71
    .line 72
    iput-object v6, p0, Lcoil/RealImageLoader;->h:Lb1/f;

    .line 73
    const/4 v0, 0x1

    .line 74
    const/4 v1, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v0, v1}, Lkotlinx/coroutines/q2;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lkotlinx/coroutines/e2;->getImmediate()Lkotlinx/coroutines/e2;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    sget-object v2, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 93
    .line 94
    new-instance v4, Lcoil/RealImageLoader$a;

    .line 95
    .line 96
    .line 97
    invoke-direct {v4, v2, p0}, Lcoil/RealImageLoader$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;Lcoil/RealImageLoader;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, v4}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    iput-object v0, p0, Lcoil/RealImageLoader;->i:Lkotlinx/coroutines/m0;

    .line 108
    .line 109
    new-instance v0, Lx0/a;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lx0/h;->b()Ls0/a;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, p0, v2, v1}, Lx0/a;-><init>(Lcoil/ImageLoader;Ls0/a;Lb1/g;)V

    .line 121
    .line 122
    iput-object v0, p0, Lcoil/RealImageLoader;->j:Lx0/a;

    .line 123
    .line 124
    new-instance v8, Lx0/g;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lx0/h;->b()Ls0/a;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Lx0/h;->c()Lcoil/memory/StrongMemoryCache;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 144
    move-result-object v4

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Lx0/h;->d()Lx0/j;

    .line 148
    move-result-object v4

    .line 149
    .line 150
    .line 151
    invoke-direct {v8, v0, v2, v4}, Lx0/g;-><init>(Ls0/a;Lcoil/memory/StrongMemoryCache;Lx0/j;)V

    .line 152
    .line 153
    iput-object v8, p0, Lcoil/RealImageLoader;->k:Lx0/g;

    .line 154
    .line 155
    new-instance v9, Lcoil/memory/RequestService;

    .line 156
    .line 157
    .line 158
    invoke-direct {v9, v1}, Lcoil/memory/RequestService;-><init>(Lb1/g;)V

    .line 159
    .line 160
    iput-object v9, p0, Lcoil/RealImageLoader;->l:Lcoil/memory/RequestService;

    .line 161
    .line 162
    new-instance v11, Lcoil/decode/DrawableDecoderService;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcoil/RealImageLoader;->a()Lcoil/bitmap/BitmapPool;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    .line 169
    invoke-direct {v11, v0}, Lcoil/decode/DrawableDecoderService;-><init>(Lcoil/bitmap/BitmapPool;)V

    .line 170
    .line 171
    iput-object v11, p0, Lcoil/RealImageLoader;->m:Lcoil/decode/DrawableDecoderService;

    .line 172
    .line 173
    new-instance v10, Lcoil/util/SystemCallbacks;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Lb1/f;->b()Z

    .line 177
    move-result v0

    .line 178
    .line 179
    .line 180
    invoke-direct {v10, p0, p1, v0}, Lcoil/util/SystemCallbacks;-><init>(Lcoil/RealImageLoader;Landroid/content/Context;Z)V

    .line 181
    .line 182
    iput-object v10, p0, Lcoil/RealImageLoader;->n:Lcoil/util/SystemCallbacks;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5}, Lcoil/a;->e()Lcoil/a$a;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    new-instance v1, Lw0/e;

    .line 189
    .line 190
    .line 191
    invoke-direct {v1}, Lw0/e;-><init>()V

    .line 192
    .line 193
    const-class v2, Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->c(Lw0/b;Ljava/lang/Class;)Lcoil/a$a;

    .line 197
    move-result-object v0

    .line 198
    .line 199
    new-instance v1, Lw0/a;

    .line 200
    .line 201
    .line 202
    invoke-direct {v1}, Lw0/a;-><init>()V

    .line 203
    .line 204
    const-class v2, Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->c(Lw0/b;Ljava/lang/Class;)Lcoil/a$a;

    .line 208
    move-result-object v0

    .line 209
    .line 210
    new-instance v1, Lw0/d;

    .line 211
    .line 212
    .line 213
    invoke-direct {v1, p1}, Lw0/d;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->c(Lw0/b;Ljava/lang/Class;)Lcoil/a$a;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    new-instance v1, Lw0/c;

    .line 220
    .line 221
    .line 222
    invoke-direct {v1, p1}, Lw0/c;-><init>(Landroid/content/Context;)V

    .line 223
    .line 224
    const-class v4, Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v1, v4}, Lcoil/a$a;->c(Lw0/b;Ljava/lang/Class;)Lcoil/a$a;

    .line 228
    move-result-object v0

    .line 229
    .line 230
    new-instance v1, Lv0/f;

    .line 231
    .line 232
    .line 233
    invoke-direct {v1, v3}, Lv0/f;-><init>(Lokhttp3/Call$Factory;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    new-instance v1, Lv0/g;

    .line 240
    .line 241
    .line 242
    invoke-direct {v1, v3}, Lv0/g;-><init>(Lokhttp3/Call$Factory;)V

    .line 243
    .line 244
    const-class v3, Lokhttp3/HttpUrl;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1, v3}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    new-instance v1, Lv0/e;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Lb1/f;->a()Z

    .line 254
    move-result v3

    .line 255
    .line 256
    .line 257
    invoke-direct {v1, v3}, Lv0/e;-><init>(Z)V

    .line 258
    .line 259
    const-class v3, Ljava/io/File;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1, v3}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 263
    move-result-object v0

    .line 264
    .line 265
    new-instance v1, Lcoil/fetch/AssetUriFetcher;

    .line 266
    .line 267
    .line 268
    invoke-direct {v1, p1}, Lcoil/fetch/AssetUriFetcher;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 272
    move-result-object v0

    .line 273
    .line 274
    new-instance v1, Lv0/b;

    .line 275
    .line 276
    .line 277
    invoke-direct {v1, p1}, Lv0/b;-><init>(Landroid/content/Context;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 281
    move-result-object v0

    .line 282
    .line 283
    new-instance v1, Lcoil/fetch/ResourceUriFetcher;

    .line 284
    .line 285
    .line 286
    invoke-direct {v1, p1, v11}, Lcoil/fetch/ResourceUriFetcher;-><init>(Landroid/content/Context;Lcoil/decode/DrawableDecoderService;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    new-instance v1, Lv0/c;

    .line 293
    .line 294
    .line 295
    invoke-direct {v1, v11}, Lv0/c;-><init>(Lcoil/decode/DrawableDecoderService;)V

    .line 296
    .line 297
    const-class v2, Landroid/graphics/drawable/Drawable;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 301
    move-result-object v0

    .line 302
    .line 303
    new-instance v1, Lv0/a;

    .line 304
    .line 305
    .line 306
    invoke-direct {v1}, Lv0/a;-><init>()V

    .line 307
    .line 308
    const-class v2, Landroid/graphics/Bitmap;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v1, v2}, Lcoil/a$a;->b(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;

    .line 312
    move-result-object v0

    .line 313
    .line 314
    new-instance v1, Lcoil/decode/BitmapFactoryDecoder;

    .line 315
    .line 316
    .line 317
    invoke-direct {v1, p1}, Lcoil/decode/BitmapFactoryDecoder;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Lcoil/a$a;->a(Lu0/a;)Lcoil/a$a;

    .line 321
    move-result-object p1

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1}, Lcoil/a$a;->d()Lcoil/a;

    .line 325
    move-result-object v4

    .line 326
    .line 327
    iput-object v4, p0, Lcoil/RealImageLoader;->o:Lcoil/a;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4}, Lcoil/a;->c()Ljava/util/List;

    .line 331
    move-result-object p1

    .line 332
    .line 333
    new-instance v3, Lcoil/intercept/EngineInterceptor;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0}, Lcoil/RealImageLoader;->a()Lcoil/bitmap/BitmapPool;

    .line 337
    move-result-object v5

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 341
    move-result-object v0

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Lx0/h;->b()Ls0/a;

    .line 345
    move-result-object v6

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 349
    move-result-object v0

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Lx0/h;->c()Lcoil/memory/StrongMemoryCache;

    .line 353
    move-result-object v7

    .line 354
    const/4 v12, 0x0

    .line 355
    .line 356
    .line 357
    invoke-direct/range {v3 .. v12}, Lcoil/intercept/EngineInterceptor;-><init>(Lcoil/a;Lcoil/bitmap/BitmapPool;Ls0/a;Lcoil/memory/StrongMemoryCache;Lx0/g;Lcoil/memory/RequestService;Lcoil/util/SystemCallbacks;Lcoil/decode/DrawableDecoderService;Lb1/g;)V

    .line 358
    .line 359
    .line 360
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 361
    move-result-object p1

    .line 362
    .line 363
    iput-object p1, p0, Lcoil/RealImageLoader;->p:Ljava/util/List;

    .line 364
    .line 365
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 366
    const/4 v0, 0x0

    .line 367
    .line 368
    .line 369
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 370
    .line 371
    iput-object p1, p0, Lcoil/RealImageLoader;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 372
    return-void
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
.end method


# virtual methods
.method public a()Lcoil/bitmap/BitmapPool;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcoil/RealImageLoader;->c:Lcoil/bitmap/BitmapPool;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public final b()Lb1/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
    .line 4
    .line 5
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
.end method

.method public c()Lx0/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcoil/RealImageLoader;->d:Lx0/h;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public final d(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lx0/h;->c()Lcoil/memory/StrongMemoryCache;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcoil/memory/StrongMemoryCache;->a(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcoil/RealImageLoader;->c()Lx0/h;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lx0/h;->d()Lx0/j;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Lx0/j;->a(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcoil/RealImageLoader;->a()Lcoil/bitmap/BitmapPool;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Lcoil/bitmap/BitmapPool;->a(I)V

    .line 30
    return-void
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
.end method
