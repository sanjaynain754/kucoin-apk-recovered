.class public final Lcom/tencent/bugly/proguard/ag;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ag;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ag;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    .line 5
    invoke-virtual {p1, v1, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/ag;->r:Ljava/lang/String;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ag;->q:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ag;->r:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 0

    .line 1
    return-void
.end method
