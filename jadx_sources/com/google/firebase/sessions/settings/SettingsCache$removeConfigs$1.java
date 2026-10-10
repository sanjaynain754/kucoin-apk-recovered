package com.google.firebase.sessions.settings;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.google.firebase.sessions.settings.SettingsCache", m90122f = "SettingsCache.kt", m90123i = {}, m90124l = {103}, m90125m = "removeConfigs$com_google_firebase_firebase_sessions", m90126n = {}, m90127s = {})
public final class SettingsCache$removeConfigs$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$1(SettingsCache settingsCache, Continuation<? super SettingsCache$removeConfigs$1> continuation) {
        super(continuation);
        this.this$0 = settingsCache;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
