.class public final Lsupport/ada/embed/widget/AdaEmbedView$b;
.super Ljava/lang/Object;
.source "AdaEmbedView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsupport/ada/embed/widget/AdaEmbedView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lsupport/ada/embed/widget/AdaEmbedView$b;",
        "",
        "<init>",
        "(Lsupport/ada/embed/widget/AdaEmbedView;)V",
        "",
        "onLoadCallback",
        "()V",
        "onInitializeCallback",
        "chatFrameTimeoutCallback",
        "",
        "requestToken",
        "()Ljava/lang/String;",
        "eventStr",
        "eventCallback",
        "(Ljava/lang/String;)V",
        "ada-embed_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lsupport/ada/embed/widget/AdaEmbedView;


# direct methods
.method public constructor <init>(Lsupport/ada/embed/widget/AdaEmbedView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

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
.end method


# virtual methods
.method public final chatFrameTimeoutCallback()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lsupport/ada/embed/widget/AdaEmbedView;->c(Lsupport/ada/embed/widget/AdaEmbedView;)Landroid/os/Handler;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lsupport/ada/embed/widget/AdaEmbedView$b$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lsupport/ada/embed/widget/AdaEmbedView$b$a;-><init>(Lsupport/ada/embed/widget/AdaEmbedView$b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final eventCallback(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lsupport/ada/embed/widget/AdaEmbedView;->c(Lsupport/ada/embed/widget/AdaEmbedView;)Landroid/os/Handler;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lsupport/ada/embed/widget/AdaEmbedView$b$b;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lsupport/ada/embed/widget/AdaEmbedView$b$b;-><init>(Lsupport/ada/embed/widget/AdaEmbedView$b;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    return-void
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

.method public final onInitializeCallback()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lsupport/ada/embed/widget/AdaEmbedView;->c(Lsupport/ada/embed/widget/AdaEmbedView;)Landroid/os/Handler;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lsupport/ada/embed/widget/AdaEmbedView$b$c;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lsupport/ada/embed/widget/AdaEmbedView$b$c;-><init>(Lsupport/ada/embed/widget/AdaEmbedView$b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onLoadCallback()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lsupport/ada/embed/widget/AdaEmbedView;->c(Lsupport/ada/embed/widget/AdaEmbedView;)Landroid/os/Handler;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lsupport/ada/embed/widget/AdaEmbedView$b$d;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lsupport/ada/embed/widget/AdaEmbedView$b$d;-><init>(Lsupport/ada/embed/widget/AdaEmbedView$b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final requestToken()Ljava/lang/String;
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView$b;->a:Lsupport/ada/embed/widget/AdaEmbedView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lsupport/ada/embed/widget/AdaEmbedView;->getZdChatterAuthCallback()Lkotlin/jvm/functions/Function0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-class v0, Lsupport/ada/embed/widget/AdaEmbedView$b;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v2, "Auth token callback is not provided!"

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    return-object v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
