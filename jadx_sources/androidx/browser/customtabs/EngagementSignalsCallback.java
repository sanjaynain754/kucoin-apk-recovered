package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(@IntRange(from = 1, m1553to = 100) int i11, @NonNull Bundle bundle) {
    }

    default void onSessionEnded(boolean z11, @NonNull Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z11, @NonNull Bundle bundle) {
    }
}
