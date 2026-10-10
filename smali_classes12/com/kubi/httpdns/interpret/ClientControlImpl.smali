.class public final Lcom/kubi/httpdns/interpret/ClientControlImpl;
.super Ljava/lang/Object;
.source "ClientControlImpl.kt"

# interfaces
.implements Lek/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;,
        Lcom/kubi/httpdns/interpret/ClientControlImpl$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lek/b<",
        "Lek/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/httpdns/interpret/ClientControlImpl;",
        "Lek/b;",
        "Lek/c;",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "config",
        "<init>",
        "(Lcom/kubi/httpdns/HttpDnsConfig;)V",
        "d",
        "()Lek/c;",
        "",
        "b",
        "()V",
        "c",
        "a",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;",
        "Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;",
        "currentStatus",
        "Lek/h;",
        "Lek/h;",
        "normalCategory",
        "Lek/a;",
        "Lek/a;",
        "gloomyCategory",
        "Status",
        "httpdns_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/kubi/httpdns/HttpDnsConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lek/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lek/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/httpdns/HttpDnsConfig;)V
    .locals 2
    .param p1    # Lcom/kubi/httpdns/HttpDnsConfig;
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
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;->NORMAL:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 15
    .line 16
    new-instance v0, Lek/h;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1, p0}, Lek/h;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->c:Lek/h;

    .line 22
    .line 23
    new-instance v1, Lek/a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p1, v0}, Lek/a;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/h;)V

    .line 27
    .line 28
    iput-object v1, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->d:Lek/a;

    .line 29
    return-void
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
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/httpdns/interpret/ClientControlImpl;->d()Lek/c;

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
.end method

.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/httpdns/interpret/ClientControlImpl$a;->$EnumSwitchMapping$0:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;->GLOOMY:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;->PRE_GLOOMY:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 25
    .line 26
    :goto_0
    iput-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->d:Lek/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lek/a;->b()V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;->NORMAL:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 10
    return-void
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

.method public d()Lek/c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->b:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;->GLOOMY:Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->d:Lek/a;

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/httpdns/interpret/ClientControlImpl;->c:Lek/h;

    .line 12
    return-object v0
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
