.class Lcom/tencent/qcloud/tuicore/EventManager$EventManagerHolder;
.super Ljava/lang/Object;
.source "EventManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/EventManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EventManagerHolder"
.end annotation


# static fields
.field private static final eventManager:Lcom/tencent/qcloud/tuicore/EventManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/qcloud/tuicore/EventManager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/qcloud/tuicore/EventManager;-><init>(Lcom/tencent/qcloud/tuicore/EventManager$1;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/qcloud/tuicore/EventManager$EventManagerHolder;->eventManager:Lcom/tencent/qcloud/tuicore/EventManager;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic access$100()Lcom/tencent/qcloud/tuicore/EventManager;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/qcloud/tuicore/EventManager$EventManagerHolder;->eventManager:Lcom/tencent/qcloud/tuicore/EventManager;

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
.end method
