.class public Lio/flutter/embedding/android/KeyChannelResponder;
.super Ljava/lang/Object;
.source "KeyChannelResponder.java"

# interfaces
.implements Lio/flutter/embedding/android/KeyboardManager$Responder;


# static fields
.field private static final TAG:Ljava/lang/String; = "KeyChannelResponder"


# instance fields
.field private final characterCombiner:Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final keyEventChannel:Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;)V
    .locals 1
    .param p1    # Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/flutter/embedding/android/KeyChannelResponder;->characterCombiner:Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;

    .line 11
    .line 12
    iput-object p1, p0, Lio/flutter/embedding/android/KeyChannelResponder;->keyEventChannel:Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;

    .line 13
    return-void
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

.method public static synthetic a(Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;->onKeyEventHandled(Z)V

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


# virtual methods
.method public handleEvent(Landroid/view/KeyEvent;Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;)V
    .locals 5
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p2, v1}, Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;->onKeyEventHandled(Z)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v3, p0, Lio/flutter/embedding/android/KeyChannelResponder;->characterCombiner:Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 20
    move-result v4

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v4}, Lio/flutter/embedding/android/KeyboardManager$CharacterCombiner;->applyCombiningCharacterToBaseCharacter(I)Ljava/lang/Character;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    new-instance v4, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$FlutterKeyEvent;

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, p1, v3}, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$FlutterKeyEvent;-><init>(Landroid/view/KeyEvent;Ljava/lang/Character;)V

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    move v1, v2

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lio/flutter/embedding/android/KeyChannelResponder;->keyEventChannel:Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;

    .line 35
    .line 36
    new-instance v0, Lio/flutter/embedding/android/l;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p2}, Lio/flutter/embedding/android/l;-><init>(Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v4, v1, v0}, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;->sendFlutterKeyEvent(Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$FlutterKeyEvent;ZLio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;)V

    .line 43
    return-void
    .line 44
    .line 45
.end method
