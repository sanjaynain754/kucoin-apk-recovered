.class public final Lcom/jumio/liveness/DaClient2;
.super Ljava/lang/Object;
.source "DaClient2.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/liveness/DaClient2$Companion;,
        Lcom/jumio/liveness/DaClient2$Config;,
        Lcom/jumio/liveness/DaClient2$Event;,
        Lcom/jumio/liveness/DaClient2$EventHandler;,
        Lcom/jumio/liveness/DaClient2$EventView;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 -2\u00060\u0001j\u0002`\u0002:\u0005+,-./B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0008H\u0086 J\t\u0010\t\u001a\u00020\u0008H\u0086 J\t\u0010\n\u001a\u00020\u000bH\u0086 J\u0013\u0010\u000c\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0011H\u0086 J\u0011\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0004H\u0086 J@\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bH\u0086 \u00a2\u0006\u0002\u0010\u001fJP\u0010 \u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bH\u0086 \u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020&J \u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J8\u0010 \u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u0019H\u0007J\t\u0010(\u001a\u00020\u0008H\u0096 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u00060"
    }
    d2 = {
        "Lcom/jumio/liveness/DaClient2;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "ptr",
        "",
        "<init>",
        "(J)V",
        "start",
        "",
        "stop",
        "isBusy",
        "",
        "setEventHandler",
        "eventHandler",
        "Lcom/jumio/liveness/DaClient2$EventHandler;",
        "sendEvent",
        "event",
        "Lcom/jumio/liveness/DaClient2$Event;",
        "sendNativeEvent",
        "nativeEventPtr",
        "sendFrame",
        "timestamp",
        "image",
        "Landroid/media/Image;",
        "rotation",
        "",
        "attributes",
        "",
        "Lkotlin/Pair;",
        "",
        "",
        "(JLandroid/media/Image;I[Lkotlin/Pair;)V",
        "sendFrameNV21",
        "",
        "width",
        "height",
        "(J[BIII[Lkotlin/Pair;)V",
        "sendSensorEvent",
        "Landroid/hardware/SensorEvent;",
        "iso",
        "close",
        "isClosed",
        "()Z",
        "EventHandler",
        "Config",
        "Companion",
        "EventView",
        "Event",
        "dasdk_withoutAssetsRelease"
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
        "SMAP\nDaClient2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DaClient2.kt\ncom/jumio/liveness/DaClient2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/liveness/DaClient2$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "DaClient2"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final ptr:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/liveness/DaClient2$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/liveness/DaClient2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/liveness/DaClient2;->Companion:Lcom/jumio/liveness/DaClient2$Companion;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/jumio/liveness/DaClient2$Companion;->access$loadType(Lcom/jumio/liveness/DaClient2$Companion;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/jumio/liveness/DaClient2;->ptr:J

    .line 6
    return-void
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
.end method

.method public static final synthetic access$loadType()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/jumio/liveness/DaClient2;->loadType()V

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
.end method

.method public static final native create(Lcom/jumio/liveness/DaClient2$Config;)Lcom/jumio/liveness/DaClient2;
    .param p0    # Lcom/jumio/liveness/DaClient2$Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method private static final native loadType()V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method


# virtual methods
.method public native close()V
.end method

.method public final native isBusy()Z
.end method

.method public final isClosed()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/liveness/DaClient2;->ptr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final native sendEvent(Lcom/jumio/liveness/DaClient2$Event;)V
    .param p1    # Lcom/jumio/liveness/DaClient2$Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final sendFrame(JLandroid/media/Image;I)V
    .locals 7
    .param p3    # Landroid/media/Image;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the method that sends attributes instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "sendFrame(timestamp, image, rotation, emptyArray())"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    new-array v6, v0, [Lkotlin/Pair;

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/jumio/liveness/DaClient2;->sendFrame(JLandroid/media/Image;I[Lkotlin/Pair;)V

    return-void
.end method

.method public final native sendFrame(JLandroid/media/Image;I[Lkotlin/Pair;)V
    .param p3    # Landroid/media/Image;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # [Lkotlin/Pair;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/media/Image;",
            "I[",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public final sendFrameNV21(J[BIIII)V
    .locals 8
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the method that sends attributes instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "sendFrameNV21(timestamp, image, width, height, rotation, arrayOf(\"iso\" to iso.toString()))"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "iso"

    invoke-static {p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p7

    invoke-static {v0, p7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p7

    filled-new-array {p7}, [Lkotlin/Pair;

    move-result-object v7

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/jumio/liveness/DaClient2;->sendFrameNV21(J[BIII[Lkotlin/Pair;)V

    return-void
.end method

.method public final native sendFrameNV21(J[BIII[Lkotlin/Pair;)V
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [Lkotlin/Pair;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[BIII[",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public final native sendNativeEvent(J)V
.end method

.method public final sendSensorEvent(JLandroid/hardware/SensorEvent;)V
    .locals 1
    .param p3    # Landroid/hardware/SensorEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p3, p1, p2}, Lcom/jumio/liveness/HelpersKt;->toDaClient2Event(Landroid/hardware/SensorEvent;J)Lcom/jumio/liveness/DaClient2$Event;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/jumio/liveness/DaClient2;->sendEvent(Lcom/jumio/liveness/DaClient2$Event;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string p2, "Unsupported sensor event: "

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget-object p2, p3, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/hardware/Sensor;->getStringType()Ljava/lang/String;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    const-string p2, "DaClient2"

    .line 41
    .line 42
    .line 43
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    return-void
    .line 45
    .line 46
    .line 47
.end method

.method public final native setEventHandler(Lcom/jumio/liveness/DaClient2$EventHandler;)V
    .param p1    # Lcom/jumio/liveness/DaClient2$EventHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public final native start()V
.end method

.method public final native stop()V
.end method
