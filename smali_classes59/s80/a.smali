.class public final Ls80/a;
.super Ljava/lang/Object;
.source "JsBridgeHandlerHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b*\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u000b*\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tJ\n\u0010\u0011\u001a\u00020\u000b*\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "jsHandlerListRef",
        "",
        "Ljava/lang/ref/SoftReference;",
        "Lcom/kubi/sdk/web/jsapi/JsBridgeEventHandler;",
        "addAllHandlers",
        "",
        "Lcom/kubi/sdk/web/KWebView;",
        "activity",
        "Lcom/kubi/sdk/BaseActivity;",
        "addAgoraAllHandlers",
        "agoraHandler",
        "removeBeforeAllHandlers",
        "LWebWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJsBridgeHandlerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsBridgeHandlerHelper.kt\ncom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1869#2,2:77\n1869#2,2:79\n*S KotlinDebug\n*F\n+ 1 JsBridgeHandlerHelper.kt\ncom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper\n*L\n51#1:77,2\n67#1:79,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ls80/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/kubi/sdk/web/jsapi/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ls80/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ls80/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ls80/a;->a:Ls80/a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    sput-object v0, Ls80/a;->b:Ljava/util/List;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/jsapi/b;)V
    .locals 3
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/BaseActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/web/jsapi/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "activity"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "agoraHandler"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v0, Ls80/a;->b:Ljava/util/List;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 21
    .line 22
    new-instance v0, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p2}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, p2, p1}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler;-><init>(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V

    .line 31
    const/4 p2, 0x3

    .line 32
    .line 33
    new-array p2, p2, [Lcom/kubi/sdk/web/jsapi/b;

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    aput-object v0, p2, v2

    .line 37
    const/4 v0, 0x1

    .line 38
    .line 39
    aput-object v1, p2, v0

    .line 40
    const/4 v0, 0x2

    .line 41
    .line 42
    aput-object p3, p2, v0

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    .line 49
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object p2

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    move-result p3

    .line 55
    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    move-result-object p3

    .line 61
    .line 62
    check-cast p3, Lcom/kubi/sdk/web/jsapi/b;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p3}, Lcom/kubi/sdk/web/KWebView;->b(Lcom/kubi/sdk/web/jsapi/b;)V

    .line 66
    .line 67
    sget-object v0, Ls80/a;->b:Ljava/util/List;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/ref/SoftReference;

    .line 70
    .line 71
    .line 72
    invoke-direct {v1, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_0
    sget-object p2, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->a:Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->d()Z

    .line 82
    move-result p2

    .line 83
    .line 84
    if-nez p2, :cond_1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/sdk/web/KWebView;->w()V

    .line 88
    :cond_1
    return-void
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
.end method

.method public final b(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/sdk/BaseActivity;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/BaseActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "activity"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p2}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->b(Lcom/kubi/sdk/web/jsapi/b;)V

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p2, p1}, Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler;-><init>(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->b(Lcom/kubi/sdk/web/jsapi/b;)V

    .line 27
    .line 28
    new-instance v0, Lcom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p2, p1}, Lcom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler;-><init>(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->b(Lcom/kubi/sdk/web/jsapi/b;)V

    .line 35
    .line 36
    sget-object p2, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->a:Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->d()Z

    .line 40
    move-result p2

    .line 41
    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/sdk/web/KWebView;->w()V

    .line 46
    :cond_0
    return-void
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
.end method

.method public final c(Lcom/kubi/sdk/web/KWebView;)V
    .locals 2
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ls80/a;->b:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Lcom/kubi/sdk/web/jsapi/b;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/web/KWebView;->A(Lcom/kubi/sdk/web/jsapi/b;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
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
.end method
