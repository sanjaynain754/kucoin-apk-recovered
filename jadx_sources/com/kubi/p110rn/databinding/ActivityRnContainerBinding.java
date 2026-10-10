package com.kubi.p110rn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kubi.p110rn.C23207R;

/* JADX INFO: loaded from: classes39.dex */
public final class ActivityRnContainerBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flContainer;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public static ActivityRnContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRnContainerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ActivityRnContainerBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ActivityRnContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(C23207R.layout.activity_rn_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    private ActivityRnContainerBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.flContainer = frameLayout2;
    }
}
