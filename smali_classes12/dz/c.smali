.class public Ldz/c;
.super Ljava/lang/Object;
.source "KuCoinLooperTask.java"

# interfaces
.implements Landroidx/lifecycle/LifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldz/c$b;
    }
.end annotation


# instance fields
.field public b:Z

.field public c:Lcom/kubi/sdk/base/ui/OldBaseFragment;

.field public d:J

.field public e:Ljava/lang/Runnable;

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ldz/c$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Ldz/c;->b:Z

    .line 4
    invoke-static {p1}, Ldz/c$b;->a(Ldz/c$b;)J

    move-result-wide v0

    iput-wide v0, p0, Ldz/c;->d:J

    .line 5
    invoke-static {p1}, Ldz/c$b;->b(Ldz/c$b;)Ljava/lang/Runnable;

    move-result-object v0

    iput-object v0, p0, Ldz/c;->e:Ljava/lang/Runnable;

    .line 6
    invoke-static {p1}, Ldz/c$b;->c(Ldz/c$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldz/c;->f:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Ldz/c$b;->d(Ldz/c$b;)Lcom/kubi/sdk/base/ui/OldBaseFragment;

    move-result-object v0

    iput-object v0, p0, Ldz/c;->c:Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 8
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    instance-of v0, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;

    if-eqz v0, :cond_0

    .line 10
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    check-cast v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;

    invoke-virtual {v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->isCurrentlyVisible()Z

    move-result v0

    iput-boolean v0, p0, Ldz/c;->b:Z

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    instance-of v0, v0, Lcom/kubi/sdk/base/ui/BaseUiActivity;

    if-eqz v0, :cond_1

    .line 12
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    check-cast v0, Lcom/kubi/sdk/base/ui/BaseUiActivity;

    invoke-virtual {v0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->d0()Z

    move-result v0

    iput-boolean v0, p0, Ldz/c;->b:Z

    .line 13
    :cond_1
    :goto_0
    invoke-static {p1}, Ldz/c$b;->e(Ldz/c$b;)Landroidx/lifecycle/LifecycleOwner;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    :cond_2
    return-void
.end method

.method public synthetic constructor <init>(Ldz/c$b;Ldz/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldz/c;-><init>(Ldz/c$b;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Runnable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldz/c;->e:Ljava/lang/Runnable;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public b()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Ldz/c;->d:J

    .line 3
    return-wide v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldz/c;->f:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ldz/c;->b:Z

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
.end method

.method public e(Lcom/kubi/sdk/base/ui/OldBaseFragment;Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldz/c;->c:Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iput-boolean p2, p0, Ldz/c;->b:Z

    .line 13
    :cond_0
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
.end method

.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/OnLifecycleEvent;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Ldz/c;->b:Z

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/sdk/function/looper/KuCoinLooper;->INSTANCE:Lcom/kubi/sdk/function/looper/KuCoinLooper;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/kubi/sdk/function/looper/KuCoinLooper;->removeTask(Ldz/c;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 16
    return-void
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

.method public onResume(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 2
    .annotation runtime Landroidx/lifecycle/OnLifecycleEvent;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/sdk/base/ui/OldBaseActivity;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Ldz/c;->b:Z

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    instance-of v0, p1, Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, Lcom/kubi/sdk/base/ui/OldBaseFragment;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isHidden()Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput-boolean v1, p0, Ldz/c;->b:Z

    .line 29
    :cond_1
    return-void
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

.method public onStop(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/OnLifecycleEvent;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    iput-boolean p1, p0, Ldz/c;->b:Z

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
