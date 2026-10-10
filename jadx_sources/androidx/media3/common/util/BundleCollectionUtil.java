package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class BundleCollectionUtil {
    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static ImmutableMap<String, String> bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ImmutableMap.m13458of() : ImmutableMap.copyOf((Map) bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> SparseArray<T> fromBundleSparseArray(Function<Bundle, T> function, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), function.apply(sparseArray.valueAt(i11)));
        }
        return sparseArray2;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, Function<T, Bundle> function) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, Function<T, Bundle> function) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), function.apply(sparseArray.valueAt(i11)));
        }
        return sparseArray2;
    }

    private BundleCollectionUtil() {
    }

    public static <T> ImmutableList<T> fromBundleList(Function<Bundle, T> function, List<Bundle> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.add(function.apply((Bundle) Assertions.checkNotNull(list.get(i11))));
        }
        return builder.build();
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        if (bundle3 != null) {
            return bundle3;
        }
        return bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        return arrayList;
    }

    public static <T> ImmutableList<Bundle> toBundleList(List<T> list, Function<T, Bundle> function) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.add(function.apply(list.get(i11)));
        }
        return builder.build();
    }
}
