package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class ExpandButton extends Preference {
    private long mId;

    private void initLayout() {
        setLayoutResource(C3729R.layout.expand_button);
        setIcon(C3729R.drawable.ic_arrow_down_24dp);
        setTitle(C3729R.string.expand_button_title);
        setOrder(999);
    }

    private void setSummary(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence title = preference.getTitle();
            boolean z11 = preference instanceof PreferenceGroup;
            if (z11 && !TextUtils.isEmpty(title)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z11) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(title)) {
                string = string == null ? title : getContext().getString(C3729R.string.summary_collapsed_preference_list, string, title);
            }
        }
        setSummary(string);
    }

    @Override // androidx.preference.Preference
    public long getId() {
        return this.mId;
    }

    public ExpandButton(@NonNull Context context, List<Preference> list, long j11) {
        super(context);
        initLayout();
        setSummary(list);
        this.mId = j11 + 1000000;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }
}
