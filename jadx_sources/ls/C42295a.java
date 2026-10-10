package ls;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476ns.RunnableC42867e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: ls.a */
/* JADX INFO: compiled from: ToastTouchEventHandler.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\r\u001a\u00020\u000e*\u00020\fH\u0002J\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J$\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/notice/lib/ui/ToastTouchEventHandler;", "Lcom/kubi/notice/lib/ui/xtoast/XToast$OnTouchListener;", "Landroid/view/View;", "<init>", "()V", "flipDistance", "", "x1", "x2", "y1", "y2", "logTag", "", "log", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "setCallback", "(Lkotlin/jvm/functions/Function0;)V", "reset", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouch", "", "toast", "Lcom/kubi/notice/lib/ui/xtoast/XToast;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42295a implements RunnableC42867e.c<View> {

    /* JADX INFO: renamed from: b */
    public float f93784b;

    /* JADX INFO: renamed from: c */
    public float f93785c;

    /* JADX INFO: renamed from: d */
    public float f93786d;

    /* JADX INFO: renamed from: e */
    public float f93787e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function0<Unit> f93789g;

    /* JADX INFO: renamed from: a */
    public final float f93783a = 50.0f;

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f93788f = "ToastTouchEventHandler";

    /* JADX INFO: renamed from: d */
    public final void m92832d() {
        this.f93784b = 0.0f;
        this.f93785c = 0.0f;
        this.f93786d = 0.0f;
        this.f93787e = 0.0f;
    }

    @Override // p476ns.RunnableC42867e.c
    /* JADX INFO: renamed from: a */
    public boolean mo92829a(@Nullable RunnableC42867e runnableC42867e, @Nullable View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m92831c(event);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m92830b(String str) {
        C44128b.m97259c(this.f93788f, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m92831c(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            m92830b("onTouchEvent: ---ACTION_DOWN");
            this.f93784b = event.getX();
            this.f93786d = event.getY();
            return;
        }
        if (action == 1) {
            m92830b("onTouchEvent: -----ACTION_UP");
            m92832d();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            m92830b("onTouchEvent: -----ACTION_CANCEL");
            m92832d();
            return;
        }
        m92830b("onTouchEvent:------ACTION_MOVE ");
        this.f93785c = event.getX();
        float y11 = event.getY();
        this.f93787e = y11;
        float f11 = this.f93786d;
        m92830b("滑动距离:" + y11);
        Unit unit = Unit.INSTANCE;
        if (f11 - y11 > this.f93783a) {
            Function0<Unit> function0 = this.f93789g;
            if (function0 != null) {
                function0.invoke();
            }
            m92830b("向上滑");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m92833e(@Nullable Function0<Unit> function0) {
        this.f93789g = function0;
    }
}
