.class public Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;
.super Landroidx/core/view/WindowInsetsAnimationCompat$Callback;
.source "KeyboardAnimationCallback.java"


# static fields
.field private static final CONTENT_TYPE_MASK:I


# instance fields
.field private final mIsNavigationBarTranslucent:Z

.field private final mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

.field private final mNotifyAboutKeyboardChange:Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    .line 4
    move-result v0

    .line 5
    .line 6
    sput v0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->CONTENT_TYPE_MASK:I

    .line 7
    return-void
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
.end method

.method public constructor <init>(Lcom/swmansion/reanimated/keyboard/Keyboard;Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;-><init>(I)V

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mNotifyAboutKeyboardChange:Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mIsNavigationBarTranslucent:Z

    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

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
.end method

.method private static isKeyboardAnimation(Landroidx/core/view/WindowInsetsAnimationCompat;)Z
    .locals 1
    .param p0    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsAnimationCompat;->getTypeMask()I

    .line 4
    move-result p0

    .line 5
    .line 6
    sget v0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->CONTENT_TYPE_MASK:I

    .line 7
    and-int/2addr p0, v0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
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
.method public onEnd(Landroidx/core/view/WindowInsetsAnimationCompat;)V
    .locals 0
    .param p1    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->isKeyboardAnimation(Landroidx/core/view/WindowInsetsAnimationCompat;)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/swmansion/reanimated/keyboard/Keyboard;->onAnimationEnd()V

    .line 12
    .line 13
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mNotifyAboutKeyboardChange:Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;->call()V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onProgress(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .param p1    # Landroidx/core/view/WindowInsetsCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/WindowInsetsAnimationCompat;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroidx/core/view/WindowInsetsAnimationCompat;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->isKeyboardAnimation(Landroidx/core/view/WindowInsetsAnimationCompat;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object p2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mIsNavigationBarTranslucent:Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1, v0}, Lcom/swmansion/reanimated/keyboard/Keyboard;->updateHeight(Landroidx/core/view/WindowInsetsCompat;Z)V

    .line 30
    .line 31
    iget-object p2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mNotifyAboutKeyboardChange:Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;->call()V

    .line 35
    :cond_1
    return-object p1
    .line 36
    .line 37
.end method

.method public onStart(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 1
    .param p1    # Landroidx/core/view/WindowInsetsAnimationCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->isKeyboardAnimation(Landroidx/core/view/WindowInsetsAnimationCompat;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-object p2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/swmansion/reanimated/keyboard/Keyboard;->onAnimationStart()V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;->mNotifyAboutKeyboardChange:Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;->call()V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1, p2}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;->onStart(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method
