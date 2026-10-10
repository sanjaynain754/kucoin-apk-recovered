.class public Lcom/swmansion/worklets/AndroidUIScheduler$a;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "AndroidUIScheduler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/worklets/AndroidUIScheduler;->scheduleTriggerOnUI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/swmansion/worklets/AndroidUIScheduler;


# direct methods
.method public constructor <init>(Lcom/swmansion/worklets/AndroidUIScheduler;Lcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/worklets/AndroidUIScheduler$a;->b:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

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
.method public runGuarded()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/worklets/AndroidUIScheduler$a;->b:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/swmansion/worklets/AndroidUIScheduler;->b(Lcom/swmansion/worklets/AndroidUIScheduler;)Ljava/lang/Runnable;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
