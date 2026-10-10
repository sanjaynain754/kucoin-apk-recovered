.class La3d20260409/OOOoooooo;
.super Lai/advance/common/camera/GuardianCameraViewV3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3d20260409/OOOoooooo$a;
    }
.end annotation


# instance fields
.field public F:Lg/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV3;-><init>(Landroid/content/Context;)V

    .line 4
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public H0(Lg/e;La3d20260409/OOOoooooo$a;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/OOOoooooo;->F:Lg/e;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "op_bk_start"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lf/h;->G(Ljava/lang/String;Lg/e;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lk/c;->d()I

    .line 16
    move-result v0

    .line 17
    .line 18
    new-instance v1, La3d20260409/OOOoooooo$b;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0, p2, p1, v0}, La3d20260409/OOOoooooo$b;-><init>(La3d20260409/OOOoooooo;La3d20260409/OOOoooooo$a;Lg/e;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lai/advance/common/camera/GuardianCameraViewV3;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 25
    return-void
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

.method public L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Landroid/hardware/Camera$Size;

    .line 12
    return-object p1
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
