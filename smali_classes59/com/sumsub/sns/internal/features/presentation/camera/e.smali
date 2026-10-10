.class public final Lcom/sumsub/sns/internal/features/presentation/camera/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Z

.field public final b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

.field public final c:Landroid/util/Size;

.field public final d:Lcom/sumsub/sns/internal/core/presentation/camera/b;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 6
    :cond_0
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>()V

    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/e;-><init>(ZLcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;Lcom/sumsub/sns/internal/core/presentation/camera/b;)V

    return-void
.end method

.method public constructor <init>(ZLcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;Lcom/sumsub/sns/internal/core/presentation/camera/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

    .line 5
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 15
    .line 16
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 22
    .line 23
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 24
    .line 25
    if-eq v1, v3, :cond_3

    .line 26
    return v2

    .line 27
    .line 28
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

    .line 29
    .line 30
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    return v2

    .line 38
    .line 39
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 42
    .line 43
    .line 44
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    move-result p1

    .line 46
    .line 47
    if-nez p1, :cond_5

    .line 48
    return v2

    .line 49
    :cond_5
    return v0
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
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 6
    move-result v0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

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
    invoke-virtual {v0}, Landroid/util/Size;->hashCode()I

    .line 27
    move-result v0

    .line 28
    :goto_0
    add-int/2addr v1, v0

    .line 29
    .line 30
    mul-int/lit8 v1, v1, 0x1f

    .line 31
    .line 32
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/b;->hashCode()I

    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    return v0
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
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 9
    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v5, "Config(isFrontFacingCamera="

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v0, ", cameraMode="

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, ", frameSize="

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v0, ", videoParams="

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, ")"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    return-object v0
    .line 56
    .line 57
.end method
