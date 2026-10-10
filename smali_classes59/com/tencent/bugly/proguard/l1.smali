.class public Lcom/tencent/bugly/proguard/l1;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lorg/json/JSONArray;

.field public h:Lorg/json/JSONObject;

.field public i:I

.field public j:I

.field public k:F

.field public l:F

.field public m:J

.field public n:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->d:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->e:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->f:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lorg/json/JSONArray;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->g:Lorg/json/JSONArray;

    .line 23
    .line 24
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l1;->h:Lorg/json/JSONObject;

    .line 30
    const/4 v0, 0x0

    .line 31
    .line 32
    iput v0, p0, Lcom/tencent/bugly/proguard/l1;->i:I

    .line 33
    const/4 v0, 0x5

    .line 34
    .line 35
    iput v0, p0, Lcom/tencent/bugly/proguard/l1;->j:I

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    iput v0, p0, Lcom/tencent/bugly/proguard/l1;->k:F

    .line 39
    .line 40
    iput v0, p0, Lcom/tencent/bugly/proguard/l1;->l:F

    .line 41
    .line 42
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/l1;->m:J

    .line 45
    .line 46
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/l1;->n:J

    .line 47
    return-void
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
