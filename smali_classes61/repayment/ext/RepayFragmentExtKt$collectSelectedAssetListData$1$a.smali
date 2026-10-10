.class public final Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;
.super Ljava/lang/Object;
.source "RepayFragmentExt.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepayFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayFragmentExt.kt\nrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,139:1\n254#2:140\n*S KotlinDebug\n*F\n+ 1 RepayFragmentExt.kt\nrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$1\n*L\n83#1:140\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lrepayment/UnifiedRepayFragment;


# direct methods
.method public constructor <init>(Lrepayment/UnifiedRepayFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->b:Lrepayment/UnifiedRepayFragment;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lrepayment/UnifyAssetData;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->b:Lrepayment/UnifiedRepayFragment;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lrepayment/ext/RepayFragmentExtKt;->b(Lrepayment/UnifiedRepayFragment;)V

    .line 6
    .line 7
    iget-object p2, p0, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->b:Lrepayment/UnifiedRepayFragment;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lrepayment/f;->a(Ljava/util/List;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {p2, v0, p1}, Lrepayment/ext/e;->f(Lrepayment/UnifiedRepayFragment;Ljava/lang/String;Ljava/util/List;)V

    .line 15
    .line 16
    iget-object p2, p0, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->b:Lrepayment/UnifiedRepayFragment;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lrepayment/UnifiedRepayFragment;->r3()Ll60/e;

    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Ll60/e;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-static {p2, p1, v1}, Lrepayment/ext/e;->n(Lrepayment/UnifiedRepayFragment;Ljava/util/List;Z)V

    .line 38
    .line 39
    iget-object p1, p0, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->b:Lrepayment/UnifiedRepayFragment;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lrepayment/UnifiedRepayFragment;->u3()Lrepayment/RepayVM;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    sget-object p2, Lrepayment/a$a;->a:Lrepayment/a$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lrepayment/RepayVM;->D(Lrepayment/a;)V

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$a;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
