package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.OutConfig;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class DualOutConfig {
    public abstract OutConfig getPrimaryOutConfig();

    public abstract OutConfig getSecondaryOutConfig();

    /* JADX INFO: renamed from: of */
    public static DualOutConfig m2037of(OutConfig outConfig, OutConfig outConfig2) {
        return new AutoValue_DualOutConfig(outConfig, outConfig2);
    }
}
