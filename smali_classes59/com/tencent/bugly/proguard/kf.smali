.class public Lcom/tencent/bugly/proguard/kf;
.super Lcom/tencent/bugly/proguard/xe;
.source "BUGLY"


# static fields
.field public static final i:Ljava/lang/String; = "replay_report"

.field public static final j:Ljava/lang/String; = "enabled"

.field public static final k:Ljava/lang/String; = "quality"

.field public static final l:Ljava/lang/String; = "frame_rate"

.field public static final m:I = 0x1

.field public static final n:I = 0x3

.field public static final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public f:I

.field public g:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

.field public h:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/kf;->o:Ljava/util/Map;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    sget-object v2, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->LOW:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    sget-object v2, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->MEDIUM:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    const/4 v1, 0x3

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    sget-object v2, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->HIGH:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/xe;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/kf;->f:I

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->LOW:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/kf;->g:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 11
    .line 12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/kf;->h:Ljava/lang/Boolean;

    .line 15
    return-void
    .line 16
    .line 17
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string/jumbo v0, "replay_report"

    return-object v0
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/kf;->h:Ljava/lang/Boolean;

    .line 4
    :cond_0
    const-string/jumbo v0, "quality"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lt v0, v2, :cond_1

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    .line 6
    sget-object v1, Lcom/tencent/bugly/proguard/kf;->o:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/kf;->g:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 7
    :cond_1
    const-string v0, "frame_rate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/kf;->f:I

    :cond_2
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/kf;->f:I

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
.end method

.method public c()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kf;->g:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

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
.end method

.method public d()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kf;->h:Ljava/lang/Boolean;

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
.end method
