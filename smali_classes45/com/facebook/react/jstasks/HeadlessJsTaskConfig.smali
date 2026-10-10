.class public Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;
.super Ljava/lang/Object;
.source "HeadlessJsTaskConfig.java"


# instance fields
.field private final mAllowedInForeground:Z

.field private final mData:Lcom/facebook/react/bridge/WritableMap;

.field private final mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

.field private final mTaskKey:Ljava/lang/String;

.field private final mTimeout:J


# direct methods
.method public constructor <init>(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iget-object v0, p1, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTaskKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTaskKey:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mData:Lcom/facebook/react/bridge/WritableMap;

    invoke-interface {v0}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mData:Lcom/facebook/react/bridge/WritableMap;

    .line 13
    iget-wide v0, p1, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTimeout:J

    iput-wide v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTimeout:J

    .line 14
    iget-boolean v0, p1, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mAllowedInForeground:Z

    iput-boolean v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mAllowedInForeground:Z

    .line 15
    iget-object p1, p1, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

    if-eqz p1, :cond_0

    .line 16
    invoke-interface {p1}, Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;->copy()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 6

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;J)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V
    .locals 7

    .line 3
    sget-object v6, Lcom/facebook/react/jstasks/NoRetryPolicy;->INSTANCE:Lcom/facebook/react/jstasks/NoRetryPolicy;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTaskKey:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mData:Lcom/facebook/react/bridge/WritableMap;

    .line 7
    iput-wide p3, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTimeout:J

    .line 8
    iput-boolean p5, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mAllowedInForeground:Z

    .line 9
    iput-object p6, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

    return-void
.end method


# virtual methods
.method public getData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mData:Lcom/facebook/react/bridge/WritableMap;

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
.end method

.method public getRetryPolicy()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mRetryPolicy:Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;

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
.end method

.method public getTaskKey()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTaskKey:Ljava/lang/String;

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
.end method

.method public getTimeout()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mTimeout:J

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
.end method

.method public isAllowedInForeground()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;->mAllowedInForeground:Z

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
.end method
