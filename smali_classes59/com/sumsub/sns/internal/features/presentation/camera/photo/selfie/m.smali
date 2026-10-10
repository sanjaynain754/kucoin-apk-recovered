.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;
.super Lcom/sumsub/sns/internal/features/presentation/camera/K;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/K<",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/K;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/camera/photo/selfie/a",
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
        "SMAP\nSNSSelfieWithDocumentPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,62:1\n106#2,15:63\n*S KotlinDebug\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment\n*L\n21#1:63,15\n*E\n"
    }
.end annotation


# static fields
.field public static final v:Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a;

.field public static final synthetic w:[Lkotlin/reflect/KProperty;


# instance fields
.field public final i:Lkotlin/Lazy;

.field public final j:Lcom/sumsub/sns/internal/core/common/L;

.field public final k:Lcom/sumsub/sns/internal/core/common/L;

.field public final l:Lcom/sumsub/sns/internal/core/common/L;

.field public final m:Lcom/sumsub/sns/internal/core/common/L;

.field public final n:Lcom/sumsub/sns/internal/core/common/L;

.field public final o:Lcom/sumsub/sns/internal/core/common/L;

.field public final p:Lcom/sumsub/sns/internal/core/common/L;

.field public final q:Lcom/sumsub/sns/internal/core/common/L;

.field public final r:Lcom/sumsub/sns/internal/core/common/L;

.field public final s:Lcom/sumsub/sns/internal/core/common/L;

.field public final t:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public final u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "rootView"

    .line 6
    .line 7
    const-string v2, "getRootView()Landroid/view/View;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "takePictureProgressView"

    .line 16
    .line 17
    const-string v4, "getTakePictureProgressView()Landroid/view/View;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "takePictureViewContainer"

    .line 25
    .line 26
    const-string v5, "getTakePictureViewContainer()Landroid/view/View;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "takeGalleryView"

    .line 34
    .line 35
    const-string v6, "getTakeGalleryView()Landroid/view/View;"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    const-string/jumbo v6, "toolbar"

    .line 43
    .line 44
    const-string v7, "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    .line 51
    const-string/jumbo v7, "progressBar"

    .line 52
    .line 53
    const-string v8, "getProgressBar()Landroid/view/View;"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    const-string v8, "helperView"

    .line 60
    .line 61
    const-string v9, "getHelperView()Landroid/view/ViewGroup;"

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 65
    move-result-object v8

    .line 66
    .line 67
    const-string v9, "helperTitle"

    .line 68
    .line 69
    const-string v10, "getHelperTitle()Landroid/widget/TextView;"

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 73
    move-result-object v9

    .line 74
    .line 75
    const-string v10, "helperBrief"

    .line 76
    .line 77
    const-string v11, "getHelperBrief()Landroid/widget/TextView;"

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v10, v11, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 81
    move-result-object v10

    .line 82
    .line 83
    const-string v11, "helperDetails"

    .line 84
    .line 85
    const-string v12, "getHelperDetails()Landroid/widget/TextView;"

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v11, v12, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 89
    move-result-object v11

    .line 90
    .line 91
    const-string v12, "helperDetailsFrame"

    .line 92
    .line 93
    const-string v13, "getHelperDetailsFrame()Landroid/view/ViewGroup;"

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v12, v13, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 97
    move-result-object v12

    .line 98
    .line 99
    const-string v13, "darkOverlay"

    .line 100
    .line 101
    const-string v14, "getDarkOverlay()Landroid/view/View;"

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v13, v14, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 105
    move-result-object v13

    .line 106
    .line 107
    .line 108
    const-string/jumbo v14, "previewView"

    .line 109
    .line 110
    const-string v15, "getPreviewView()Landroidx/camera/view/PreviewView;"

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v14, v15, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    const/16 v14, 0xd

    .line 117
    .line 118
    new-array v14, v14, [Lkotlin/reflect/KProperty;

    .line 119
    .line 120
    aput-object v1, v14, v3

    .line 121
    const/4 v1, 0x1

    .line 122
    .line 123
    aput-object v2, v14, v1

    .line 124
    const/4 v1, 0x2

    .line 125
    .line 126
    aput-object v4, v14, v1

    .line 127
    const/4 v1, 0x3

    .line 128
    .line 129
    aput-object v5, v14, v1

    .line 130
    const/4 v1, 0x4

    .line 131
    .line 132
    aput-object v6, v14, v1

    .line 133
    const/4 v1, 0x5

    .line 134
    .line 135
    aput-object v7, v14, v1

    .line 136
    const/4 v1, 0x6

    .line 137
    .line 138
    aput-object v8, v14, v1

    .line 139
    const/4 v1, 0x7

    .line 140
    .line 141
    aput-object v9, v14, v1

    .line 142
    .line 143
    const/16 v1, 0x8

    .line 144
    .line 145
    aput-object v10, v14, v1

    .line 146
    .line 147
    const/16 v1, 0x9

    .line 148
    .line 149
    aput-object v11, v14, v1

    .line 150
    .line 151
    const/16 v1, 0xa

    .line 152
    .line 153
    aput-object v12, v14, v1

    .line 154
    .line 155
    const/16 v1, 0xb

    .line 156
    .line 157
    aput-object v13, v14, v1

    .line 158
    .line 159
    const/16 v1, 0xc

    .line 160
    .line 161
    aput-object v0, v14, v1

    .line 162
    .line 163
    sput-object v14, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 164
    .line 165
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a;

    .line 166
    .line 167
    .line 168
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a;-><init>()V

    .line 169
    .line 170
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->v:Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a;

    .line 171
    return-void
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/h0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/b;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/d;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/e;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->i:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button_progress:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->k:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_gallery:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->m:Lcom/sumsub/sns/internal/core/common/L;

    .line 83
    .line 84
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper:I

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 90
    .line 91
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->n:Lcom/sumsub/sns/internal/core/common/L;

    .line 92
    .line 93
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper_title:I

    .line 94
    .line 95
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 99
    .line 100
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->o:Lcom/sumsub/sns/internal/core/common/L;

    .line 101
    .line 102
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper_brief:I

    .line 103
    .line 104
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 108
    .line 109
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    .line 110
    .line 111
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper_details:I

    .line 112
    .line 113
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 117
    .line 118
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    .line 119
    .line 120
    sget v0, Lcom/sumsub/sns/R$id;->sns_dark_overlay:I

    .line 121
    .line 122
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 126
    .line 127
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->r:Lcom/sumsub/sns/internal/core/common/L;

    .line 128
    .line 129
    sget v0, Lcom/sumsub/sns/R$id;->sns_camera_preview:I

    .line 130
    .line 131
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 132
    .line 133
    .line 134
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 135
    .line 136
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->s:Lcom/sumsub/sns/internal/core/common/L;

    .line 137
    .line 138
    .line 139
    invoke-static {p0}, Lcom/sumsub/sns/core/presentation/a;->a(Lcom/sumsub/sns/core/presentation/base/l;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->t:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 143
    const/4 v0, 0x1

    .line 144
    .line 145
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->u:Z

    .line 146
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/B;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    .line 14
    return-object v0
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
.end method


# virtual methods
.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_selfie_document_picker:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->t:Lcom/sumsub/sns/internal/core/analytics/Screen;

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final h()Landroid/view/View;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->r:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xb

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/view/View;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final i()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final j()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final k()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->o:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x7

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final l()Landroid/view/ViewGroup;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->n:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x6

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final m()Landroidx/camera/view/PreviewView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->s:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xc

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final n()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
.end method

.method public final o()Landroid/view/View;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final p()Landroid/view/View;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final q()Landroid/view/View;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->r()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget v1, Lcom/sumsub/sns/R$id;->sns_button:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final r()Landroid/view/View;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->k:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final s()Lcom/sumsub/sns/core/widget/SNSToolbarView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->m:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x4

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final v()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;->u:Z

    .line 3
    return v0
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
