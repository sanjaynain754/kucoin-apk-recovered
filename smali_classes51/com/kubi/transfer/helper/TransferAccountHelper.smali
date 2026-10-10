.class public final Lcom/kubi/transfer/helper/TransferAccountHelper;
.super Ljava/lang/Object;
.source "TransferAccountHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 62\u00020\u0001:\u00016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ(\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\nJ \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005*\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0006\u0010!\u001a\u00020\u001dH\u0002JP\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020\u001d2\u0008\u0010\'\u001a\u0004\u0018\u00010(2\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u001b0*H\u0086@\u00a2\u0006\u0002\u0010+J@\u0010,\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\n2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u001b0*H\u0002J2\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0\u00052\u0008\u0010#\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001dJ2\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0\u00052\u0008\u0010#\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u001c\u00104\u001a\u0004\u0018\u00010\u00112\u0008\u0010#\u001a\u0004\u0018\u00010\n2\u0008\u00105\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR6\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00050\u0010j\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u0005`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u00067"
    }
    d2 = {
        "Lcom/kubi/transfer/helper/TransferAccountHelper;",
        "",
        "<init>",
        "()V",
        "transferType",
        "",
        "Lcom/kubi/data/coin/Direction;",
        "multiAccountToTypes",
        "Lcom/kubi/data/coin/AccountType;",
        "multiAccountFromAccounts",
        "",
        "getMultiAccountFromAccounts",
        "()Ljava/util/List;",
        "setMultiAccountFromAccounts",
        "(Ljava/util/List;)V",
        "balanceMap",
        "Ljava/util/HashMap;",
        "Lcom/kubi/data/entity/SingleCurrencyBalance;",
        "Lkotlin/collections/HashMap;",
        "api",
        "Lcom/kubi/transfer/TransferApi;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/transfer/TransferApi;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "initTransferAccountType",
        "",
        "isMultiAccountMode",
        "",
        "fromType",
        "toType",
        "reorderUnifiedIfNeeded",
        "isLast",
        "fetchBalanceList",
        "coin",
        "precision",
        "",
        "isContract",
        "contractBalance",
        "Lcom/kubi/kumex/entity/BalanceEntity;",
        "action",
        "Lkotlin/Function1;",
        "(Ljava/lang/String;ILjava/lang/String;ZLcom/kubi/kumex/entity/BalanceEntity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleContractAccount",
        "balances",
        "buildTransferFromAccountList",
        "Lcom/kubi/transfer/entity/AccountItem;",
        "buildTransferToAccountList",
        "isReverseTransferSupported",
        "reverseFrom",
        "reverseTo",
        "getAccountBalance",
        "accountType",
        "Companion",
        "TransferLib_googleRelease"
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
        "SMAP\nTransferAccountHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferAccountHelper.kt\ncom/kubi/transfer/helper/TransferAccountHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n774#2:289\n865#2,2:290\n774#2:292\n865#2,2:293\n827#2:295\n855#2,2:296\n827#2:298\n855#2,2:299\n827#2:301\n855#2,2:302\n827#2:304\n855#2,2:305\n1563#2:307\n1634#2,2:308\n774#2:310\n865#2,2:311\n1636#2:313\n1563#2:314\n1634#2,3:315\n827#2:318\n855#2,2:319\n774#2:321\n865#2,2:322\n774#2:325\n865#2,2:326\n1999#2,14:328\n774#2:342\n865#2,2:343\n1563#2:345\n1634#2,3:346\n774#2:349\n865#2,2:350\n827#2:352\n855#2,2:353\n1563#2:355\n1634#2,3:356\n774#2:359\n865#2,2:360\n1563#2:362\n1634#2,3:363\n774#2:366\n865#2,2:367\n1563#2:369\n1634#2,3:370\n774#2:373\n865#2,2:374\n1761#2,2:376\n1761#2,3:378\n1763#2:381\n1#3:324\n*S KotlinDebug\n*F\n+ 1 TransferAccountHelper.kt\ncom/kubi/transfer/helper/TransferAccountHelper\n*L\n87#1:289\n87#1:290,2\n88#1:292\n88#1:293,2\n89#1:295\n89#1:296,2\n90#1:298\n90#1:299,2\n91#1:301\n91#1:302,2\n92#1:304\n92#1:305,2\n95#1:307\n95#1:308,2\n99#1:310\n99#1:311,2\n95#1:313\n107#1:314\n107#1:315,3\n124#1:318\n124#1:319,2\n135#1:321\n135#1:322,2\n183#1:325\n183#1:326,2\n183#1:328,14\n205#1:342\n205#1:343,2\n206#1:345\n206#1:346,3\n213#1:349\n213#1:350,2\n222#1:352\n222#1:353,2\n224#1:355\n224#1:356,3\n229#1:359\n229#1:360,2\n247#1:362\n247#1:363,3\n253#1:366\n253#1:367,2\n258#1:369\n258#1:370,3\n264#1:373\n264#1:374,2\n277#1:376,2\n278#1:378,3\n277#1:381\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgf/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/coin/AccountType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/SingleCurrencyBalance;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/transfer/helper/TransferAccountHelper;->f:Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->b:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->c:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/transfer/helper/b;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/kubi/transfer/helper/b;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->e:Lkotlin/Lazy;

    .line 40
    return-void
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

.method public static synthetic a()Lcom/kubi/transfer/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/transfer/helper/TransferAccountHelper;->b()Lcom/kubi/transfer/a;

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

.method public static final b()Lcom/kubi/transfer/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/transfer/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/transfer/a;

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
.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/kubi/transfer/entity/AccountItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    const-string v1, "ISOLATED"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz p4, :cond_a

    .line 8
    .line 9
    iget-object p4, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->b:Ljava/util/List;

    .line 10
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p4

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v4

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v4

    .line 29
    move-object v5, v4

    .line 30
    .line 31
    check-cast v5, Lcom/kubi/data/coin/AccountType;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    .line 38
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v6

    .line 40
    .line 41
    if-eqz v6, :cond_1

    .line 42
    goto :goto_1

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-static {v5, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v5

    .line 51
    .line 52
    if-nez v5, :cond_0

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_2
    new-instance p3, Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 62
    move-result p4

    .line 63
    .line 64
    .line 65
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    move-result-object p4

    .line 70
    .line 71
    .line 72
    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    .line 78
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    check-cast v0, Lcom/kubi/data/coin/AccountType;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    iget-object v3, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    .line 92
    .line 93
    .line 94
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    check-cast v3, Ljava/util/List;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 103
    move-result v4

    .line 104
    .line 105
    .line 106
    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 111
    move-result v4

    .line 112
    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 117
    move-result-object v4

    .line 118
    move-object v5, v4

    .line 119
    .line 120
    check-cast v5, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 128
    move-result-object v6

    .line 129
    .line 130
    .line 131
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    move-result v5

    .line 133
    .line 134
    if-eqz v5, :cond_3

    .line 135
    goto :goto_3

    .line 136
    :cond_4
    move-object v4, v2

    .line 137
    .line 138
    :goto_3
    check-cast v4, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    move-object v4, v2

    .line 141
    .line 142
    :goto_4
    new-instance v3, Lcom/kubi/transfer/entity/AccountItem;

    .line 143
    .line 144
    .line 145
    invoke-direct {v3, v0, v1, v4}, Lcom/kubi/transfer/entity/AccountItem;-><init>(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p3, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    goto :goto_2

    .line 150
    .line 151
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    .line 161
    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    move-result p3

    .line 163
    .line 164
    if-eqz p3, :cond_9

    .line 165
    .line 166
    .line 167
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    move-result-object p3

    .line 169
    move-object p4, p3

    .line 170
    .line 171
    check-cast p4, Lcom/kubi/transfer/entity/AccountItem;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p4}, Lcom/kubi/transfer/entity/AccountItem;->getSingleCurrencyBalance()Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 175
    move-result-object p4

    .line 176
    .line 177
    if-eqz p4, :cond_8

    .line 178
    .line 179
    .line 180
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isOpen()Z

    .line 181
    move-result v0

    .line 182
    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    .line 186
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isSupportOut()Z

    .line 187
    move-result p4

    .line 188
    .line 189
    if-eqz p4, :cond_7

    .line 190
    .line 191
    .line 192
    :cond_8
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    goto :goto_5

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    new-instance p2, Lcom/kubi/transfer/TransferHelper;

    .line 200
    .line 201
    .line 202
    invoke-direct {p2}, Lcom/kubi/transfer/TransferHelper;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2, p1}, Lcom/kubi/transfer/TransferHelper;->s(Ljava/util/List;)V

    .line 206
    return-object p1

    .line 207
    .line 208
    :cond_a
    iget-object p4, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 209
    .line 210
    new-instance v3, Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    move-result-object p4

    .line 218
    .line 219
    .line 220
    :goto_6
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    move-result v4

    .line 222
    .line 223
    if-eqz v4, :cond_c

    .line 224
    .line 225
    .line 226
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    move-result-object v4

    .line 228
    move-object v5, v4

    .line 229
    .line 230
    check-cast v5, Lgf/k;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 234
    move-result-object v5

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 238
    move-result-object v5

    .line 239
    .line 240
    .line 241
    invoke-static {v5, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v5

    .line 243
    .line 244
    if-eqz v5, :cond_b

    .line 245
    .line 246
    .line 247
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    move-result v5

    .line 249
    .line 250
    if-nez v5, :cond_b

    .line 251
    goto :goto_6

    .line 252
    .line 253
    .line 254
    :cond_b
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 255
    goto :goto_6

    .line 256
    .line 257
    :cond_c
    new-instance p3, Ljava/util/ArrayList;

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 261
    move-result p4

    .line 262
    .line 263
    .line 264
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    move-result-object p4

    .line 269
    .line 270
    .line 271
    :goto_7
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    move-result v0

    .line 273
    .line 274
    if-eqz v0, :cond_10

    .line 275
    .line 276
    .line 277
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    move-result-object v0

    .line 279
    .line 280
    check-cast v0, Lgf/k;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 288
    move-result-object v3

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 292
    move-result-object v3

    .line 293
    .line 294
    .line 295
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    move-result v3

    .line 297
    .line 298
    iget-object v4, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    .line 299
    .line 300
    .line 301
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    move-result-object v4

    .line 303
    .line 304
    check-cast v4, Ljava/util/List;

    .line 305
    .line 306
    if-eqz v4, :cond_f

    .line 307
    .line 308
    .line 309
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 310
    move-result v5

    .line 311
    .line 312
    .line 313
    invoke-interface {v4, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 314
    move-result-object v4

    .line 315
    .line 316
    .line 317
    :cond_d
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 318
    move-result v5

    .line 319
    .line 320
    if-eqz v5, :cond_e

    .line 321
    .line 322
    .line 323
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 324
    move-result-object v5

    .line 325
    move-object v6, v5

    .line 326
    .line 327
    check-cast v6, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 331
    move-result-object v6

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 335
    move-result-object v7

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 339
    move-result-object v7

    .line 340
    .line 341
    .line 342
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    move-result v6

    .line 344
    .line 345
    if-eqz v6, :cond_d

    .line 346
    goto :goto_8

    .line 347
    :cond_e
    move-object v5, v2

    .line 348
    .line 349
    :goto_8
    check-cast v5, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 350
    goto :goto_9

    .line 351
    :cond_f
    move-object v5, v2

    .line 352
    .line 353
    :goto_9
    new-instance v0, Lcom/kubi/transfer/entity/AccountItem;

    .line 354
    .line 355
    .line 356
    invoke-direct {v0, v1, v3, v5}, Lcom/kubi/transfer/entity/AccountItem;-><init>(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 360
    goto :goto_7

    .line 361
    .line 362
    :cond_10
    new-instance p1, Ljava/util/ArrayList;

    .line 363
    .line 364
    .line 365
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    move-result-object p2

    .line 370
    .line 371
    .line 372
    :cond_11
    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    move-result p3

    .line 374
    .line 375
    if-eqz p3, :cond_13

    .line 376
    .line 377
    .line 378
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    move-result-object p3

    .line 380
    move-object p4, p3

    .line 381
    .line 382
    check-cast p4, Lcom/kubi/transfer/entity/AccountItem;

    .line 383
    .line 384
    .line 385
    invoke-virtual {p4}, Lcom/kubi/transfer/entity/AccountItem;->getSingleCurrencyBalance()Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 386
    move-result-object p4

    .line 387
    .line 388
    if-eqz p4, :cond_12

    .line 389
    .line 390
    .line 391
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isOpen()Z

    .line 392
    move-result v0

    .line 393
    .line 394
    if-eqz v0, :cond_11

    .line 395
    .line 396
    .line 397
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isSupportOut()Z

    .line 398
    move-result p4

    .line 399
    .line 400
    if-eqz p4, :cond_11

    .line 401
    .line 402
    .line 403
    :cond_12
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 404
    goto :goto_a

    .line 405
    :cond_13
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/kubi/transfer/entity/AccountItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p4, :cond_7

    .line 6
    .line 7
    iget-object p2, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->b:Ljava/util/List;

    .line 8
    .line 9
    new-instance p4, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/kubi/data/coin/AccountType;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {v2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v2

    .line 41
    .line 42
    iget-object v3, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    .line 43
    .line 44
    .line 45
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Ljava/util/List;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 54
    move-result v4

    .line 55
    .line 56
    .line 57
    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 62
    move-result v4

    .line 63
    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 68
    move-result-object v4

    .line 69
    move-object v5, v4

    .line 70
    .line 71
    check-cast v5, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 75
    move-result-object v5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    .line 82
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    move-result v5

    .line 84
    .line 85
    if-eqz v5, :cond_0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-object v4, v1

    .line 88
    .line 89
    :goto_1
    check-cast v4, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v4, v1

    .line 92
    .line 93
    :goto_2
    new-instance v3, Lcom/kubi/transfer/entity/AccountItem;

    .line 94
    .line 95
    .line 96
    invoke-direct {v3, v0, v2, v4}, Lcom/kubi/transfer/entity/AccountItem;-><init>(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    goto :goto_0

    .line 101
    .line 102
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    move-result-object p2

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    move-result p3

    .line 114
    .line 115
    if-eqz p3, :cond_6

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    move-result-object p3

    .line 120
    move-object p4, p3

    .line 121
    .line 122
    check-cast p4, Lcom/kubi/transfer/entity/AccountItem;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p4}, Lcom/kubi/transfer/entity/AccountItem;->getSingleCurrencyBalance()Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 126
    move-result-object p4

    .line 127
    .line 128
    if-eqz p4, :cond_5

    .line 129
    .line 130
    .line 131
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isOpen()Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isSupportIn()Z

    .line 138
    move-result p4

    .line 139
    .line 140
    if-eqz p4, :cond_4

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    return-object p1

    .line 146
    .line 147
    :cond_7
    iget-object p4, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 148
    .line 149
    .line 150
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 151
    move-result v2

    .line 152
    .line 153
    .line 154
    invoke-interface {p4, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 155
    move-result-object p4

    .line 156
    .line 157
    .line 158
    :cond_8
    invoke-interface {p4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 159
    move-result v2

    .line 160
    .line 161
    if-eqz v2, :cond_9

    .line 162
    .line 163
    .line 164
    invoke-interface {p4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 165
    move-result-object v2

    .line 166
    move-object v3, v2

    .line 167
    .line 168
    check-cast v3, Lgf/k;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    move-result v3

    .line 181
    .line 182
    if-eqz v3, :cond_8

    .line 183
    goto :goto_4

    .line 184
    :cond_9
    move-object v2, v1

    .line 185
    .line 186
    :goto_4
    check-cast v2, Lgf/k;

    .line 187
    .line 188
    if-eqz v2, :cond_11

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Lgf/k;->b()Ljava/util/List;

    .line 192
    move-result-object p2

    .line 193
    .line 194
    if-eqz p2, :cond_11

    .line 195
    .line 196
    new-instance p4, Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 200
    move-result v0

    .line 201
    .line 202
    .line 203
    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    move-result-object p2

    .line 208
    .line 209
    .line 210
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    move-result v0

    .line 212
    .line 213
    if-eqz v0, :cond_d

    .line 214
    .line 215
    .line 216
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    check-cast v0, Lcom/kubi/data/coin/AccountType;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 223
    move-result-object v2

    .line 224
    .line 225
    .line 226
    invoke-static {v2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    move-result v2

    .line 228
    .line 229
    iget-object v3, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    .line 230
    .line 231
    .line 232
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    move-result-object v3

    .line 234
    .line 235
    check-cast v3, Ljava/util/List;

    .line 236
    .line 237
    if-eqz v3, :cond_c

    .line 238
    .line 239
    .line 240
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 241
    move-result v4

    .line 242
    .line 243
    .line 244
    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 245
    move-result-object v3

    .line 246
    .line 247
    .line 248
    :cond_a
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 249
    move-result v4

    .line 250
    .line 251
    if-eqz v4, :cond_b

    .line 252
    .line 253
    .line 254
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 255
    move-result-object v4

    .line 256
    move-object v5, v4

    .line 257
    .line 258
    check-cast v5, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 262
    move-result-object v5

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 266
    move-result-object v6

    .line 267
    .line 268
    .line 269
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    move-result v5

    .line 271
    .line 272
    if-eqz v5, :cond_a

    .line 273
    goto :goto_6

    .line 274
    :cond_b
    move-object v4, v1

    .line 275
    .line 276
    :goto_6
    check-cast v4, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 277
    goto :goto_7

    .line 278
    :cond_c
    move-object v4, v1

    .line 279
    .line 280
    :goto_7
    new-instance v3, Lcom/kubi/transfer/entity/AccountItem;

    .line 281
    .line 282
    .line 283
    invoke-direct {v3, v0, v2, v4}, Lcom/kubi/transfer/entity/AccountItem;-><init>(Lcom/kubi/data/coin/AccountType;ZLcom/kubi/data/entity/SingleCurrencyBalance;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {p4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 287
    goto :goto_5

    .line 288
    .line 289
    :cond_d
    new-instance p1, Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    move-result-object p2

    .line 297
    .line 298
    .line 299
    :cond_e
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    move-result p3

    .line 301
    .line 302
    if-eqz p3, :cond_10

    .line 303
    .line 304
    .line 305
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    move-result-object p3

    .line 307
    move-object p4, p3

    .line 308
    .line 309
    check-cast p4, Lcom/kubi/transfer/entity/AccountItem;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p4}, Lcom/kubi/transfer/entity/AccountItem;->getSingleCurrencyBalance()Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 313
    move-result-object p4

    .line 314
    .line 315
    if-eqz p4, :cond_f

    .line 316
    .line 317
    .line 318
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isOpen()Z

    .line 319
    move-result v0

    .line 320
    .line 321
    if-eqz v0, :cond_e

    .line 322
    .line 323
    .line 324
    invoke-virtual {p4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->isSupportIn()Z

    .line 325
    move-result p4

    .line 326
    .line 327
    if-eqz p4, :cond_e

    .line 328
    .line 329
    .line 330
    :cond_f
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 331
    goto :goto_8

    .line 332
    :cond_10
    return-object p1

    .line 333
    .line 334
    .line 335
    :cond_11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 336
    move-result-object p1

    .line 337
    return-object p1
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
.end method

.method public final e(Ljava/lang/String;ILjava/lang/String;ZLcom/kubi/kumex/entity/BalanceEntity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/kubi/kumex/entity/BalanceEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Z",
            "Lcom/kubi/kumex/entity/BalanceEntity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/kubi/data/coin/AccountType;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p7

    instance-of v3, v2, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;

    iget v4, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;

    invoke-direct {v3, v0, v2}, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;-><init>(Lcom/kubi/transfer/helper/TransferAccountHelper;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->label:I

    const-string v6, "CONTRACT"

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-boolean v1, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->Z$0:Z

    iget v4, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->I$0:I

    iget-object v5, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v7, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lcom/kubi/kumex/entity/BalanceEntity;

    iget-object v8, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v3, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v11, v1

    move-object v1, v3

    move-object v10, v5

    move-object v9, v7

    move-object v3, v2

    move v2, v4

    goto/16 :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v2

    .line 3
    const-string v5, "MAIN"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    const-string v5, "TRADE"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-static {}, Lg60/c;->a()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "UNIFIED"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_3
    sget-object v5, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    invoke-static {v5}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {}, Lg60/c;->b()Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, "SAVINGS"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_4
    sget-object v5, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Margin:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    invoke-static {v5}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v5, "MARGIN"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_5
    invoke-static {}, Lcom/kubi/transfer/helper/a;->a()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_6
    sget-object v5, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Option:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    invoke-static {v5}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v5, "OPTION"

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_7
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    const/16 v15, 0x3e

    const/16 v16, 0x0

    .line 11
    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {v0}, Lcom/kubi/transfer/helper/TransferAccountHelper;->f()Lcom/kubi/transfer/a;

    move-result-object v5

    invoke-interface {v5, v1, v2}, Lcom/kubi/transfer/a;->c(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    move-result-object v5

    iput-object v1, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$0:Ljava/lang/Object;

    move-object/from16 v8, p3

    iput-object v8, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$1:Ljava/lang/Object;

    move-object/from16 v9, p5

    iput-object v9, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$2:Ljava/lang/Object;

    move-object/from16 v10, p6

    iput-object v10, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$3:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->L$4:Ljava/lang/Object;

    move/from16 v2, p2

    iput v2, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->I$0:I

    move/from16 v11, p4

    iput-boolean v11, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->Z$0:Z

    iput v7, v3, Lcom/kubi/transfer/helper/TransferAccountHelper$fetchBalanceList$1;->label:I

    invoke-static {v5, v3}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->k(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    return-object v4

    :cond_8
    :goto_1
    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    if-eqz v3, :cond_c

    .line 13
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/kubi/data/entity/SingleCurrencyBalance;

    invoke-virtual {v12}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_2

    :cond_a
    move-object v7, v4

    :goto_2
    check-cast v7, Lcom/kubi/data/entity/SingleCurrencyBalance;

    if-eqz v7, :cond_d

    if-eqz v9, :cond_b

    .line 14
    invoke-virtual {v9}, Lcom/kubi/kumex/entity/BalanceEntity;->getWithdrawBalance()Ljava/math/BigDecimal;

    move-result-object v4

    :cond_b
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v4

    .line 15
    invoke-virtual {v7, v4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->setAvailableBalance(Ljava/math/BigDecimal;)V

    goto :goto_3

    :cond_c
    move-object v3, v4

    .line 16
    :cond_d
    :goto_3
    iget-object v4, v0, Lcom/kubi/transfer/helper/TransferAccountHelper;->d:Ljava/util/HashMap;

    if-nez v3, :cond_e

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_4

    :cond_e
    move-object v5, v3

    :goto_4
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v11, :cond_f

    .line 17
    invoke-virtual {v0, v2, v8, v3, v10}, Lcom/kubi/transfer/helper/TransferAccountHelper;->i(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 18
    :cond_f
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final f()Lcom/kubi/transfer/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/transfer/a;

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

.method public final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->c:Ljava/util/List;

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

.method public final h(ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->c:Ljava/util/List;

    .line 5
    .line 6
    new-instance p2, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "ISOLATED"

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    move-object v1, v0

    .line 59
    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-object p1

    .line 72
    .line 73
    .line 74
    :cond_4
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    move-result-object p1

    .line 80
    return-object p1
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
.end method

.method public final i(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/SingleCurrencyBalance;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/kubi/data/coin/AccountType;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p3, :cond_6

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v3

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v3

    .line 23
    move-object v4, v3

    .line 24
    .line 25
    check-cast v4, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    move-object/from16 v5, p2

    .line 32
    .line 33
    .line 34
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v4

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    move-result v2

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    move-object v2, v0

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v3

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v3, v2

    .line 66
    .line 67
    check-cast v3, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    move-object v5, v4

    .line 77
    .line 78
    check-cast v5, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-interface {v3, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 86
    move-result v6

    .line 87
    .line 88
    if-gez v6, :cond_5

    .line 89
    move-object v2, v4

    .line 90
    move-object v3, v5

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    move-result v4

    .line 95
    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    :goto_1
    check-cast v2, Lcom/kubi/data/entity/SingleCurrencyBalance;

    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move-object v2, v0

    .line 101
    .line 102
    :goto_2
    if-eqz v2, :cond_7

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 106
    move-result-object v1

    .line 107
    goto :goto_3

    .line 108
    :cond_7
    move-object v1, v0

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 112
    move-result-wide v3

    .line 113
    .line 114
    .line 115
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 120
    move-result v6

    .line 121
    .line 122
    const/16 v13, 0xfd

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    .line 132
    .line 133
    invoke-static/range {v3 .. v14}, Lkf/a;->r(DLjava/math/RoundingMode;IZZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 134
    move-result-object v1

    .line 135
    const/4 v3, 0x1

    .line 136
    .line 137
    const-wide/16 v4, 0x0

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v4, v5, v3, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 141
    move-result-wide v6

    .line 142
    .line 143
    cmpg-double v1, v6, v4

    .line 144
    .line 145
    if-gtz v1, :cond_8

    .line 146
    .line 147
    sget-object v0, Lcom/kubi/data/coin/AccountType;->MAIN:Lcom/kubi/data/coin/AccountType;

    .line 148
    .line 149
    :goto_4
    move-object/from16 v1, p4

    .line 150
    goto :goto_5

    .line 151
    .line 152
    :cond_8
    sget-object v1, Lcom/kubi/data/coin/AccountType;->Companion:Lcom/kubi/data/coin/AccountType$Companion;

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/kubi/data/entity/SingleCurrencyBalance;->getAccountType()Ljava/lang/String;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    :cond_9
    invoke-virtual {v1, v0}, Lcom/kubi/data/coin/AccountType$Companion;->ofName(Ljava/lang/String;)Lcom/kubi/data/coin/AccountType;

    .line 162
    move-result-object v0

    .line 163
    goto :goto_4

    .line 164
    .line 165
    .line 166
    :goto_5
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    return-void
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
.end method

.method public final j()V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/transfer/helper/TransferAccountHelper;->f:Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;->isContractOpen()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;->isLeverOpen()Z

    .line 10
    move-result v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;->isOptionOpen()Z

    .line 14
    move-result v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/transfer/helper/TransferAccountHelper$Companion;->isSavingsOpen()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/kubi/data/coin/AccountType;->getEntries()Lkotlin/enums/EnumEntries;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    new-instance v5, Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v6

    .line 36
    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v6

    .line 42
    move-object v7, v6

    .line 43
    .line 44
    check-cast v7, Lcom/kubi/data/coin/AccountType;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7}, Lcom/kubi/data/coin/AccountType;->getSupportTransfer()Z

    .line 48
    move-result v7

    .line 49
    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    move-result v6

    .line 68
    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    move-result-object v6

    .line 74
    move-object v7, v6

    .line 75
    .line 76
    check-cast v7, Lcom/kubi/data/coin/AccountType;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :cond_3
    sget-object v8, Lcom/kubi/data/coin/AccountType;->SAVINGS:Lcom/kubi/data/coin/AccountType;

    .line 82
    .line 83
    if-eq v7, v8, :cond_2

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    move-result v5

    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    move-result-object v5

    .line 107
    move-object v6, v5

    .line 108
    .line 109
    check-cast v6, Lcom/kubi/data/coin/AccountType;

    .line 110
    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    sget-object v7, Lcom/kubi/data/coin/AccountType;->CONTRACT:Lcom/kubi/data/coin/AccountType;

    .line 114
    .line 115
    if-ne v6, v7, :cond_5

    .line 116
    goto :goto_3

    .line 117
    .line 118
    .line 119
    :cond_5
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 120
    goto :goto_3

    .line 121
    .line 122
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result v4

    .line 134
    .line 135
    if-eqz v4, :cond_9

    .line 136
    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object v4

    .line 140
    move-object v5, v4

    .line 141
    .line 142
    check-cast v5, Lcom/kubi/data/coin/AccountType;

    .line 143
    .line 144
    if-nez v2, :cond_8

    .line 145
    .line 146
    sget-object v6, Lcom/kubi/data/coin/AccountType;->MARGIN:Lcom/kubi/data/coin/AccountType;

    .line 147
    .line 148
    if-eq v5, v6, :cond_7

    .line 149
    .line 150
    sget-object v6, Lcom/kubi/data/coin/AccountType;->ISOLATED:Lcom/kubi/data/coin/AccountType;

    .line 151
    .line 152
    if-ne v5, v6, :cond_8

    .line 153
    goto :goto_4

    .line 154
    .line 155
    .line 156
    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    goto :goto_4

    .line 158
    .line 159
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    .line 169
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    move-result v2

    .line 171
    .line 172
    if-eqz v2, :cond_b

    .line 173
    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    move-result-object v2

    .line 177
    move-object v4, v2

    .line 178
    .line 179
    check-cast v4, Lcom/kubi/data/coin/AccountType;

    .line 180
    .line 181
    if-nez v3, :cond_a

    .line 182
    .line 183
    sget-object v5, Lcom/kubi/data/coin/AccountType;->OPTION:Lcom/kubi/data/coin/AccountType;

    .line 184
    .line 185
    if-ne v4, v5, :cond_a

    .line 186
    goto :goto_5

    .line 187
    .line 188
    .line 189
    :cond_a
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 190
    goto :goto_5

    .line 191
    .line 192
    :cond_b
    new-instance v1, Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    .line 202
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    move-result v2

    .line 204
    .line 205
    if-eqz v2, :cond_d

    .line 206
    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    move-result-object v2

    .line 210
    move-object v3, v2

    .line 211
    .line 212
    check-cast v3, Lcom/kubi/data/coin/AccountType;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Lg60/c;->a()Z

    .line 216
    move-result v4

    .line 217
    .line 218
    if-nez v4, :cond_c

    .line 219
    .line 220
    sget-object v4, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 221
    .line 222
    if-ne v3, v4, :cond_c

    .line 223
    goto :goto_6

    .line 224
    .line 225
    .line 226
    :cond_c
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 227
    goto :goto_6

    .line 228
    .line 229
    :cond_d
    sget-object v0, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    .line 236
    invoke-interface {v0}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 237
    move-result v0

    .line 238
    .line 239
    xor-int/lit8 v0, v0, 0x1

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v1, v0}, Lcom/kubi/transfer/helper/TransferAccountHelper;->l(Ljava/util/List;Z)Ljava/util/List;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    new-instance v1, Ljava/util/ArrayList;

    .line 246
    .line 247
    const/16 v2, 0xa

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 251
    move-result v3

    .line 252
    .line 253
    .line 254
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    move-result-object v3

    .line 259
    .line 260
    .line 261
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    move-result v4

    .line 263
    .line 264
    if-eqz v4, :cond_11

    .line 265
    .line 266
    .line 267
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    move-result-object v4

    .line 269
    .line 270
    check-cast v4, Lcom/kubi/data/coin/AccountType;

    .line 271
    .line 272
    sget-object v5, Lcom/kubi/data/coin/AccountType;->ISOLATED:Lcom/kubi/data/coin/AccountType;

    .line 273
    .line 274
    if-eq v4, v5, :cond_f

    .line 275
    .line 276
    new-instance v5, Ljava/util/ArrayList;

    .line 277
    .line 278
    .line 279
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    move-result-object v6

    .line 284
    .line 285
    .line 286
    :cond_e
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    move-result v7

    .line 288
    .line 289
    if-eqz v7, :cond_10

    .line 290
    .line 291
    .line 292
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    move-result-object v7

    .line 294
    move-object v8, v7

    .line 295
    .line 296
    check-cast v8, Lcom/kubi/data/coin/AccountType;

    .line 297
    .line 298
    if-eq v4, v8, :cond_e

    .line 299
    .line 300
    .line 301
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 302
    goto :goto_8

    .line 303
    :cond_f
    move-object v5, v0

    .line 304
    .line 305
    :cond_10
    new-instance v6, Lgf/k;

    .line 306
    .line 307
    .line 308
    invoke-direct {v6, v4, v5}, Lgf/k;-><init>(Lcom/kubi/data/coin/AccountType;Ljava/util/List;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 312
    goto :goto_7

    .line 313
    .line 314
    :cond_11
    iput-object v1, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 315
    .line 316
    iput-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->b:Ljava/util/List;

    .line 317
    .line 318
    new-instance v1, Ljava/util/ArrayList;

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 322
    move-result v2

    .line 323
    .line 324
    .line 325
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    .line 332
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    move-result v2

    .line 334
    .line 335
    if-eqz v2, :cond_12

    .line 336
    .line 337
    .line 338
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    move-result-object v2

    .line 340
    .line 341
    check-cast v2, Lcom/kubi/data/coin/AccountType;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 345
    move-result-object v2

    .line 346
    .line 347
    .line 348
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 349
    goto :goto_9

    .line 350
    .line 351
    :cond_12
    iput-object v1, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->c:Ljava/util/List;

    .line 352
    .line 353
    sget-object v0, Lcom/kubi/transfer/v0;->a:Lcom/kubi/transfer/v0;

    .line 354
    .line 355
    new-instance v1, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    const-string v2, "\u5212\u8f6c\u8d26\u6237\u652f\u6301\u5217\u8868\uff1a"

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    iget-object v2, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    move-result-object v1

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v1}, Lcom/kubi/transfer/v0;->c(Ljava/lang/String;)V

    .line 376
    return-void
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
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "reverseFrom"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "reverseTo"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/transfer/helper/TransferAccountHelper;->a:Ljava/util/List;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    return v1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    check-cast v2, Lgf/k;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lgf/k;->a()Lcom/kubi/data/coin/AccountType;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lgf/k;->b()Ljava/util/List;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 62
    move-result v3

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    goto :goto_0

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    move-result v3

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    check-cast v3, Lcom/kubi/data/coin/AccountType;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    .line 88
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v3

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    const/4 p1, 0x1

    .line 93
    return p1

    .line 94
    :cond_4
    return v1
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
.end method

.method public final l(Ljava/util/List;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/coin/AccountType;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/kubi/data/coin/AccountType;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eqz p2, :cond_2

    .line 11
    .line 12
    new-instance p2, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    move-object v1, v0

    .line 31
    .line 32
    check-cast v1, Lcom/kubi/data/coin/AccountType;

    .line 33
    .line 34
    sget-object v2, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 35
    .line 36
    if-eq v1, v2, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_1
    sget-object p1, Lcom/kubi/data/coin/AccountType;->UNIFIED:Lcom/kubi/data/coin/AccountType;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    move-result-object p1

    .line 51
    :cond_2
    return-object p1
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
.end method
