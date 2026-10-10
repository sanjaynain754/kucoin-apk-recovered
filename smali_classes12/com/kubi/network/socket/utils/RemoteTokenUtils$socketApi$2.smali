.class final Lcom/kubi/network/socket/utils/RemoteTokenUtils$socketApi$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RemoteTokenUtils.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/network/socket/utils/RemoteTokenUtils;-><init>(Lokhttp3/OkHttpClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/kubi/network/socket/utils/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/kubi/network/socket/utils/e;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()Lcom/kubi/network/socket/utils/e;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/network/socket/utils/RemoteTokenUtils;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/utils/RemoteTokenUtils;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/network/socket/utils/RemoteTokenUtils$socketApi$2;->this$0:Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final invoke()Lcom/kubi/network/socket/utils/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kubi/network/socket/utils/RemoteTokenUtils$socketApi$2;->this$0:Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    invoke-static {v0}, Lcom/kubi/network/socket/utils/RemoteTokenUtils;->a(Lcom/kubi/network/socket/utils/RemoteTokenUtils;)Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {v0}, Lmr/a;->h(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Lcom/kubi/network/socket/utils/e;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kubi/network/socket/utils/e;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/kubi/network/socket/utils/RemoteTokenUtils$socketApi$2;->invoke()Lcom/kubi/network/socket/utils/e;

    move-result-object v0

    return-object v0
.end method
