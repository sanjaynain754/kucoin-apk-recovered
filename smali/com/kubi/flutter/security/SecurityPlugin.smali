.class public final Lcom/kubi/flutter/security/SecurityPlugin;
.super Ljava/lang/Object;
.source "SecurityPlugin.kt"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/security/SecurityPlugin$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/flutter/security/SecurityPlugin;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "<init>",
        "()V",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "binding",
        "",
        "onAttachedToEngine",
        "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V",
        "onDetachedFromEngine",
        "Lcom/kubi/flutter/security/channel/SecurityChannel;",
        "b",
        "Lcom/kubi/flutter/security/channel/SecurityChannel;",
        "channel",
        "",
        "Lcom/kubi/flutter/security/channel/SecurityClient;",
        "c",
        "Ljava/util/List;",
        "clients",
        "d",
        "Companion",
        "component_security_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSecurityPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityPlugin.kt\ncom/kubi/flutter/security/SecurityPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1863#2,2:47\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 SecurityPlugin.kt\ncom/kubi/flutter/security/SecurityPlugin\n*L\n31#1:47,2\n36#1:49,2\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/kubi/flutter/security/SecurityPlugin$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lcom/kubi/flutter/security/channel/SecurityChannel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/flutter/security/channel/SecurityClient;",
            ">;"
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
    new-instance v0, Lcom/kubi/flutter/security/SecurityPlugin$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/security/SecurityPlugin$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/security/SecurityPlugin;->d:Lcom/kubi/flutter/security/SecurityPlugin$Companion;

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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/flutter/security/channel/SecurityChannel;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/flutter/security/channel/SecurityChannel;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/flutter/security/SecurityPlugin;->b:Lcom/kubi/flutter/security/channel/SecurityChannel;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    new-instance v2, Lcom/kubi/flutter/security/keychain/KeyChainClient;

    .line 18
    .line 19
    new-instance v3, Lcom/kubi/flutter/security/channel/a;

    .line 20
    .line 21
    const-string v4, "keychain"

    .line 22
    .line 23
    .line 24
    invoke-direct {v3, v4, v0}, Lcom/kubi/flutter/security/channel/a;-><init>(Ljava/lang/String;Lcom/kubi/flutter/security/channel/SecurityChannel;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3}, Lcom/kubi/flutter/security/keychain/KeyChainClient;-><init>(Lcom/kubi/flutter/security/channel/a;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    new-instance v2, Llg/a;

    .line 33
    .line 34
    new-instance v3, Lcom/kubi/flutter/security/channel/a;

    .line 35
    .line 36
    const-string v4, "cipher"

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v4, v0}, Lcom/kubi/flutter/security/channel/a;-><init>(Ljava/lang/String;Lcom/kubi/flutter/security/channel/SecurityChannel;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3}, Llg/a;-><init>(Lcom/kubi/flutter/security/channel/a;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    new-instance v2, Lkg/a;

    .line 48
    .line 49
    new-instance v3, Lcom/kubi/flutter/security/channel/a;

    .line 50
    .line 51
    const-string v4, "biometric"

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v4, v0}, Lcom/kubi/flutter/security/channel/a;-><init>(Ljava/lang/String;Lcom/kubi/flutter/security/channel/SecurityChannel;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v3}, Lkg/a;-><init>(Lcom/kubi/flutter/security/channel/a;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    new-instance v2, Ljg/a;

    .line 63
    .line 64
    new-instance v3, Lcom/kubi/flutter/security/channel/a;

    .line 65
    .line 66
    const-string v4, "app_info"

    .line 67
    .line 68
    .line 69
    invoke-direct {v3, v4, v0}, Lcom/kubi/flutter/security/channel/a;-><init>(Ljava/lang/String;Lcom/kubi/flutter/security/channel/SecurityChannel;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v3}, Ljg/a;-><init>(Lcom/kubi/flutter/security/channel/a;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    iput-object v1, p0, Lcom/kubi/flutter/security/SecurityPlugin;->c:Ljava/util/List;

    .line 78
    return-void
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
.end method


# virtual methods
.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "binding"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/security/SecurityPlugin;->b:Lcom/kubi/flutter/security/channel/SecurityChannel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/security/channel/SecurityChannel;->b(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/flutter/security/SecurityPlugin;->c:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/kubi/flutter/security/channel/SecurityClient;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lcom/kubi/flutter/security/channel/SecurityClient;->c(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "binding"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/security/SecurityPlugin;->b:Lcom/kubi/flutter/security/channel/SecurityChannel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/security/channel/SecurityChannel;->c(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/flutter/security/SecurityPlugin;->c:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/kubi/flutter/security/channel/SecurityClient;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lcom/kubi/flutter/security/channel/SecurityClient;->d(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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
.end method
