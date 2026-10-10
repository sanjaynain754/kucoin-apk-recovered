.class public final Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;
.super Lcom/facebook/react/uimanager/LayoutShadowNode;
.source "ScreenStackHeaderConfigShadowNode.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\t\"\u0004\u0008\u0011\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        "context",
        "Lcom/facebook/react/bridge/ReactContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "paddingStart",
        "",
        "getPaddingStart",
        "()F",
        "setPaddingStart",
        "(F)V",
        "paddingEnd",
        "getPaddingEnd",
        "setPaddingEnd",
        "height",
        "getHeight",
        "setHeight",
        "setLocalData",
        "",
        "data",
        "",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private context:Lcom/facebook/react/bridge/ReactContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private height:F

.field private paddingEnd:F

.field private paddingStart:F


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReactContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/uimanager/LayoutShadowNode;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->context:Lcom/facebook/react/bridge/ReactContext;

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
.end method


# virtual methods
.method public final getHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->height:F

    .line 3
    return v0
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
.end method

.method public final getPaddingEnd()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingEnd:F

    .line 3
    return v0
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
.end method

.method public final getPaddingStart()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingStart:F

    .line 3
    return v0
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
.end method

.method public final setHeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->height:F

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
.end method

.method public setLocalData(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    instance-of v0, p1, Lcom/swmansion/rnscreens/utils/PaddingBundle;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/swmansion/rnscreens/utils/PaddingBundle;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/utils/PaddingBundle;->getPaddingStart()F

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingStart:F

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/utils/PaddingBundle;->getPaddingEnd()F

    .line 16
    move-result v0

    .line 17
    .line 18
    iput v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingEnd:F

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/utils/PaddingBundle;->getHeight()F

    .line 22
    move-result p1

    .line 23
    .line 24
    iput p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->height:F

    .line 25
    const/4 p1, 0x4

    .line 26
    .line 27
    iget v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingStart:F

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 31
    const/4 p1, 0x5

    .line 32
    .line 33
    iget v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingEnd:F

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 37
    .line 38
    iget p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->height:F

    .line 39
    neg-float p1, p1

    .line 40
    const/4 v0, 0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPosition(IF)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setLocalData(Ljava/lang/Object;)V

    .line 48
    return-void
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

.method public final setPaddingEnd(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingEnd:F

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
.end method

.method public final setPaddingStart(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigShadowNode;->paddingStart:F

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
.end method
