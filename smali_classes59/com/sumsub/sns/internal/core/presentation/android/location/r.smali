.class public final Lcom/sumsub/sns/internal/core/presentation/android/location/r;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final i:J

.field public static final synthetic t:I


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lkotlin/Lazy;

.field public final g:Landroid/location/LocationListener;

.field public final h:Landroid/location/LocationListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 3
    .line 4
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    sput-wide v0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->i:J

    .line 16
    return-void
    .line 17
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    const-string p1, "LocationAcquisition"

    .line 7
    .line 8
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->e:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->f:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/android/location/w;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/w;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/r;)V

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->g:Landroid/location/LocationListener;

    .line 22
    .line 23
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/android/location/x;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/x;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/r;)V

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->h:Landroid/location/LocationListener;

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/location/r;J)V
    .locals 8

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 12
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 14
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_9

    .line 15
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 16
    const-class v1, Landroid/location/LocationManager;

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string/jumbo v2, "network"

    const-string v3, "gps"

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v4

    if-nez v4, :cond_2

    .line 18
    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_3

    .line 19
    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v4

    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v6

    sub-long/2addr v4, v6

    sget-object v6, Lkotlin/time/DurationUnit;->NANOSECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, v5, v6}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v4

    invoke-static {v4, v5, p1, p2}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result p1

    if-gtz p1, :cond_3

    .line 20
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->a(Landroid/location/Location;)V

    return-void

    .line 21
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    .line 22
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    if-nez p1, :cond_4

    goto :goto_2

    .line 23
    :cond_4
    invoke-virtual {p1, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_6

    .line 24
    invoke-virtual {p1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    .line 25
    :cond_5
    :goto_2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->f:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    .line 26
    const-string/jumbo p1, "onNoProvider"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Ljava/lang/String;)V

    .line 27
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    if-eqz p0, :cond_a

    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/location/c;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/c;

    invoke-interface {p0, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    return-void

    .line 28
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    .line 29
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/location/LocationManager;

    if-eqz v0, :cond_a

    .line 30
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->g:Landroid/location/LocationListener;

    .line 31
    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_4

    .line 32
    :cond_7
    sget-wide v2, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->i:J

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 33
    :goto_4
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->h:Landroid/location/LocationListener;

    .line 34
    const-string/jumbo v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_5

    .line 35
    :cond_8
    sget-wide v2, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->i:J

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    return-void

    .line 36
    :cond_9
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->f:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    .line 37
    const-string/jumbo p1, "onNoPermission"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Ljava/lang/String;)V

    .line 38
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    if-eqz p0, :cond_a

    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/location/b;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/b;

    invoke-interface {p0, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/location/r;Landroid/location/Location;)V
    .locals 0

    .line 39
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->a(Landroid/location/Location;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/android/location/r;Landroid/location/Location;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->a(Landroid/location/Location;)V

    .line 4
    return-void
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


# virtual methods
.method public final a(Landroid/location/Location;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    .line 2
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/geo/e;

    .line 3
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    .line 4
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    .line 5
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v6

    .line 6
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/domain/geo/j;->a(Landroid/location/Location;)Z

    move-result v7

    .line 7
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/data/model/geo/e;-><init>(DDFZ)V

    .line 8
    const-string/jumbo p1, "onLocation: acquired"

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Ljava/lang/String;)V

    .line 9
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/a;

    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/geo/e;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->e:Ljava/lang/String;

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
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentStateFlow()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/location/o;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/presentation/android/location/o;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;->f:Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->c:Lkotlinx/coroutines/flow/w;

    .line 30
    .line 31
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/location/p;

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/location/p;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v0, v2}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/location/q;

    .line 52
    .line 53
    .line 54
    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/android/location/q;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/r;Lkotlin/coroutines/Continuation;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

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
