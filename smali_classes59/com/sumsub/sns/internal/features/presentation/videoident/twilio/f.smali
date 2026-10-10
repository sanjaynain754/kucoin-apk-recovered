.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/twilio/video/VideoCapturer;


# instance fields
.field public a:Lcom/twilio/video/CameraCapturer;

.field public b:Lcom/twilio/video/Camera2Capturer;

.field public c:Lcom/twilio/video/VideoCapturer;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public h:Landroid/hardware/camera2/CameraManager;

.field public final i:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->d:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->e:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->f:Ljava/util/HashMap;

    .line 25
    .line 26
    new-instance v0, Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->g:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/c;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/c;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->i:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/c;

    .line 39
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;Landroid/hardware/camera2/CameraManager;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 7

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 41
    :try_start_0
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->h:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v4, v3}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v4, :cond_1

    const/16 v5, 0x22

    .line 43
    invoke-virtual {v4, v5}, Landroid/hardware/camera2/params/StreamConfigurationMap;->isOutputSupportedFor(I)Z

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v2

    .line 44
    :goto_1
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_COLOR_FILTER_ARRANGEMENT:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 45
    invoke-virtual {v3, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 46
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v5, v6, :cond_3

    if-eqz v3, :cond_3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x5

    if-eq v5, v6, :cond_2

    .line 48
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v5, 0x6

    if-ne v3, v5, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    if-eqz v4, :cond_0

    if-nez v2, :cond_0

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    .line 51
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    move v1, v2

    :cond_5
    :goto_2
    if-ge v1, p2, :cond_6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 53
    :cond_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    move p3, v2

    :goto_3
    if-ge p3, p2, :cond_9

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p3, p3, 0x1

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 54
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    .line 55
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    if-nez v1, :cond_7

    goto :goto_3

    .line 56
    :cond_7
    array-length v3, v1

    move v4, v2

    :goto_4
    if-ge v4, v3, :cond_a

    aget v5, v1, v4

    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    .line 57
    :cond_a
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_b

    .line 58
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    :cond_b
    return-object v0
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a:Lcom/twilio/video/CameraCapturer;

    if-eqz v0, :cond_0

    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/twilio/video/CameraCapturer;->getCameraId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    return-object v0

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->b:Lcom/twilio/video/Camera2Capturer;

    if-eqz v0, :cond_1

    .line 38
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/twilio/video/Camera2Capturer;->getCameraId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;)Z
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/twilio/video/Camera2Capturer;->isSupported(Landroid/content/Context;)Z

    move-result v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera2 is supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    .line 3
    const-string v0, "camera"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 4
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->h:Landroid/hardware/camera2/CameraManager;

    .line 5
    new-instance v3, Ltvi/webrtc/Camera2Enumerator;

    invoke-direct {v3, p1}, Ltvi/webrtc/Camera2Enumerator;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-virtual {v3}, Ltvi/webrtc/Camera2Enumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 7
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/e;

    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/e;-><init>(Ltvi/webrtc/Camera2Enumerator;)V

    invoke-static {p0, v0, v4, v5}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a(Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;Landroid/hardware/camera2/CameraManager;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v5

    .line 8
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/d;

    invoke-direct {v6, v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/d;-><init>(Ltvi/webrtc/Camera2Enumerator;)V

    invoke-static {p0, v0, v4, v6}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a(Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;Landroid/hardware/camera2/CameraManager;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v5, :cond_0

    .line 9
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->f:Ljava/util/HashMap;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->FRONT_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->g:Ljava/util/HashMap;

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_0
    const-string v3, "Camera2: Front camera was not found"

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    :goto_0
    if-eqz v0, :cond_1

    .line 12
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->f:Ljava/util/HashMap;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->BACK_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->g:Ljava/util/HashMap;

    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 14
    :cond_1
    const-string v0, "Camera2: Back camera was not found"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 15
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->f:Ljava/util/HashMap;

    .line 16
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_2

    goto :goto_2

    .line 17
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    move-object p2, v2

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :goto_2
    if-nez p2, :cond_4

    return v1

    .line 18
    :cond_4
    new-instance v0, Lcom/twilio/video/Camera2Capturer;

    invoke-direct {v0, p1, p2}, Lcom/twilio/video/Camera2Capturer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->b:Lcom/twilio/video/Camera2Capturer;

    .line 19
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->c:Lcom/twilio/video/VideoCapturer;

    .line 20
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a:Lcom/twilio/video/CameraCapturer;

    goto/16 :goto_5

    .line 21
    :cond_5
    new-instance v0, Ltvi/webrtc/Camera1Enumerator;

    invoke-direct {v0}, Ltvi/webrtc/Camera1Enumerator;-><init>()V

    .line 22
    invoke-virtual {v0}, Ltvi/webrtc/Camera1Enumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 23
    invoke-virtual {v0, v4}, Ltvi/webrtc/Camera1Enumerator;->isFrontFacing(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 24
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->d:Ljava/util/HashMap;

    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->FRONT_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->e:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    :cond_7
    invoke-virtual {v0, v4}, Ltvi/webrtc/Camera1Enumerator;->isBackFacing(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 27
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->d:Ljava/util/HashMap;

    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->BACK_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->e:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 29
    :cond_8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->d:Ljava/util/HashMap;

    .line 30
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_9

    goto :goto_4

    .line 31
    :cond_9
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    move-object p2, v2

    goto :goto_4

    :cond_a
    new-instance p2, Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :goto_4
    if-nez p2, :cond_b

    return v1

    .line 32
    :cond_b
    new-instance v0, Lcom/twilio/video/CameraCapturer;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->i:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/c;

    invoke-direct {v0, p1, p2, v1}, Lcom/twilio/video/CameraCapturer;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/twilio/video/CameraCapturer$Listener;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a:Lcom/twilio/video/CameraCapturer;

    .line 33
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->c:Lcom/twilio/video/VideoCapturer;

    .line 34
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->b:Lcom/twilio/video/Camera2Capturer;

    :goto_5
    const/4 p1, 0x1

    return p1
.end method

.method public final b()Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a()Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a:Lcom/twilio/video/CameraCapturer;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->e:Ljava/util/HashMap;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->g:Ljava/util/HashMap;

    .line 14
    .line 15
    :goto_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->d:Ljava/util/HashMap;

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->f:Ljava/util/HashMap;

    .line 21
    .line 22
    :goto_1
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->FRONT_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    .line 23
    .line 24
    if-ne v3, v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->BACK_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    :goto_2
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a:Lcom/twilio/video/CameraCapturer;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lcom/twilio/video/CameraCapturer;->switchCamera(Ljava/lang/String;)V

    .line 49
    goto :goto_3

    .line 50
    .line 51
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->b:Lcom/twilio/video/Camera2Capturer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lcom/twilio/video/Camera2Capturer;->switchCamera(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    :goto_3
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    .line 61
    return-object v0
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
