.class public final Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "ReactSafeAreaView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;->updateState(Landroidx/core/graphics/Insets;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2",
        "Lcom/facebook/react/bridge/GuardedRunnable;",
        "runGuarded",
        "",
        "ReactAndroid_release"
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
.field final synthetic $insets:Landroidx/core/graphics/Insets;

.field final synthetic this$0:Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;Landroidx/core/graphics/Insets;Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;->this$0:Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;->$insets:Landroidx/core/graphics/Insets;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p3}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 8
    return-void
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
.end method


# virtual methods
.method public runGuarded()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;->this$0:Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    .line 19
    check-cast v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;->this$0:Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 27
    move-result v2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaView$updateState$2;->$insets:Landroidx/core/graphics/Insets;

    .line 30
    .line 31
    iget v3, v0, Landroidx/core/graphics/Insets;->top:I

    .line 32
    .line 33
    iget v4, v0, Landroidx/core/graphics/Insets;->left:I

    .line 34
    .line 35
    iget v5, v0, Landroidx/core/graphics/Insets;->bottom:I

    .line 36
    .line 37
    iget v6, v0, Landroidx/core/graphics/Insets;->right:I

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {v1 .. v6}, Lcom/facebook/react/uimanager/UIManagerModule;->updateInsetsPadding(IIIII)V

    .line 41
    :cond_0
    return-void
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
.end method
