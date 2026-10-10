package na0;

import android.content.Intent;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: na0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C42791a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Intent m93781a(@NotNull Intent intent, int i11) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.setFlags(i11);
        return intent;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Intent m93782b(@NotNull Intent intent, @Nullable String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (str != null) {
            intent.setPackage(str);
        }
        return intent;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Intent m93783c(@NotNull Intent intent, @NotNull String name, @Nullable Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intent intentPutExtra = intent.putExtra(name, parcelable);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(name, config)");
        return intentPutExtra;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Intent m93784d(@NotNull Intent intent, @Nullable Map<String, ? extends Object> map) {
        Pair[] pairArr;
        Set<Map.Entry<String, ? extends Object>> setEntrySet;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(TuplesKt.m90091to(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            if (pairArr == null) {
                pairArr = new Pair[0];
            }
        }
        intent.putExtras(BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }
}
