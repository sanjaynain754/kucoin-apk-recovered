.class public abstract Lcom/sumsub/sns/internal/features/presentation/camera/K;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/M0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Lcom/sumsub/sns/internal/features/presentation/camera/W;",
        ">",
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/camera/N;",
        "TVM;>;",
        "Lcom/sumsub/sns/internal/core/common/M0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/K;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/W;",
        "VM",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/N;",
        "Lcom/sumsub/sns/internal/core/common/M0;",
        "<init>",
        "()V",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSCameraFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCameraFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/SNSCameraFragment\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,576:1\n37#2:577\n37#2:587\n256#3,2:578\n256#3,2:580\n254#3:582\n277#3,2:583\n256#3,2:585\n81#3:588\n256#3,2:589\n*S KotlinDebug\n*F\n+ 1 SNSCameraFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/SNSCameraFragment\n*L\n122#1:577\n294#1:587\n204#1:578,2\n217#1:580,2\n219#1:582\n225#1:583,2\n252#1:585,2\n473#1:588\n222#1:589,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/camera/C;

.field public b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final c:Lcom/sumsub/sns/internal/core/presentation/android/v;

.field public final d:I

.field public e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

.field public f:Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/common/e;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/u;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 9
    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a:Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 16
    .line 17
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 18
    .line 19
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/android/A;->e:Lcom/sumsub/sns/internal/core/presentation/android/A;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/i0;

    .line 26
    .line 27
    .line 28
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 29
    .line 30
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/J;

    .line 31
    .line 32
    .line 33
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    const/16 v7, 0x18

    .line 37
    move-object v2, p0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/core/presentation/android/v;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 41
    .line 42
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/camera/K;->c:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 43
    const/4 v0, 0x1

    .line 44
    .line 45
    iput v0, v2, Lcom/sumsub/sns/internal/features/presentation/camera/K;->d:I

    .line 46
    .line 47
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 48
    .line 49
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/j0;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/camera/K;->g:Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 58
    .line 59
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->PHOTO:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 60
    .line 61
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/camera/K;->h:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 62
    return-void
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
.end method

.method public static final a(Landroid/view/View;Lcom/sumsub/sns/internal/features/presentation/camera/K;)Lkotlin/Unit;
    .locals 3

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lcom/sumsub/sns/R$string;->sns_gallery_type:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/c;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 70
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/K;->g:Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 71
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/documents/s;

    .line 72
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 73
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    const/4 v2, 0x0

    .line 74
    invoke-direct {v1, p1, v2, p0}, Lcom/sumsub/sns/internal/features/domain/documents/s;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;[Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/e;->a(Lcom/sumsub/sns/internal/features/domain/documents/s;)V

    .line 76
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/K;)Lkotlin/Unit;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->r()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 65
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/K;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/K;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 114
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/K;Landroid/view/View;)V
    .locals 1

    .line 77
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p0, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    .line 79
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/K;)Lkotlin/Unit;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->g()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/K;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/K;Landroid/view/View;)V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 2
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    return-void
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/K;)Lcom/sumsub/sns/internal/core/presentation/android/g;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->i:Lcom/sumsub/sns/internal/core/presentation/android/g;

    return-object p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/K;Landroid/view/View;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 6
    const-string v0, "DocCapture"

    const-string v1, "On Toggle Flash is clicked"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/T;

    invoke-direct {p1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/T;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 68
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public a(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lcom/sumsub/sns/internal/features/presentation/camera/H;)Ljava/lang/Object;
    .locals 0

    .line 67
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/N;)V
    .locals 9

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 7
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    const-string v3, "DocCapture"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->d:Z

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->m()Landroidx/camera/view/PreviewView;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    .line 13
    iget-boolean v6, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->d:Z

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    const-string v7, "CameraX"

    const-string v8, "Enable flash"

    invoke-virtual {v1, v7, v8, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1, v6}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 17
    :cond_1
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    if-eqz v1, :cond_3

    if-eqz v6, :cond_2

    move v2, v5

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    :goto_0
    invoke-virtual {v1, v2}, Landroidx/camera/core/ImageCapture;->setFlashMode(I)V

    .line 18
    :cond_3
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v1

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    if-nez v0, :cond_4

    .line 20
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 21
    :cond_4
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_ON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v0

    .line 22
    :goto_1
    invoke-interface {v1, v2, v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->s()Lcom/sumsub/sns/core/widget/SNSToolbarView;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->q()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 25
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->a:Z

    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->p()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    if-eqz v0, :cond_8

    .line 28
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->c:Z

    if-eqz v2, :cond_7

    move v2, v3

    goto :goto_2

    :cond_7
    move v2, v1

    .line 29
    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->r()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_9

    goto :goto_3

    .line 32
    :cond_9
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->b:Z

    if-eqz v0, :cond_a

    .line 33
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->r()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/k0;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-virtual {p0, v5, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(ZLandroid/view/View;Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    .line 34
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->r()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 35
    iget-boolean v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->b:Z

    if-nez v2, :cond_b

    const/4 v3, 0x4

    .line 36
    :cond_b
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    :cond_c
    :goto_4
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;->e:Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;

    .line 38
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->f:Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    .line 39
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;

    if-eqz v2, :cond_11

    .line 40
    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;

    .line 41
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;->a:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 42
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;->b:Ljava/util/Map;

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_d

    sget v5, Lcom/sumsub/sns/R$id;->sns_brief_details:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_5

    .line 45
    :cond_e
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 46
    sget v3, Lcom/sumsub/sns/R$id;->sns_intro_content:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 47
    :cond_f
    new-instance v4, Lcom/sumsub/sns/core/presentation/intro/b;

    .line 48
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v5

    .line 49
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 50
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v6

    .line 51
    invoke-direct {v4, v5, v6}, Lcom/sumsub/sns/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;)V

    const/4 v5, -0x1

    .line 52
    invoke-static {v4, v1, v2, v3, v5}, Lcom/sumsub/sns/core/presentation/intro/b;->a(Lcom/sumsub/sns/core/presentation/intro/b;Landroid/view/View;Ljava/util/Map;II)V

    .line 53
    :cond_10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->l()Landroid/view/ViewGroup;

    move-result-object v1

    if-eqz v1, :cond_12

    .line 54
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/D;

    invoke-direct {v2, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/D;-><init>(Landroid/view/View;Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-static {v1, v2}, Landroidx/core/view/OneShotPreDrawListener;->add(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/OneShotPreDrawListener;

    goto :goto_5

    .line 55
    :cond_11
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    if-eqz v1, :cond_12

    .line 56
    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    .line 57
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->a:Ljava/lang/String;

    .line 58
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->b:Ljava/lang/String;

    .line 59
    iget-object v4, v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->c:Ljava/lang/String;

    .line 60
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->d:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 61
    invoke-virtual {p0, v2, v3, v4, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V

    .line 62
    :cond_12
    :goto_5
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->f:Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;

    .line 63
    :cond_13
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b(Lcom/sumsub/sns/internal/features/presentation/camera/N;)V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V
    .locals 2

    .line 100
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->l()Landroid/view/ViewGroup;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 101
    :cond_0
    invoke-virtual {p0, p4}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z

    move-result p4

    if-nez p4, :cond_8

    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    sget v1, Lcom/sumsub/sns/R$id;->sns_brief_details:I

    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_2

    sget v1, Lcom/sumsub/sns/R$id;->sns_intro_content:I

    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_2

    const/16 v1, 0x8

    invoke-virtual {p4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 104
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->k()Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->i()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p2, p4}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->i()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/n0;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 107
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->j()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p3, p2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->j()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/o0;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 109
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p1, :cond_8

    .line 110
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setHideable(Z)V

    .line 111
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/G;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 112
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->l()Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 113
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/D;

    invoke-direct {p2, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/D;-><init>(Landroid/view/View;Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    invoke-static {p1, p2}, Landroidx/core/view/OneShotPreDrawListener;->add(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/OneShotPreDrawListener;

    :cond_9
    :goto_0
    return-void
.end method

.method public final a(ZLandroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 115
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    if-nez p1, :cond_0

    .line 116
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 117
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_1

    const v1, 0x10e0001

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-long v1, p1

    .line 118
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 119
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/E;

    invoke-direct {p1, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/E;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 120
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    if-eqz p2, :cond_2

    .line 121
    invoke-virtual {p2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_2
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z
    .locals 8

    .line 80
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    move-result-object v1

    const/4 v0, 0x0

    if-eqz v1, :cond_0

    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 82
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 83
    iget-object v4, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->c:Ljava/lang/String;

    .line 84
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 85
    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->BOTTOMSHEET:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->getValue()Ljava/lang/String;

    move-result-object v6

    .line 86
    iget-object v7, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->d:Ljava/lang/String;

    .line 87
    invoke-interface/range {v1 .. v7}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;->onVerificationStep(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    sget v3, Lcom/sumsub/sns/R$id;->sns_brief_details:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 89
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    sget v0, Lcom/sumsub/sns/R$id;->sns_intro_content:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :cond_2
    if-eqz v0, :cond_3

    .line 90
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    if-eqz v0, :cond_4

    .line 91
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_4
    if-eqz v0, :cond_5

    .line 92
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    .line 93
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 95
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 96
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 97
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 98
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 99
    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    return v1
.end method

.method public b(Lcom/sumsub/sns/internal/features/presentation/camera/N;)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->o()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 7
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/W;->d:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 8
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public b(Ljava/io/File;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->h:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

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

.method public getClosePayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->c:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getOpenPayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->c:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public abstract h()Landroid/view/View;
.end method

.method public handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/L;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->g()V

    .line 12
    :cond_0
    return-void

    .line 13
    .line 14
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a:Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 19
    .line 20
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/C;->a(Lcom/sumsub/sns/core/presentation/base/n;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 28
    return-void
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

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/N;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Lcom/sumsub/sns/internal/features/presentation/camera/N;)V

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
.end method

.method public abstract i()Landroid/widget/TextView;
.end method

.method public abstract j()Landroid/widget/TextView;
.end method

.method public abstract k()Landroid/widget/TextView;
.end method

.method public abstract l()Landroid/view/ViewGroup;
.end method

.method public abstract m()Landroidx/camera/view/PreviewView;
.end method

.method public abstract n()Z
.end method

.method public abstract o()Landroid/view/View;
.end method

.method public final onDestroyView()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/I;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 14
    .line 15
    :cond_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 16
    return-void
    .line 17
.end method

.method public onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    const/4 v0, 0x4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
    .line 23
    .line 24
    .line 25
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    .line 2
    const/16 p2, 0x18

    .line 3
    .line 4
    if-eq p1, p2, :cond_0

    .line 5
    .line 6
    const/16 p2, 0x19

    .line 7
    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->g()V

    .line 20
    .line 21
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    return-object p1
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->s()Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 7
    move-result-object p1

    .line 8
    const/4 p2, 0x0

    .line 9
    .line 10
    if-eqz p1, :cond_5

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/f0;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnCloseButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/g0;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnOptionButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    sget-object v3, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v2, v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v0, p2

    .line 64
    .line 65
    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v0, p2

    .line 72
    .line 73
    :goto_1
    if-eqz v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 85
    move-result v2

    .line 86
    .line 87
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 106
    goto :goto_2

    .line 107
    .line 108
    :cond_2
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move-object v0, p2

    .line 111
    .line 112
    :goto_2
    if-eqz v0, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 116
    move-result v0

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move-object v0, p2

    .line 128
    .line 129
    :goto_3
    if-nez v0, :cond_5

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    sget v1, Lcom/sumsub/sns/R$color;->sns_cameraContent:I

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 139
    move-result v0

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->q()Landroid/view/View;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/h0;

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 161
    .line 162
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    move-object p2, p1

    .line 166
    .line 167
    check-cast p2, Landroid/widget/ImageView;

    .line 168
    .line 169
    :cond_6
    if-eqz p2, :cond_7

    .line 170
    .line 171
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TAKE_PHOTO:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 185
    move-result-object v1

    .line 186
    .line 187
    .line 188
    invoke-interface {p1, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    .line 194
    .line 195
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->y()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->t()V

    .line 199
    return-void
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
.end method

.method public final onViewModelPrepared(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/I;->onViewModelPrepared(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->u()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->s()Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->n()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonVisible(Z)V

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->c:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->s()V

    .line 25
    return-void
.end method

.method public abstract p()Landroid/view/View;
.end method

.method public abstract q()Landroid/view/View;
.end method

.method public abstract r()Landroid/view/View;
.end method

.method public abstract s()Lcom/sumsub/sns/core/widget/SNSToolbarView;
.end method

.method public final t()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->l()Landroid/view/ViewGroup;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setHideable(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    sget v2, Lcom/sumsub/sns/R$dimen;->sns_collapsed_intro_height:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setPeekHeight(I)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    .line 31
    :goto_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->h()Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/l0;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/F;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 62
    :cond_2
    return-void
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
.end method

.method public final u()V
    .locals 14

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getLogTag()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v4, "initCamera, cameraX mode = "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    const/4 v4, 0x4

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 37
    move-result-object v7

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->e()Landroid/util/Size;

    .line 47
    move-result-object v8

    .line 48
    .line 49
    iget v9, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->d:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->f()Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 59
    move-result-object v10

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->v()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    sget-object v0, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 68
    :goto_0
    move-object v11, v0

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_0
    sget-object v0, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :goto_1
    new-instance v13, Lcom/sumsub/sns/internal/features/presentation/camera/I;

    .line 75
    .line 76
    .line 77
    invoke-direct {v13, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 78
    .line 79
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 80
    const/4 v12, 0x0

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v6 .. v13}, Lcom/sumsub/sns/internal/core/presentation/camera/l;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;ILcom/sumsub/sns/internal/core/presentation/camera/b;Landroidx/camera/core/CameraSelector;Lcom/sumsub/sns/internal/util/camera/d;Lcom/sumsub/sns/internal/core/presentation/camera/s;)V

    .line 84
    .line 85
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->P:Lcom/sumsub/sns/internal/ff/core/a;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-nez v0, :cond_1

    .line 103
    .line 104
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/K;->e:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 105
    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->m()Landroidx/camera/view/PreviewView;

    .line 114
    move-result-object v2

    .line 115
    const/4 v3, 0x0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    .line 119
    :cond_1
    return-void
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
.end method

.method public abstract v()Z
.end method

.method public w()V
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
.end method

.method public x()V
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
.end method

.method public final y()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->o()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    .line 13
    .line 14
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/W;->d:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    const/16 v1, 0x8

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    sget-object v4, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->GALLERY:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v3, v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 49
    move-result-object v1

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 56
    move-result-object v1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v1, v4

    .line 59
    .line 60
    :goto_1
    instance-of v5, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v1, v4

    .line 67
    .line 68
    :goto_2
    if-eqz v1, :cond_6

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 80
    move-result v5

    .line 81
    .line 82
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 101
    goto :goto_3

    .line 102
    .line 103
    :cond_3
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    move-object v1, v4

    .line 106
    .line 107
    :goto_3
    if-eqz v1, :cond_6

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 111
    move-result v1

    .line 112
    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    .line 116
    .line 117
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 118
    .line 119
    .line 120
    invoke-direct {v3, v1, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 124
    .line 125
    :cond_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    move-object v1, v4

    .line 128
    .line 129
    :goto_4
    if-nez v1, :cond_7

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    sget v3, Lcom/sumsub/sns/R$color;->sns_cameraContent:I

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 139
    move-result v1

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    .line 144
    .line 145
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 146
    .line 147
    .line 148
    invoke-direct {v3, v1, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 152
    .line 153
    :cond_7
    instance-of v1, v0, Landroid/widget/ImageView;

    .line 154
    .line 155
    if-eqz v1, :cond_8

    .line 156
    move-object v4, v0

    .line 157
    .line 158
    check-cast v4, Landroid/widget/ImageView;

    .line 159
    .line 160
    :cond_8
    if-eqz v4, :cond_9

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 164
    .line 165
    :cond_9
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/m0;

    .line 166
    .line 167
    .line 168
    invoke-direct {v1, v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/m0;-><init>(Landroid/view/View;Lcom/sumsub/sns/internal/features/presentation/camera/K;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 172
    :cond_a
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
