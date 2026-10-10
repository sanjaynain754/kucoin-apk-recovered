.class public final Lcom/sumsub/sns/core/presentation/form/viewadapter/v;
.super Lcom/sumsub/sns/core/presentation/form/viewadapter/o;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final d:Lcom/sumsub/sns/core/presentation/form/a;

.field public e:Lcom/sumsub/sns/internal/core/presentation/form/model/E;

.field public f:Lcom/sumsub/sns/internal/core/presentation/form/model/E;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;-><init>(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/core/presentation/form/a;Lcom/sumsub/sns/core/presentation/form/d;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->d:Lcom/sumsub/sns/core/presentation/form/a;

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
.end method

.method public static final a(Lcom/sumsub/sns/core/widget/PhoneKit;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->getMask()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 21
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;

    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/j0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 22
    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/widget/PhoneKit;Lcom/sumsub/sns/core/presentation/form/viewadapter/v;Lcom/sumsub/sns/internal/core/presentation/form/model/O;Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;Ljava/lang/String;)Lkotlin/Unit;
    .locals 6

    .line 24
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "textChangedCallback: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "SNSApplicantDataPhoneFieldView"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->getCountry()Lcom/sumsub/sns/internal/features/presentation/country/b;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    .line 26
    iget-object v1, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz v1, :cond_1

    .line 27
    iget-object v2, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->e:Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    if-nez v2, :cond_0

    move-object v2, v0

    .line 28
    :cond_0
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 29
    invoke-interface {v1, v2, p4}, Lcom/sumsub/sns/core/presentation/form/a;->c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->getMask()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 31
    iget-object p4, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p4, :cond_3

    .line 32
    iget-object v1, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->f:Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 33
    :goto_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->a:Ljava/lang/String;

    .line 34
    invoke-interface {p4, v0, p0}, Lcom/sumsub/sns/core/presentation/form/a;->c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 35
    :cond_3
    iget-object p0, p1, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->d:Lcom/sumsub/sns/core/presentation/form/a;

    if-eqz p0, :cond_4

    .line 36
    invoke-static {p3, p2}, Lcom/sumsub/sns/core/presentation/form/g;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    move-result-object p1

    .line 37
    invoke-interface {p0, p2, p1}, Lcom/sumsub/sns/core/presentation/form/a;->c(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V

    .line 38
    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/widget/PhoneKit;)Z
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/PhoneKit;->isValid()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/O;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/O;)V
    .locals 8

    .line 2
    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/form/model/b;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->e:Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 3
    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/form/model/b;->b(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/v;->f:Lcom/sumsub/sns/internal/core/presentation/form/model/E;

    .line 4
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->f:Ljava/util/Map;

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 7
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 8
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/country/b;

    invoke-direct {v4, v3, v2}, Lcom/sumsub/sns/internal/features/presentation/country/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 11
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->clear()V

    .line 12
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;->getPhoneInputLayout()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v1

    .line 13
    iget-object v2, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->f:Ljava/util/Map;

    .line 14
    iget-object v3, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->g:Ljava/util/Map;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 15
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneKitProviderKt;->getPhoneKit$default(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;ILjava/lang/Object;)Lcom/sumsub/sns/core/widget/PhoneKit;

    move-result-object v0

    .line 16
    new-instance v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/q0;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/presentation/form/viewadapter/q0;-><init>(Lcom/sumsub/sns/core/widget/PhoneKit;)V

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;->setPhoneNumberPurifier(Lkotlin/jvm/functions/Function1;)V

    .line 17
    iget-boolean v1, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->i:Z

    if-nez v1, :cond_2

    .line 18
    new-instance v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/r0;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/presentation/form/viewadapter/r0;-><init>(Lcom/sumsub/sns/core/widget/PhoneKit;)V

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;->setPhoneNumberValidator(Lkotlin/jvm/functions/Function0;)V

    .line 19
    :cond_2
    new-instance v1, Lcom/sumsub/sns/core/presentation/form/viewadapter/s0;

    invoke-direct {v1, v0, p0, p2, p1}, Lcom/sumsub/sns/core/presentation/form/viewadapter/s0;-><init>(Lcom/sumsub/sns/core/widget/PhoneKit;Lcom/sumsub/sns/core/presentation/form/viewadapter/v;Lcom/sumsub/sns/internal/core/presentation/form/model/O;Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;)V

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->setTextChangedCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final b(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;

    .line 3
    .line 4
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;

    .line 5
    .line 6
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/form/model/O;->f:Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/form/viewadapter/o;->b:Lcom/sumsub/sns/core/presentation/form/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lcom/sumsub/sns/core/presentation/form/d;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->getValue()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/form/viewutils/c;->a(Lcom/sumsub/sns/internal/core/presentation/form/model/O;)Ljava/lang/String;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    if-nez p2, :cond_3

    .line 40
    :goto_0
    return-void

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;->updateValueSilently(Ljava/lang/String;)V

    .line 44
    return-void
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
.end method
