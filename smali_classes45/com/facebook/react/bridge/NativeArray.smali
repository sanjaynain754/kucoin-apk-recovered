.class public abstract Lcom/facebook/react/bridge/NativeArray;
.super Lcom/facebook/jni/HybridClassBase;
.source "NativeArray.kt"

# interfaces
.implements Lcom/facebook/react/bridge/NativeArrayInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/NativeArray$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\'\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096 \u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/facebook/react/bridge/NativeArray;",
        "Lcom/facebook/jni/HybridClassBase;",
        "Lcom/facebook/react/bridge/NativeArrayInterface;",
        "<init>",
        "()V",
        "toString",
        "",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lt6/a;
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/bridge/NativeArray$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/bridge/NativeArray$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/NativeArray$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/bridge/NativeArray;->Companion:Lcom/facebook/react/bridge/NativeArray$Companion;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/facebook/react/bridge/ReactBridge;->staticInit()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/jni/HybridClassBase;-><init>()V

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
.end method


# virtual methods
.method public native toString()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
