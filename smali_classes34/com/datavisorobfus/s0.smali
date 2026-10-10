.class public Lcom/datavisorobfus/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:[B

.field public c:I

.field public d:J

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/datavisorobfus/s0;->b:[B

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    iput v1, p0, Lcom/datavisorobfus/s0;->c:I

    .line 12
    .line 13
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/datavisorobfus/s0;->d:J

    .line 16
    .line 17
    iput-object v0, p0, Lcom/datavisorobfus/s0;->f:Ljava/lang/Throwable;

    .line 18
    return-void
.end method
