.class Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;
.super Ljava/lang/Object;
.source "EditState.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EditBinding"
.end annotation


# instance fields
.field private mAlive:Z

.field private volatile mDying:Z

.field private final mEdit:Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;

.field private final mHandler:Landroid/os/Handler;

.field private final mViewRoot:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;Landroid/os/Handler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mEdit:Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;

    .line 6
    .line 7
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mViewRoot:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mHandler:Landroid/os/Handler;

    .line 15
    const/4 p2, 0x1

    .line 16
    .line 17
    iput-boolean p2, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mAlive:Z

    .line 18
    const/4 p2, 0x0

    .line 19
    .line 20
    iput-boolean p2, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mDying:Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 28
    move-result p2

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->run()V

    .line 37
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

.method private cleanUp()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mAlive:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mViewRoot:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mEdit:Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->cleanup()V

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mAlive:Z

    .line 36
    return-void
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


# virtual methods
.method public kill()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mDying:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mHandler:Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onGlobalLayout()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->run()V

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
.end method

.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mAlive:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mViewRoot:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mDying:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_1
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mEdit:Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/ViewVisitor;->visit(Landroid/view/View;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mHandler:Landroid/os/Handler;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->mHandler:Landroid/os/Handler;

    .line 33
    .line 34
    const-wide/16 v1, 0x1388

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/EditState$EditBinding;->cleanUp()V

    .line 42
    return-void
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
