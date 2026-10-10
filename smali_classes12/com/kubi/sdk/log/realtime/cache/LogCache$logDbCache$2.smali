.class final Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;
.super Lkotlin/jvm/internal/Lambda;
.source "LogCache.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/log/realtime/cache/LogCache;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;->INSTANCE:Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;

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

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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


# virtual methods
.method public final invoke()Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;->a:Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy$Companion;

    invoke-virtual {v0}, Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy$Companion;->getInstance()Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/cache/LogCache$logDbCache$2;->invoke()Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;

    move-result-object v0

    return-object v0
.end method
