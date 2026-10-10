.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;
.super Landroid/view/View;
.source "CoGuestIconView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "currentAnimationResIndex",
        "",
        "startAnimationTask",
        "com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1;",
        "startAnimation",
        "",
        "stopAnimation",
        "Companion",
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
.field public static final d:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:I


# instance fields
.field public b:I

.field public final c:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->d:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;

    .line 9
    .line 10
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_1:I

    .line 11
    .line 12
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_2:I

    .line 13
    .line 14
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_3:I

    .line 15
    .line 16
    .line 17
    filled-new-array {v0, v1, v2}, [I

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->e:[I

    .line 21
    .line 22
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_default:I

    .line 23
    .line 24
    sput v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->f:I

    .line 25
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

    .line 5
    new-instance p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->c:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;

    .line 6
    sget p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->f:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic a()[I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->e:[I

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

.method public static final synthetic b(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

    .line 3
    return p0
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

.method public static final synthetic c(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

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
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->c:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    :cond_0
    return-void
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

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    iput v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b:I

    .line 4
    .line 5
    sget v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->f:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->c:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 14
    return-void
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
