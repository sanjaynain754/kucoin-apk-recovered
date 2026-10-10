.class public final Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/y;",
        "Lcom/sumsub/sns/internal/features/presentation/imageviewer/i;",
        "Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/y;",
        "Lcom/sumsub/sns/internal/features/presentation/imageviewer/i;",
        "Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;",
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
        "SMAP\nSNSImageViewerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageViewerFragment.kt\ncom/sumsub/sns/internal/features/presentation/imageviewer/SNSImageViewerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,170:1\n106#2,15:171\n1#3:186\n256#4,2:187\n256#4,2:189\n256#4,2:191\n256#4,2:193\n256#4,2:195\n256#4,2:197\n256#4,2:199\n256#4,2:201\n*S KotlinDebug\n*F\n+ 1 SNSImageViewerFragment.kt\ncom/sumsub/sns/internal/features/presentation/imageviewer/SNSImageViewerFragment\n*L\n30#1:171,15\n92#1:187,2\n93#1:189,2\n94#1:191,2\n95#1:193,2\n104#1:195,2\n105#1:197,2\n106#1:199,2\n107#1:201,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/p;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/imageviewer/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/a;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/imageviewer/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/c;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/imageviewer/d;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/d;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/q;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->b:Lkotlin/Lazy;

    .line 58
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)Lcom/sumsub/sns/internal/core/presentation/util/e;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/util/e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p0

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/util/e;-><init>(Landroidx/lifecycle/LifecycleCoroutineScope;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;Landroid/view/View;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/y;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotateCW()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/y;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getRotation()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string/jumbo v2, "rotation"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 8
    const-string v2, "file"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, 0x0

    const/4 v2, 0x1

    .line 10
    invoke-static {p0, p1, v1, v2, v0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/n;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;Landroid/os/Bundle;Lcom/sumsub/sns/internal/core/domain/h;)V

    return-object v0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;Landroid/view/View;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/y;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotateCCW()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/databinding/y;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getRotation()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string/jumbo v2, "rotation"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->b:Ljava/io/File;

    .line 8
    const-string v2, "file"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, 0x0

    const/4 v2, 0x1

    .line 10
    invoke-static {p0, p1, v1, v2, v0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const-string v3, "arg_iddocsettype"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :cond_0
    const-string v2, "TYPE_UNKNOWN"

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    const-string v5, "analyticsPayload"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 41
    move-result-object v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v3, v4

    .line 44
    .line 45
    :goto_0
    instance-of v5, v3, Ljava/util/Map;

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    move-object v4, v3

    .line 49
    .line 50
    check-cast v4, Ljava/util/Map;

    .line 51
    .line 52
    :cond_3
    if-nez v4, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getOpenPayload()Ljava/util/Map;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-direct {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;)V

    .line 60
    return-object v0
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
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v1, "arg_iddocsettype"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0

    .line 23
    .line 24
    :cond_1
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 25
    return-object v0
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
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-string v1, "analyticsScreen"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->Companion:Lcom/sumsub/sns/internal/core/analytics/r;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/sumsub/sns/internal/core/analytics/Screen;->values()[Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 23
    move-result-object v1

    .line 24
    array-length v2, v1

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    :goto_0
    if-ge v3, v2, :cond_1

    .line 28
    .line 29
    aget-object v4, v1, v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v5

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    .line 46
    :goto_1
    if-nez v4, :cond_2

    .line 47
    .line 48
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ImageViewer:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 49
    return-object v0

    .line 50
    :cond_2
    return-object v4
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

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

.method public final handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/i;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    check-cast p2, Lcom/sumsub/sns/databinding/y;

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object v2, p2, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    iget-object v2, p2, Lcom/sumsub/sns/databinding/y;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    iget-object v0, p2, Lcom/sumsub/sns/databinding/y;->e:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    iget-object v0, p2, Lcom/sumsub/sns/databinding/y;->d:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    iget-object p2, p2, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    .line 42
    .line 43
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;->a:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/g;->c:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->setImageBitmapWithRotation(Landroid/graphics/Bitmap;I)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_0
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;

    .line 56
    .line 57
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;->a:Ljava/io/File;

    .line 58
    .line 59
    if-nez p2, :cond_1

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    check-cast p2, Lcom/sumsub/sns/databinding/y;

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    iget-object v2, p2, Lcom/sumsub/sns/databinding/y;->b:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    iget-object v2, p2, Lcom/sumsub/sns/databinding/y;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    iget-object v1, p2, Lcom/sumsub/sns/databinding/y;->e:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    iget-object v1, p2, Lcom/sumsub/sns/databinding/y;->d:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    iget-object v0, p2, Lcom/sumsub/sns/databinding/y;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 91
    .line 92
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/pdf/a;

    .line 93
    .line 94
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;->a:Ljava/io/File;

    .line 95
    .line 96
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/h;->b:I

    .line 97
    .line 98
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->b:Lkotlin/Lazy;

    .line 99
    .line 100
    .line 101
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/util/e;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v2, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/pdf/a;-><init>(Ljava/io/File;ILcom/sumsub/sns/internal/core/presentation/util/e;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 111
    .line 112
    iget-object p1, p2, Lcom/sumsub/sns/databinding/y;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    const/4 p2, 0x1

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    .line 117
    :cond_2
    :goto_0
    return-void

    .line 118
    .line 119
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 120
    .line 121
    .line 122
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 123
    throw p1
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

.method public final onDestroyView()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/F;->onDestroyView()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getStatusBarColor$idensic_mobile_sdk_aar_defaultRelease()I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getNavigationBarColor$idensic_mobile_sdk_aar_defaultRelease()I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->b:Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/util/e;

    .line 38
    .line 39
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/util/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    check-cast v2, Ljava/util/Map$Entry;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    check-cast v2, Lkotlinx/coroutines/x1;

    .line 66
    const/4 v3, 0x1

    .line 67
    const/4 v4, 0x0

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v4, v3, v4}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/util/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 77
    .line 78
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/util/e;->d:Lcom/sumsub/sns/internal/core/presentation/util/d;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 82
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->BACKGROUND_COMMON:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    move-result p2

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    sget v0, Lcom/sumsub/sns/R$color;->sns_backgroundCommon:I

    .line 23
    .line 24
    .line 25
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 26
    move-result p2

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    check-cast p1, Lcom/sumsub/sns/databinding/y;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->e:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/imageviewer/e;

    .line 44
    .line 45
    .line 46
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    check-cast p1, Lcom/sumsub/sns/databinding/y;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p1, Lcom/sumsub/sns/databinding/y;->d:Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/imageviewer/o;

    .line 64
    .line 65
    .line 66
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/imageviewer/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;->a:Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;->a:Landroid/os/Bundle;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    .line 84
    const-string/jumbo p2, "rotation"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 88
    move-result p1

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const/4 p1, 0x0

    .line 91
    :goto_1
    const/4 p2, 0x2

    .line 92
    const/4 v0, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1, v0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 96
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_layout_image_viewer:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_image_view:I

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
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_pager:I

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
    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_rotate_ccw:I

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
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSImageButton;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    sget p2, Lcom/sumsub/sns/R$id;->sns_rotate_cw:I

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
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSImageButton;

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
    .line 59
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    new-instance v1, Lcom/sumsub/sns/databinding/y;

    .line 64
    move-object v2, p1

    .line 65
    .line 66
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 67
    .line 68
    .line 69
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/databinding/y;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Landroidx/viewpager2/widget/ViewPager2;Lcom/sumsub/sns/core/widget/SNSImageButton;Lcom/sumsub/sns/core/widget/SNSImageButton;)V

    .line 70
    return-object v1

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    new-instance p2, Ljava/lang/NullPointerException;

    .line 81
    .line 82
    const-string v0, "Missing required view with ID: "

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    throw p2
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
