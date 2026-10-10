package com.tencent.rmonitor.common.util;

import android.content.SharedPreferences;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AsyncSPEditor;", "", "editor", "Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences$Editor;)V", "apply", "", "commit", "", "putBoolean", "key", "", "value", "putFloat", "", "putInt", "", "putLong", "", "putString", "CommitRunnable", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AsyncSPEditor {

    @NotNull
    private static final String TAG = "RMonitor_common_AsyncSPEditor";

    @Nullable
    private final SharedPreferences.Editor editor;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AsyncSPEditor$CommitRunnable;", "Ljava/lang/Runnable;", "edit", "Landroid/content/SharedPreferences$Editor;", "(Lcom/tencent/rmonitor/common/util/AsyncSPEditor;Landroid/content/SharedPreferences$Editor;)V", "run", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class CommitRunnable implements Runnable {

        @NotNull
        private final SharedPreferences.Editor edit;
        final /* synthetic */ AsyncSPEditor this$0;

        public CommitRunnable(@NotNull AsyncSPEditor asyncSPEditor, SharedPreferences.Editor edit) {
            Intrinsics.checkNotNullParameter(edit, "edit");
            this.this$0 = asyncSPEditor;
            this.edit = edit;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.edit.commit();
            } catch (Exception e11) {
                Logger.INSTANCE.exception(AsyncSPEditor.TAG, e11);
            }
        }
    }

    public final boolean commit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor == null) {
            return true;
        }
        ThreadManager.Companion.runInMonitorThread$default(ThreadManager.INSTANCE, new CommitRunnable(this, editor), 0L, 2, null);
        return true;
    }

    @NotNull
    public final AsyncSPEditor putBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putBoolean(key, value);
        }
        return this;
    }

    @NotNull
    public final AsyncSPEditor putFloat(@NotNull String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putFloat(key, value);
        }
        return this;
    }

    @NotNull
    public final AsyncSPEditor putInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putInt(key, value);
        }
        return this;
    }

    @NotNull
    public final AsyncSPEditor putLong(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putLong(key, value);
        }
        return this;
    }

    @NotNull
    public final AsyncSPEditor putString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putString(key, value);
        }
        return this;
    }

    public AsyncSPEditor(@Nullable SharedPreferences.Editor editor) {
        this.editor = editor;
    }

    public final void apply() {
        commit();
    }
}
