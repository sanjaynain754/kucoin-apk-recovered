.class Landroidx/room/RxRoom$1$2;
.super Ljava/lang/Object;
.source "RxRoom.java"

# interfaces
.implements Lio/reactivex/functions/Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/RxRoom$1;->subscribe(Lio/reactivex/FlowableEmitter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/room/RxRoom$1;

.field final synthetic val$observer:Landroidx/room/InvalidationTracker$Observer;


# direct methods
.method public constructor <init>(Landroidx/room/RxRoom$1;Landroidx/room/InvalidationTracker$Observer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/room/RxRoom$1$2;->this$0:Landroidx/room/RxRoom$1;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/room/RxRoom$1$2;->val$observer:Landroidx/room/InvalidationTracker$Observer;

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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/room/RxRoom$1$2;->this$0:Landroidx/room/RxRoom$1;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/room/RxRoom$1;->val$database:Landroidx/room/RoomDatabase;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/room/RxRoom$1$2;->val$observer:Landroidx/room/InvalidationTracker$Observer;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/room/InvalidationTracker;->removeObserver(Landroidx/room/InvalidationTracker$Observer;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method
