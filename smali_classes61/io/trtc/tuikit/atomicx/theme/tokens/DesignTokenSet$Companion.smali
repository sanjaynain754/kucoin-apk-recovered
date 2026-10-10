.class public final Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;
.super Ljava/lang/Object;
.source "DesignTokenSet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;
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
        "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;",
        "",
        "<init>",
        "()V",
        "defaultLight",
        "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;",
        "context",
        "Landroid/content/Context;",
        "defaultDark",
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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultDark(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;
    .locals 33
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "context"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v2, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 10
    .line 11
    sget-object v1, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;->B0:Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;->defaultDark(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    new-instance v6, Lbg0/c;

    .line 18
    .line 19
    .line 20
    const v31, 0xffffff

    .line 21
    .line 22
    const/16 v32, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v14, 0x0

    .line 31
    const/4 v15, 0x0

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const/16 v17, 0x0

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const/16 v19, 0x0

    .line 40
    .line 41
    const/16 v20, 0x0

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    const/16 v23, 0x0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/16 v25, 0x0

    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const/16 v27, 0x0

    .line 56
    .line 57
    const/16 v28, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const/16 v30, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct/range {v6 .. v32}, Lbg0/c;-><init>(Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;->c:Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens$Companion;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens$Companion;->standard()Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    const-string v3, "dark"

    .line 73
    .line 74
    const-string v4, "Dark Theme"

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v2 .. v7}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;Lbg0/c;Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;)V

    .line 78
    return-object v2
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final defaultLight(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;
    .locals 33
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "context"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v2, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 10
    .line 11
    sget-object v1, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;->B0:Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens$Companion;->defaultLight(Landroid/content/Context;)Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    new-instance v6, Lbg0/c;

    .line 18
    .line 19
    .line 20
    const v31, 0xffffff

    .line 21
    .line 22
    const/16 v32, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v14, 0x0

    .line 31
    const/4 v15, 0x0

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const/16 v17, 0x0

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const/16 v19, 0x0

    .line 40
    .line 41
    const/16 v20, 0x0

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    const/16 v23, 0x0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/16 v25, 0x0

    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const/16 v27, 0x0

    .line 56
    .line 57
    const/16 v28, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const/16 v30, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct/range {v6 .. v32}, Lbg0/c;-><init>(Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;Lbg0/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;->c:Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens$Companion;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens$Companion;->standard()Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    const-string v3, "light"

    .line 73
    .line 74
    const-string v4, "Light Theme"

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v2 .. v7}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;Lbg0/c;Lio/trtc/tuikit/atomicx/theme/tokens/ShadowTokens;)V

    .line 78
    return-object v2
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
