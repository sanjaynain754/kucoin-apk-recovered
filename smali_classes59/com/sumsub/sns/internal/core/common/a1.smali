.class public final Lcom/sumsub/sns/internal/core/common/a1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final a(D)J
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sort(Ljava/util/List;)V

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 13
    .line 14
    :cond_0
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 15
    div-double/2addr p1, v2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    move-result v0

    .line 22
    sub-int/2addr v0, v1

    .line 23
    int-to-double v0, v0

    .line 24
    mul-double/2addr p1, v0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 28
    move-result p1

    .line 29
    .line 30
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-ltz p1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 36
    move-result v0

    .line 37
    .line 38
    if-ge p1, v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_1
    const-wide/16 p1, -0x1

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 55
    move-result-wide p1

    .line 56
    return-wide p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
