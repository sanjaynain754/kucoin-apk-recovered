.class Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;
.super Ljava/lang/Object;
.source "ReactTextInputManager.java"

# interfaces
.implements Lcom/facebook/react/views/textinput/SelectionWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReactSelectionWatcher"
.end annotation


# instance fields
.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private mPreviousSelectionEnd:I

.field private mPreviousSelectionStart:I

.field private final mReactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private final mSurfaceId:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mReactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getReactContext(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 19
    move-result p1

    .line 20
    .line 21
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mSurfaceId:I

    .line 22
    return-void
    .line 23
.end method


# virtual methods
.method public onSelectionChanged(II)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 8
    move-result p1

    .line 9
    .line 10
    iget p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mPreviousSelectionStart:I

    .line 11
    .line 12
    if-ne p2, v0, :cond_1

    .line 13
    .line 14
    iget p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mPreviousSelectionEnd:I

    .line 15
    .line 16
    if-eq p2, p1, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 21
    .line 22
    new-instance v1, Lcom/facebook/react/views/textinput/ReactTextInputSelectionEvent;

    .line 23
    .line 24
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mSurfaceId:I

    .line 25
    .line 26
    iget-object v3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mReactEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 30
    move-result v3

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v2, v3, v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputSelectionEvent;-><init>(IIII)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 37
    .line 38
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mPreviousSelectionStart:I

    .line 39
    .line 40
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactSelectionWatcher;->mPreviousSelectionEnd:I

    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
.end method
