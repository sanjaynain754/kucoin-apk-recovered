package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes34.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean mShouldUseGeneratedIds;

    @Override // androidx.preference.PreferenceGroup
    public boolean isOnSameScreenAsChildren() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.mShouldUseGeneratedIds = true;
    }

    public boolean shouldUseGeneratedIds() {
        return this.mShouldUseGeneratedIds;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener;
        if (getIntent() == null && getFragment() == null && getPreferenceCount() != 0 && (onNavigateToScreenListener = getPreferenceManager().getOnNavigateToScreenListener()) != null) {
            onNavigateToScreenListener.onNavigateToScreen(this);
        }
    }

    public void setShouldUseGeneratedIds(boolean z11) {
        if (!isAttached()) {
            this.mShouldUseGeneratedIds = z11;
            return;
        }
        throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
    }
}
