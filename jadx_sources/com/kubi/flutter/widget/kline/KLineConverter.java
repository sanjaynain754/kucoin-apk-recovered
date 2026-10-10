package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.SubIndexType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineConverter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "use MainIndexType")
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0006H\u0007J\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\u00020\u0006H\u0007J\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\b*\u00020\u0006H\u0007J\f\u0010\r\u001a\u00020\u000e*\u00020\u0006H\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineConverter;", "", "<init>", "()V", "toMainIndexType", "Lcom/kubi/flutter/proto/kline/MainIndexType;", "", "toMainIndexTypes", "", "toSubIndexType", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "toSubIndexTypesWithVol", "toSubIndexTypes", "toKlineType", "Lcom/kubi/flutter/widget/kline/KLineType;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineConverter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineConverter f22477a = new KLineConverter();

    @Deprecated(message = "use MainIndexType")
    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<MainIndexType> m24354b(int i11) {
        if (i11 == 0) {
            return CollectionsKt.listOf(MainIndexType.MA);
        }
        if (i11 != 1) {
            return i11 != 2 ? CollectionsKt.emptyList() : CollectionsKt.listOf(MainIndexType.BOLL);
        }
        return CollectionsKt.listOf(MainIndexType.EMA);
    }

    @Deprecated(message = "use SubIndexType")
    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<SubIndexType> m24355c(int i11) {
        if (i11 == 0) {
            return CollectionsKt.listOf(SubIndexType.MACD);
        }
        if (i11 != 1) {
            return i11 != 2 ? CollectionsKt.emptyList() : CollectionsKt.listOf(SubIndexType.RSI);
        }
        return CollectionsKt.listOf(SubIndexType.KDJ);
    }

    @Deprecated(message = "use SubIndexType")
    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<SubIndexType> m24356d(int i11) {
        if (i11 == 0) {
            return CollectionsKt.listOf((Object[]) new SubIndexType[]{SubIndexType.VOL, SubIndexType.MACD});
        }
        if (i11 != 1) {
            return i11 != 2 ? CollectionsKt.listOf(SubIndexType.VOL) : CollectionsKt.listOf((Object[]) new SubIndexType[]{SubIndexType.VOL, SubIndexType.RSI});
        }
        return CollectionsKt.listOf((Object[]) new SubIndexType[]{SubIndexType.VOL, SubIndexType.KDJ});
    }

    @Deprecated(message = "use KLineType")
    @NotNull
    /* JADX INFO: renamed from: a */
    public final KLineType m24353a(int i11) {
        switch (i11) {
            case 0:
            case 1:
                return KLineType.f22375e.getONE_MINUTE();
            case 2:
                return KLineType.f22375e.getFIVE_MINUTE();
            case 3:
                return KLineType.f22375e.getFIFTEEN_MINUTE();
            case 4:
                return KLineType.f22375e.getTHIRTY_MINUTE();
            case 5:
                return KLineType.f22375e.getONE_HOUR();
            case 6:
                return KLineType.f22375e.getTWO_HOUR();
            case 7:
                return KLineType.f22375e.getFOUR_HOUR();
            case 8:
                return KLineType.f22375e.getEIGHT_HOUR();
            case 9:
            default:
                return KLineType.f22375e.getONE_DAY();
            case 10:
                return KLineType.f22375e.getONE_WEEK();
            case 11:
                return KLineType.f22375e.getONE_MONTH();
        }
    }
}
