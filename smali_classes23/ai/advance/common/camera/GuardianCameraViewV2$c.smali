.class public Lai/advance/common/camera/GuardianCameraViewV2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai/advance/common/camera/GuardianCameraViewV2;->L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/hardware/Camera$Size;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lai/advance/common/camera/GuardianCameraViewV2;


# direct methods
.method public constructor <init>(Lai/advance/common/camera/GuardianCameraViewV2;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2$c;->b:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a(Landroid/hardware/Camera$Size;)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2$c;->b:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2$c;->b:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->V(Landroid/hardware/Camera$Size;)I

    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    .line 15
    iget-object v1, p0, Lai/advance/common/camera/GuardianCameraViewV2$c;->b:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewHeight()I

    .line 19
    move-result v1

    .line 20
    .line 21
    iget-object v2, p0, Lai/advance/common/camera/GuardianCameraViewV2$c;->b:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->U(Landroid/hardware/Camera$Size;)I

    .line 25
    move-result p1

    .line 26
    sub-int/2addr v1, p1

    .line 27
    add-int/2addr v0, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 31
    move-result p1

    .line 32
    return p1
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
.end method

.method public b(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2$c;->a(Landroid/hardware/Camera$Size;)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lai/advance/common/camera/GuardianCameraViewV2$c;->a(Landroid/hardware/Camera$Size;)I

    .line 9
    move-result p2

    .line 10
    int-to-float p2, p2

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 14
    move-result p1

    .line 15
    return p1
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
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Landroid/hardware/Camera$Size;

    .line 3
    .line 4
    check-cast p2, Landroid/hardware/Camera$Size;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2$c;->b(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I

    .line 8
    move-result p1

    .line 9
    return p1
    .line 10
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
.end method
