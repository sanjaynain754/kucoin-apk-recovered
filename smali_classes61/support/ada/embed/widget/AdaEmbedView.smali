.class public final Lsupport/ada/embed/widget/AdaEmbedView;
.super Landroid/webkit/WebView;
.source "AdaEmbedView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetJavaScriptEnabled"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsupport/ada/embed/widget/AdaEmbedView$b;,
        Lsupport/ada/embed/widget/AdaEmbedView$Settings;,
        Lsupport/ada/embed/widget/AdaEmbedView$MetaFields;,
        Lsupport/ada/embed/widget/AdaEmbedView$c;,
        Lsupport/ada/embed/widget/AdaEmbedView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 m2\u00020\u0001:\u00053n6opB\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\rJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007\u00a2\u0006\u0004\u0008 \u0010!J#\u0010#\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007\u00a2\u0006\u0004\u0008#\u0010!J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008 \u0010&J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008#\u0010&J\u001d\u0010)\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e\u00a2\u0006\u0004\u0008)\u0010*JI\u0010.\u001a\u00020\u000b2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001e\u00a2\u0006\u0004\u00081\u00102R\u0016\u00105\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00086\u00104R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00104R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u00104R\u0016\u0010+\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u00104R\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002090\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010:R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002090\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010<R0\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110>j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011`?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010@R\u0018\u0010E\u001a\u00060BR\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0016\u0010G\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010FR\u0016\u0010H\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010FR\u00bd\u0001\u0010T\u001a\u00aa\u0001\u0012\u0004\u0012\u00020\u001e\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L\u00a2\u0006\u000c\u0008M\u0012\u0008\u0008N\u0012\u0004\u0008\u0008(O\u0012\u0004\u0012\u00020\u000b0K0Jj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L\u00a2\u0006\u000c\u0008M\u0012\u0008\u0008N\u0012\u0004\u0008\u0008(O\u0012\u0004\u0012\u00020\u000b0K`P0IjT\u0012\u0004\u0012\u00020\u001e\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L\u00a2\u0006\u000c\u0008M\u0012\u0008\u0008N\u0012\u0004\u0008\u0008(O\u0012\u0004\u0012\u00020\u000b0K0Jj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L\u00a2\u0006\u000c\u0008M\u0012\u0008\u0008N\u0012\u0004\u0008\u0008(O\u0012\u0004\u0012\u00020\u000b0K`P`Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR0\u0010`\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u0008\u0018\u00010K8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR*\u0010l\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008i\u0010c\u001a\u0004\u0008j\u0010e\"\u0004\u0008k\u0010g\u00a8\u0006q"
    }
    d2 = {
        "Lsupport/ada/embed/widget/AdaEmbedView;",
        "Landroid/webkit/WebView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "m",
        "()Z",
        "",
        "l",
        "()V",
        "accept",
        "setAcceptThirdPartyCookies",
        "(Z)V",
        "Lci0/a;",
        "action",
        "f",
        "(Lci0/a;)V",
        "g",
        "onAttachedToWindow",
        "i",
        "d",
        "Lsupport/ada/embed/widget/AdaEmbedView$Settings;",
        "settings",
        "h",
        "(Lsupport/ada/embed/widget/AdaEmbedView$Settings;)V",
        "",
        "",
        "metaFields",
        "setMetaFields",
        "(Ljava/util/Map;)V",
        "sensitiveMetaFields",
        "setSensitiveMetaFields",
        "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;",
        "metaFieldsBuilder",
        "(Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;)V",
        "fileName",
        "data",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "language",
        "greetings",
        "resetChatHistory",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Ljava/lang/Boolean;)V",
        "token",
        "setDeviceToken",
        "(Ljava/lang/String;)V",
        "b",
        "Ljava/lang/String;",
        "handle",
        "c",
        "cluster",
        "styles",
        "",
        "Ljava/util/Map;",
        "Landroid/os/Handler;",
        "Landroid/os/Handler;",
        "mainHandler",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "Ljava/util/LinkedHashMap;",
        "actionQueue",
        "Lsupport/ada/embed/widget/AdaEmbedView$b;",
        "k",
        "Lsupport/ada/embed/widget/AdaEmbedView$b;",
        "adaInterface",
        "Z",
        "isInitialized",
        "isAdaReady",
        "Ljava/util/HashMap;",
        "Ljava/util/HashSet;",
        "Lkotlin/Function1;",
        "Lsupport/ada/embed/widget/Event;",
        "Lkotlin/ParameterName;",
        "name",
        "event",
        "Lkotlin/collections/HashSet;",
        "Lkotlin/collections/HashMap;",
        "n",
        "Ljava/util/HashMap;",
        "eventCallbacks",
        "",
        "o",
        "I",
        "loadTimeoutMillis",
        "Lsupport/ada/embed/widget/AdaEmbedView$c;",
        "p",
        "Lkotlin/jvm/functions/Function1;",
        "getFilePickerCallback",
        "()Lkotlin/jvm/functions/Function1;",
        "setFilePickerCallback",
        "(Lkotlin/jvm/functions/Function1;)V",
        "filePickerCallback",
        "Lkotlin/Function0;",
        "q",
        "Lkotlin/jvm/functions/Function0;",
        "getZdChatterAuthCallback",
        "()Lkotlin/jvm/functions/Function0;",
        "setZdChatterAuthCallback",
        "(Lkotlin/jvm/functions/Function0;)V",
        "zdChatterAuthCallback",
        "r",
        "getWebViewLoadingErrorCallback",
        "setWebViewLoadingErrorCallback",
        "webViewLoadingErrorCallback",
        "s",
        "Companion",
        "MetaFields",
        "Settings",
        "ada-embed_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final s:Lsupport/ada/embed/widget/AdaEmbedView$Companion;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/os/Handler;

.field public final j:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lci0/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lsupport/ada/embed/widget/AdaEmbedView$b;

.field public l:Z

.field public m:Z

.field public final n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Lkotlin/jvm/functions/Function1<",
            "Lsupport/ada/embed/widget/Event;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public o:I

.field public p:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lsupport/ada/embed/widget/AdaEmbedView$c;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public q:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public r:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lsupport/ada/embed/widget/AdaEmbedView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lsupport/ada/embed/widget/AdaEmbedView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lsupport/ada/embed/widget/AdaEmbedView;->s:Lsupport/ada/embed/widget/AdaEmbedView$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lsupport/ada/embed/widget/AdaEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->i:Landroid/os/Handler;

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->j:Ljava/util/LinkedHashMap;

    .line 6
    new-instance v0, Lsupport/ada/embed/widget/AdaEmbedView$b;

    invoke-direct {v0, p0}, Lsupport/ada/embed/widget/AdaEmbedView$b;-><init>(Lsupport/ada/embed/widget/AdaEmbedView;)V

    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->k:Lsupport/ada/embed/widget/AdaEmbedView$b;

    .line 7
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->n:Ljava/util/HashMap;

    const/16 v1, 0x7530

    .line 8
    iput v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->o:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_5

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 10
    sget-object v5, Lsupport/ada/embed/R$styleable;->AdaEmbedView:[I

    .line 11
    invoke-virtual {v4, p2, v5, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 12
    :try_start_0
    const-string/jumbo v4, "typedArray"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_handle:I

    invoke-static {p2, v4}, Ldi0/b;->b(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->b:Ljava/lang/String;

    .line 13
    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_cluster:I

    invoke-static {p2, v4}, Ldi0/b;->b(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->c:Ljava/lang/String;

    .line 14
    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_greetings:I

    invoke-static {p2, v4}, Ldi0/b;->b(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->d:Ljava/lang/String;

    .line 15
    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_styles:I

    invoke-static {p2, v4}, Ldi0/b;->b(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->e:Ljava/lang/String;

    .line 16
    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_language:I

    invoke-static {p2, v4}, Ldi0/b;->b(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->f:Ljava/lang/String;

    .line 17
    sget v4, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_load_timeout:I

    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->o:I

    .line 18
    sget v1, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_metaFields:I

    const/4 v4, -0x1

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eq v1, v4, :cond_0

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    const-string v5, "context.resources.openRawResource(metaFieldsResId)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {v1}, Ldi0/b;->a(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 21
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 22
    :goto_0
    iput-object v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->g:Ljava/util/Map;

    .line 23
    sget v1, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_sensitiveMetaFields:I

    .line 24
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eq v1, v4, :cond_1

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    const-string v4, "context.resources.openRa\u2026sensitiveMetaFieldsResId)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {v1}, Ldi0/b;->a(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    .line 27
    :cond_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 28
    :goto_1
    iput-object v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->h:Ljava/util/Map;

    .line 29
    sget v1, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_accept_third_party_cookies:I

    .line 30
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 31
    invoke-direct {p0, v1}, Lsupport/ada/embed/widget/AdaEmbedView;->setAcceptThirdPartyCookies(Z)V

    .line 32
    sget v1, Lsupport/ada/embed/R$styleable;->AdaEmbedView_ada_device_token:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 33
    const-string/jumbo v4, "this"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lsupport/ada/embed/widget/AdaEmbedView;->setDeviceToken(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 35
    iget-object p2, p0, Lsupport/ada/embed/widget/AdaEmbedView;->b:Ljava/lang/String;

    if-nez p2, :cond_3

    const-string v1, "handle"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_4

    move p2, v2

    goto :goto_2

    :cond_4
    move p2, v3

    :goto_2
    iput-boolean p2, p0, Lsupport/ada/embed/widget/AdaEmbedView;->l:Z

    goto :goto_4

    .line 36
    :goto_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    .line 37
    :cond_5
    :goto_4
    invoke-virtual {p0}, Lsupport/ada/embed/widget/AdaEmbedView;->m()Z

    move-result p2

    .line 38
    const-string v1, "settings"

    if-eqz p2, :cond_6

    .line 39
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    goto :goto_5

    :cond_6
    if-nez p2, :cond_7

    .line 40
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 41
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 42
    :cond_7
    :goto_5
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 43
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 44
    new-instance p2, Lsupport/ada/embed/widget/AdaEmbedView$a;

    invoke-direct {p2, p1}, Lsupport/ada/embed/widget/AdaEmbedView$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 45
    const-string p1, "AdaAndroid"

    invoke-virtual {p0, v0, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lsupport/ada/embed/widget/AdaEmbedView;->l()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lsupport/ada/embed/widget/AdaEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic a(Lsupport/ada/embed/widget/AdaEmbedView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lsupport/ada/embed/widget/AdaEmbedView;->g()V

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

.method public static final synthetic b(Lsupport/ada/embed/widget/AdaEmbedView;)Ljava/util/HashMap;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->n:Ljava/util/HashMap;

    .line 3
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic c(Lsupport/ada/embed/widget/AdaEmbedView;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->i:Landroid/os/Handler;

    .line 3
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic k(Lsupport/ada/embed/widget/AdaEmbedView;Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Ljava/lang/Boolean;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p7, p6, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    move-object p1, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 9
    .line 10
    if-eqz p7, :cond_1

    .line 11
    move-object p2, v0

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    move-object p3, v0

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 19
    .line 20
    if-eqz p7, :cond_3

    .line 21
    move-object p4, v0

    .line 22
    .line 23
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 24
    .line 25
    if-eqz p6, :cond_4

    .line 26
    move-object p5, v0

    .line 27
    .line 28
    .line 29
    :cond_4
    invoke-virtual/range {p0 .. p5}, Lsupport/ada/embed/widget/AdaEmbedView;->j(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Ljava/lang/Boolean;)V

    .line 30
    return-void
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
.end method

.method private final setAcceptThirdPartyCookies(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0, p1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->r:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object v0, LAdaWebViewClient;->e:LAdaWebViewClient$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, LAdaWebViewClient$Companion;->a()Lkotlin/jvm/functions/Function0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 6
    .line 7
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 11
    .line 12
    const-string v2, "data:text/plain; charset=utf-8;base64,"

    .line 13
    .line 14
    const-string v3, ""

    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v1, p2

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object p2

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 27
    move-result-object p2

    .line 28
    .line 29
    const-string v0, "Base64.decode(it, Base64.DEFAULT)"

    .line 30
    .line 31
    .line 32
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v0, "data.replace(\"data:text/\u202664.DEFAULT)\n            }"

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    new-instance v2, Ljava/io/FileOutputStream;

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v2, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 57
    .line 58
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    const/4 p2, 0x0

    .line 60
    .line 61
    .line 62
    :try_start_2
    invoke-static {v2, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    const-string v0, "download"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    if-eqz p2, :cond_0

    .line 75
    move-object v2, p2

    .line 76
    .line 77
    check-cast v2, Landroid/app/DownloadManager;

    .line 78
    .line 79
    .line 80
    const-string/jumbo v6, "text/plain"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 88
    move-result-wide v8

    .line 89
    const/4 v10, 0x1

    .line 90
    const/4 v5, 0x1

    .line 91
    move-object v4, p1

    .line 92
    move-object v3, p1

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v2 .. v10}, Landroid/app/DownloadManager;->addCompletedDownload(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JZ)J

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    const-string p2, "Downloading File"

    .line 102
    const/4 v0, 0x1

    .line 103
    .line 104
    .line 105
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 110
    return-void

    .line 111
    :catch_0
    move-exception v0

    .line 112
    move-object p1, v0

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    .line 116
    .line 117
    const-string p2, "null cannot be cast to non-null type android.app.DownloadManager"

    .line 118
    .line 119
    .line 120
    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    .line 121
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    move-object p1, v0

    .line 124
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    move-object p2, v0

    .line 127
    .line 128
    .line 129
    :try_start_4
    invoke-static {v2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 130
    throw p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 134
    return-void
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
.end method

.method public final f(Lci0/a;)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lci0/a;->execute()V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->j:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lci0/a;->key()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->j:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lci0/a;->key()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public final g()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->m:Z

    .line 4
    .line 5
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->j:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lci0/a;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lci0/a;->execute()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 38
    goto :goto_0

    .line 39
    :cond_0
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
.end method

.method public final getFilePickerCallback()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lsupport/ada/embed/widget/AdaEmbedView$c;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->p:Lkotlin/jvm/functions/Function1;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getWebViewLoadingErrorCallback()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->r:Lkotlin/jvm/functions/Function0;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getZdChatterAuthCallback()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->q:Lkotlin/jvm/functions/Function0;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final h(Lsupport/ada/embed/widget/AdaEmbedView$Settings;)V
    .locals 1
    .param p1    # Lsupport/ada/embed/widget/AdaEmbedView$Settings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getHandle()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->b:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getCluster()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->c:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getGreetings()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->d:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getStyles()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->e:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getLanguage()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->f:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getLoadTimeoutMillis()I

    .line 34
    move-result v0

    .line 35
    .line 36
    iput v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->o:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getMetaFields()Ljava/util/Map;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->g:Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getSensitiveMetaFields()Ljava/util/Map;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->h:Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getDeviceToken()Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->setDeviceToken(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$Settings;->getAcceptThirdPartyCookies()Z

    .line 59
    move-result p1

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1}, Lsupport/ada/embed/widget/AdaEmbedView;->setAcceptThirdPartyCookies(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lsupport/ada/embed/widget/AdaEmbedView;->l()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 69
    move-result p1

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    const-string p1, "file:///android_asset/embed.html"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 77
    return-void

    .line 78
    :cond_0
    const/4 p1, 0x1

    .line 79
    .line 80
    iput-boolean p1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->l:Z

    .line 81
    const/4 p1, 0x0

    .line 82
    .line 83
    iput-boolean p1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->m:Z

    .line 84
    return-void
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
.end method

.method public final i()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->b:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v1, "handle"

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->c:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const-string v2, "cluster"

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    .line 20
    :cond_1
    iget-object v2, p0, Lsupport/ada/embed/widget/AdaEmbedView;->d:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    const-string v3, "greetings"

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    .line 29
    :cond_2
    iget-object v3, p0, Lsupport/ada/embed/widget/AdaEmbedView;->e:Ljava/lang/String;

    .line 30
    .line 31
    if-nez v3, :cond_3

    .line 32
    .line 33
    .line 34
    const-string/jumbo v4, "styles"

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    .line 39
    :cond_3
    iget-object v4, p0, Lsupport/ada/embed/widget/AdaEmbedView;->f:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v4, :cond_4

    .line 42
    .line 43
    const-string v5, "language"

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 47
    .line 48
    :cond_4
    iget-object v5, p0, Lsupport/ada/embed/widget/AdaEmbedView;->g:Ljava/util/Map;

    .line 49
    .line 50
    if-nez v5, :cond_5

    .line 51
    .line 52
    const-string v6, "metaFields"

    .line 53
    .line 54
    .line 55
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_5
    invoke-static {v5}, Ldi0/b;->c(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    iget-object v6, p0, Lsupport/ada/embed/widget/AdaEmbedView;->h:Ljava/util/Map;

    .line 62
    .line 63
    if-nez v6, :cond_6

    .line 64
    .line 65
    const-string v7, "sensitiveMetaFields"

    .line 66
    .line 67
    .line 68
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_6
    invoke-static {v6}, Ldi0/b;->c(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 72
    move-result-object v6

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 76
    move-result-object v0

    .line 77
    const/4 v1, 0x7

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    const-string v1, "initializeEmbed(\'%s\', \'%s\', \'%s\', \'%s\', \'%s\', %s, %s)"

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const-string v1, "java.lang.String.format(this, *args)"

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    const/4 v1, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 97
    return-void
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
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Ljava/lang/Boolean;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lsupport/ada/embed/actions/ResetAction;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;->a()Ljava/util/Map;

    .line 9
    move-result-object p3

    .line 10
    move-object v4, p3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v4, v1

    .line 13
    .line 14
    :goto_0
    if-eqz p4, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p4}, Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;->a()Ljava/util/Map;

    .line 18
    move-result-object v1

    .line 19
    :cond_1
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    move-object v6, p5

    .line 22
    move-object v5, v1

    .line 23
    move-object v1, p0

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v0 .. v6}, Lsupport/ada/embed/actions/ResetAction;-><init>(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

    .line 30
    return-void
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
.end method

.method public final l()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->r:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object v0, LAdaWebViewClient;->e:LAdaWebViewClient$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, LAdaWebViewClient$Companion;->a()Lkotlin/jvm/functions/Function0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    :goto_0
    new-instance v1, LAdaWebViewClient;

    .line 14
    .line 15
    iget v2, p0, Lsupport/ada/embed/widget/AdaEmbedView;->o:I

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, LAdaWebViewClient;-><init>(Lkotlin/jvm/functions/Function0;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 22
    .line 23
    new-instance v0, Lsupport/ada/embed/widget/AdaEmbedView$d;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lsupport/ada/embed/widget/AdaEmbedView$d;-><init>(Lsupport/ada/embed/widget/AdaEmbedView;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 30
    return-void
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
.end method

.method public final m()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lsupport/ada/embed/widget/AdaEmbedView;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "file:///android_asset/embed.html"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setDeviceToken(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lsupport/ada/embed/actions/SetDeviceTokenAction;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lsupport/ada/embed/actions/SetDeviceTokenAction;-><init>(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setFilePickerCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lsupport/ada/embed/widget/AdaEmbedView$c;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->p:Lkotlin/jvm/functions/Function1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setMetaFields(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "setMetaFields(MetaFields.Builder())"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    new-instance v0, Lsupport/ada/embed/actions/SetMetafieldsAction;

    invoke-direct {v0, p0, p1}, Lsupport/ada/embed/actions/SetMetafieldsAction;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

    return-void
.end method

.method public final setMetaFields(Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;)V
    .locals 1
    .param p1    # Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    new-instance v0, Lsupport/ada/embed/actions/SetMetafieldsAction;

    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lsupport/ada/embed/actions/SetMetafieldsAction;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

    return-void
.end method

.method public final setSensitiveMetaFields(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "setSensitiveMetaFields(MetaFields.Builder())"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    new-instance v0, Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;

    invoke-direct {v0, p0, p1}, Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

    return-void
.end method

.method public final setSensitiveMetaFields(Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;)V
    .locals 1
    .param p1    # Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    new-instance v0, Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;

    invoke-virtual {p1}, Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lsupport/ada/embed/widget/AdaEmbedView;->f(Lci0/a;)V

    return-void
.end method

.method public final setWebViewLoadingErrorCallback(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->r:Lkotlin/jvm/functions/Function0;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setZdChatterAuthCallback(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lsupport/ada/embed/widget/AdaEmbedView;->q:Lkotlin/jvm/functions/Function0;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
