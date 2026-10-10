.class public final Lcom/tencent/bugly/proguard/s0;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static t:[B


# instance fields
.field public q:B

.field public r:Ljava/lang/String;

.field public s:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/tencent/bugly/proguard/s0;->q:B

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s0;->r:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s0;->s:[B

    return-void
.end method

.method public constructor <init>(BLjava/lang/String;[B)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 6
    iput-byte p1, p0, Lcom/tencent/bugly/proguard/s0;->q:B

    .line 7
    iput-object p2, p0, Lcom/tencent/bugly/proguard/s0;->r:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/tencent/bugly/proguard/s0;->s:[B

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 3

    .line 6
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/s0;->q:B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(BIZ)B

    move-result v0

    iput-byte v0, p0, Lcom/tencent/bugly/proguard/s0;->q:B

    .line 7
    invoke-virtual {p1, v2, v2}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s0;->r:Ljava/lang/String;

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/s0;->t:[B

    if-nez v0, :cond_0

    .line 9
    new-array v0, v2, [B

    sput-object v0, Lcom/tencent/bugly/proguard/s0;->t:[B

    .line 10
    aput-byte v1, v0, v1

    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/s0;->t:[B

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a([BIZ)[B

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/s0;->s:[B

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/s0;->q:B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/s0;->r:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/s0;->s:[B

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a([BI)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 0

    .line 1
    return-void
.end method
