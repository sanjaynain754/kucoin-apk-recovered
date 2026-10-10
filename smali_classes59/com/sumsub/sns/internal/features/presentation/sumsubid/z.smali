.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/p;",
        "Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;",
        "Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/p;",
        "Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;",
        "Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;",
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
        "SMAP\nSNSSumsubIdFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSumsubIdFragment.kt\ncom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n106#2,15:164\n1#3:179\n1563#4:180\n1634#4,3:181\n*S KotlinDebug\n*F\n+ 1 SNSSumsubIdFragment.kt\ncom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdFragment\n*L\n38#1:164,15\n110#1:180\n110#1:181,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

.field public final c:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

.field public final d:Lcom/sumsub/sns/internal/core/presentation/android/v;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/u;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/v;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/u;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/w;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/sumsubid/x;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/x;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 52
    .line 53
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->c:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    .line 54
    .line 55
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 56
    .line 57
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/android/A;->e:Lcom/sumsub/sns/internal/core/presentation/android/A;

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/sumsubid/h1;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/h1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 67
    .line 68
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i1;

    .line 69
    .line 70
    .line 71
    invoke-direct {v5, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 72
    .line 73
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j1;

    .line 74
    .line 75
    .line 76
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/j1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 77
    .line 78
    const/16 v7, 0x8

    .line 79
    move-object v2, p0

    .line 80
    .line 81
    .line 82
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/core/presentation/android/v;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 83
    .line 84
    iput-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->d:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 85
    .line 86
    const-string v0, "SumsubId"

    .line 87
    .line 88
    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->e:Ljava/lang/String;

    .line 89
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lcom/sumsub/sns/internal/core/presentation/android/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->u:Lcom/sumsub/sns/internal/core/presentation/android/g;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 4

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/otp/j;->g:Lcom/sumsub/sns/internal/features/presentation/otp/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    sget-object p1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    const-string p1, "fragment_result_key"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 12
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;

    .line 13
    const-string/jumbo v0, "result_key_code"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    .line 14
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 15
    const-string/jumbo v3, "result_key_timestamp"

    invoke-virtual {p2, v3, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/A;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 17
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0xb

    if-ne p1, p2, :cond_2

    .line 19
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 20
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/M;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/M;

    .line 21
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 22
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;Landroid/view/View;)V
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 6
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/J;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/J;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 34
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/N;

    .line 35
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 36
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 37
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->b()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lcom/sumsub/sns/internal/core/analytics/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->d:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->s()V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final f(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->d:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 20
    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
    .line 23
    .line 24
    .line 25
.end method

.method public static final g(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;

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
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

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
.method public final a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 3

    .line 23
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/K;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/K;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/C;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/C;

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {v0, p1}, [Lkotlin/Pair;

    move-result-object p1

    .line 25
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 26
    new-instance p2, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 29
    check-cast v2, Lkotlin/Pair;

    .line 30
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 32
    :cond_1
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k1;

    invoke-direct {v1, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/k1;-><init>(Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    invoke-virtual {p2, v0, v1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;->setStyledItems(Ljava/util/List;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->e:Ljava/lang/String;

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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;->v:[Lkotlin/reflect/KProperty;

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdStep;

    .line 22
    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i0;->a:[I

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 27
    move-result v0

    .line 28
    .line 29
    aget v0, v1, v0

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    const/4 v1, 0x2

    .line 34
    .line 35
    if-eq v0, v1, :cond_3

    .line 36
    const/4 v1, 0x3

    .line 37
    .line 38
    if-eq v0, v1, :cond_2

    .line 39
    const/4 v1, 0x4

    .line 40
    .line 41
    if-eq v0, v1, :cond_1

    .line 42
    const/4 v1, 0x5

    .line 43
    .line 44
    if-ne v0, v1, :cond_0

    .line 45
    .line 46
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdProfileScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 47
    return-object v0

    .line 48
    .line 49
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 53
    throw v0

    .line 54
    .line 55
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdAgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 56
    return-object v0

    .line 57
    .line 58
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdReuseScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 59
    return-object v0

    .line 60
    .line 61
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdReuseScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 62
    return-object v0

    .line 63
    .line 64
    :cond_4
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdEmailScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 65
    return-object v0
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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

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
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->g:Lcom/sumsub/sns/internal/features/presentation/otp/c;

    .line 7
    .line 8
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 9
    .line 10
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    const-string v2, "SumsubId"

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 24
    .line 25
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->SumsubIdCodeScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/screen/d;

    .line 32
    .line 33
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;

    .line 34
    .line 35
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;->a:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/screen/c;

    .line 38
    .line 39
    iget v6, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;->b:I

    .line 40
    .line 41
    .line 42
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    const/16 v7, 0x3c

    .line 46
    .line 47
    .line 48
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    .line 52
    invoke-direct {v5, v6, v7}, Lcom/sumsub/sns/internal/core/presentation/screen/c;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 53
    .line 54
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;->c:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/g;->d:Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v4, v5, v6, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/d;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/screen/c;Ljava/lang/String;Ljava/lang/Long;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/otp/j;-><init>()V

    .line 68
    .line 69
    new-instance v0, Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    const-string v4, "arg_strings_key"

    .line 75
    .line 76
    .line 77
    const-string/jumbo v5, "sumsubid"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    const-string v4, "arg_client_tag"

    .line 83
    .line 84
    const-string v5, "SNSSumsubIdFragment"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    const-string v4, "arg_screen_name"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    :cond_0
    const-string v2, "arg_doc"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    const-string v1, "arg_otp_params"

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    const-string/jumbo v0, "snsid_otp"

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 114
    move-result-object v2

    .line 115
    const/4 v5, 0x4

    .line 116
    const/4 v6, 0x0

    .line 117
    .line 118
    const-string v3, "SNSOtpInputFragment"

    .line 119
    const/4 v4, 0x0

    .line 120
    move-object v1, p0

    .line 121
    .line 122
    .line 123
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 124
    return-void

    .line 125
    :cond_1
    move-object v1, p0

    .line 126
    .line 127
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U;

    .line 128
    .line 129
    if-eqz v0, :cond_2

    .line 130
    .line 131
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U;

    .line 132
    .line 133
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U;->a:Ljava/lang/CharSequence;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U;->b:Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 139
    return-void

    .line 140
    .line 141
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T;

    .line 142
    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->c:Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->r()V

    .line 149
    return-void

    .line 150
    .line 151
    .line 152
    :cond_3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 153
    return-void
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

.method public final handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;

    .line 3
    .line 4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

    .line 5
    .line 6
    if-eqz p2, :cond_5

    .line 7
    .line 8
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/R0;)Lcom/sumsub/sns/databinding/M;

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/S0;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/S0;)Lcom/sumsub/sns/databinding/N;

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;)Lcom/sumsub/sns/databinding/K;

    .line 36
    return-void

    .line 37
    .line 38
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q0;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/Q0;)Lcom/sumsub/sns/databinding/L;

    .line 46
    return-void

    .line 47
    .line 48
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/T0;)Lcom/sumsub/sns/databinding/O;

    .line 56
    return-void

    .line 57
    .line 58
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 62
    throw p1

    .line 63
    :cond_5
    return-void
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/l1;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/l1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "snsid_otp"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

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
.end method

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/F;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

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
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 9
    move-result-object p2

    .line 10
    move-object v1, p2

    .line 11
    .line 12
    check-cast v1, Lcom/sumsub/sns/databinding/p;

    .line 13
    .line 14
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m1;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 18
    .line 19
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/sumsubid/t;

    .line 20
    .line 21
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->a:Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3, p2}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;)V

    .line 31
    .line 32
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/sumsubid/n1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/n1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 36
    .line 37
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o1;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/o1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;-><init>(Lcom/sumsub/sns/databinding/p;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/sumsubid/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;->b:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/i;

    .line 46
    .line 47
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_LINK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result p1

    .line 58
    goto :goto_0

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    sget p2, Lcom/sumsub/sns/R$color;->sns_contentLink:I

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 68
    move-result p1

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    check-cast p2, Lcom/sumsub/sns/databinding/p;

    .line 75
    .line 76
    if-eqz p2, :cond_1

    .line 77
    .line 78
    iget-object p2, p2, Lcom/sumsub/sns/databinding/p;->e:Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_PERSON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    .line 103
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p1;

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p1;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnOptionButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOptionButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 117
    :cond_1
    return-void
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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_sumsubid:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_button:I

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
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_content:I

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
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    sget p2, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 55
    move-result-object v0

    .line 56
    move-object v5, v0

    .line 57
    .line 58
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 66
    move-result-object v0

    .line 67
    move-object v6, v0

    .line 68
    .line 69
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    new-instance v1, Lcom/sumsub/sns/databinding/p;

    .line 74
    move-object v2, p1

    .line 75
    .line 76
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/databinding/p;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSSecondaryButton;Lcom/sumsub/sns/core/widget/SNSToolbarView;)V

    .line 80
    return-object v1

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    new-instance p2, Ljava/lang/NullPointerException;

    .line 91
    .line 92
    const-string v0, "Missing required view with ID: "

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 100
    throw p2
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

.method public final trackOpen()V
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
