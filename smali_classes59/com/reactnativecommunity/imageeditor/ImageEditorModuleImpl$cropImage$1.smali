.class final Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ImageEditorModuleImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->l(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/m0;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/m0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.reactnativecommunity.imageeditor.ImageEditorModuleImpl$cropImage$1"
    f = "ImageEditorModuleImpl.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $format:Ljava/lang/String;

.field final synthetic $headers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $height:I

.field final synthetic $includeBase64:Z

.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;

.field final synthetic $quality:I

.field final synthetic $targetHeight:I

.field final synthetic $targetWidth:I

.field final synthetic $uri:Ljava/lang/String;

.field final synthetic $width:I

.field final synthetic $x:I

.field final synthetic $y:I

.field label:I

.field final synthetic this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;


# direct methods
.method public constructor <init>(IILcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Ljava/lang/String;IIIILjava/util/HashMap;Ljava/lang/String;ILcom/facebook/react/bridge/Promise;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;",
            "Ljava/lang/String;",
            "IIII",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Lcom/facebook/react/bridge/Promise;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetWidth:I

    .line 3
    .line 4
    iput p2, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetHeight:I

    .line 5
    .line 6
    iput-object p3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 9
    .line 10
    iput p5, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$x:I

    .line 11
    .line 12
    iput p6, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$y:I

    .line 13
    .line 14
    iput p7, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$width:I

    .line 15
    .line 16
    iput p8, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$height:I

    .line 17
    .line 18
    iput-object p9, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$headers:Ljava/util/HashMap;

    .line 19
    .line 20
    iput-object p10, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$format:Ljava/lang/String;

    .line 21
    .line 22
    iput p11, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$quality:I

    .line 23
    .line 24
    iput-object p12, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 25
    .line 26
    iput-boolean p13, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$includeBase64:Z

    .line 27
    const/4 p1, 0x2

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p14}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 31
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;

    .line 5
    .line 6
    iget v2, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetWidth:I

    .line 7
    .line 8
    iget v3, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetHeight:I

    .line 9
    .line 10
    iget-object v4, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 11
    .line 12
    iget-object v5, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 13
    .line 14
    iget v6, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$x:I

    .line 15
    .line 16
    iget v7, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$y:I

    .line 17
    .line 18
    iget v8, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$width:I

    .line 19
    .line 20
    iget v9, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$height:I

    .line 21
    .line 22
    iget-object v10, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$headers:Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object v11, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$format:Ljava/lang/String;

    .line 25
    .line 26
    iget v12, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$quality:I

    .line 27
    .line 28
    iget-object v13, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 29
    .line 30
    iget-boolean v14, v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$includeBase64:Z

    .line 31
    .line 32
    move-object/from16 v15, p2

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v15}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;-><init>(IILcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Ljava/lang/String;IIIILjava/util/HashMap;Ljava/lang/String;ILcom/facebook/react/bridge/Promise;ZLkotlin/coroutines/Continuation;)V

    .line 36
    return-object v1
    .line 37
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->label:I

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 16
    .line 17
    iget v8, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetWidth:I

    .line 18
    .line 19
    if-lez v8, :cond_0

    .line 20
    .line 21
    iget v9, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$targetHeight:I

    .line 22
    .line 23
    if-lez v9, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 28
    .line 29
    iget v4, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$x:I

    .line 30
    .line 31
    iget v5, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$y:I

    .line 32
    .line 33
    iget v6, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$width:I

    .line 34
    .line 35
    iget v7, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$height:I

    .line 36
    .line 37
    iget-object v10, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$headers:Ljava/util/HashMap;

    .line 38
    .line 39
    .line 40
    invoke-static/range {v1 .. v10}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIIIILjava/util/HashMap;)Landroid/graphics/Bitmap;

    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_0
    iget-object v1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 48
    .line 49
    iget-object v3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 50
    .line 51
    iget v4, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$x:I

    .line 52
    .line 53
    iget v5, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$y:I

    .line 54
    .line 55
    iget v6, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$width:I

    .line 56
    .line 57
    iget v7, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$height:I

    .line 58
    .line 59
    iget-object v8, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$headers:Ljava/util/HashMap;

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v8}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->d(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;IIIILjava/util/HashMap;)Landroid/graphics/Bitmap;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    :goto_0
    if-eqz p1, :cond_2

    .line 66
    .line 67
    sget-object v0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->c:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$format:Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v2, v1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$getMimeType(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    iget-object v2, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->g(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v2, v1}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$createTempFile(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    iget v3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$quality:I

    .line 86
    .line 87
    .line 88
    invoke-static {v0, p1, v1, v2, v3}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$writeCompressedBitmapToFile(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/io/File;I)V

    .line 89
    .line 90
    const-string v3, "image/jpeg"

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    move-result v3

    .line 95
    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    iget-object v3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->this$0:Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;->g(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    iget-object v4, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    .line 111
    const-string/jumbo v5, "parse(...)"

    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v3, v4, v2}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$copyExif(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;)V

    .line 118
    .line 119
    :cond_1
    iget-object v3, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 120
    .line 121
    iget-boolean v4, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$includeBase64:Z

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v2, p1, v1, v4}, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;->access$getResultMap(Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$Companion;Ljava/io/File;Landroid/graphics/Bitmap;Ljava/lang/String;Z)Lcom/facebook/react/bridge/WritableMap;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    invoke-interface {v3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 129
    goto :goto_2

    .line 130
    .line 131
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$uri:Ljava/lang/String;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    const-string v2, "Cannot decode bitmap: "

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 154
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    :goto_1
    iget-object v0, p0, Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cropImage$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    return-object p1

    .line 163
    .line 164
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 167
    .line 168
    .line 169
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    throw p1
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
.end method
