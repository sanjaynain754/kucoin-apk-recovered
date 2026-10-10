.class public La3d20260409/o0o00;
.super Lai/advance/common/camera/GuardianCameraViewV3;
.source "SourceFile"

# interfaces
.implements Lai/advance/common/camera/GuardianCameraViewV2$g;
.implements Lc/a;
.implements Lc/b;
.implements Lwe0/h;
.implements Lwe0/i$a;


# instance fields
.field public F:Lwe0/e;

.field public G:Lwe0/i;

.field public H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwe0/d;",
            ">;"
        }
    .end annotation
.end field

.field public I:J

.field public J:Z

.field public K:La3d20260409/h;

.field public L:Landroid/content/Context;

.field public M:I

.field public N:Lk/e;

.field public O:Laai/liveness/Detector$DetectionType;

.field public P:Le/a;

.field public Q:Landroid/os/Handler;

.field public R:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Laai/liveness/Detector$DetectionType;",
            ">;"
        }
    .end annotation
.end field

.field public S:Lorg/json/JSONArray;

.field public T:Ljava/lang/String;

.field public U:Lg/e;

.field public V:Z

.field public W:J

.field public a0:J

.field public b0:Lwe0/h;

.field public c0:Laai/liveness/Detector$WarnCode;

.field public d0:Laai/liveness/Detector$WarnCode;

.field public e0:I

.field public f0:J

.field public g0:Ljava/lang/String;

.field public h0:Lintl/o0oOOOOOooooo;

.field public i0:Z

.field public j0:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, La3d20260409/o0o00;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, La3d20260409/o0o00;->I:J

    const/4 p1, 0x0

    iput-object p1, p0, La3d20260409/o0o00;->T:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, La3d20260409/o0o00;->e0:I

    new-instance p1, Lk/e;

    invoke-direct {p1}, Lk/e;-><init>()V

    iput-object p1, p0, La3d20260409/o0o00;->N:Lk/e;

    return-void
.end method

.method public static synthetic A1(La3d20260409/o0o00;)Landroid/hardware/Camera$Size;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic B1(La3d20260409/o0o00;)La3d20260409/h;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic F1(La3d20260409/o0o00;)Lwe0/h;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->b0:Lwe0/h;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic G1(La3d20260409/o0o00;)Laai/liveness/Detector$WarnCode;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->d0:Laai/liveness/Detector$WarnCode;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic H0(La3d20260409/o0o00;Landroid/hardware/Camera$Size;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, La3d20260409/o0o00;->c1(Landroid/hardware/Camera$Size;)V

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

.method public static synthetic I0(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, La3d20260409/o0o00;->V0(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic I1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->l:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic J0(La3d20260409/o0o00;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->R0()V

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

.method public static synthetic J1(La3d20260409/o0o00;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic K0(La3d20260409/o0o00;)Lorg/json/JSONArray;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->S:Lorg/json/JSONArray;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic L1(La3d20260409/o0o00;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->t1()V

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

.method public static synthetic M0(La3d20260409/o0o00;)Landroid/hardware/Camera$Size;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic O0(La3d20260409/o0o00;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, La3d20260409/o0o00;->j0:Z

    .line 3
    return p1
    .line 4
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

.method public static synthetic P0(La3d20260409/o0o00;)Landroid/hardware/Camera$Size;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic Q0(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic S0(La3d20260409/o0o00;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->n1()V

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

.method public static synthetic U0(La3d20260409/o0o00;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic V0(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroid/hardware/Camera$Size;->width:I

    .line 3
    .line 4
    iget p0, p0, Landroid/hardware/Camera$Size;->height:I

    .line 5
    mul-int/2addr v0, p0

    .line 6
    .line 7
    iget p0, p1, Landroid/hardware/Camera$Size;->width:I

    .line 8
    .line 9
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 10
    mul-int/2addr p0, p1

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Ljava/lang/Integer;->compare(II)I

    .line 14
    move-result p0

    .line 15
    return p0
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

.method public static synthetic W0(La3d20260409/o0o00;J)J
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, La3d20260409/o0o00;->f0:J

    .line 3
    return-wide p1
    .line 4
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

.method public static synthetic X0(La3d20260409/o0o00;)Landroid/hardware/Camera$Size;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic i1(La3d20260409/o0o00;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, La3d20260409/o0o00;->i0:Z

    .line 3
    return p1
    .line 4
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

.method public static synthetic k1(La3d20260409/o0o00;)Le/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic m1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->j:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic o1(La3d20260409/o0o00;)Laai/liveness/Detector$DetectionType;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic q1(La3d20260409/o0o00;)Lintl/o0oOOOOOooooo;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic r1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->j:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic s1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, La3d20260409/o0o00;->e0:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic u1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->l:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic w1(La3d20260409/o0o00;)Landroid/hardware/Camera$Size;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    return-object p0
    .line 4
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

.method public static synthetic x1(La3d20260409/o0o00;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, La3d20260409/o0o00;->i0:Z

    .line 3
    return p0
    .line 4
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

.method public static synthetic y1(La3d20260409/o0o00;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->k:I

    .line 3
    return p0
    .line 4
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

.method public static synthetic z1(La3d20260409/o0o00;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, La3d20260409/o0o00;->j0:Z

    .line 3
    return p0
    .line 4
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
.method public final C1()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    move-result-wide v5

    .line 11
    .line 12
    iput-wide v5, p0, La3d20260409/o0o00;->I:J

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 20
    .line 21
    new-instance v1, Lwe0/b;

    .line 22
    .line 23
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 24
    const/4 v3, 0x5

    .line 25
    .line 26
    .line 27
    const-string/jumbo v4, "light"

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, Lwe0/b;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 36
    .line 37
    new-instance v1, Lwe0/b;

    .line 38
    .line 39
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 40
    const/4 v3, 0x6

    .line 41
    .line 42
    .line 43
    const-string/jumbo v4, "pressure"

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lwe0/b;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 52
    .line 53
    new-instance v1, Lwe0/b;

    .line 54
    .line 55
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 56
    .line 57
    const/16 v3, 0x8

    .line 58
    .line 59
    .line 60
    const-string/jumbo v4, "proximity"

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v1 .. v6}, Lwe0/b;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 69
    .line 70
    new-instance v1, Lwe0/b;

    .line 71
    .line 72
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 73
    .line 74
    const/16 v3, 0xc

    .line 75
    .line 76
    const-string v4, "humidity"

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v1 .. v6}, Lwe0/b;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    new-instance v0, Lwe0/e;

    .line 85
    .line 86
    iget-object v1, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1, v5, v6}, Lwe0/e;-><init>(Landroid/content/Context;J)V

    .line 90
    .line 91
    iput-object v0, p0, La3d20260409/o0o00;->F:Lwe0/e;

    .line 92
    .line 93
    iget-object v1, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 94
    .line 95
    .line 96
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    new-instance v1, Lwe0/i;

    .line 99
    .line 100
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 101
    .line 102
    const/16 v3, 0xa

    .line 103
    .line 104
    const-string v4, "acceleration"

    .line 105
    .line 106
    .line 107
    invoke-direct/range {v1 .. v6}, Lwe0/i;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 108
    .line 109
    iput-object v1, p0, La3d20260409/o0o00;->G:Lwe0/i;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p0}, Lwe0/i;->i(Lwe0/i$a;)V

    .line 113
    .line 114
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 115
    .line 116
    iget-object v1, p0, La3d20260409/o0o00;->G:Lwe0/i;

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 122
    .line 123
    new-instance v1, Lwe0/i;

    .line 124
    .line 125
    iget-object v2, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 126
    const/4 v3, 0x4

    .line 127
    .line 128
    const-string v4, "gyroscope"

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v1 .. v6}, Lwe0/i;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    new-instance v0, La3d20260409/h;

    .line 137
    .line 138
    iget-object v1, p0, La3d20260409/o0o00;->L:Landroid/content/Context;

    .line 139
    .line 140
    check-cast v1, Landroid/app/Activity;

    .line 141
    .line 142
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 143
    .line 144
    .line 145
    invoke-static {v2}, Lg/e;->b(Lg/e;)Lg/e;

    .line 146
    move-result-object v2

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v1, v2}, La3d20260409/h;-><init>(Landroid/app/Activity;Lg/e;)V

    .line 150
    .line 151
    iput-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p0}, La3d20260409/h;->C(La3d20260409/o0o00;)V

    .line 155
    .line 156
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 157
    .line 158
    iget-wide v1, p0, La3d20260409/o0o00;->W:J

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1, v2}, La3d20260409/h;->u(J)V

    .line 162
    .line 163
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p0}, La3d20260409/h;->A0(Lc/a;)V

    .line 167
    .line 168
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 169
    .line 170
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 171
    .line 172
    iget-wide v1, p0, La3d20260409/o0o00;->I:J

    .line 173
    .line 174
    iput-wide v1, v0, La3d20260409/f;->q:J

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    const-string/jumbo v2, "sensor_epoch_timestamp"

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v2, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 187
    .line 188
    .line 189
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    .line 193
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    move-result v1

    .line 195
    .line 196
    if-eqz v1, :cond_1

    .line 197
    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    check-cast v1, Lwe0/d;

    .line 203
    .line 204
    iget-object v2, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 205
    .line 206
    iget-object v2, v2, La3d20260409/h;->j:La3d20260409/f;

    .line 207
    .line 208
    new-instance v3, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string/jumbo v4, "sensor_info_"

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    iget-object v4, v1, Lwe0/d;->b:Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lwe0/d;->a()Ljava/lang/String;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v3, v4}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 234
    .line 235
    instance-of v2, v1, Lwe0/i;

    .line 236
    .line 237
    if-eqz v2, :cond_0

    .line 238
    .line 239
    check-cast v1, Lwe0/i;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Lwe0/i;->j()V

    .line 243
    goto :goto_0

    .line 244
    .line 245
    :cond_1
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 246
    .line 247
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 251
    move-result-wide v1

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 255
    move-result-object v1

    .line 256
    .line 257
    .line 258
    const-string/jumbo v2, "sensor_values_start_timestamp"

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    return-void
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public D1()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->H1()V

    .line 4
    .line 5
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, La3d20260409/o0o00;->N:Lk/e;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lk/e;->a()F

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La3d20260409/f;->w(F)V

    .line 21
    .line 22
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 23
    .line 24
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 25
    .line 26
    iget-object v1, p0, La3d20260409/o0o00;->S:Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, La3d20260409/f;->Y(Lorg/json/JSONArray;)V

    .line 30
    .line 31
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 32
    .line 33
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    move-result v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "*"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 54
    move-result v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, La3d20260409/f;->U(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {p0}, La3d20260409/o0o00;->n1()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La3d20260409/o0o00;->p1()V

    .line 71
    .line 72
    :cond_1
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    const/4 v1, 0x0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 79
    :cond_2
    return-void
    .line 80
.end method

.method public E1()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, La3d20260409/o0o00;->J:Z

    .line 4
    .line 5
    iget-object v1, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->d1(Le/a;)V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    move-result v1

    .line 18
    .line 19
    new-array v1, v1, [Laai/liveness/Detector$DetectionType;

    .line 20
    .line 21
    iget-object v2, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v2, p0, La3d20260409/o0o00;->P:Le/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2, v0, v1}, La3d20260409/o0o00;->e1(Le/a;Z[Laai/liveness/Detector$DetectionType;)V

    .line 30
    return-void
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
.end method

.method public declared-synchronized H1()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->R()V

    .line 5
    .line 6
    new-instance v0, La3d20260409/m;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, La3d20260409/m;-><init>(La3d20260409/o0o00;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lai/advance/common/camera/GuardianCameraViewV2;->Q(Lai/advance/common/camera/GuardianCameraViewV2$h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
.end method

.method public final K1()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/j;->c()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public L(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, La3d20260409/o0o00;->S:Lorg/json/JSONArray;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, La3d20260409/o0o00;->Y0(Landroid/hardware/Camera$Parameters;)Ljava/util/List;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, La3d20260409/o;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, La3d20260409/o;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Landroid/hardware/Camera$Size;

    .line 36
    .line 37
    iget-object v2, p0, La3d20260409/o0o00;->S:Lorg/json/JSONArray;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    iget v4, v1, Landroid/hardware/Camera$Size;->width:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "*"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    iget v5, v1, Landroid/hardware/Camera$Size;->height:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    const-string v3, "calBestPreviewSize:"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    iget v3, v1, Landroid/hardware/Camera$Size;->width:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lk/h;->h(Ljava/lang/String;)V

    .line 95
    goto :goto_0

    .line 96
    .line 97
    .line 98
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    move-result v1

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    check-cast v1, Landroid/hardware/Camera$Size;

    .line 112
    .line 113
    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    .line 114
    .line 115
    iget v3, v1, Landroid/hardware/Camera$Size;->height:I

    .line 116
    .line 117
    if-ge v2, v3, :cond_2

    .line 118
    goto :goto_1

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-static {}, La3d20260409/s;->l()I

    .line 122
    move-result v2

    .line 123
    .line 124
    if-ge v3, v2, :cond_3

    .line 125
    goto :goto_1

    .line 126
    .line 127
    :cond_3
    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    .line 128
    int-to-float v2, v2

    .line 129
    .line 130
    iget v3, v1, Landroid/hardware/Camera$Size;->height:I

    .line 131
    int-to-float v3, v3

    .line 132
    div-float/2addr v2, v3

    .line 133
    .line 134
    .line 135
    const v3, 0x3fa66666    # 1.3f

    .line 136
    sub-float/2addr v2, v3

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 140
    move-result v2

    .line 141
    .line 142
    .line 143
    const v3, 0x3dcccccd    # 0.1f

    .line 144
    .line 145
    cmpg-float v2, v2, v3

    .line 146
    .line 147
    if-gtz v2, :cond_1

    .line 148
    .line 149
    .line 150
    const-string/jumbo v0, "ratio_1.3"

    .line 151
    .line 152
    iput-object v0, p0, La3d20260409/o0o00;->T:Ljava/lang/String;

    .line 153
    goto :goto_2

    .line 154
    :cond_4
    const/4 v1, 0x0

    .line 155
    .line 156
    :goto_2
    if-nez v1, :cond_8

    .line 157
    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    .line 163
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    move-result v2

    .line 165
    .line 166
    if-eqz v2, :cond_8

    .line 167
    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    check-cast v2, Landroid/hardware/Camera$Size;

    .line 173
    .line 174
    iget v3, v2, Landroid/hardware/Camera$Size;->width:I

    .line 175
    .line 176
    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    .line 177
    .line 178
    if-ge v3, v4, :cond_6

    .line 179
    goto :goto_3

    .line 180
    .line 181
    .line 182
    :cond_6
    invoke-static {}, La3d20260409/s;->l()I

    .line 183
    move-result v3

    .line 184
    .line 185
    if-ge v4, v3, :cond_7

    .line 186
    goto :goto_3

    .line 187
    .line 188
    :cond_7
    iget v3, v2, Landroid/hardware/Camera$Size;->width:I

    .line 189
    int-to-float v3, v3

    .line 190
    .line 191
    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    .line 192
    int-to-float v4, v4

    .line 193
    div-float/2addr v3, v4

    .line 194
    .line 195
    const/high16 v4, 0x3f800000    # 1.0f

    .line 196
    sub-float/2addr v3, v4

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 200
    move-result v3

    .line 201
    .line 202
    .line 203
    const v4, 0x3e4ccccd    # 0.2f

    .line 204
    .line 205
    cmpg-float v3, v3, v4

    .line 206
    .line 207
    if-gez v3, :cond_5

    .line 208
    .line 209
    .line 210
    const-string/jumbo v0, "ratio_1"

    .line 211
    .line 212
    iput-object v0, p0, La3d20260409/o0o00;->T:Ljava/lang/String;

    .line 213
    move-object v1, v2

    .line 214
    .line 215
    :cond_8
    if-nez v1, :cond_9

    .line 216
    const/4 v0, 0x0

    .line 217
    .line 218
    .line 219
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    move-result-object p1

    .line 221
    move-object v1, p1

    .line 222
    .line 223
    check-cast v1, Landroid/hardware/Camera$Size;

    .line 224
    .line 225
    const-string p1, "default0"

    .line 226
    .line 227
    iput-object p1, p0, La3d20260409/o0o00;->T:Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    :cond_9
    invoke-virtual {p0, v1}, La3d20260409/o0o00;->d0(Landroid/hardware/Camera$Size;)V

    .line 231
    return-object v1
    .line 232
    .line 233
    .line 234
.end method

.method public final L0(Laai/liveness/Detector$WarnCode;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Laai/liveness/Detector$WarnCode;->WARN_MOUTH_OCCLUSION_IN_MOTION:Laai/liveness/Detector$WarnCode;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    const/4 p1, 0x5

    .line 6
    return p1

    .line 7
    .line 8
    :cond_0
    sget-object v0, Laai/liveness/Detector$WarnCode;->WARN_EYE_OCCLUSION:Laai/liveness/Detector$WarnCode;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    const/4 p1, 0x3

    .line 12
    return p1

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    return p1
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

.method public final N0()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final synthetic R0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La3d20260409/h;->m0()V

    .line 8
    :cond_0
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
.end method

.method public T0()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, v0, La3d20260409/h;->I:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public U(Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->Y()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget p1, p1, Landroid/hardware/Camera$Size;->width:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 12
    return p1
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

.method public V(Landroid/hardware/Camera$Size;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->Y()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget p1, p1, Landroid/hardware/Camera$Size;->width:I

    .line 12
    return p1
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

.method public final Y0(Landroid/hardware/Camera$Parameters;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/Camera$Parameters;",
            ")",
            "Ljava/util/List<",
            "Landroid/hardware/Camera$Size;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-boolean v1, La3d20260409/s;->l:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedVideoSizes()Ljava/util/List;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-eqz p1, :cond_5

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Landroid/hardware/Camera$Size;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 47
    move-result v4

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    return-object v0

    .line 61
    :cond_4
    return-object v1

    .line 62
    :cond_5
    :goto_1
    return-object v0
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

.method public final Z0(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, La3d20260409/o0o00$t;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$t;-><init>(La3d20260409/o0o00;I)V

    .line 10
    .line 11
    iget-object p1, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 15
    return-void
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

.method public a(Lintl/o0oOOOOOooooo;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->b0:Lwe0/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 11
    .line 12
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 13
    .line 14
    new-instance v1, La3d20260409/o0o00$r;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$r;-><init>(La3d20260409/o0o00;Lintl/o0oOOOOOooooo;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public a0()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->v1()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->a0()V

    .line 7
    return-void
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
.end method

.method public final a1(ILjava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, La3d20260409/o0o00$k;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, La3d20260409/o0o00$k;-><init>(La3d20260409/o0o00;ILjava/lang/Exception;)V

    .line 10
    .line 11
    iget-object p1, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 15
    return-void
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

.method public b()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, La3d20260409/o0o00;->a0:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->Z0(I)V

    .line 12
    .line 13
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v1, Lintl/OoOOoOoO;->OOOOooooo:Lintl/OoOOoOoO;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 21
    :cond_0
    return-void
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
.end method

.method public b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lintl/OoOOoOoO;->OOOOOoooooooO:Lintl/OoOOoOoO;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v1, Lintl/OoooOOOoooooo;->O0OOOoOooo:Lintl/OoooOOOoooooo;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lf/h;->z(Ljava/lang/String;Lg/e;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    move-result-wide v0

    .line 29
    .line 30
    iput-wide v0, p0, La3d20260409/o0o00;->a0:J

    .line 31
    .line 32
    .line 33
    invoke-super {p0, p1, p2}, Lai/advance/common/camera/GuardianCameraViewV3;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 34
    return-void
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

.method public final b1(Laai/liveness/Detector$WarnCode;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, La3d20260409/o0o00;->e0:I

    .line 4
    .line 5
    iget-object v0, p0, La3d20260409/o0o00;->d0:Laai/liveness/Detector$WarnCode;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, La3d20260409/o0o00$f;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$f;-><init>(La3d20260409/o0o00;Laai/liveness/Detector$WarnCode;)V

    .line 18
    .line 19
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 23
    .line 24
    iput-object p1, p0, La3d20260409/o0o00;->d0:Laai/liveness/Detector$WarnCode;

    .line 25
    .line 26
    sget-object v0, Laai/liveness/Detector$WarnCode;->FACECAPTURE:Laai/liveness/Detector$WarnCode;

    .line 27
    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 31
    .line 32
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La3d20260409/f;->v0()V

    .line 36
    .line 37
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, La3d20260409/h;->Q()V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 49
    .line 50
    new-instance v1, La3d20260409/o0o00$j;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$j;-><init>(La3d20260409/o0o00;Laai/liveness/Detector$WarnCode;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    :cond_2
    :goto_0
    return-void
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

.method public c([BLandroid/hardware/Camera$Size;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La3d20260409/h;->e0([BLandroid/hardware/Camera$Size;)Z

    .line 6
    .line 7
    .line 8
    invoke-static {}, La3d20260409/j3d20260409;->oo000o0()V

    .line 9
    .line 10
    iget-object p1, p0, La3d20260409/o0o00;->N:Lk/e;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lk/e;->d()V

    .line 14
    return-void
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

.method public final synthetic c1(Landroid/hardware/Camera$Size;)V
    .locals 5

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewWidth()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lai/advance/common/camera/GuardianCameraViewV2;->getViewHeight()I

    .line 16
    move-result v2

    .line 17
    int-to-float v3, v1

    .line 18
    .line 19
    iget v4, p1, Landroid/hardware/Camera$Size;->width:I

    .line 20
    int-to-float v4, v4

    .line 21
    .line 22
    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    .line 23
    int-to-float p1, p1

    .line 24
    div-float/2addr v4, p1

    .line 25
    mul-float/2addr v3, v4

    .line 26
    float-to-int p1, v3

    .line 27
    .line 28
    if-eq p1, v2, :cond_0

    .line 29
    .line 30
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 31
    .line 32
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 33
    sub-int/2addr p1, v1

    .line 34
    neg-int p1, p1

    .line 35
    .line 36
    div-int/lit8 p1, p1, 0x2

    .line 37
    .line 38
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    :cond_0
    return-void
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

.method public d(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, La3d20260409/o0o00$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p2, p3, p1}, La3d20260409/o0o00$a;-><init>(La3d20260409/o0o00;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 10
    .line 11
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v1, La3d20260409/o0o00$g;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p0, p1, p2, p3}, La3d20260409/o0o00$g;-><init>(La3d20260409/o0o00;ZLjava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    :cond_0
    return-void
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

.method public d0(Landroid/hardware/Camera$Size;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, La3d20260409/n;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, La3d20260409/n;-><init>(La3d20260409/o0o00;Landroid/hardware/Camera$Size;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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

.method public declared-synchronized d1(Le/a;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, La3d20260409/s;->f:Ljava/util/List;

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, La3d20260409/s;->f:Ljava/util/List;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v0

    .line 19
    .line 20
    new-array v0, v0, [Laai/liveness/Detector$DetectionType;

    .line 21
    .line 22
    :goto_0
    sget-object v2, La3d20260409/s;->f:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    move-result v2

    .line 27
    .line 28
    if-ge v1, v2, :cond_0

    .line 29
    .line 30
    sget-object v2, La3d20260409/s;->f:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Laai/liveness/Detector$DetectionType;

    .line 37
    .line 38
    aput-object v2, v0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_0
    sget-boolean v1, La3d20260409/s;->g:Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, v1, v0}, La3d20260409/o0o00;->e1(Le/a;Z[Laai/liveness/Detector$DetectionType;)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    sget-object v0, Laai/liveness/Detector$DetectionType;->BLINK:Laai/liveness/Detector$DetectionType;

    .line 52
    .line 53
    sget-object v2, Laai/liveness/Detector$DetectionType;->POS_YAW:Laai/liveness/Detector$DetectionType;

    .line 54
    .line 55
    .line 56
    filled-new-array {v0, v2}, [Laai/liveness/Detector$DetectionType;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v1, v0}, La3d20260409/o0o00;->e1(Le/a;Z[Laai/liveness/Detector$DetectionType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :goto_1
    monitor-exit p0

    .line 62
    return-void

    .line 63
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1
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

.method public varargs declared-synchronized e1(Le/a;Z[Laai/liveness/Detector$DetectionType;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, La3d20260409/u;->d()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La3d20260409/o0o00;->K1()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La3d20260409/j3d20260409;->O0ooE(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La3d20260409/o0o00;->K1()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, La3d20260409/j3d20260409;->O0ooEoo0Co00o(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-instance v2, Lf/i$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2}, Lf/i$a;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, La3d20260409/j3d20260409;->oOoOoOo0000()Z

    .line 31
    move-result v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lf/i$a;->k(Z)Lf/i$a;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    sget-object v3, Lintl/oOooooooooooooo;->ooooOOOOO:Lintl/oOooooooooooooo;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, La3d20260409/v;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lf/i$a;->e(Ljava/lang/String;)Lf/i$a;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    sget-object v3, Lintl/oOooooooooooooo;->OOOOooooo:Lintl/oOooooooooooooo;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, La3d20260409/v;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Lf/i$a;->g(Ljava/lang/String;)Lf/i$a;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    sget-object v3, Lintl/oOooooooooooooo;->OOOOOoooo:Lintl/oOooooooooooooo;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, La3d20260409/v;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Lf/i$a;->h(Ljava/lang/String;)Lf/i$a;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v0}, Lf/i$a;->m(Ljava/lang/String;)Lf/i$a;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    sget-object v2, Laai/telemetry/enums/PluginPlatform;->Standard:Laai/telemetry/enums/PluginPlatform;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lf/i$a;->j(Laai/telemetry/enums/PluginPlatform;)Lf/i$a;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Lm/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Lf/i$a;->b(Ljava/lang/String;)Lf/i$a;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    const-string v2, "LIVENESS_DETECTION"

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v2}, Lf/i$a;->c(Ljava/lang/String;)Lf/i$a;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-static {}, La3d20260409/s;->m()Ljava/lang/String;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lf/i$a;->d(Ljava/lang/String;)Lf/i$a;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-static {}, La3d20260409/j3d20260409;->O0ooEoo0Co00o0()Ljava/lang/String;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Lf/i$a;->f(Ljava/lang/String;)Lf/i$a;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lr/a;->c()Ljava/lang/String;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lf/i$a;->l(Ljava/lang/String;)Lf/i$a;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lf/i$a;->a()Lf/i;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lf/h;->v(Lf/i;)Lg/e;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    iput-object v0, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lr/a;->c()Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 147
    move-result v0

    .line 148
    .line 149
    if-eqz v0, :cond_0

    .line 150
    .line 151
    .line 152
    invoke-static {}, La3d20260409/v;->O()Z

    .line 153
    move-result v0

    .line 154
    .line 155
    if-nez v0, :cond_0

    .line 156
    .line 157
    const-string v0, "You haven\'t called the LivenessDetectionSDK.bindUser() method, we strongly recommend that you call this method to bind the user id so that we can debug the log together when something goes wrong."

    .line 158
    .line 159
    .line 160
    invoke-static {v0}, Lk/h;->i(Ljava/lang/String;)V

    .line 161
    goto :goto_0

    .line 162
    :catchall_0
    move-exception p1

    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    .line 167
    :cond_0
    :goto_0
    invoke-static {}, La3d20260409/s;->i()I

    .line 168
    move-result v0

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lk/a;->g()I

    .line 172
    move-result v1

    .line 173
    .line 174
    if-ne v0, v1, :cond_1

    .line 175
    .line 176
    const-wide/16 v0, 0x3e8

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v0, v1}, Lai/advance/common/camera/GuardianCameraViewV2;->setAutoFocusEnable(J)V

    .line 180
    .line 181
    :cond_1
    iput-object p1, p0, La3d20260409/o0o00;->P:Le/a;

    .line 182
    array-length v0, p3

    .line 183
    .line 184
    if-nez v0, :cond_2

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 188
    move-result-object p1

    .line 189
    .line 190
    new-instance p2, La3d20260409/o0o00$u;

    .line 191
    .line 192
    .line 193
    invoke-direct {p2, p0}, La3d20260409/o0o00$u;-><init>(La3d20260409/o0o00;)V

    .line 194
    .line 195
    iget-object p3, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, p2, p3}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 199
    .line 200
    const-string p1, "EMPTY_DETECTION_TYPE_LIST"

    .line 201
    .line 202
    const-string p2, "Detection Types need at least one term"

    .line 203
    .line 204
    .line 205
    :goto_1
    invoke-virtual {p0, p1, p2}, La3d20260409/o0o00;->g1(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    .line 210
    :cond_2
    invoke-virtual {p0, p3}, La3d20260409/o0o00;->j1([Laai/liveness/Detector$DetectionType;)Z

    .line 211
    move-result v0

    .line 212
    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    new-instance v0, Landroid/os/Handler;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 223
    .line 224
    iput-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 225
    .line 226
    new-instance v0, Ljava/util/ArrayList;

    .line 227
    .line 228
    .line 229
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 230
    move-result-object p3

    .line 231
    .line 232
    .line 233
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 234
    .line 235
    iput-object v0, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 236
    .line 237
    if-eqz p2, :cond_3

    .line 238
    .line 239
    .line 240
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 241
    .line 242
    .line 243
    :cond_3
    invoke-virtual {p0}, La3d20260409/o0o00;->C1()V

    .line 244
    .line 245
    iget-object p2, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 246
    .line 247
    iget p2, p2, La3d20260409/h;->k:I

    .line 248
    const/4 p3, -0x1

    .line 249
    .line 250
    if-ne p2, p3, :cond_4

    .line 251
    .line 252
    sget-object p2, Lintl/OOOoooooo;->ooooOOOOO:Lintl/OOOoooooo;

    .line 253
    .line 254
    .line 255
    invoke-static {p2}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    move-result-object p2

    .line 260
    .line 261
    const-string p3, "camera error"

    .line 262
    const/4 v0, 0x0

    .line 263
    .line 264
    .line 265
    invoke-interface {p1, v0, p2, p3}, Lc/b;->d(ZLjava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0, v0}, La3d20260409/o0o00;->h1(ZI)V

    .line 269
    goto :goto_2

    .line 270
    .line 271
    .line 272
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 273
    move-result-wide p1

    .line 274
    .line 275
    .line 276
    invoke-static {}, La3d20260409/s;->q()Z

    .line 277
    move-result p3

    .line 278
    .line 279
    .line 280
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 281
    move-result-wide v0

    .line 282
    sub-long/2addr v0, p1

    .line 283
    long-to-int p1, v0

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, p3, p1}, La3d20260409/o0o00;->h1(ZI)V

    .line 287
    .line 288
    if-eqz p3, :cond_5

    .line 289
    .line 290
    .line 291
    invoke-static {}, La3d20260409/s;->i()I

    .line 292
    move-result p1

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, p1, p0}, La3d20260409/o0o00;->b0(ILai/advance/common/camera/GuardianCameraViewV2$g;)V

    .line 296
    goto :goto_2

    .line 297
    .line 298
    :cond_5
    new-instance p1, Ljava/lang/Exception;

    .line 299
    .line 300
    const-string p2, "The device does not support liveness detection"

    .line 301
    .line 302
    .line 303
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, p1}, La3d20260409/o0o00;->i(Ljava/lang/Exception;)V

    .line 307
    goto :goto_2

    .line 308
    .line 309
    .line 310
    :cond_6
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 311
    move-result-object p1

    .line 312
    .line 313
    new-instance p2, La3d20260409/o0o00$h;

    .line 314
    .line 315
    .line 316
    invoke-direct {p2, p0, p3}, La3d20260409/o0o00$h;-><init>(La3d20260409/o0o00;[Laai/liveness/Detector$DetectionType;)V

    .line 317
    .line 318
    iget-object p3, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2, p3}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 322
    .line 323
    const-string p1, "NOT_SUPPORTED_DETECTION_TYPE"

    .line 324
    .line 325
    const-string p2, "Type of detection not supported\n detectionType must in (POS_PAW,BLINK,MOUTH)"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    goto :goto_1

    .line 327
    :goto_2
    monitor-exit p0

    .line 328
    return-void

    .line 329
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    throw p1
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public f(La3d20260409/j;)Laai/liveness/Detector$DetectionType;
    .locals 3

    .line 1
    .line 2
    sget-object p1, Laai/liveness/Detector$DetectionType;->DONE:Laai/liveness/Detector$DetectionType;

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La3d20260409/h;->w0()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La3d20260409/o0o00;->H1()V

    .line 14
    .line 15
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, La3d20260409/o0o00$c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0}, La3d20260409/o0o00$c;-><init>(La3d20260409/o0o00;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    iput-object p1, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget v0, p0, La3d20260409/o0o00;->M:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    iput v0, p0, La3d20260409/o0o00;->M:I

    .line 35
    .line 36
    iget-object v1, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    move-result v1

    .line 41
    .line 42
    if-lt v0, v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La3d20260409/o0o00;->H1()V

    .line 46
    .line 47
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v1, La3d20260409/o0o00$d;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0}, La3d20260409/o0o00$d;-><init>(La3d20260409/o0o00;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 59
    .line 60
    iget v1, p0, La3d20260409/o0o00;->M:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    check-cast v0, Laai/liveness/Detector$DetectionType;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    :try_start_1
    iput-object v0, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 69
    .line 70
    iget-object p1, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 71
    .line 72
    new-instance v1, La3d20260409/o0o00$p;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, p0}, La3d20260409/o0o00$p;-><init>(La3d20260409/o0o00;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    return-object v0

    .line 80
    :catch_1
    move-exception p1

    .line 81
    move-object v2, v0

    .line 82
    move-object v0, p1

    .line 83
    move-object p1, v2

    .line 84
    .line 85
    :goto_0
    iget-object v1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 91
    :cond_2
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public f0(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->f0(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    .line 7
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 15
    :cond_0
    return-void
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

.method public f1(Le/b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Le/b;->b()V

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    .line 14
    .line 15
    new-instance v1, La3d20260409/o0o00$q;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$q;-><init>(La3d20260409/o0o00;Le/b;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 25
    :cond_1
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

.method public g(Laai/liveness/Detector$DetectionFailedType;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v1, La3d20260409/o0o00$e;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$e;-><init>(La3d20260409/o0o00;Laai/liveness/Detector$DetectionFailedType;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, La3d20260409/h;->A0(Lc/a;)V

    .line 25
    :cond_1
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

.method public final g1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p1, p2}, Lc/b;->d(ZLjava/lang/String;Ljava/lang/String;)V

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p2}, Lk/h;->g(Ljava/lang/String;)V

    .line 13
    return-void
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

.method public getCurrentDetectionType()Laai/liveness/Detector$DetectionType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getSessionData()Lg/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final h1(ZI)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, La3d20260409/o0o00$o;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p2, p1}, La3d20260409/o0o00$o;-><init>(La3d20260409/o0o00;IZ)V

    .line 10
    .line 11
    iget-object p1, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 15
    return-void
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

.method public i(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, La3d20260409/o0o00;->a0:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, La3d20260409/o0o00;->a1(ILjava/lang/Exception;)V

    .line 12
    .line 13
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v1, Lintl/OoOOoOoO;->OOOOOoooo:Lintl/OoOOoOoO;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La3d20260409/h;->G(Lintl/OoOOoOoO;)V

    .line 21
    .line 22
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    :cond_0
    sget-object p1, Lintl/OOOoooooo;->ooooOOOOO:Lintl/OOOoooooo;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, La3d20260409/u;->b(Lintl/OOOoooooo;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    const-string v2, "The device does not support liveness detection"

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1, p1, v2}, Lc/b;->d(ZLjava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_1
    return-void
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

.method public j()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v1, La3d20260409/o0o00$s;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, La3d20260409/o0o00$s;-><init>(La3d20260409/o0o00;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public final varargs j1([Laai/liveness/Detector$DetectionType;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    const/4 v3, 0x1

    .line 5
    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    sget-object v4, La3d20260409/o0o00$m;->a:[I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    move-result v2

    .line 15
    .line 16
    aget v2, v4, v2

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    const/4 v3, 0x2

    .line 20
    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    const/4 v3, 0x3

    .line 23
    .line 24
    if-eq v2, v3, :cond_0

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v0

    .line 29
    :cond_1
    return v3
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
.end method

.method public l(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v1, La3d20260409/o0o00$b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, La3d20260409/o0o00$b;-><init>(La3d20260409/o0o00;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public l0()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v1, v0, Landroid/hardware/Camera$Size;->height:I

    .line 7
    int-to-float v1, v1

    .line 8
    .line 9
    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    .line 10
    int-to-float v0, v0

    .line 11
    .line 12
    new-instance v2, Landroid/graphics/RectF;

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v3, v3, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 17
    .line 18
    new-instance v4, Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    invoke-direct {v4, v3, v3, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Matrix;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 27
    .line 28
    sget-object v1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v4, v1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->x:F

    .line 39
    .line 40
    iput v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->y:F

    .line 41
    :cond_0
    return-void
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
.end method

.method public l1()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
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
.end method

.method public m(La3d20260409/j;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, La3d20260409/j;->a()Laai/liveness/Detector$WarnCode;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/o0o00;->c0:Laai/liveness/Detector$WarnCode;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, La3d20260409/o0o00;->c0:Laai/liveness/Detector$WarnCode;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->b1(Laai/liveness/Detector$WarnCode;)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget v1, p0, La3d20260409/o0o00;->e0:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    :goto_0
    iput v1, p0, La3d20260409/o0o00;->e0:I

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :goto_1
    iput-object v0, p0, La3d20260409/o0o00;->c0:Laai/liveness/Detector$WarnCode;

    .line 28
    .line 29
    iget-boolean p1, p1, La3d20260409/j;->b:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->b1(Laai/liveness/Detector$WarnCode;)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->L0(Laai/liveness/Detector$WarnCode;)I

    .line 39
    move-result p1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    move-result-wide v1

    .line 44
    .line 45
    iget-wide v3, p0, La3d20260409/o0o00;->f0:J

    .line 46
    sub-long/2addr v1, v3

    .line 47
    .line 48
    iget v3, p0, La3d20260409/o0o00;->e0:I

    .line 49
    .line 50
    if-le v3, p1, :cond_4

    .line 51
    .line 52
    const-wide/16 v3, 0x12c

    .line 53
    .line 54
    cmp-long p1, v1, v3

    .line 55
    .line 56
    if-gez p1, :cond_3

    .line 57
    goto :goto_2

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->b1(Laai/liveness/Detector$WarnCode;)V

    .line 61
    :cond_4
    :goto_2
    return-void
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

.method public n()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, La3d20260409/o0o00;->f0:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    .line 9
    const-wide/16 v2, 0x12c

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Laai/liveness/Detector$WarnCode;->MOVE_TOO_FAST:Laai/liveness/Detector$WarnCode;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, La3d20260409/o0o00;->b1(Laai/liveness/Detector$WarnCode;)V

    .line 19
    :cond_0
    return-void
    .line 20
.end method

.method public final n1()V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, La3d20260409/o0o00;->V:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_3

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, La3d20260409/o0o00;->V:Z

    .line 9
    .line 10
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 11
    .line 12
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lwe0/d;

    .line 33
    .line 34
    instance-of v2, v1, Lwe0/i;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    move-object v2, v1

    .line 38
    .line 39
    check-cast v2, Lwe0/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lwe0/i;->h()V

    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_1
    :goto_1
    iget-object v2, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 48
    .line 49
    iget-object v2, v2, La3d20260409/h;->j:La3d20260409/f;

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string/jumbo v4, "sensor_values_"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v4, v1, Lwe0/d;->b:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lwe0/d;->f()Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3, v1}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :goto_2
    iget-object v1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 85
    :cond_2
    :goto_3
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public o(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->b0:Lwe0/h;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, La3d20260409/o0o00;->g0:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, La3d20260409/h;->j:La3d20260409/f;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, La3d20260409/f;->g0(Ljava/lang/String;)V

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La3d20260409/h;->c()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v1, La3d20260409/o0o00$l;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$l;-><init>(La3d20260409/o0o00;Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lf/h;->F(Lg/a;Lg/e;)V

    .line 51
    .line 52
    :cond_2
    iput-object p1, p0, La3d20260409/o0o00;->g0:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 56
    move-result v0

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 61
    .line 62
    new-instance v1, La3d20260409/o0o00$n;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p0, p1}, La3d20260409/o0o00$n;-><init>(La3d20260409/o0o00;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    :cond_3
    return-void
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

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 1

    .line 1
    .line 2
    iget-object p2, p0, Lai/advance/common/camera/GuardianCameraViewV2;->e:Lai/advance/common/camera/GuardianCameraViewV2$g;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->f:Landroid/hardware/Camera;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lai/advance/common/camera/GuardianCameraViewV2;->g:Landroid/hardware/Camera$Size;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p1, v0}, Lai/advance/common/camera/GuardianCameraViewV2$g;->c([BLandroid/hardware/Camera$Size;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lai/advance/common/camera/GuardianCameraViewV2;->N([B)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, La3d20260409/j3d20260409;->oo0o0o0()V

    .line 22
    return-void
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

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->l1()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, La3d20260409/o0o00;->J:Z

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    const/4 p1, 0x1

    .line 12
    .line 13
    iput-boolean p1, p0, La3d20260409/o0o00;->J:Z

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    iput p1, p0, La3d20260409/o0o00;->M:I

    .line 17
    .line 18
    iget-object v0, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Laai/liveness/Detector$DetectionType;

    .line 25
    .line 26
    iput-object p1, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 27
    .line 28
    iget-object p1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p1, La3d20260409/h;->j:La3d20260409/f;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, La3d20260409/f;->X(Ljava/util/ArrayList;)V

    .line 40
    .line 41
    iget-object p1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 42
    .line 43
    iget-object v0, p0, La3d20260409/o0o00;->O:Laai/liveness/Detector$DetectionType;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, p0}, La3d20260409/h;->f0(Laai/liveness/Detector$DetectionType;Lc/b;)V

    .line 47
    :cond_0
    return-void
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

.method public p()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/o0o00;->N0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La3d20260409/h;->w0()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 17
    .line 18
    new-instance v1, La3d20260409/o0o00$i;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, La3d20260409/o0o00$i;-><init>(La3d20260409/o0o00;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    :cond_0
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
.end method

.method public final p1()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, La3d20260409/h;->A0(Lc/a;)V

    .line 9
    .line 10
    iget-object v0, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La3d20260409/h;->z0()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public setFaceCaptureCallback(Lwe0/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/o0o00;->b0:Lwe0/h;

    .line 3
    return-void
    .line 4
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

.method public setFrameCallback(Lwe0/a;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public setLivenssCallback(Le/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/o0o00;->P:Le/a;

    .line 3
    return-void
    .line 4
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

.method public setModelResultCallback(Lwe0/j;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public setPrepareMillSeconds(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, La3d20260409/o0o00;->W:J

    .line 3
    return-void
    .line 4
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

.method public final t1()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, La3d20260409/j3d20260409;->oooo000o()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Landroid/app/Activity;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    check-cast v0, Landroid/app/Activity;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    move-result-object v0

    .line 29
    const/4 v3, 0x1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->buildDrawingCache()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 51
    .line 52
    const/16 v0, 0x258

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v0}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    const/16 v5, 0x14

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4, v5}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 66
    move-result-object v4

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 70
    .line 71
    iget-object v3, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    const-string v6, "-"

    .line 74
    .line 75
    .line 76
    const-string/jumbo v7, "null"

    .line 77
    .line 78
    if-nez v3, :cond_0

    .line 79
    move-object v1, v7

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    iget-object v8, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 91
    move-result-object v8

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    move-result-wide v8

    .line 102
    sub-long/2addr v8, v1

    .line 103
    long-to-int v1, v8

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-static {v4, v1}, La3d20260409/j3d20260409;->O0oooo0o([BLjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    move-result-wide v2

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v0}, Lk/a;->k(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-static {}, La3d20260409/v;->s()Landroid/graphics/Bitmap$CompressFormat;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1, v5}, Lk/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 139
    .line 140
    iget-object v0, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 141
    .line 142
    if-nez v0, :cond_1

    .line 143
    goto :goto_1

    .line 144
    .line 145
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    iget-object v4, p0, La3d20260409/o0o00;->h0:Lintl/o0oOOOOOooooo;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 164
    move-result-wide v4

    .line 165
    sub-long/2addr v4, v2

    .line 166
    long-to-int v2, v4

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string v2, "-texture"

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    move-result-object v7

    .line 179
    .line 180
    .line 181
    :goto_1
    invoke-static {v1, v7}, La3d20260409/j3d20260409;->O0oooo0o([BLjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string/jumbo v2, "screen_shot_"

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    move-result-object v1

    .line 204
    .line 205
    iget-object v2, p0, La3d20260409/o0o00;->U:Lg/e;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1, v2}, Lf/h;->G(Ljava/lang/String;Lg/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 209
    return-void

    .line 210
    :catch_0
    move-exception v0

    .line 211
    .line 212
    iget-object v1, p0, La3d20260409/o0o00;->K:La3d20260409/h;

    .line 213
    .line 214
    if-eqz v1, :cond_2

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 218
    :cond_2
    return-void
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public declared-synchronized v1()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-object v0, p0, La3d20260409/o0o00;->P:Le/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La3d20260409/o0o00;->H1()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La3d20260409/o0o00;->p1()V

    .line 11
    .line 12
    iget-object v1, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 18
    .line 19
    iput-object v0, p0, La3d20260409/o0o00;->Q:Landroid/os/Handler;

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_2

    .line 23
    .line 24
    :cond_0
    :goto_0
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, La3d20260409/o0o00;->H:Ljava/util/List;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    check-cast v1, Lwe0/d;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lwe0/d;->g()V

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_1
    iget-object v0, p0, La3d20260409/o0o00;->R:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :cond_2
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v0
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
.end method
