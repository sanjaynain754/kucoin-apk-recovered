.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/prooface/N;",
        "Lcom/sumsub/sns/internal/features/presentation/prooface/k0;",
        ">;",
        "Landroid/hardware/SensorEventListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/prooface/N;",
        "Lcom/sumsub/sns/internal/features/presentation/prooface/k0;",
        "Landroid/hardware/SensorEventListener;",
        "<init>",
        "()V",
        "Companion",
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
        "SMAP\nSNSDefaultLiveness3dFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDefaultLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,636:1\n106#2,15:637\n256#3,2:652\n254#3:655\n1#4:654\n*S KotlinDebug\n*F\n+ 1 SNSDefaultLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment\n*L\n70#1:637,15\n319#1:652,2\n335#1:655\n*E\n"
    }
.end annotation


# static fields
.field public static final p:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public c:Lcom/sumsub/sns/databinding/i;

.field public final d:Lkotlin/Lazy;

.field public e:I

.field public f:I

.field public g:Z

.field public h:F

.field public i:Landroid/hardware/SensorManager;

.field public j:Landroid/hardware/Sensor;

.field public k:Z

.field public final l:Z

.field public final m:Lcom/sumsub/sns/internal/core/presentation/android/M;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/android/v;

.field public o:Lcom/sumsub/sns/internal/features/presentation/prooface/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->p:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/j2;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/j2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/j;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/k;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/j;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/l;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/l;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/prooface/m;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/m;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->LivenessScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->b:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 51
    .line 52
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k2;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 62
    .line 63
    const/16 v0, 0xff

    .line 64
    .line 65
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f:I

    .line 66
    .line 67
    .line 68
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 69
    .line 70
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h:F

    .line 71
    .line 72
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->l:Lcom/sumsub/sns/internal/ff/core/a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 76
    move-result v0

    .line 77
    .line 78
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    .line 79
    .line 80
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 81
    .line 82
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/o;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 86
    .line 87
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/l2;

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/l2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/android/M;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 96
    .line 97
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 98
    .line 99
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/android/A;->e:Lcom/sumsub/sns/internal/core/presentation/android/A;

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/m2;

    .line 106
    .line 107
    .line 108
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/m2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 109
    .line 110
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/n2;

    .line 111
    .line 112
    .line 113
    invoke-direct {v7, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/n2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 114
    .line 115
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/prooface/o2;

    .line 116
    .line 117
    .line 118
    invoke-direct {v8, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/o2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 119
    .line 120
    const/16 v9, 0x8

    .line 121
    move-object v4, p0

    .line 122
    .line 123
    .line 124
    invoke-direct/range {v3 .. v9}, Lcom/sumsub/sns/internal/core/presentation/android/v;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 125
    .line 126
    iput-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->n:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 127
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0, v3}, Landroid/view/View;->setScaleX(F)V

    .line 6
    :cond_4
    new-instance v0, Landroidx/dynamicanimation/animation/SpringAnimation;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v4

    sget-object v5, Landroidx/dynamicanimation/animation/DynamicAnimation;->SCALE_X:Landroidx/dynamicanimation/animation/DynamicAnimation$ViewProperty;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v0, v4, v5, v6}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;F)V

    .line 7
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    const/high16 v5, 0x43480000    # 200.0f

    invoke-virtual {v4, v5}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 8
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    const/high16 v7, 0x3f400000    # 0.75f

    invoke-virtual {v4, v7}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 9
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->start()V

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v3}, Landroid/view/View;->setScaleY(F)V

    .line 11
    :cond_5
    new-instance v0, Landroidx/dynamicanimation/animation/SpringAnimation;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v4

    sget-object v8, Landroidx/dynamicanimation/animation/DynamicAnimation;->SCALE_Y:Landroidx/dynamicanimation/animation/DynamicAnimation$ViewProperty;

    invoke-direct {v0, v4, v8, v6}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;F)V

    .line 12
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 13
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 14
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->start()V

    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_6

    iget-object v1, v0, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    :cond_6
    if-eqz v1, :cond_7

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 17
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 19
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i()Lcom/sumsub/sns/core/widget/SNSH2TextView;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 20
    invoke-virtual {v0, v6}, Landroid/view/View;->setAlpha(F)V

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 22
    :cond_8
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/M;->s()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->e:I

    iget v3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f:I

    invoke-virtual {p0, v0, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Landroid/content/Context;II)Lkotlin/Pair;

    .line 24
    iput-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    :cond_9
    :goto_2
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;Landroid/view/View;)V
    .locals 6

    .line 64
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 65
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->LivenessScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 66
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 67
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 68
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 69
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i()Lcom/sumsub/sns/core/widget/SNSH2TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 70
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setRecognizingState()V

    .line 73
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/sumsub/sns/databinding/i;->e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    const/16 v0, 0x8

    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l()V

    .line 76
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k()V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Lcom/sumsub/sns/internal/core/presentation/camera/l;
    .locals 8

    .line 1
    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->ANALYZER:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 3
    .line 4
    new-instance v2, Landroid/util/Size;

    .line 5
    .line 6
    const/16 v0, 0x500

    .line 7
    .line 8
    const/16 v3, 0x2d0

    .line 9
    .line 10
    .line 11
    invoke-direct {v2, v0, v3}, Landroid/util/Size;-><init>(II)V

    .line 12
    .line 13
    sget-object v5, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 14
    .line 15
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/e;

    .line 16
    .line 17
    .line 18
    invoke-direct {v7, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/domain/h;->y:Lkotlin/Lazy;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object p0

    .line 29
    move-object v6, p0

    .line 30
    .line 31
    check-cast v6, Lcom/sumsub/sns/internal/util/camera/d;

    .line 32
    .line 33
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 34
    .line 35
    new-instance v4, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 36
    .line 37
    .line 38
    invoke-direct {v4}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>()V

    .line 39
    const/4 v3, 0x1

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/camera/l;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;ILcom/sumsub/sns/internal/core/presentation/camera/b;Landroidx/camera/core/CameraSelector;Lcom/sumsub/sns/internal/util/camera/d;Lcom/sumsub/sns/internal/core/presentation/camera/s;)V

    .line 43
    return-object v0
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

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Lcom/sumsub/sns/internal/core/presentation/android/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->w:Lcom/sumsub/sns/internal/core/presentation/android/g;

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

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->M:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    aget-object v2, v2, v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->b:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    const-string v1, "dont_show_settings_dialog"

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/M;->q()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->j()V

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    return-object p0
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

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v0, p0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 11
    .line 12
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

.method public static final f(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/repository/settings/c;->b:Landroid/content/SharedPreferences;

    .line 5
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 6
    const-string v0, "dont_show_settings_dialog"

    const/4 v1, 0x1

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 7
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/l0;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 9

    const/4 v0, 0x2

    .line 54
    new-array v1, v0, [I

    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 56
    :cond_0
    new-array v0, v0, [I

    .line 57
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 58
    :cond_1
    new-instance v2, Landroid/graphics/RectF;

    .line 59
    iget v3, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v4, 0x0

    aget v5, v0, v4

    int-to-float v5, v5

    sub-float/2addr v3, v5

    aget v5, v1, v4

    int-to-float v5, v5

    add-float/2addr v3, v5

    .line 60
    iget v5, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v6, 0x1

    aget v7, v0, v6

    int-to-float v7, v7

    sub-float/2addr v5, v7

    aget v7, v1, v6

    int-to-float v7, v7

    add-float/2addr v5, v7

    .line 61
    iget v7, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    aget v8, v0, v4

    int-to-float v8, v8

    sub-float/2addr v7, v8

    aget v4, v1, v4

    int-to-float v4, v4

    add-float/2addr v7, v4

    .line 62
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr p1, v4

    aget v0, v0, v6

    int-to-float v0, v0

    sub-float/2addr p1, v0

    aget v0, v1, v6

    int-to-float v0, v0

    add-float/2addr p1, v0

    .line 63
    invoke-direct {v2, v3, v5, v7, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v2
.end method

.method public final a(Landroid/content/Context;II)Lkotlin/Pair;
    .locals 5

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string/jumbo v1, "screen_brightness_mode"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    .line 78
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string/jumbo v4, "screen_brightness"

    invoke-static {v3, v4, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v3

    if-eq v0, v2, :cond_0

    if-eq v3, v2, :cond_0

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 80
    invoke-static {v2, v1, p2}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-static {p1, v4, p3}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    int-to-float p2, p3

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr p2, p3

    .line 83
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 85
    :cond_0
    new-instance p1, Lkotlin/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/prooface/B;)V
    .locals 4

    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->o:Lcom/sumsub/sns/internal/features/presentation/prooface/B;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eq v2, v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_2

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "face detector status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 27
    :cond_2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->o:Lcom/sumsub/sns/internal/features/presentation/prooface/B;

    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_4

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_4

    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setScanCompleteState()V

    return-void

    .line 31
    :cond_4
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k:Z

    if-eqz v0, :cond_e

    .line 32
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i()Lcom/sumsub/sns/core/widget/SNSH2TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/B;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/y;

    if-eqz v0, :cond_7

    .line 34
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setRecognizingState()V

    .line 35
    :cond_6
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    if-eqz p1, :cond_e

    .line 36
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceRectangle(Landroid/graphics/RectF;)V

    return-void

    .line 37
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/z;

    if-eqz v0, :cond_9

    .line 38
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setRecognizingState()V

    .line 39
    :cond_8
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    if-eqz v0, :cond_e

    .line 40
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    if-eqz v0, :cond_e

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/z;

    .line 41
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/z;->a:Landroid/graphics/RectF;

    .line 42
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceRectangle(Landroid/graphics/RectF;)V

    return-void

    .line 43
    :cond_9
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/A;

    if-eqz v0, :cond_b

    .line 44
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setRecognizingState()V

    .line 45
    :cond_a
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    if-eqz p1, :cond_e

    .line 46
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceRectangle(Landroid/graphics/RectF;)V

    return-void

    .line 47
    :cond_b
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/x;

    if-eqz v0, :cond_d

    .line 48
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceDetectedState()V

    .line 49
    :cond_c
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    if-eqz v0, :cond_e

    .line 50
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object v0

    if-eqz v0, :cond_e

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/x;

    .line 51
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/x;->a:Landroid/graphics/RectF;

    .line 52
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceRectangle(Landroid/graphics/RectF;)V

    return-void

    .line 53
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/prooface/K;)V
    .locals 8

    .line 86
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/K;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 87
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 88
    :goto_0
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    new-instance v2, Lkotlin/Pair;

    .line 89
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 91
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUCCESS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v7

    .line 92
    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 93
    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 94
    invoke-direct {v2, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    .line 95
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->e:Ljava/lang/Boolean;

    .line 96
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    if-eqz v2, :cond_3

    .line 97
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    .line 98
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Lkotlin/Pair;

    .line 99
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 101
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUBMITTED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v7

    .line 102
    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 103
    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 104
    invoke-direct {v2, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 105
    :cond_3
    new-instance v2, Lkotlin/Pair;

    .line 106
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    .line 107
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 108
    sget-object v7, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v7

    .line 109
    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 110
    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 111
    invoke-direct {v2, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    :goto_2
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 113
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6, v2}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 114
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h()Lcom/sumsub/sns/core/widget/SNSImageView;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 115
    :cond_5
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/K;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/J;

    .line 116
    instance-of v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/H;

    if-eqz v5, :cond_b

    .line 117
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v5, :cond_6

    iget-object v5, v5, Lcom/sumsub/sns/databinding/i;->l:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    goto :goto_3

    :cond_6
    move-object v5, v1

    :goto_3
    if-eqz v5, :cond_7

    .line 118
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/H;

    .line 119
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/H;->a:Ljava/lang/CharSequence;

    .line 120
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    :cond_7
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v2, :cond_8

    iget-object v2, v2, Lcom/sumsub/sns/databinding/i;->k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    goto :goto_4

    :cond_8
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_9

    .line 122
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/K;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/J;

    .line 123
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/prooface/H;

    .line 124
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/prooface/H;->b:Ljava/lang/CharSequence;

    .line 125
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    :cond_9
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lcom/sumsub/sns/databinding/i;->k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    goto :goto_5

    :cond_a
    move-object v2, v1

    :goto_5
    if-eqz v2, :cond_12

    const/16 v5, 0x11

    .line 127
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_a

    .line 128
    :cond_b
    instance-of v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/I;

    if-eqz v5, :cond_20

    .line 129
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v5, :cond_c

    iget-object v5, v5, Lcom/sumsub/sns/databinding/i;->l:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    goto :goto_6

    :cond_c
    move-object v5, v1

    :goto_6
    if-eqz v5, :cond_d

    .line 130
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/I;

    .line 131
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/I;->a:Ljava/lang/CharSequence;

    .line 132
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    :cond_d
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v2, :cond_e

    iget-object v2, v2, Lcom/sumsub/sns/databinding/i;->k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    goto :goto_7

    :cond_e
    move-object v2, v1

    :goto_7
    if-eqz v2, :cond_10

    .line 134
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/K;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/J;

    .line 135
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/prooface/I;

    .line 136
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/prooface/I;->b:Ljava/lang/CharSequence;

    if-eqz v5, :cond_f

    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_8

    :cond_f
    move-object v5, v1

    :goto_8
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    :cond_10
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v2, :cond_11

    iget-object v2, v2, Lcom/sumsub/sns/databinding/i;->k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    goto :goto_9

    :cond_11
    move-object v2, v1

    :goto_9
    if-eqz v2, :cond_12

    const v5, 0x800003

    .line 139
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setGravity(I)V

    :cond_12
    :goto_a
    if-eqz v0, :cond_13

    .line 140
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    goto :goto_b

    :cond_13
    move-object v2, v1

    .line 141
    :goto_b
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    if-eqz v0, :cond_14

    .line 142
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->e:Ljava/lang/Boolean;

    .line 143
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_c

    :cond_14
    move v2, v4

    :goto_c
    if-eqz v2, :cond_15

    goto :goto_f

    .line 144
    :cond_15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_16

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    goto :goto_d

    :cond_16
    move-object v0, v1

    :goto_d
    if-eqz v0, :cond_17

    .line 145
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 146
    :cond_17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_18

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    goto :goto_e

    :cond_18
    move-object v0, v1

    :goto_e
    if-eqz v0, :cond_19

    .line 147
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/K;->b:Ljava/lang/CharSequence;

    .line 148
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    :cond_19
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz p1, :cond_1a

    iget-object v1, p1, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    :cond_1a
    if-eqz v1, :cond_1e

    .line 150
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/p2;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/p2;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_11

    .line 151
    :cond_1b
    :goto_f
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz p1, :cond_1c

    iget-object p1, p1, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    goto :goto_10

    :cond_1c
    move-object p1, v1

    :goto_10
    if-eqz p1, :cond_1d

    const/16 v2, 0x8

    .line 152
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    :cond_1d
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p1

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/prooface/i;

    invoke-direct {v5, p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;Lcom/sumsub/sns/internal/features/data/model/prooface/M;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 154
    :cond_1e
    :goto_11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    move-result-object p1

    if-eqz p1, :cond_1f

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setScanCompleteState()V

    :cond_1f
    return-void

    .line 155
    :cond_20
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final f()Landroidx/camera/view/PreviewView;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->c:Landroidx/camera/view/PreviewView;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final finish$idensic_mobile_sdk_aar_defaultRelease(Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;)V
    .locals 12

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;

    .line 7
    .line 8
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/J;

    .line 9
    .line 10
    instance-of p3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/I;

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 21
    .line 22
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 26
    :cond_0
    return-void

    .line 27
    .line 28
    :cond_1
    instance-of p3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/D;

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 36
    const/4 v4, 0x6

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    move-object v0, p0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_2
    instance-of p3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/H;

    .line 47
    .line 48
    if-eqz p3, :cond_3

    .line 49
    .line 50
    sget-object v7, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    .line 51
    const/4 v10, 0x6

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v6, p0

    .line 56
    .line 57
    .line 58
    invoke-static/range {v6 .. v11}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 59
    return-void

    .line 60
    :cond_3
    move-object v6, p0

    .line 61
    .line 62
    instance-of p3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    .line 63
    .line 64
    if-eqz p3, :cond_4

    .line 65
    .line 66
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f()V

    .line 76
    .line 77
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 87
    .line 88
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 92
    move-result-object p1

    .line 93
    move-object v0, p1

    .line 94
    .line 95
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 96
    .line 97
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/J;

    .line 98
    .line 99
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    .line 100
    .line 101
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;->a:Ljava/lang/Exception;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->getIdDocSetType()Ljava/lang/String;

    .line 105
    move-result-object v2

    .line 106
    const/4 v4, 0x4

    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v3, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 112
    return-void

    .line 113
    .line 114
    :cond_4
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f()V

    .line 128
    .line 129
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 130
    .line 131
    .line 132
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 139
    .line 140
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 141
    .line 142
    .line 143
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 144
    move-result-object p1

    .line 145
    move-object v0, p1

    .line 146
    .line 147
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 148
    .line 149
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/q3;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/J;

    .line 150
    .line 151
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    .line 152
    .line 153
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;->a:Ljava/lang/Exception;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->getIdDocSetType()Ljava/lang/String;

    .line 157
    move-result-object v2

    .line 158
    const/4 v4, 0x4

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v3, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 164
    return-void

    .line 165
    .line 166
    :cond_5
    sget-object v7, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    .line 167
    const/4 v10, 0x6

    .line 168
    const/4 v11, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v9, 0x0

    .line 171
    .line 172
    .line 173
    invoke-static/range {v6 .. v11}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 174
    return-void

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-super {p0, p1, p2, p3}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease(Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;)V

    .line 178
    return-void
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method

.method public final g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->h:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getClosePayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->getOpenPayload()Ljava/util/Map;

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
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->b:Lcom/sumsub/sns/internal/features/data/model/common/X;

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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_liveness_3dface:I

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->n:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/android/M;->r()Ljava/util/Map;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final getPoweredByText()Landroid/widget/TextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->m:Lcom/sumsub/sns/databinding/A;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/A;->b:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->b:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

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

.method public final h()Lcom/sumsub/sns/core/widget/SNSImageView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->j:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

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
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/w;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/w;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/w;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v1, "HandleErrorEvent: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 49
    const/4 p1, 0x0

    .line 50
    .line 51
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k:Z

    .line 52
    const/4 p1, 0x1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->updateShowProgress(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->j()V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/m;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f()V

    .line 75
    .line 76
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getBaseActivity()Lcom/sumsub/sns/core/presentation/base/f;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/m;

    .line 92
    .line 93
    iget-object v1, p1, Lcom/sumsub/sns/core/presentation/base/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 94
    .line 95
    iget-object v2, p1, Lcom/sumsub/sns/core/presentation/base/m;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/m;->c:Ljava/lang/CharSequence;

    .line 98
    .line 99
    sget v3, Lcom/sumsub/sns/core/presentation/base/f;->i:I

    .line 100
    const/4 v3, 0x0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/sumsub/sns/core/presentation/base/f;->a(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 104
    return-void

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

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

.method public final i()Lcom/sumsub/sns/core/widget/SNSH2TextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->i:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

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

.method public final j()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->P:Lcom/sumsub/sns/internal/ff/core/a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 25
    .line 26
    const-string v2, "Prooface"

    .line 27
    .line 28
    const-string v3, "Init camera FORBIDDEN"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    const-string v0, "Init camera"

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f()Landroidx/camera/view/PreviewView;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    sget-object v4, Lcom/sumsub/sns/internal/core/presentation/camera/l;->x:Landroid/util/Size;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    .line 59
    return-void
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

.method public final k()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h:F

    .line 3
    .line 4
    const/high16 v1, 0x41200000    # 10.0f

    .line 5
    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/M;->s()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    const/16 v2, 0xff

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Landroid/content/Context;II)Lkotlin/Pair;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Number;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 41
    move-result v1

    .line 42
    .line 43
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->e:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Number;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 53
    move-result v0

    .line 54
    .line 55
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f:I

    .line 56
    const/4 v0, 0x1

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    .line 59
    :cond_0
    return-void
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

.method public final l()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/databinding/i;->d:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move-object v0, v1

    .line 15
    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v2, "startSession()"

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->t:Landroidx/camera/core/ImageProxy;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->close()V

    .line 46
    :cond_3
    const/4 v2, 0x1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/j0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v6, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 59
    const/4 v7, 0x3

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 66
    .line 67
    iput-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k:Z

    .line 68
    return-void
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

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
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

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/I;->onDestroyView()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->d:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 18
    return-void
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 2

    .line 1
    .line 2
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/databinding/i;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    const/4 v1, 0x4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 28
    .line 29
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/H;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/H;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;Ljava/lang/String;)V

    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 38
    const/4 p1, 0x1

    .line 39
    return p1
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

.method public final onPause()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i:Landroid/hardware/SensorManager;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->m:Lcom/sumsub/sns/internal/core/presentation/android/M;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/M;->s()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->e:I

    .line 29
    .line 30
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->f:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Landroid/content/Context;II)Lkotlin/Pair;

    .line 34
    const/4 v0, 0x0

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g:Z

    .line 37
    :cond_1
    return-void
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

.method public final onResume()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->onResume()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i:Landroid/hardware/SensorManager;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->j:Landroid/hardware/Sensor;

    .line 10
    const/4 v2, 0x3

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget p1, p1, v0

    .line 6
    .line 7
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->h:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k()V

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
    .line 25
.end method

.method public final onStart()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->onStart()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/I;->isPrepared()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->n:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->s()V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
.end method

.method public final onStop()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->f()V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->k:Z

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->onStop()V

    .line 18
    return-void
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
    invoke-static {p1}, Lcom/sumsub/sns/databinding/i;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/i;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 10
    return-void
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

.method public final onViewModelPrepared(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/I;->onViewModelPrepared(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    const/4 v0, 0x4

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "sensor"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Landroid/hardware/SensorManager;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->i:Landroid/hardware/SensorManager;

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    const/4 v1, 0x5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object p1, v0

    .line 39
    .line 40
    :goto_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->j:Landroid/hardware/Sensor;

    .line 41
    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->H:Lkotlinx/coroutines/flow/n;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/f;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;Lkotlin/coroutines/Continuation;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 63
    .line 64
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->J:Lkotlinx/coroutines/flow/n;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/g;

    .line 79
    .line 80
    .line 81
    invoke-direct {v2, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;Lkotlin/coroutines/Continuation;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->g()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/h;

    .line 93
    .line 94
    .line 95
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setStateListener(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;)V

    .line 99
    .line 100
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->c:Lcom/sumsub/sns/databinding/i;

    .line 101
    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    iget-object v0, p1, Lcom/sumsub/sns/databinding/i;->g:Landroid/widget/TextView;

    .line 105
    .line 106
    :cond_3
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->l:Z

    .line 109
    .line 110
    if-eqz p1, :cond_4

    .line 111
    const/4 p1, 0x0

    .line 112
    goto :goto_1

    .line 113
    .line 114
    :cond_4
    const/16 p1, 0x8

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->n:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/android/v;->s()V

    .line 123
    return-void
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
