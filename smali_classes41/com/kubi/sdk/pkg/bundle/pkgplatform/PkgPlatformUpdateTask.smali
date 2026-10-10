.class public final Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;
.super Ljava/lang/Object;
.source "PkgPlatformUpdateTask.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;,
        Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 D2\u00020\u0001:\u0002E5B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JO\u0010\u001b\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u001e\u0008\u0002\u0010\u0018\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ%\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u001f\u0010\'\u001a\u00020#2\u0006\u0010!\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\'\u0010%J#\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0\u00062\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010 JW\u0010-\u001a\u00020\u00102\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020*0\u00062\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u001c\u0010\u0018\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u001b\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101J\u001b\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00101J\u001b\u00103\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00101J\u001b\u00104\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100@0?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010B\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006F"
    }
    d2 = {
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;",
        "response",
        "",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;",
        "reportedBundles",
        "Lcom/kubi/sdk/pkg/task/DownloadPriority;",
        "priority",
        "",
        "",
        "criticalBizList",
        "<init>",
        "(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;)V",
        "Lcom/kubi/sdk/pkg/task/TaskStatus;",
        "t",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "",
        "onCriticalScheduled",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "beforeNormal",
        "Lrg0/g;",
        "concurrencySemaphore",
        "u",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;",
        "deleteItems",
        "x",
        "(Ljava/util/List;)Ljava/util/List;",
        "biz",
        "versionDir",
        "",
        "p",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "reportedVersionDir",
        "n",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;",
        "updateItems",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
        "l",
        "workItems",
        "y",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "item",
        "w",
        "(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "q",
        "r",
        "s",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;",
        "c",
        "Ljava/util/List;",
        "d",
        "Lcom/kubi/sdk/pkg/task/DownloadPriority;",
        "e",
        "Ljava/util/Collection;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lkotlinx/coroutines/w;",
        "f",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "exactVersionResults",
        "g",
        "Companion",
        "Package_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 6 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,627:1\n1179#2,2:628\n1253#2,4:630\n1855#2,2:634\n1855#2:656\n1603#2,9:661\n1855#2:670\n1856#2:672\n1612#2:673\n288#2,2:674\n1856#2:679\n34#3:636\n41#3:639\n37#3:640\n30#3:642\n34#3:645\n41#3:649\n37#3:650\n30#3:652\n32#3:657\n30#3:659\n32#3:676\n30#3:678\n74#3:680\n41#3:682\n37#3:683\n30#3:685\n74#3:686\n41#3:688\n37#3:689\n30#3:691\n41#3:693\n37#3:694\n30#3:696\n32#3:702\n30#3:704\n62#4:637\n62#4:641\n62#4:646\n62#4:651\n62#4:658\n62#4:677\n62#4:684\n62#4:690\n62#4:695\n62#4:703\n28#5:638\n28#5:648\n28#5:681\n28#5:687\n28#5:692\n22#6,2:643\n22#6,2:653\n22#6,2:697\n13579#7:647\n13580#7:655\n1#8:660\n1#8:671\n361#9,3:699\n364#9,4:705\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n*L\n172#1:628,2\n172#1:630,4\n176#1:634,2\n352#1:656\n406#1:661,9\n406#1:670\n406#1:672\n406#1:673\n410#1:674,2\n352#1:679\n203#1:636\n207#1:639\n207#1:640\n207#1:642\n261#1:645\n275#1:649\n275#1:650\n275#1:652\n388#1:657\n389#1:659\n433#1:676\n434#1:678\n567#1:680\n567#1:682\n567#1:683\n567#1:685\n581#1:686\n581#1:688\n581#1:689\n581#1:691\n588#1:693\n588#1:694\n588#1:696\n338#1:702\n339#1:704\n203#1:637\n207#1:641\n261#1:646\n275#1:651\n388#1:658\n433#1:677\n567#1:684\n581#1:690\n588#1:695\n338#1:703\n207#1:638\n275#1:648\n567#1:681\n581#1:687\n588#1:692\n242#1:643,2\n299#1:653,2\n616#1:697,2\n264#1:647\n264#1:655\n406#1:671\n326#1:699,3\n326#1:705,4\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/kubi/sdk/pkg/task/DownloadPriority;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/w<",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->g:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/sdk/pkg/task/DownloadPriority;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;",
            ">;",
            "Lcom/kubi/sdk/pkg/task/DownloadPriority;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportedBundles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priority"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "criticalBizList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->b:Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;

    .line 4
    iput-object p3, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->c:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->d:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    .line 6
    iput-object p5, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->e:Ljava/util/Collection;

    .line 7
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->f:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 8
    sget-object p4, Lcom/kubi/sdk/pkg/task/DownloadPriority;->NORMAL:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p5

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;-><init>(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;)V

    return-void
.end method

.method public static synthetic a(Ljava/io/File;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->o(Ljava/io/File;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic b(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->l(Ljava/util/List;)Ljava/util/List;

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
.end method

.method public static final synthetic c(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->q(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic d(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->r(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic e(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->s(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic f(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->w(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic g(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic h(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;)Ljava/util/Collection;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->e:Ljava/util/Collection;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic i(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->b:Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic j(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->x(Ljava/util/List;)Ljava/util/List;

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
.end method

.method public static final synthetic k(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->y(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final m(Ljava/util/Map;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            ">;",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;",
            ")",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getBiz()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 13
    move-result v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v1, v2

    .line 18
    .line 19
    :goto_0
    if-nez v1, :cond_2

    .line 20
    .line 21
    :cond_1
    const-string v1, "krnbase"

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getVersion()Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-nez v3, :cond_3

    .line 28
    return-object v2

    .line 29
    .line 30
    .line 31
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getUrl()Ljava/lang/String;

    .line 32
    move-result-object v8

    .line 33
    .line 34
    if-nez v8, :cond_4

    .line 35
    return-object v2

    .line 36
    .line 37
    .line 38
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getBuildNo()J

    .line 39
    move-result-wide v4

    .line 40
    .line 41
    const-wide/16 v6, 0x0

    .line 42
    .line 43
    cmp-long v4, v4, v6

    .line 44
    .line 45
    const/16 v5, 0x2d

    .line 46
    .line 47
    if-lez v4, :cond_5

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getBuildNo()J

    .line 62
    move-result-wide v9

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const/16 v9, 0x2f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object v9

    .line 94
    .line 95
    if-nez v9, :cond_9

    .line 96
    .line 97
    move-object/from16 v10, p1

    .line 98
    .line 99
    iget-object v9, v10, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 100
    .line 101
    const-string v10, "main"

    .line 102
    .line 103
    .line 104
    invoke-static {v9, v1, v10, v3}, Lcom/kubi/sdk/pkg/bundle/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 105
    move-result v9

    .line 106
    .line 107
    const/16 v11, 0x20

    .line 108
    .line 109
    const-string v12, "pkgPlatform"

    .line 110
    .line 111
    if-eqz v9, :cond_7

    .line 112
    .line 113
    sget-object v5, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v1, v10, v3}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 117
    move-result v6

    .line 118
    .line 119
    if-nez v6, :cond_6

    .line 120
    .line 121
    sget-object v6, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->buildBase(Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 125
    move-result-object v6

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v6}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->t(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V

    .line 129
    .line 130
    sget-object v5, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 131
    .line 132
    new-instance v6, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string v7, "buildWorkItems \u57fa\u7840\u5305 HBC \u5df2\u5b58\u5728\uff0c\u8865\u5199\u8bb0\u5f55: "

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v12, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :cond_6
    move-object v1, v4

    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :cond_7
    sget-object v9, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 162
    .line 163
    new-instance v13, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    const-string v14, "buildWorkItems \u57fa\u7840\u5305\u7f3a\u5931\uff0c\u52a0\u5165\u4e0b\u8f7d: "

    .line 169
    .line 170
    .line 171
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    move-result-object v11

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v12, v11}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    sget-object v9, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->buildBase(Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 193
    move-result-object v16

    .line 194
    .line 195
    new-instance v9, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    const-string v11, "jsbundles"

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    sget-object v11, Ljava/io/File;->separator:Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    move-result-object v9

    .line 216
    .line 217
    new-instance v12, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    move-result-object v9

    .line 234
    .line 235
    new-instance v11, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getPackageSize()J

    .line 255
    move-result-wide v10

    .line 256
    .line 257
    .line 258
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 263
    move-result-wide v10

    .line 264
    .line 265
    cmp-long v6, v10, v6

    .line 266
    .line 267
    if-lez v6, :cond_8

    .line 268
    move-object v2, v5

    .line 269
    .line 270
    .line 271
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getPackageHash()Ljava/lang/String;

    .line 272
    move-result-object v10

    .line 273
    .line 274
    sget-object v11, Lcom/kubi/sdk/pkg/task/HashType;->Rsa:Lcom/kubi/sdk/pkg/task/HashType;

    .line 275
    .line 276
    new-instance v13, Lcom/kubi/sdk/pkg/task/e;

    .line 277
    const/4 v12, 0x0

    .line 278
    move-object v5, v4

    .line 279
    move-object v4, v13

    .line 280
    const/4 v13, 0x1

    .line 281
    .line 282
    const/16 v14, 0x80

    .line 283
    const/4 v15, 0x0

    .line 284
    move-object v6, v1

    .line 285
    move-object v7, v3

    .line 286
    move-object v1, v5

    .line 287
    move-object v5, v9

    .line 288
    move-object v9, v2

    .line 289
    .line 290
    .line 291
    invoke-direct/range {v4 .. v15}, Lcom/kubi/sdk/pkg/task/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/HashType;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 292
    .line 293
    new-instance v11, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x4

    .line 296
    .line 297
    move-object/from16 v12, v16

    .line 298
    .line 299
    const/16 v16, 0x0

    .line 300
    move-object v13, v4

    .line 301
    .line 302
    .line 303
    invoke-direct/range {v11 .. v16}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;-><init>(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 304
    move-object v2, v11

    .line 305
    .line 306
    .line 307
    :goto_1
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    move-object v9, v2

    .line 309
    .line 310
    :cond_9
    check-cast v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 311
    return-object v9
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
.end method

.method public static final o(Ljava/io/File;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic v(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p6, p5, 0x1

    .line 3
    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$2;->INSTANCE:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$2;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    if-eqz p6, :cond_1

    .line 12
    .line 13
    new-instance p2, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$3;

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 19
    .line 20
    if-eqz p5, :cond_2

    .line 21
    move-object p3, v0

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->u(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
.end method


# virtual methods
.method public final l(Ljava/util/List;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v4

    .line 21
    .line 22
    if-eqz v4, :cond_18

    .line 23
    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    check-cast v4, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getBiz()Ljava/lang/String;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    :goto_1
    move-object v4, v1

    .line 36
    .line 37
    move-object/from16 v20, v2

    .line 38
    .line 39
    move-object/from16 p1, v3

    .line 40
    .line 41
    goto/16 :goto_f

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getVersion()Ljava/lang/String;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getUrl()Ljava/lang/String;

    .line 52
    move-result-object v11

    .line 53
    .line 54
    if-nez v11, :cond_2

    .line 55
    goto :goto_1

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getBuildNo()J

    .line 59
    move-result-wide v7

    .line 60
    .line 61
    const-wide/16 v17, 0x0

    .line 62
    .line 63
    cmp-long v7, v7, v17

    .line 64
    .line 65
    const/16 v8, 0x2d

    .line 66
    .line 67
    if-lez v7, :cond_3

    .line 68
    .line 69
    new-instance v7, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getBuildNo()J

    .line 82
    move-result-wide v9

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    move-result-object v5

    .line 90
    :cond_3
    move-object v10, v5

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getSdkVersion()Ljava/lang/String;

    .line 94
    move-result-object v5

    .line 95
    .line 96
    const-string v7, "pkgPlatform"

    .line 97
    .line 98
    if-eqz v5, :cond_7

    .line 99
    .line 100
    .line 101
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 102
    move-result v5

    .line 103
    .line 104
    if-nez v5, :cond_4

    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_4
    sget-object v5, Lcom/kubi/sdk/pkg/util/VersionUtils;->a:Lcom/kubi/sdk/pkg/util/VersionUtils;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getSdkVersion()Ljava/lang/String;

    .line 112
    move-result-object v9

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v9}, Lcom/kubi/sdk/pkg/util/VersionUtils;->a(Ljava/lang/String;)Z

    .line 116
    move-result v9

    .line 117
    .line 118
    const-string v12, ", biz="

    .line 119
    .line 120
    if-nez v9, :cond_5

    .line 121
    .line 122
    sget-object v19, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 123
    .line 124
    new-instance v5, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    const-string v7, "buildWorkItems sdkVersion error: "

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getSdkVersion()Ljava/lang/String;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    move-result-object v21

    .line 150
    .line 151
    const/16 v23, 0x4

    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    const-string v20, "pkgPlatform"

    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    .line 160
    invoke-static/range {v19 .. v24}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 161
    goto :goto_1

    .line 162
    .line 163
    .line 164
    :cond_5
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/util/VersionUtils;->d()Ljava/lang/String;

    .line 165
    move-result-object v9

    .line 166
    .line 167
    if-eqz v9, :cond_7

    .line 168
    .line 169
    .line 170
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 171
    move-result v9

    .line 172
    .line 173
    if-nez v9, :cond_6

    .line 174
    goto :goto_2

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getSdkVersion()Ljava/lang/String;

    .line 178
    move-result-object v9

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/util/VersionUtils;->d()Ljava/lang/String;

    .line 182
    move-result-object v13

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v9, v13}, Lcom/kubi/sdk/pkg/util/VersionUtils;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    move-result v5

    .line 187
    .line 188
    if-lez v5, :cond_7

    .line 189
    .line 190
    sget-object v5, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 191
    .line 192
    new-instance v8, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    const-string v9, "buildWorkItems does not meet the minimum SDK version: "

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getSdkVersion()Ljava/lang/String;

    .line 204
    move-result-object v4

    .line 205
    .line 206
    .line 207
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    move-result-object v4

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v7, v4}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :cond_7
    :goto_2
    const-string v5, "krnbase"

    .line 225
    .line 226
    .line 227
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    move-result v5

    .line 229
    .line 230
    const-string v9, "jsbundles"

    .line 231
    const/4 v12, 0x0

    .line 232
    .line 233
    const/16 v13, 0x20

    .line 234
    .line 235
    const-string v14, "main"

    .line 236
    .line 237
    if-eqz v5, :cond_b

    .line 238
    .line 239
    iget-object v5, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 240
    .line 241
    .line 242
    invoke-static {v5, v6, v14, v10}, Lcom/kubi/sdk/pkg/bundle/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 243
    move-result v5

    .line 244
    .line 245
    const/16 v15, 0x2f

    .line 246
    .line 247
    if-eqz v5, :cond_9

    .line 248
    .line 249
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v6, v14, v10}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 253
    move-result v5

    .line 254
    .line 255
    if-nez v5, :cond_8

    .line 256
    .line 257
    sget-object v5, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->buildBase(Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 261
    move-result-object v5

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v5}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->t(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V

    .line 265
    .line 266
    sget-object v4, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 267
    .line 268
    new-instance v5, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    const-string v8, "buildWorkItems \u9876\u5c42 base HBC \u5df2\u5b58\u5728\uff0c\u8865\u5199\u8bb0\u5f55: "

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    move-result-object v5

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4, v7, v5}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    goto :goto_3

    .line 294
    .line 295
    :cond_8
    sget-object v4, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 296
    .line 297
    new-instance v5, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    const-string v8, "buildWorkItems \u9876\u5c42 base HBC \u5df2\u5b58\u5728\u4e14\u8bb0\u5f55\u5df2\u6709\uff0c\u8df3\u8fc7: "

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    move-result-object v5

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v7, v5}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    move-result-object v4

    .line 340
    .line 341
    .line 342
    invoke-interface {v2, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :cond_9
    sget-object v5, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5, v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->buildBase(Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 350
    move-result-object v20

    .line 351
    .line 352
    new-instance v5, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    move-result-object v5

    .line 371
    .line 372
    new-instance v12, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    move-result-object v5

    .line 389
    .line 390
    new-instance v9, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    move-result-object v9

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getPackageSize()J

    .line 410
    move-result-wide v21

    .line 411
    .line 412
    .line 413
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 414
    move-result-object v8

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 418
    move-result-wide v21

    .line 419
    .line 420
    cmp-long v12, v21, v17

    .line 421
    .line 422
    if-lez v12, :cond_a

    .line 423
    move-object v12, v8

    .line 424
    :goto_4
    move v8, v13

    .line 425
    goto :goto_5

    .line 426
    :cond_a
    const/4 v12, 0x0

    .line 427
    goto :goto_4

    .line 428
    .line 429
    .line 430
    :goto_5
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getPackageHash()Ljava/lang/String;

    .line 431
    move-result-object v13

    .line 432
    .line 433
    sget-object v14, Lcom/kubi/sdk/pkg/task/HashType;->Rsa:Lcom/kubi/sdk/pkg/task/HashType;

    .line 434
    .line 435
    new-instance v21, Lcom/kubi/sdk/pkg/task/e;

    .line 436
    move v4, v15

    .line 437
    const/4 v15, 0x0

    .line 438
    .line 439
    const/16 v16, 0x1

    .line 440
    .line 441
    const/16 v17, 0x80

    .line 442
    .line 443
    const/16 v18, 0x0

    .line 444
    move-object v8, v5

    .line 445
    move-object v5, v7

    .line 446
    .line 447
    move-object/from16 v7, v21

    .line 448
    .line 449
    .line 450
    invoke-direct/range {v7 .. v18}, Lcom/kubi/sdk/pkg/task/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/HashType;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 451
    .line 452
    new-instance v19, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 453
    .line 454
    const/16 v23, 0x4

    .line 455
    .line 456
    const/16 v24, 0x0

    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    .line 461
    invoke-direct/range {v19 .. v24}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;-><init>(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 462
    .line 463
    move-object/from16 v7, v19

    .line 464
    .line 465
    .line 466
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    new-instance v7, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    move-result-object v4

    .line 485
    .line 486
    new-instance v19, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 487
    .line 488
    .line 489
    invoke-direct/range {v19 .. v24}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;-><init>(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 490
    .line 491
    move-object/from16 v7, v19

    .line 492
    .line 493
    .line 494
    invoke-interface {v2, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    sget-object v4, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 497
    .line 498
    new-instance v7, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    .line 503
    const-string v8, "buildWorkItems \u9876\u5c42 base item \u52a0\u5165\u4e0b\u8f7d\u961f\u5217: "

    .line 504
    .line 505
    .line 506
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const/16 v8, 0x20

    .line 512
    .line 513
    .line 514
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    move-result-object v6

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v5, v6}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    .line 526
    goto/16 :goto_1

    .line 527
    :cond_b
    move-object v5, v7

    .line 528
    move v7, v13

    .line 529
    .line 530
    .line 531
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getBasicDeps()Ljava/util/List;

    .line 532
    move-result-object v12

    .line 533
    .line 534
    if-eqz v12, :cond_d

    .line 535
    .line 536
    new-instance v13, Ljava/util/ArrayList;

    .line 537
    .line 538
    .line 539
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 543
    move-result-object v12

    .line 544
    .line 545
    .line 546
    :cond_c
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 547
    move-result v15

    .line 548
    .line 549
    if-eqz v15, :cond_e

    .line 550
    .line 551
    .line 552
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 553
    move-result-object v15

    .line 554
    .line 555
    check-cast v15, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;

    .line 556
    .line 557
    .line 558
    invoke-static {v2, v0, v15}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->m(Ljava/util/Map;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 559
    move-result-object v15

    .line 560
    .line 561
    if-eqz v15, :cond_c

    .line 562
    .line 563
    .line 564
    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 565
    goto :goto_6

    .line 566
    .line 567
    .line 568
    :cond_d
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 569
    move-result-object v13

    .line 570
    .line 571
    .line 572
    :cond_e
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getBasicDeps()Ljava/util/List;

    .line 573
    move-result-object v12

    .line 574
    .line 575
    if-eqz v12, :cond_14

    .line 576
    .line 577
    .line 578
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 579
    move-result-object v12

    .line 580
    .line 581
    .line 582
    :cond_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 583
    move-result v15

    .line 584
    .line 585
    if-eqz v15, :cond_12

    .line 586
    .line 587
    .line 588
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 589
    move-result-object v15

    .line 590
    .line 591
    move-object/from16 v16, v15

    .line 592
    .line 593
    check-cast v16, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v16 .. v16}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getVersion()Ljava/lang/String;

    .line 597
    move-result-object v16

    .line 598
    .line 599
    if-eqz v16, :cond_11

    .line 600
    .line 601
    .line 602
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    .line 603
    move-result v16

    .line 604
    .line 605
    if-nez v16, :cond_10

    .line 606
    goto :goto_7

    .line 607
    .line 608
    :cond_10
    const/16 v16, 0x0

    .line 609
    goto :goto_8

    .line 610
    .line 611
    :cond_11
    :goto_7
    const/16 v16, 0x1

    .line 612
    .line 613
    :goto_8
    if-nez v16, :cond_f

    .line 614
    goto :goto_9

    .line 615
    :cond_12
    const/4 v15, 0x0

    .line 616
    .line 617
    :goto_9
    check-cast v15, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;

    .line 618
    .line 619
    if-eqz v15, :cond_14

    .line 620
    .line 621
    .line 622
    invoke-virtual {v15}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getBuildNo()J

    .line 623
    move-result-wide v19

    .line 624
    .line 625
    cmp-long v12, v19, v17

    .line 626
    .line 627
    if-lez v12, :cond_13

    .line 628
    .line 629
    new-instance v12, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v15}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getVersion()Ljava/lang/String;

    .line 636
    move-result-object v7

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 643
    move-object v7, v9

    .line 644
    .line 645
    .line 646
    invoke-virtual {v15}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getBuildNo()J

    .line 647
    move-result-wide v8

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    move-result-object v8

    .line 655
    goto :goto_a

    .line 656
    :cond_13
    move-object v7, v9

    .line 657
    .line 658
    .line 659
    invoke-virtual {v15}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;->getVersion()Ljava/lang/String;

    .line 660
    move-result-object v8

    .line 661
    :goto_a
    move-object v9, v8

    .line 662
    :goto_b
    move-object v8, v5

    .line 663
    goto :goto_c

    .line 664
    :cond_14
    move-object v7, v9

    .line 665
    const/4 v9, 0x0

    .line 666
    goto :goto_b

    .line 667
    .line 668
    :goto_c
    new-instance v5, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 669
    .line 670
    const/16 v15, 0x70

    .line 671
    .line 672
    const/16 v12, 0x20

    .line 673
    .line 674
    const/16 v16, 0x0

    .line 675
    .line 676
    move-object/from16 v20, v7

    .line 677
    .line 678
    const-string v7, "main"

    .line 679
    .line 680
    move-object/from16 v21, v8

    .line 681
    move-object v8, v10

    .line 682
    const/4 v10, 0x0

    .line 683
    .line 684
    move-object/from16 v22, v14

    .line 685
    move-object v14, v11

    .line 686
    const/4 v11, 0x0

    .line 687
    .line 688
    move/from16 v23, v12

    .line 689
    .line 690
    move-object/from16 v24, v13

    .line 691
    .line 692
    const-wide/16 v12, 0x0

    .line 693
    .line 694
    move-object/from16 p1, v24

    .line 695
    .line 696
    move-object/from16 v24, v1

    .line 697
    .line 698
    move-object/from16 v1, p1

    .line 699
    .line 700
    move-object/from16 p1, v22

    .line 701
    .line 702
    move-object/from16 v22, v4

    .line 703
    .line 704
    move-object/from16 v4, p1

    .line 705
    .line 706
    move-object/from16 p1, v3

    .line 707
    .line 708
    move-object/from16 v3, v20

    .line 709
    .line 710
    const/16 v19, 0x0

    .line 711
    .line 712
    move-object/from16 v20, v2

    .line 713
    .line 714
    move-object/from16 v2, v21

    .line 715
    .line 716
    .line 717
    invoke-direct/range {v5 .. v16}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 718
    move-object v10, v8

    .line 719
    move-object v11, v14

    .line 720
    .line 721
    iget-object v7, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 722
    .line 723
    .line 724
    invoke-static {v7, v6, v4, v10}, Lcom/kubi/sdk/pkg/bundle/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 725
    move-result v7

    .line 726
    .line 727
    if-eqz v7, :cond_16

    .line 728
    .line 729
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v1, v6, v4, v10}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 733
    move-result v3

    .line 734
    .line 735
    if-nez v3, :cond_15

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1, v5}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->t(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V

    .line 739
    .line 740
    sget-object v1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 741
    .line 742
    new-instance v3, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 746
    .line 747
    const-string v4, "buildWorkItems \u76ee\u6807 HBC \u5df2\u5b58\u5728\uff0c\u8865\u5199 BundleVersionManager \u8bb0\u5f55: "

    .line 748
    .line 749
    .line 750
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    const/16 v8, 0x20

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 765
    move-result-object v3

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1, v2, v3}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    goto :goto_d

    .line 770
    .line 771
    :cond_15
    const/16 v8, 0x20

    .line 772
    .line 773
    sget-object v1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 774
    .line 775
    new-instance v3, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 779
    .line 780
    const-string v4, "buildWorkItems \u76ee\u6807 HBC \u5df2\u5b58\u5728\u4e14\u8bb0\u5f55\u5df2\u6709\uff0c\u8df3\u8fc7: "

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 796
    move-result-object v3

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1, v2, v3}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 800
    .line 801
    :goto_d
    move-object/from16 v4, v24

    .line 802
    .line 803
    goto/16 :goto_f

    .line 804
    .line 805
    :cond_16
    new-instance v7, Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    move-result-object v7

    .line 824
    .line 825
    new-instance v8, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 841
    move-result-object v8

    .line 842
    .line 843
    new-instance v3, Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    const/16 v7, 0x2d

    .line 852
    .line 853
    .line 854
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    move-result-object v9

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v22 .. v22}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getPackageSize()J

    .line 865
    move-result-wide v3

    .line 866
    .line 867
    .line 868
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 869
    move-result-object v12

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 873
    move-result-wide v3

    .line 874
    .line 875
    cmp-long v3, v3, v17

    .line 876
    .line 877
    if-lez v3, :cond_17

    .line 878
    goto :goto_e

    .line 879
    .line 880
    :cond_17
    move-object/from16 v12, v19

    .line 881
    .line 882
    .line 883
    :goto_e
    invoke-virtual/range {v22 .. v22}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;->getPackageHash()Ljava/lang/String;

    .line 884
    move-result-object v13

    .line 885
    .line 886
    sget-object v14, Lcom/kubi/sdk/pkg/task/HashType;->Rsa:Lcom/kubi/sdk/pkg/task/HashType;

    .line 887
    .line 888
    new-instance v7, Lcom/kubi/sdk/pkg/task/e;

    .line 889
    const/4 v15, 0x0

    .line 890
    .line 891
    const/16 v16, 0x1

    .line 892
    .line 893
    const/16 v17, 0x80

    .line 894
    .line 895
    const/16 v18, 0x0

    .line 896
    .line 897
    .line 898
    invoke-direct/range {v7 .. v18}, Lcom/kubi/sdk/pkg/task/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/HashType;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 899
    .line 900
    new-instance v3, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 901
    .line 902
    .line 903
    invoke-direct {v3, v5, v7, v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;-><init>(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;)V

    .line 904
    .line 905
    move-object/from16 v4, v24

    .line 906
    .line 907
    .line 908
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 911
    .line 912
    new-instance v5, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 916
    .line 917
    const-string v7, "buildWorkItems biz="

    .line 918
    .line 919
    .line 920
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    const/16 v8, 0x20

    .line 926
    .line 927
    .line 928
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 932
    .line 933
    const-string v6, " \u52a0\u5165\u4e0b\u8f7d\u961f\u5217\uff0cdepItems="

    .line 934
    .line 935
    .line 936
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 940
    move-result v1

    .line 941
    .line 942
    .line 943
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 947
    move-result-object v1

    .line 948
    .line 949
    .line 950
    invoke-virtual {v3, v2, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    .line 952
    :goto_f
    move-object/from16 v3, p1

    .line 953
    move-object v1, v4

    .line 954
    .line 955
    move-object/from16 v2, v20

    .line 956
    .line 957
    goto/16 :goto_0

    .line 958
    :cond_18
    move-object v4, v1

    .line 959
    return-object v4
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
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v14, p2

    .line 1
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    invoke-virtual {v0, v14}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->r(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v15

    .line 2
    const-string v2, "pkgPlatform"

    const/4 v0, 0x0

    if-nez v15, :cond_0

    .line 3
    sget-object v4, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "handleDelete all_old \u8df3\u8fc7\u975e\u6cd5\u7248\u672c: biz="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", versionDir="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v4, v2, v3}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 6
    :cond_0
    new-instance v4, Ljava/io/File;

    iget-object v5, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 7
    invoke-static {v5}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "jsbundles"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "main"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    new-instance v6, Lcom/kubi/sdk/pkg/bundle/pkgplatform/e;

    invoke-direct {v6}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/e;-><init>()V

    invoke-virtual {v4, v6}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v4

    if-nez v4, :cond_1

    return v0

    .line 11
    :cond_1
    array-length v6, v4

    move v8, v0

    move/from16 v16, v8

    :goto_0
    if-ge v8, v6, :cond_4

    aget-object v9, v4, v8

    .line 12
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "versionDir.name"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->r(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    const-wide/16 v17, 0x0

    cmp-long v10, v12, v17

    if-gtz v10, :cond_3

    .line 14
    sget-object v10, Lcom/kubi/sdk/pkg/util/VersionUtils;->a:Lcom/kubi/sdk/pkg/util/VersionUtils;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v10, v0, v12}, Lcom/kubi/sdk/pkg/util/VersionUtils;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v10, v2

    move-object/from16 v17, v4

    move-object v13, v5

    move/from16 v19, v6

    move/from16 v21, v8

    move-object/from16 v25, v15

    move-object v15, v7

    goto/16 :goto_9

    .line 15
    :cond_3
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10, v14}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->compareBundleVersion$Package_release(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_2

    .line 16
    :goto_1
    :try_start_0
    new-instance v0, Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8

    move-object v10, v2

    :try_start_1
    new-instance v2, Lcom/kubi/sdk/pkg/bundle/BundleInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    move-object v12, v4

    :try_start_2
    const-string v4, "main"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6

    move-object v13, v5

    :try_start_3
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    move-object/from16 v17, v12

    const/16 v12, 0xf0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    move-object/from16 v24, v11

    const/4 v11, 0x0

    move-object/from16 v25, v15

    move-object/from16 v15, v20

    move-object/from16 v14, v24

    :try_start_4
    invoke-direct/range {v2 .. v13}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 17
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-static {v4}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 19
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 20
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2d

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".android.hbc"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    .line 26
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-object/from16 v13, v18

    :try_start_5
    invoke-virtual {v4, v3, v13, v5}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 27
    invoke-virtual {v4, v3, v13}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 28
    sget-object v7, Lcom/kubi/sdk/pkg/util/a;->a:Lcom/kubi/sdk/pkg/util/a;

    const-string v8, "versionDir"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v9, v23

    :try_start_6
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Lcom/kubi/sdk/pkg/util/a;->b(Ljava/io/File;)Z

    move-result v7

    .line 29
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3, v13, v8}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    sget-object v26, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 31
    const-string v27, "hbcTrace"

    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "cause=BUNDLE_DELETE, source=calcBundleDeleteAllOld, biz="

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", entry=main, version="

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    .line 34
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    const-string v8, ", path="

    .line 36
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    const-string v0, ", hbcExistedBefore="

    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    const-string v0, ", recordExistedBefore="

    .line 42
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    const-string v0, ", currentRunningVersion="

    .line 44
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    const-string v0, ", deleteResult="

    .line 46
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    const-string v0, ", reportedVersion="

    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move-object/from16 v14, p2

    :try_start_7
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v0, ", action=DELETE_OLD_VERSION"

    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const/16 v30, 0x4

    const/16 v31, 0x0

    const/16 v29, 0x0

    .line 51
    invoke-static/range {v26 .. v31}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object/from16 v0, v26

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleDelete all_old \u5220\u9664\u76ee\u5f55\u6210\u529f: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    move-object/from16 v10, v22

    .line 53
    :try_start_8
    invoke-virtual {v0, v10, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    const/16 v16, 0x1

    goto/16 :goto_9

    :catch_0
    move-exception v0

    :goto_2
    move-object/from16 v27, v0

    goto :goto_8

    :catch_1
    move-exception v0

    :goto_3
    move-object/from16 v10, v22

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 v14, p2

    goto :goto_3

    :catch_3
    move-exception v0

    move-object/from16 v14, p2

    :goto_4
    move-object/from16 v10, v22

    move-object/from16 v9, v23

    goto :goto_2

    :catch_4
    move-exception v0

    move-object/from16 v14, p2

    move-object/from16 v13, v18

    goto :goto_4

    :catch_5
    move-exception v0

    :goto_5
    move/from16 v19, v6

    move/from16 v21, v8

    move-object/from16 v17, v12

    :goto_6
    move-object/from16 v25, v15

    move-object v15, v7

    goto :goto_2

    :catch_6
    move-exception v0

    move-object v13, v5

    goto :goto_5

    :catch_7
    move-exception v0

    :goto_7
    move-object/from16 v17, v4

    move-object v13, v5

    move/from16 v19, v6

    move/from16 v21, v8

    goto :goto_6

    :catch_8
    move-exception v0

    move-object v10, v2

    goto :goto_7

    .line 54
    :goto_8
    sget-object v28, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleDelete all_old \u5220\u9664\u76ee\u5f55\u5931\u8d25: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", error="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    const/16 v32, 0x4

    const/16 v33, 0x0

    .line 56
    const-string v29, "pkgPlatform"

    const/16 v31, 0x0

    invoke-static/range {v28 .. v33}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 57
    new-instance v26, Lcom/kubi/sdk/pkg/util/PackageException;

    const/16 v31, 0x8

    const/16 v32, 0x0

    const-string v28, "pkgPlatform"

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v26 .. v32}, Lcom/kubi/sdk/pkg/util/PackageException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v26

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    :goto_9
    add-int/lit8 v8, v21, 0x1

    move-object v2, v10

    move-object v5, v13

    move-object v7, v15

    move-object/from16 v4, v17

    move/from16 v6, v19

    move-object/from16 v15, v25

    goto/16 :goto_0

    :cond_4
    return v16
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 24

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    move-object/from16 v5, p2

    .line 7
    .line 8
    iget-object v0, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v14, "jsbundles"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v15, "main"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    const/4 v4, 0x0

    .line 92
    .line 93
    :try_start_0
    new-instance v6, Ljava/io/File;

    .line 94
    .line 95
    .line 96
    invoke-direct {v6, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 100
    move-result v7

    .line 101
    .line 102
    new-instance v8, Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 103
    move-object v9, v2

    .line 104
    .line 105
    :try_start_1
    new-instance v2, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 106
    move-object v10, v4

    .line 107
    .line 108
    const-string v4, "main"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 109
    .line 110
    const/16 v12, 0xf0

    .line 111
    const/4 v13, 0x0

    .line 112
    move-object v11, v6

    .line 113
    const/4 v6, 0x0

    .line 114
    .line 115
    move/from16 v16, v7

    .line 116
    const/4 v7, 0x0

    .line 117
    .line 118
    move-object/from16 v17, v8

    .line 119
    const/4 v8, 0x0

    .line 120
    .line 121
    move-object/from16 v18, v9

    .line 122
    .line 123
    move-object/from16 v19, v10

    .line 124
    .line 125
    const-wide/16 v9, 0x0

    .line 126
    .line 127
    move-object/from16 v20, v11

    .line 128
    const/4 v11, 0x0

    .line 129
    .line 130
    move/from16 v23, v16

    .line 131
    .line 132
    move-object/from16 v21, v18

    .line 133
    .line 134
    move-object/from16 v22, v20

    .line 135
    .line 136
    move-object/from16 v16, v15

    .line 137
    .line 138
    move-object/from16 v15, v17

    .line 139
    .line 140
    .line 141
    :try_start_2
    invoke-direct/range {v2 .. v13}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    iget-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    .line 147
    move-result-object v6

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    .line 151
    move-result-object v7

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    .line 158
    invoke-static {v4}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 159
    move-result-object v4

    .line 160
    .line 161
    new-instance v8, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    move-result-object v4

    .line 178
    .line 179
    new-instance v8, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    move-result-object v4

    .line 196
    .line 197
    new-instance v8, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    new-instance v8, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    new-instance v4, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    new-instance v8, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const/16 v6, 0x2d

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    move-result-object v6

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v6, ".android.hbc"

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    move-result-object v4

    .line 269
    .line 270
    new-instance v6, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    move-result-object v0

    .line 287
    .line 288
    .line 289
    invoke-direct {v15, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 293
    move-result v0

    .line 294
    .line 295
    sget-object v2, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    .line 296
    .line 297
    move-object/from16 v4, v16

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v3, v4, v5}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 301
    move-result v6

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v3, v4}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 306
    .line 307
    const-string v8, "pkgPlatform"

    .line 308
    .line 309
    move/from16 v9, v23

    .line 310
    .line 311
    if-eqz v9, :cond_0

    .line 312
    .line 313
    :try_start_3
    sget-object v10, Lcom/kubi/sdk/pkg/util/a;->a:Lcom/kubi/sdk/pkg/util/a;

    .line 314
    .line 315
    move-object/from16 v11, v22

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10, v11}, Lcom/kubi/sdk/pkg/util/a;->b(Ljava/io/File;)Z

    .line 319
    move-result v10

    .line 320
    .line 321
    sget-object v11, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 322
    .line 323
    new-instance v12, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    const-string v13, "handleDelete \u5220\u9664\u76ee\u5f55\u6210\u529f: "

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 332
    .line 333
    move-object/from16 v13, v21

    .line 334
    .line 335
    .line 336
    :try_start_4
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    move-result-object v12

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11, v8, v12}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 347
    move-result-object v10

    .line 348
    goto :goto_1

    .line 349
    :catch_0
    move-exception v0

    .line 350
    :goto_0
    move-object v3, v0

    .line 351
    .line 352
    goto/16 :goto_2

    .line 353
    :catch_1
    move-exception v0

    .line 354
    .line 355
    move-object/from16 v13, v21

    .line 356
    goto :goto_0

    .line 357
    .line 358
    :cond_0
    move-object/from16 v13, v21

    .line 359
    const/4 v10, 0x0

    .line 360
    .line 361
    .line 362
    :goto_1
    invoke-virtual {v2, v3, v4, v5}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    if-nez v9, :cond_1

    .line 365
    .line 366
    if-nez v6, :cond_1

    .line 367
    .line 368
    .line 369
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    move-result v2

    .line 371
    .line 372
    if-eqz v2, :cond_2

    .line 373
    .line 374
    :cond_1
    sget-object v14, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 375
    .line 376
    move-object/from16 v17, v15

    .line 377
    .line 378
    const-string v15, "hbcTrace"

    .line 379
    .line 380
    new-instance v2, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    const-string v4, "cause=BUNDLE_DELETE, source=calcBundleDelete, biz="

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    const-string v4, ", entry=main, version="

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v4, ", path="

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 408
    move-result-object v4

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v4, ", dirExistedBefore="

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v4, ", hbcExistedBefore="

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v0, ", recordExistedBefore="

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v0, ", currentRunningVersion="

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    const-string v0, ", deleteResult="

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    const-string v0, ", action=DELETE_REPORTED_VERSION"

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    move-result-object v16

    .line 461
    .line 462
    const/16 v18, 0x4

    .line 463
    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    .line 469
    invoke-static/range {v14 .. v19}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 470
    .line 471
    :cond_2
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 472
    .line 473
    new-instance v2, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 477
    .line 478
    const-string v4, "handleDelete \u6e05\u9664 BundleVersionManager \u8bb0\u5f55: biz="

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    move-result-object v2

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v8, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 492
    const/4 v0, 0x1

    .line 493
    return v0

    .line 494
    :catch_2
    move-exception v0

    .line 495
    move-object v13, v9

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    :catch_3
    move-exception v0

    .line 499
    move-object v13, v2

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :goto_2
    sget-object v4, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 504
    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 509
    .line 510
    const-string v2, "handleDelete \u5220\u9664\u76ee\u5f55\u5931\u8d25: "

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v2, ", error="

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 525
    move-result-object v2

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    move-result-object v6

    .line 533
    const/4 v8, 0x4

    .line 534
    const/4 v9, 0x0

    .line 535
    .line 536
    const-string v5, "pkgPlatform"

    .line 537
    const/4 v7, 0x0

    .line 538
    .line 539
    .line 540
    invoke-static/range {v4 .. v9}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 541
    .line 542
    new-instance v2, Lcom/kubi/sdk/pkg/util/PackageException;

    .line 543
    .line 544
    const/16 v7, 0x8

    .line 545
    const/4 v8, 0x0

    .line 546
    .line 547
    const-string v4, "pkgPlatform"

    .line 548
    const/4 v5, 0x0

    .line 549
    const/4 v6, 0x0

    .line 550
    .line 551
    .line 552
    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/pkg/util/PackageException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 553
    const/4 v0, 0x2

    .line 554
    const/4 v10, 0x0

    .line 555
    .line 556
    .line 557
    invoke-static {v2, v10, v0, v10}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 558
    const/4 v0, 0x0

    .line 559
    return v0
.end method

.method public final q(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lkotlinx/coroutines/w;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_2

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    return-object p2

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    new-instance p2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->c()Lcom/kubi/sdk/pkg/task/e;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/e;->a()Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const/16 v2, 0x5f

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->c()Lcom/kubi/sdk/pkg/task/e;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/e;->b()Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object p2

    .line 100
    const/4 v2, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v4, v2}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    iget-object v5, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object v5

    .line 111
    .line 112
    check-cast v5, Lkotlinx/coroutines/w;

    .line 113
    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    sget-object p1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 117
    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    const-string v3, "startUpdate \u590d\u7528\u540c\u7248\u672c\u4e0b\u8f7d\u7ed3\u679c: key="

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    const-string v2, "pkgPlatform"

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2, p2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    iput v4, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->label:I

    .line 141
    .line 142
    .line 143
    invoke-interface {v5, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    if-ne p1, v1, :cond_4

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    return-object p1

    .line 149
    .line 150
    :cond_5
    iput-object v2, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->L$0:Ljava/lang/Object;

    .line 151
    .line 152
    iput v3, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstall$1;->label:I

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1, v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->r(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    if-ne p2, v1, :cond_6

    .line 159
    :goto_1
    return-object v1

    .line 160
    :cond_6
    move-object p1, v2

    .line 161
    .line 162
    :goto_2
    check-cast p2, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 163
    .line 164
    .line 165
    invoke-interface {p1, p2}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 166
    return-object p2
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
.end method

.method public final r(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-wide v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->J$0:J

    .line 40
    .line 41
    iget-object p1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    move-result-wide v4

    .line 67
    .line 68
    iput-object p0, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object p1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    iput-wide v4, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->J$0:J

    .line 73
    .line 74
    iput v3, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnce$1;->label:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->s(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    if-ne p2, v1, :cond_3

    .line 81
    return-object v1

    .line 82
    :cond_3
    move-object v0, p0

    .line 83
    move-wide v1, v4

    .line 84
    .line 85
    :goto_1
    check-cast p2, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 86
    .line 87
    iget-object v0, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->d:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    .line 88
    .line 89
    sget-object v3, Lcom/kubi/sdk/pkg/task/DownloadPriority;->VERY_HIGH:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    .line 90
    .line 91
    if-eq v0, v3, :cond_7

    .line 92
    .line 93
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/p;->a:Lcom/kubi/sdk/pkg/bundle/p;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    .line 97
    move-result v5

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    move-result-wide v6

    .line 102
    sub-long/2addr v6, v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    .line 110
    move-result-object v8

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    .line 114
    move-result v0

    .line 115
    const/4 v1, 0x0

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 125
    move-result-object v0

    .line 126
    move-object v9, v0

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    move-object v9, v1

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    .line 138
    move-result-object v1

    .line 139
    :cond_5
    move-object v11, v1

    .line 140
    .line 141
    new-instance v0, Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBundleUrl()Ljava/lang/String;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    if-nez p1, :cond_6

    .line 155
    .line 156
    const-string p1, ""

    .line 157
    .line 158
    :cond_6
    const-string v1, "url"

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    .line 163
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 167
    move-result-object v12

    .line 168
    const/4 v10, 0x2

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v4 .. v12}, Lcom/kubi/sdk/pkg/bundle/p;->a(ZJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 172
    :cond_7
    return-object p2
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
.end method

.method public final s(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, ", hbcLength="

    const-string v3, ", hbcIsFile="

    const-string v4, ", hbcExists="

    const-string v5, ", versionDirExists="

    const-string v6, ", path="

    const-string v7, ", resultCode="

    const-string v8, ", version="

    instance-of v9, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;

    if-eqz v9, :cond_0

    move-object v9, v0

    check-cast v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;

    iget v10, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->label:I

    const/high16 v11, -0x80000000

    and-int v12, v10, v11

    if-eqz v12, :cond_0

    sub-int/2addr v10, v11

    iput v10, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;

    invoke-direct {v9, v1, v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v10

    .line 1
    iget v11, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->label:I

    const-string v12, "pkgPlatform"

    const-string v14, ".android.hbc"

    const-string v13, "jsbundles"

    const/4 v15, 0x1

    if-eqz v11, :cond_2

    if-ne v11, v15, :cond_1

    iget-object v10, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    iget-object v9, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object v3, v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    iget-object v11, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 3
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v11

    invoke-virtual/range {v17 .. v17}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v17, v2

    .line 4
    invoke-static/range {v18 .. v18}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v3

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x2d

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->t(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V

    .line 12
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startUpdate \u540c\u7248\u672c\u5df2\u5b89\u88c5\uff0c\u8df3\u8fc7\u4e0b\u8f7d: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {v0, v12, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5305\u7ba1\u7406\u5e73\u53f0\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u5df2\u5b89\u88c5"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x4b1

    .line 17
    invoke-virtual {v0, v3, v2}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->result(ILjava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;

    move-result-object v0

    return-object v0

    .line 18
    :cond_3
    sget-object v0, Lcom/kubi/sdk/pkg/task/WorkPool;->a:Lcom/kubi/sdk/pkg/task/WorkPool;

    iget-object v2, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->c()Lcom/kubi/sdk/pkg/task/e;

    move-result-object v3

    iget-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->d:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    iput-object v1, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->L$0:Ljava/lang/Object;

    move-object/from16 v11, p1

    iput-object v11, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->L$1:Ljava/lang/Object;

    const/4 v15, 0x1

    iput v15, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;->label:I

    invoke-virtual {v0, v2, v3, v4, v9}, Lcom/kubi/sdk/pkg/task/WorkPool;->f(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/e;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_4

    return-object v10

    :cond_4
    move-object v9, v1

    move-object v10, v11

    .line 19
    :goto_1
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 20
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 21
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v2

    iget-object v3, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 22
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-static {v3}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 24
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    move-object/from16 p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x2d

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->t(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V

    .line 31
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startUpdate \u5b89\u88c5\u6210\u529f: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-virtual {v0, v12, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 34
    :cond_5
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    iget-object v2, v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->a:Landroid/content/Context;

    .line 35
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v2}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 37
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x2d

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 43
    sget-object v11, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 44
    const-string v12, "saveBundle"

    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "postDeploy hbc missing: source=pkgPlatform, name="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v4

    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    const/4 v15, 0x1

    if-ne v4, v15, :cond_6

    const/4 v15, 0x1

    goto :goto_2

    :cond_6
    const/4 v15, 0x0

    .line 51
    :goto_2
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v4, v19

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v13

    .line 53
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v13, v18

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v14

    .line 55
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v14, v17

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p2, v10

    .line 56
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v9

    .line 57
    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v9, v14

    const/4 v14, 0x0

    move-object/from16 v20, v13

    move-object v13, v3

    move-object/from16 v3, v20

    .line 58
    invoke-static/range {v11 .. v16}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 59
    const-string v12, "hbcTrace"

    .line 60
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "cause=POST_DEPLOY_HBC_MISSING, source=pkgPlatform, name="

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v13

    invoke-virtual {v13}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v8

    .line 62
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v7

    .line 64
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v15, 0x1

    if-ne v0, v15, :cond_7

    goto :goto_3

    :cond_7
    const/4 v15, 0x0

    .line 66
    :goto_3
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    .line 68
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    .line 70
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    .line 72
    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    const-string v0, ", action=REJECT_LOCAL_RECORD"

    .line 74
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    .line 75
    invoke-static/range {v11 .. v16}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 76
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    .line 77
    const-string v2, "\u5305\u7ba1\u7406\u5e73\u53f0\uff1a\u89e3\u538b\u540e\u672a\u627e\u5230 bundle \u6587\u4ef6"

    const/16 v3, 0x57c

    .line 78
    invoke-virtual {v0, v3, v2}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->result(ILjava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :cond_8
    move-object/from16 p1, v0

    return-object p1

    .line 79
    :goto_4
    new-instance v2, Lcom/kubi/sdk/pkg/util/PackageException;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v4, "pkgPlatform"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/pkg/util/PackageException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v4, v0, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 80
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5305\u7ba1\u7406\u5e73\u53f0\u4e0b\u8f7d\u5f02\u5e38: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x5dd

    invoke-virtual {v0, v3, v2}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->result(ILjava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;

    move-result-object v0

    goto :goto_5

    .line 81
    :catch_1
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    const/16 v2, 0x517

    const-string v3, "\u5305\u7ba1\u7406\u5e73\u53f0\u4e0b\u8f7d\u88ab\u53d6\u6d88"

    invoke-virtual {v0, v2, v3}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->result(ILjava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;

    move-result-object v0

    :goto_5
    return-object v0
.end method

.method public t(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v5, 0x7

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v4, p1

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v6}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->v(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final u(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrg0/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lrg0/g;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$4;

    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v3, p1

    .line 10
    move-object v4, p2

    .line 11
    move-object v5, p3

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeStartup$4;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p4}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method public final w(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    instance-of v1, v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;

    .line 10
    .line 11
    iget v2, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->label:I

    .line 12
    .line 13
    const/high16 v3, -0x80000000

    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    sub-int/2addr v2, v3

    .line 19
    .line 20
    iput v2, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->label:I

    .line 21
    .line 22
    move-object/from16 v2, p0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    :goto_0
    iget-object v0, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    iget v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->label:I

    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x1

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    return-object v0

    .line 51
    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw v0

    .line 59
    .line 60
    :cond_2
    iget-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$3:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 63
    .line 64
    iget-object v7, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Ljava/util/Iterator;

    .line 67
    .line 68
    iget-object v8, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 71
    .line 72
    iget-object v9, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    goto :goto_2

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->b()Ljava/util/List;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    move-result-object v0

    .line 90
    move-object v7, v0

    .line 91
    move-object v9, v2

    .line 92
    .line 93
    move-object/from16 v0, p1

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    move-result v4

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    check-cast v4, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;

    .line 106
    .line 107
    iput-object v9, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v0, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v7, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$2:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    iput v6, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->label:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v4, v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->q(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    move-result-object v8

    .line 120
    .line 121
    if-ne v8, v3, :cond_4

    .line 122
    goto :goto_3

    .line 123
    .line 124
    :cond_4
    move-object/from16 v17, v8

    .line 125
    move-object v8, v0

    .line 126
    .line 127
    move-object/from16 v0, v17

    .line 128
    .line 129
    :goto_2
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    .line 133
    move-result v10

    .line 134
    .line 135
    if-nez v10, :cond_5

    .line 136
    .line 137
    sget-object v11, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    const-string v3, "startUpdate dep \u4e0b\u8f7d\u5931\u8d25\uff0c\u8df3\u8fc7 "

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getName()Ljava/lang/String;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const/16 v3, 0x20

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 167
    move-result-object v3

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 171
    move-result-object v3

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v3, ": dep="

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;->a()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 183
    move-result-object v3

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v3, " code="

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    .line 199
    move-result v3

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    move-result-object v13

    .line 207
    const/4 v15, 0x4

    .line 208
    .line 209
    const/16 v16, 0x0

    .line 210
    .line 211
    const-string v12, "pkgPlatform"

    .line 212
    const/4 v14, 0x0

    .line 213
    .line 214
    .line 215
    invoke-static/range {v11 .. v16}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 216
    return-object v0

    .line 217
    :cond_5
    move-object v0, v8

    .line 218
    goto :goto_1

    .line 219
    :cond_6
    const/4 v4, 0x0

    .line 220
    .line 221
    iput-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$0:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$1:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$2:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v4, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->L$3:Ljava/lang/Object;

    .line 228
    .line 229
    iput v5, v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$executeWorkItem$1;->label:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9, v0, v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->q(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    if-ne v0, v3, :cond_7

    .line 236
    :goto_3
    return-object v3

    .line 237
    :cond_7
    return-object v0
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
.end method

.method public final x(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_a

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->c:Ljava/util/List;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 27
    move-result v2

    .line 28
    .line 29
    const/16 v3, 0x10

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 33
    move-result v2

    .line 34
    .line 35
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    move-result v2

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    check-cast v2, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;->getBiz()Ljava/lang/String;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;->getBuildNo()Ljava/lang/Long;

    .line 62
    move-result-object v5

    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 70
    move-result-wide v8

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-wide v8, v6

    .line 73
    .line 74
    :goto_1
    cmp-long v5, v8, v6

    .line 75
    .line 76
    if-lez v5, :cond_2

    .line 77
    .line 78
    new-instance v5, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;->getVersion()Ljava/lang/String;

    .line 85
    move-result-object v6

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const/16 v6, 0x2d

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;->getBuildNo()Ljava/lang/Long;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v2

    .line 105
    goto :goto_2

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;->getVersion()Ljava/lang/String;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    .line 124
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result v1

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    check-cast v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    const-string v4, "krnbase"

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    move-result v2

    .line 152
    .line 153
    if-eqz v2, :cond_5

    .line 154
    .line 155
    sget-object v2, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 156
    .line 157
    new-instance v4, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    const-string v5, "handleDelete \u8df3\u8fc7 krnbase \u56de\u6eda\u5220\u9664\uff08\u670d\u52a1\u7aef\u8bbe\u8ba1\u95ee\u9898\uff0c\u4e34\u65f6\u5c4f\u853d\uff09: biz="

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 169
    move-result-object v1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    const-string v4, "pkgPlatform"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v4, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    goto :goto_3

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    .line 189
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    check-cast v2, Ljava/lang/String;

    .line 193
    .line 194
    if-nez v2, :cond_6

    .line 195
    goto :goto_3

    .line 196
    .line 197
    .line 198
    :cond_6
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getDeleteType()Ljava/lang/String;

    .line 199
    move-result-object v4

    .line 200
    .line 201
    if-eqz v4, :cond_7

    .line 202
    .line 203
    .line 204
    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    move-result-object v4

    .line 210
    goto :goto_4

    .line 211
    :cond_7
    const/4 v4, 0x0

    .line 212
    .line 213
    :goto_4
    const-string v5, "all_old"

    .line 214
    .line 215
    .line 216
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    move-result v4

    .line 218
    .line 219
    if-eqz v4, :cond_8

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v4, v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->n(Ljava/lang/String;Ljava/lang/String;)Z

    .line 227
    move-result v2

    .line 228
    goto :goto_5

    .line 229
    .line 230
    .line 231
    :cond_8
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 232
    move-result-object v4

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v4, v2}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;->p(Ljava/lang/String;Ljava/lang/String;)Z

    .line 236
    move-result v2

    .line 237
    .line 238
    :goto_5
    if-eqz v2, :cond_4

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;->getBiz()Ljava/lang/String;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    .line 245
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    goto :goto_3

    .line 247
    :cond_9
    return-object v0

    .line 248
    .line 249
    .line 250
    :cond_a
    :goto_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 251
    move-result-object p1

    .line 252
    return-object p1
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
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
.end method

.method public final y(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lrg0/g;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2;

    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v4, p2

    .line 11
    move-object v5, p3

    .line 12
    move-object v6, p4

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v1 .. v7}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2;-><init>(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, p5}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method
