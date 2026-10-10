.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/M0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;",
        ">;",
        "Lcom/sumsub/sns/internal/core/common/M0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;",
        "Lcom/sumsub/sns/internal/core/common/M0;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/camera/photo/document/y",
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
        "SMAP\nSNSPhotoDocumentPickerFragment2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPhotoDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,460:1\n106#2,15:461\n90#3,6:476\n337#4:482\n*S KotlinDebug\n*F\n+ 1 SNSPhotoDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment2\n*L\n58#1:461,15\n343#1:476,6\n367#1:482\n*E\n"
    }
.end annotation


# static fields
.field public static final o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

.field public static final synthetic p:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/utils/O;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public final h:Landroid/graphics/Matrix;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/Rect;

.field public final k:Landroid/graphics/Matrix;

.field public l:Landroid/graphics/Bitmap;

.field public m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getPhotoMadeOverlay()Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "photoMadeOverlay"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->p:[Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;-><init>()V

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    .line 27
    return-void
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

.method public constructor <init>()V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p3;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/E;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/H;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s3;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 54
    .line 55
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/camera/n;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/p;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/n;)V

    .line 62
    .line 63
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 64
    .line 65
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 66
    .line 67
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t3;

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 71
    .line 72
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u3;

    .line 73
    .line 74
    .line 75
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/u3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 76
    .line 77
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v3;

    .line 78
    .line 79
    .line 80
    invoke-direct {v7, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/v3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 81
    .line 82
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w3;

    .line 83
    .line 84
    .line 85
    invoke-direct {v8, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/w3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 86
    .line 87
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;

    .line 88
    const/4 v0, 0x0

    .line 89
    .line 90
    .line 91
    invoke-direct {v9, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x3;

    .line 94
    .line 95
    .line 96
    invoke-direct {v10, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/x3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 97
    .line 98
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y3;

    .line 99
    .line 100
    .line 101
    invoke-direct {v11, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 102
    .line 103
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z3;

    .line 104
    .line 105
    .line 106
    invoke-direct {v12, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 107
    move-object v4, p0

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v3 .. v12}, Lcom/sumsub/sns/internal/features/presentation/camera/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    iput-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 113
    .line 114
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 118
    .line 119
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 120
    .line 121
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/O;

    .line 122
    .line 123
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a4;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/a4;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/O;-><init>(Lcom/sumsub/sns/core/presentation/base/I;Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->e:Lcom/sumsub/sns/internal/features/presentation/utils/O;

    .line 132
    .line 133
    sget v0, Lcom/sumsub/sns/R$id;->photo_made_indicator:I

    .line 134
    .line 135
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 139
    .line 140
    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, Lcom/sumsub/sns/core/presentation/a;->a(Lcom/sumsub/sns/core/presentation/base/l;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 147
    .line 148
    new-instance v0, Landroid/graphics/Matrix;

    .line 149
    .line 150
    .line 151
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 152
    .line 153
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->h:Landroid/graphics/Matrix;

    .line 154
    .line 155
    new-instance v0, Landroid/graphics/RectF;

    .line 156
    .line 157
    .line 158
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 159
    .line 160
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->i:Landroid/graphics/RectF;

    .line 161
    .line 162
    new-instance v0, Landroid/graphics/Rect;

    .line 163
    .line 164
    .line 165
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 166
    .line 167
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->j:Landroid/graphics/Rect;

    .line 168
    .line 169
    new-instance v0, Landroid/graphics/Matrix;

    .line 170
    .line 171
    .line 172
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 173
    .line 174
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->k:Landroid/graphics/Matrix;

    .line 175
    return-void
    .line 176
    .line 177
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lcom/sumsub/sns/internal/features/presentation/camera/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/t2;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/base/r;)Lkotlin/Unit;
    .locals 0

    .line 87
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;

    .line 88
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;->a:Lkotlin/jvm/functions/Function0;

    .line 89
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 90
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/internal/core/presentation/camera/r;)Lkotlin/Unit;
    .locals 2

    .line 26
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;

    if-eqz v0, :cond_0

    .line 27
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 28
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 29
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;

    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;->a:Ljava/io/File;

    .line 31
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Ljava/io/File;)V

    goto/16 :goto_0

    .line 32
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/o;

    if-eqz v0, :cond_1

    .line 33
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 34
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 37
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 38
    const-string/jumbo p1, "onCameraPreviewReady"

    const/4 v0, 0x0

    const-string v1, "DocCapture"

    invoke-virtual {p0, v1, p1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 39
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/q;

    if-eqz v0, :cond_2

    .line 40
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 41
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 42
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/q;

    .line 43
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/q;->a:Ljava/io/File;

    .line 44
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->b(Ljava/io/File;)V

    goto :goto_0

    .line 45
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/p;

    if-eqz v0, :cond_3

    .line 46
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 47
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 48
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/p;

    .line 49
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/p;->a:Lcom/sumsub/sns/internal/core/presentation/camera/f;

    .line 50
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V

    goto :goto_0

    .line 51
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/m;

    if-eqz v0, :cond_5

    .line 52
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 53
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 54
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/m;

    .line 55
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/m;->a:Ljava/lang/Exception;

    .line 56
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/w;

    if-eqz p1, :cond_4

    .line 57
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 58
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k1;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_0

    .line 61
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 63
    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 7

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 6
    iget-boolean p0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->L:Z

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 7
    iget-boolean p0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->G:Z

    if-eqz p0, :cond_1

    .line 8
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 10
    const-string p1, "DocCapture"

    const-string v0, "Gallery picking NOT allowed here!!"

    invoke-virtual {p0, p1, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v1, p1, v0, p0}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    sget-boolean p0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-nez p0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_1
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "current_side"

    invoke-virtual {p0, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    const/16 v2, 0x3ef

    .line 16
    invoke-static {p1, v1, v1, p0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object v2

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 17
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Z)Lkotlin/Unit;
    .locals 10

    .line 18
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 19
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    if-nez v0, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 23
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G1;

    const/4 v1, 0x0

    invoke-direct {v7, p1, p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G1;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 25
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/core/presentation/base/m;)V
    .locals 3

    .line 155
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getBaseActivity()Lcom/sumsub/sns/core/presentation/base/f;

    move-result-object p0

    .line 156
    iget-object v0, p1, Lcom/sumsub/sns/core/presentation/base/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 157
    iget-object v1, p1, Lcom/sumsub/sns/core/presentation/base/m;->b:Ljava/lang/String;

    .line 158
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/m;->c:Ljava/lang/CharSequence;

    .line 159
    sget v2, Lcom/sumsub/sns/core/presentation/base/f;->i:I

    const/4 v2, 0x0

    .line 160
    invoke-virtual {p0, v0, v1, p1, v2}, Lcom/sumsub/sns/core/presentation/base/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lcom/sumsub/sns/internal/core/presentation/android/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->n:Lcom/sumsub/sns/internal/core/presentation/android/g;

    return-object p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lcom/sumsub/sns/internal/features/presentation/camera/r;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/z;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/presentation/camera/z;-><init>()V

    .line 8
    .line 9
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/a;

    .line 10
    .line 11
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 18
    .line 19
    iget-boolean v4, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->c:Z

    .line 20
    const/4 v5, 0x0

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->k:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    iget-boolean v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->Q:Z

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    :goto_1
    move v3, v5

    .line 46
    .line 47
    :goto_2
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 48
    .line 49
    .line 50
    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 54
    .line 55
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/a;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 59
    .line 60
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/e;

    .line 61
    .line 62
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 63
    .line 64
    .line 65
    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->g()Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 75
    .line 76
    .line 77
    invoke-interface {v6}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 78
    move-result-object v6

    .line 79
    .line 80
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 81
    .line 82
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->h:Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 83
    .line 84
    iget-object v7, v7, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 85
    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    iget-boolean v6, v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->G:Z

    .line 89
    .line 90
    if-eqz v6, :cond_3

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    const/4 v7, 0x0

    .line 93
    .line 94
    :goto_3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 95
    .line 96
    .line 97
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 101
    .line 102
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 103
    .line 104
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 105
    .line 106
    iget v9, v6, Lcom/sumsub/sns/internal/ml/autocapture/g;->a:I

    .line 107
    .line 108
    iget-object v6, v6, Lcom/sumsub/sns/internal/ml/autocapture/g;->c:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    .line 112
    move-result-object v10

    .line 113
    .line 114
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 115
    .line 116
    iget-object v6, v6, Lcom/sumsub/sns/internal/ml/autocapture/g;->d:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 117
    .line 118
    .line 119
    invoke-static {v6}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    .line 120
    move-result-object v11

    .line 121
    .line 122
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 123
    .line 124
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 125
    .line 126
    iget v12, v12, Lcom/sumsub/sns/internal/ml/autocapture/g;->b:I

    .line 127
    int-to-long v12, v12

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 131
    move-result-wide v12

    .line 132
    .line 133
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 134
    .line 135
    iget v0, v0, Lcom/sumsub/sns/internal/ml/autocapture/g;->e:I

    .line 136
    int-to-long v14, v0

    .line 137
    .line 138
    .line 139
    const-wide/32 v16, 0x100000

    .line 140
    .line 141
    mul-long v14, v14, v16

    .line 142
    .line 143
    .line 144
    invoke-direct/range {v8 .. v15}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>(ILandroidx/camera/video/Quality;Landroidx/camera/video/Quality;JJ)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v3, v5, v4, v7, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/e;-><init>(ZLcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;Lcom/sumsub/sns/internal/core/presentation/camera/b;)V

    .line 148
    .line 149
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/r;

    .line 150
    .line 151
    .line 152
    invoke-direct {v0, v3, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/e;Lcom/sumsub/sns/internal/features/presentation/camera/a;Lcom/sumsub/sns/internal/features/presentation/camera/z;)V

    .line 153
    return-object v0
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
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->j()V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    return-object p0
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

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 11
    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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
.end method

.method public static final f(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Lcom/sumsub/sns/internal/features/presentation/camera/m;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->l:Lcom/sumsub/sns/internal/features/presentation/camera/m;

    .line 11
    return-object p0
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
.end method

.method public static final g(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;

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
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

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
.method public final a(II)Landroid/graphics/Bitmap;
    .locals 5

    .line 161
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 163
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v1, p2, :cond_0

    .line 164
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->l:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 166
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_1

    .line 167
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 168
    :cond_1
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->l:Landroid/graphics/Bitmap;

    .line 169
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 170
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 171
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "prepared frame bitmap "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "x"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 172
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 173
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 174
    const-string v3, "DocCapture"

    invoke-virtual {v2, v3, p2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p2, 0x1

    .line 175
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eq p1, p2, :cond_3

    .line 176
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 177
    :cond_3
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->l:Landroid/graphics/Bitmap;

    return-object p2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;)V
    .locals 11

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleDocumentCaptureState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 93
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 94
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;)V

    .line 96
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 97
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    const/4 v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    .line 98
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;

    if-eqz v1, :cond_4

    .line 99
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/z;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v6, v1

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v2, :cond_1

    const/4 v6, 0x4

    if-ne v1, v6, :cond_0

    .line 100
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->GREEN:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    goto :goto_0

    .line 101
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 102
    :cond_1
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->YELLOW:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    goto :goto_0

    .line 103
    :cond_2
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->RED:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    goto :goto_0

    .line 104
    :cond_3
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    :goto_0
    if-nez v1, :cond_6

    .line 105
    :cond_4
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->b:Ljava/lang/Boolean;

    .line 106
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 107
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->RED:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    goto :goto_1

    .line 108
    :cond_5
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;->DEFAULT:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    .line 109
    :cond_6
    :goto_1
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->h:Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 110
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 111
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/d;->h:[Lkotlin/reflect/KProperty;

    const/4 v8, 0x0

    aget-object v7, v7, v8

    invoke-virtual {v6, v0, v7}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;

    if-eqz v0, :cond_7

    .line 112
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->setState(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)V

    .line 113
    :cond_7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 114
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;

    if-eqz v1, :cond_8

    .line 115
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;->a:Ljava/lang/String;

    goto :goto_2

    :cond_8
    move-object v6, v3

    :goto_2
    if-eqz v1, :cond_9

    .line 116
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/e1;->b:Ljava/lang/String;

    goto :goto_3

    :cond_9
    move-object v1, v3

    .line 117
    :goto_3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;->f:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;

    if-eqz v6, :cond_c

    .line 118
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 119
    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->l:[Lkotlin/reflect/KProperty;

    aget-object v10, v9, v5

    invoke-virtual {v7, v0, v10}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_a

    .line 120
    invoke-static {v7, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 121
    :cond_a
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v9, v4

    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_b

    .line 122
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    .line 123
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v7

    invoke-interface {v7, v4, v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 124
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 125
    :cond_b
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v4, v9, v8

    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_d

    .line 126
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->a(Landroid/view/View;)V

    goto :goto_4

    .line 127
    :cond_c
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 128
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->l:[Lkotlin/reflect/KProperty;

    aget-object v4, v4, v8

    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_d

    .line 129
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->b(Landroid/view/View;)V

    .line 130
    :cond_d
    :goto_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 131
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;

    if-eqz v1, :cond_e

    .line 132
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Z0;->a:Ljava/lang/String;

    goto :goto_5

    :cond_e
    move-object v1, v3

    .line 133
    :goto_5
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->b:Ljava/lang/Boolean;

    .line 134
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 135
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;

    .line 136
    invoke-virtual {v0, v1, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->a(Ljava/lang/String;Z)V

    .line 137
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 138
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;

    if-eqz v1, :cond_f

    goto :goto_6

    :cond_f
    move v5, v8

    :goto_6
    if-eqz v1, :cond_10

    .line 139
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;->a:Lcom/sumsub/sns/internal/features/data/model/common/q2;

    goto :goto_7

    :cond_10
    move-object v4, v3

    :goto_7
    if-eqz v1, :cond_11

    .line 140
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;->b:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    goto :goto_8

    :cond_11
    move-object v6, v3

    :goto_8
    if-eqz v1, :cond_12

    .line 141
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/p1;->c:Ljava/lang/Float;

    .line 142
    :cond_12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;->f:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;

    .line 143
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->k:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 144
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l;->l:[Lkotlin/reflect/KProperty;

    aget-object v2, v7, v2

    invoke-virtual {v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    if-nez v0, :cond_13

    goto :goto_a

    :cond_13
    if-nez v5, :cond_14

    .line 145
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->b(Landroid/view/View;)V

    goto :goto_a

    .line 146
    :cond_14
    instance-of v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/k2;

    if-eqz v1, :cond_15

    sget v1, Lcom/sumsub/sns/R$raw;->sns_autocapture_tilt_passport:I

    goto :goto_9

    .line 147
    :cond_15
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v6, v1, :cond_16

    sget v1, Lcom/sumsub/sns/R$raw;->sns_autocapture_tilt_id_back:I

    goto :goto_9

    .line 148
    :cond_16
    sget v1, Lcom/sumsub/sns/R$raw;->sns_autocapture_tilt_id_front:I

    .line 149
    :goto_9
    invoke-static {v0, v3}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Float;)V

    .line 150
    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    .line 151
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->a(Landroid/view/View;)V

    .line 152
    :goto_a
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->f:Lcom/sumsub/sns/core/presentation/base/m;

    if-eqz v0, :cond_17

    .line 153
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_17

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r3;

    invoke-direct {v2, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r3;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/core/presentation/base/m;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 154
    :cond_17
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;)V
    .locals 5

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 65
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 66
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 67
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;->a:Z

    .line 71
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/t;->a(Z)V

    .line 72
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;

    .line 73
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r1;

    .line 74
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;->h:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 75
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 76
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->k:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x1

    aget-object v4, v3, v4

    invoke-virtual {v2, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_0

    .line 77
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r1;->a:Ljava/lang/CharSequence;

    .line 78
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    :cond_0
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-virtual {v2, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v2, :cond_1

    .line 80
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/r1;->b:I

    .line 81
    invoke-virtual {v2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 82
    :cond_1
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v1, v3, v1

    invoke-virtual {p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    .line 83
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/c1;->a(Landroid/view/View;)V

    return-void

    .line 84
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 85
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/G2;->k:[Lkotlin/reflect/KProperty;

    aget-object v1, v2, v1

    invoke-virtual {p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    if-eqz p1, :cond_3

    .line 86
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/c1;->b(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 5
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;->a:Ljava/io/File;

    if-eqz v4, :cond_3

    .line 6
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    .line 7
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    if-eqz v5, :cond_0

    .line 8
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;->a:Ljava/io/File;

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_1

    .line 9
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;->b:Z

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_3

    .line 10
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 11
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 12
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 13
    iget v8, v5, Lcom/sumsub/sns/internal/ml/autocapture/g;->a:I

    .line 14
    iget-object v5, v5, Lcom/sumsub/sns/internal/ml/autocapture/g;->c:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 15
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    move-result-object v9

    .line 16
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 17
    iget-object v5, v5, Lcom/sumsub/sns/internal/ml/autocapture/g;->d:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 18
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;)Landroidx/camera/video/Quality;

    move-result-object v10

    .line 19
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 20
    iget v11, v11, Lcom/sumsub/sns/internal/ml/autocapture/g;->b:I

    int-to-long v11, v11

    .line 21
    invoke-virtual {v5, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    .line 22
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->i:Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 23
    iget v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/g;->e:I

    int-to-long v13, v2

    const-wide/32 v15, 0x100000

    mul-long/2addr v13, v15

    .line 24
    invoke-direct/range {v7 .. v14}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>(ILandroidx/camera/video/Quality;Landroidx/camera/video/Quality;JJ)V

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "start video recording: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 26
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 27
    iget-object v7, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 28
    const-string v8, "DocCapture"

    invoke-virtual {v7, v8, v2, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 30
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 31
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    if-nez v7, :cond_2

    .line 32
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 33
    iget-object v4, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 34
    const-string/jumbo v5, "startVideoRecording: cameraX is null, aborting"

    invoke-virtual {v4, v2, v5, v6}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 35
    :cond_2
    invoke-virtual {v7, v4}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Ljava/io/File;)V

    .line 36
    :cond_3
    :goto_2
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    if-eqz v1, :cond_4

    .line 37
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;->b:Z

    if-nez v1, :cond_4

    .line 38
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    if-eqz v1, :cond_4

    .line 39
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;

    if-eqz v1, :cond_4

    .line 40
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q1;->b:Z

    if-ne v1, v3, :cond_4

    .line 41
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 42
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 43
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    if-eqz v1, :cond_4

    .line 44
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->f()V

    :cond_4
    return-void
.end method

.method public final getClosePayload()Ljava/util/Map;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 27
    .line 28
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 29
    const/4 v3, 0x5

    .line 30
    .line 31
    aget-object v2, v2, v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    const-string v2, "isAutocaptureEnabled"

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 54
    .line 55
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->b:Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    const-string v2, "isAutocaptureActive"

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_0
    return-object v0
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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_document_picker_v2:I

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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->F:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 27
    .line 28
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->U:[Lkotlin/reflect/KProperty;

    .line 29
    const/4 v3, 0x5

    .line 30
    .line 31
    aget-object v2, v2, v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    const-string v2, "isAutocaptureEnabled"

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 54
    .line 55
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d1;->b:Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    const-string v2, "isAutocaptureActive"

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_0
    return-object v0
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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

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

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 10
    .line 11
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 20
    .line 21
    .line 22
    const-string/jumbo v3, "takePicture: cameraX is null, aborting"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->g()V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 37
    move-object v2, p1

    .line 38
    .line 39
    check-cast v2, Lcom/sumsub/sns/core/presentation/base/n;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->j:Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/C;->a(Lcom/sumsub/sns/core/presentation/base/n;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/P;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->e:Lcom/sumsub/sns/internal/features/presentation/utils/O;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 59
    .line 60
    :goto_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;

    .line 66
    .line 67
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;->a:Landroid/util/Size;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 71
    move-result v0

    .line 72
    int-to-float v0, v0

    .line 73
    .line 74
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;->b:Landroid/util/Size;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 78
    move-result v1

    .line 79
    int-to-float v1, v1

    .line 80
    div-float/2addr v0, v1

    .line 81
    .line 82
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;->a:Landroid/util/Size;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 86
    move-result v1

    .line 87
    int-to-float v1, v1

    .line 88
    .line 89
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;->b:Landroid/util/Size;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 93
    move-result v3

    .line 94
    int-to-float v3, v3

    .line 95
    div-float/2addr v1, v3

    .line 96
    .line 97
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m1;->c:Lcom/sumsub/sns/internal/ml/docdetector/a;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ml/docdetector/a;->a()Landroid/graphics/Rect;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/i;->a(Landroid/graphics/Rect;FF)Landroid/graphics/Rect;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    new-instance v0, Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, p1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 111
    .line 112
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->h:Landroid/graphics/Matrix;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 116
    .line 117
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 118
    .line 119
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->h:Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 120
    .line 121
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 122
    .line 123
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/d;->h:[Lkotlin/reflect/KProperty;

    .line 124
    .line 125
    aget-object v2, v3, v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, p1, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    check-cast p1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;

    .line 132
    .line 133
    if-eqz p1, :cond_8

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->setDocRect(Landroid/graphics/RectF;)V

    .line 137
    return-void

    .line 138
    .line 139
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f1;

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 144
    .line 145
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->h:Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 146
    .line 147
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/d;->f:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 148
    .line 149
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/d;->h:[Lkotlin/reflect/KProperty;

    .line 150
    .line 151
    aget-object v2, v3, v2

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p1, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    check-cast p1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;

    .line 158
    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->setDocRect(Landroid/graphics/RectF;)V

    .line 163
    return-void

    .line 164
    .line 165
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n1;

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 170
    .line 171
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->p:[Lkotlin/reflect/KProperty;

    .line 172
    .line 173
    aget-object v1, v1, v2

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    check-cast v0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 180
    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q3;

    .line 184
    .line 185
    .line 186
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/q3;-><init>(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;->flash(Lkotlin/jvm/functions/Function0;)V

    .line 190
    return-void

    .line 191
    .line 192
    :cond_6
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/l1;

    .line 193
    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    const/16 p1, 0x64

    .line 197
    const/4 v0, 0x2

    .line 198
    .line 199
    .line 200
    invoke-static {p0, p1, v1, v0, v1}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 201
    return-void

    .line 202
    .line 203
    :cond_7
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/k1;

    .line 204
    .line 205
    if-eqz p1, :cond_8

    .line 206
    .line 207
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 208
    .line 209
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n()V

    .line 213
    :cond_8
    return-void
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
.end method

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;)V

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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "finishing photo screen: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    .line 23
    const-string v1, "DocCapture"

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    .line 37
    move-result p1

    .line 38
    const/4 v0, 0x3

    .line 39
    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    const/4 v0, 0x4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 56
    const/4 p1, 0x1

    .line 57
    return p1
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

.method public final onKeyDown(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->k:Lcom/sumsub/sns/internal/features/presentation/camera/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/c;->onKeyDown(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    .line 9
    const-string p2, "DocCapture"

    .line 10
    .line 11
    const-string v0, "creating Document Picker view, autoCaptureExpanded = true"

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->a:Lkotlin/Lazy;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;->H:Lkotlinx/coroutines/flow/n;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lkotlin/coroutines/Continuation;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 38
    return-void
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
.end method
