.class public final Lcom/sumsub/sns/internal/features/presentation/camera/d;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic h:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/common/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 3
    .line 4
    const-string v1, "cornersOverlay"

    .line 5
    .line 6
    const-string v2, "getCornersOverlay()Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "previewView"

    .line 15
    .line 16
    const-string v4, "getPreviewView()Landroidx/camera/view/PreviewView;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x2

    .line 22
    .line 23
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    aput-object v1, v2, v3

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    aput-object v0, v2, v1

    .line 29
    .line 30
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/d;->h:[Lkotlin/reflect/KProperty;

    .line 31
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$id;->sns_corners_overlay:I

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_camera_preview:I

    .line 5
    .line 6
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v2, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 10
    .line 11
    const-string p1, "CameraFrame"

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->e:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 26
    return-void
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
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->e:Ljava/lang/String;

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
.end method

.method public final l()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/d;->h:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v2, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 19
    .line 20
    aget-object v4, v1, v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    check-cast v3, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->bind(Landroidx/camera/view/PreviewView;)V

    .line 32
    .line 33
    :cond_0
    sget-object v0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 36
    .line 37
    aget-object v1, v1, v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->setState(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)V

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
.end method
