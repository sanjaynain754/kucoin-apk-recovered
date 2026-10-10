.class Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager$SingleHolder;
.super Ljava/lang/Object;
.source "RequestExperimentTaskRecorderManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SingleHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;-><init>(Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager$1;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager$SingleHolder;->INSTANCE:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

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
    .line 18
    .line 19
    .line 20
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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static synthetic access$100()Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager$SingleHolder;->INSTANCE:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

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
.end method
