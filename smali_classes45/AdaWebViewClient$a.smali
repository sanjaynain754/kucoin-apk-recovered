.class public final LAdaWebViewClient$a;
.super Ljava/lang/Object;
.source "AdaWebViewClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAdaWebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field public final synthetic b:LAdaWebViewClient;

.field public final synthetic c:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(LAdaWebViewClient;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, LAdaWebViewClient$a;->b:LAdaWebViewClient;

    .line 3
    .line 4
    iput-object p2, p0, LAdaWebViewClient$a;->c:Landroid/webkit/WebView;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, LAdaWebViewClient$a;->b:LAdaWebViewClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, LAdaWebViewClient;->b(LAdaWebViewClient;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LAdaWebViewClient$a;->b:LAdaWebViewClient;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LAdaWebViewClient;->a(LAdaWebViewClient;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, LAdaWebViewClient$a;->c:Landroid/webkit/WebView;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/webkit/WebView;->getProgress()I

    .line 24
    move-result v0

    .line 25
    .line 26
    const/16 v1, 0x64

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, LAdaWebViewClient$a;->c:Landroid/webkit/WebView;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, LAdaWebViewClient$a;->b:LAdaWebViewClient;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, LAdaWebViewClient;->c()Lkotlin/jvm/functions/Function0;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 45
    :cond_2
    return-void
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
.end method
