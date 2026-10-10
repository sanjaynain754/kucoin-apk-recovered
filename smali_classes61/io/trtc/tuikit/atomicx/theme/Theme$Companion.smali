.class public final Lio/trtc/tuikit/atomicx/theme/Theme$Companion;
.super Ljava/lang/Object;
.source "ThemeStore.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicx/theme/Theme;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/theme/Theme$Companion;",
        "",
        "<init>",
        "()V",
        "lightTheme",
        "Lio/trtc/tuikit/atomicx/theme/Theme;",
        "context",
        "Landroid/content/Context;",
        "darkTheme",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/trtc/tuikit/atomicx/theme/Theme$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final darkTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;->f:Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;->defaultDark(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    const-string v1, "dark"

    .line 16
    .line 17
    const-string v2, "Dark"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p1}, Lio/trtc/tuikit/atomicx/theme/Theme;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;)V

    .line 21
    return-object v0
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

.method public final lightTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;->f:Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;->defaultLight(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    const-string v1, "light"

    .line 16
    .line 17
    const-string v2, "Light"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p1}, Lio/trtc/tuikit/atomicx/theme/Theme;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;)V

    .line 21
    return-object v0
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
