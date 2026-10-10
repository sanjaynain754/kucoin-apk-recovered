.class public final Lcom/swmansion/gesturehandler/core/Vector$Companion;
.super Ljava/lang/Object;
.source "Vector.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/core/Vector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/Vector$Companion;",
        "",
        "<init>",
        "()V",
        "VECTOR_LEFT",
        "Lcom/swmansion/gesturehandler/core/Vector;",
        "VECTOR_RIGHT",
        "VECTOR_UP",
        "VECTOR_DOWN",
        "VECTOR_RIGHT_UP",
        "VECTOR_RIGHT_DOWN",
        "VECTOR_LEFT_UP",
        "VECTOR_LEFT_DOWN",
        "VECTOR_ZERO",
        "MINIMAL_RECOGNIZABLE_MAGNITUDE",
        "",
        "fromDirection",
        "direction",
        "",
        "fromVelocity",
        "tracker",
        "Landroid/view/VelocityTracker;",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
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
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/core/Vector$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromDirection(I)Lcom/swmansion/gesturehandler/core/Vector;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->i()Lcom/swmansion/gesturehandler/core/Vector;

    .line 7
    move-result-object p1

    .line 8
    return-object p1

    .line 9
    .line 10
    .line 11
    :pswitch_1
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->c()Lcom/swmansion/gesturehandler/core/Vector;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :pswitch_2
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->f()Lcom/swmansion/gesturehandler/core/Vector;

    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    .line 20
    .line 21
    :pswitch_3
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->a()Lcom/swmansion/gesturehandler/core/Vector;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :pswitch_4
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->d()Lcom/swmansion/gesturehandler/core/Vector;

    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    .line 30
    .line 31
    :pswitch_5
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->g()Lcom/swmansion/gesturehandler/core/Vector;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    .line 35
    .line 36
    :pswitch_6
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->h()Lcom/swmansion/gesturehandler/core/Vector;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    .line 41
    :pswitch_7
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->b()Lcom/swmansion/gesturehandler/core/Vector;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    .line 45
    .line 46
    :pswitch_8
    invoke-static {}, Lcom/swmansion/gesturehandler/core/Vector;->e()Lcom/swmansion/gesturehandler/core/Vector;

    .line 47
    move-result-object p1

    .line 48
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final fromVelocity(Landroid/view/VelocityTracker;)Lcom/swmansion/gesturehandler/core/Vector;
    .locals 4
    .param p1    # Landroid/view/VelocityTracker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "tracker"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const/16 v0, 0x3e8

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 15
    move-result v0

    .line 16
    float-to-double v0, v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 20
    move-result p1

    .line 21
    float-to-double v2, p1

    .line 22
    .line 23
    new-instance p1, Lcom/swmansion/gesturehandler/core/Vector;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0, v1, v2, v3}, Lcom/swmansion/gesturehandler/core/Vector;-><init>(DD)V

    .line 27
    return-object p1
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
    .line 79
    .line 80
    .line 81
.end method
