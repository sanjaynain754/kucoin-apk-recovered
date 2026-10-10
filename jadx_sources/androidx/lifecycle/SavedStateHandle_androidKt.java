package androidx.lifecycle;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: SavedStateHandle.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0003"}, m90084d2 = {"createMutuallyExclusiveErrorMessage", "", "key", "lifecycle-viewmodel-savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateHandle_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String createMutuallyExclusiveErrorMessage(String str) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + str + "', but not both.";
    }
}
