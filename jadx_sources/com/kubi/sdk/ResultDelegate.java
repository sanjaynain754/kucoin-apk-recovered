package com.kubi.sdk;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.kubi.utils.extensions.MutablePair;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.c3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ResultDelegate.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007J&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007R$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/ResultDelegate;", "", "<init>", "()V", "thisResultCallBack", "Lcom/kubi/utils/extensions/MutablePair;", "", "Lio/reactivex/functions/Consumer;", "Landroid/content/Intent;", "onActivityResult", "", "fragment", "Landroidx/fragment/app/Fragment;", "requestCode", "resultCode", "data", "activity", "Landroid/app/Activity;", "startActivityWithResult", "intent", "callBack", "DispatcherPage", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ResultDelegate {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MutablePair<Integer, Consumer<Intent>> f46523a = new MutablePair<>(100, null);

    /* JADX INFO: renamed from: com.kubi.sdk.c3$a */
    /* JADX INFO: compiled from: ResultDelegate.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/ResultDelegate$DispatcherPage;", "", "preformBackPressed", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        void preformBackPressed();
    }

    /* JADX INFO: renamed from: a */
    public final void m56597a(@NotNull Activity activity, int i11, int i12, @Nullable Intent intent) throws Exception {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f46523a.getFirst().intValue() == i11 && i12 == -1 && !activity.isFinishing()) {
            Consumer<Intent> second = this.f46523a.getSecond();
            if (second != null) {
                second.accept(intent);
            }
            this.f46523a.setSecond(null);
        }
        C23700d3.m56610a(activity);
    }

    /* JADX INFO: renamed from: b */
    public final void m56598b(@NotNull Fragment fragment, int i11, int i12, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.f46523a.getFirst().intValue() == i11 && i12 == -1 && fragment.isAdded() && fragment.getContext() != null) {
            Consumer<Intent> second = this.f46523a.getSecond();
            if (second != null) {
                second.accept(intent);
            }
            this.f46523a.setSecond(null);
        }
        C23700d3.m56610a(fragment);
    }

    /* JADX INFO: renamed from: c */
    public final void m56599c(@NotNull Activity activity, @NotNull Intent intent, @NotNull Consumer<Intent> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        MutablePair<Integer, Consumer<Intent>> mutablePair = this.f46523a;
        mutablePair.setFirst(Integer.valueOf(mutablePair.getFirst().intValue() + 1));
        mutablePair.setFirst(mutablePair.getFirst());
        this.f46523a.setSecond(callBack);
        activity.startActivityForResult(intent, this.f46523a.getFirst().intValue());
    }

    /* JADX INFO: renamed from: d */
    public final void m56600d(@NotNull Fragment fragment, @NotNull Intent intent, @NotNull Consumer<Intent> callBack) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        MutablePair<Integer, Consumer<Intent>> mutablePair = this.f46523a;
        mutablePair.setFirst(Integer.valueOf(mutablePair.getFirst().intValue() + 1));
        mutablePair.setFirst(mutablePair.getFirst());
        this.f46523a.setSecond(callBack);
        fragment.startActivityForResult(intent, this.f46523a.getFirst().intValue());
    }
}
