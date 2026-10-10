.class public final Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;
.super Ljava/lang/Object;
.source "PictureInPictureStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;",
        "",
        "<init>",
        "()V",
        "_isPictureInPictureMode",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "state",
        "Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureState;",
        "getState",
        "()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureState;",
        "updateIsPictureInPictureMode",
        "",
        "isPictureInPictureMode",
        "Companion",
        "atomic_x_googleRelease"
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
        "SMAP\nPictureInPictureStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureInPictureStore.kt\nio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,24:1\n230#2,5:25\n*S KotlinDebug\n*F\n+ 1 PictureInPictureStore.kt\nio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore\n*L\n22#1:25,5\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lzf0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->c:Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore$Companion;

    .line 9
    .line 10
    new-instance v0, Lzf0/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lzf0/b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sput-object v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->d:Lkotlin/Lazy;

    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->a:Lkotlinx/coroutines/flow/n;

    .line 12
    .line 13
    new-instance v1, Lzf0/a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0}, Lzf0/a;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 17
    .line 18
    iput-object v1, p0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->b:Lzf0/a;

    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public static synthetic a()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->d()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->d:Lkotlin/Lazy;

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
    .line 19
    .line 20
    .line 21
.end method

.method public static final d()Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;-><init>()V

    .line 6
    return-object v0
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
.method public final c()Lzf0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->b:Lzf0/a;

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
    .line 19
    .line 20
    .line 21
.end method

.method public final e(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureStore;->a:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
