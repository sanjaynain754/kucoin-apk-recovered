.class Landroidx/loader/content/ModernAsyncTask$1;
.super Ljava/lang/Object;
.source "ModernAsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/loader/content/ModernAsyncTask;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/loader/content/ModernAsyncTask;


# direct methods
.method public constructor <init>(Landroidx/loader/content/ModernAsyncTask;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/loader/content/ModernAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/loader/content/ModernAsyncTask;->doInBackground()Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/loader/content/ModernAsyncTask;->postResult(Ljava/lang/Object;)V

    .line 29
    return-object v2

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    .line 32
    :try_start_1
    iget-object v3, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 33
    .line 34
    iget-object v3, v3, Landroidx/loader/content/ModernAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/loader/content/ModernAsyncTask$1;->this$0:Landroidx/loader/content/ModernAsyncTask;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroidx/loader/content/ModernAsyncTask;->postResult(Ljava/lang/Object;)V

    .line 45
    throw v0
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
.end method
