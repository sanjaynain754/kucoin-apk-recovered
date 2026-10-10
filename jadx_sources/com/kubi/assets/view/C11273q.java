package com.kubi.assets.view;

import android.content.Context;
import com.kubi.assets.exception.AssetsException;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.chart.data.DataPoint;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.view.q */
/* JADX INFO: compiled from: AccountInfoHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\bH\u0000¨\u0006\t"}, m90084d2 = {"lineColor", "", "context", "Landroid/content/Context;", "dataPointList", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "getPrecision", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountInfoHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoHeaderView.kt\ncom/kubi/assets/view/AccountInfoHeaderViewKt\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,673:1\n44#2,2:674\n*S KotlinDebug\n*F\n+ 1 AccountInfoHeaderView.kt\ncom/kubi/assets/view/AccountInfoHeaderViewKt\n*L\n651#1:674,2\n*E\n"})
public final class C11273q {
    /* JADX INFO: renamed from: b */
    public static final int m20046b(@Nullable String str) {
        if (str == null) {
            return 8;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 74235) {
            return !str.equals("KCS") ? 8 : 3;
        }
        if (iHashCode != 2614173) {
            return (iHashCode == 2614190 && str.equals("USDT")) ? 2 : 8;
        }
        return !str.equals("USDC") ? 8 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m20047c(Context context, List<DataPoint> list) {
        double value;
        try {
            DataPoint dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) list);
            double value2 = 0.0d;
            if (dataPoint != null) {
                value = dataPoint.getValue();
            } else {
                value = 0.0d;
            }
            DataPoint dataPoint2 = (DataPoint) CollectionsKt.lastOrNull((List) list);
            if (dataPoint2 != null) {
                value2 = dataPoint2.getValue();
            }
            if (value2 < value) {
                return C22890g.m54289n(context);
            }
            return C22890g.m54291p(context);
        } catch (Throwable th2) {
            C43846g.m96568c(new AssetsException(th2, "AssetLineChart", false, null, 8, null), null, 2, null);
            return C22890g.m54291p(context);
        }
    }
}
