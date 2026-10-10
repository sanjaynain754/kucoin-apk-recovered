.class public final Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance$Companion;
.super Ljava/lang/Object;
.source "AtomicLabel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance$Companion;",
        "",
        "<init>",
        "()V",
        "defaultAppearance",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;",
        "theme",
        "Lio/trtc/tuikit/atomicx/theme/Theme;",
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
    invoke-direct {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultAppearance(Lio/trtc/tuikit/atomicx/theme/Theme;)Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;
    .locals 7
    .param p1    # Lio/trtc/tuikit/atomicx/theme/Theme;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "theme"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/theme/Theme;->c()Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;->d()Lbg0/c;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lbg0/c;->d()Lbg0/b;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    new-instance v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/theme/Theme;->c()Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;->c()Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;->z()I

    .line 32
    move-result v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lbg0/b;->a()F

    .line 36
    move-result v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lbg0/b;->b()I

    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;-><init>(IIFIF)V

    .line 46
    return-object v1
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
