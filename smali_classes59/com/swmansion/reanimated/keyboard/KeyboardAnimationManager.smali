.class public Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;
.super Ljava/lang/Object;
.source "KeyboardAnimationManager.java"


# instance fields
.field private final mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

.field private final mListeners:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private mNextListenerId:I

.field private final mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Lcom/swmansion/reanimated/keyboard/Keyboard;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 21
    .line 22
    new-instance v1, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 23
    .line 24
    new-instance v2, Lcom/swmansion/reanimated/keyboard/a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, p0}, Lcom/swmansion/reanimated/keyboard/a;-><init>(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, p1, v0, v2}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;-><init>(Ljava/lang/ref/WeakReference;Lcom/swmansion/reanimated/keyboard/Keyboard;Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;)V

    .line 31
    .line 32
    iput-object v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 33
    return-void
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


# virtual methods
.method public notifyAboutKeyboardChange()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/swmansion/reanimated/keyboard/Keyboard;->getState()Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/swmansion/reanimated/keyboard/KeyboardState;->asInt()I

    .line 32
    move-result v2

    .line 33
    .line 34
    iget-object v3, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/swmansion/reanimated/keyboard/Keyboard;->getHeight()I

    .line 38
    move-result v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;->invoke(II)V

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
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

.method public subscribeForKeyboardUpdates(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 19
    .line 20
    new-instance v3, Lcom/swmansion/reanimated/keyboard/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/swmansion/reanimated/keyboard/a;-><init>(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v3, p3}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;-><init>(Lcom/swmansion/reanimated/keyboard/Keyboard;Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;Z)V

    .line 27
    .line 28
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, p2, p3}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;->startObservingChanges(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;ZZ)V

    .line 32
    .line 33
    :cond_0
    iget-object p2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    return v0
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

.method public unsubscribeFromKeyboardUpdates(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;->stopObservingChanges()V

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
.end method
