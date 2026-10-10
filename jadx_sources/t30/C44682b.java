package t30;

import android.content.Context;
import android.widget.ImageView;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: t30.b */
/* JADX INFO: compiled from: RtlOrderUtils.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001aB\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f0\u000b*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\r"}, m90084d2 = {"isRtl", "", "Landroid/content/Context;", "mirrorAmountIfRtl", "", "ctx", "mirrorRatioIfRtl", "applyChartMirrorIfRtl", "", "Landroid/widget/ImageView;", "mirrorOrderIfRtl", "", "Lkotlin/Triple;", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRtlOrderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RtlOrderUtils.kt\ncom/kubi/tradebase/utils/RtlOrderUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1563#2:57\n1634#2,3:58\n*S KotlinDebug\n*F\n+ 1 RtlOrderUtils.kt\ncom/kubi/tradebase/utils/RtlOrderUtilsKt\n*L\n51#1:57\n51#1:58,3\n*E\n"})
public final class C44682b {
    /* JADX INFO: renamed from: a */
    public static final void m98836a(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setScaleX(m98837b(context) ? -1.0f : 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m98837b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m98838c(@NotNull String str, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (!m98837b(ctx)) {
            return str;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) str).toString(), new String[]{C33627eb.f69716f}, false, 0, 6, (Object) null);
        return listSplit$default.size() >= 2 ? CollectionsKt.joinToString$default(CollectionsKt.reversed(listSplit$default), C33627eb.f69716f, null, null, 0, null, null, 62, null) : str;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final List<Triple<String, String, String>> m98839d(@NotNull List<Triple<String, String, String>> list, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (m98837b(ctx)) {
            list = CollectionsKt.reversed(list);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            arrayList.add(new Triple((String) triple.component1(), m98838c((String) triple.component2(), ctx), m98840e((String) triple.component3(), ctx)));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m98840e(@NotNull String str, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (!m98837b(ctx)) {
            return str;
        }
        String string = StringsKt.trim((CharSequence) str).toString();
        if (!StringsKt.endsWith$default(string, "%", false, 2, (Object) null)) {
            return string;
        }
        return '%' + StringsKt.dropLast(string, 1);
    }
}
