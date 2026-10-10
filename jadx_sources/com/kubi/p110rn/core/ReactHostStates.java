package com.kubi.p110rn.core;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactHostStates.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/core/ReactHostStates;", "Lcom/kubi/rn/core/IReactHostState;", "", "<init>", "(Ljava/lang/String;I)V", "Init", "Final", "Failed", "Prepare", "Loading", "LoadingSplit", "Loaded", "Running", "Problem", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ReactHostStates implements IReactHostState {
    Init { // from class: com.kubi.rn.core.ReactHostStates.Init
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Prepare || next == ReactHostStates.Loading;
        }

        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Failed;
        }
    },
    Final,
    Failed { // from class: com.kubi.rn.core.ReactHostStates.Failed
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Prepare;
        }
    },
    Prepare { // from class: com.kubi.rn.core.ReactHostStates.Prepare
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Loading;
        }

        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Failed;
        }
    },
    Loading { // from class: com.kubi.rn.core.ReactHostStates.Loading
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Loaded || next == ReactHostStates.LoadingSplit;
        }

        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Failed;
        }
    },
    LoadingSplit { // from class: com.kubi.rn.core.ReactHostStates.LoadingSplit
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Loaded;
        }

        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Failed;
        }
    },
    Loaded { // from class: com.kubi.rn.core.ReactHostStates.Loaded
        @Override // com.kubi.p110rn.core.IReactHostState
        public boolean canChangeTo(@NotNull IReactHostState next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return next == ReactHostStates.Running;
        }

        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Failed;
        }
    },
    Running { // from class: com.kubi.rn.core.ReactHostStates.Running
        @Override // com.kubi.p110rn.core.IReactHostState
        @NotNull
        public ReactHostStates failed() {
            return ReactHostStates.Problem;
        }
    },
    Problem;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* synthetic */ ReactHostStates(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static EnumEntries<ReactHostStates> getEntries() {
        return $ENTRIES;
    }
}
