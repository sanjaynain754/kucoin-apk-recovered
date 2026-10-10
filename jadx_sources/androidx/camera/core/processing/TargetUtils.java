package androidx.camera.core.processing;

import androidx.camera.core.impl.C1023h0;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class TargetUtils {
    public static int getNumberOfTargets(int i11) {
        int i12 = 0;
        while (i11 != 0) {
            i12 += i11 & 1;
            i11 >>= 1;
        }
        return i12;
    }

    public static boolean isSuperset(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static String getHumanReadableName(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return C1023h0.m1970a("|", arrayList);
    }

    private static String getHumanReadableNames(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + C1023h0.m1970a(", ", arrayList) + "]";
    }

    private TargetUtils() {
    }

    public static void checkSupportedTargets(Collection<Integer> collection, int i11) {
        Preconditions.checkArgument(collection.contains(Integer.valueOf(i11)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i11), getHumanReadableNames(collection)));
    }
}
