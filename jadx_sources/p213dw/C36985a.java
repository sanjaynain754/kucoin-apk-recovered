package p213dw;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: dw.a */
/* JADX INFO: compiled from: BaseExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0005H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¨\u0006\u000f"}, m90084d2 = {"refreshRateInSeconds", "", "Landroid/content/Context;", "views", "", "Landroid/view/View;", "Landroid/view/ViewGroup;", "isAttachedToWindowCompat", "", "dp2px", "context", "logInfo", "", "msg", "", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseExtensions.kt\ncom/kubi/resources/shimmer/BaseExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1563#2:31\n1634#2,3:32\n*S KotlinDebug\n*F\n+ 1 BaseExtensions.kt\ncom/kubi/resources/shimmer/BaseExtensionsKt\n*L\n16#1:31\n16#1:32,3\n*E\n"})
public final class C36985a {
    /* JADX INFO: renamed from: a */
    public static final float m82803a(float f11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (f11 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m82804b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ViewCompat.isAttachedToWindow(view);
    }

    /* JADX INFO: renamed from: c */
    public static final void m82805c(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.d("SkeletonLayout", msg);
    }

    /* JADX INFO: renamed from: d */
    public static final float m82806d(@NotNull Context context) {
        Display defaultDisplay;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 60.0f;
        }
        return defaultDisplay.getRefreshRate();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<View> m82807e(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }
}
