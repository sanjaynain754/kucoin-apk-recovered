package com.kubi.resources;

import android.os.Handler;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DoubleClickListener.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/DoubleClickListener;", "Landroid/view/View$OnClickListener;", "myClickCallBack", "Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;", "<init>", "(Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;)V", "clickCount", "", "handler", "Landroid/os/Handler;", "onClick", "", "v", "Landroid/view/View;", "DoubleClickCallBack", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DoubleClickListener implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final a f43648b;

    /* JADX INFO: renamed from: c */
    public int f43649c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Handler f43650d;

    /* JADX INFO: renamed from: com.kubi.resources.j$a */
    /* JADX INFO: compiled from: DoubleClickListener.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;", "", "singleClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "doubleClick", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo30247a(@Nullable View view);

        /* JADX INFO: renamed from: b */
        void mo30248b(@Nullable View view);
    }

    public DoubleClickListener(@NotNull a myClickCallBack) {
        Intrinsics.checkNotNullParameter(myClickCallBack, "myClickCallBack");
        this.f43648b = myClickCallBack;
        this.f43650d = new Handler();
    }

    /* JADX INFO: renamed from: b */
    public static final void m54335b(DoubleClickListener doubleClickListener, View view) {
        int i11 = doubleClickListener.f43649c;
        if (i11 == 1) {
            doubleClickListener.f43648b.mo30247a(view);
        } else if (i11 == 2) {
            doubleClickListener.f43648b.mo30248b(view);
        }
        doubleClickListener.f43650d.removeCallbacksAndMessages(null);
        doubleClickListener.f43649c = 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable final View v11) {
        this.f43649c++;
        this.f43650d.postDelayed(new Runnable() { // from class: com.kubi.resources.i
            @Override // java.lang.Runnable
            public final void run() {
                DoubleClickListener.m54335b(this.f43646b, v11);
            }
        }, 200L);
    }
}
