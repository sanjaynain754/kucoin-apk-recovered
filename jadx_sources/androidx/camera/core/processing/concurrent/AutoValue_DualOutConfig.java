package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.OutConfig;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_DualOutConfig extends DualOutConfig {
    private final OutConfig primaryOutConfig;
    private final OutConfig secondaryOutConfig;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DualOutConfig) {
            DualOutConfig dualOutConfig = (DualOutConfig) obj;
            if (this.primaryOutConfig.equals(dualOutConfig.getPrimaryOutConfig()) && this.secondaryOutConfig.equals(dualOutConfig.getSecondaryOutConfig())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public OutConfig getPrimaryOutConfig() {
        return this.primaryOutConfig;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public OutConfig getSecondaryOutConfig() {
        return this.secondaryOutConfig;
    }

    public int hashCode() {
        return ((this.primaryOutConfig.hashCode() ^ 1000003) * 1000003) ^ this.secondaryOutConfig.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.primaryOutConfig + ", secondaryOutConfig=" + this.secondaryOutConfig + "}";
    }

    public AutoValue_DualOutConfig(OutConfig outConfig, OutConfig outConfig2) {
        if (outConfig != null) {
            this.primaryOutConfig = outConfig;
            if (outConfig2 != null) {
                this.secondaryOutConfig = outConfig2;
                return;
            }
            throw new NullPointerException("Null secondaryOutConfig");
        }
        throw new NullPointerException("Null primaryOutConfig");
    }
}
