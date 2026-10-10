.class public interface abstract Lcom/tencent/bugly/common/network/INetworkStateListener;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/network/INetworkStateListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/tencent/bugly/common/network/INetworkStateListener;",
        "",
        "onNetworkStateChanged",
        "",
        "state",
        "",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/bugly/common/network/INetworkStateListener$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DISCONNECTED:I = 0x3

.field public static final MOBILE:I = 0x2

.field public static final WIFI:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/network/INetworkStateListener$Companion;->$$INSTANCE:Lcom/tencent/bugly/common/network/INetworkStateListener$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/tencent/bugly/common/network/INetworkStateListener;->Companion:Lcom/tencent/bugly/common/network/INetworkStateListener$Companion;

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
.method public abstract onNetworkStateChanged(I)V
.end method
