.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H2;


# instance fields
.field public final a:F

.field public final b:I

.field public final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H2;

    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x40400000    # 3.0f

    .line 2
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 4
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    return-void
.end method

.method public constructor <init>(FIF)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 7
    iput p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 8
    iput p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    return-void
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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;

    .line 13
    .line 14
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 15
    .line 16
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 26
    .line 27
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 28
    .line 29
    if-eq v1, v3, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    .line 33
    .line 34
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    .line 35
    .line 36
    .line 37
    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    .line 38
    move-result p1

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    return v2

    .line 42
    :cond_4
    return v0
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
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
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

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->a:F

    .line 3
    .line 4
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->b:I

    .line 5
    .line 6
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/I2;->c:F

    .line 7
    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v4, "W2AskToTiltDocumentOnSeamlessConfig(tiltAnimationCycleDurationSec="

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, ", tiltAnimationNumberOfCycles="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, ", tiltWaitAfterAnimationSec="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

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
