package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes34.dex */
class DexProfileData {

    @NonNull
    final String apkName;
    int classSetSize;

    @NonNull
    int[] classes;
    final long dexChecksum;

    @NonNull
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;

    @NonNull
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    public DexProfileData(@NonNull String str, @NonNull String str2, long j11, long j12, int i11, int i12, int i13, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j11;
        this.mTypeIdCount = j12;
        this.classSetSize = i11;
        this.hotMethodRegionSize = i12;
        this.numMethodIds = i13;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
