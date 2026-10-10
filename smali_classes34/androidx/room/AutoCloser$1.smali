.class Landroidx/room/AutoCloser$1;
.super Ljava/lang/Object;
.source "AutoCloser.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/room/AutoCloser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/room/AutoCloser;


# direct methods
.method public constructor <init>(Landroidx/room/AutoCloser;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/room/AutoCloser$1;->this$0:Landroidx/room/AutoCloser;

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
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/room/AutoCloser$1;->this$0:Landroidx/room/AutoCloser;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/room/AutoCloser;->mExecutor:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/room/AutoCloser;->mAutoCloser:Ljava/lang/Runnable;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
