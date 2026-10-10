package com.kubi.lite.tab.util;

import android.util.Log;
import com.kubi.lite.tab.ui.LiteMainActivity;
import com.kubi.lite.tab.ui.LiteTabLayout;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LanguageChangeUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/lite/tab/util/LanguageChangeUtil;", "", "<init>", "()V", "TAG", "", "mLiteMainActivity", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/lite/tab/ui/LiteMainActivity;", "init", "", "liteMainActivity", "onLanguageChange", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LanguageChangeUtil {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f32162c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final LanguageChangeUtil f32163d = new LanguageChangeUtil();

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f32164a = "LiteV2-LanguageChangeUtil";

    /* JADX INFO: renamed from: b */
    @Nullable
    public WeakReference<LiteMainActivity> f32165b;

    /* JADX INFO: compiled from: LanguageChangeUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/lite/tab/util/LanguageChangeUtil$Companion;", "", "<init>", "()V", "mInstance", "Lcom/kubi/lite/tab/util/LanguageChangeUtil;", "getInstance", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LanguageChangeUtil getInstance() {
            return LanguageChangeUtil.f32163d;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m37635b(@NotNull LiteMainActivity liteMainActivity) {
        Intrinsics.checkNotNullParameter(liteMainActivity, "liteMainActivity");
        this.f32165b = new WeakReference<>(liteMainActivity);
    }

    /* JADX INFO: renamed from: c */
    public final void m37636c() {
        LiteMainActivity liteMainActivity;
        LiteTabLayout liteTabLayoutM37593d0;
        Log.i(this.f32164a, "onLanguageChange");
        WeakReference<LiteMainActivity> weakReference = this.f32165b;
        if (weakReference == null || (liteMainActivity = weakReference.get()) == null || (liteTabLayoutM37593d0 = liteMainActivity.m37593d0()) == null) {
            return;
        }
        liteTabLayoutM37593d0.m37622B();
    }
}
