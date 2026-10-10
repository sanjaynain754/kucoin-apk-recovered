package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.content.res.TypedArrayUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {

    @Deprecated
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private PreferenceManager mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;
    private final DividerDecoration mDividerDecoration = new DividerDecoration();
    private int mLayoutResId = C3729R.layout.preference_list_fragment;
    private final Handler mHandler = new Handler() { // from class: androidx.preference.PreferenceFragment.1
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragment.this.bindPreferences();
        }
    };
    private final Runnable mRequestFocus = new Runnable() { // from class: androidx.preference.PreferenceFragment.2
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragment.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    public class DividerDecoration extends RecyclerView.ItemDecoration {
        private boolean mAllowDividerAfterLastItem = true;
        private Drawable mDivider;
        private int mDividerHeight;

        public DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (this.mDivider == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (shouldDrawDividerBelow(childAt, recyclerView)) {
                    int y11 = ((int) childAt.getY()) + childAt.getHeight();
                    this.mDivider.setBounds(0, y11, width, this.mDividerHeight + y11);
                    this.mDivider.draw(canvas);
                }
            }
        }

        public void setAllowDividerAfterLastItem(boolean z11) {
            this.mAllowDividerAfterLastItem = z11;
        }

        public void setDivider(@Nullable Drawable drawable) {
            if (drawable != null) {
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerHeight = 0;
            }
            this.mDivider = drawable;
            PreferenceFragment.this.mList.invalidateItemDecorations();
        }

        public void setDividerHeight(int i11) {
            this.mDividerHeight = i11;
            PreferenceFragment.this.mList.invalidateItemDecorations();
        }

        private boolean shouldDrawDividerBelow(@NonNull View view, @NonNull RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z11 = this.mAllowDividerAfterLastItem;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
                if (!(childViewHolder2 instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove()) {
                    return false;
                }
                return true;
            }
            return z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if (shouldDrawDividerBelow(view, recyclerView)) {
                rect.bottom = this.mDividerHeight;
            }
        }
    }

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(@NonNull PreferenceFragment preferenceFragment, @NonNull Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(@NonNull PreferenceFragment preferenceFragment, @NonNull PreferenceScreen preferenceScreen);
    }

    public static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {
        private final RecyclerView.Adapter<?> mAdapter;
        private final String mKey;
        private final RecyclerView mList;
        private final Preference mPreference;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i11, int i12) {
            scrollToPreference();
        }

        private void scrollToPreference() {
            this.mAdapter.unregisterAdapterDataObserver(this);
            Preference preference = this.mPreference;
            int preferenceAdapterPosition = preference != null ? ((PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(preference) : ((PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(this.mKey);
            if (preferenceAdapterPosition != -1) {
                this.mList.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i11, int i12, Object obj) {
            scrollToPreference();
        }

        public ScrollToPreferenceObserver(@NonNull RecyclerView.Adapter<?> adapter, @NonNull RecyclerView recyclerView, Preference preference, String str) {
            this.mAdapter = adapter;
            this.mList = recyclerView;
            this.mPreference = preference;
            this.mKey = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i11, int i12) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i11, int i12, int i13) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i11, int i12) {
            scrollToPreference();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Fragment getCallbackFragment() {
        return null;
    }

    @Deprecated
    public abstract void onCreatePreferences(@Nullable Bundle bundle, String str);

    @Deprecated
    public void scrollToPreference(@NonNull String str) {
        scrollToPreferenceInternal(null, str);
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(final Preference preference, final String str) {
        Runnable runnable = new Runnable() { // from class: androidx.preference.PreferenceFragment.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView.Adapter adapter = PreferenceFragment.this.mList.getAdapter();
                if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
                    if (adapter != 0) {
                        throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                    }
                    return;
                }
                Preference preference2 = preference;
                int preferenceAdapterPosition = preference2 != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference2) : ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(str);
                if (preferenceAdapterPosition != -1) {
                    PreferenceFragment.this.mList.scrollToPosition(preferenceAdapterPosition);
                } else {
                    adapter.registerAdapterDataObserver(new ScrollToPreferenceObserver(adapter, PreferenceFragment.this.mList, preference, str));
                }
            }
        };
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = runnable;
        } else {
            runnable.run();
        }
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @Deprecated
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    @Deprecated
    public final RecyclerView getListView() {
        return this.mList;
    }

    @Deprecated
    public PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @Deprecated
    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.getPreferenceScreen();
    }

    @NonNull
    @Deprecated
    public RecyclerView.Adapter onCreateAdapter(@NonNull PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    @NonNull
    @Deprecated
    public RecyclerView.LayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    @NonNull
    @Deprecated
    public RecyclerView onCreateRecyclerView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C3729R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C3729R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @Override // android.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context context = this.mStyledContext;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C3729R.styleable.PreferenceFragment, TypedArrayUtils.getAttr(context, C3729R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(C3729R.styleable.PreferenceFragment_android_layout, this.mLayoutResId);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C3729R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3729R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(C3729R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.setAllowDividerAfterLastItem(z11);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Deprecated
    public void scrollToPreference(@NonNull Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    @Deprecated
    public void setDivider(@Nullable Drawable drawable) {
        this.mDividerDecoration.setDivider(drawable);
    }

    @Deprecated
    public void setDividerHeight(int i11) {
        this.mDividerDecoration.setDividerHeight(i11);
    }

    @Deprecated
    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    private void unbindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    @Deprecated
    public void addPreferencesFromResource(@XmlRes int i11) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.inflateFromResource(this.mStyledContext, i11, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        String string;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C3729R.attr.preferenceTheme, typedValue, true);
        int i11 = typedValue.resourceId;
        if (i11 == 0) {
            i11 = C3729R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i11);
        this.mStyledContext = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.mPreferenceManager = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        if (getArguments() != null) {
            string = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            string = null;
        }
        onCreatePreferences(bundle, string);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    @Deprecated
    public void onDisplayPreferenceDialog(@NonNull Preference preference) {
        boolean zOnPreferenceDisplayDialog;
        DialogFragment dialogFragmentNewInstance;
        if (getCallbackFragment() instanceof OnPreferenceDisplayDialogCallback) {
            zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference);
        } else {
            zOnPreferenceDisplayDialog = false;
        }
        if (!zOnPreferenceDisplayDialog && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (zOnPreferenceDisplayDialog || getFragmentManager().findFragmentByTag(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            dialogFragmentNewInstance = EditTextPreferenceDialogFragment.newInstance(preference.getKey());
        } else if (preference instanceof ListPreference) {
            dialogFragmentNewInstance = ListPreferenceDialogFragment.newInstance(preference.getKey());
        } else if (preference instanceof MultiSelectListPreference) {
            dialogFragmentNewInstance = MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey());
        } else {
            throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
        }
        dialogFragmentNewInstance.setTargetFragment(this, 0);
        dialogFragmentNewInstance.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    @Deprecated
    public void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen) {
        boolean zOnPreferenceStartScreen;
        if (getCallbackFragment() instanceof OnPreferenceStartScreenCallback) {
            zOnPreferenceStartScreen = ((OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen);
        } else {
            zOnPreferenceStartScreen = false;
        }
        if (!zOnPreferenceStartScreen && (getActivity() instanceof OnPreferenceStartScreenCallback)) {
            ((OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    @Deprecated
    public boolean onPreferenceTreeClick(@NonNull Preference preference) {
        boolean zOnPreferenceStartFragment = false;
        if (preference.getFragment() != null) {
            if (getCallbackFragment() instanceof OnPreferenceStartFragmentCallback) {
                zOnPreferenceStartFragment = ((OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference);
            }
            if (!zOnPreferenceStartFragment && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
                return ((OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
            }
        }
        return zOnPreferenceStartFragment;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(this);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(null);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    @Deprecated
    public void setPreferencesFromResource(@XmlRes int i11, @Nullable String str) {
        Preference preferenceFindPreference;
        requirePreferenceManager();
        PreferenceScreen preferenceScreenInflateFromResource = this.mPreferenceManager.inflateFromResource(this.mStyledContext, i11, null);
        Preference preference = preferenceScreenInflateFromResource;
        if (str != null) {
            preferenceFindPreference = preferenceScreenInflateFromResource.findPreference(str);
            if (!(preferenceFindPreference instanceof PreferenceScreen)) {
                preference = preferenceFindPreference;
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preference = preferenceFindPreference;
        setPreferenceScreen((PreferenceScreen) preference);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onBindPreferences() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onUnbindPreferences() {
    }
}
