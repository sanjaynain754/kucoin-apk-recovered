.class public final Lcom/trtc/uikit/livekit/kc/web3/f;
.super Ljava/lang/Object;
.source "KCWeb3PreviewCardUi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/kc/web3/KCWeb3PreviewCardUi;",
        "",
        "<init>",
        "()V",
        "bindPreviewCardBackground",
        "",
        "imageView",
        "Landroid/widget/ImageView;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/trtc/uikit/livekit/kc/web3/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/kc/web3/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/kc/web3/f;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/trtc/uikit/livekit/kc/web3/f;->a:Lcom/trtc/uikit/livekit/kc/web3/f;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;)V
    .locals 2
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "imageView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/bumptech/glide/c;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "https://assets.staticimg.com/sbx/input/100201/mobile/4e80daa65ed9fca0bebb240521d605dd.png"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->v(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget-object v1, Lv1/c;->a:Lv1/c;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ll2/a;->i(Lv1/c;)Ll2/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/bumptech/glide/g;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 27
    return-void
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
