.class public Lio/flutter/embedding/android/KeyboardManager;
.super Ljava/lang/Object;
.source "KeyboardManager.java"

# interfaces
.implements Lio/flutter/plugin/editing/InputConnectionAdaptor$KeyboardDelegate;
.implements Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;,
        Lio/flutter/embedding/android/KeyboardManager$Responder;,
        Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;,
        Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "KeyboardManager"


# instance fields
.field private final redispatchedEvents:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/view/KeyEvent;",
            ">;"
        }
    .end annotation
.end field

.field protected final responders:[Lio/flutter/embedding/android/KeyboardManager$Responder;

.field private final viewDelegate:Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;)V
    .locals 4
    .param p1    # Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->redispatchedEvents:Ljava/util/HashSet;

    .line 11
    .line 12
    iput-object p1, p0, Lio/flutter/embedding/android/KeyboardManager;->viewDelegate:Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;

    .line 13
    .line 14
    new-instance v0, Lio/flutter/embedding/android/KeyEmbedderResponder;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lio/flutter/embedding/android/KeyEmbedderResponder;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 22
    .line 23
    new-instance v1, Lio/flutter/embedding/android/KeyChannelResponder;

    .line 24
    .line 25
    new-instance v2, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3}, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2}, Lio/flutter/embedding/android/KeyChannelResponder;-><init>(Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;)V

    .line 36
    const/4 v2, 0x2

    .line 37
    .line 38
    new-array v2, v2, [Lio/flutter/embedding/android/KeyboardManager$Responder;

    .line 39
    const/4 v3, 0x0

    .line 40
    .line 41
    aput-object v0, v2, v3

    .line 42
    const/4 v0, 0x1

    .line 43
    .line 44
    aput-object v1, v2, v0

    .line 45
    .line 46
    iput-object v2, p0, Lio/flutter/embedding/android/KeyboardManager;->responders:[Lio/flutter/embedding/android/KeyboardManager$Responder;

    .line 47
    .line 48
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p1}, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->setKeyboardMethodHandler(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;)V

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

.method public static synthetic access$000(Lio/flutter/embedding/android/KeyboardManager;Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/KeyboardManager;->onUnhandled(Landroid/view/KeyEvent;)V

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
.end method

.method private onUnhandled(Landroid/view/KeyEvent;)V
    .locals 1
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->viewDelegate:Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;->onTextInputKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->redispatchedEvents:Ljava/util/HashSet;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->viewDelegate:Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lio/flutter/embedding/android/KeyboardManager$ViewDelegate;->redispatch(Landroid/view/KeyEvent;)V

    .line 22
    .line 23
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->redispatchedEvents:Ljava/util/HashSet;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 27
    move-result p1

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string p1, "KeyboardManager"

    .line 32
    .line 33
    const-string v0, "A redispatched key event was consumed before reaching KeyboardManager"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :cond_1
    :goto_0
    return-void
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
.method public destroy()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->redispatchedEvents:Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v2, "A KeyboardManager was destroyed with "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, " unhandled redispatch event(s)."

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "KeyboardManager"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    :cond_0
    return-void
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
.end method

.method public getKeyboardState()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->responders:[Lio/flutter/embedding/android/KeyboardManager$Responder;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-object v0, v0, v1

    .line 6
    .line 7
    check-cast v0, Lio/flutter/embedding/android/KeyEmbedderResponder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/flutter/embedding/android/KeyEmbedderResponder;->getPressedState()Ljava/util/Map;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public handleEvent(Landroid/view/KeyEvent;)Z
    .locals 6
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->redispatchedEvents:Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/KeyboardManager;->responders:[Lio/flutter/embedding/android/KeyboardManager$Responder;

    .line 13
    array-length v0, v0

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;-><init>(Lio/flutter/embedding/android/KeyboardManager;Landroid/view/KeyEvent;)V

    .line 21
    .line 22
    iget-object v2, p0, Lio/flutter/embedding/android/KeyboardManager;->responders:[Lio/flutter/embedding/android/KeyboardManager$Responder;

    .line 23
    array-length v3, v2

    .line 24
    .line 25
    :goto_0
    if-ge v1, v3, :cond_2

    .line 26
    .line 27
    aget-object v4, v2, v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->buildCallback()Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-interface {v4, p1, v5}, Lio/flutter/embedding/android/KeyboardManager$Responder;->handleEvent(Landroid/view/KeyEvent;Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;)V

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/KeyboardManager;->onUnhandled(Landroid/view/KeyEvent;)V

    .line 41
    :cond_2
    const/4 p1, 0x1

    .line 42
    return p1
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
