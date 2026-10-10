.class public Lcom/tencent/bugly/proguard/s4;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final f:I = -0x1

.field public static final g:I = 0x0

.field public static final h:I = 0x1


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:J

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(III)V
    .locals 6

    const-wide/16 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/s4;-><init>(IIIJ)V

    return-void
.end method

.method public constructor <init>(IIIJ)V
    .locals 7

    .line 2
    const-string v6, ""

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/s4;-><init>(IIIJLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(IIIJLjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/tencent/bugly/proguard/s4;->a:I

    .line 5
    iput p2, p0, Lcom/tencent/bugly/proguard/s4;->b:I

    .line 6
    iput p3, p0, Lcom/tencent/bugly/proguard/s4;->c:I

    .line 7
    iput-wide p4, p0, Lcom/tencent/bugly/proguard/s4;->d:J

    .line 8
    iput-object p6, p0, Lcom/tencent/bugly/proguard/s4;->e:Ljava/lang/String;

    return-void
.end method
