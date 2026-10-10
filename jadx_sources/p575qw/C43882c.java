package p575qw;

import android.graphics.Path;
import com.kubi.resources.widget.chart.data.DataPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p479nw.Label;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qw.c */
/* JADX INFO: compiled from: ListExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0010\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0018\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b\u001a\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, m90084d2 = {"limits", "Lkotlin/Pair;", "", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "toLabels", "Lcom/kubi/resources/widget/chart/data/Label;", "toLinePath", "Landroid/graphics/Path;", "toSmoothLinePath", "smoothFactor", "", "floatLimits", "si", "", "setSize", "i", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExt.kt\ncom/kubi/resources/widget/chart/extensions/ListExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1563#2:114\n1634#2,3:115\n1563#2:118\n1634#2,3:119\n*S KotlinDebug\n*F\n+ 1 ListExt.kt\ncom/kubi/resources/widget/chart/extensions/ListExtKt\n*L\n12#1:114\n12#1:115,3\n18#1:118\n18#1:119,3\n*E\n"})
public final class C43882c {
    /* JADX INFO: renamed from: a */
    public static final int m96651a(int i11, int i12) {
        int i13 = i11 - 1;
        if (i12 > i13) {
            return i13;
        }
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<Label> m96652b(@NotNull List<DataPoint> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Label(String.valueOf(((DataPoint) it.next()).getValue()), 0.0f, 0.0f, false, 0.0d, 24, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Path m96653c(@NotNull List<DataPoint> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Path path = new Path();
        DataPoint dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) list);
        float screenPositionX = dataPoint != null ? dataPoint.getScreenPositionX() : 0.0f;
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.firstOrNull((List) list);
        path.moveTo(screenPositionX, dataPoint2 != null ? dataPoint2.getScreenPositionY() : 0.0f);
        int size = list.size();
        for (int i11 = 1; i11 < size; i11++) {
            path.lineTo(list.get(i11).getScreenPositionX(), list.get(i11).getScreenPositionY());
        }
        return path;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Path m96654d(@NotNull List<DataPoint> list, float f11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Path path = new Path();
        DataPoint dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) list);
        float screenPositionX = dataPoint != null ? dataPoint.getScreenPositionX() : 0.0f;
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.firstOrNull((List) list);
        path.moveTo(screenPositionX, dataPoint2 != null ? dataPoint2.getScreenPositionY() : 0.0f);
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            float screenPositionX2 = list.get(i11).getScreenPositionX();
            float screenPositionY = list.get(i11).getScreenPositionY();
            int i12 = i11 + 1;
            float screenPositionX3 = list.get(i12).getScreenPositionX();
            float screenPositionY2 = list.get(i12).getScreenPositionY();
            int i13 = i11 - 1;
            int i14 = i11 + 2;
            path.cubicTo(screenPositionX2 + ((screenPositionX3 - list.get(m96651a(list.size(), i13)).getScreenPositionX()) * f11), screenPositionY + ((screenPositionY2 - list.get(m96651a(list.size(), i13)).getScreenPositionY()) * f11), screenPositionX3 - ((list.get(m96651a(list.size(), i14)).getScreenPositionX() - screenPositionX2) * f11), screenPositionY2 - ((list.get(m96651a(list.size(), i14)).getScreenPositionY() - screenPositionY) * f11), screenPositionX3, screenPositionY2);
            i11 = i12;
        }
        return path;
    }
}
