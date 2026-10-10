package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleItemKt$Dsl;
import com.kubi.utils.extensions.DowngradeExKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.i */
/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"convertToCandleItem", "Lcom/kubi/flutter/proto/kline/CandleItem;", "", "", "([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "LKLineWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineCommonDataInteractorsKt\n+ 2 CandleItemKt.kt\ncom/kubi/flutter/proto/kline/CandleItemKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n8#2:346\n1#3:347\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineCommonDataInteractorsKt\n*L\n115#1:346\n115#1:347\n*E\n"})
public final class C12789i {
    /* JADX INFO: renamed from: b */
    public static final CandleItem m24352b(String[] strArr) {
        CandleItemKt$Dsl.Companion companion = CandleItemKt$Dsl.f22073b;
        CandleItem.C12640b c12640bNewBuilder = CandleItem.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12640bNewBuilder, "newBuilder(...)");
        CandleItemKt$Dsl candleItemKt$Dsl_create = companion._create(c12640bNewBuilder);
        candleItemKt$Dsl_create.m23908f(DowngradeExKt.m66546p(strArr[0], 0L, 1, null));
        candleItemKt$Dsl_create.m23907e(DowngradeExKt.m66538h(strArr[1], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23904b(DowngradeExKt.m66538h(strArr[2], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23905c(DowngradeExKt.m66538h(strArr[3], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23906d(DowngradeExKt.m66538h(strArr[4], 0.0d, 1, null));
        if (strArr.length >= 7) {
            candleItemKt$Dsl_create.m23909g(DowngradeExKt.m66538h(strArr[6], 0.0d, 1, null));
        }
        return candleItemKt$Dsl_create.m23903a();
    }
}
