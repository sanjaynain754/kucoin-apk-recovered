.class Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;
.super Ljava/lang/Object;
.source "KeyboardManager.java"

# interfaces
.implements Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Callback"
.end annotation


# instance fields
.field isCalled:Z

.field final synthetic this$1:Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;


# direct methods
.method private constructor <init>(Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;->this$1:Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;->isCalled:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;Lio/flutter/embedding/android/KeyboardManager$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;-><init>(Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;)V

    return-void
.end method


# virtual methods
.method public onKeyEventHandled(Z)V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;->isCalled:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    iput-boolean v0, p0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;->isCalled:Z

    .line 8
    .line 9
    iget-object v1, p0, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder$Callback;->this$1:Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;

    .line 10
    .line 11
    iget v2, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->unrepliedCount:I

    .line 12
    sub-int/2addr v2, v0

    .line 13
    .line 14
    iput v2, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->unrepliedCount:I

    .line 15
    .line 16
    iget-boolean v0, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->isEventHandled:Z

    .line 17
    or-int/2addr p1, v0

    .line 18
    .line 19
    iput-boolean p1, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->isEventHandled:Z

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->this$0:Lio/flutter/embedding/android/KeyboardManager;

    .line 26
    .line 27
    iget-object v0, v1, Lio/flutter/embedding/android/KeyboardManager$PerEventCallbackBuilder;->keyEvent:Landroid/view/KeyEvent;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Lio/flutter/embedding/android/KeyboardManager;->access$000(Lio/flutter/embedding/android/KeyboardManager;Landroid/view/KeyEvent;)V

    .line 31
    :cond_0
    return-void

    .line 32
    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "The onKeyEventHandledCallback should be called exactly once."

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    throw p1
.end method
