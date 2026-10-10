.class public final Lshark/LeakingObjectFinder$Companion;
.super Ljava/lang/Object;
.source "LeakingObjectFinder.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/LeakingObjectFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u001a\u0008\u0004\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0086\n\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lshark/LeakingObjectFinder$Companion;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Lshark/i;",
        "",
        "",
        "block",
        "Lshark/LeakingObjectFinder;",
        "invoke",
        "(Lkotlin/jvm/functions/Function1;)Lshark/LeakingObjectFinder;",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final synthetic a:Lshark/LeakingObjectFinder$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/LeakingObjectFinder$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/LeakingObjectFinder$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/LeakingObjectFinder$Companion;->a:Lshark/LeakingObjectFinder$Companion;

    .line 8
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
.end method


# virtual methods
.method public final invoke(Lkotlin/jvm/functions/Function1;)Lshark/LeakingObjectFinder;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lshark/i;",
            "+",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lshark/LeakingObjectFinder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/LeakingObjectFinder$Companion$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lshark/LeakingObjectFinder$Companion$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 6
    return-object v0
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
.end method
