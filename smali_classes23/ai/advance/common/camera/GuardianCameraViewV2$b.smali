.class public Lai/advance/common/camera/GuardianCameraViewV2$b;
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
.field public final synthetic b:F

.field public final synthetic c:Lai/advance/common/camera/GuardianCameraViewV2;


# direct methods
.method public constructor <init>(Lai/advance/common/camera/GuardianCameraViewV2;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->c:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 3
    .line 4
    iput p2, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->b:F

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->c:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->W(Landroid/hardware/Camera$Size;)F

    .line 6
    move-result p1

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->c:Lai/advance/common/camera/GuardianCameraViewV2;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lai/advance/common/camera/GuardianCameraViewV2;->W(Landroid/hardware/Camera$Size;)F

    .line 12
    move-result p2

    .line 13
    .line 14
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->b:F

    .line 15
    sub-float/2addr v0, p1

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 19
    move-result p1

    .line 20
    .line 21
    iget v0, p0, Lai/advance/common/camera/GuardianCameraViewV2$b;->b:F

    .line 22
    sub-float/2addr v0, p2

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 26
    move-result p2

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 30
    move-result p1

    .line 31
    return p1
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
    invoke-virtual {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV2$b;->a(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I

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
