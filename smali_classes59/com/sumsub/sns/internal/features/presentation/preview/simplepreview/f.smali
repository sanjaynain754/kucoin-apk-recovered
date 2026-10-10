.class public final Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/B;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/B;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;",
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
        "SMAP\nSNSSimpleDocumentPreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSimpleDocumentPreviewFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/simplepreview/SNSSimpleDocumentPreviewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,163:1\n106#2,15:164\n256#3,2:179\n256#3,2:181\n256#3,2:183\n*S KotlinDebug\n*F\n+ 1 SNSSimpleDocumentPreviewFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/simplepreview/SNSSimpleDocumentPreviewFragment\n*L\n45#1:164,15\n125#1:179,2\n126#1:181,2\n127#1:183,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/e;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/a;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/c;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/d;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/d;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->DocumentPreviewScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->b:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    const-string v1, "doc_set_type"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    :cond_0
    const-string v0, "TYPE_UNKNOWN"

    .line 67
    .line 68
    :cond_1
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->c:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/documents/D;->c:Ljava/lang/Integer;

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v0, 0x0

    .line 79
    .line 80
    :goto_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->d:Ljava/lang/Integer;

    .line 81
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)Lkotlin/Unit;
    .locals 5

    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->RetakeButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 43
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    goto :goto_0

    .line 44
    :cond_0
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/domain/documents/D;->b:Z

    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "isFromGallery"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 46
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    :goto_0
    const/4 v3, 0x4

    const/4 v4, 0x0

    .line 47
    invoke-static {v0, v1, v2, v4, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a(ZZ)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {p0, v1, v2, v0, v4}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/B;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/sumsub/sns/databinding/B;->c:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotateCCW()V

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/B;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/sumsub/sns/databinding/B;->c:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getRotation()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ConfirmButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/domain/documents/D;->b:Z

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    const-string v3, "isFromGallery"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 33
    move-result-object v2

    .line 34
    :goto_0
    const/4 v3, 0x4

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v2, v4, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 39
    const/4 v0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a(ZZ)Landroid/os/Bundle;

    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x1

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v0, v1, v2, v4}, Lcom/sumsub/sns/core/presentation/base/l;->finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    return-object p0
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

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v2, "image_data"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/l;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/D;Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;Landroid/os/Bundle;Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 30
    return-object v0
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
.method public final a(ZZ)Landroid/os/Bundle;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 3
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/documents/H;

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 5
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/domain/documents/D;->a:Ljava/io/File;

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 7
    iget-boolean p2, p2, Lcom/sumsub/sns/internal/features/domain/documents/D;->b:Z

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 8
    :goto_0
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/domain/documents/H;-><init>(Ljava/io/File;Z)V

    goto :goto_2

    :cond_2
    if-eqz p2, :cond_4

    .line 9
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/documents/F;

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 11
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/domain/documents/D;->a:Ljava/io/File;

    .line 12
    :cond_3
    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/domain/documents/F;-><init>(Ljava/io/File;)V

    goto :goto_2

    .line 13
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->d:Ljava/lang/Integer;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 15
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/D;->c:Ljava/lang/Integer;

    if-nez v1, :cond_5

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne p2, v1, :cond_7

    :cond_6
    move-object p1, v0

    .line 17
    :cond_7
    :goto_1
    new-instance p2, Lcom/sumsub/sns/internal/features/domain/documents/J;

    .line 18
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 19
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/domain/documents/D;->a:Ljava/io/File;

    .line 20
    :cond_8
    invoke-direct {p2, v0, p1}, Lcom/sumsub/sns/internal/features/domain/documents/J;-><init>(Ljava/io/File;Ljava/lang/Integer;)V

    move-object p1, p2

    .line 21
    :goto_2
    const-string/jumbo p2, "result_data"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p1}, [Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;)V
    .locals 3

    .line 22
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/B;

    if-eqz v0, :cond_1

    .line 23
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;

    if-eqz v1, :cond_0

    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/databinding/B;->c:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;

    .line 25
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;->a:Landroid/graphics/Bitmap;

    .line 26
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 27
    iget-object v1, v0, Lcom/sumsub/sns/databinding/B;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 28
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;->b:Ljava/lang/String;

    .line 29
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object v1, v0, Lcom/sumsub/sns/databinding/B;->e:Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/g;->c:Ljava/lang/String;

    .line 32
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    iget-object p1, v0, Lcom/sumsub/sns/databinding/B;->e:Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    iget-object p1, v0, Lcom/sumsub/sns/databinding/B;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    .line 36
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    iget-object p1, v0, Lcom/sumsub/sns/databinding/B;->h:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 38
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    iget-object p1, v0, Lcom/sumsub/sns/databinding/B;->e:Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/n;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)V

    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 40
    iget-object p1, v0, Lcom/sumsub/sns/databinding/B;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/o;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)V

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void

    .line 41
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method

.method public final f()Lcom/sumsub/sns/internal/features/domain/documents/D;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "image_data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->c:Ljava/lang/String;

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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/domain/documents/D;->b:Z

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "isFromGallery"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->b:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;

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

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;)V

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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/sumsub/sns/databinding/B;

    .line 10
    const/4 p2, 0x0

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object p1, p1, Lcom/sumsub/sns/databinding/B;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSMetricElement;->BOTTOM_SHEET_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    sget v1, Lcom/sumsub/sns/R$dimen;->sns_bottom_sheet_corner_radius:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    move-result v0

    .line 42
    int-to-float v0, v0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->BOTTOM_SHEET_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 62
    move-result v3

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 72
    move-result v1

    .line 73
    goto :goto_1

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    sget v2, Lcom/sumsub/sns/R$color;->sns_bottomSheetBackground:I

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 83
    move-result v1

    .line 84
    .line 85
    :goto_1
    new-instance v2, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 86
    .line 87
    new-instance v3, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->toBuilder()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p2, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopLeftCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p2, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopRightCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-direct {v2, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    check-cast p1, Lcom/sumsub/sns/databinding/B;

    .line 126
    const/4 v0, 0x1

    .line 127
    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    iget-object p1, p1, Lcom/sumsub/sns/databinding/B;->f:Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    sget-object v2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ROTATE_CCW:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    sget-object v3, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    .line 149
    invoke-interface {v3, v1, v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/m;

    .line 156
    .line 157
    .line 158
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnOptionButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->f()Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    if-eqz v1, :cond_3

    .line 168
    .line 169
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/domain/documents/D;->b:Z

    .line 170
    .line 171
    if-nez v1, :cond_3

    .line 172
    move v1, v0

    .line 173
    goto :goto_2

    .line 174
    :cond_3
    move v1, p2

    .line 175
    .line 176
    .line 177
    :goto_2
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonVisible(Z)V

    .line 178
    const/4 v1, -0x1

    .line 179
    .line 180
    .line 181
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    invoke-virtual {p0, v0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->a(ZZ)Landroid/os/Bundle;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult(ILandroid/os/Bundle;)V

    .line 200
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 10

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_layout_simple_document_viewer:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    sget p2, Lcom/sumsub/sns/R$id;->sns_bottom_sheet:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    move-object v3, v0

    .line 15
    .line 16
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_image_view:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    .line 27
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    move-object v5, v0

    .line 37
    .line 38
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    sget p2, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    move-object v6, v0

    .line 48
    .line 49
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 57
    move-result-object v0

    .line 58
    move-object v7, v0

    .line 59
    .line 60
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 61
    .line 62
    if-eqz v7, :cond_0

    .line 63
    .line 64
    sget p2, Lcom/sumsub/sns/R$id;->sns_warning_icon:I

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 68
    move-result-object v0

    .line 69
    move-object v8, v0

    .line 70
    .line 71
    check-cast v8, Landroid/widget/ImageView;

    .line 72
    .line 73
    if-eqz v8, :cond_0

    .line 74
    .line 75
    sget p2, Lcom/sumsub/sns/R$id;->sns_warning_message:I

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 79
    move-result-object v0

    .line 80
    move-object v9, v0

    .line 81
    .line 82
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 83
    .line 84
    if-eqz v9, :cond_0

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/databinding/B;

    .line 87
    move-object v2, p1

    .line 88
    .line 89
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 90
    .line 91
    .line 92
    invoke-direct/range {v1 .. v9}, Lcom/sumsub/sns/databinding/B;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSSecondaryButton;Lcom/sumsub/sns/core/widget/SNSToolbarView;Landroid/widget/ImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;)V

    .line 93
    return-object v1

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    new-instance p2, Ljava/lang/NullPointerException;

    .line 104
    .line 105
    const-string v0, "Missing required view with ID: "

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 113
    throw p2
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
