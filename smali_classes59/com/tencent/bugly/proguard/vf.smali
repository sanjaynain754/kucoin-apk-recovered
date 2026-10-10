.class public final Lcom/tencent/bugly/proguard/vf;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"


# static fields
.field public static y:[B

.field public static z:Ljava/util/Map;
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
.field public q:B

.field public r:I

.field public s:[B

.field public t:Ljava/lang/String;

.field public u:J

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    sput-object v0, Lcom/tencent/bugly/proguard/vf;->y:[B

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    aput-byte v1, v0, v1

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/bugly/proguard/vf;->z:Ljava/util/Map;

    .line 16
    .line 17
    const-string v1, ""

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-void
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
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/tencent/bugly/proguard/vf;->q:B

    .line 3
    iput v0, p0, Lcom/tencent/bugly/proguard/vf;->r:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->s:[B

    .line 5
    const-string v1, ""

    iput-object v1, p0, Lcom/tencent/bugly/proguard/vf;->t:Ljava/lang/String;

    const-wide/16 v2, 0x0

    .line 6
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/vf;->u:J

    .line 7
    iput-object v1, p0, Lcom/tencent/bugly/proguard/vf;->v:Ljava/lang/String;

    .line 8
    iput-object v1, p0, Lcom/tencent/bugly/proguard/vf;->w:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->x:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(BI[BLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(BI[B",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 11
    iput-byte p1, p0, Lcom/tencent/bugly/proguard/vf;->q:B

    .line 12
    iput p2, p0, Lcom/tencent/bugly/proguard/vf;->r:I

    .line 13
    iput-object p3, p0, Lcom/tencent/bugly/proguard/vf;->s:[B

    .line 14
    iput-object p4, p0, Lcom/tencent/bugly/proguard/vf;->t:Ljava/lang/String;

    .line 15
    iput-wide p5, p0, Lcom/tencent/bugly/proguard/vf;->u:J

    .line 16
    iput-object p7, p0, Lcom/tencent/bugly/proguard/vf;->v:Ljava/lang/String;

    .line 17
    iput-object p8, p0, Lcom/tencent/bugly/proguard/vf;->w:Ljava/lang/String;

    .line 18
    iput-object p9, p0, Lcom/tencent/bugly/proguard/vf;->x:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 4

    .line 14
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/vf;->q:B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(BIZ)B

    move-result v0

    iput-byte v0, p0, Lcom/tencent/bugly/proguard/vf;->q:B

    .line 15
    iget v0, p0, Lcom/tencent/bugly/proguard/vf;->r:I

    invoke-virtual {p1, v0, v2, v2}, Lcom/tencent/bugly/proguard/ka;->a(IIZ)I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/vf;->r:I

    .line 16
    sget-object v0, Lcom/tencent/bugly/proguard/vf;->y:[B

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a([BIZ)[B

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->s:[B

    const/4 v0, 0x3

    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->t:Ljava/lang/String;

    .line 18
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/vf;->u:J

    const/4 v0, 0x4

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/tencent/bugly/proguard/ka;->a(JIZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/vf;->u:J

    const/4 v0, 0x5

    .line 19
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->v:Ljava/lang/String;

    const/4 v0, 0x6

    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/vf;->w:Ljava/lang/String;

    .line 21
    sget-object v0, Lcom/tencent/bugly/proguard/vf;->z:Ljava/util/Map;

    const/4 v2, 0x7

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/vf;->x:Ljava/util/Map;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 3

    .line 1
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/vf;->q:B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/vf;->r:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vf;->s:[B

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a([BI)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vf;->t:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 7
    :cond_1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/vf;->u:J

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vf;->v:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v1, 0x5

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vf;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/4 v1, 0x6

    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/vf;->x:Ljava/util/Map;

    if-eqz v0, :cond_4

    const/4 v1, 0x7

    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    :cond_4
    return-void
.end method
