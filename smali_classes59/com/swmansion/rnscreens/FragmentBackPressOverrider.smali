.class public final Lcom/swmansion/rnscreens/FragmentBackPressOverrider;
.super Ljava/lang/Object;
.source "FragmentBackPressOverrider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/FragmentBackPressOverrider;",
        "",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "onBackPressedCallback",
        "Landroidx/activity/OnBackPressedCallback;",
        "<init>",
        "(Landroidx/fragment/app/Fragment;Landroidx/activity/OnBackPressedCallback;)V",
        "isCallbackAdded",
        "",
        "overrideBackAction",
        "getOverrideBackAction",
        "()Z",
        "setOverrideBackAction",
        "(Z)V",
        "maybeAddBackCallback",
        "",
        "removeBackCallbackIfAdded",
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
.field private final fragment:Landroidx/fragment/app/Fragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isCallbackAdded:Z

.field private final onBackPressedCallback:Landroidx/activity/OnBackPressedCallback;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private overrideBackAction:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/OnBackPressedCallback;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/activity/OnBackPressedCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "onBackPressedCallback"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->fragment:Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->onBackPressedCallback:Landroidx/activity/OnBackPressedCallback;

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->overrideBackAction:Z

    .line 22
    return-void
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


# virtual methods
.method public final getOverrideBackAction()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->overrideBackAction:Z

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

.method public final maybeAddBackCallback()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->isCallbackAdded:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->overrideBackAction:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->fragment:Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->fragment:Landroidx/fragment/app/Fragment;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->onBackPressedCallback:Landroidx/activity/OnBackPressedCallback;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->isCallbackAdded:Z

    .line 33
    :cond_1
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
.end method

.method public final removeBackCallbackIfAdded()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->isCallbackAdded:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->onBackPressedCallback:Landroidx/activity/OnBackPressedCallback;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/activity/OnBackPressedCallback;->remove()V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->isCallbackAdded:Z

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final setOverrideBackAction(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/FragmentBackPressOverrider;->overrideBackAction:Z

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
