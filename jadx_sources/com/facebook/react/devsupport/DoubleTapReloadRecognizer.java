package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DoubleTapReloadRecognizer.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "", "<init>", "()V", "doRefresh", "", "didDoubleTapR", "keyCode", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DoubleTapReloadRecognizer {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long DOUBLE_TAP_DELAY = 200;
    private boolean doRefresh;

    /* JADX INFO: compiled from: DoubleTapReloadRecognizer.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer$Companion;", "", "<init>", "()V", "DOUBLE_TAP_DELAY", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean didDoubleTapR(int keyCode, @Nullable View view) {
        if (keyCode == 46 && !(view instanceof EditText)) {
            if (this.doRefresh) {
                this.doRefresh = false;
                return true;
            }
            this.doRefresh = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9720b.doRefresh = false;
                }
            }, 200L);
        }
        return false;
    }
}
