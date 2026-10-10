package androidx.camera.camera2.internal;

import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.AutoValue_SupportedSurfaceCombination_BestSizesAndMaxFpsForConfigs */
/* JADX INFO: loaded from: classes23.dex */
final class C0693xf44dce2 extends SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs {
    private final List<Size> bestSizes;
    private final List<Size> bestSizesForStreamUseCase;
    private final int maxFpsForAllSizes;
    private final int maxFpsForBestSizes;
    private final int maxFpsForStreamUseCase;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs) {
            SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs) obj;
            List<Size> list = this.bestSizes;
            if (list != null ? list.equals(bestSizesAndMaxFpsForConfigs.getBestSizes()) : bestSizesAndMaxFpsForConfigs.getBestSizes() == null) {
                List<Size> list2 = this.bestSizesForStreamUseCase;
                if (list2 != null ? list2.equals(bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase()) : bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase() == null) {
                    if (this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes() && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.getMaxFpsForStreamUseCase() && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.getMaxFpsForAllSizes()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs
    public List<Size> getBestSizes() {
        return this.bestSizes;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs
    public List<Size> getBestSizesForStreamUseCase() {
        return this.bestSizesForStreamUseCase;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs
    public int getMaxFpsForAllSizes() {
        return this.maxFpsForAllSizes;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs
    public int getMaxFpsForBestSizes() {
        return this.maxFpsForBestSizes;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs
    public int getMaxFpsForStreamUseCase() {
        return this.maxFpsForStreamUseCase;
    }

    public int hashCode() {
        List<Size> list = this.bestSizes;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.bestSizesForStreamUseCase;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.maxFpsForBestSizes) * 1000003) ^ this.maxFpsForStreamUseCase) * 1000003) ^ this.maxFpsForAllSizes;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.bestSizes + ", bestSizesForStreamUseCase=" + this.bestSizesForStreamUseCase + ", maxFpsForBestSizes=" + this.maxFpsForBestSizes + ", maxFpsForStreamUseCase=" + this.maxFpsForStreamUseCase + ", maxFpsForAllSizes=" + this.maxFpsForAllSizes + "}";
    }

    public C0693xf44dce2(List<Size> list, List<Size> list2, int i11, int i12, int i13) {
        this.bestSizes = list;
        this.bestSizesForStreamUseCase = list2;
        this.maxFpsForBestSizes = i11;
        this.maxFpsForStreamUseCase = i12;
        this.maxFpsForAllSizes = i13;
    }
}
