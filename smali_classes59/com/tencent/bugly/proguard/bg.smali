.class public final Lcom/tencent/bugly/proguard/bg;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static C:Lcom/tencent/bugly/proguard/ag; = null

.field public static D:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic E:Z = true


# instance fields
.field public A:I

.field public B:I

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Lcom/tencent/bugly/proguard/ag;

.field public w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public x:J

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/ag;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ag;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/bg;->C:Lcom/tencent/bugly/proguard/ag;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/bg;->D:Ljava/util/Map;

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    return-void
    .line 21
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
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    .line 8
    iput-object v1, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    const-wide/16 v1, 0x0

    .line 9
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    .line 13
    iput v0, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    return-void
.end method

.method public constructor <init>(ZZZLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ag;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/ag;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 15
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    .line 16
    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    .line 17
    iput-boolean p3, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    .line 18
    iput-object p4, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    .line 19
    iput-object p5, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    .line 20
    iput-object p6, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    .line 21
    iput-object p7, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    .line 22
    iput-wide p8, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    .line 23
    iput-object p10, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    .line 24
    iput-object p11, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    .line 25
    iput p12, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    .line 26
    iput p13, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    return-void
.end method

.method public a(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/ag;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 4

    .line 24
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(ZIZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    .line 25
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    invoke-virtual {p1, v0, v2, v2}, Lcom/tencent/bugly/proguard/ka;->a(ZIZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    .line 26
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    const/4 v3, 0x2

    invoke-virtual {p1, v0, v3, v2}, Lcom/tencent/bugly/proguard/ka;->a(ZIZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    const/4 v0, 0x3

    .line 27
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    const/4 v0, 0x4

    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    .line 29
    sget-object v0, Lcom/tencent/bugly/proguard/bg;->C:Lcom/tencent/bugly/proguard/ag;

    const/4 v2, 0x5

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->b(Lcom/tencent/bugly/proguard/JceStruct;IZ)Lcom/tencent/bugly/proguard/JceStruct;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/ag;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    .line 30
    sget-object v0, Lcom/tencent/bugly/proguard/bg;->D:Ljava/util/Map;

    const/4 v2, 0x6

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    .line 31
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    const/4 v0, 0x7

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/tencent/bugly/proguard/ka;->a(JIZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    const/16 v0, 0x8

    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    const/16 v0, 0x9

    .line 33
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    .line 34
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    const/16 v2, 0xa

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(IIZ)I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    .line 35
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    const/16 v2, 0xb

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/ka;->a(IIZ)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 3

    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    .line 8
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x4

    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    if-eqz v0, :cond_2

    const/4 v1, 0x5

    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Lcom/tencent/bugly/proguard/JceStruct;I)V

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    if-eqz v0, :cond_3

    const/4 v1, 0x6

    .line 16
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 17
    :cond_3
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    const/4 v2, 0x7

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    if-eqz v0, :cond_4

    const/16 v1, 0x8

    .line 19
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 20
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    if-eqz v0, :cond_5

    const/16 v1, 0x9

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 22
    :cond_5
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 23
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    const/16 v1, 0xb

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(II)V

    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 36
    new-instance v0, Lcom/tencent/bugly/proguard/JceDisplayer;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 37
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    const-string p2, "enable"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ZLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 38
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    const-string p2, "enableUserInfo"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ZLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 39
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    const-string p2, "enableQuery"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ZLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 40
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    const-string/jumbo p2, "url"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 41
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    const-string p2, "expUrl"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 42
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    const-string/jumbo p2, "security"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Lcom/tencent/bugly/proguard/JceStruct;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 43
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    const-string/jumbo p2, "valueMap"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 44
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    const-string/jumbo v1, "strategylastUpdateTime"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 45
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    const-string p2, "httpsUrl"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 46
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    const-string p2, "httpsExpUrl"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 47
    iget p1, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    const-string p2, "eventRecordCount"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 48
    iget p1, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    const-string p2, "eventTimeInterval"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    return-void
.end method

.method public b(Ljava/lang/StringBuilder;I)V
    .locals 3

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/JceDisplayer;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;-><init>(Ljava/lang/StringBuilder;I)V

    .line 4
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(ZZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 5
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(ZZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 6
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(ZZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 9
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Lcom/tencent/bugly/proguard/JceStruct;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Ljava/util/Map;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 11
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    invoke-virtual {v0, v1, v2, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(JZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 13
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 14
    iget p1, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(IZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    .line 15
    iget p1, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/JceDisplayer;->displaySimple(IZ)Lcom/tencent/bugly/proguard/JceDisplayer;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :catch_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/bg;->E:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 17
    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string/jumbo v0, "rqd.RqdStrategy"

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string/jumbo v0, "rqd.RqdStrategy"

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    check-cast p1, Lcom/tencent/bugly/proguard/bg;

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    .line 9
    .line 10
    iget-boolean v2, p1, Lcom/tencent/bugly/proguard/bg;->q:Z

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/ma;->b(ZZ)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

    .line 19
    .line 20
    iget-boolean v2, p1, Lcom/tencent/bugly/proguard/bg;->r:Z

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/ma;->b(ZZ)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

    .line 29
    .line 30
    iget-boolean v2, p1, Lcom/tencent/bugly/proguard/bg;->s:Z

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/ma;->b(ZZ)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    .line 59
    .line 60
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    .line 69
    .line 70
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/bg;->x:J

    .line 79
    .line 80
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/bg;->x:J

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/ma;->b(JJ)Z

    .line 84
    move-result v1

    .line 85
    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v1

    .line 95
    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    iget-object v1, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    move-result v1

    .line 105
    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    iget v1, p0, Lcom/tencent/bugly/proguard/bg;->A:I

    .line 109
    .line 110
    iget v2, p1, Lcom/tencent/bugly/proguard/bg;->A:I

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/ma;->b(II)Z

    .line 114
    move-result v1

    .line 115
    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    iget v1, p0, Lcom/tencent/bugly/proguard/bg;->B:I

    .line 119
    .line 120
    iget p1, p1, Lcom/tencent/bugly/proguard/bg;->B:I

    .line 121
    .line 122
    .line 123
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/ma;->b(II)Z

    .line 124
    move-result p1

    .line 125
    .line 126
    if-eqz p1, :cond_1

    .line 127
    const/4 p1, 0x1

    .line 128
    return p1

    .line 129
    :cond_1
    return v0
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->q:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->s:Z

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

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/bg;->r:Z

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

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/Exception;

    .line 3
    .line 4
    const-string v1, "Need define key first!"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 8
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method public i()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->A:I

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

.method public j()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/bg;->B:I

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

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->u:Ljava/lang/String;

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

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->z:Ljava/lang/String;

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

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->y:Ljava/lang/String;

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

.method public n()Lcom/tencent/bugly/proguard/ag;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->v:Lcom/tencent/bugly/proguard/ag;

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

.method public o()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/bg;->x:J

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
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->t:Ljava/lang/String;

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

.method public q()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bg;->w:Ljava/util/Map;

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
