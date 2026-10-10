.class public abstract Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;
.super Ljava/lang/Object;
.source "ProductItem.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$g;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;,
        Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u000e2\u00020\u0001:\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u001d\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u0082\u0001\t\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
        "",
        "type",
        "",
        "title",
        "",
        "<init>",
        "(ILjava/lang/String;)V",
        "getType",
        "()I",
        "getTitle",
        "()Ljava/lang/String;",
        "setTitle",
        "(Ljava/lang/String;)V",
        "Companion",
        "ContractItem",
        "IsolatedItem",
        "CrossItem",
        "FinancialItem",
        "RobotItem",
        "CopyTradingItem",
        "LeadTradingItem",
        "HeaderItem",
        "LoadMoreItem",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$ContractItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CrossItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$FinancialItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$IsolatedItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LeadTradingItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:I

.field public b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$Companion;

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
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->a:I

    iput-object p2, p0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move-object p2, p4

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->b:Ljava/lang/String;

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
.end method

.method public final b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->a:I

    .line 3
    return v0
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
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->b:Ljava/lang/String;

    .line 3
    return-void
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
.end method
