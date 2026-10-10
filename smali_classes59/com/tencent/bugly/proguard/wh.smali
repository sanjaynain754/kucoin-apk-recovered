.class public final Lcom/tencent/bugly/proguard/wh;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/tg;",
            ">;"
        }
    .end annotation
.end field

.field public static w:Ljava/util/Map;
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

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/tg;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/util/Map;
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
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/tencent/bugly/proguard/wh;->q:B

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->s:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(BLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/tg;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 8
    iput-byte p1, p0, Lcom/tencent/bugly/proguard/wh;->q:B

    .line 9
    iput-object p2, p0, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lcom/tencent/bugly/proguard/wh;->s:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    .line 12
    iput-object p5, p0, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 3

    .line 11
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/wh;->q:B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(BIZ)B

    move-result v0

    iput-byte v0, p0, Lcom/tencent/bugly/proguard/wh;->q:B

    .line 12
    invoke-virtual {p1, v2, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    const/4 v0, 0x2

    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->s:Ljava/lang/String;

    .line 14
    sget-object v0, Lcom/tencent/bugly/proguard/wh;->v:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/bugly/proguard/wh;->v:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/tg;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/tg;-><init>()V

    .line 17
    sget-object v2, Lcom/tencent/bugly/proguard/wh;->v:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/wh;->v:Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    .line 19
    sget-object v0, Lcom/tencent/bugly/proguard/wh;->w:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tencent/bugly/proguard/wh;->w:Ljava/util/Map;

    .line 21
    const-string v2, ""

    invoke-virtual {v0, v2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/wh;->w:Ljava/util/Map;

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/wh;->q:B

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wh;->r:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wh;->s:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wh;->t:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wh;->u:Ljava/util/Map;

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    :cond_3
    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 0

    .line 1
    return-void
.end method
