.class public final Lcom/sumsub/sns/internal/features/data/model/prooface/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:[Lkotlin/Lazy;

.field public static final e:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

.field public static final f:Lcom/sumsub/sns/internal/features/data/model/prooface/c;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/prooface/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/b;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/prooface/a0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/prooface/a0;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x3

    .line 21
    .line 22
    new-array v2, v2, [Lkotlin/Lazy;

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    aput-object v1, v2, v3

    .line 26
    const/4 v3, 0x1

    .line 27
    .line 28
    aput-object v0, v2, v3

    .line 29
    const/4 v0, 0x2

    .line 30
    .line 31
    aput-object v1, v2, v0

    .line 32
    .line 33
    sput-object v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->d:[Lkotlin/Lazy;

    .line 34
    .line 35
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 36
    .line 37
    .line 38
    const-string/jumbo v3, "skipped"

    .line 39
    const/4 v4, 0x6

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/features/data/model/prooface/c;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 43
    .line 44
    sput-object v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 45
    .line 46
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 47
    .line 48
    const-string v3, "fail"

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, v3, v1, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/c;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 52
    .line 53
    sput-object v2, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->f:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    return-void

    :cond_2
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;I)V
    .locals 2

    and-int/lit8 v0, p3, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "Zero calibration range"

    .line 2
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    .line 5
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/d;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_4

    .line 45
    return v2

    .line 46
    :cond_4
    return v0
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

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    goto :goto_2

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 35
    move-result v1

    .line 36
    :goto_2
    add-int/2addr v0, v1

    .line 37
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->b:Ljava/util/List;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/prooface/c;->c:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v4, "Calibration(status="

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, ", values="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, ", error="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, ")"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    return-object v0
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
