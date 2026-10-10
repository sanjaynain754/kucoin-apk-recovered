.class public final Lcom/revolut/revolutpay/polling/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/polling/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/polling/a$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revolut/revolutpay/polling/a$a;",
        "Landroidx/lifecycle/LifecycleEventObserver;",
        "<init>",
        "(Lcom/revolut/revolutpay/polling/a;)V",
        "Landroidx/lifecycle/LifecycleOwner;",
        "source",
        "Landroidx/lifecycle/Lifecycle$Event;",
        "event",
        "",
        "onStateChanged",
        "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V",
        "revolut_pay_sdk_2_0_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/revolut/revolutpay/polling/a;


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/polling/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/polling/a$a;->b:Lcom/revolut/revolutpay/polling/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 25
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "source"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string p1, "event"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object p1, Lcom/revolut/revolutpay/polling/a$a$a;->a:[I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 17
    move-result p2

    .line 18
    .line 19
    aget p1, p1, p2

    .line 20
    const/4 p2, 0x1

    .line 21
    .line 22
    const-string v0, "callbackMap.keys"

    .line 23
    .line 24
    if-eq p1, p2, :cond_3

    .line 25
    const/4 p2, 0x2

    .line 26
    .line 27
    if-eq p1, p2, :cond_2

    .line 28
    const/4 p2, 0x3

    .line 29
    .line 30
    if-eq p1, p2, :cond_1

    .line 31
    const/4 p2, 0x4

    .line 32
    .line 33
    if-eq p1, p2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_0
    iget-object p1, p0, Lcom/revolut/revolutpay/polling/a$a;->b:Lcom/revolut/revolutpay/polling/a;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/revolut/revolutpay/polling/a;->a(Lcom/revolut/revolutpay/polling/a;)Ljava/util/WeakHashMap;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result p2

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    check-cast p2, Lcom/revolut/revolutpay/polling/c;

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Lcom/revolut/revolutpay/polling/c;->onDestroy()V

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_1
    iget-object p1, p0, Lcom/revolut/revolutpay/polling/a$a;->b:Lcom/revolut/revolutpay/polling/a;

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lcom/revolut/revolutpay/polling/a;->a(Lcom/revolut/revolutpay/polling/a;)Ljava/util/WeakHashMap;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    move-result p2

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    move-result-object p2

    .line 96
    .line 97
    check-cast p2, Lcom/revolut/revolutpay/polling/c;

    .line 98
    .line 99
    .line 100
    invoke-interface {p2}, Lcom/revolut/revolutpay/polling/c;->onStop()V

    .line 101
    goto :goto_1

    .line 102
    .line 103
    :cond_2
    iget-object p1, p0, Lcom/revolut/revolutpay/polling/a$a;->b:Lcom/revolut/revolutpay/polling/a;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lcom/revolut/revolutpay/polling/a;->a(Lcom/revolut/revolutpay/polling/a;)Ljava/util/WeakHashMap;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    move-result p2

    .line 123
    .line 124
    if-eqz p2, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    move-result-object p2

    .line 129
    .line 130
    check-cast p2, Lcom/revolut/revolutpay/polling/c;

    .line 131
    .line 132
    .line 133
    invoke-interface {p2}, Lcom/revolut/revolutpay/polling/c;->b()V

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_3
    iget-object p1, p0, Lcom/revolut/revolutpay/polling/a$a;->b:Lcom/revolut/revolutpay/polling/a;

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lcom/revolut/revolutpay/polling/a;->a(Lcom/revolut/revolutpay/polling/a;)Ljava/util/WeakHashMap;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    .line 154
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    move-result p2

    .line 156
    .line 157
    if-eqz p2, :cond_4

    .line 158
    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    check-cast p2, Lcom/revolut/revolutpay/polling/c;

    .line 164
    .line 165
    .line 166
    invoke-interface {p2}, Lcom/revolut/revolutpay/polling/c;->a()V

    .line 167
    goto :goto_3

    .line 168
    :cond_4
    :goto_4
    return-void
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
