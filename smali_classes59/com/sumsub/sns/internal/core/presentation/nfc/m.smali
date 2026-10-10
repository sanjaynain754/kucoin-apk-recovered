.class public final Lcom/sumsub/sns/internal/core/presentation/nfc/m;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final e:Ljava/lang/String;

.field public f:Z

.field public final g:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

.field public final h:Lkotlin/Lazy;

.field public final i:I

.field public final j:Landroid/os/Bundle;

.field public final k:Landroid/nfc/NfcAdapter$ReaderCallback;

.field public l:Landroid/nfc/NfcAdapter;

.field public m:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    const-string p1, "NfcRead"

    .line 7
    .line 8
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->e:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/nfc/q;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/q;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/m;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p0, v0, p3}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->g:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->h:Lkotlin/Lazy;

    .line 27
    const/4 p1, 0x3

    .line 28
    .line 29
    iput p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->i:I

    .line 30
    .line 31
    new-instance p1, Landroid/os/Bundle;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string/jumbo p2, "presence"

    .line 38
    .line 39
    const/16 p3, 0xfa

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 43
    .line 44
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->j:Landroid/os/Bundle;

    .line 45
    .line 46
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/nfc/r;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/r;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/m;)V

    .line 50
    .line 51
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->k:Landroid/nfc/NfcAdapter$ReaderCallback;

    .line 52
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/nfc/m;Lcom/sumsub/sns/internal/core/presentation/nfc/c;)Lkotlin/Unit;
    .locals 1

    .line 48
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/nfc/f;

    if-nez v0, :cond_1

    instance-of p1, p1, Lcom/sumsub/sns/internal/core/presentation/nfc/g;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->a(Z)V

    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/nfc/m;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->f:Z

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->n()V

    .line 3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/nfc/m;Landroid/nfc/Tag;)V
    .locals 10

    .line 4
    const-string v0, "Got NFC tag"

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Landroid/nfc/Tag;->getTechList()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "android.nfc.tech.IsoDep"

    invoke-static {v0, v1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 6
    invoke-static {p1}, Landroid/nfc/tech/IsoDep;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/IsoDep;

    move-result-object p1

    .line 7
    const-string v0, "Got IsoDep tag"

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->h:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    :cond_0
    iput-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->a()I

    move-result v0

    add-int/2addr v0, v1

    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->f:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->m:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 13
    iget-object v5, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->NfcScan:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v0

    .line 17
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Started:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v5, "attempt"

    invoke-static {v5, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 19
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->d:Ljava/lang/String;

    const-string/jumbo v6, "reader"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 20
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->e:Ljava/lang/String;

    if-eqz v6, :cond_1

    const-string/jumbo v7, "sessionId"

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    goto :goto_0

    :cond_1
    move-object v6, v2

    :goto_0
    filled-new-array {v1, v5, v6}, [Lkotlin/Pair;

    move-result-object v1

    .line 21
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 22
    invoke-virtual {v0, v4}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v1, 0x3

    aget-object v1, v3, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 24
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 25
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->READING:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 27
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    .line 28
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 29
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->a:Lkotlinx/coroutines/m0;

    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/nfc/i;

    invoke-direct {v7, p0, p1, v2}, Lcom/sumsub/sns/internal/core/presentation/nfc/i;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/l;Landroid/nfc/tech/IsoDep;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;->l:Lkotlinx/coroutines/x1;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Landroid/nfc/NfcAdapter;)V
    .locals 4

    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->l:Landroid/nfc/NfcAdapter;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 32
    :try_start_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/nfc/NfcAdapter;->disableReaderMode(Landroid/app/Activity;)V

    .line 34
    const-string v0, "Stopped NFC listening."

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 35
    const-string v1, "Failed to stop NFC listening."

    invoke-virtual {p0, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 36
    :try_start_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->k:Landroid/nfc/NfcAdapter$ReaderCallback;

    .line 38
    iget v2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->i:I

    .line 39
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->j:Landroid/os/Bundle;

    .line 40
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/nfc/NfcAdapter;->enableReaderMode(Landroid/app/Activity;Landroid/nfc/NfcAdapter$ReaderCallback;ILandroid/os/Bundle;)V

    .line 41
    const-string v0, "Started NFC listening."

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 42
    const-string v1, "Failed to start NFC listening."

    invoke-virtual {p0, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->l:Landroid/nfc/NfcAdapter;

    return-void
.end method

.method public final a(Z)V
    .locals 2

    .line 44
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->m:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NFC should listen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 46
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->m:Z

    .line 47
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->n()V

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->e:Ljava/lang/String;

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->h:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/nfc/l;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/nfc/s;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/s;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/m;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Lcom/sumsub/sns/internal/core/presentation/common/g;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->n()V

    .line 20
    return-void
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

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->a(Landroid/nfc/NfcAdapter;)V

    .line 5
    return-void
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

.method public final n()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->f:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->f:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->g:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    :cond_1
    move-object v0, v1

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;->a(Landroid/nfc/NfcAdapter;)V

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
.end method
