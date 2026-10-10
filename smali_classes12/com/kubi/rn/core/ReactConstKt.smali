.class public final Lcom/kubi/rn/core/ReactConstKt;
.super Ljava/lang/Object;
.source "ReactConst.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u001b\u0010\u0013\u001a\u00020\u00148@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "LOAD_TYPE_LOCAL",
        "",
        "LOAD_TYPE_PREPARE",
        "LOAD_TYPE_REMOTE",
        "LOAD_TYPE_REMOTE_AND_PREPARE",
        "CODE_SUCCESS",
        "CODE_SUCCESS_BY_PREPARE",
        "CODE_SUCCESS_BY_REMOTE",
        "CODE_SUCCESS_BY_REMOTE_AND_PREPARE",
        "CODE_ENGINE_OFF",
        "CODE_INIT_PARAM_ERROR",
        "CODE_ENGINE_LOAD_FAILED",
        "CODE_BUNDLE_IS_DISABLE",
        "CODE_BUNDLE_NOT_FOUND",
        "CODE_BUNDLE_LOAD_FAILED",
        "CODE_BASE_MODULE_NOT_FOUND",
        "CODE_BASE_MODULE_LOAD_FAILED",
        "CODE_JS_EXCEPTION",
        "CODE_RENDER_TIMEOUT",
        "developerSupport",
        "",
        "getDeveloperSupport",
        "()Z",
        "developerSupport$delegate",
        "Lkotlin/Lazy;",
        "BReactNativeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CODE_BASE_MODULE_LOAD_FAILED:I = 0x195

.field public static final CODE_BASE_MODULE_NOT_FOUND:I = 0x195

.field public static final CODE_BUNDLE_IS_DISABLE:I = 0x12f

.field public static final CODE_BUNDLE_LOAD_FAILED:I = 0x191

.field public static final CODE_BUNDLE_NOT_FOUND:I = 0x190

.field public static final CODE_ENGINE_LOAD_FAILED:I = 0x12e

.field public static final CODE_ENGINE_OFF:I = 0x12c

.field public static final CODE_INIT_PARAM_ERROR:I = 0x12d

.field public static final CODE_JS_EXCEPTION:I = 0x1f4

.field public static final CODE_RENDER_TIMEOUT:I = -0x33450

.field public static final CODE_SUCCESS:I = 0xc8

.field public static final CODE_SUCCESS_BY_PREPARE:I = 0xc9

.field public static final CODE_SUCCESS_BY_REMOTE:I = 0xca

.field public static final CODE_SUCCESS_BY_REMOTE_AND_PREPARE:I = 0xcb

.field public static final LOAD_TYPE_LOCAL:I = 0x0

.field public static final LOAD_TYPE_PREPARE:I = 0x1

.field public static final LOAD_TYPE_REMOTE:I = 0x2

.field public static final LOAD_TYPE_REMOTE_AND_PREPARE:I = 0x3

.field private static final developerSupport$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/core/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/rn/core/f;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sput-object v0, Lcom/kubi/rn/core/ReactConstKt;->developerSupport$delegate:Lkotlin/Lazy;

    .line 12
    return-void
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

.method public static synthetic a()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/rn/core/ReactConstKt;->developerSupport_delegate$lambda$0()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method private static final developerSupport_delegate$lambda$0()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lvk/s;->Q()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public static final getDeveloperSupport()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/rn/core/ReactConstKt;->developerSupport$delegate:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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
