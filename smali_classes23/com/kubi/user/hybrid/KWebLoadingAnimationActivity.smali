.class public final Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;
.super Lcom/kubi/widget/web/ui/KWebBaseActivity;
.source "KWebLoadingAnimationActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\tH\u0016J\u0008\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0008\u0010\u0011\u001a\u00020\tH\u0014J\u0008\u0010\u0012\u001a\u00020\u0013H\u0014J\u0008\u0010\u0014\u001a\u00020\tH\u0002J\u0008\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;",
        "Lcom/kubi/widget/web/ui/KWebBaseActivity;",
        "<init>",
        "()V",
        "loadingViewContainer",
        "Landroid/widget/FrameLayout;",
        "isLoadingViewRemoved",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onBackPressed",
        "onDestroy",
        "initWebView",
        "webView",
        "Lcom/kubi/sdk/web/KWebView;",
        "startLoad",
        "getWebUIConfig",
        "Lcom/kubi/widget/web/ui/KWebUIConfig;",
        "removeLoadingView",
        "isActivityInvalid",
        "Companion",
        "UserCenterLib_googleRelease"
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
        "SMAP\nKWebLoadingAnimationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebLoadingAnimationActivity.kt\ncom/kubi/user/hybrid/KWebLoadingAnimationActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,202:1\n29#2:203\n*S KotlinDebug\n*F\n+ 1 KWebLoadingAnimationActivity.kt\ncom/kubi/user/hybrid/KWebLoadingAnimationActivity\n*L\n180#1:203\n*E\n"
    }
.end annotation


# static fields
.field public static final v:Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public t:Landroid/widget/FrameLayout;

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->v:Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;

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
    .line 19
    .line 20
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;-><init>()V

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
.end method

.method public static final synthetic S0(Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->U0()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic T0(Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->V0()V

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
.end method


# virtual methods
.method public O0()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v1, 0xa

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/web/KWebView;->g(J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->O0()V

    .line 19
    return-void
    .line 20
.end method

.method public final U0()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
.end method

.method public final V0()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->u:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_2

    .line 6
    .line 7
    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->t:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    .line 16
    const-string/jumbo v1, "loadingViewContainer"

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 27
    const/4 v0, 0x1

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->u:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-void

    .line 31
    .line 32
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v2, "removeLoadingView error: "

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "KWebLoadingAnimationActivityTAG"

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :goto_2
    return-void
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
.end method

.method public m0()Lcom/kubi/widget/web/ui/KWebUIConfig;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/ui/KWebUIConfig$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig$a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const-string v2, "getIntent(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string/jumbo v2, "url"

    .line 18
    .line 19
    const-string v3, ""

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2, v3}, Lcom/kubi/router/utils/RouteExKt;->x(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->c(Landroid/net/Uri;)V

    .line 31
    .line 32
    sget-object v1, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    xor-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->b(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig$a;->a()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 45
    move-result-object v0

    .line 46
    return-object v0
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
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->onBackPressed()V

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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    const-string v0, "child onCreate activity="

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-class v0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string v0, "MyKcWebView-BaseActivity"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    new-instance p1, Landroid/widget/ImageView;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/kubi/b;->a(Landroid/widget/ImageView;)V

    .line 40
    .line 41
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 42
    .line 43
    const/high16 v1, 0x42200000    # 40.0f

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 47
    move-result v2

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 51
    move-result v3

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 55
    .line 56
    const/16 v2, 0x11

    .line 57
    .line 58
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    new-instance v0, Landroid/widget/FrameLayout;

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    sget-object v4, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 76
    move-result v4

    .line 77
    .line 78
    if-eqz v4, :cond_0

    .line 79
    .line 80
    sget v4, Lcom/kubi/user/R$color;->kweb_background_light:I

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_0
    sget v4, Lcom/kubi/user/R$color;->kweb_background_dark:I

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 87
    move-result v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 91
    .line 92
    iput-object v0, p0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->t:Landroid/widget/FrameLayout;

    .line 93
    .line 94
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 98
    move-result v4

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 102
    move-result v1

    .line 103
    .line 104
    .line 105
    invoke-direct {v3, v4, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    iget-object v0, p0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;->t:Landroid/widget/FrameLayout;

    .line 115
    .line 116
    if-nez v0, :cond_1

    .line 117
    .line 118
    .line 119
    const-string/jumbo v0, "loadingViewContainer"

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x0

    .line 124
    .line 125
    :cond_1
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    const/4 v2, -0x1

    .line 127
    .line 128
    .line 129
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    new-instance v0, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$a;

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, p0}, Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$a;-><init>(Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Lcom/kubi/widget/web/ui/KWebContainer;->setLoadingListener(Lz00/b;)V

    .line 145
    return-void
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->o()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->onDestroy()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public u0(Lcom/kubi/sdk/web/KWebView;)V
    .locals 4
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "webView"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->u0(Lcom/kubi/sdk/web/KWebView;)V

    .line 10
    .line 11
    new-instance v0, Lcom/kubi/widget/web/helper/b0;

    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v3, v1, v2}, Lcom/kubi/widget/web/helper/b0;-><init>(Lcom/kubi/sdk/BaseActivity;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->setWebPermission(Le10/b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-string v1, "getIntent(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string v1, "is_out_file"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v3}, Lcom/kubi/router/utils/RouteExKt;->g(Landroid/content/Intent;Ljava/lang/String;Z)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    new-instance v0, Lcom/kubi/widget/web/helper/n;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0}, Lcom/kubi/widget/web/helper/n;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    new-instance v0, Lcom/kubi/widget/web/helper/b;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p0}, Lcom/kubi/widget/web/helper/b;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->setFileChooser(Le10/a;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Lcom/kubi/widget/web/ui/KWebContainer;->x(Lcom/kubi/sdk/BaseActivity;)V

    .line 59
    return-void
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
