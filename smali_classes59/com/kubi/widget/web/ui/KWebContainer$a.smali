.class public final Lcom/kubi/widget/web/ui/KWebContainer$a;
.super Ljava/lang/Object;
.source "KWebContainer.kt"

# interfaces
.implements Lcom/kubi/sdk/web/core/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/widget/web/ui/KWebContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/kubi/widget/web/ui/KWebContainer$2",
        "Lcom/kubi/sdk/web/core/FullscreenListener;",
        "onEnterFullscreen",
        "",
        "view",
        "Landroid/view/View;",
        "callback",
        "Landroid/webkit/WebChromeClient$CustomViewCallback;",
        "onExitFullscreen",
        "LWebWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$a;->a:Landroid/content/Context;

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
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const-string v0, "exit_full_screen"

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/widget/web/service/a;->b:Lcom/kubi/widget/web/service/a;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "onExitFullscreen"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/service/a;->a(Ljava/lang/String;)V

    .line 19
    return-void
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
.end method

.method public b(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string p1, "callback"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object p1, Lcom/kubi/widget/web/service/a;->b:Lcom/kubi/widget/web/service/a;

    .line 14
    .line 15
    .line 16
    const-string/jumbo p2, "onEnterFullscreen"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/kubi/widget/web/service/a;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/kubi/widget/web/ui/KWebContainer$a;->a:Landroid/content/Context;

    .line 22
    .line 23
    new-instance p2, Landroid/content/Intent;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebContainer$a;->a:Landroid/content/Context;

    .line 26
    .line 27
    const-class v1, Lcom/kubi/widget/web/ui/KWebFullScreenVideoActivity;

    .line 28
    .line 29
    .line 30
    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
.end method
