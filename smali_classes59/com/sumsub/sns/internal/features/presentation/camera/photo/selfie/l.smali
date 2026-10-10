.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/M0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/o;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;",
        ">;",
        "Lcom/sumsub/sns/internal/core/common/M0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/o;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;",
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
        "SMAP\nSNSSelfieWithDocumentPickerFragment2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,135:1\n106#2,15:136\n*S KotlinDebug\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment2\n*L\n35#1:136,15\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

.field public final d:Lcom/sumsub/sns/internal/core/analytics/Screen;


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/f;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/g;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/h;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/g;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/i;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/i;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/j;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/j;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/k;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

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
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 64
    .line 65
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 66
    .line 67
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a0;

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 71
    .line 72
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/b0;

    .line 73
    .line 74
    .line 75
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 76
    .line 77
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/c0;

    .line 78
    .line 79
    .line 80
    invoke-direct {v7, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 81
    .line 82
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/d0;

    .line 83
    .line 84
    .line 85
    invoke-direct {v8, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 86
    .line 87
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/e0;

    .line 88
    .line 89
    .line 90
    invoke-direct {v10, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 91
    .line 92
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/f0;

    .line 93
    .line 94
    .line 95
    invoke-direct {v11, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 96
    .line 97
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/g0;

    .line 98
    .line 99
    .line 100
    invoke-direct {v12, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)V

    .line 101
    .line 102
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/q;

    .line 103
    const/4 v0, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v9, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/q;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 107
    move-object v4, p0

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v3 .. v12}, Lcom/sumsub/sns/internal/features/presentation/camera/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    iput-object v3, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, Lcom/sumsub/sns/core/presentation/a;->a(Lcom/sumsub/sns/core/presentation/base/l;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    iput-object v0, v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->d:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 119
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lcom/sumsub/sns/internal/features/presentation/camera/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/x;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;Lcom/sumsub/sns/internal/core/presentation/camera/r;)Lkotlin/Unit;
    .locals 1

    .line 8
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;

    if-eqz v0, :cond_0

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 10
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/q;

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;

    .line 12
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/n;->a:Ljava/io/File;

    .line 13
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/q;-><init>(Ljava/io/File;)V

    .line 14
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 1

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/p;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/p;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lcom/sumsub/sns/internal/core/presentation/android/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->e:Lcom/sumsub/sns/internal/core/presentation/android/g;

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

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lcom/sumsub/sns/internal/features/presentation/camera/r;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 11
    .line 12
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->b:Z

    .line 13
    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/a;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 26
    .line 27
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/camera/e;

    .line 28
    .line 29
    const/16 v1, 0xe

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/e;-><init>(I)V

    .line 33
    .line 34
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/r;

    .line 35
    const/4 v2, 0x4

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, p0, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/e;Lcom/sumsub/sns/internal/features/presentation/camera/a;I)V

    .line 39
    return-object v1
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

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 9
    .line 10
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/r;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/r;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

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

.method public static final f(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Lcom/sumsub/sns/internal/features/presentation/camera/m;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->c:Lcom/sumsub/sns/internal/features/presentation/camera/m;

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

.method public static final g(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/A;

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
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

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
.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;)V
    .locals 4

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 22
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/t;->a(Z)V

    return-void
.end method

.method public final getClosePayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 8
    move-result-object v0

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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->u()Ljava/util/Map;

    .line 8
    move-result-object v0

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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->d:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;

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
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/n;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    .line 20
    .line 21
    const-string/jumbo v1, "takePicture: cameraX is null, aborting"

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->g()V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 37
    .line 38
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->j:Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/C;->a(Lcom/sumsub/sns/core/presentation/base/n;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 48
    return-void
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

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;)V

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->b:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/F;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 29
    move-result p1

    .line 30
    return p1
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

.method public final onKeyDown(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;->c:Lcom/sumsub/sns/internal/features/presentation/camera/t;

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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_selfie_document_picker_v2:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_camera_preview_container:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 16
    .line 17
    const-string v1, "Missing required view with ID: "

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    move-object p2, p1

    .line 21
    .line 22
    check-cast p2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 23
    .line 24
    sget v0, Lcom/sumsub/sns/R$id;->sns_dark_overlay:I

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper:I

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    move-object p1, v2

    .line 40
    .line 41
    check-cast p1, Landroid/widget/FrameLayout;

    .line 42
    .line 43
    sget p1, Lcom/sumsub/sns/R$id;->sns_brief_details:I

    .line 44
    .line 45
    .line 46
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Landroid/widget/LinearLayout;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    sget p1, Lcom/sumsub/sns/R$id;->sns_divider:I

    .line 54
    .line 55
    .line 56
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    sget p1, Lcom/sumsub/sns/R$id;->sns_helper_brief:I

    .line 64
    .line 65
    .line 66
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 70
    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    sget p1, Lcom/sumsub/sns/R$id;->sns_helper_details:I

    .line 74
    .line 75
    .line 76
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    sget p1, Lcom/sumsub/sns/R$id;->sns_helper_details_frame:I

    .line 84
    .line 85
    .line 86
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    check-cast v0, Landroid/widget/FrameLayout;

    .line 90
    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    sget p1, Lcom/sumsub/sns/R$id;->sns_helper_title:I

    .line 94
    .line 95
    .line 96
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 100
    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    sget p1, Lcom/sumsub/sns/R$id;->sns_intro_content:I

    .line 104
    .line 105
    .line 106
    invoke-static {v2, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    new-instance p1, Lcom/sumsub/sns/databinding/o;

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, p2}, Lcom/sumsub/sns/databinding/o;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 117
    return-object p1

    .line 118
    .line 119
    .line 120
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    new-instance p2, Ljava/lang/NullPointerException;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    .line 134
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 135
    throw p2

    .line 136
    :cond_1
    move p2, v0

    .line 137
    .line 138
    .line 139
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    new-instance p2, Ljava/lang/NullPointerException;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    .line 153
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 154
    throw p2
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
