.class public final Lio/trtc/tuikit/atomicx/theme/ThemeStore;
.super Ljava/lang/Object;
.source "ThemeStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0008\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u0008\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/theme/ThemeStore;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "appContext",
        "_themeState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lio/trtc/tuikit/atomicx/theme/ThemeState;",
        "themeState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getThemeState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "themePersistUtil",
        "Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;",
        "setTheme",
        "",
        "theme",
        "Lio/trtc/tuikit/atomicx/theme/Theme;",
        "setPrimaryColor",
        "hexColor",
        "",
        "updateThemeState",
        "loadPersistedTheme",
        "persistTheme",
        "loadTheme",
        "themeId",
        "loadThemeBasedOnSystemAppearance",
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


# static fields
.field public static final e:Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile f:Lio/trtc/tuikit/atomicx/theme/ThemeStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Lag0/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlinx/coroutines/flow/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/w<",
            "Lag0/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->e:Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;

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
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 4
    new-instance v0, Lag0/a;

    sget-object v1, Lio/trtc/tuikit/atomicx/theme/Theme;->d:Lio/trtc/tuikit/atomicx/theme/Theme$Companion;

    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicx/theme/Theme$Companion;->darkTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;

    move-result-object v1

    invoke-direct {v0, v1}, Lag0/a;-><init>(Lio/trtc/tuikit/atomicx/theme/Theme;)V

    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object v0

    iput-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->b:Lkotlinx/coroutines/flow/n;

    .line 5
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    move-result-object v0

    iput-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->c:Lkotlinx/coroutines/flow/w;

    .line 6
    new-instance v0, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    .line 7
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic a()Lio/trtc/tuikit/atomicx/theme/ThemeStore;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->f:Lio/trtc/tuikit/atomicx/theme/ThemeStore;

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

.method public static final synthetic b(Lio/trtc/tuikit/atomicx/theme/ThemeStore;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->f:Lio/trtc/tuikit/atomicx/theme/ThemeStore;

    .line 3
    return-void
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
.method public final c()Lkotlinx/coroutines/flow/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/w<",
            "Lag0/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->c:Lkotlinx/coroutines/flow/w;

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

.method public final d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;->d()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;->a()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->e(Ljava/lang/String;)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;->c()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->f()V

    .line 32
    :cond_1
    return-void
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

.method public final e(Ljava/lang/String;)V
    .locals 11

    .line 1
    .line 2
    const-string v0, "light"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "dark"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/Theme;->d:Lio/trtc/tuikit/atomicx/theme/Theme$Companion;

    .line 13
    .line 14
    iget-object v2, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicx/theme/Theme$Companion;->lightTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 18
    move-result-object v0

    .line 19
    :goto_0
    move-object v2, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/Theme;->d:Lio/trtc/tuikit/atomicx/theme/Theme$Companion;

    .line 29
    .line 30
    iget-object v2, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicx/theme/Theme$Companion;->darkTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/Theme;->d:Lio/trtc/tuikit/atomicx/theme/Theme$Companion;

    .line 38
    .line 39
    iget-object v2, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicx/theme/Theme$Companion;->lightTheme(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :goto_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->d:Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;->b()Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    sget-object v3, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->a:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;

    .line 55
    .line 56
    iget-object v4, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4, v0, p1}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result p1

    .line 65
    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    sget-object p1, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;->B0:Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;

    .line 69
    .line 70
    iget-object v1, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1, v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;->generateDarkTokens(Landroid/content/Context;Ljava/util/List;)Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;

    .line 74
    move-result-object p1

    .line 75
    :goto_2
    move-object v6, p1

    .line 76
    goto :goto_3

    .line 77
    .line 78
    :cond_2
    sget-object p1, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;->B0:Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;

    .line 79
    .line 80
    iget-object v1, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->a:Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;->generateLightTokens(Landroid/content/Context;Ljava/util/List;)Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;

    .line 84
    move-result-object p1

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicx/theme/Theme;->c()Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    const/16 v9, 0x1b

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    .line 98
    .line 99
    invoke-static/range {v3 .. v10}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;->b(Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;Lbg0/c;Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;ILjava/lang/Object;)Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 100
    move-result-object v5

    .line 101
    const/4 v6, 0x3

    .line 102
    const/4 v3, 0x0

    .line 103
    .line 104
    .line 105
    invoke-static/range {v2 .. v7}, Lio/trtc/tuikit/atomicx/theme/Theme;->b(Lio/trtc/tuikit/atomicx/theme/Theme;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;ILjava/lang/Object;)Lio/trtc/tuikit/atomicx/theme/Theme;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->g(Lio/trtc/tuikit/atomicx/theme/Theme;)V

    .line 110
    return-void

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {p0, v2}, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->g(Lio/trtc/tuikit/atomicx/theme/Theme;)V

    .line 114
    return-void
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 19
    .line 20
    .line 21
.end method

.method public final g(Lio/trtc/tuikit/atomicx/theme/Theme;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/theme/ThemeStore;->b:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    new-instance v1, Lag0/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p1}, Lag0/a;-><init>(Lio/trtc/tuikit/atomicx/theme/Theme;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

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
