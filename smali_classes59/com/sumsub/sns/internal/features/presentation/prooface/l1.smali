.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/l1;
.super Lcom/sumsub/sns/internal/features/presentation/prooface/m1;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;Lcom/sumsub/sns/internal/features/presentation/prooface/k1;Lcom/sumsub/sns/internal/features/presentation/prooface/e1;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/m1;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 22
    .line 23
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result p1

    .line 39
    .line 40
    if-nez p1, :cond_4

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/e1;->hashCode()I

    .line 27
    move-result v0

    .line 28
    :goto_0
    add-int/2addr v1, v0

    .line 29
    return v1
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceViewModel$Icon;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k1;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/l1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/e1;

    .line 7
    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v4, "SessionResult(icon="

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, ", content="

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
    const-string v0, ", tryAgainButtonState="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
