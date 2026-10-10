.class public final Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;
.super Ljava/lang/Object;
.source "InAppPurchaseBillingClientWrapperV5V7.kt"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J2\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0008J=\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\u0008\u00030\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\u0008\u00030\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u0012H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010 \u001a\u0004\u0008$\u0010\"R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010 \u001a\u0004\u0008&\u0010\"R\u001c\u0010(\u001a\n \'*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;",
        "Ljava/lang/reflect/InvocationHandler;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;",
        "getOrCreateInstance",
        "(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;",
        "",
        "proxy",
        "Ljava/lang/reflect/Method;",
        "m",
        "",
        "args",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;",
        "b",
        "Ljava/lang/Class;",
        "billingClientClazz",
        "billingClientBuilderClazz",
        "purchasesUpdatedListenerClazz",
        "a",
        "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isServiceConnected",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "()Ljava/util/concurrent/atomic/AtomicBoolean;",
        "",
        "",
        "Lorg/json/JSONObject;",
        "iapPurchaseDetailsMap",
        "Ljava/util/Map;",
        "getIapPurchaseDetailsMap",
        "()Ljava/util/Map;",
        "subsPurchaseDetailsMap",
        "getSubsPurchaseDetailsMap",
        "productDetailsMap",
        "getProductDetailsMap",
        "kotlin.jvm.PlatformType",
        "TAG",
        "Ljava/lang/String;",
        "instance",
        "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    const-class v0, Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "newBuilder"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v1, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "setListener"

    .line 16
    .line 17
    .line 18
    filled-new-array {p4}, [Ljava/lang/Class;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-static {p3, v1, v2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    new-array v3, v2, [Ljava/lang/Class;

    .line 27
    .line 28
    const-string v4, "enablePendingPurchases"

    .line 29
    .line 30
    .line 31
    invoke-static {p3, v4, v3}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    const-string v4, "build"

    .line 35
    .line 36
    new-array v5, v2, [Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p3, v4, v5}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    move-result-object v4

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-static {p2, v0, v5, p1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    filled-new-array {p4}, [Ljava/lang/Class;

    .line 66
    move-result-object p4

    .line 67
    .line 68
    .line 69
    invoke-static {p2, p4, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    .line 73
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 74
    move-result-object p2

    .line 75
    .line 76
    .line 77
    invoke-static {p3, v1, p1, p2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    if-nez p1, :cond_1

    .line 81
    return-object v5

    .line 82
    .line 83
    :cond_1
    new-array p2, v2, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-static {p3, v3, p1, p2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    new-array p2, v2, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {p3, v4, p1, p2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_2
    :goto_0
    return-object v5
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
.end method

.method public final b(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;
    .locals 44

    .line 1
    .line 2
    const-string v0, "com.android.billingclient.api.BillingClient"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    move-result-object v3

    .line 7
    .line 8
    const-string v0, "com.android.billingclient.api.Purchase"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    const-string v0, "com.android.billingclient.api.ProductDetails"

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    const-string v0, "com.android.billingclient.api.PurchaseHistoryRecord"

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    move-result-object v6

    .line 25
    .line 26
    const-string v0, "com.android.billingclient.api.QueryProductDetailsParams$Product"

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    move-result-object v7

    .line 31
    .line 32
    const-string v0, "com.android.billingclient.api.BillingResult"

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    move-result-object v8

    .line 37
    .line 38
    const-string v0, "com.android.billingclient.api.QueryProductDetailsParams"

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    move-result-object v9

    .line 43
    .line 44
    const-string v0, "com.android.billingclient.api.QueryPurchaseHistoryParams"

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    move-result-object v10

    .line 49
    .line 50
    const-string v0, "com.android.billingclient.api.QueryPurchasesParams"

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 54
    move-result-object v11

    .line 55
    .line 56
    const-string v0, "com.android.billingclient.api.QueryProductDetailsParams$Builder"

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 60
    move-result-object v12

    .line 61
    .line 62
    const-string v0, "com.android.billingclient.api.QueryPurchaseHistoryParams$Builder"

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    move-result-object v13

    .line 67
    .line 68
    const-string v0, "com.android.billingclient.api.QueryPurchasesParams$Builder"

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    move-result-object v14

    .line 73
    .line 74
    const-string v0, "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder"

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 78
    move-result-object v15

    .line 79
    .line 80
    const-string v0, "com.android.billingclient.api.BillingClient$Builder"

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    const-string v1, "com.android.billingclient.api.PurchasesUpdatedListener"

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    const-string v2, "com.android.billingclient.api.BillingClientStateListener"

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 96
    move-result-object v16

    .line 97
    .line 98
    const-string v2, "com.android.billingclient.api.ProductDetailsResponseListener"

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    const-string v17, "com.android.billingclient.api.PurchasesResponseListener"

    .line 105
    .line 106
    move-object/from16 v18, v0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v17 .. v17}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    const-string v17, "com.android.billingclient.api.PurchaseHistoryResponseListener"

    .line 113
    .line 114
    move-object/from16 v19, v1

    .line 115
    .line 116
    .line 117
    invoke-static/range {v17 .. v17}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    move-object/from16 v17, v8

    .line 121
    .line 122
    const-string v8, "Failed to create Google Play billing library wrapper for in-app purchase auto-logging"

    .line 123
    .line 124
    const/16 v20, 0x0

    .line 125
    .line 126
    if-eqz v3, :cond_0

    .line 127
    .line 128
    if-eqz v4, :cond_0

    .line 129
    .line 130
    if-eqz v5, :cond_0

    .line 131
    .line 132
    if-eqz v6, :cond_0

    .line 133
    .line 134
    if-eqz v7, :cond_0

    .line 135
    .line 136
    if-eqz v17, :cond_0

    .line 137
    .line 138
    if-eqz v9, :cond_0

    .line 139
    .line 140
    if-eqz v10, :cond_0

    .line 141
    .line 142
    if-eqz v11, :cond_0

    .line 143
    .line 144
    if-eqz v12, :cond_0

    .line 145
    .line 146
    if-eqz v13, :cond_0

    .line 147
    .line 148
    if-eqz v14, :cond_0

    .line 149
    .line 150
    if-eqz v15, :cond_0

    .line 151
    .line 152
    if-eqz v18, :cond_0

    .line 153
    .line 154
    if-eqz v19, :cond_0

    .line 155
    .line 156
    if-eqz v16, :cond_0

    .line 157
    .line 158
    if-eqz v2, :cond_0

    .line 159
    .line 160
    if-eqz v0, :cond_0

    .line 161
    .line 162
    if-nez v1, :cond_1

    .line 163
    :cond_0
    move-object v1, v8

    .line 164
    .line 165
    goto/16 :goto_1

    .line 166
    .line 167
    :cond_1
    move-object/from16 v21, v8

    .line 168
    .line 169
    .line 170
    const-string/jumbo v8, "queryPurchasesAsync"

    .line 171
    .line 172
    move-object/from16 v22, v5

    .line 173
    .line 174
    .line 175
    filled-new-array {v11, v0}, [Ljava/lang/Class;

    .line 176
    move-result-object v5

    .line 177
    .line 178
    .line 179
    invoke-static {v3, v8, v5}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    move-result-object v5

    .line 181
    const/4 v8, 0x0

    .line 182
    .line 183
    move-object/from16 v23, v0

    .line 184
    .line 185
    new-array v0, v8, [Ljava/lang/Class;

    .line 186
    .line 187
    move-object/from16 v24, v5

    .line 188
    .line 189
    const-string v5, "newBuilder"

    .line 190
    .line 191
    .line 192
    invoke-static {v11, v5, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    move-object/from16 v25, v0

    .line 196
    .line 197
    new-array v0, v8, [Ljava/lang/Class;

    .line 198
    .line 199
    const-string v8, "build"

    .line 200
    .line 201
    .line 202
    invoke-static {v14, v8, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    const-class v27, Ljava/lang/String;

    .line 206
    .line 207
    move-object/from16 v28, v0

    .line 208
    .line 209
    .line 210
    filled-new-array/range {v27 .. v27}, [Ljava/lang/Class;

    .line 211
    move-result-object v0

    .line 212
    .line 213
    move-object/from16 v29, v11

    .line 214
    .line 215
    .line 216
    const-string/jumbo v11, "setProductType"

    .line 217
    .line 218
    .line 219
    invoke-static {v14, v11, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    move-object/from16 v30, v0

    .line 223
    .line 224
    move-object/from16 v26, v14

    .line 225
    const/4 v0, 0x0

    .line 226
    .line 227
    new-array v14, v0, [Ljava/lang/Class;

    .line 228
    .line 229
    const-string v0, "getOriginalJson"

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v0, v14}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 233
    move-result-object v14

    .line 234
    .line 235
    move-object/from16 v32, v4

    .line 236
    .line 237
    .line 238
    const-string/jumbo v4, "queryPurchaseHistoryAsync"

    .line 239
    .line 240
    move-object/from16 v33, v14

    .line 241
    .line 242
    .line 243
    filled-new-array {v10, v1}, [Ljava/lang/Class;

    .line 244
    move-result-object v14

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v4, v14}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 248
    move-result-object v4

    .line 249
    .line 250
    move-object/from16 v31, v1

    .line 251
    const/4 v14, 0x0

    .line 252
    .line 253
    new-array v1, v14, [Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v10, v5, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 257
    move-result-object v1

    .line 258
    .line 259
    move-object/from16 v34, v1

    .line 260
    .line 261
    new-array v1, v14, [Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v13, v8, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    move-object/from16 v35, v1

    .line 268
    .line 269
    .line 270
    filled-new-array/range {v27 .. v27}, [Ljava/lang/Class;

    .line 271
    move-result-object v1

    .line 272
    .line 273
    .line 274
    invoke-static {v13, v11, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 275
    move-result-object v1

    .line 276
    .line 277
    move-object/from16 v36, v1

    .line 278
    .line 279
    new-array v1, v14, [Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v6, v0, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 283
    move-result-object v0

    .line 284
    .line 285
    .line 286
    const-string/jumbo v1, "queryProductDetailsAsync"

    .line 287
    .line 288
    move-object/from16 v37, v0

    .line 289
    .line 290
    .line 291
    filled-new-array {v9, v2}, [Ljava/lang/Class;

    .line 292
    move-result-object v0

    .line 293
    .line 294
    .line 295
    invoke-static {v3, v1, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 296
    move-result-object v0

    .line 297
    .line 298
    new-array v1, v14, [Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {v9, v5, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    move-object/from16 v38, v0

    .line 305
    .line 306
    new-array v0, v14, [Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-static {v12, v8, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 310
    move-result-object v0

    .line 311
    .line 312
    const-class v39, Ljava/util/List;

    .line 313
    .line 314
    .line 315
    filled-new-array/range {v39 .. v39}, [Ljava/lang/Class;

    .line 316
    move-result-object v14

    .line 317
    .line 318
    move-object/from16 v39, v0

    .line 319
    .line 320
    .line 321
    const-string/jumbo v0, "setProductList"

    .line 322
    .line 323
    .line 324
    invoke-static {v12, v0, v14}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 325
    move-result-object v0

    .line 326
    .line 327
    move-object/from16 v40, v0

    .line 328
    const/4 v14, 0x0

    .line 329
    .line 330
    new-array v0, v14, [Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-static {v7, v5, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 334
    move-result-object v0

    .line 335
    .line 336
    new-array v5, v14, [Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-static {v15, v8, v5}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 340
    move-result-object v5

    .line 341
    .line 342
    .line 343
    const-string/jumbo v8, "setProductId"

    .line 344
    .line 345
    .line 346
    filled-new-array/range {v27 .. v27}, [Ljava/lang/Class;

    .line 347
    move-result-object v14

    .line 348
    .line 349
    .line 350
    invoke-static {v15, v8, v14}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 351
    move-result-object v8

    .line 352
    .line 353
    .line 354
    filled-new-array/range {v27 .. v27}, [Ljava/lang/Class;

    .line 355
    move-result-object v14

    .line 356
    .line 357
    .line 358
    invoke-static {v15, v11, v14}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 359
    move-result-object v11

    .line 360
    .line 361
    .line 362
    const-string/jumbo v14, "toString"

    .line 363
    .line 364
    move-object/from16 v27, v0

    .line 365
    .line 366
    move-object/from16 v41, v1

    .line 367
    const/4 v0, 0x0

    .line 368
    .line 369
    new-array v1, v0, [Ljava/lang/Class;

    .line 370
    .line 371
    move-object/from16 v0, v22

    .line 372
    .line 373
    .line 374
    invoke-static {v0, v14, v1}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 375
    move-result-object v1

    .line 376
    .line 377
    .line 378
    const-string/jumbo v14, "startConnection"

    .line 379
    .line 380
    .line 381
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Class;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    .line 385
    invoke-static {v3, v14, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 386
    move-result-object v0

    .line 387
    .line 388
    const-string v14, "getResponseCode"

    .line 389
    .line 390
    move-object/from16 v43, v0

    .line 391
    const/4 v0, 0x0

    .line 392
    .line 393
    new-array v0, v0, [Ljava/lang/Class;

    .line 394
    .line 395
    move-object/from16 v42, v1

    .line 396
    .line 397
    move-object/from16 v1, v17

    .line 398
    .line 399
    .line 400
    invoke-static {v1, v14, v0}, Lcom/facebook/appevents/iap/InAppPurchaseUtils;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 401
    move-result-object v0

    .line 402
    .line 403
    if-eqz v24, :cond_4

    .line 404
    .line 405
    if-eqz v25, :cond_4

    .line 406
    .line 407
    if-eqz v28, :cond_4

    .line 408
    .line 409
    if-eqz v30, :cond_4

    .line 410
    .line 411
    if-eqz v33, :cond_4

    .line 412
    .line 413
    if-eqz v4, :cond_4

    .line 414
    .line 415
    if-eqz v34, :cond_4

    .line 416
    .line 417
    if-eqz v35, :cond_4

    .line 418
    .line 419
    if-eqz v36, :cond_4

    .line 420
    .line 421
    if-eqz v37, :cond_4

    .line 422
    .line 423
    if-eqz v38, :cond_4

    .line 424
    .line 425
    if-eqz v41, :cond_4

    .line 426
    .line 427
    if-eqz v39, :cond_4

    .line 428
    .line 429
    if-eqz v40, :cond_4

    .line 430
    .line 431
    if-eqz v27, :cond_4

    .line 432
    .line 433
    if-eqz v5, :cond_4

    .line 434
    .line 435
    if-eqz v8, :cond_4

    .line 436
    .line 437
    if-eqz v11, :cond_4

    .line 438
    .line 439
    if-eqz v42, :cond_4

    .line 440
    .line 441
    if-eqz v43, :cond_4

    .line 442
    .line 443
    if-nez v0, :cond_2

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :cond_2
    move-object/from16 v14, v18

    .line 448
    .line 449
    move-object/from16 v18, v1

    .line 450
    move-object v1, v14

    .line 451
    .line 452
    move-object/from16 v14, v19

    .line 453
    .line 454
    move-object/from16 v19, v2

    .line 455
    move-object v2, v14

    .line 456
    .line 457
    move-object/from16 v14, p0

    .line 458
    .line 459
    move-object/from16 v17, v0

    .line 460
    .line 461
    move-object/from16 v0, p1

    .line 462
    .line 463
    .line 464
    invoke-virtual {v14, v0, v3, v1, v2}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 465
    move-result-object v2

    .line 466
    .line 467
    if-nez v2, :cond_3

    .line 468
    .line 469
    .line 470
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->h()Ljava/lang/String;

    .line 471
    move-result-object v0

    .line 472
    .line 473
    const-string v1, "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging"

    .line 474
    .line 475
    .line 476
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 477
    return-object v20

    .line 478
    .line 479
    :cond_3
    new-instance v1, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;

    .line 480
    .line 481
    move-object/from16 v20, v24

    .line 482
    .line 483
    move-object/from16 v24, v33

    .line 484
    .line 485
    move-object/from16 v33, v40

    .line 486
    .line 487
    move-object/from16 v40, v17

    .line 488
    .line 489
    move-object/from16 v17, v19

    .line 490
    .line 491
    move-object/from16 v19, v31

    .line 492
    .line 493
    move-object/from16 v31, v41

    .line 494
    .line 495
    const/16 v41, 0x0

    .line 496
    .line 497
    move-object/from16 v14, v37

    .line 498
    .line 499
    move-object/from16 v37, v11

    .line 500
    .line 501
    move-object/from16 v11, v29

    .line 502
    .line 503
    move-object/from16 v29, v14

    .line 504
    .line 505
    move-object/from16 v21, v25

    .line 506
    .line 507
    move-object/from16 v14, v26

    .line 508
    .line 509
    move-object/from16 v26, v34

    .line 510
    .line 511
    move-object/from16 v25, v4

    .line 512
    .line 513
    move-object/from16 v34, v27

    .line 514
    .line 515
    move-object/from16 v4, v32

    .line 516
    .line 517
    move-object/from16 v27, v35

    .line 518
    .line 519
    move-object/from16 v32, v39

    .line 520
    .line 521
    move-object/from16 v39, v43

    .line 522
    .line 523
    move-object/from16 v35, v5

    .line 524
    .line 525
    move-object/from16 v5, v22

    .line 526
    .line 527
    move-object/from16 v22, v28

    .line 528
    .line 529
    move-object/from16 v28, v36

    .line 530
    .line 531
    move-object/from16 v36, v8

    .line 532
    .line 533
    move-object/from16 v8, v18

    .line 534
    .line 535
    move-object/from16 v18, v23

    .line 536
    .line 537
    move-object/from16 v23, v30

    .line 538
    .line 539
    move-object/from16 v30, v38

    .line 540
    .line 541
    move-object/from16 v38, v42

    .line 542
    .line 543
    .line 544
    invoke-direct/range {v1 .. v41}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 545
    .line 546
    .line 547
    invoke-static {v1}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->o(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;)V

    .line 548
    .line 549
    .line 550
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->e()Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;

    .line 551
    move-result-object v0

    .line 552
    return-object v0

    .line 553
    .line 554
    .line 555
    :cond_4
    :goto_0
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->h()Ljava/lang/String;

    .line 556
    move-result-object v0

    .line 557
    .line 558
    move-object/from16 v1, v21

    .line 559
    .line 560
    .line 561
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 562
    return-object v20

    .line 563
    .line 564
    .line 565
    :goto_1
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->h()Ljava/lang/String;

    .line 566
    move-result-object v0

    .line 567
    .line 568
    .line 569
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 570
    return-object v20
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public final getIapPurchaseDetailsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->d()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final declared-synchronized getOrCreateInstance(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "context"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->e()Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;->b(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;

    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public final getProductDetailsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->f()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final getSubsPurchaseDetailsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->g()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Method;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p3, "proxy"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string p1, "m"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
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
.end method

.method public final isServiceConnected()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;->i()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
