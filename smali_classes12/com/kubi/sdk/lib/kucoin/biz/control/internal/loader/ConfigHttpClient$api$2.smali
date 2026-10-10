.class final Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ConfigHttpClient.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;->INSTANCE:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;

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
.method public final invoke()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;
    .locals 2

    .line 1
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient$api$2;->invoke()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;

    move-result-object v0

    return-object v0
.end method
