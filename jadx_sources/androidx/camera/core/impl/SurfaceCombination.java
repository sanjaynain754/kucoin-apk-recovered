package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList;

    public SurfaceCombination() {
        this.mSurfaceConfigList = new ArrayList();
    }

    private static void generateArrangements(List<int[]> list, int i11, int[] iArr, int i12) {
        if (i12 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    iArr[i12] = i13;
                    generateArrangements(list, i11, iArr, i12 + 1);
                    break;
                } else if (i13 == iArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i11) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i11, new int[i11], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }

    public SurfaceCombination(SurfaceConfig... surfaceConfigArr) {
        ArrayList arrayList = new ArrayList();
        this.mSurfaceConfigList = arrayList;
        Collections.addAll(arrayList, surfaceConfigArr);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        int i11;
        boolean zIsSupported;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = elementsArrangements.iterator();
        do {
            i11 = 0;
            if (it.hasNext()) {
                int[] next = it.next();
                zIsSupported = true;
                while (i11 < this.mSurfaceConfigList.size()) {
                    if (next[i11] < list.size()) {
                        zIsSupported &= this.mSurfaceConfigList.get(i11).isSupported(list.get(next[i11]));
                        if (!zIsSupported) {
                            break;
                        }
                        surfaceConfigArr[next[i11]] = this.mSurfaceConfigList.get(i11);
                    }
                    i11++;
                }
            }
            if (i11 != 0) {
                return null;
            }
            return Arrays.asList(surfaceConfigArr);
        } while (!zIsSupported);
        i11 = 1;
        if (i11 != 0) {
            return null;
        }
        return Arrays.asList(surfaceConfigArr);
    }
}
