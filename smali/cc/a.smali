.class public final Lcc/a;
.super Ljava/lang/Object;
.source "RemoteConfigAgg.kt"

# interfaces
.implements Lcom/kubi/config/core/IRemoteConfig;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcc/a;",
        "Lcom/kubi/config/core/IRemoteConfig;",
        "<init>",
        "()V",
        "Lcom/kubi/config/Config;",
        "config",
        "",
        "b",
        "(Lcom/kubi/config/Config;)V",
        "",
        "name",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lio/reactivex/Observable;",
        "",
        "c",
        "()Lio/reactivex/Observable;",
        "Lcom/kubi/config/core/FirebaseConfig;",
        "Lcom/kubi/config/core/FirebaseConfig;",
        "firebaseConfig",
        "Lcom/kubi/config/kcrc/c;",
        "Lcom/kubi/config/kcrc/c;",
        "kcRemoteConfig",
        "d",
        "Lcom/kubi/config/Config;",
        "rConfig",
        "Config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcc/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/config/core/FirebaseConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/kubi/config/kcrc/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static d:Lcom/kubi/config/Config;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcc/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcc/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcc/a;->a:Lcc/a;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/config/core/FirebaseConfig;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/config/core/FirebaseConfig;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcc/a;->b:Lcom/kubi/config/core/FirebaseConfig;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/config/kcrc/c;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/config/kcrc/c;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcc/a;->c:Lcom/kubi/config/kcrc/c;

    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "name"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcc/a;->d:Lcom/kubi/config/Config;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/kubi/config/Config;->f()Ljava/util/List;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    :cond_1
    if-nez v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    sget-object v0, Lcc/a;->b:Lcom/kubi/config/core/FirebaseConfig;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/kubi/config/core/FirebaseConfig;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "FB"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, p1, v0}, Lcom/kubi/config/kcrc/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-object v0

    .line 46
    .line 47
    :cond_3
    sget-object v0, Lcc/a;->c:Lcom/kubi/config/kcrc/c;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lcom/kubi/config/kcrc/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    const-string v1, "KC"

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p1, v0}, Lcom/kubi/config/kcrc/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-object v0
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
.end method

.method public b(Lcom/kubi/config/Config;)V
    .locals 1
    .param p1    # Lcom/kubi/config/Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sput-object p1, Lcc/a;->d:Lcom/kubi/config/Config;

    .line 8
    .line 9
    sget-object v0, Lcc/a;->c:Lcom/kubi/config/kcrc/c;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/kubi/config/kcrc/c;->b(Lcom/kubi/config/Config;)V

    .line 13
    .line 14
    sget-object v0, Lcc/a;->b:Lcom/kubi/config/core/FirebaseConfig;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/kubi/config/core/FirebaseConfig;->f(Lcom/kubi/config/Config;)V

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
.end method

.method public c()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcc/a;->c:Lcom/kubi/config/kcrc/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/config/kcrc/c;->c()Lio/reactivex/Observable;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lcc/a;->b:Lcom/kubi/config/core/FirebaseConfig;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/config/core/FirebaseConfig;->i()Lio/reactivex/subjects/PublishSubject;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "kcRemoteConfig.observeCo\u2026seConfig.observeConfig())"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    return-object v0
.end method
