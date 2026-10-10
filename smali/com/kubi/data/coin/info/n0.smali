.class public final Lcom/kubi/data/coin/info/n0;
.super Ljava/lang/Object;
.source "SymbolsInfo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J2\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u001e\u0008\u0002\u0010\u001b\u001a\u0018\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J/\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001e0$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\u000c\u0008&\u0012\u0008\u0008\'\u0012\u0004\u0008\u0008((\u0012\u0004\u0012\u00020 0\u001cJ\u0016\u0010)\u001a\u00020\u00182\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010$J\u001f\u0010)\u001a\u00020\u0018\"\u0008\u0008\u0000\u0010+*\u00020\u001e2\u0008\u0010,\u001a\u0004\u0018\u0001H+\u00a2\u0006\u0002\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0016\u00100\u001a\u00020\u00162\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001e0$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u00062"
    }
    d2 = {
        "Lcom/kubi/data/coin/info/SymbolsInfo;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "tradeApi",
        "Lcom/kubi/data/coin/CoinApi;",
        "kotlin.jvm.PlatformType",
        "getTradeApi",
        "()Lcom/kubi/data/coin/CoinApi;",
        "tradeApi$delegate",
        "Lkotlin/Lazy;",
        "SYMBOLS_INFO_KEY",
        "getSYMBOLS_INFO_KEY",
        "()Ljava/lang/String;",
        "SYMBOLS_INFO_KEY$delegate",
        "SYMBOLS_INFO_ALIA",
        "getSYMBOLS_INFO_ALIA",
        "SYMBOLS_INFO_ALIA$delegate",
        "getSymbolsInfoCurrentTimeLine",
        "Lcom/kubi/utils/storage/StorageId;",
        "",
        "initDefaultSymbolsList",
        "",
        "fetchSymbolInfoList",
        "Lio/reactivex/disposables/Disposable;",
        "callback",
        "Lkotlin/Function1;",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "ignoreState",
        "",
        "getSymbolEntityByCode",
        "code",
        "filterSymbolPairs",
        "",
        "condition",
        "Lkotlin/ParameterName;",
        "name",
        "item",
        "updateSymbolEntity",
        "list",
        "T",
        "entity",
        "(Lcom/kubi/data/entity/SymbolInfoEntity;)V",
        "getEntity",
        "saveEntity",
        "batchSave",
        "it",
        "LDataProvider_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSymbolsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsInfo.kt\ncom/kubi/data/coin/info/SymbolsInfo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 5 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 6 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,183:1\n15#2:184\n84#2:185\n84#2:231\n75#2,2:240\n13472#3:186\n13473#3:194\n13472#3:195\n13473#3:203\n281#4,4:187\n281#4,4:196\n281#4,4:213\n281#4,4:220\n241#4,2:227\n241#4,2:229\n139#5:191\n17#5:192\n139#5:200\n17#5:201\n139#5:217\n17#5:218\n139#5:224\n17#5:225\n178#6:193\n178#6:202\n178#6:219\n178#6:226\n1669#7,8:204\n1869#7,2:232\n2756#7:238\n1#8:212\n1#8:239\n160#9,4:234\n*S KotlinDebug\n*F\n+ 1 SymbolsInfo.kt\ncom/kubi/data/coin/info/SymbolsInfo\n*L\n77#1:184\n79#1:185\n159#1:231\n83#1:240,2\n107#1:186\n107#1:194\n115#1:195\n115#1:203\n108#1:187,4\n116#1:196,4\n141#1:213,4\n143#1:220,4\n150#1:227,2\n152#1:229,2\n108#1:191\n108#1:192\n116#1:200\n116#1:201\n141#1:217\n141#1:218\n143#1:224\n143#1:225\n108#1:193\n116#1:202\n141#1:219\n143#1:226\n123#1:204,8\n160#1:232,2\n64#1:238\n64#1:239\n62#1:234,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/data/coin/info/n0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/data/coin/info/n0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/data/coin/info/n0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/data/coin/info/d0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/data/coin/info/d0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/data/coin/info/n0;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/data/coin/info/e0;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/kubi/data/coin/info/e0;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lcom/kubi/data/coin/info/n0;->c:Lkotlin/Lazy;

    .line 30
    .line 31
    new-instance v0, Lcom/kubi/data/coin/info/f0;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lcom/kubi/data/coin/info/f0;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    sput-object v0, Lcom/kubi/data/coin/info/n0;->d:Lkotlin/Lazy;

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

.method public static final C()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/f;->a:Lcom/kubi/sdk/site/f;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "symbols"

    .line 8
    .line 9
    const-string v2, "json"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/site/f;->c(Lcom/kubi/sdk/site/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/kubi/utils/y;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-string v1, "getJsonAsBlock(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/data/coin/info/n0$a;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1}, Lcom/kubi/data/coin/info/n0$a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 44
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    const/4 v0, 0x0

    .line 47
    .line 48
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    check-cast v1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 67
    .line 68
    sget-object v2, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Lcom/kubi/data/coin/info/n0;->D(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    return-object v0
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
.end method

.method public static final E()Lgf/h;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lgf/h;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lgf/h;

    .line 13
    return-object v0
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/data/coin/info/n0;->r(Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)Lkotlin/Unit;

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
    .line 58
    .line 59
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/data/coin/info/n0;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic c(Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/data/coin/info/n0;->p(Ljava/util/ArrayList;)Lkotlin/Unit;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/data/coin/info/n0;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/n0;->l()Ljava/lang/String;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic f()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/n0;->C()Lkotlin/Unit;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/n0;->k()Ljava/lang/String;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic h()Lgf/h;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/n0;->E()Lgf/h;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/data/coin/info/n0;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Lkotlin/Unit;

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
    .line 58
    .line 59
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/data/coin/info/n0;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static final k()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/f;->a:Lcom/kubi/sdk/site/f;

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "symbols_info_alia"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/site/f;->c(Lcom/kubi/sdk/site/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v0

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
.end method

.method public static final l()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/f;->a:Lcom/kubi/sdk/site/f;

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "symbols_info_new_key"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/site/f;->c(Lcom/kubi/sdk/site/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v0

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
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final p(Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/data/coin/info/n0;->z()Ly70/g;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/kubi/data/coin/info/n0;->m(Ljava/util/List;)J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2, v3}, Ly70/a;->m(Ly70/g;J)Ly70/a;

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0
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

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    :cond_0
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
    .line 58
    .line 59
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    :cond_0
    const-string p0, "fetchSymbolInfoList"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

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
    .line 58
    .line 59
.end method


# virtual methods
.method public final A()Lgf/h;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/n0;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgf/h;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final B()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ly70/a;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    array-length v0, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void

    .line 16
    .line 17
    :cond_1
    :goto_0
    new-instance v0, Lcom/kubi/data/coin/info/g0;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/kubi/data/coin/info/g0;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 24
    return-void
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
.end method

.method public final D(Lcom/kubi/data/entity/SymbolInfoEntity;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "getCode(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, p1}, Ly70/e;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/e;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    const-string v2, "getSymbol(...)"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, p1}, Ly70/e;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/e;

    .line 53
    :cond_0
    return-void
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
.end method

.method public final F(Lcom/kubi/data/entity/SymbolInfoEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">(TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/kubi/data/coin/info/n0;->D(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 8
    :cond_0
    return-void
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
.end method

.method public final G(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/kubi/data/coin/info/n0;->m(Ljava/util/List;)J

    .line 8
    :cond_0
    return-void
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
.end method

.method public final m(Ljava/util/List;)J
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">;)J"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->z()Ly70/g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Ly70/a;->f(Ly70/g;J)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEnabled()Z

    .line 30
    move-result v3

    .line 31
    .line 32
    const-string v4, "getCode(...)"

    .line 33
    .line 34
    const-string v5, "SymbolsInfo"

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v3, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 46
    move-result-object v7

    .line 47
    .line 48
    .line 49
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v6, v7}, Ly70/e;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 53
    move-result v4

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string/jumbo v6, "update coin:"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    .line 80
    invoke-static {v5, v4}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    const-string v6, "add coin:"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    .line 105
    invoke-static {v5, v4}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    invoke-virtual {v3, v2}, Lcom/kubi/data/coin/info/n0;->D(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 109
    goto :goto_2

    .line 110
    .line 111
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    const-string v6, "remove coin:"

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 123
    move-result-object v6

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-static {v5, v3}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    sget-object v3, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 143
    move-result-object v6

    .line 144
    .line 145
    .line 146
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v6}, Ly70/e;->q(Ljava/lang/String;Ljava/lang/String;)Ly70/e;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 153
    move-result-object v3

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    const-string v5, "getSymbol(...)"

    .line 160
    .line 161
    .line 162
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v3, v4}, Ly70/e;->q(Ljava/lang/String;Ljava/lang/String;)Ly70/e;

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getUnionUpdatedAt()Ljava/lang/Long;

    .line 169
    move-result-object v3

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 173
    move-result-wide v3

    .line 174
    .line 175
    cmp-long v3, v3, v0

    .line 176
    .line 177
    if-lez v3, :cond_0

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getUnionUpdatedAt()Ljava/lang/Long;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    const-string v1, "getUnionUpdatedAt(...)"

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 190
    move-result-wide v0

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    :cond_3
    return-wide v0
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
.end method

.method public final n(Lkotlin/jvm/functions/Function1;Z)Lio/reactivex/disposables/Disposable;
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">;",
            "Lkotlin/Unit;",
            ">;Z)",
            "Lio/reactivex/disposables/Disposable;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lvk/s;->d0()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->z()Ly70/g;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->z()Ly70/g;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Ly70/a;->f(Ly70/g;J)J

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->A()Lgf/h;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    invoke-interface {v2, v0, v1, p2}, Lgf/h;->g(Ljava/lang/Long;Ljava/lang/Boolean;Z)Lio/reactivex/Observable;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/kubi/sdk/util/a1;->n()Lio/reactivex/ObservableTransformer;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    new-instance v0, Lcom/kubi/data/coin/info/h0;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Lcom/kubi/data/coin/info/h0;-><init>()V

    .line 53
    .line 54
    new-instance v1, Lcom/kubi/data/coin/info/i0;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v0}, Lcom/kubi/data/coin/info/i0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    new-instance v0, Lcom/kubi/data/coin/info/j0;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, p1}, Lcom/kubi/data/coin/info/j0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 75
    .line 76
    new-instance v1, Lcom/kubi/data/coin/info/k0;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v0}, Lcom/kubi/data/coin/info/k0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    new-instance v0, Lcom/kubi/data/coin/info/l0;

    .line 82
    .line 83
    .line 84
    invoke-direct {v0, p1}, Lcom/kubi/data/coin/info/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 85
    .line 86
    new-instance p1, Lcom/kubi/data/coin/info/m0;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, v0}, Lcom/kubi/data/coin/info/m0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v1, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 93
    move-result-object p1

    .line 94
    return-object p1
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
.end method

.method public final u(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 12
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "condition"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ly70/a;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-class v2, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    array-length v6, v1

    .line 27
    move v7, v4

    .line 28
    .line 29
    :goto_0
    if-ge v7, v6, :cond_1

    .line 30
    .line 31
    aget-object v8, v1, v7

    .line 32
    .line 33
    sget-object v9, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v9}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 37
    move-result-object v9

    .line 38
    .line 39
    sget-object v10, Ly70/e;->a:Ly70/e;

    .line 40
    .line 41
    new-instance v10, Ly70/g;

    .line 42
    .line 43
    sget-object v11, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 44
    .line 45
    .line 46
    invoke-direct {v10, v9, v8, v11, v5}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 47
    .line 48
    sget-object v8, Ly70/a;->a:Ly70/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v10, v2, v3}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 52
    move-result-object v8

    .line 53
    .line 54
    check-cast v8, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 55
    .line 56
    if-eqz v8, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    move-result-object v9

    .line 61
    .line 62
    check-cast v9, Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    move-result v9

    .line 67
    .line 68
    if-eqz v9, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_0
    add-int/2addr v7, v5

    .line 73
    goto :goto_0

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Ly70/a;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    array-length v6, v1

    .line 85
    .line 86
    :goto_1
    if-ge v4, v6, :cond_3

    .line 87
    .line 88
    aget-object v7, v1, v4

    .line 89
    .line 90
    sget-object v8, Lcom/kubi/data/coin/info/n0;->a:Lcom/kubi/data/coin/info/n0;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 94
    move-result-object v8

    .line 95
    .line 96
    sget-object v9, Ly70/e;->a:Ly70/e;

    .line 97
    .line 98
    new-instance v9, Ly70/g;

    .line 99
    .line 100
    sget-object v10, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 101
    .line 102
    .line 103
    invoke-direct {v9, v8, v7, v10, v5}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 104
    .line 105
    sget-object v7, Ly70/a;->a:Ly70/a;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v9, v2, v3}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 109
    move-result-object v7

    .line 110
    .line 111
    check-cast v7, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 112
    .line 113
    if-eqz v7, :cond_2

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object v8

    .line 118
    .line 119
    check-cast v8, Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    move-result v8

    .line 124
    .line 125
    if-eqz v8, :cond_2

    .line 126
    .line 127
    .line 128
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_2
    add-int/2addr v4, v5

    .line 130
    goto :goto_1

    .line 131
    .line 132
    :cond_3
    new-instance p1, Ljava/util/HashSet;

    .line 133
    .line 134
    .line 135
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 136
    .line 137
    new-instance v1, Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    move-result v2

    .line 149
    .line 150
    if-eqz v2, :cond_5

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    move-result-object v2

    .line 155
    move-object v3, v2

    .line 156
    .line 157
    check-cast v3, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 165
    move-result v3

    .line 166
    .line 167
    if-eqz v3, :cond_4

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    return-object v1
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
.end method

.method public final v(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Ly70/e;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    const-class v1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->w()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    new-instance v4, Ly70/g;

    .line 21
    .line 22
    sget-object v5, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, v0, p1, v5, v2}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 26
    .line 27
    sget-object p1, Ly70/a;->a:Ly70/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v4, v1, v3}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    check-cast p1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 34
    return-object p1

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/n0;->x()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    new-instance v4, Ly70/g;

    .line 41
    .line 42
    sget-object v5, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, v0, p1, v5, v2}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 46
    .line 47
    sget-object p1, Ly70/a;->a:Ly70/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v4, v1, v3}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    check-cast p1, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 54
    return-object p1
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
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/n0;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/n0;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final y(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/data/coin/info/n0;->v(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/data/coin/BizType;->SymbolEntityQuery:Lcom/kubi/data/coin/BizType;

    .line 18
    .line 19
    sget-object v1, Lcom/kubi/data/coin/QueryRet;->FAILED:Lcom/kubi/data/coin/QueryRet;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lgf/y;->a(Lcom/kubi/data/coin/BizType;Lcom/kubi/data/coin/QueryRet;)V

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_1
    sget-object v0, Lcom/kubi/data/coin/BizType;->SymbolEntityQuery:Lcom/kubi/data/coin/BizType;

    .line 26
    .line 27
    sget-object v1, Lcom/kubi/data/coin/QueryRet;->SUCCESS:Lcom/kubi/data/coin/QueryRet;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lgf/y;->a(Lcom/kubi/data/coin/BizType;Lcom/kubi/data/coin/QueryRet;)V

    .line 31
    return-object p1

    .line 32
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 33
    return-object p1
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

.method public final z()Ly70/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ly70/g;

    .line 3
    .line 4
    const/16 v5, 0xc

    .line 5
    const/4 v6, 0x0

    .line 6
    .line 7
    const-string v1, "common"

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "symbols_info_time_line"

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
