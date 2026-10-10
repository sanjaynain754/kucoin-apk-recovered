.class public final Lcom/tencent/bugly/proguard/tg;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"


# static fields
.field public static y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public q:J

.field public r:B

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public w:Ljava/lang/String;

.field public x:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/tg;->y:Ljava/util/Map;

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/tg;->q:J

    const/4 v0, 0x0

    .line 3
    iput-byte v0, p0, Lcom/tencent/bugly/proguard/tg;->r:B

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->u:Ljava/lang/String;

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->w:Ljava/lang/String;

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/tg;->x:Z

    return-void
.end method

.method public constructor <init>(JBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JB",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 11
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/tg;->q:J

    .line 12
    iput-byte p3, p0, Lcom/tencent/bugly/proguard/tg;->r:B

    .line 13
    iput-object p4, p0, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    .line 14
    iput-object p5, p0, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    .line 15
    iput-object p6, p0, Lcom/tencent/bugly/proguard/tg;->u:Ljava/lang/String;

    .line 16
    iput-object p7, p0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    .line 17
    iput-object p8, p0, Lcom/tencent/bugly/proguard/tg;->w:Ljava/lang/String;

    .line 18
    iput-boolean p9, p0, Lcom/tencent/bugly/proguard/tg;->x:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 4

    .line 14
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/tg;->q:J

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/ka;->a(JIZ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/tg;->q:J

    .line 15
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/tg;->r:B

    invoke-virtual {p1, v0, v3, v3}, Lcom/tencent/bugly/proguard/ka;->a(BIZ)B

    move-result v0

    iput-byte v0, p0, Lcom/tencent/bugly/proguard/tg;->r:B

    const/4 v0, 0x2

    .line 16
    invoke-virtual {p1, v0, v2}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    const/4 v0, 0x3

    .line 17
    invoke-virtual {p1, v0, v2}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    const/4 v0, 0x4

    .line 18
    invoke-virtual {p1, v0, v2}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->u:Ljava/lang/String;

    .line 19
    sget-object v0, Lcom/tencent/bugly/proguard/tg;->y:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p1, v0, v2}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/tg;->w:Ljava/lang/String;

    .line 21
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/tg;->x:Z

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(ZIZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/tg;->x:Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/tg;->q:J

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    .line 2
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/tg;->r:B

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/tg;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/tg;->t:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/tg;->u:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v1, 0x4

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/tg;->v:Ljava/util/Map;

    if-eqz v0, :cond_3

    const/4 v1, 0x5

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/tg;->w:Ljava/lang/String;

    if-eqz v0, :cond_4

    const/4 v1, 0x6

    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 13
    :cond_4
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/tg;->x:Z

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    return-void
.end method
