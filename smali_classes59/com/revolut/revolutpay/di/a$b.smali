.class final Lcom/revolut/revolutpay/di/a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/di/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/revolut/revolutpay/data/repository/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/revolut/revolutpay/di/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/di/a$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/revolut/revolutpay/di/a$b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/revolut/revolutpay/di/a$b;->a:Lcom/revolut/revolutpay/di/a$b;

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
.end method


# virtual methods
.method public final a()Lcom/revolut/revolutpay/data/repository/b;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/data/repository/b;

    .line 3
    .line 4
    sget-object v1, Lcom/revolut/revolutpay/di/a;->a:Lcom/revolut/revolutpay/di/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/revolut/revolutpay/di/a;->a()Landroid/content/Context;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/data/repository/b;-><init>(Landroid/content/Context;)V

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/di/a$b;->a()Lcom/revolut/revolutpay/data/repository/b;

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
.end method
