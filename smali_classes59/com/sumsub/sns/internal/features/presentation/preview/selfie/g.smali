.class public final Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;
.super Lcom/sumsub/sns/internal/features/presentation/preview/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/a<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/a;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/preview/selfie/a",
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
        "SMAP\nSNSPreviewSelfieFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/selfie/SNSPreviewSelfieFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n106#2,15:196\n256#3,2:211\n1#4:213\n*S KotlinDebug\n*F\n+ 1 SNSPreviewSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/selfie/SNSPreviewSelfieFragment\n*L\n30#1:196,15\n121#1:211,2\n*E\n"
    }
.end annotation


# static fields
.field public static final k:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/a;

.field public static final synthetic l:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/common/L;

.field public h:Landroid/widget/MediaController;

.field public i:Ljava/io/File;

.field public final j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;

    .line 3
    .line 4
    const-string v1, "gContent"

    .line 5
    .line 6
    const-string v2, "getGContent()Landroidx/constraintlayout/widget/Group;"

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
    const-string/jumbo v2, "playerView"

    .line 15
    .line 16
    const-string v4, "getPlayerView()Landroid/widget/VideoView;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    const-string/jumbo v4, "tvTitle"

    .line 24
    .line 25
    const-string v5, "getTvTitle()Landroid/widget/TextView;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    const-string/jumbo v5, "tvSubtitle"

    .line 33
    .line 34
    const-string v6, "getTvSubtitle()Landroid/widget/TextView;"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    const-string v6, "btnReadableVideo"

    .line 41
    .line 42
    const-string v7, "getBtnReadableVideo()Landroid/widget/Button;"

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    const-string v7, "btnTakeAnotherVideo"

    .line 49
    .line 50
    const-string v8, "getBtnTakeAnotherVideo()Landroid/widget/Button;"

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 54
    move-result-object v0

    .line 55
    const/4 v7, 0x6

    .line 56
    .line 57
    new-array v7, v7, [Lkotlin/reflect/KProperty;

    .line 58
    .line 59
    aput-object v1, v7, v3

    .line 60
    const/4 v1, 0x1

    .line 61
    .line 62
    aput-object v2, v7, v1

    .line 63
    const/4 v1, 0x2

    .line 64
    .line 65
    aput-object v4, v7, v1

    .line 66
    const/4 v1, 0x3

    .line 67
    .line 68
    aput-object v5, v7, v1

    .line 69
    const/4 v1, 0x4

    .line 70
    .line 71
    aput-object v6, v7, v1

    .line 72
    const/4 v1, 0x5

    .line 73
    .line 74
    aput-object v0, v7, v1

    .line 75
    .line 76
    sput-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->l:[Lkotlin/reflect/KProperty;

    .line 77
    .line 78
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/a;-><init>()V

    .line 82
    .line 83
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->k:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/a;

    .line 84
    return-void
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

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/y;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/b;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/d;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/e;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_player:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 83
    .line 84
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 90
    .line 91
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 92
    .line 93
    sget v0, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    .line 94
    .line 95
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 99
    .line 100
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 101
    .line 102
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/z;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 106
    .line 107
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->j:Ljava/lang/Runnable;

    .line 108
    return-void
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

.method public static final a(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "playback completed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Landroid/widget/VideoView;Landroid/media/MediaPlayer;)V
    .locals 2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "player prepared: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/VideoView;->seekTo(I)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h:Landroid/widget/MediaController;

    if-eqz p0, :cond_0

    const/16 v0, 0x7d0

    invoke-virtual {p0, v0}, Landroid/widget/MediaController;->show(I)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;Landroid/view/View;)V
    .locals 6

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 11
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->AcceptButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h()V

    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->f()V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 2
    const-string p1, "EXTRA_FILE"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    const-string v0, "EXTRA_PHRASE"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 7
    :goto_1
    invoke-virtual {p0, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->a(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "player error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", what="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", extra="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 21
    invoke-static {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/r;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "ARGS_DOCUMENT"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/r;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;Landroid/view/View;)V
    .locals 6

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v1

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->RetakeButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 6
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h()V

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/n;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;)V
    .locals 4

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->d:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->l:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 24
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->b:Ljava/lang/CharSequence;

    .line 25
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->e:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x3

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 27
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->c:Ljava/lang/CharSequence;

    .line 28
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->f:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x4

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 30
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->d:Ljava/lang/CharSequence;

    .line 31
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 32
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->g:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x5

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    if-eqz v0, :cond_3

    .line 33
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->e:Ljava/lang/CharSequence;

    .line 34
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 35
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->b:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_5

    .line 36
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->f:Z

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    const/16 v2, 0x8

    .line 37
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    :cond_5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 39
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->shouldHideLogo()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->updatePoweredByVisibility(Z)V

    .line 40
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->f:Z

    if-eqz v0, :cond_6

    .line 41
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->a:Ljava/io/File;

    if-nez v0, :cond_7

    .line 42
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h()V

    .line 43
    :cond_7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;->a:Ljava/io/File;

    if-eqz p1, :cond_8

    .line 44
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h()V

    .line 45
    :cond_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->i:Ljava/io/File;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    if-eqz p1, :cond_a

    .line 46
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->i:Ljava/io/File;

    .line 47
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->c:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/VideoView;

    if-nez v0, :cond_9

    goto :goto_1

    .line 48
    :cond_9
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_a
    :goto_1
    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "ARGS_DOCUMENT"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    move-object v1, v0

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return-object v0

    .line 35
    .line 36
    :cond_3
    :goto_1
    const-string v0, "TYPE_UNKNOWN"

    .line 37
    return-object v0
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

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_preview_selfie:I

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

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

.method public final h()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->l:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Landroid/widget/VideoView;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->i:Ljava/io/File;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    return-void

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_1
    const-string/jumbo v1, "stopPlayback"

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->i:Ljava/io/File;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 41
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
.end method

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "handleEvent: "

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
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/a;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 24
    .line 25
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/h;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/i;->n:Lcom/sumsub/sns/internal/features/presentation/camera/video/a;

    .line 30
    .line 31
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/h;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/h;->a:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;

    .line 34
    .line 35
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;->b:Ljava/lang/String;

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const-string p1, ""

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/i;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/i;-><init>()V

    .line 50
    .line 51
    new-instance v3, Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 55
    .line 56
    const-string v4, "EXTRA_ID_DOC_SET_TYPE"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    const-string v1, "EXTRA_TYPE"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    const-string/jumbo p1, "video_selfie"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    move-result-object v5

    .line 79
    const/4 v7, 0x4

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    move-object v3, p0

    .line 83
    .line 84
    .line 85
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 86
    :cond_1
    return-void
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
.end method

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->a(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;)V

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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/x;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v1, "video_selfie"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public final onStop()V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onStop"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h()V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 12
    .line 13
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->l:[Lkotlin/reflect/KProperty;

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    aget-object v1, v1, v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Landroid/widget/VideoView;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->j:Ljava/lang/Runnable;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->onStop()V

    .line 33
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 6
    .line 7
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->l:[Lkotlin/reflect/KProperty;

    .line 8
    const/4 v0, 0x4

    .line 9
    .line 10
    aget-object v0, p2, v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Landroid/widget/Button;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/f;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 29
    const/4 v0, 0x5

    .line 30
    .line 31
    aget-object v0, p2, v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    check-cast p1, Landroid/widget/Button;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/t;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 50
    const/4 v0, 0x1

    .line 51
    .line 52
    aget-object p2, p2, v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0, p2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    check-cast p1, Landroid/widget/VideoView;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    new-instance p2, Landroid/widget/MediaController;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-direct {p2, v0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->h:Landroid/widget/MediaController;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V

    .line 75
    .line 76
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/u;

    .line 77
    .line 78
    .line 79
    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/u;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 83
    .line 84
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/v;

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/v;-><init>(Landroid/widget/VideoView;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 91
    .line 92
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/w;

    .line 93
    .line 94
    .line 95
    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/w;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 99
    .line 100
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->j:Ljava/lang/Runnable;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 104
    :cond_2
    return-void
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

.method public final updatePoweredByVisibility(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/sumsub/sns/R$id;->sns_powered:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0x8

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
    .line 25
.end method
