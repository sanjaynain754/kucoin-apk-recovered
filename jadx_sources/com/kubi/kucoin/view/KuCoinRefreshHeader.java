package com.kubi.kucoin.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.kubi.C11352b;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;
import lb0.InterpolatorC42155b;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"RestrictedApi"})
public class KuCoinRefreshHeader extends LinearLayout implements InterfaceC38160d {

    /* JADX INFO: renamed from: b */
    public ImageView f28643b;

    public KuCoinRefreshHeader(Context context) {
        super(context);
        m33229b(context);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b */
    public final void m33229b(Context context) {
        setOrientation(1);
        setGravity(17);
        addView(new View(context), 0, InterpolatorC42155b.m92540c(10.0f));
        ImageView imageView = new ImageView(context);
        this.f28643b = imageView;
        addView(imageView, InterpolatorC42155b.m92540c(32.0f), InterpolatorC42155b.m92540c(32.0f));
        addView(new View(context), 0, InterpolatorC42155b.m92540c(20.0f));
        setMinimumHeight(InterpolatorC42155b.m92540c(62.0f));
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.view.KuCoinRefreshHeader$a */
    public static /* synthetic */ class C15759a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28644a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f28644a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28644a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28644a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28644a[RefreshState.ReleaseToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28644a[RefreshState.LoadFinish.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28644a[RefreshState.RefreshFinish.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // hb0.InterfaceC38157a
    public C38510b getSpinnerStyle() {
        return C38510b.f86469d;
    }

    @Override // hb0.InterfaceC38157a
    public int onFinish(@NonNull InterfaceC38162f interfaceC38162f, boolean z11) {
        return 500;
    }

    @Override // hb0.InterfaceC38157a
    public void onStartAnimator(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12) {
        C11352b.m20197a(this.f28643b);
    }

    @Override // jb0.InterfaceC40375i
    public void onStateChanged(@NonNull InterfaceC38162f interfaceC38162f, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        int i11 = C15759a.f28644a[refreshState2.ordinal()];
        if (i11 == 2) {
            this.f28643b.setVisibility(0);
        } else if (i11 == 5 || i11 == 6) {
            this.f28643b.setVisibility(8);
        }
    }

    public KuCoinRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33229b(context);
    }

    public void setCustomBg(Drawable drawable) {
        setBackground(drawable);
    }

    public KuCoinRefreshHeader(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m33229b(context);
    }

    @Override // hb0.InterfaceC38157a
    public void onMoving(boolean z11, float f11, int i11, int i12, int i13) {
    }

    @Override // hb0.InterfaceC38157a
    public void onHorizontalDrag(float f11, int i11, int i12) {
    }

    @Override // hb0.InterfaceC38157a
    public void onInitialized(@NonNull InterfaceC38161e interfaceC38161e, int i11, int i12) {
    }

    @Override // hb0.InterfaceC38157a
    public void onReleased(@NonNull InterfaceC38162f interfaceC38162f, int i11, int i12) {
    }

    @Override // hb0.InterfaceC38157a
    @NonNull
    public View getView() {
        return this;
    }

    @Override // hb0.InterfaceC38157a
    public void setPrimaryColors(@ColorInt int... iArr) {
    }
}
