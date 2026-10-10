.class Landroidx/paging/DataSource$LoadCallbackHelper$1;
.super Ljava/lang/Object;
.source "DataSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/DataSource$LoadCallbackHelper;->dispatchResultToReceiver(Landroidx/paging/PageResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/DataSource$LoadCallbackHelper;

.field final synthetic val$result:Landroidx/paging/PageResult;


# direct methods
.method public constructor <init>(Landroidx/paging/DataSource$LoadCallbackHelper;Landroidx/paging/PageResult;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/DataSource$LoadCallbackHelper$1;->this$0:Landroidx/paging/DataSource$LoadCallbackHelper;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/paging/DataSource$LoadCallbackHelper$1;->val$result:Landroidx/paging/PageResult;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/DataSource$LoadCallbackHelper$1;->this$0:Landroidx/paging/DataSource$LoadCallbackHelper;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/paging/DataSource$LoadCallbackHelper;->mReceiver:Landroidx/paging/PageResult$Receiver;

    .line 5
    .line 6
    iget v0, v0, Landroidx/paging/DataSource$LoadCallbackHelper;->mResultType:I

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/paging/DataSource$LoadCallbackHelper$1;->val$result:Landroidx/paging/PageResult;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0, v2}, Landroidx/paging/PageResult$Receiver;->onPageResult(ILandroidx/paging/PageResult;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
