package com.facebook.react.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BridgelessReactStateTracker.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/react/runtime/BridgelessReactStateTracker;", "", "shouldTrackStates", "", "<init>", "(Z)V", "states", "", "", "kotlin.jvm.PlatformType", "", "Ljava/util/List;", "enterState", "", "state", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BridgelessReactStateTracker {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "BridgelessReact";
    private final boolean shouldTrackStates;
    private final List<String> states = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: BridgelessReactStateTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/runtime/BridgelessReactStateTracker$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BridgelessReactStateTracker(boolean z11) {
        this.shouldTrackStates = z11;
    }

    public final void enterState(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C45999a.m101488I(TAG, state);
        if (this.shouldTrackStates) {
            this.states.add(state);
        }
    }
}
