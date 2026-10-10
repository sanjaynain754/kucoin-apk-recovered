.class public final Lcom/jumio/commons/camera/Frame$Metadata;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/commons/camera/Frame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Metadata"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010D\u001a\u00020\u00102\u0008\u0010E\u001a\u0004\u0018\u00010FH\u0096\u0002J\u0008\u0010G\u001a\u00020\u0005H\u0016J\u0008\u0010H\u001a\u00020IH\u0016J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0010J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0008H\u00c6\u0003J\t\u0010P\u001a\u00020\nH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010R\u001a\u00020\nH\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0010H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0008H\u00c6\u0003J\t\u0010W\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0017H\u00c6\u0003J\u0099\u0001\u0010Z\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u001f\"\u0004\u0008#\u0010!R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u0010)\"\u0004\u00081\u0010+R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010\u001f\"\u0004\u00083\u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u00104\"\u0004\u00085\u00106R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u0010\u001f\"\u0004\u00088\u0010!R\u001a\u0010\u0012\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010%\"\u0004\u0008:\u0010\'R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u00104\"\u0004\u0008;\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010C\u00a8\u0006["
    }
    d2 = {
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "Ljava/io/Serializable;",
        "size",
        "Lcom/jumio/commons/camera/Size;",
        "rotation",
        "",
        "iso",
        "shutterSpeed",
        "",
        "lensPosition",
        "",
        "colorSpaceTransform",
        "",
        "aperture",
        "orientation",
        "isPortrait",
        "",
        "imageFormat",
        "timestamp",
        "isFlashOn",
        "cameraConnectionData",
        "Lcom/jumio/core/camera/CameraConnectionData;",
        "flashState",
        "Lcom/jumio/core/enums/FlashState;",
        "<init>",
        "(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)V",
        "getSize",
        "()Lcom/jumio/commons/camera/Size;",
        "setSize",
        "(Lcom/jumio/commons/camera/Size;)V",
        "getRotation",
        "()I",
        "setRotation",
        "(I)V",
        "getIso",
        "setIso",
        "getShutterSpeed",
        "()J",
        "setShutterSpeed",
        "(J)V",
        "getLensPosition",
        "()F",
        "setLensPosition",
        "(F)V",
        "getColorSpaceTransform",
        "()[F",
        "setColorSpaceTransform",
        "([F)V",
        "getAperture",
        "setAperture",
        "getOrientation",
        "setOrientation",
        "()Z",
        "setPortrait",
        "(Z)V",
        "getImageFormat",
        "setImageFormat",
        "getTimestamp",
        "setTimestamp",
        "setFlashOn",
        "getCameraConnectionData",
        "()Lcom/jumio/core/camera/CameraConnectionData;",
        "setCameraConnectionData",
        "(Lcom/jumio/core/camera/CameraConnectionData;)V",
        "getFlashState",
        "()Lcom/jumio/core/enums/FlashState;",
        "setFlashState",
        "(Lcom/jumio/core/enums/FlashState;)V",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "deepCopy",
        "hasFlashFired",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "copy",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lcom/jumio/commons/camera/Size;

.field public b:I

.field public c:I

.field public d:J

.field public e:F

.field public f:[F

.field public g:F

.field public h:I

.field public i:Z

.field public j:I

.field public k:J

.field public l:Z

.field public m:Lcom/jumio/core/camera/CameraConnectionData;

.field public n:Lcom/jumio/core/enums/FlashState;


# direct methods
.method public constructor <init>()V
    .locals 19

    const/16 v17, 0x3fff

    const/16 v18, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {v0 .. v18}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)V
    .locals 2
    .param p1    # Lcom/jumio/commons/camera/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lcom/jumio/core/camera/CameraConnectionData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Lcom/jumio/core/enums/FlashState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p16

    const-string v1, "size"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flashState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 4
    iput p2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 5
    iput p3, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 6
    iput-wide p4, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 7
    iput p6, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 8
    iput-object p7, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 9
    iput p8, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 10
    iput p9, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 11
    iput-boolean p10, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 12
    iput p11, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 13
    iput-wide p12, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    move/from16 p1, p14

    .line 14
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    move-object/from16 p1, p15

    .line 15
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 16
    iput-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 17
    new-instance v1, Lcom/jumio/commons/camera/Size;

    invoke-direct {v1, v2, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const-wide/16 v5, 0x0

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    const/4 v8, 0x0

    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    move v11, v2

    goto :goto_7

    :cond_7
    move/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    move v12, v2

    goto :goto_8

    :cond_8
    move/from16 v12, p10

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    const/16 v13, 0x11

    goto :goto_9

    :cond_9
    move/from16 v13, p11

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p12

    :goto_a
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    move/from16 v2, p14

    :goto_b
    and-int/lit16 v10, v0, 0x1000

    if-eqz v10, :cond_c

    const/4 v10, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v10, p15

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    .line 19
    sget-object v0, Lcom/jumio/core/enums/FlashState;->UNAVAILABLE:Lcom/jumio/core/enums/FlashState;

    move-object/from16 p17, v0

    :goto_d
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p15, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-wide/from16 p5, v5

    move/from16 p7, v7

    move/from16 p9, v8

    move-object/from16 p8, v9

    move-object/from16 p16, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-wide/from16 p13, v14

    goto :goto_e

    :cond_d
    move-object/from16 p17, p16

    goto :goto_d

    .line 20
    :goto_e
    invoke-direct/range {p1 .. p17}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILjava/lang/Object;)Lcom/jumio/commons/camera/Frame$Metadata;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-wide v13, v0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    goto :goto_a

    :cond_a
    move-wide/from16 v13, p12

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-boolean v15, v0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_d

    iget-object v1, v0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    move-object/from16 p17, v1

    :goto_d
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-wide/from16 p5, v5

    move/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-wide/from16 p13, v13

    move/from16 p15, v15

    goto :goto_e

    :cond_d
    move-object/from16 p17, p16

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p17}, Lcom/jumio/commons/camera/Frame$Metadata;->copy(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)Lcom/jumio/commons/camera/Frame$Metadata;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 3
    return-object v0
    .line 4
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

.method public final component10()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 3
    return v0
    .line 4
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

.method public final component11()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 3
    return-wide v0
    .line 4
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

.method public final component12()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 3
    return v0
    .line 4
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

.method public final component13()Lcom/jumio/core/camera/CameraConnectionData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 3
    return-object v0
    .line 4
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

.method public final component14()Lcom/jumio/core/enums/FlashState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 3
    return-object v0
    .line 4
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

.method public final component2()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 3
    return v0
    .line 4
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

.method public final component3()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 3
    return v0
    .line 4
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

.method public final component4()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 3
    return-wide v0
    .line 4
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

.method public final component5()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 3
    return v0
    .line 4
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

.method public final component6()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 3
    return-object v0
    .line 4
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

.method public final component7()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 3
    return v0
    .line 4
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

.method public final component8()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 3
    return v0
    .line 4
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

.method public final component9()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 3
    return v0
    .line 4
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

.method public final copy(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)Lcom/jumio/commons/camera/Frame$Metadata;
    .locals 18
    .param p1    # Lcom/jumio/commons/camera/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lcom/jumio/core/camera/CameraConnectionData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Lcom/jumio/core/enums/FlashState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "size"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flashState"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/jumio/commons/camera/Frame$Metadata;

    move/from16 v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v13, p12

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)V

    return-object v1
.end method

.method public final deepCopy()Lcom/jumio/commons/camera/Frame$Metadata;
    .locals 20
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v18, 0x3fff

    .line 3
    .line 4
    const/16 v19, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    .line 9
    const-wide/16 v5, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v11, 0x0

    .line 15
    const/4 v12, 0x0

    .line 16
    .line 17
    const-wide/16 v13, 0x0

    .line 18
    const/4 v15, 0x0

    .line 19
    .line 20
    const/16 v16, 0x0

    .line 21
    .line 22
    const/16 v17, 0x0

    .line 23
    .line 24
    move-object/from16 v1, p0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v19}, Lcom/jumio/commons/camera/Frame$Metadata;->copy$default(Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILjava/lang/Object;)Lcom/jumio/commons/camera/Frame$Metadata;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v2, Lcom/jumio/commons/camera/Size;

    .line 31
    .line 32
    iget-object v3, v1, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 36
    move-result v3

    .line 37
    .line 38
    iget-object v4, v1, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 42
    move-result v4

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, v4}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 46
    .line 47
    iput-object v2, v0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 48
    return-object v0
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    .line 14
    :goto_0
    const-class v2, Lcom/jumio/commons/camera/Frame$Metadata;

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    return v2

    .line 23
    .line 24
    :cond_2
    const-string v1, "null cannot be cast to non-null type com.jumio.commons.camera.Frame.Metadata"

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast p1, Lcom/jumio/commons/camera/Frame$Metadata;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_3

    .line 40
    return v2

    .line 41
    .line 42
    :cond_3
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 43
    .line 44
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 45
    .line 46
    if-eq v1, v3, :cond_4

    .line 47
    return v2

    .line 48
    .line 49
    :cond_4
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 50
    .line 51
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 52
    .line 53
    if-eq v1, v3, :cond_5

    .line 54
    return v2

    .line 55
    .line 56
    :cond_5
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 57
    .line 58
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 59
    .line 60
    cmpg-float v1, v1, v3

    .line 61
    .line 62
    if-nez v1, :cond_f

    .line 63
    .line 64
    iget-wide v3, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 65
    .line 66
    iget-wide v5, p1, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 67
    .line 68
    cmp-long v1, v3, v5

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    return v2

    .line 72
    .line 73
    :cond_6
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 74
    .line 75
    iget-object v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([F[F)Z

    .line 79
    move-result v1

    .line 80
    .line 81
    if-nez v1, :cond_7

    .line 82
    return v2

    .line 83
    .line 84
    :cond_7
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 85
    .line 86
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 87
    .line 88
    cmpg-float v1, v1, v3

    .line 89
    .line 90
    if-nez v1, :cond_f

    .line 91
    .line 92
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 93
    .line 94
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 95
    .line 96
    if-eq v1, v3, :cond_8

    .line 97
    return v2

    .line 98
    .line 99
    :cond_8
    iget-boolean v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 100
    .line 101
    iget-boolean v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 102
    .line 103
    if-eq v1, v3, :cond_9

    .line 104
    return v2

    .line 105
    .line 106
    :cond_9
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 107
    .line 108
    iget v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 109
    .line 110
    if-eq v1, v3, :cond_a

    .line 111
    return v2

    .line 112
    .line 113
    :cond_a
    iget-wide v3, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 114
    .line 115
    iget-wide v5, p1, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 116
    .line 117
    cmp-long v1, v3, v5

    .line 118
    .line 119
    if-eqz v1, :cond_b

    .line 120
    return v2

    .line 121
    .line 122
    :cond_b
    iget-boolean v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 123
    .line 124
    iget-boolean v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 125
    .line 126
    if-eq v1, v3, :cond_c

    .line 127
    return v2

    .line 128
    .line 129
    :cond_c
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 130
    .line 131
    iget-object v3, p1, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v1

    .line 136
    .line 137
    if-nez v1, :cond_d

    .line 138
    return v2

    .line 139
    .line 140
    :cond_d
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 141
    .line 142
    iget-object p1, p1, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 143
    .line 144
    if-eq v1, p1, :cond_e

    .line 145
    return v2

    .line 146
    :cond_e
    return v0

    .line 147
    :cond_f
    return v2
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final getAperture()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 3
    return v0
    .line 4
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

.method public final getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 3
    return-object v0
    .line 4
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

.method public final getColorSpaceTransform()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 3
    return-object v0
    .line 4
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

.method public final getFlashState()Lcom/jumio/core/enums/FlashState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 3
    return-object v0
    .line 4
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

.method public final getImageFormat()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 3
    return v0
    .line 4
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

.method public final getIso()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 3
    return v0
    .line 4
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

.method public final getLensPosition()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 3
    return v0
    .line 4
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

.method public final getOrientation()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 3
    return v0
    .line 4
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

.method public final getRotation()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 3
    return v0
    .line 4
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

.method public final getShutterSpeed()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 3
    return-wide v0
    .line 4
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

.method public final getSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 3
    return-object v0
    .line 4
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

.method public final getTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 3
    return-wide v0
    .line 4
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

.method public final hasFlashFired()Z
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 7
    .line 8
    sget-object v1, Lcom/jumio/core/enums/FlashState;->FIRED:Lcom/jumio/core/enums/FlashState;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/jumio/core/enums/FlashState;->UNAVAILABLE:Lcom/jumio/core/enums/FlashState;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
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
.end method

.method public hashCode()I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 12
    add-int/2addr v0, v2

    .line 13
    mul-int/2addr v0, v1

    .line 14
    .line 15
    iget v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 16
    add-int/2addr v0, v2

    .line 17
    mul-int/2addr v0, v1

    .line 18
    .line 19
    iget v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    .line 27
    iget-wide v3, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4, v2, v1}, Ljumio/core/x1;->a(JII)I

    .line 31
    move-result v0

    .line 32
    .line 33
    iget-object v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 40
    move-result v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v2, v3

    .line 43
    :goto_0
    add-int/2addr v0, v2

    .line 44
    mul-int/2addr v0, v1

    .line 45
    .line 46
    iget v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v0

    .line 52
    mul-int/2addr v2, v1

    .line 53
    .line 54
    iget v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 55
    add-int/2addr v2, v0

    .line 56
    mul-int/2addr v2, v1

    .line 57
    .line 58
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v2, v1}, Ljumio/core/b0;->a(ZII)I

    .line 62
    move-result v0

    .line 63
    .line 64
    iget v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 65
    add-int/2addr v0, v2

    .line 66
    mul-int/2addr v0, v1

    .line 67
    .line 68
    iget-wide v4, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v5, v0, v1}, Ljumio/core/x1;->a(JII)I

    .line 72
    move-result v0

    .line 73
    .line 74
    iget-boolean v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 78
    move-result v0

    .line 79
    .line 80
    iget-object v2, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 81
    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/jumio/core/camera/CameraConnectionData;->hashCode()I

    .line 86
    move-result v3

    .line 87
    :cond_1
    add-int/2addr v0, v3

    .line 88
    mul-int/2addr v0, v1

    .line 89
    .line 90
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 94
    move-result v1

    .line 95
    add-int/2addr v1, v0

    .line 96
    return v1
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public final isFlashOn()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 3
    return v0
    .line 4
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

.method public final isPortrait()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 3
    return v0
    .line 4
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

.method public final setAperture(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V
    .locals 0
    .param p1    # Lcom/jumio/core/camera/CameraConnectionData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setColorSpaceTransform([F)V
    .locals 0
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setFlashOn(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setFlashState(Lcom/jumio/core/enums/FlashState;)V
    .locals 1
    .param p1    # Lcom/jumio/core/enums/FlashState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

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
.end method

.method public final setImageFormat(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setIso(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setLensPosition(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setOrientation(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setPortrait(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setRotation(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setShutterSpeed(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setSize(Lcom/jumio/commons/camera/Size;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

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
.end method

.method public final setTimestamp(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 3
    return-void
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "\n\t\t\t| size: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->a:Lcom/jumio/commons/camera/Size;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "\n\t\t\t| rotation: "

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->b:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "\n\t\t\t| iso: "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->c:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "\n\t\t\t| lensPosition: "

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->e:F

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "\n\t\t\t| shutterSpeed: "

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-wide v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->d:J

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "\n\t\t\t| colorSpaceTransform: "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->f:[F

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, "\n\t\t\t| aperture: "

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->g:F

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "\n\t\t\t| orientation: "

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->h:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, "\n\t\t\t| isPortrait: "

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-boolean v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->i:Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, "\n\t\t\t| imageFormat: "

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->j:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, "\n\t\t\t| timestamp: "

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    iget-wide v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->k:J

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, "\n\t\t\t| isFlashOn: "

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->l:Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, "\n\t\t\t| cameraConnection: "

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->m:Lcom/jumio/core/camera/CameraConnectionData;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "\n\t\t\t| flashState: "

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    iget-object v1, p0, Lcom/jumio/commons/camera/Frame$Metadata;->n:Lcom/jumio/core/enums/FlashState;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, "\n\t\t"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    move-result-object v0

    .line 152
    const/4 v1, 0x0

    .line 153
    const/4 v2, 0x1

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1, v2, v1}, Lkotlin/text/StringsKt;->trimMargin$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    return-object v0
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method
